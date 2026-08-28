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

public class div {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bru<div.c> a = bru.c();
   public static final div b = new div.a().a();
   public static final MapCodec<div> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bwi.i, bru.c(div.c.a).promotePartial(ae.a("Spawn data: ", d::error)), bba.a(bwi.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(ma.f.q(), div.b.a, ma.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, div::new)
   );
   private final float f;
   private final Map<bwi, bru<div.c>> g;
   private final Map<bvq<?>, div.b> h;

   div(float $$0, Map<bwi, bru<div.c>> $$1, Map<bvq<?>, div.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bru<div.c> a(bwi $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public div.b a(bvq<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bwi, List<div.c>> a = Stream.of(bwi.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bvq<?>, div.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public div.a a(bwi $$0, div.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public div.a a(bvq<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new div.b($$2, $$1));
         return this;
      }

      public div.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public div a() {
         return new div(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bru.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<div.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, div.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends brs.a {
      public static final Codec<div.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ma.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     brr.a.fieldOf("weight").forGetter(brs.a::a),
                     azn.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     azn.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, div.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bvq<?> b;
      public final int c;
      public final int d;

      public c(bvq<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, brr.a($$1), $$2, $$3);
      }

      public c(bvq<?> $$0, brr $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bwi.h ? bvq.aR : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bvq.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
