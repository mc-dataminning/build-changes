import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dl(dj.c b, dj.c c, dj.c d, dj.c e, dj.c f, dj.c g, dj.c h) {
   public static final Codec<dl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dj.c.d.optionalFieldOf("x", dj.c.c).forGetter(dl::a),
               dj.c.d.optionalFieldOf("y", dj.c.c).forGetter(dl::b),
               dj.c.d.optionalFieldOf("z", dj.c.c).forGetter(dl::c),
               dj.c.d.optionalFieldOf("speed", dj.c.c).forGetter(dl::d),
               dj.c.d.optionalFieldOf("horizontal_speed", dj.c.c).forGetter(dl::e),
               dj.c.d.optionalFieldOf("vertical_speed", dj.c.c).forGetter(dl::f),
               dj.c.d.optionalFieldOf("fall_distance", dj.c.c).forGetter(dl::g)
            )
            .apply($$0, dl::new)
   );

   public static dl a(dj.c $$0) {
      return new dl(dj.c.c, dj.c.c, dj.c.c, $$0, dj.c.c, dj.c.c, dj.c.c);
   }

   public static dl b(dj.c $$0) {
      return new dl(dj.c.c, dj.c.c, dj.c.c, dj.c.c, $$0, dj.c.c, dj.c.c);
   }

   public static dl c(dj.c $$0) {
      return new dl(dj.c.c, dj.c.c, dj.c.c, dj.c.c, dj.c.c, $$0, dj.c.c);
   }

   public static dl d(dj.c $$0) {
      return new dl(dj.c.c, dj.c.c, dj.c.c, dj.c.c, dj.c.c, dj.c.c, $$0);
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

   public dj.c a() {
      return this.b;
   }

   public dj.c b() {
      return this.c;
   }

   public dj.c c() {
      return this.d;
   }

   public dj.c d() {
      return this.e;
   }

   public dj.c e() {
      return this.f;
   }

   public dj.c f() {
      return this.g;
   }

   public dj.c g() {
      return this.h;
   }
}
