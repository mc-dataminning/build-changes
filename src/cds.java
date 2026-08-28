import java.util.List;

public class cds<T extends bux & bva> extends cbt {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cds(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return this.b.dX().ac().b(der.O) && this.h();
   }

   private boolean h() {
      return this.b.es() != null && this.b.es().aq() == bug.by && this.b.et() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.et();
      this.b.af_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bva)$$0).forEach(bva::af_);
      }

      super.d();
   }

   private List<? extends bux> i() {
      double $$0 = this.b.h(bwd.m);
      ezc $$1 = ezc.a(this.b.dv()).c($$0, 10.0, $$0);
      return this.b.dX().a((Class<? extends bux>)this.b.getClass(), $$1, bue.f);
   }
}
