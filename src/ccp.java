import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ccp extends cdd {
   private static final cgw d = cgw.b().a(8.0).d();
   protected final chw a;
   private final Class<? extends chw> e;
   protected final ash b;
   @Nullable
   protected chw c;
   private int f;
   private final double g;

   public ccp(chw $$0, double $$1) {
      this($$0, $$1, (Class<? extends chw>)$$0.getClass());
   }

   public ccp(chw $$0, double $$1, Class<? extends chw> $$2) {
      this.a = $$0;
      this.b = a($$0);
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(cdd.a.a, cdd.a.b));
   }

   @Override
   public boolean b() {
      if (!this.a.gy()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      return this.c.bL() && this.c.gy() && this.f < 60 && !this.c.gl();
   }

   @Override
   public void e() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void a() {
      this.a.H().a(this.c, 10.0F, (float)this.a.Z());
      this.a.L().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private chw h() {
      List<? extends chw> $$0 = this.b.a(this.e, d, this.a, this.a.cR().g(8.0));
      double $$1 = Double.MAX_VALUE;
      chw $$2 = null;

      for (chw $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gl() && this.a.g($$3) < $$1) {
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
