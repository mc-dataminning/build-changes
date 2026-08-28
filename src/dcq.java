import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record dcq(List<dcq.a> c, float d, int e, boolean f) {
   public static final Codec<dcq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dcq.a.a.listOf().fieldOf("rules").forGetter(dcq::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(dcq::b),
               ayu.l.optionalFieldOf("damage_per_block", 1).forGetter(dcq::c),
               Codec.BOOL.optionalFieldOf("can_destroy_blocks_in_creative", true).forGetter(dcq::d)
            )
            .apply($$0, dcq::new)
   );
   public static final yw<wj, dcq> b = yw.a(dcq.a.b.a(yu.a()), dcq::a, yu.l, dcq::b, yu.h, dcq::c, yu.b, dcq::d, dcq::new);

   public float a(eat $$0) {
      for (dcq.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(eat $$0) {
      for (dcq.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<dcq.a> a() {
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

   public static record a(jj<dmr> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<dcq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ju.a(mh.i).fieldOf("blocks").forGetter(dcq.a::a),
                  ayu.o.optionalFieldOf("speed").forGetter(dcq.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(dcq.a::c)
               )
               .apply($$0, dcq.a::new)
      );
      public static final yw<wj, dcq.a> b = yw.a(yu.c(mh.i), dcq.a::a, yu.l.a(yu::a), dcq.a::b, yu.b.a(yu::a), dcq.a::c, dcq.a::new);

      public static dcq.a a(jj<dmr> $$0, float $$1) {
         return new dcq.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static dcq.a a(jj<dmr> $$0) {
         return new dcq.a($$0, Optional.empty(), Optional.of(false));
      }

      public static dcq.a b(jj<dmr> $$0, float $$1) {
         return new dcq.a($$0, Optional.of($$1), Optional.empty());
      }

      public jj<dmr> a() {
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
