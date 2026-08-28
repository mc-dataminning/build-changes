import java.util.List;

public class ccj<T extends btn & btr> extends cak {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public ccj(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return this.b.dQ().ab().b(dcq.O) && this.h();
   }

   private boolean h() {
      return this.b.ej() != null && this.b.ej().am() == bsw.by && this.b.ek() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.ek();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (btr)$$0).forEach(btr::aa_);
      }

      super.d();
   }

   private List<? extends btn> i() {
      double $$0 = this.b.g(buu.m);
      ewr $$1 = ewr.a(this.b.do()).c($$0, 10.0, $$0);
      return this.b.dQ().a((Class<? extends btn>)this.b.getClass(), $$1, bsv.f);
   }
}
