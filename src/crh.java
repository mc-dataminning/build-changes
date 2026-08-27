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

public class crh {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bfo<crh.c> a = bfo.c();
   public static final crh b = new crh.a().a();
   public static final MapCodec<crh> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bjl.i, bfo.c(crh.c.a).promotePartial(ac.a("Spawn data: ", d::error)), asr.a(bjl.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(jd.h.q(), crh.b.a, jd.h).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, crh::new)
   );
   private final float f;
   private final Map<bjl, bfo<crh.c>> g;
   private final Map<biw<?>, crh.b> h;

   crh(float $$0, Map<bjl, bfo<crh.c>> $$1, Map<biw<?>, crh.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bfo<crh.c> a(bjl $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public crh.b a(biw<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bjl, List<crh.c>> a = Stream.of(bjl.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<biw<?>, crh.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public crh.a a(bjl $$0, crh.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public crh.a a(biw<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new crh.b($$2, $$1));
         return this;
      }

      public crh.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public crh a() {
         return new crh(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bfo.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<crh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, crh.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bfm.a {
      public static final Codec<crh.c> a = arh.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     jd.h.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bfl.a.fieldOf("weight").forGetter(bfm.a::a),
                     arh.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     arh.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, crh.c::new)
         ),
         (Function<crh.c, DataResult<crh.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final biw<?> b;
      public final int c;
      public final int d;

      public c(biw<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bfl.a($$1), $$2, $$3);
      }

      public c(biw<?> $$0, bfl $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bjl.h ? biw.av : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return biw.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
