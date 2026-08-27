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
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ctc {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bhe<ctc.c> a = bhe.c();
   public static final ctc b = new ctc.a().a();
   public static final MapCodec<ctc> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(blb.i, bhe.c(ctc.c.a).promotePartial(ac.a("Spawn data: ", d::error)), aub.a(blb.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(jy.h.q(), ctc.b.a, jy.h).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ctc::new)
   );
   private final float f;
   private final Map<blb, bhe<ctc.c>> g;
   private final Map<bkm<?>, ctc.b> h;

   ctc(float $$0, Map<blb, bhe<ctc.c>> $$1, Map<bkm<?>, ctc.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bhe<ctc.c> a(blb $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public ctc.b a(bkm<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<blb, List<ctc.c>> a = Stream.of(blb.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bkm<?>, ctc.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public ctc.a a(blb $$0, ctc.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public ctc.a a(bkm<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new ctc.b($$2, $$1));
         return this;
      }

      public ctc.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public ctc a() {
         return new ctc(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bhe.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<ctc.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, ctc.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bhc.a {
      public static final Codec<ctc.c> a = asq.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     jy.h.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bhb.a.fieldOf("weight").forGetter(bhc.a::a),
                     asq.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     asq.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, ctc.c::new)
         ),
         (Function<ctc.c, DataResult<ctc.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bkm<?> b;
      public final int c;
      public final int d;

      public c(bkm<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bhb.a($$1), $$2, $$3);
      }

      public c(bkm<?> $$0, bhb $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == blb.h ? bkm.av : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bkm.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
