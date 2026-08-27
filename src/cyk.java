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

public class cyk {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final blq<cyk.c> a = blq.c();
   public static final cyk b = new cyk.a().a();
   public static final MapCodec<cyk> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bpr.i, blq.c(cyk.c.a).promotePartial(ac.a("Spawn data: ", d::error)), axq.a(bpr.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(ki.g.q(), cyk.b.a, ki.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cyk::new)
   );
   private final float f;
   private final Map<bpr, blq<cyk.c>> g;
   private final Map<bpc<?>, cyk.b> h;

   cyk(float $$0, Map<bpr, blq<cyk.c>> $$1, Map<bpc<?>, cyk.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public blq<cyk.c> a(bpr $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public cyk.b a(bpc<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bpr, List<cyk.c>> a = Stream.of(bpr.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bpc<?>, cyk.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public cyk.a a(bpr $$0, cyk.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public cyk.a a(bpc<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new cyk.b($$2, $$1));
         return this;
      }

      public cyk.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public cyk a() {
         return new cyk(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> blq.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<cyk.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, cyk.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends blo.a {
      public static final Codec<cyk.c> a = awe.b(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ki.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bln.a.fieldOf("weight").forGetter(blo.a::a),
                     awe.k.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     awe.k.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, cyk.c::new)
         ),
         (Function<cyk.c, DataResult<cyk.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bpc<?> b;
      public final int c;
      public final int d;

      public c(bpc<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bln.a($$1), $$2, $$3);
      }

      public c(bpc<?> $$0, bln $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bpr.h ? bpc.ay : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bpc.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
