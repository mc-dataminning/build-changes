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

public class ctk {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bhl<ctk.c> a = bhl.c();
   public static final ctk b = new ctk.a().a();
   public static final MapCodec<ctk> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(blj.i, bhl.c(ctk.c.a).promotePartial(ac.a("Spawn data: ", d::error)), aug.a(blj.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(jy.h.q(), ctk.b.a, jy.h).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ctk::new)
   );
   private final float f;
   private final Map<blj, bhl<ctk.c>> g;
   private final Map<bku<?>, ctk.b> h;

   ctk(float $$0, Map<blj, bhl<ctk.c>> $$1, Map<bku<?>, ctk.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bhl<ctk.c> a(blj $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public ctk.b a(bku<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<blj, List<ctk.c>> a = Stream.of(blj.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bku<?>, ctk.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public ctk.a a(blj $$0, ctk.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public ctk.a a(bku<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new ctk.b($$2, $$1));
         return this;
      }

      public ctk.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public ctk a() {
         return new ctk(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bhl.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<ctk.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, ctk.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bhj.a {
      public static final Codec<ctk.c> a = asu.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     jy.h.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bhi.a.fieldOf("weight").forGetter(bhj.a::a),
                     asu.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     asu.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, ctk.c::new)
         ),
         (Function<ctk.c, DataResult<ctk.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bku<?> b;
      public final int c;
      public final int d;

      public c(bku<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bhi.a($$1), $$2, $$3);
      }

      public c(bku<?> $$0, bhi $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == blj.h ? bku.av : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bku.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
