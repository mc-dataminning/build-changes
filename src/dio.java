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

public class dio {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final brj<dio.c> a = brj.a();
   public static final dio b = new dio.a().a();
   public static final MapCodec<dio> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bwb.i, brj.a(dio.c.a).promotePartial(af.a("Spawn data: ", d::error)), azv.a(bwb.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(mb.f.q(), dio.b.a, mb.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dio::new)
   );
   private final float f;
   private final Map<bwb, brj<dio.c>> g;
   private final Map<bvi<?>, dio.b> h;

   dio(float $$0, Map<bwb, brj<dio.c>> $$1, Map<bvi<?>, dio.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public brj<dio.c> a(bwb $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dio.b a(bvi<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bwb, brj.a<dio.c>> a = af.a(bwb.class, $$0 -> brj.b());
      private final Map<bvi<?>, dio.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dio.a a(bwb $$0, int $$1, dio.c $$2) {
         this.a.get($$0).a($$2, $$1);
         return this;
      }

      public dio.a a(bvi<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dio.b($$2, $$1));
         return this;
      }

      public dio.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dio a() {
         return new dio(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((brj.a)$$0.getValue()).a())),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dio.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dio.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static record c(bvi<?> b, int c, int d) {
      public static final MapCodec<dio.c> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     mb.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     ayi.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayi.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dio.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));

      public c(bvi<?> b, int c, int d) {
         b = b.f() == bwb.h ? bvi.aQ : b;
         this.b = b;
         this.c = c;
         this.d = d;
      }

      @Override
      public String toString() {
         return bvi.a(this.b) + "*(" + this.c + "-" + this.d + ")";
      }

      public bvi<?> a() {
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
