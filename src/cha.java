import java.util.List;

public class cha<T extends byh & byk> extends cfb {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cha(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).O().c(dkf.Q) && this.h();
   }

   private boolean h() {
      return this.b.er() != null && this.b.er().an() == bxn.bT && this.b.et() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.et();
      this.b.ag_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (byk)$$0).forEach(byk::ag_);
      }

      super.d();
   }

   private List<? extends byh> i() {
      double $$0 = this.b.h(bzl.m);
      ffx $$1 = ffx.a(this.b.dt()).c($$0, 10.0, $$0);
      return this.b.dV().a((Class<? extends byh>)this.b.getClass(), $$1, bxl.f);
   }
}
