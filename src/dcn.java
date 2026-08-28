import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record dcn(List<dcn.a> c, float d, int e, boolean f) {
   public static final Codec<dcn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dcn.a.a.listOf().fieldOf("rules").forGetter(dcn::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(dcn::b),
               ayu.l.optionalFieldOf("damage_per_block", 1).forGetter(dcn::c),
               Codec.BOOL.optionalFieldOf("can_destroy_blocks_in_creative", true).forGetter(dcn::d)
            )
            .apply($$0, dcn::new)
   );
   public static final yw<wj, dcn> b = yw.a(dcn.a.b.a(yu.a()), dcn::a, yu.l, dcn::b, yu.h, dcn::c, yu.b, dcn::d, dcn::new);

   public float a(eao $$0) {
      for (dcn.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(eao $$0) {
      for (dcn.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<dcn.a> a() {
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

   public static record a(jj<dmm> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<dcn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ju.a(mh.i).fieldOf("blocks").forGetter(dcn.a::a),
                  ayu.o.optionalFieldOf("speed").forGetter(dcn.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(dcn.a::c)
               )
               .apply($$0, dcn.a::new)
      );
      public static final yw<wj, dcn.a> b = yw.a(yu.c(mh.i), dcn.a::a, yu.l.a(yu::a), dcn.a::b, yu.b.a(yu::a), dcn.a::c, dcn.a::new);

      public static dcn.a a(jj<dmm> $$0, float $$1) {
         return new dcn.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static dcn.a a(jj<dmm> $$0) {
         return new dcn.a($$0, Optional.empty(), Optional.of(false));
      }

      public static dcn.a b(jj<dmm> $$0, float $$1) {
         return new dcn.a($$0, Optional.of($$1), Optional.empty());
      }

      public jj<dmm> a() {
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
