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

public class crf {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bfm<crf.c> a = bfm.c();
   public static final crf b = new crf.a().a();
   public static final MapCodec<crf> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bjj.i, bfm.c(crf.c.a).promotePartial(ac.a("Spawn data: ", d::error)), asp.a(bjj.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(jd.h.q(), crf.b.a, jd.h).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, crf::new)
   );
   private final float f;
   private final Map<bjj, bfm<crf.c>> g;
   private final Map<biu<?>, crf.b> h;

   crf(float $$0, Map<bjj, bfm<crf.c>> $$1, Map<biu<?>, crf.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bfm<crf.c> a(bjj $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public crf.b a(biu<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bjj, List<crf.c>> a = Stream.of(bjj.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<biu<?>, crf.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public crf.a a(bjj $$0, crf.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public crf.a a(biu<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new crf.b($$2, $$1));
         return this;
      }

      public crf.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public crf a() {
         return new crf(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bfm.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<crf.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, crf.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bfk.a {
      public static final Codec<crf.c> a = arg.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     jd.h.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bfj.a.fieldOf("weight").forGetter(bfk.a::a),
                     arg.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     arg.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, crf.c::new)
         ),
         (Function<crf.c, DataResult<crf.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final biu<?> b;
      public final int c;
      public final int d;

      public c(biu<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bfj.a($$1), $$2, $$3);
      }

      public c(biu<?> $$0, bfj $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bjj.h ? biu.av : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return biu.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
