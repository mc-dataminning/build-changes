import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cbp extends ccd {
   private static final cfw d = cfw.b().a(8.0).d();
   protected final cgw a;
   private final Class<? extends cgw> e;
   protected final arc b;
   @Nullable
   protected cgw c;
   private int f;
   private final double g;

   public cbp(cgw $$0, double $$1) {
      this($$0, $$1, (Class<? extends cgw>)$$0.getClass());
   }

   public cbp(cgw $$0, double $$1, Class<? extends cgw> $$2) {
      this.a = $$0;
      this.b = a($$0);
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(ccd.a.a, ccd.a.b));
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
   private cgw h() {
      List<? extends cgw> $$0 = this.b.a(this.e, d, this.a, this.a.cR().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cgw $$2 = null;

      for (cgw $$3 : $$0) {
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
