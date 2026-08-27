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

public class cwy {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bki<cwy.c> a = bki.c();
   public static final cwy b = new cwy.a().a();
   public static final MapCodec<cwy> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(boj.i, bki.c(cwy.c.a).promotePartial(ac.a("Spawn data: ", d::error)), axc.a(boj.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(kf.g.q(), cwy.b.a, kf.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cwy::new)
   );
   private final float f;
   private final Map<boj, bki<cwy.c>> g;
   private final Map<bnu<?>, cwy.b> h;

   cwy(float $$0, Map<boj, bki<cwy.c>> $$1, Map<bnu<?>, cwy.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bki<cwy.c> a(boj $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public cwy.b a(bnu<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<boj, List<cwy.c>> a = Stream.of(boj.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bnu<?>, cwy.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public cwy.a a(boj $$0, cwy.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public cwy.a a(bnu<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new cwy.b($$2, $$1));
         return this;
      }

      public cwy.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public cwy a() {
         return new cwy(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bki.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<cwy.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, cwy.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bkg.a {
      public static final Codec<cwy.c> a = avp.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     kf.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bkf.a.fieldOf("weight").forGetter(bkg.a::a),
                     avp.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     avp.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, cwy.c::new)
         ),
         (Function<cwy.c, DataResult<cwy.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bnu<?> b;
      public final int c;
      public final int d;

      public c(bnu<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bkf.a($$1), $$2, $$3);
      }

      public c(bnu<?> $$0, bkf $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == boj.h ? bnu.ax : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bnu.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
