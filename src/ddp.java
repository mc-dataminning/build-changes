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

public class ddp {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bor<ddp.c> a = bor.c();
   public static final ddp b = new ddp.a().a();
   public static final MapCodec<ddp> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(btb.i, bor.c(ddp.c.a).promotePartial(ac.a("Spawn data: ", d::error)), ayz.a(btb.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(lq.f.r(), ddp.b.a, lq.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ddp::new)
   );
   private final float f;
   private final Map<btb, bor<ddp.c>> g;
   private final Map<bsj<?>, ddp.b> h;

   ddp(float $$0, Map<btb, bor<ddp.c>> $$1, Map<bsj<?>, ddp.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bor<ddp.c> a(btb $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public ddp.b a(bsj<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<btb, List<ddp.c>> a = Stream.of(btb.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bsj<?>, ddp.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public ddp.a a(btb $$0, ddp.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public ddp.a a(bsj<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new ddp.b($$2, $$1));
         return this;
      }

      public ddp.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public ddp a() {
         return new ddp(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bor.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<ddp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, ddp.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bop.a {
      public static final Codec<ddp.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     lq.f.r().fieldOf("type").forGetter($$0x -> $$0x.b),
                     boo.a.fieldOf("weight").forGetter(bop.a::a),
                     axm.l.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     axm.l.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, ddp.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bsj<?> b;
      public final int c;
      public final int d;

      public c(bsj<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, boo.a($$1), $$2, $$3);
      }

      public c(bsj<?> $$0, boo $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == btb.h ? bsj.az : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bsj.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
