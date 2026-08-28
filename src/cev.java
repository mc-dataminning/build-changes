import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cev extends cfe {
   private final cij a;
   @Nullable
   private bwg b;
   private final cgx c = cgx.a().a(64.0);

   public cev(cij $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cde.a.d));
   }

   @Override
   public boolean b() {
      fbt $$0 = this.a.cR().c(10.0, 8.0, 10.0);
      ash $$1 = a(this.a);
      List<? extends bwg> $$2 = $$1.a(cpj.class, this.c, this.a, $$0);
      List<cpx> $$3 = $$1.a(this.c, this.a, $$0);

      for (bwg $$4 : $$2) {
         cpj $$5 = (cpj)$$4;

         for (cpx $$6 : $$3) {
            int $$7 = $$5.f($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cpx) || !this.b.aa_() && !((cpx)this.b).b();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
