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

public class dci {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final boi<dci.c> a = boi.c();
   public static final dci b = new dci.a().a();
   public static final MapCodec<dci> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bsr.i, boi.c(dci.c.a).promotePartial(ac.a("Spawn data: ", d::error)), ayx.a(bsr.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(le.g.q(), dci.b.a, le.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dci::new)
   );
   private final float f;
   private final Map<bsr, boi<dci.c>> g;
   private final Map<bsa<?>, dci.b> h;

   dci(float $$0, Map<bsr, boi<dci.c>> $$1, Map<bsa<?>, dci.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public boi<dci.c> a(bsr $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dci.b a(bsa<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bsr, List<dci.c>> a = Stream.of(bsr.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bsa<?>, dci.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dci.a a(bsr $$0, dci.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dci.a a(bsa<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dci.b($$2, $$1));
         return this;
      }

      public dci.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dci a() {
         return new dci(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> boi.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dci.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dci.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bog.a {
      public static final Codec<dci.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     le.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bof.a.fieldOf("weight").forGetter(bog.a::a),
                     axm.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     axm.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dci.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bsa<?> b;
      public final int c;
      public final int d;

      public c(bsa<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bof.a($$1), $$2, $$3);
      }

      public c(bsa<?> $$0, bof $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bsr.h ? bsa.az : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bsa.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
