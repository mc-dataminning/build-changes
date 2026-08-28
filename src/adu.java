import javax.annotation.Nullable;

public class adu implements yw<abl> {
   public static final yn<vl, adu> a = yw.a(adu::a, adu::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final fj.a f;
   private final fj.a g;
   private final boolean h;

   public adu(fj.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public adu(fj.a $$0, bul $$1, fj.a $$2) {
      this.f = $$0;
      this.e = $$1.ar();
      this.g = $$2;
      fba $$3 = $$2.a($$1);
      this.b = $$3.d;
      this.c = $$3.e;
      this.d = $$3.f;
      this.h = true;
   }

   private adu(vl $$0) {
      this.f = $$0.b(fj.a.class);
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.h = $$0.readBoolean();
      if (this.h) {
         this.e = $$0.l();
         this.g = $$0.b(fj.a.class);
      } else {
         this.e = 0;
         this.g = null;
      }
   }

   private void a(vl $$0) {
      $$0.a(this.f);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.h);
      if (this.h) {
         $$0.c(this.e);
         $$0.a(this.g);
      }
   }

   @Override
   public yy<adu> a() {
      return age.ah;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public fj.a b() {
      return this.f;
   }

   @Nullable
   public fba a(dgi $$0) {
      if (this.h) {
         bul $$1 = $$0.a(this.e);
         return $$1 == null ? new fba(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new fba(this.b, this.c, this.d);
      }
   }
}
