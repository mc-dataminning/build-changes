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

public class dgo {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bqp<dgo.c> a = bqp.c();
   public static final dgo b = new dgo.a().a();
   public static final MapCodec<dgo> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bvd.i, bqp.c(dgo.c.a).promotePartial(ae.a("Spawn data: ", d::error)), bag.a(bvd.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(ly.f.q(), dgo.b.a, ly.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dgo::new)
   );
   private final float f;
   private final Map<bvd, bqp<dgo.c>> g;
   private final Map<bul<?>, dgo.b> h;

   dgo(float $$0, Map<bvd, bqp<dgo.c>> $$1, Map<bul<?>, dgo.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bqp<dgo.c> a(bvd $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dgo.b a(bul<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bvd, List<dgo.c>> a = Stream.of(bvd.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bul<?>, dgo.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dgo.a a(bvd $$0, dgo.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dgo.a a(bul<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dgo.b($$2, $$1));
         return this;
      }

      public dgo.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dgo a() {
         return new dgo(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bqp.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dgo.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dgo.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bqn.a {
      public static final Codec<dgo.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ly.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bqm.a.fieldOf("weight").forGetter(bqn.a::a),
                     ayt.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayt.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dgo.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bul<?> b;
      public final int c;
      public final int d;

      public c(bul<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bqm.a($$1), $$2, $$3);
      }

      public c(bul<?> $$0, bqm $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bvd.h ? bul.az : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bul.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
