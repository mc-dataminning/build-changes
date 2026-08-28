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

public class deg {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bpe<deg.c> a = bpe.c();
   public static final deg b = new deg.a().a();
   public static final MapCodec<deg> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bto.i, bpe.c(deg.c.a).promotePartial(ad.a("Spawn data: ", d::error)), azj.a(bto.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(lt.f.r(), deg.b.a, lt.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, deg::new)
   );
   private final float f;
   private final Map<bto, bpe<deg.c>> g;
   private final Map<bsw<?>, deg.b> h;

   deg(float $$0, Map<bto, bpe<deg.c>> $$1, Map<bsw<?>, deg.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bpe<deg.c> a(bto $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public deg.b a(bsw<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bto, List<deg.c>> a = Stream.of(bto.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bsw<?>, deg.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public deg.a a(bto $$0, deg.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public deg.a a(bsw<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new deg.b($$2, $$1));
         return this;
      }

      public deg.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public deg a() {
         return new deg(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bpe.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<deg.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, deg.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bpc.a {
      public static final Codec<deg.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     lt.f.r().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bpb.a.fieldOf("weight").forGetter(bpc.a::a),
                     axv.l.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     axv.l.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, deg.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bsw<?> b;
      public final int c;
      public final int d;

      public c(bsw<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bpb.a($$1), $$2, $$3);
      }

      public c(bsw<?> $$0, bpb $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bto.h ? bsw.az : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bsw.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
