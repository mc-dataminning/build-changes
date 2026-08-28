import java.util.List;

public class ced<T extends bvi & bvl> extends cce {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public ced(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).O().b(dgd.P) && this.h();
   }

   private boolean h() {
      return this.b.ep() != null && this.b.ep().aq() == bur.bR && this.b.eq() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.eq();
      this.b.ad_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bvl)$$0).forEach(bvl::ad_);
      }

      super.d();
   }

   private List<? extends bvi> i() {
      double $$0 = this.b.h(bwo.m);
      fau $$1 = fau.a(this.b.dt()).c($$0, 10.0, $$0);
      return this.b.dV().a((Class<? extends bvi>)this.b.getClass(), $$1, bup.f);
   }
}
