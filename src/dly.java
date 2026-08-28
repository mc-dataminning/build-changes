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

public class dly {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final btm<dly.c> a = btm.a();
   public static final dly b = new dly.a().a();
   public static final MapCodec<dly> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(byi.i, btm.a(dly.c.a).promotePartial(ag.a("Spawn data: ", d::error)), bax.a(byi.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(mh.f.q(), dly.b.a, mh.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dly::new)
   );
   private final float f;
   private final Map<byi, btm<dly.c>> g;
   private final Map<bxn<?>, dly.b> h;

   dly(float $$0, Map<byi, btm<dly.c>> $$1, Map<bxn<?>, dly.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public btm<dly.c> a(byi $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dly.b a(bxn<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<byi, btm.a<dly.c>> a = ag.a(byi.class, $$0 -> btm.b());
      private final Map<bxn<?>, dly.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dly.a a(byi $$0, int $$1, dly.c $$2) {
         this.a.get($$0).a($$2, $$1);
         return this;
      }

      public dly.a a(bxn<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dly.b($$2, $$1));
         return this;
      }

      public dly.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dly a() {
         return new dly(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((btm.a)$$0.getValue()).a())),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dly.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dly.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static record c(bxn<?> b, int c, int d) {
      public static final MapCodec<dly.c> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     mh.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     azg.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     azg.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dly.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));

      public c(bxn<?> b, int c, int d) {
         b = b.f() == byi.h ? bxn.aR : b;
         this.b = b;
         this.c = c;
         this.d = d;
      }

      @Override
      public String toString() {
         return bxn.a(this.b) + "*(" + this.c + "-" + this.d + ")";
      }

      public bxn<?> a() {
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
