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

public class cva {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bip<cva.c> a = bip.c();
   public static final cva b = new cva.a().a();
   public static final MapCodec<cva> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bmo.i, bip.c(cva.c.a).promotePartial(ac.a("Spawn data: ", d::error)), avk.a(bmo.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(kd.g.q(), cva.b.a, kd.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cva::new)
   );
   private final float f;
   private final Map<bmo, bip<cva.c>> g;
   private final Map<blz<?>, cva.b> h;

   cva(float $$0, Map<bmo, bip<cva.c>> $$1, Map<blz<?>, cva.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bip<cva.c> a(bmo $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public cva.b a(blz<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bmo, List<cva.c>> a = Stream.of(bmo.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<blz<?>, cva.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public cva.a a(bmo $$0, cva.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public cva.a a(blz<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new cva.b($$2, $$1));
         return this;
      }

      public cva.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public cva a() {
         return new cva(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bip.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<cva.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, cva.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bin.a {
      public static final Codec<cva.c> a = atw.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     kd.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bim.a.fieldOf("weight").forGetter(bin.a::a),
                     atw.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     atw.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, cva.c::new)
         ),
         (Function<cva.c, DataResult<cva.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final blz<?> b;
      public final int c;
      public final int d;

      public c(blz<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bim.a($$1), $$2, $$3);
      }

      public c(blz<?> $$0, bim $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bmo.h ? blz.aw : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return blz.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
