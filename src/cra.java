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

public class cra {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bfh<cra.c> a = bfh.c();
   public static final cra b = new cra.a().a();
   public static final MapCodec<cra> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bje.i, bfh.c(cra.c.a).promotePartial(ac.a("Spawn data: ", d::error)), ask.a(bje.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(jd.h.q(), cra.b.a, jd.h).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cra::new)
   );
   private final float f;
   private final Map<bje, bfh<cra.c>> g;
   private final Map<bip<?>, cra.b> h;

   cra(float $$0, Map<bje, bfh<cra.c>> $$1, Map<bip<?>, cra.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bfh<cra.c> a(bje $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public cra.b a(bip<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bje, List<cra.c>> a = Stream.of(bje.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bip<?>, cra.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public cra.a a(bje $$0, cra.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public cra.a a(bip<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new cra.b($$2, $$1));
         return this;
      }

      public cra.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public cra a() {
         return new cra(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bfh.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<cra.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, cra.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bff.a {
      public static final Codec<cra.c> a = arb.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     jd.h.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bfe.a.fieldOf("weight").forGetter(bff.a::a),
                     arb.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     arb.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, cra.c::new)
         ),
         (Function<cra.c, DataResult<cra.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bip<?> b;
      public final int c;
      public final int d;

      public c(bip<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bfe.a($$1), $$2, $$3);
      }

      public c(bip<?> $$0, bfe $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bje.h ? bip.av : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bip.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
