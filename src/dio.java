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

public class dio {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final brq<dio.c> a = brq.c();
   public static final dio b = new dio.a().a();
   public static final MapCodec<dio> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bwe.i, brq.c(dio.c.a).promotePartial(ae.a("Spawn data: ", d::error)), bba.a(bwe.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(ma.f.q(), dio.b.a, ma.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dio::new)
   );
   private final float f;
   private final Map<bwe, brq<dio.c>> g;
   private final Map<bvm<?>, dio.b> h;

   dio(float $$0, Map<bwe, brq<dio.c>> $$1, Map<bvm<?>, dio.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public brq<dio.c> a(bwe $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dio.b a(bvm<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bwe, List<dio.c>> a = Stream.of(bwe.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bvm<?>, dio.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dio.a a(bwe $$0, dio.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dio.a a(bvm<?> $$0, double $$1, double $$2) {
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
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> brq.a((List)$$0.getValue()))),
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

   public static class c extends bro.a {
      public static final Codec<dio.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ma.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     brn.a.fieldOf("weight").forGetter(bro.a::a),
                     azn.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     azn.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dio.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bvm<?> b;
      public final int c;
      public final int d;

      public c(bvm<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, brn.a($$1), $$2, $$3);
      }

      public c(bvm<?> $$0, brn $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bwe.h ? bvm.aR : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bvm.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
