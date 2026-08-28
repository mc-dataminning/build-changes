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

public class dlo {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final btd<dlo.c> a = btd.a();
   public static final dlo b = new dlo.a().a();
   public static final MapCodec<dlo> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bxz.i, btd.a(dlo.c.a).promotePartial(ag.a("Spawn data: ", d::error)), bao.a(bxz.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(mh.f.q(), dlo.b.a, mh.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dlo::new)
   );
   private final float f;
   private final Map<bxz, btd<dlo.c>> g;
   private final Map<bxe<?>, dlo.b> h;

   dlo(float $$0, Map<bxz, btd<dlo.c>> $$1, Map<bxe<?>, dlo.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public btd<dlo.c> a(bxz $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dlo.b a(bxe<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bxz, btd.a<dlo.c>> a = ag.a(bxz.class, $$0 -> btd.b());
      private final Map<bxe<?>, dlo.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dlo.a a(bxz $$0, int $$1, dlo.c $$2) {
         this.a.get($$0).a($$2, $$1);
         return this;
      }

      public dlo.a a(bxe<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dlo.b($$2, $$1));
         return this;
      }

      public dlo.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dlo a() {
         return new dlo(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((btd.a)$$0.getValue()).a())),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dlo.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dlo.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static record c(bxe<?> b, int c, int d) {
      public static final MapCodec<dlo.c> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     mh.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     ayy.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayy.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dlo.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));

      public c(bxe<?> b, int c, int d) {
         b = b.f() == bxz.h ? bxe.aR : b;
         this.b = b;
         this.c = c;
         this.d = d;
      }

      @Override
      public String toString() {
         return bxe.a(this.b) + "*(" + this.c + "-" + this.d + ")";
      }

      public bxe<?> a() {
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
