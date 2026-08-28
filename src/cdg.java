import java.util.List;

public class cdg<T extends bum & bup> extends cbh {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cdg(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return this.b.dS().ac().b(dec.O) && this.h();
   }

   private boolean h() {
      return this.b.em() != null && this.b.em().ao() == btv.by && this.b.en() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.en();
      this.b.ad_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bup)$$0).forEach(bup::ad_);
      }

      super.d();
   }

   private List<? extends bum> i() {
      double $$0 = this.b.h(bvr.m);
      eyn $$1 = eyn.a(this.b.dq()).c($$0, 10.0, $$0);
      return this.b.dS().a((Class<? extends bum>)this.b.getClass(), $$1, btt.f);
   }
}
