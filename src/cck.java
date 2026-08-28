import java.util.List;

public class cck<T extends btp & btt> extends cal {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cck(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dP().ab().b(dbs.O) && this.h();
   }

   private boolean h() {
      return this.b.em() != null && this.b.em().ak() == bsy.by && this.b.en() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.en();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (btt)$$0).forEach(btt::aa_);
      }

      super.c();
   }

   private List<? extends btp> i() {
      double $$0 = this.b.g(buv.k);
      evk $$1 = evk.a(this.b.dn()).c($$0, 10.0, $$0);
      return this.b.dP().a((Class<? extends btp>)this.b.getClass(), $$1, bsx.f);
   }
}
