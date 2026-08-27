import java.util.List;

public class bsc<T extends bjk & bjp> extends bqd {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public bsc(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dL().X().b(cpt.K) && this.h();
   }

   private boolean h() {
      return this.b.eg() != null && this.b.eg().ag() == biw.bt && this.b.eh() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.eh();
      this.b.Y_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bjp)$$0).forEach(bjp::Y_);
      }

      super.c();
   }

   private List<? extends bjk> i() {
      double $$0 = this.b.b(bko.b);
      ehk $$1 = ehk.a(this.b.dj()).c($$0, 10.0, $$0);
      return this.b.dL().a((Class<? extends bjk>)this.b.getClass(), $$1, biv.f);
   }
}
