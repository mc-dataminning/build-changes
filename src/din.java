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

public class din {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final brm<din.c> a = brm.c();
   public static final din b = new din.a().a();
   public static final MapCodec<din> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bwa.i, brm.c(din.c.a).promotePartial(ae.a("Spawn data: ", d::error)), baq.a(bwa.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(ma.f.q(), din.b.a, ma.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, din::new)
   );
   private final float f;
   private final Map<bwa, brm<din.c>> g;
   private final Map<bvi<?>, din.b> h;

   din(float $$0, Map<bwa, brm<din.c>> $$1, Map<bvi<?>, din.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public brm<din.c> a(bwa $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public din.b a(bvi<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bwa, List<din.c>> a = Stream.of(bwa.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bvi<?>, din.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public din.a a(bwa $$0, din.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public din.a a(bvi<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new din.b($$2, $$1));
         return this;
      }

      public din.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public din a() {
         return new din(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> brm.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<din.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, din.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends brk.a {
      public static final Codec<din.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ma.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     brj.a.fieldOf("weight").forGetter(brk.a::a),
                     azd.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     azd.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, din.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bvi<?> b;
      public final int c;
      public final int d;

      public c(bvi<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, brj.a($$1), $$2, $$3);
      }

      public c(bvi<?> $$0, brj $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bwa.h ? bvi.aR : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bvi.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
