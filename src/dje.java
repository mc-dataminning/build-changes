import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dje {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bsb<dje.c> a = bsb.a();
   public static final dje b = new dje.a().a();
   public static final MapCodec<dje> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bwu.i, bsb.a(dje.c.a).promotePartial(af.a("Spawn data: ", d::error)), bag.a(bwu.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(md.f.q(), dje.b.a, md.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dje::new)
   );
   private final float f;
   private final Map<bwu, bsb<dje.c>> g;
   private final Map<bwb<?>, dje.b> h;

   dje(float $$0, Map<bwu, bsb<dje.c>> $$1, Map<bwb<?>, dje.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bsb<dje.c> a(bwu $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dje.b a(bwb<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bwu, bsb.a<dje.c>> a = af.a(bwu.class, $$0 -> bsb.b());
      private final Map<bwb<?>, dje.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dje.a a(bwu $$0, int $$1, dje.c $$2) {
         this.a.get($$0).a($$2, $$1);
         return this;
      }

      public dje.a a(bwb<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dje.b($$2, $$1));
         return this;
      }

      public dje.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dje a() {
         return new dje(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((bsb.a)$$0.getValue()).a())),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dje.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dje.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static record c(bwb<?> b, int c, int d) {
      public static final MapCodec<dje.c> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     md.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     ays.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ays.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dje.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));

      public c(bwb<?> b, int c, int d) {
         b = b.f() == bwu.h ? bwb.aQ : b;
         this.b = b;
         this.c = c;
         this.d = d;
      }

      @Override
      public String toString() {
         return bwb.a(this.b) + "*(" + this.c + "-" + this.d + ")";
      }

      public bwb<?> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
