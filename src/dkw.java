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

public class dkw {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bsq<dkw.c> a = bsq.a();
   public static final dkw b = new dkw.a().a();
   public static final MapCodec<dkw> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bxm.i, bsq.a(dkw.c.a).promotePartial(ag.a("Spawn data: ", d::error)), bak.a(bxm.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(mg.f.q(), dkw.b.a, mg.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dkw::new)
   );
   private final float f;
   private final Map<bxm, bsq<dkw.c>> g;
   private final Map<bwr<?>, dkw.b> h;

   dkw(float $$0, Map<bxm, bsq<dkw.c>> $$1, Map<bwr<?>, dkw.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bsq<dkw.c> a(bxm $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dkw.b a(bwr<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bxm, bsq.a<dkw.c>> a = ag.a(bxm.class, $$0 -> bsq.b());
      private final Map<bwr<?>, dkw.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dkw.a a(bxm $$0, int $$1, dkw.c $$2) {
         this.a.get($$0).a($$2, $$1);
         return this;
      }

      public dkw.a a(bwr<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dkw.b($$2, $$1));
         return this;
      }

      public dkw.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dkw a() {
         return new dkw(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((bsq.a)$$0.getValue()).a())),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dkw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dkw.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static record c(bwr<?> b, int c, int d) {
      public static final MapCodec<dkw.c> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     mg.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     ayu.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayu.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dkw.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));

      public c(bwr<?> b, int c, int d) {
         b = b.f() == bxm.h ? bwr.aQ : b;
         this.b = b;
         this.c = c;
         this.d = d;
      }

      @Override
      public String toString() {
         return bwr.a(this.b) + "*(" + this.c + "-" + this.d + ")";
      }

      public bwr<?> a() {
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
