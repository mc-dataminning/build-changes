import javax.annotation.Nullable;

public class adx implements ze<abq> {
   public static final yv<vx, adx> a = ze.a(adx::a, adx::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final eq.a f;
   private final eq.a g;
   private final boolean h;

   public adx(eq.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public adx(eq.a $$0, brw $$1, eq.a $$2) {
      this.f = $$0;
      this.e = $$1.al();
      this.g = $$2;
      eum $$3 = $$2.a($$1);
      this.b = $$3.c;
      this.c = $$3.d;
      this.d = $$3.e;
      this.h = true;
   }

   private adx(vx $$0) {
      this.f = $$0.b(eq.a.class);
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.h = $$0.readBoolean();
      if (this.h) {
         this.e = $$0.l();
         this.g = $$0.b(eq.a.class);
      } else {
         this.e = 0;
         this.g = null;
      }
   }

   private void a(vx $$0) {
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
   public zg<adx> a() {
      return agc.ag;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public eq.a b() {
      return this.f;
   }

   @Nullable
   public eum a(daz $$0) {
      if (this.h) {
         brw $$1 = $$0.a(this.e);
         return $$1 == null ? new eum(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new eum(this.b, this.c, this.d);
      }
   }
}
