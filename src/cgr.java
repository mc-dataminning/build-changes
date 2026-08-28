import java.util.List;

public class cgr<T extends bxy & byb> extends ces {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cgr(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).O().c(djv.Q) && this.h();
   }

   private boolean h() {
      return this.b.er() != null && this.b.er().an() == bxe.bT && this.b.et() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.et();
      this.b.af_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (byb)$$0).forEach(byb::af_);
      }

      super.d();
   }

   private List<? extends bxy> i() {
      double $$0 = this.b.h(bzc.m);
      ffn $$1 = ffn.a(this.b.dt()).c($$0, 10.0, $$0);
      return this.b.dV().a((Class<? extends bxy>)this.b.getClass(), $$1, bxc.f);
   }
}
