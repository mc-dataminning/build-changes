import java.util.List;

public class bua<T extends bli & bln> extends bsb {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public bua(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.dN().Y().b(crw.O) && this.h();
   }

   private boolean h() {
      return this.b.ei() != null && this.b.ei().ai() == bku.bt && this.b.ej() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.ej();
      this.b.aa_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bln)$$0).forEach(bln::aa_);
      }

      super.c();
   }

   private List<? extends bli> i() {
      double $$0 = this.b.b(bmm.g);
      ejp $$1 = ejp.a(this.b.dl()).c($$0, 10.0, $$0);
      return this.b.dN().a((Class<? extends bli>)this.b.getClass(), $$1, bkt.f);
   }
}
