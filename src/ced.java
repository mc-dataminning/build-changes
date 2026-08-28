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
      return a(this.b).O().b(dge.P) && this.h();
   }

   private boolean h() {
      return this.b.eq() != null && this.b.eq().aq() == bur.bS && this.b.er() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.er();
      this.b.ad_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bvl)$$0).forEach(bvl::ad_);
      }

      super.d();
   }

   private List<? extends bvi> i() {
      double $$0 = this.b.h(bwo.m);
      fav $$1 = fav.a(this.b.du()).c($$0, 10.0, $$0);
      return this.b.dW().a((Class<? extends bvi>)this.b.getClass(), $$1, bup.f);
   }
}
