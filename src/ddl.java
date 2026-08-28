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

public class ddl {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bpk<ddl.c> a = bpk.c();
   public static final ddl b = new ddl.a().a();
   public static final MapCodec<ddl> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(btu.i, bpk.c(ddl.c.a).promotePartial(ac.a("Spawn data: ", d::error)), azu.a(btu.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(lp.g.q(), ddl.b.a, lp.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ddl::new)
   );
   private final float f;
   private final Map<btu, bpk<ddl.c>> g;
   private final Map<btc<?>, ddl.b> h;

   ddl(float $$0, Map<btu, bpk<ddl.c>> $$1, Map<btc<?>, ddl.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bpk<ddl.c> a(btu $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public ddl.b a(btc<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<btu, List<ddl.c>> a = Stream.of(btu.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<btc<?>, ddl.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public ddl.a a(btu $$0, ddl.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public ddl.a a(btc<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new ddl.b($$2, $$1));
         return this;
      }

      public ddl.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public ddl a() {
         return new ddl(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bpk.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<ddl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, ddl.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bpi.a {
      public static final Codec<ddl.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     lp.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bph.a.fieldOf("weight").forGetter(bpi.a::a),
                     ayh.l.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayh.l.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, ddl.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final btc<?> b;
      public final int c;
      public final int d;

      public c(btc<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bph.a($$1), $$2, $$3);
      }

      public c(btc<?> $$0, bph $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == btu.h ? btc.az : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return btc.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
