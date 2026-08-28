import java.util.List;

public class cfd<T extends bwi & bwl> extends cde {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cfd(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).N().b(dhe.P) && this.h();
   }

   private boolean h() {
      return this.b.eq() != null && this.b.eq().aq() == bvr.bS && this.b.er() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.er();
      this.b.ae_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bwl)$$0).forEach(bwl::ae_);
      }

      super.d();
   }

   private List<? extends bwi> i() {
      double $$0 = this.b.h(bxo.m);
      fbt $$1 = fbt.a(this.b.du()).c($$0, 10.0, $$0);
      return this.b.dW().a((Class<? extends bwi>)this.b.getClass(), $$1, bvp.f);
   }
}
