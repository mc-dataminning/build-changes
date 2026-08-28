import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dg(de.c b, de.c c, de.c d, de.c e, de.c f, de.c g, de.c h) {
   public static final Codec<dg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               de.c.d.optionalFieldOf("x", de.c.c).forGetter(dg::a),
               de.c.d.optionalFieldOf("y", de.c.c).forGetter(dg::b),
               de.c.d.optionalFieldOf("z", de.c.c).forGetter(dg::c),
               de.c.d.optionalFieldOf("speed", de.c.c).forGetter(dg::d),
               de.c.d.optionalFieldOf("horizontal_speed", de.c.c).forGetter(dg::e),
               de.c.d.optionalFieldOf("vertical_speed", de.c.c).forGetter(dg::f),
               de.c.d.optionalFieldOf("fall_distance", de.c.c).forGetter(dg::g)
            )
            .apply($$0, dg::new)
   );

   public static dg a(de.c $$0) {
      return new dg(de.c.c, de.c.c, de.c.c, $$0, de.c.c, de.c.c, de.c.c);
   }

   public static dg b(de.c $$0) {
      return new dg(de.c.c, de.c.c, de.c.c, de.c.c, $$0, de.c.c, de.c.c);
   }

   public static dg c(de.c $$0) {
      return new dg(de.c.c, de.c.c, de.c.c, de.c.c, de.c.c, $$0, de.c.c);
   }

   public static dg d(de.c $$0) {
      return new dg(de.c.c, de.c.c, de.c.c, de.c.c, de.c.c, de.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.b.d($$0) && this.c.d($$1) && this.d.d($$2)) {
         double $$4 = ayg.f($$0, $$1, $$2);
         if (!this.e.e($$4)) {
            return false;
         } else {
            double $$5 = ayg.e($$0, $$2);
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

   public de.c a() {
      return this.b;
   }

   public de.c b() {
      return this.c;
   }

   public de.c c() {
      return this.d;
   }

   public de.c d() {
      return this.e;
   }

   public de.c e() {
      return this.f;
   }

   public de.c f() {
      return this.g;
   }

   public de.c g() {
      return this.h;
   }
}
