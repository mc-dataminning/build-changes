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

public class cuz {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bio<cuz.c> a = bio.c();
   public static final cuz b = new cuz.a().a();
   public static final MapCodec<cuz> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bmn.i, bio.c(cuz.c.a).promotePartial(ac.a("Spawn data: ", d::error)), avj.a(bmn.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(kd.g.q(), cuz.b.a, kd.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cuz::new)
   );
   private final float f;
   private final Map<bmn, bio<cuz.c>> g;
   private final Map<bly<?>, cuz.b> h;

   cuz(float $$0, Map<bmn, bio<cuz.c>> $$1, Map<bly<?>, cuz.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bio<cuz.c> a(bmn $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public cuz.b a(bly<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bmn, List<cuz.c>> a = Stream.of(bmn.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bly<?>, cuz.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public cuz.a a(bmn $$0, cuz.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public cuz.a a(bly<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new cuz.b($$2, $$1));
         return this;
      }

      public cuz.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public cuz a() {
         return new cuz(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bio.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<cuz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, cuz.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bim.a {
      public static final Codec<cuz.c> a = atv.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     kd.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bil.a.fieldOf("weight").forGetter(bim.a::a),
                     atv.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     atv.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, cuz.c::new)
         ),
         (Function<cuz.c, DataResult<cuz.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bly<?> b;
      public final int c;
      public final int d;

      public c(bly<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bil.a($$1), $$2, $$3);
      }

      public c(bly<?> $$0, bil $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bmn.h ? bly.aw : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bly.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
