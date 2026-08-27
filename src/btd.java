import java.util.List;

public class btd<T extends bkl & bkq> extends bre {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public btd(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dL().X().b(cqv.L) && this.h();
   }

   private boolean h() {
      return this.b.eg() != null && this.b.eg().ag() == bjx.bt && this.b.eh() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.eh();
      this.b.Z_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bkq)$$0).forEach(bkq::Z_);
      }

      super.c();
   }

   private List<? extends bkl> i() {
      double $$0 = this.b.b(blp.g);
      eia $$1 = eia.a(this.b.dj()).c($$0, 10.0, $$0);
      return this.b.dL().a((Class<? extends bkl>)this.b.getClass(), $$1, bjw.f);
   }
}
