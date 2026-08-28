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

public class dkp {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bso<dkp.c> a = bso.a();
   public static final dkp b = new dkp.a().a();
   public static final MapCodec<dkp> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bxh.i, bso.a(dkp.c.a).promotePartial(af.a("Spawn data: ", d::error)), bak.a(bxh.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(mf.f.q(), dkp.b.a, mf.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dkp::new)
   );
   private final float f;
   private final Map<bxh, bso<dkp.c>> g;
   private final Map<bwo<?>, dkp.b> h;

   dkp(float $$0, Map<bxh, bso<dkp.c>> $$1, Map<bwo<?>, dkp.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bso<dkp.c> a(bxh $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dkp.b a(bwo<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bxh, bso.a<dkp.c>> a = af.a(bxh.class, $$0 -> bso.b());
      private final Map<bwo<?>, dkp.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dkp.a a(bxh $$0, int $$1, dkp.c $$2) {
         this.a.get($$0).a($$2, $$1);
         return this;
      }

      public dkp.a a(bwo<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dkp.b($$2, $$1));
         return this;
      }

      public dkp.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dkp a() {
         return new dkp(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((bso.a)$$0.getValue()).a())),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dkp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dkp.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static record c(bwo<?> b, int c, int d) {
      public static final MapCodec<dkp.c> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     mf.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     ayu.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayu.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dkp.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));

      public c(bwo<?> b, int c, int d) {
         b = b.f() == bxh.h ? bwo.aQ : b;
         this.b = b;
         this.c = c;
         this.d = d;
      }

      @Override
      public String toString() {
         return bwo.a(this.b) + "*(" + this.c + "-" + this.d + ")";
      }

      public bwo<?> a() {
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
