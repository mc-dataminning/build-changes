import java.util.Locale;
import javax.annotation.Nullable;

public interface ehy {
   ie[] a = new ie[]{ie.e, ie.f, ie.a, ie.b, ie.c, ie.d};

   void a(ie var1, dlj var2, hz var3, hz var4, int var5, int var6);

   void a(hz var1, cys var2, hz var3);

   void a(dlj var1, hz var2, cys var3, hz var4, boolean var5);

   default void a(hz $$0, cys $$1, @Nullable ie $$2) {
      for (ie $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(cvs $$0, ie $$1, dlj $$2, hz $$3, hz $$4, int $$5, int $$6) {
      dlj $$7 = $$0.a_($$3);
      dlj $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      cys.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(cvr $$0, dlj $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", kf.e.b($$3), $$3.h(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + kf.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new y($$7);
      }
   }
}
