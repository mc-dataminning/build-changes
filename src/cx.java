import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cx(cv.c b, cv.c c, cv.c d, cv.c e, cv.c f, cv.c g, cv.c h) {
   public static final Codec<cx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cv.c.d.optionalFieldOf("x", cv.c.c).forGetter(cx::a),
               cv.c.d.optionalFieldOf("y", cv.c.c).forGetter(cx::b),
               cv.c.d.optionalFieldOf("z", cv.c.c).forGetter(cx::c),
               cv.c.d.optionalFieldOf("speed", cv.c.c).forGetter(cx::d),
               cv.c.d.optionalFieldOf("horizontal_speed", cv.c.c).forGetter(cx::e),
               cv.c.d.optionalFieldOf("vertical_speed", cv.c.c).forGetter(cx::f),
               cv.c.d.optionalFieldOf("fall_distance", cv.c.c).forGetter(cx::g)
            )
            .apply($$0, cx::new)
   );

   public static cx a(cv.c $$0) {
      return new cx(cv.c.c, cv.c.c, cv.c.c, $$0, cv.c.c, cv.c.c, cv.c.c);
   }

   public static cx b(cv.c $$0) {
      return new cx(cv.c.c, cv.c.c, cv.c.c, cv.c.c, $$0, cv.c.c, cv.c.c);
   }

   public static cx c(cv.c $$0) {
      return new cx(cv.c.c, cv.c.c, cv.c.c, cv.c.c, cv.c.c, $$0, cv.c.c);
   }

   public static cx d(cv.c $$0) {
      return new cx(cv.c.c, cv.c.c, cv.c.c, cv.c.c, cv.c.c, cv.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.b.d($$0) && this.c.d($$1) && this.d.d($$2)) {
         double $$4 = azk.f($$0, $$1, $$2);
         if (!this.e.e($$4)) {
            return false;
         } else {
            double $$5 = azk.e($$0, $$2);
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

   public cv.c a() {
      return this.b;
   }

   public cv.c b() {
      return this.c;
   }

   public cv.c c() {
      return this.d;
   }

   public cv.c d() {
      return this.e;
   }

   public cv.c e() {
      return this.f;
   }

   public cv.c f() {
      return this.g;
   }

   public cv.c g() {
      return this.h;
   }
}
