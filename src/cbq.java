import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cbq extends cce {
   private static final cfx d = cfx.b().a(8.0).d();
   protected final cgx a;
   private final Class<? extends cgx> e;
   protected final arc b;
   @Nullable
   protected cgx c;
   private int f;
   private final double g;

   public cbq(cgx $$0, double $$1) {
      this($$0, $$1, (Class<? extends cgx>)$$0.getClass());
   }

   public cbq(cgx $$0, double $$1, Class<? extends cgx> $$2) {
      this.a = $$0;
      this.b = a($$0);
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(cce.a.a, cce.a.b));
   }

   @Override
   public boolean b() {
      if (!this.a.gz()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      return this.c.bL() && this.c.gz() && this.f < 60 && !this.c.gm();
   }

   @Override
   public void e() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void a() {
      this.a.H().a(this.c, 10.0F, (float)this.a.aa());
      this.a.L().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private cgx h() {
      List<? extends cgx> $$0 = this.b.a(this.e, d, this.a, this.a.cR().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cgx $$2 = null;

      for (cgx $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gm() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a(this.b, this.c);
   }
}
