import java.util.List;

public class cdx<T extends bvc & bvf> extends cby {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cdx(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return this.b.dX().ac().b(dex.O) && this.h();
   }

   private boolean h() {
      return this.b.es() != null && this.b.es().ar() == bul.by && this.b.et() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.et();
      this.b.af_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bvf)$$0).forEach(bvf::af_);
      }

      super.d();
   }

   private List<? extends bvc> i() {
      double $$0 = this.b.h(bwi.m);
      ezi $$1 = ezi.a(this.b.dv()).c($$0, 10.0, $$0);
      return this.b.dX().a((Class<? extends bvc>)this.b.getClass(), $$1, buj.f);
   }
}
