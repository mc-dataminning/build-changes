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

public class csj {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bgp<csj.c> a = bgp.c();
   public static final csj b = new csj.a().a();
   public static final MapCodec<csj> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bkm.i, bgp.c(csj.c.a).promotePartial(ac.a("Spawn data: ", d::error)), atr.a(bkm.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(jy.h.q(), csj.b.a, jy.h).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, csj::new)
   );
   private final float f;
   private final Map<bkm, bgp<csj.c>> g;
   private final Map<bjx<?>, csj.b> h;

   csj(float $$0, Map<bkm, bgp<csj.c>> $$1, Map<bjx<?>, csj.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bgp<csj.c> a(bkm $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public csj.b a(bjx<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bkm, List<csj.c>> a = Stream.of(bkm.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bjx<?>, csj.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public csj.a a(bkm $$0, csj.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public csj.a a(bjx<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new csj.b($$2, $$1));
         return this;
      }

      public csj.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public csj a() {
         return new csj(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bgp.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<csj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, csj.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bgn.a {
      public static final Codec<csj.c> a = asg.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     jy.h.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bgm.a.fieldOf("weight").forGetter(bgn.a::a),
                     asg.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     asg.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, csj.c::new)
         ),
         (Function<csj.c, DataResult<csj.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bjx<?> b;
      public final int c;
      public final int d;

      public c(bjx<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bgm.a($$1), $$2, $$3);
      }

      public c(bjx<?> $$0, bgm $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bkm.h ? bjx.av : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bjx.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
