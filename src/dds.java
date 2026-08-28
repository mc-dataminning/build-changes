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

public class dds {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bov<dds.c> a = bov.c();
   public static final dds b = new dds.a().a();
   public static final MapCodec<dds> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(btf.i, bov.c(dds.c.a).promotePartial(ac.a("Spawn data: ", d::error)), azc.a(btf.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(lq.f.r(), dds.b.a, lq.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dds::new)
   );
   private final float f;
   private final Map<btf, bov<dds.c>> g;
   private final Map<bsn<?>, dds.b> h;

   dds(float $$0, Map<btf, bov<dds.c>> $$1, Map<bsn<?>, dds.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bov<dds.c> a(btf $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dds.b a(bsn<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<btf, List<dds.c>> a = Stream.of(btf.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bsn<?>, dds.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dds.a a(btf $$0, dds.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dds.a a(bsn<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dds.b($$2, $$1));
         return this;
      }

      public dds.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dds a() {
         return new dds(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bov.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dds.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dds.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bot.a {
      public static final Codec<dds.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     lq.f.r().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bos.a.fieldOf("weight").forGetter(bot.a::a),
                     axo.l.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     axo.l.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dds.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final bsn<?> b;
      public final int c;
      public final int d;

      public c(bsn<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bos.a($$1), $$2, $$3);
      }

      public c(bsn<?> $$0, bos $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == btf.h ? bsn.az : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return bsn.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
