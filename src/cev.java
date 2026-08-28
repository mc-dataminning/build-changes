import java.util.List;

public class cev<T extends bwa & bwd> extends ccw {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cev(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).O().b(dgv.P) && this.h();
   }

   private boolean h() {
      return this.b.ep() != null && this.b.ep().aq() == bvi.bR && this.b.er() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.er();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bwd)$$0).forEach(bwd::aa_);
      }

      super.d();
   }

   private List<? extends bwa> i() {
      double $$0 = this.b.h(bxg.m);
      fbs $$1 = fbs.a(this.b.ds()).c($$0, 10.0, $$0);
      return this.b.dU().a((Class<? extends bwa>)this.b.getClass(), $$1, bvg.f);
   }
}
