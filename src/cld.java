import java.util.List;
import javax.annotation.Nullable;

public class cld extends cmc {
   public static final String a = "StoredEnchantments";

   public cld(cmc.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cmh $$0) {
      return true;
   }

   @Override
   public boolean d_(cmh $$0) {
      return false;
   }

   public static sp d(cmh $$0) {
      sj $$1 = $$0.v();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new sp();
   }

   @Override
   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
      super.a($$0, $$1, $$2, $$3);
      cmh.a($$2, d($$0));
   }

   public static void a(cmh $$0, cqv $$1) {
      sp $$2 = d($$0);
      boolean $$3 = true;
      agt $$4 = cqu.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         sj $$6 = $$2.a($$5);
         agt $$7 = cqu.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cqu.a($$6) < $$1.b) {
               cqu.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cqu.a($$4, $$1.b));
      }

      $$0.w().a("StoredEnchantments", $$2);
   }

   public static cmh a(cqv $$0) {
      cmh $$1 = new cmh(cmk.up);
      a($$1, $$0);
      return $$1;
   }
}
