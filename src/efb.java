import java.util.Locale;
import javax.annotation.Nullable;

public interface efb {
   ia[] a = new ia[]{ia.e, ia.f, ia.a, ia.b, ia.c, ia.d};

   void a(ia var1, dip var2, hv var3, hv var4, int var5, int var6);

   void a(hv var1, cvz var2, hv var3);

   void a(dip var1, hv var2, cvz var3, hv var4, boolean var5);

   default void a(hv $$0, cvz $$1, @Nullable ia $$2) {
      for (ia $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(csz $$0, ia $$1, dip $$2, hv $$3, hv $$4, int $$5, int $$6) {
      dip $$7 = $$0.a_($$3);
      dip $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      cvz.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(csy $$0, dip $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", kb.e.b($$3), $$3.h(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + kb.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new y($$7);
      }
   }
}
