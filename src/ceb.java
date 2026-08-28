import java.util.List;

public class ceb<T extends bvg & bvj> extends ccc {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public ceb(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return this.b.dY().ac().b(dfb.O) && this.h();
   }

   private boolean h() {
      return this.b.et() != null && this.b.et().ar() == bup.by && this.b.eu() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.eu();
      this.b.af_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bvj)$$0).forEach(bvj::af_);
      }

      super.d();
   }

   private List<? extends bvg> i() {
      double $$0 = this.b.h(bwm.m);
      ezm $$1 = ezm.a(this.b.dw()).c($$0, 10.0, $$0);
      return this.b.dY().a((Class<? extends bvg>)this.b.getClass(), $$1, bun.f);
   }
}
