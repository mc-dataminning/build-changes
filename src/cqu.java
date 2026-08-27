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

public class cqu {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bfc<cqu.c> a = bfc.c();
   public static final cqu b = new cqu.a().a();
   public static final MapCodec<cqu> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(biz.i, bfc.c(cqu.c.a).promotePartial(ac.a("Spawn data: ", d::error)), asf.a(biz.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(jc.h.q(), cqu.b.a, jc.h).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cqu::new)
   );
   private final float f;
   private final Map<biz, bfc<cqu.c>> g;
   private final Map<bik<?>, cqu.b> h;

   cqu(float $$0, Map<biz, bfc<cqu.c>> $$1, Map<bik<?>, cqu.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bfc<cqu.c> a(biz $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public cqu.b a(bik<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<biz, List<cqu.c>> a = Stream.of(biz.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bik<?>, cqu.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public cqu.a a(biz $$0, cqu.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public cqu.a a(bik<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new cqu.b($$2, $$1));
         return this;
      }

      public cqu.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public cqu a() {
         return new cqu(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bfc.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<cqu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, cqu.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bfa.a {
      public static final Codec<cqu.c> a = aqw.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     jc.h.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bez.a.fieldOf("weight").forGetter(bfa.a::a),
                     aqw.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     aqw.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, cqu.c::new)
         ),
         (Function<cqu.c, DataResult<cqu.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bik<?> b;
      public final int c;
      public final int d;

      public c(bik<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bez.a($$1), $$2, $$3);
      }

      public c(bik<?> $$0, bez $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == biz.h ? bik.av : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bik.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
