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

public class cxp {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bkz<cxp.c> a = bkz.c();
   public static final cxp b = new cxp.a().a();
   public static final MapCodec<cxp> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bpa.i, bkz.c(cxp.c.a).promotePartial(ac.a("Spawn data: ", d::error)), axg.a(bpa.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(kh.g.q(), cxp.b.a, kh.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cxp::new)
   );
   private final float f;
   private final Map<bpa, bkz<cxp.c>> g;
   private final Map<bol<?>, cxp.b> h;

   cxp(float $$0, Map<bpa, bkz<cxp.c>> $$1, Map<bol<?>, cxp.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bkz<cxp.c> a(bpa $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public cxp.b a(bol<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bpa, List<cxp.c>> a = Stream.of(bpa.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bol<?>, cxp.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public cxp.a a(bpa $$0, cxp.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public cxp.a a(bol<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new cxp.b($$2, $$1));
         return this;
      }

      public cxp.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public cxp a() {
         return new cxp(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bkz.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<cxp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, cxp.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bkx.a {
      public static final Codec<cxp.c> a = avu.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     kh.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bkw.a.fieldOf("weight").forGetter(bkx.a::a),
                     avu.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     avu.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, cxp.c::new)
         ),
         (Function<cxp.c, DataResult<cxp.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bol<?> b;
      public final int c;
      public final int d;

      public c(bol<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bkw.a($$1), $$2, $$3);
      }

      public c(bol<?> $$0, bkw $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bpa.h ? bol.ax : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bol.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
