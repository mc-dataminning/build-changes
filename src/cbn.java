import java.util.List;

public class cbn<T extends bss & bsw> extends bzo {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cbn(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dP().aa().b(dav.O) && this.h();
   }

   private boolean h() {
      return this.b.em() != null && this.b.em().ak() == bsc.by && this.b.en() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.en();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bsw)$$0).forEach(bsw::aa_);
      }

      super.c();
   }

   private List<? extends bss> i() {
      double $$0 = this.b.g(bty.k);
      euh $$1 = euh.a(this.b.dn()).c($$0, 10.0, $$0);
      return this.b.dP().a((Class<? extends bss>)this.b.getClass(), $$1, bsb.f);
   }
}
