import java.util.Locale;
import javax.annotation.Nullable;

public interface edz {
   ib[] a = new ib[]{ib.e, ib.f, ib.a, ib.b, ib.c, ib.d};

   void a(ib var1, dhn var2, hx var3, hx var4, int var5, int var6);

   void a(hx var1, cvf var2, hx var3);

   void a(dhn var1, hx var2, cvf var3, hx var4, boolean var5);

   default void a(hx $$0, cvf $$1, @Nullable ib $$2) {
      for (ib $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(csg $$0, ib $$1, dhn $$2, hx $$3, hx $$4, int $$5, int $$6) {
      dhn $$7 = $$0.a_($$3);
      dhn $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      cvf.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(csf $$0, dhn $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", kc.f.b($$3), $$3.h(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + kc.f.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new y($$7);
      }
   }
}
