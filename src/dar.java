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

public class dar {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bmt<dar.c> a = bmt.c();
   public static final dar b = new dar.a().a();
   public static final MapCodec<dar> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bqw.i, bmt.c(dar.c.a).promotePartial(ac.a("Spawn data: ", d::error)), ayg.a(bqw.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(kt.g.q(), dar.b.a, kt.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dar::new)
   );
   private final float f;
   private final Map<bqw, bmt<dar.c>> g;
   private final Map<bqg<?>, dar.b> h;

   dar(float $$0, Map<bqw, bmt<dar.c>> $$1, Map<bqg<?>, dar.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bmt<dar.c> a(bqw $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dar.b a(bqg<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bqw, List<dar.c>> a = Stream.of(bqw.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bqg<?>, dar.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dar.a a(bqw $$0, dar.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dar.a a(bqg<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dar.b($$2, $$1));
         return this;
      }

      public dar.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dar a() {
         return new dar(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bmt.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dar.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dar.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bmr.a {
      public static final Codec<dar.c> a = awu.b(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     kt.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bmq.a.fieldOf("weight").forGetter(bmr.a::a),
                     awu.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     awu.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dar.c::new)
         ),
         (Function<dar.c, DataResult<dar.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bqg<?> b;
      public final int c;
      public final int d;

      public c(bqg<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bmq.a($$1), $$2, $$3);
      }

      public c(bqg<?> $$0, bmq $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bqw.h ? bqg.ay : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bqg.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
