import javax.annotation.Nullable;

public class adh implements yp<aba> {
   public static final yg<vi, adh> a = yp.a(adh::a, adh::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final eh.a f;
   private final eh.a g;
   private final boolean h;

   public adh(eh.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public adh(eh.a $$0, bqa $$1, eh.a $$2) {
      this.f = $$0;
      this.e = $$1.aj();
      this.g = $$2;
      esj $$3 = $$2.a($$1);
      this.b = $$3.c;
      this.c = $$3.d;
      this.d = $$3.e;
      this.h = true;
   }

   private adh(vi $$0) {
      this.f = $$0.b(eh.a.class);
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.h = $$0.readBoolean();
      if (this.h) {
         this.e = $$0.l();
         this.g = $$0.b(eh.a.class);
      } else {
         this.e = 0;
         this.g = null;
      }
   }

   private void a(vi $$0) {
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
   public yr<adh> a() {
      return afl.ag;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public eh.a b() {
      return this.f;
   }

   @Nullable
   public esj a(czg $$0) {
      if (this.h) {
         bqa $$1 = $$0.a(this.e);
         return $$1 == null ? new esj(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new esj(this.b, this.c, this.d);
      }
   }
}
