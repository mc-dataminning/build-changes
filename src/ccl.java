import java.util.List;

public class ccl<T extends btp & btt> extends cam {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public ccl(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return this.b.dP().ab().b(dcs.O) && this.h();
   }

   private boolean h() {
      return this.b.ej() != null && this.b.ej().am() == bsx.by && this.b.ek() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.ek();
      this.b.ae_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (btt)$$0).forEach(btt::ae_);
      }

      super.d();
   }

   private List<? extends btp> i() {
      double $$0 = this.b.g(buw.m);
      ewv $$1 = ewv.a(this.b.dn()).c($$0, 10.0, $$0);
      return this.b.dP().a((Class<? extends btp>)this.b.getClass(), $$1, bsw.f);
   }
}
