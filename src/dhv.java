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

public class dhv {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bqv<dhv.c> a = bqv.c();
   public static final dhv b = new dhv.a().a();
   public static final MapCodec<dhv> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bvj.i, bqv.c(dhv.c.a).promotePartial(af.a("Spawn data: ", d::error)), azv.a(bvj.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(mb.f.q(), dhv.b.a, mb.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dhv::new)
   );
   private final float f;
   private final Map<bvj, bqv<dhv.c>> g;
   private final Map<bur<?>, dhv.b> h;

   dhv(float $$0, Map<bvj, bqv<dhv.c>> $$1, Map<bur<?>, dhv.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bqv<dhv.c> a(bvj $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dhv.b a(bur<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bvj, List<dhv.c>> a = Stream.of(bvj.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bur<?>, dhv.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dhv.a a(bvj $$0, dhv.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dhv.a a(bur<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dhv.b($$2, $$1));
         return this;
      }

      public dhv.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dhv a() {
         return new dhv(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bqv.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dhv.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dhv.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bqt.a {
      public static final Codec<dhv.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     mb.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bqs.a.fieldOf("weight").forGetter(bqt.a::a),
                     ayi.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayi.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dhv.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bur<?> b;
      public final int c;
      public final int d;

      public c(bur<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bqs.a($$1), $$2, $$3);
      }

      public c(bur<?> $$0, bqs $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bvj.h ? bur.aQ : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bur.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
