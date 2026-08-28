import javax.annotation.Nullable;

public class aep implements zw<aci> {
   public static final zn<wm, aep> a = zw.a(aep::a, aep::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final fb.a f;
   private final fb.a g;
   private final boolean h;

   public aep(fb.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public aep(fb.a $$0, bsw $$1, fb.a $$2) {
      this.f = $$0;
      this.e = $$1.al();
      this.g = $$2;
      evt $$3 = $$2.a($$1);
      this.b = $$3.c;
      this.c = $$3.d;
      this.d = $$3.e;
      this.h = true;
   }

   private aep(wm $$0) {
      this.f = $$0.b(fb.a.class);
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.h = $$0.readBoolean();
      if (this.h) {
         this.e = $$0.l();
         this.g = $$0.b(fb.a.class);
      } else {
         this.e = 0;
         this.g = null;
      }
   }

   private void a(wm $$0) {
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
   public zy<aep> a() {
      return agu.ag;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public fb.a b() {
      return this.f;
   }

   @Nullable
   public evt a(dca $$0) {
      if (this.h) {
         bsw $$1 = $$0.a(this.e);
         return $$1 == null ? new evt(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new evt(this.b, this.c, this.d);
      }
   }
}
