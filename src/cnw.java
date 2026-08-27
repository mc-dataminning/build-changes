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

public class cnw {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bcl<cnw.c> a = bcl.c();
   public static final cnw b = new cnw.a().a();
   public static final MapCodec<cnw> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bgc.i, bcl.c(cnw.c.a).promotePartial(ac.a("Spawn data: ", d::error)), apr.a(bgc.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(jb.h.q(), cnw.b.a, jb.h).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cnw::new)
   );
   private final float f;
   private final Map<bgc, bcl<cnw.c>> g;
   private final Map<bfn<?>, cnw.b> h;

   cnw(float $$0, Map<bgc, bcl<cnw.c>> $$1, Map<bfn<?>, cnw.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bcl<cnw.c> a(bgc $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public cnw.b a(bfn<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bgc, List<cnw.c>> a = Stream.of(bgc.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bfn<?>, cnw.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public cnw.a a(bgc $$0, cnw.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public cnw.a a(bfn<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new cnw.b($$2, $$1));
         return this;
      }

      public cnw.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public cnw a() {
         return new cnw(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bcl.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<cnw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, cnw.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bcj.a {
      public static final Codec<cnw.c> a = aoi.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     jb.h.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bci.a.fieldOf("weight").forGetter(bcj.a::a),
                     aoi.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     aoi.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, cnw.c::new)
         ),
         (Function<cnw.c, DataResult<cnw.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bfn<?> b;
      public final int c;
      public final int d;

      public c(bfn<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bci.a($$1), $$2, $$3);
      }

      public c(bfn<?> $$0, bci $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bgc.h ? bfn.av : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bfn.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
