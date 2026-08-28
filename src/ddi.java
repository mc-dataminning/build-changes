import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ddi {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bph<ddi.c> a = bph.c();
   public static final ddi b = new ddi.a().a();
   public static final MapCodec<ddi> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(btr.i, bph.c(ddi.c.a).promotePartial(ac.a("Spawn data: ", d::error)), azt.a(btr.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(lp.g.q(), ddi.b.a, lp.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ddi::new)
   );
   private final float f;
   private final Map<btr, bph<ddi.c>> g;
   private final Map<bsz<?>, ddi.b> h;

   ddi(float $$0, Map<btr, bph<ddi.c>> $$1, Map<bsz<?>, ddi.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bph<ddi.c> a(btr $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public ddi.b a(bsz<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<btr, List<ddi.c>> a = Stream.of(btr.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bsz<?>, ddi.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public ddi.a a(btr $$0, ddi.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public ddi.a a(bsz<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new ddi.b($$2, $$1));
         return this;
      }

      public ddi.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public ddi a() {
         return new ddi(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bph.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<ddi.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, ddi.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bpf.a {
      public static final Codec<ddi.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     lp.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bpe.a.fieldOf("weight").forGetter(bpf.a::a),
                     ayg.l.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayg.l.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, ddi.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bsz<?> b;
      public final int c;
      public final int d;

      public c(bsz<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bpe.a($$1), $$2, $$3);
      }

      public c(bsz<?> $$0, bpe $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == btr.h ? bsz.az : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bsz.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
