import java.util.Locale;
import javax.annotation.Nullable;

public interface emv {
   ir[] a = new ir[]{ir.e, ir.f, ir.a, ir.b, ir.c, ir.d};

   void a(ir var1, dpy var2, im var3, im var4, int var5, int var6);

   void a(im var1, dcv var2, im var3);

   void a(dpy var1, im var2, dcv var3, im var4, boolean var5);

   default void a(im $$0, dcv $$1, @Nullable ir $$2) {
      for (ir $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(czv $$0, ir $$1, dpy $$2, im $$3, im $$4, int $$5, int $$6) {
      dpy $$7 = $$0.a_($$3);
      dpy $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      dcv.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(czu $$0, dpy $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", lc.e.b($$3), $$3.g(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + lc.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new y($$7);
      }
   }
}
