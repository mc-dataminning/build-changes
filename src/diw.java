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

public class diw {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final brv<diw.c> a = brv.c();
   public static final diw b = new diw.a().a();
   public static final MapCodec<diw> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bwj.i, brv.c(diw.c.a).promotePartial(ae.a("Spawn data: ", d::error)), bba.a(bwj.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(ma.f.q(), diw.b.a, ma.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, diw::new)
   );
   private final float f;
   private final Map<bwj, brv<diw.c>> g;
   private final Map<bvr<?>, diw.b> h;

   diw(float $$0, Map<bwj, brv<diw.c>> $$1, Map<bvr<?>, diw.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public brv<diw.c> a(bwj $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public diw.b a(bvr<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bwj, List<diw.c>> a = Stream.of(bwj.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bvr<?>, diw.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public diw.a a(bwj $$0, diw.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public diw.a a(bvr<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new diw.b($$2, $$1));
         return this;
      }

      public diw.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public diw a() {
         return new diw(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> brv.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<diw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, diw.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends brt.a {
      public static final Codec<diw.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ma.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     brs.a.fieldOf("weight").forGetter(brt.a::a),
                     azn.m.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     azn.m.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, diw.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bvr<?> b;
      public final int c;
      public final int d;

      public c(bvr<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, brs.a($$1), $$2, $$3);
      }

      public c(bvr<?> $$0, brs $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bwj.h ? bvr.aR : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bvr.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
