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

public class dha {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bqw<dha.c> a = bqw.c();
   public static final dha b = new dha.a().a();
   public static final MapCodec<dha> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bvk.i, bqw.c(dha.c.a).promotePartial(ae.a("Spawn data: ", d::error)), bai.a(bvk.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(lz.f.q(), dha.b.a, lz.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dha::new)
   );
   private final float f;
   private final Map<bvk, bqw<dha.c>> g;
   private final Map<bus<?>, dha.b> h;

   dha(float $$0, Map<bvk, bqw<dha.c>> $$1, Map<bus<?>, dha.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bqw<dha.c> a(bvk $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dha.b a(bus<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bvk, List<dha.c>> a = Stream.of(bvk.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bus<?>, dha.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dha.a a(bvk $$0, dha.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dha.a a(bus<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dha.b($$2, $$1));
         return this;
      }

      public dha.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dha a() {
         return new dha(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bqw.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dha.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dha.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bqu.a {
      public static final Codec<dha.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     lz.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bqt.a.fieldOf("weight").forGetter(bqu.a::a),
                     ayv.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayv.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dha.c::new)
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
         this.b = $$0.f() == bvk.h ? bus.aN : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bus.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
