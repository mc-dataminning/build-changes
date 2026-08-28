import java.util.List;

public class cec<T extends bvh & bvk> extends ccd {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cec(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).O().b(dgc.P) && this.h();
   }

   private boolean h() {
      return this.b.eq() != null && this.b.eq().aq() == buq.bR && this.b.er() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.er();
      this.b.ad_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bvk)$$0).forEach(bvk::ad_);
      }

      super.d();
   }

   private List<? extends bvh> i() {
      double $$0 = this.b.h(bwn.m);
      fat $$1 = fat.a(this.b.du()).c($$0, 10.0, $$0);
      return this.b.dW().a((Class<? extends bvh>)this.b.getClass(), $$1, buo.f);
   }
}
