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

public class cxc {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bkk<cxc.c> a = bkk.c();
   public static final cxc b = new cxc.a().a();
   public static final MapCodec<cxc> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bol.i, bkk.c(cxc.c.a).promotePartial(ac.a("Spawn data: ", d::error)), axc.a(bol.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(kf.g.q(), cxc.b.a, kf.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cxc::new)
   );
   private final float f;
   private final Map<bol, bkk<cxc.c>> g;
   private final Map<bnw<?>, cxc.b> h;

   cxc(float $$0, Map<bol, bkk<cxc.c>> $$1, Map<bnw<?>, cxc.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bkk<cxc.c> a(bol $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public cxc.b a(bnw<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bol, List<cxc.c>> a = Stream.of(bol.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bnw<?>, cxc.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public cxc.a a(bol $$0, cxc.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public cxc.a a(bnw<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new cxc.b($$2, $$1));
         return this;
      }

      public cxc.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public cxc a() {
         return new cxc(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bkk.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<cxc.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, cxc.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bki.a {
      public static final Codec<cxc.c> a = avq.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     kf.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bkh.a.fieldOf("weight").forGetter(bki.a::a),
                     avq.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     avq.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, cxc.c::new)
         ),
         (Function<cxc.c, DataResult<cxc.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bnw<?> b;
      public final int c;
      public final int d;

      public c(bnw<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bkh.a($$1), $$2, $$3);
      }

      public c(bnw<?> $$0, bkh $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bol.h ? bnw.ax : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bnw.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
