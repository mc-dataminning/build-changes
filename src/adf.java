import javax.annotation.Nullable;

public class adf implements yn<aay> {
   public static final ye<vg, adf> a = yn.a(adf::a, adf::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final eg.a f;
   private final eg.a g;
   private final boolean h;

   public adf(eg.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public adf(eg.a $$0, bpv $$1, eg.a $$2) {
      this.f = $$0;
      this.e = $$1.aj();
      this.g = $$2;
      esa $$3 = $$2.a($$1);
      this.b = $$3.c;
      this.c = $$3.d;
      this.d = $$3.e;
      this.h = true;
   }

   private adf(vg $$0) {
      this.f = $$0.b(eg.a.class);
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.h = $$0.readBoolean();
      if (this.h) {
         this.e = $$0.l();
         this.g = $$0.b(eg.a.class);
      } else {
         this.e = 0;
         this.g = null;
      }
   }

   private void a(vg $$0) {
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
   public yp<adf> a() {
      return afj.ag;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public eg.a b() {
      return this.f;
   }

   @Nullable
   public esa a(cyx $$0) {
      if (this.h) {
         bpv $$1 = $$0.a(this.e);
         return $$1 == null ? new esa(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new esa(this.b, this.c, this.d);
      }
   }
}
