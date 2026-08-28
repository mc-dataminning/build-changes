import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cgj extends cgs {
   private final ckc a;
   @Nullable
   private bxw b;
   private final cil c = cil.a().a(64.0);

   public cgj(ckc $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(ces.a.d));
   }

   @Override
   public boolean b() {
      ffn $$0 = this.a.cR().c(10.0, 8.0, 10.0);
      aru $$1 = a(this.a);
      List<? extends bxw> $$2 = $$1.a(crl.class, this.c, this.a, $$0);
      List<crz> $$3 = $$1.a(this.c, this.a, $$0);

      for (bxw $$4 : $$2) {
         crl $$5 = (crl)$$4;

         for (crz $$6 : $$3) {
            int $$7 = $$5.f($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      if (this.b == null) {
         return false;
      } else {
         if (this.b instanceof crz $$8 && ($$8.Z_() || $$8.b())) {
            return false;
         }

         return true;
      }
   }

   @Override
   public void d() {
      this.a.g(this.b);
      super.d();
   }
}
