import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bur extends bvf {
   private static final byy d = byy.b().a(8.0).d();
   protected final bzx a;
   private final Class<? extends bzx> e;
   protected final cvr b;
   @Nullable
   protected bzx c;
   private int f;
   private final double g;

   public bur(bzx $$0, double $$1) {
      this($$0, $$1, (Class<? extends bzx>)$$0.getClass());
   }

   public bur(bzx $$0, double $$1, Class<? extends bzx> $$2) {
      this.a = $$0;
      this.b = $$0.dM();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(bvf.a.a, bvf.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.gk()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bx() && this.c.gk() && this.f < 60 && !this.c.gd();
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
   private bzx h() {
      List<? extends bzx> $$0 = this.b.a(this.e, d, this.a, this.a.cH().g(8.0));
      double $$1 = Double.MAX_VALUE;
      bzx $$2 = null;

      for (bzx $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gd() && this.a.f($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.f($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((aow)this.b, this.c);
   }
}
