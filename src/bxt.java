import java.util.List;

public class bxt<T extends boz & bpd> extends bvu {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public bxt(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dJ().Z().b(cwa.O) && this.h();
   }

   private boolean h() {
      return this.b.eg() != null && this.b.eg().ai() == bol.bw && this.b.eh() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.eh();
      this.b.ab_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bpd)$$0).forEach(bpd::ab_);
      }

      super.c();
   }

   private List<? extends boz> i() {
      double $$0 = this.b.g(bqe.i);
      eoq $$1 = eoq.a(this.b.dh()).c($$0, 10.0, $$0);
      return this.b.dJ().a((Class<? extends boz>)this.b.getClass(), $$1, bok.f);
   }
}
