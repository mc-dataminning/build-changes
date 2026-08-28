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

public class dff {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bpy<dff.c> a = bpy.c();
   public static final dff b = new dff.a().a();
   public static final MapCodec<dff> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bui.i, bpy.c(dff.c.a).promotePartial(ad.a("Spawn data: ", d::error)), azy.a(bui.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(lu.f.q(), dff.b.a, lu.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dff::new)
   );
   private final float f;
   private final Map<bui, bpy<dff.c>> g;
   private final Map<btq<?>, dff.b> h;

   dff(float $$0, Map<bui, bpy<dff.c>> $$1, Map<btq<?>, dff.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bpy<dff.c> a(bui $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public dff.b a(btq<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bui, List<dff.c>> a = Stream.of(bui.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<btq<?>, dff.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public dff.a a(bui $$0, dff.c $$1) {
         this.a.get($$0).add($$1);
         return this;
      }

      public dff.a a(btq<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new dff.b($$2, $$1));
         return this;
      }

      public dff.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public dff a() {
         return new dff(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> bpy.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static record b(double b, double c) {
      public static final Codec<dff.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, dff.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends bpw.a {
      public static final Codec<dff.c> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     lu.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                     bpv.a.fieldOf("weight").forGetter(bpw.a::a),
                     ayl.l.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                     ayl.l.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
                  )
                  .apply($$0, dff.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));
      public final btq<?> b;
      public final int c;
      public final int d;

      public c(btq<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, bpv.a($$1), $$2, $$3);
      }

      public c(btq<?> $$0, bpv $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bui.h ? btq.az : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public String toString() {
         return btq.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
