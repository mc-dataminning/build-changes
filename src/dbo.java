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

public class dbo {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final boa<dbo.c> a = boa.c();
   public static final dbo b = new dbo.a().a();
   public static final MapCodec<dbo> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bsd.i, boa.c(dbo.c.a).promotePartial(ac.a("Spawn data: ", d::error)), ayt.a(bsd.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(ld.g.q(), dbo.b.a, ld.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dbo::new)
   );
   private final float f;
   private final Map<bsd, boa<dbo.c>> g;
   private final Map<brn<?>, dbo.b> h;

   dbo(float $$0, Map<bsd, boa<dbo.c>> $$1, Map<brn<?>, dbo.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public boa<dbo.c> a(bsd $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dbo.b a(brn<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bsd, List<dbo.c>> a = Stream.of(bsd.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<brn<?>, dbo.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dbo.a a(bsd $$0, dbo.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dbo.a a(brn<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dbo.b($$2, $$1));
         return this;
      }

      public dbo.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dbo a() {
         return new dbo(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> boa.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dbo.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dbo.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bny.a {
      public static final Codec<dbo.c> a = axh.b(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ld.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bnx.a.fieldOf("weight").forGetter(bny.a::a),
                     axh.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     axh.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dbo.c::new)
         ),
         (Function<dbo.c, DataResult<dbo.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final brn<?> b;
      public final int c;
      public final int d;

      public c(brn<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bnx.a($$1), $$2, $$3);
      }

      public c(brn<?> $$0, bnx $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bsd.h ? brn.ay : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return brn.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
