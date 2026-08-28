import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cy(cw.c b, cw.c c, cw.c d, cw.c e, cw.c f, cw.c g, cw.c h) {
   public static final Codec<cy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cw.c.d.optionalFieldOf("x", cw.c.c).forGetter(cy::a),
               cw.c.d.optionalFieldOf("y", cw.c.c).forGetter(cy::b),
               cw.c.d.optionalFieldOf("z", cw.c.c).forGetter(cy::c),
               cw.c.d.optionalFieldOf("speed", cw.c.c).forGetter(cy::d),
               cw.c.d.optionalFieldOf("horizontal_speed", cw.c.c).forGetter(cy::e),
               cw.c.d.optionalFieldOf("vertical_speed", cw.c.c).forGetter(cy::f),
               cw.c.d.optionalFieldOf("fall_distance", cw.c.c).forGetter(cy::g)
            )
            .apply($$0, cy::new)
   );

   public static cy a(cw.c $$0) {
      return new cy(cw.c.c, cw.c.c, cw.c.c, $$0, cw.c.c, cw.c.c, cw.c.c);
   }

   public static cy b(cw.c $$0) {
      return new cy(cw.c.c, cw.c.c, cw.c.c, cw.c.c, $$0, cw.c.c, cw.c.c);
   }

   public static cy c(cw.c $$0) {
      return new cy(cw.c.c, cw.c.c, cw.c.c, cw.c.c, cw.c.c, $$0, cw.c.c);
   }

   public static cy d(cw.c $$0) {
      return new cy(cw.c.c, cw.c.c, cw.c.c, cw.c.c, cw.c.c, cw.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.b.d($$0) && this.c.d($$1) && this.d.d($$2)) {
         double $$4 = azm.f($$0, $$1, $$2);
         if (!this.e.e($$4)) {
            return false;
         } else {
            double $$5 = azm.e($$0, $$2);
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

   public cw.c a() {
      return this.b;
   }

   public cw.c b() {
      return this.c;
   }

   public cw.c c() {
      return this.d;
   }

   public cw.c d() {
      return this.e;
   }

   public cw.c e() {
      return this.f;
   }

   public cw.c f() {
      return this.g;
   }

   public cw.c g() {
      return this.h;
   }
}
