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

public class dbf {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bne<dbf.c> a = bne.c();
   public static final dbf b = new dbf.a().a();
   public static final MapCodec<dbf> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(brh.i, bne.c(dbf.c.a).promotePartial(ac.a("Spawn data: ", d::error)), ayq.a(brh.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(lc.g.q(), dbf.b.a, lc.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dbf::new)
   );
   private final float f;
   private final Map<brh, bne<dbf.c>> g;
   private final Map<bqr<?>, dbf.b> h;

   dbf(float $$0, Map<brh, bne<dbf.c>> $$1, Map<bqr<?>, dbf.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bne<dbf.c> a(brh $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dbf.b a(bqr<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<brh, List<dbf.c>> a = Stream.of(brh.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bqr<?>, dbf.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dbf.a a(brh $$0, dbf.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dbf.a a(bqr<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dbf.b($$2, $$1));
         return this;
      }

      public dbf.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dbf a() {
         return new dbf(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bne.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dbf.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dbf.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bnc.a {
      public static final Codec<dbf.c> a = axe.b(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     lc.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bnb.a.fieldOf("weight").forGetter(bnc.a::a),
                     axe.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     axe.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dbf.c::new)
         ),
         (Function<dbf.c, DataResult<dbf.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bqr<?> b;
      public final int c;
      public final int d;

      public c(bqr<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bnb.a($$1), $$2, $$3);
      }

      public c(bqr<?> $$0, bnb $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == brh.h ? bqr.ay : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bqr.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
