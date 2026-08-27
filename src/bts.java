import java.util.List;

public class bts<T extends bla & blf> extends brt {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public bts(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dL().X().b(cro.O) && this.h();
   }

   private boolean h() {
      return this.b.eg() != null && this.b.eg().ag() == bkm.bt && this.b.eh() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.eh();
      this.b.Z_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (blf)$$0).forEach(blf::Z_);
      }

      super.c();
   }

   private List<? extends bla> i() {
      double $$0 = this.b.b(bme.g);
      ejd $$1 = ejd.a(this.b.dj()).c($$0, 10.0, $$0);
      return this.b.dL().a((Class<? extends bla>)this.b.getClass(), $$1, bkl.f);
   }
}
