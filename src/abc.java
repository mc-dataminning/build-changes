import javax.annotation.Nullable;

public class abc implements xd<yx> {
   private final double a;
   private final double b;
   private final double c;
   private final int d;
   private final ee.a e;
   private final ee.a f;
   private final boolean g;

   public abc(ee.a $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = 0;
      this.g = false;
      this.f = null;
   }

   public abc(ee.a $$0, blp $$1, ee.a $$2) {
      this.e = $$0;
      this.d = $$1.aj();
      this.f = $$2;
      elm $$3 = $$2.a($$1);
      this.a = $$3.c;
      this.b = $$3.d;
      this.c = $$3.e;
      this.g = true;
   }

   public abc(ug $$0) {
      this.e = $$0.b(ee.a.class);
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.g = $$0.readBoolean();
      if (this.g) {
         this.d = $$0.n();
         this.f = $$0.b(ee.a.class);
      } else {
         this.d = 0;
         this.f = null;
      }
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.e);
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.g);
      if (this.g) {
         $$0.c(this.d);
         $$0.a(this.f);
      }
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public ee.a a() {
      return this.e;
   }

   @Nullable
   public elm a(cti $$0) {
      if (this.g) {
         blp $$1 = $$0.a(this.d);
         return $$1 == null ? new elm(this.a, this.b, this.c) : this.f.a($$1);
      } else {
         return new elm(this.a, this.b, this.c);
      }
   }
}
