import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dkk {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bsm<dkk.c> a = bsm.a();
   public static final dkk b = new dkk.a().a();
   public static final MapCodec<dkk> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bxf.i, bsm.a(dkk.c.a).promotePartial(af.a("Spawn data: ", d::error)), bak.a(bxf.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(mf.f.q(), dkk.b.a, mf.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dkk::new)
   );
   private final float f;
   private final Map<bxf, bsm<dkk.c>> g;
   private final Map<bwm<?>, dkk.b> h;

   dkk(float $$0, Map<bxf, bsm<dkk.c>> $$1, Map<bwm<?>, dkk.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bsm<dkk.c> a(bxf $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dkk.b a(bwm<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bxf, bsm.a<dkk.c>> a = af.a(bxf.class, $$0 -> bsm.b());
      private final Map<bwm<?>, dkk.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dkk.a a(bxf $$0, int $$1, dkk.c $$2) {
         this.a.get($$0).a($$2, $$1);
         return this;
      }

      public dkk.a a(bwm<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dkk.b($$2, $$1));
         return this;
      }

      public dkk.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dkk a() {
         return new dkk(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((bsm.a)$$0.getValue()).a())),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dkk.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dkk.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static record c(bwm<?> b, int c, int d) {
      public static final MapCodec<dkk.c> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     mf.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     ayu.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayu.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dkk.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));

      public c(bwm<?> b, int c, int d) {
         b = b.f() == bxf.h ? bwm.aQ : b;
         this.b = b;
         this.c = c;
         this.d = d;
      }

      @Override
      public String toString() {
         return bwm.a(this.b) + "*(" + this.c + "-" + this.d + ")";
      }

      public bwm<?> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
