import java.util.List;

public class bvj<T extends bmq & bmv> extends btk {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public bvj(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dL().Z().b(ctt.O) && this.h();
   }

   private boolean h() {
      return this.b.eh() != null && this.b.eh().ai() == bmc.bw && this.b.ei() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ei();
      this.b.ab_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bmv)$$0).forEach(bmv::ab_);
      }

      super.c();
   }

   private List<? extends bmq> i() {
      double $$0 = this.b.g(bnu.i);
      elx $$1 = elx.a(this.b.dj()).c($$0, 10.0, $$0);
      return this.b.dL().a((Class<? extends bmq>)this.b.getClass(), $$1, bmb.f);
   }
}
