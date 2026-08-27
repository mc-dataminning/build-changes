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

public class cuj {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bhz<cuj.c> a = bhz.c();
   public static final cuj b = new cuj.a().a();
   public static final MapCodec<cuj> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bly.i, bhz.c(cuj.c.a).promotePartial(ac.a("Spawn data: ", d::error)), aut.a(bly.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(kb.g.q(), cuj.b.a, kb.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cuj::new)
   );
   private final float f;
   private final Map<bly, bhz<cuj.c>> g;
   private final Map<blj<?>, cuj.b> h;

   cuj(float $$0, Map<bly, bhz<cuj.c>> $$1, Map<blj<?>, cuj.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bhz<cuj.c> a(bly $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public cuj.b a(blj<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bly, List<cuj.c>> a = Stream.of(bly.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<blj<?>, cuj.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public cuj.a a(bly $$0, cuj.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public cuj.a a(blj<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new cuj.b($$2, $$1));
         return this;
      }

      public cuj.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public cuj a() {
         return new cuj(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bhz.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<cuj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, cuj.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bhx.a {
      public static final Codec<cuj.c> a = atg.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     kb.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bhw.a.fieldOf("weight").forGetter(bhx.a::a),
                     atg.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     atg.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, cuj.c::new)
         ),
         (Function<cuj.c, DataResult<cuj.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final blj<?> b;
      public final int c;
      public final int d;

      public c(blj<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bhw.a($$1), $$2, $$3);
      }

      public c(blj<?> $$0, bhw $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bly.h ? blj.aw : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return blj.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
