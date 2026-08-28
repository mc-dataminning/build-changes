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

public class dhw {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bqw<dhw.c> a = bqw.c();
   public static final dhw b = new dhw.a().a();
   public static final MapCodec<dhw> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bvk.i, bqw.c(dhw.c.a).promotePartial(af.a("Spawn data: ", d::error)), azv.a(bvk.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(mb.f.q(), dhw.b.a, mb.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dhw::new)
   );
   private final float f;
   private final Map<bvk, bqw<dhw.c>> g;
   private final Map<bus<?>, dhw.b> h;

   dhw(float $$0, Map<bvk, bqw<dhw.c>> $$1, Map<bus<?>, dhw.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bqw<dhw.c> a(bvk $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dhw.b a(bus<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bvk, List<dhw.c>> a = Stream.of(bvk.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bus<?>, dhw.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dhw.a a(bvk $$0, dhw.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dhw.a a(bus<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dhw.b($$2, $$1));
         return this;
      }

      public dhw.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dhw a() {
         return new dhw(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bqw.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dhw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dhw.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bqu.a {
      public static final Codec<dhw.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     mb.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bqt.a.fieldOf("weight").forGetter(bqu.a::a),
                     ayi.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayi.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dhw.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bus<?> b;
      public final int c;
      public final int d;

      public c(bus<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bqt.a($$1), $$2, $$3);
      }

      public c(bus<?> $$0, bqt $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bvk.h ? bus.aQ : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bus.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
