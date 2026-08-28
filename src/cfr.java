import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cfr extends cga {
   private final cjk a;
   @Nullable
   private bxe b;
   private final cht c = cht.a().a(64.0);

   public cfr(cjk $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cea.a.d));
   }

   @Override
   public boolean b() {
      fel $$0 = this.a.cR().c(10.0, 8.0, 10.0);
      arq $$1 = a(this.a);
      List<? extends bxe> $$2 = $$1.a(cqo.class, this.c, this.a, $$0);
      List<crc> $$3 = $$1.a(this.c, this.a, $$0);

      for (bxe $$4 : $$2) {
         cqo $$5 = (cqo)$$4;

         for (crc $$6 : $$3) {
            int $$7 = $$5.f($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      if (this.b == null) {
         return false;
      } else {
         if (this.b instanceof crc $$8 && ($$8.V_() || $$8.b())) {
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
