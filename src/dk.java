import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dk(di.c b, di.c c, di.c d, di.c e, di.c f, di.c g, di.c h) {
   public static final Codec<dk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               di.c.d.optionalFieldOf("x", di.c.c).forGetter(dk::a),
               di.c.d.optionalFieldOf("y", di.c.c).forGetter(dk::b),
               di.c.d.optionalFieldOf("z", di.c.c).forGetter(dk::c),
               di.c.d.optionalFieldOf("speed", di.c.c).forGetter(dk::d),
               di.c.d.optionalFieldOf("horizontal_speed", di.c.c).forGetter(dk::e),
               di.c.d.optionalFieldOf("vertical_speed", di.c.c).forGetter(dk::f),
               di.c.d.optionalFieldOf("fall_distance", di.c.c).forGetter(dk::g)
            )
            .apply($$0, dk::new)
   );

   public static dk a(di.c $$0) {
      return new dk(di.c.c, di.c.c, di.c.c, $$0, di.c.c, di.c.c, di.c.c);
   }

   public static dk b(di.c $$0) {
      return new dk(di.c.c, di.c.c, di.c.c, di.c.c, $$0, di.c.c, di.c.c);
   }

   public static dk c(di.c $$0) {
      return new dk(di.c.c, di.c.c, di.c.c, di.c.c, di.c.c, $$0, di.c.c);
   }

   public static dk d(di.c $$0) {
      return new dk(di.c.c, di.c.c, di.c.c, di.c.c, di.c.c, di.c.c, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.b.d($$0) && this.c.d($$1) && this.d.d($$2)) {
         double $$4 = azj.f($$0, $$1, $$2);
         if (!this.e.e($$4)) {
            return false;
         } else {
            double $$5 = azj.e($$0, $$2);
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

   public di.c a() {
      return this.b;
   }

   public di.c b() {
      return this.c;
   }

   public di.c c() {
      return this.d;
   }

   public di.c d() {
      return this.e;
   }

   public di.c e() {
      return this.f;
   }

   public di.c f() {
      return this.g;
   }

   public di.c g() {
      return this.h;
   }
}
