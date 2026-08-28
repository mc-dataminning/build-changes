import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cz(cx.c b, cx.c c, cx.c d, cx.c e, cx.c f, cx.c g, cx.c h) {
   public static final Codec<cz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cx.c.d.optionalFieldOf("x", cx.c.c).forGetter(cz::a),
               cx.c.d.optionalFieldOf("y", cx.c.c).forGetter(cz::b),
               cx.c.d.optionalFieldOf("z", cx.c.c).forGetter(cz::c),
               cx.c.d.optionalFieldOf("speed", cx.c.c).forGetter(cz::d),
               cx.c.d.optionalFieldOf("horizontal_speed", cx.c.c).forGetter(cz::e),
               cx.c.d.optionalFieldOf("vertical_speed", cx.c.c).forGetter(cz::f),
               cx.c.d.optionalFieldOf("fall_distance", cx.c.c).forGetter(cz::g)
            )
            .apply($$0, cz::new)
   );

   public static cz a(cx.c $$0) {
      return new cz(cx.c.c, cx.c.c, cx.c.c, $$0, cx.c.c, cx.c.c, cx.c.c);
   }

   public static cz b(cx.c $$0) {
      return new cz(cx.c.c, cx.c.c, cx.c.c, cx.c.c, $$0, cx.c.c, cx.c.c);
   }

   public static cz c(cx.c $$0) {
      return new cz(cx.c.c, cx.c.c, cx.c.c, cx.c.c, cx.c.c, $$0, cx.c.c);
   }

   public static cz d(cx.c $$0) {
      return new cz(cx.c.c, cx.c.c, cx.c.c, cx.c.c, cx.c.c, cx.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.b.d($$0) && this.c.d($$1) && this.d.d($$2)) {
         double $$4 = azq.f($$0, $$1, $$2);
         if (!this.e.e($$4)) {
            return false;
         } else {
            double $$5 = azq.e($$0, $$2);
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

   public cx.c a() {
      return this.b;
   }

   public cx.c b() {
      return this.c;
   }

   public cx.c c() {
      return this.d;
   }

   public cx.c d() {
      return this.e;
   }

   public cx.c e() {
      return this.f;
   }

   public cx.c f() {
      return this.g;
   }

   public cx.c g() {
      return this.h;
   }
}
