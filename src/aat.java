import javax.annotation.Nullable;

public class aat implements wu<yo> {
   private final double a;
   private final double b;
   private final double c;
   private final int d;
   private final ed.a e;
   private final ed.a f;
   private final boolean g;

   public aat(ed.a $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = 0;
      this.g = false;
      this.f = null;
   }

   public aat(ed.a $$0, blf $$1, ed.a $$2) {
      this.e = $$0;
      this.d = $$1.aj();
      this.f = $$2;
      elb $$3 = $$2.a($$1);
      this.a = $$3.c;
      this.b = $$3.d;
      this.c = $$3.e;
      this.g = true;
   }

   public aat(ue $$0) {
      this.e = $$0.b(ed.a.class);
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.g = $$0.readBoolean();
      if (this.g) {
         this.d = $$0.n();
         this.f = $$0.b(ed.a.class);
      } else {
         this.d = 0;
         this.f = null;
      }
   }

   @Override
   public void a(ue $$0) {
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

   public void a(yo $$0) {
      $$0.a(this);
   }

   public ed.a a() {
      return this.e;
   }

   @Nullable
   public elb a(csy $$0) {
      if (this.g) {
         blf $$1 = $$0.a(this.d);
         return $$1 == null ? new elb(this.a, this.b, this.c) : this.f.a($$1);
      } else {
         return new elb(this.a, this.b, this.c);
      }
   }
}
