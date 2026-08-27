import java.util.List;

public class bou<T extends bgb & bgg> extends bmv {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public bou(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dI().X().b(cmi.K) && this.h();
   }

   private boolean h() {
      return this.b.ed() != null && this.b.ed().ae() == bfn.bt && this.b.ee() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ee();
      this.b.T_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bgg)$$0).forEach(bgg::T_);
      }

      super.c();
   }

   private List<? extends bgb> i() {
      double $$0 = this.b.b(bhg.b);
      eed $$1 = eed.a(this.b.dg()).c($$0, 10.0, $$0);
      return this.b.dI().a((Class<? extends bgb>)this.b.getClass(), $$1, bfm.f);
   }
}
