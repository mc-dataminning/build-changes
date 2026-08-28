import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dm(dk.c b, dk.c c, dk.c d, dk.c e, dk.c f, dk.c g, dk.c h) {
   public static final Codec<dm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dk.c.d.optionalFieldOf("x", dk.c.c).forGetter(dm::a),
               dk.c.d.optionalFieldOf("y", dk.c.c).forGetter(dm::b),
               dk.c.d.optionalFieldOf("z", dk.c.c).forGetter(dm::c),
               dk.c.d.optionalFieldOf("speed", dk.c.c).forGetter(dm::d),
               dk.c.d.optionalFieldOf("horizontal_speed", dk.c.c).forGetter(dm::e),
               dk.c.d.optionalFieldOf("vertical_speed", dk.c.c).forGetter(dm::f),
               dk.c.d.optionalFieldOf("fall_distance", dk.c.c).forGetter(dm::g)
            )
            .apply($$0, dm::new)
   );

   public static dm a(dk.c $$0) {
      return new dm(dk.c.c, dk.c.c, dk.c.c, $$0, dk.c.c, dk.c.c, dk.c.c);
   }

   public static dm b(dk.c $$0) {
      return new dm(dk.c.c, dk.c.c, dk.c.c, dk.c.c, $$0, dk.c.c, dk.c.c);
   }

   public static dm c(dk.c $$0) {
      return new dm(dk.c.c, dk.c.c, dk.c.c, dk.c.c, dk.c.c, $$0, dk.c.c);
   }

   public static dm d(dk.c $$0) {
      return new dm(dk.c.c, dk.c.c, dk.c.c, dk.c.c, dk.c.c, dk.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.b.d($$0) && this.c.d($$1) && this.d.d($$2)) {
         double $$4 = ayz.f($$0, $$1, $$2);
         if (!this.e.e($$4)) {
            return false;
         } else {
            double $$5 = ayz.e($$0, $$2);
            if (!this.f.e($$5)) {
               return false;
            } else {
               double $$6 = Math.abs($$1);
               return !this.g.d($$6) ? false : this.h.d($$3);
            }
         }
      } else {
         return false;
      }
   }

   public dk.c a() {
      return this.b;
   }

   public dk.c b() {
      return this.c;
   }

   public dk.c c() {
      return this.d;
   }

   public dk.c d() {
      return this.e;
   }

   public dk.c e() {
      return this.f;
   }

   public dk.c f() {
      return this.g;
   }

   public dk.c g() {
      return this.h;
   }
}
