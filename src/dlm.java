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

public class dlm {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final btb<dlm.c> a = btb.a();
   public static final dlm b = new dlm.a().a();
   public static final MapCodec<dlm> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bxx.i, btb.a(dlm.c.a).promotePartial(ag.a("Spawn data: ", d::error)), bam.a(bxx.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(mg.f.q(), dlm.b.a, mg.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dlm::new)
   );
   private final float f;
   private final Map<bxx, btb<dlm.c>> g;
   private final Map<bxc<?>, dlm.b> h;

   dlm(float $$0, Map<bxx, btb<dlm.c>> $$1, Map<bxc<?>, dlm.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public btb<dlm.c> a(bxx $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dlm.b a(bxc<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bxx, btb.a<dlm.c>> a = ag.a(bxx.class, $$0 -> btb.b());
      private final Map<bxc<?>, dlm.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dlm.a a(bxx $$0, int $$1, dlm.c $$2) {
         this.a.get($$0).a($$2, $$1);
         return this;
      }

      public dlm.a a(bxc<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dlm.b($$2, $$1));
         return this;
      }

      public dlm.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dlm a() {
         return new dlm(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((btb.a)$$0.getValue()).a())),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dlm.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dlm.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static record c(bxc<?> b, int c, int d) {
      public static final MapCodec<dlm.c> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     mg.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     ayw.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayw.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dlm.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));

      public c(bxc<?> b, int c, int d) {
         b = b.f() == bxx.h ? bxc.aR : b;
         this.b = b;
         this.c = c;
         this.d = d;
      }

      @Override
      public String toString() {
         return bxc.a(this.b) + "*(" + this.c + "-" + this.d + ")";
      }

      public bxc<?> a() {
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
