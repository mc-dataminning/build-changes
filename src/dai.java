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

public class dai {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bmo<dai.c> a = bmo.c();
   public static final dai b = new dai.a().a();
   public static final MapCodec<dai> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bqr.i, bmo.c(dai.c.a).promotePartial(ac.a("Spawn data: ", d::error)), aye.a(bqr.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(kr.g.q(), dai.b.a, kr.g).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dai::new)
   );
   private final float f;
   private final Map<bqr, bmo<dai.c>> g;
   private final Map<bqb<?>, dai.b> h;

   dai(float $$0, Map<bqr, bmo<dai.c>> $$1, Map<bqb<?>, dai.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bmo<dai.c> a(bqr $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dai.b a(bqb<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bqr, List<dai.c>> a = Stream.of(bqr.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bqb<?>, dai.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dai.a a(bqr $$0, dai.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dai.a a(bqb<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dai.b($$2, $$1));
         return this;
      }

      public dai.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dai a() {
         return new dai(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bmo.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dai.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dai.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bmm.a {
      public static final Codec<dai.c> a = aws.b(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     kr.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bml.a.fieldOf("weight").forGetter(bmm.a::a),
                     aws.j.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     aws.j.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dai.c::new)
         ),
         (Function<dai.c, DataResult<dai.c>>)($$0 -> $$0.c > $$0.d
               ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount")
               : DataResult.success($$0))
      );
      public final bqb<?> b;
      public final int c;
      public final int d;

      public c(bqb<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bml.a($$1), $$2, $$3);
      }

      public c(bqb<?> $$0, bml $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bqr.h ? bqb.ay : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bqb.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
