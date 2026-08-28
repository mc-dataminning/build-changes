import java.util.List;

public class cco<T extends btt & btx> extends cap {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cco(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dP().ab().b(dbw.O) && this.h();
   }

   private boolean h() {
      return this.b.em() != null && this.b.em().ak() == btc.by && this.b.en() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.en();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (btx)$$0).forEach(btx::aa_);
      }

      super.c();
   }

   private List<? extends btt> i() {
      double $$0 = this.b.g(buz.k);
      evo $$1 = evo.a(this.b.dn()).c($$0, 10.0, $$0);
      return this.b.dP().a((Class<? extends btt>)this.b.getClass(), $$1, btb.f);
   }
}
