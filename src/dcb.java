import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record dcb(List<dcb.a> c, float d, int e, boolean f) {
   public static final Codec<dcb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dcb.a.a.listOf().fieldOf("rules").forGetter(dcb::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(dcb::b),
               ayu.l.optionalFieldOf("damage_per_block", 1).forGetter(dcb::c),
               Codec.BOOL.optionalFieldOf("can_destroy_blocks_in_creative", true).forGetter(dcb::d)
            )
            .apply($$0, dcb::new)
   );
   public static final yw<wj, dcb> b = yw.a(dcb.a.b.a(yu.a()), dcb::a, yu.l, dcb::b, yu.h, dcb::c, yu.b, dcb::d, dcb::new);

   public float a(dzz $$0) {
      for (dcb.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dzz $$0) {
      for (dcb.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<dcb.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }

   public static record a(ji<dma> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<dcb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jt.a(mg.i).fieldOf("blocks").forGetter(dcb.a::a),
                  ayu.o.optionalFieldOf("speed").forGetter(dcb.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(dcb.a::c)
               )
               .apply($$0, dcb.a::new)
      );
      public static final yw<wj, dcb.a> b = yw.a(yu.c(mg.i), dcb.a::a, yu.l.a(yu::a), dcb.a::b, yu.b.a(yu::a), dcb.a::c, dcb.a::new);

      public static dcb.a a(ji<dma> $$0, float $$1) {
         return new dcb.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static dcb.a a(ji<dma> $$0) {
         return new dcb.a($$0, Optional.empty(), Optional.of(false));
      }

      public static dcb.a b(ji<dma> $$0, float $$1) {
         return new dcb.a($$0, Optional.of($$1), Optional.empty());
      }

      public ji<dma> a() {
         return this.c;
      }

      public Optional<Float> b() {
         return this.d;
      }

      public Optional<Boolean> c() {
         return this.e;
      }
   }
}
