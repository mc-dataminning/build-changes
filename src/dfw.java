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

public class dfw {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bqg<dfw.c> a = bqg.c();
   public static final dfw b = new dfw.a().a();
   public static final MapCodec<dfw> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(buq.i, bqg.c(dfw.c.a).promotePartial(ad.a("Spawn data: ", d::error)), bab.a(buq.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(lv.f.q(), dfw.b.a, lv.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dfw::new)
   );
   private final float f;
   private final Map<buq, bqg<dfw.c>> g;
   private final Map<bty<?>, dfw.b> h;

   dfw(float $$0, Map<buq, bqg<dfw.c>> $$1, Map<bty<?>, dfw.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bqg<dfw.c> a(buq $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dfw.b a(bty<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<buq, List<dfw.c>> a = Stream.of(buq.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bty<?>, dfw.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dfw.a a(buq $$0, dfw.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dfw.a a(bty<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dfw.b($$2, $$1));
         return this;
      }

      public dfw.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dfw a() {
         return new dfw(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bqg.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dfw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dfw.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bqe.a {
      public static final Codec<dfw.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     lv.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bqd.a.fieldOf("weight").forGetter(bqe.a::a),
                     ayo.l.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayo.l.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dfw.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bty<?> b;
      public final int c;
      public final int d;

      public c(bty<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bqd.a($$1), $$2, $$3);
      }

      public c(bty<?> $$0, bqd $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == buq.h ? bty.az : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bty.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
