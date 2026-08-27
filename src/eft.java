import java.util.Locale;
import javax.annotation.Nullable;

public interface eft {
   ic[] a = new ic[]{ic.e, ic.f, ic.a, ic.b, ic.c, ic.d};

   void a(ic var1, djh var2, hx var3, hx var4, int var5, int var6);

   void a(hx var1, cwq var2, hx var3);

   void a(djh var1, hx var2, cwq var3, hx var4, boolean var5);

   default void a(hx $$0, cwq $$1, @Nullable ic $$2) {
      for (ic $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(ctq $$0, ic $$1, djh $$2, hx $$3, hx $$4, int $$5, int $$6) {
      djh $$7 = $$0.a_($$3);
      djh $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      cwq.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(ctp $$0, djh $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", kd.e.b($$3), $$3.h(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + kd.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new y($$7);
      }
   }
}
