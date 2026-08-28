import javax.annotation.Nullable;

public class aep implements zr<acg> {
   public static final zi<wh, aep> a = zr.a(aep::a, aep::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final fi.a f;
   private final fi.a g;
   private final boolean h;

   public aep(fi.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public aep(fi.a $$0, bvb $$1, fi.a $$2) {
      this.f = $$0;
      this.e = $$1.ar();
      this.g = $$2;
      fbr $$3 = $$2.a($$1);
      this.b = $$3.d;
      this.c = $$3.e;
      this.d = $$3.f;
      this.h = true;
   }

   private aep(wh $$0) {
      this.f = $$0.b(fi.a.class);
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.h = $$0.readBoolean();
      if (this.h) {
         this.e = $$0.l();
         this.g = $$0.b(fi.a.class);
      } else {
         this.e = 0;
         this.g = null;
      }
   }

   private void a(wh $$0) {
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
   public zt<aep> a() {
      return agz.ah;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public fi.a b() {
      return this.f;
   }

   @Nullable
   public fbr a(dgz $$0) {
      if (this.h) {
         bvb $$1 = $$0.a(this.e);
         return $$1 == null ? new fbr(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new fbr(this.b, this.c, this.d);
      }
   }
}
