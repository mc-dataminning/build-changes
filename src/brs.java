import java.util.List;

public class brs<T extends bja & bjf> extends bpt {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public brs(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dK().X().b(cph.K) && this.h();
   }

   private boolean h() {
      return this.b.ef() != null && this.b.ef().ag() == bim.bt && this.b.eg() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.eg();
      this.b.T_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bjf)$$0).forEach(bjf::T_);
      }

      super.c();
   }

   private List<? extends bja> i() {
      double $$0 = this.b.b(bke.b);
      egy $$1 = egy.a(this.b.di()).c($$0, 10.0, $$0);
      return this.b.dK().a((Class<? extends bja>)this.b.getClass(), $$1, bil.f);
   }
}
