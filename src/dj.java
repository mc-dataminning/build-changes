import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dj(dh.c b, dh.c c, dh.c d, dh.c e, dh.c f, dh.c g, dh.c h) {
   public static final Codec<dj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dh.c.d.optionalFieldOf("x", dh.c.c).forGetter(dj::a),
               dh.c.d.optionalFieldOf("y", dh.c.c).forGetter(dj::b),
               dh.c.d.optionalFieldOf("z", dh.c.c).forGetter(dj::c),
               dh.c.d.optionalFieldOf("speed", dh.c.c).forGetter(dj::d),
               dh.c.d.optionalFieldOf("horizontal_speed", dh.c.c).forGetter(dj::e),
               dh.c.d.optionalFieldOf("vertical_speed", dh.c.c).forGetter(dj::f),
               dh.c.d.optionalFieldOf("fall_distance", dh.c.c).forGetter(dj::g)
            )
            .apply($$0, dj::new)
   );

   public static dj a(dh.c $$0) {
      return new dj(dh.c.c, dh.c.c, dh.c.c, $$0, dh.c.c, dh.c.c, dh.c.c);
   }

   public static dj b(dh.c $$0) {
      return new dj(dh.c.c, dh.c.c, dh.c.c, dh.c.c, $$0, dh.c.c, dh.c.c);
   }

   public static dj c(dh.c $$0) {
      return new dj(dh.c.c, dh.c.c, dh.c.c, dh.c.c, dh.c.c, $$0, dh.c.c);
   }

   public static dj d(dh.c $$0) {
      return new dj(dh.c.c, dh.c.c, dh.c.c, dh.c.c, dh.c.c, dh.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.b.d($$0) && this.c.d($$1) && this.d.d($$2)) {
         double $$4 = azd.f($$0, $$1, $$2);
         if (!this.e.e($$4)) {
            return false;
         } else {
            double $$5 = azd.e($$0, $$2);
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

   public dh.c a() {
      return this.b;
   }

   public dh.c b() {
      return this.c;
   }

   public dh.c c() {
      return this.d;
   }

   public dh.c d() {
      return this.e;
   }

   public dh.c e() {
      return this.f;
   }

   public dh.c f() {
      return this.g;
   }

   public dh.c g() {
      return this.h;
   }
}
