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

public class ctp {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bhp<ctp.c> a = bhp.c();
   public static final ctp b = new ctp.a().a();
   public static final MapCodec<ctp> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(blo.i, bhp.c(ctp.c.a).promotePartial(ac.a("Spawn data: ", d::error)), auk.a(blo.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(kc.h.q(), ctp.b.a, kc.h).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ctp::new)
   );
   private final float f;
   private final Map<blo, bhp<ctp.c>> g;
   private final Map<bkz<?>, ctp.b> h;

   ctp(float $$0, Map<blo, bhp<ctp.c>> $$1, Map<bkz<?>, ctp.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bhp<ctp.c> a(blo $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public ctp.b a(bkz<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<blo, List<ctp.c>> a = Stream.of(blo.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bkz<?>, ctp.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public ctp.a a(blo $$0, ctp.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public ctp.a a(bkz<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new ctp.b($$2, $$1));
         return this;
      }

      public ctp.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public ctp a() {
         return new ctp(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bhp.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<ctp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, ctp.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bhn.a {
      public static final Codec<ctp.c> a = asy.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     kc.h.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bhm.a.fieldOf("weight").forGetter(bhn.a::a),
                     asy.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     asy.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, ctp.c::new)
         ),
         (Function<ctp.c, DataResult<ctp.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bkz<?> b;
      public final int c;
      public final int d;

      public c(bkz<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bhm.a($$1), $$2, $$3);
      }

      public c(bkz<?> $$0, bhm $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == blo.h ? bkz.av : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bkz.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
