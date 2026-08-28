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

public class dke {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bsj<dke.c> a = bsj.a();
   public static final dke b = new dke.a().a();
   public static final MapCodec<dke> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bxc.i, bsj.a(dke.c.a).promotePartial(af.a("Spawn data: ", d::error)), bai.a(bxc.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(mf.f.q(), dke.b.a, mf.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dke::new)
   );
   private final float f;
   private final Map<bxc, bsj<dke.c>> g;
   private final Map<bwj<?>, dke.b> h;

   dke(float $$0, Map<bxc, bsj<dke.c>> $$1, Map<bwj<?>, dke.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bsj<dke.c> a(bxc $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dke.b a(bwj<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bxc, bsj.a<dke.c>> a = af.a(bxc.class, $$0 -> bsj.b());
      private final Map<bwj<?>, dke.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dke.a a(bxc $$0, int $$1, dke.c $$2) {
         this.a.get($$0).a($$2, $$1);
         return this;
      }

      public dke.a a(bwj<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dke.b($$2, $$1));
         return this;
      }

      public dke.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dke a() {
         return new dke(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((bsj.a)$$0.getValue()).a())),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dke.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dke.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static record c(bwj<?> b, int c, int d) {
      public static final MapCodec<dke.c> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     mf.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     ays.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ays.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dke.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));

      public c(bwj<?> b, int c, int d) {
         b = b.f() == bxc.h ? bwj.aQ : b;
         this.b = b;
         this.c = c;
         this.d = d;
      }

      @Override
      public String toString() {
         return bwj.a(this.b) + "*(" + this.c + "-" + this.d + ")";
      }

      public bwj<?> a() {
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
