import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record dah(List<dah.a> c, float d, int e, boolean f) {
   public static final Codec<dah> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dah.a.a.listOf().fieldOf("rules").forGetter(dah::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(dah::b),
               ayi.l.optionalFieldOf("damage_per_block", 1).forGetter(dah::c),
               Codec.BOOL.optionalFieldOf("can_destroy_blocks_in_creative", true).forGetter(dah::d)
            )
            .apply($$0, dah::new)
   );
   public static final yn<wa, dah> b = yn.a(dah.a.b.a(yl.a()), dah::a, yl.l, dah::b, yl.h, dah::c, yl.b, dah::d, dah::new);

   public float a(dxq $$0) {
      for (dah.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dxq $$0) {
      for (dah.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<dah.a> a() {
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

   public static record a(jv<dke> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<dah.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kg.a(mc.f).fieldOf("blocks").forGetter(dah.a::a),
                  ayi.o.optionalFieldOf("speed").forGetter(dah.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(dah.a::c)
               )
               .apply($$0, dah.a::new)
      );
      public static final yn<wa, dah.a> b = yn.a(yl.c(mc.f), dah.a::a, yl.l.a(yl::a), dah.a::b, yl.b.a(yl::a), dah.a::c, dah.a::new);

      public static dah.a a(jv<dke> $$0, float $$1) {
         return new dah.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static dah.a a(jv<dke> $$0) {
         return new dah.a($$0, Optional.empty(), Optional.of(false));
      }

      public static dah.a b(jv<dke> $$0, float $$1) {
         return new dah.a($$0, Optional.of($$1), Optional.empty());
      }

      public jv<dke> a() {
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
