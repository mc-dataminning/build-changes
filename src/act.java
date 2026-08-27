import javax.annotation.Nullable;

public class act implements yb<aam> {
   public static final xs<uu, act> a = yb.a(act::a, act::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final eg.a f;
   private final eg.a g;
   private final boolean h;

   public act(eg.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public act(eg.a $$0, bow $$1, eg.a $$2) {
      this.f = $$0;
      this.e = $$1.aj();
      this.g = $$2;
      epr $$3 = $$2.a($$1);
      this.b = $$3.c;
      this.c = $$3.d;
      this.d = $$3.e;
      this.h = true;
   }

   private act(uu $$0) {
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

   private void a(uu $$0) {
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
   public yd<act> a() {
      return aex.ag;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public eg.a b() {
      return this.f;
   }

   @Nullable
   public epr a(cwz $$0) {
      if (this.h) {
         bow $$1 = $$0.a(this.e);
         return $$1 == null ? new epr(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new epr(this.b, this.c, this.d);
      }
   }
}
