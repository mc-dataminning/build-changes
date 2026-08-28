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
      return this.b.dO().ab().b(dcs.O) && this.h();
   }

   private boolean h() {
      return this.b.ei() != null && this.b.ei().am() == bsx.by && this.b.ej() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.ej();
      this.b.ae_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (btt)$$0).forEach(btt::ae_);
      }

      super.d();
   }

   private List<? extends btp> i() {
      double $$0 = this.b.g(buw.m);
      ewx $$1 = ewx.a(this.b.dm()).c($$0, 10.0, $$0);
      return this.b.dO().a((Class<? extends btp>)this.b.getClass(), $$1, bsw.f);
   }
}
