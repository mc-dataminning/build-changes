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

public class dgt {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bqt<dgt.c> a = bqt.c();
   public static final dgt b = new dgt.a().a();
   public static final MapCodec<dgt> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bvh.i, bqt.c(dgt.c.a).promotePartial(ae.a("Spawn data: ", d::error)), baj.a(bvh.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(lz.f.q(), dgt.b.a, lz.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dgt::new)
   );
   private final float f;
   private final Map<bvh, bqt<dgt.c>> g;
   private final Map<bup<?>, dgt.b> h;

   dgt(float $$0, Map<bvh, bqt<dgt.c>> $$1, Map<bup<?>, dgt.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bqt<dgt.c> a(bvh $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dgt.b a(bup<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bvh, List<dgt.c>> a = Stream.of(bvh.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bup<?>, dgt.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dgt.a a(bvh $$0, dgt.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dgt.a a(bup<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dgt.b($$2, $$1));
         return this;
      }

      public dgt.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dgt a() {
         return new dgt(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bqt.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dgt.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dgt.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bqr.a {
      public static final Codec<dgt.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     lz.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bqq.a.fieldOf("weight").forGetter(bqr.a::a),
                     ayw.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayw.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dgt.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bup<?> b;
      public final int c;
      public final int d;

      public c(bup<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bqq.a($$1), $$2, $$3);
      }

      public c(bup<?> $$0, bqq $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bvh.h ? bup.az : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bup.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
