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

public class ddr {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bou<ddr.c> a = bou.c();
   public static final ddr b = new ddr.a().a();
   public static final MapCodec<ddr> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bte.i, bou.c(ddr.c.a).promotePartial(ac.a("Spawn data: ", d::error)), azc.a(bte.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(lq.f.r(), ddr.b.a, lq.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ddr::new)
   );
   private final float f;
   private final Map<bte, bou<ddr.c>> g;
   private final Map<bsm<?>, ddr.b> h;

   ddr(float $$0, Map<bte, bou<ddr.c>> $$1, Map<bsm<?>, ddr.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bou<ddr.c> a(bte $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public ddr.b a(bsm<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bte, List<ddr.c>> a = Stream.of(bte.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bsm<?>, ddr.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public ddr.a a(bte $$0, ddr.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public ddr.a a(bsm<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new ddr.b($$2, $$1));
         return this;
      }

      public ddr.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public ddr a() {
         return new ddr(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bou.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<ddr.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, ddr.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bos.a {
      public static final Codec<ddr.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     lq.f.r().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bor.a.fieldOf("weight").forGetter(bos.a::a),
                     axo.l.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     axo.l.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, ddr.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bsm<?> b;
      public final int c;
      public final int d;

      public c(bsm<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bor.a($$1), $$2, $$3);
      }

      public c(bsm<?> $$0, bor $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bte.h ? bsm.az : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bsm.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
