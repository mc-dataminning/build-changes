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
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cut {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bij<cut.c> a = bij.c();
   public static final cut b = new cut.a().a();
   public static final MapCodec<cut> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bmi.i, bij.c(cut.c.a).promotePartial(ac.a("Spawn data: ", d::error)), ave.a(bmi.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(kd.g.q(), cut.b.a, kd.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cut::new)
   );
   private final float f;
   private final Map<bmi, bij<cut.c>> g;
   private final Map<blt<?>, cut.b> h;

   cut(float $$0, Map<bmi, bij<cut.c>> $$1, Map<blt<?>, cut.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bij<cut.c> a(bmi $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public cut.b a(blt<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bmi, List<cut.c>> a = Stream.of(bmi.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<blt<?>, cut.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public cut.a a(bmi $$0, cut.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public cut.a a(blt<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new cut.b($$2, $$1));
         return this;
      }

      public cut.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public cut a() {
         return new cut(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bij.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<cut.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, cut.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bih.a {
      public static final Codec<cut.c> a = atq.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     kd.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     big.a.fieldOf("weight").forGetter(bih.a::a),
                     atq.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     atq.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, cut.c::new)
         ),
         (Function<cut.c, DataResult<cut.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final blt<?> b;
      public final int c;
      public final int d;

      public c(blt<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, big.a($$1), $$2, $$3);
      }

      public c(blt<?> $$0, big $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bmi.h ? blt.aw : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return blt.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
