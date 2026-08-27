import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bsw extends btk {
   private static final bxd d = bxd.b().a(8.0).d();
   protected final byc a;
   private final Class<? extends byc> e;
   protected final ctx b;
   @Nullable
   protected byc c;
   private int f;
   private final double g;

   public bsw(byc $$0, double $$1) {
      this($$0, $$1, (Class<? extends byc>)$$0.getClass());
   }

   public bsw(byc $$0, double $$1, Class<? extends byc> $$2) {
      this.a = $$0;
      this.b = $$0.dL();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(btk.a.a, btk.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.gj()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bx() && this.c.gj() && this.f < 60 && !this.c.gc();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void e() {
      this.a.I().a(this.c, 10.0F, (float)this.a.ab());
      this.a.N().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.f(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private byc h() {
      List<? extends byc> $$0 = this.b.a(this.e, d, this.a, this.a.cH().g(8.0));
      double $$1 = Double.MAX_VALUE;
      byc $$2 = null;

      for (byc $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gc() && this.a.f($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.f($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((ane)this.b, this.c);
   }
}
