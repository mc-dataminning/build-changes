import java.util.List;

public class cdb<T extends buh & buk> extends cbc {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cdb(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return this.b.dS().ac().b(ddo.O) && this.h();
   }

   private boolean h() {
      return this.b.em() != null && this.b.em().ao() == btq.by && this.b.en() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.en();
      this.b.ad_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (buk)$$0).forEach(buk::ad_);
      }

      super.d();
   }

   private List<? extends buh> i() {
      double $$0 = this.b.h(bvm.m);
      exz $$1 = exz.a(this.b.dq()).c($$0, 10.0, $$0);
      return this.b.dS().a((Class<? extends buh>)this.b.getClass(), $$1, bto.f);
   }
}
