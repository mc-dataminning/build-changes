import java.util.List;

public class cbz<T extends bte & bti> extends caa {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cbz(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dR().ab().b(dcc.O) && this.h();
   }

   private boolean h() {
      return this.b.ek() != null && this.b.ek().am() == bsn.by && this.b.el() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.el();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bti)$$0).forEach(bti::aa_);
      }

      super.c();
   }

   private List<? extends bte> i() {
      double $$0 = this.b.g(buk.m);
      ewc $$1 = ewc.a(this.b.dp()).c($$0, 10.0, $$0);
      return this.b.dR().a((Class<? extends bte>)this.b.getClass(), $$1, bsm.f);
   }
}
