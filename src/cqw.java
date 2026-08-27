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

public class cqw {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bfe<cqw.c> a = bfe.c();
   public static final cqw b = new cqw.a().a();
   public static final MapCodec<cqw> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bjb.i, bfe.c(cqw.c.a).promotePartial(ac.a("Spawn data: ", d::error)), ash.a(bjb.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(jb.h.q(), cqw.b.a, jb.h).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cqw::new)
   );
   private final float f;
   private final Map<bjb, bfe<cqw.c>> g;
   private final Map<bim<?>, cqw.b> h;

   cqw(float $$0, Map<bjb, bfe<cqw.c>> $$1, Map<bim<?>, cqw.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bfe<cqw.c> a(bjb $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public cqw.b a(bim<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bjb, List<cqw.c>> a = Stream.of(bjb.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bim<?>, cqw.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public cqw.a a(bjb $$0, cqw.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public cqw.a a(bim<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new cqw.b($$2, $$1));
         return this;
      }

      public cqw.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public cqw a() {
         return new cqw(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bfe.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<cqw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, cqw.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bfc.a {
      public static final Codec<cqw.c> a = aqy.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     jb.h.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bfb.a.fieldOf("weight").forGetter(bfc.a::a),
                     aqy.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     aqy.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, cqw.c::new)
         ),
         (Function<cqw.c, DataResult<cqw.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bim<?> b;
      public final int c;
      public final int d;

      public c(bim<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bfb.a($$1), $$2, $$3);
      }

      public c(bim<?> $$0, bfb $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bjb.h ? bim.av : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bim.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
