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

public class dft {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bqd<dft.c> a = bqd.c();
   public static final dft b = new dft.a().a();
   public static final MapCodec<dft> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bun.i, bqd.c(dft.c.a).promotePartial(ad.a("Spawn data: ", d::error)), azz.a(bun.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(lu.f.q(), dft.b.a, lu.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dft::new)
   );
   private final float f;
   private final Map<bun, bqd<dft.c>> g;
   private final Map<btv<?>, dft.b> h;

   dft(float $$0, Map<bun, bqd<dft.c>> $$1, Map<btv<?>, dft.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bqd<dft.c> a(bun $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dft.b a(btv<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bun, List<dft.c>> a = Stream.of(bun.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<btv<?>, dft.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dft.a a(bun $$0, dft.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dft.a a(btv<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dft.b($$2, $$1));
         return this;
      }

      public dft.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dft a() {
         return new dft(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bqd.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dft.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dft.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bqb.a {
      public static final Codec<dft.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     lu.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bqa.a.fieldOf("weight").forGetter(bqb.a::a),
                     aym.l.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     aym.l.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dft.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final btv<?> b;
      public final int c;
      public final int d;

      public c(btv<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bqa.a($$1), $$2, $$3);
      }

      public c(btv<?> $$0, bqa $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bun.h ? btv.az : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return btv.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
