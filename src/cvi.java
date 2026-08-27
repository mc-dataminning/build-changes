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

public class cvi {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final biq<cvi.c> a = biq.c();
   public static final cvi b = new cvi.a().a();
   public static final MapCodec<cvi> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bmr.i, biq.c(cvi.c.a).promotePartial(ac.a("Spawn data: ", d::error)), avl.a(bmr.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(kd.g.q(), cvi.b.a, kd.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cvi::new)
   );
   private final float f;
   private final Map<bmr, biq<cvi.c>> g;
   private final Map<bmc<?>, cvi.b> h;

   cvi(float $$0, Map<bmr, biq<cvi.c>> $$1, Map<bmc<?>, cvi.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public biq<cvi.c> a(bmr $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public cvi.b a(bmc<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bmr, List<cvi.c>> a = Stream.of(bmr.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bmc<?>, cvi.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public cvi.a a(bmr $$0, cvi.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public cvi.a a(bmc<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new cvi.b($$2, $$1));
         return this;
      }

      public cvi.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public cvi a() {
         return new cvi(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> biq.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<cvi.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, cvi.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bio.a {
      public static final Codec<cvi.c> a = atx.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     kd.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bin.a.fieldOf("weight").forGetter(bio.a::a),
                     atx.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     atx.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, cvi.c::new)
         ),
         (Function<cvi.c, DataResult<cvi.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bmc<?> b;
      public final int c;
      public final int d;

      public c(bmc<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bin.a($$1), $$2, $$3);
      }

      public c(bmc<?> $$0, bin $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bmr.h ? bmc.ax : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bmc.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
