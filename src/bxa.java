import java.util.List;

public class bxa<T extends boi & bom> extends bvb {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public bxa(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dM().Z().b(cvj.O) && this.h();
   }

   private boolean h() {
      return this.b.ei() != null && this.b.ei().ai() == bnu.bw && this.b.ej() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ej();
      this.b.ab_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bom)$$0).forEach(bom::ab_);
      }

      super.c();
   }

   private List<? extends boi> i() {
      double $$0 = this.b.g(bpl.i);
      enn $$1 = enn.a(this.b.dk()).c($$0, 10.0, $$0);
      return this.b.dM().a((Class<? extends boi>)this.b.getClass(), $$1, bnt.f);
   }
}
