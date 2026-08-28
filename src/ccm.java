import java.util.List;

public class ccm<T extends btr & btv> extends can {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public ccm(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dP().ab().b(dbu.O) && this.h();
   }

   private boolean h() {
      return this.b.em() != null && this.b.em().ak() == bta.by && this.b.en() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.en();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (btv)$$0).forEach(btv::aa_);
      }

      super.c();
   }

   private List<? extends btr> i() {
      double $$0 = this.b.g(bux.k);
      evm $$1 = evm.a(this.b.dn()).c($$0, 10.0, $$0);
      return this.b.dP().a((Class<? extends btr>)this.b.getClass(), $$1, bsz.f);
   }
}
