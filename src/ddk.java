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

public class ddk {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bpj<ddk.c> a = bpj.c();
   public static final ddk b = new ddk.a().a();
   public static final MapCodec<ddk> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(btt.i, bpj.c(ddk.c.a).promotePartial(ac.a("Spawn data: ", d::error)), azu.a(btt.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(lp.g.q(), ddk.b.a, lp.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ddk::new)
   );
   private final float f;
   private final Map<btt, bpj<ddk.c>> g;
   private final Map<btb<?>, ddk.b> h;

   ddk(float $$0, Map<btt, bpj<ddk.c>> $$1, Map<btb<?>, ddk.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bpj<ddk.c> a(btt $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public ddk.b a(btb<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<btt, List<ddk.c>> a = Stream.of(btt.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<btb<?>, ddk.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public ddk.a a(btt $$0, ddk.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public ddk.a a(btb<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new ddk.b($$2, $$1));
         return this;
      }

      public ddk.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public ddk a() {
         return new ddk(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bpj.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<ddk.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, ddk.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bph.a {
      public static final Codec<ddk.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     lp.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bpg.a.fieldOf("weight").forGetter(bph.a::a),
                     ayh.l.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayh.l.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, ddk.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final btb<?> b;
      public final int c;
      public final int d;

      public c(btb<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bpg.a($$1), $$2, $$3);
      }

      public c(btb<?> $$0, bpg $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == btt.h ? btb.az : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return btb.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
