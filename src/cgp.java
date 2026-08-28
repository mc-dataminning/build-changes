import java.util.List;

public class cgp<T extends bxw & bxz> extends ceq {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cgp(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).O().c(djt.Q) && this.h();
   }

   private boolean h() {
      return this.b.er() != null && this.b.er().an() == bxc.bT && this.b.et() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.et();
      this.b.af_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bxz)$$0).forEach(bxz::af_);
      }

      super.d();
   }

   private List<? extends bxw> i() {
      double $$0 = this.b.h(bza.m);
      ffl $$1 = ffl.a(this.b.dt()).c($$0, 10.0, $$0);
      return this.b.dV().a((Class<? extends bxw>)this.b.getClass(), $$1, bxa.f);
   }
}
