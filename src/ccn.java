import java.util.List;

public class ccn<T extends bts & btw> extends cao {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public ccn(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dP().ab().b(dbv.O) && this.h();
   }

   private boolean h() {
      return this.b.em() != null && this.b.em().ak() == btb.by && this.b.en() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.en();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (btw)$$0).forEach(btw::aa_);
      }

      super.c();
   }

   private List<? extends bts> i() {
      double $$0 = this.b.g(buy.k);
      evn $$1 = evn.a(this.b.dn()).c($$0, 10.0, $$0);
      return this.b.dP().a((Class<? extends bts>)this.b.getClass(), $$1, bta.f);
   }
}
