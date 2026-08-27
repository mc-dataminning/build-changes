import java.util.Locale;
import javax.annotation.Nullable;

public interface ebd {
   hb[] a = new hb[]{hb.e, hb.f, hb.a, hb.b, hb.c, hb.d};

   void a(hb var1, dey var2, gv var3, gv var4, int var5, int var6);

   void a(gv var1, csk var2, gv var3);

   void a(dey var1, gv var2, csk var3, gv var4, boolean var5);

   default void a(gv $$0, csk $$1, @Nullable hb $$2) {
      for (hb $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(cpl $$0, hb $$1, dey $$2, gv $$3, gv $$4, int $$5, int $$6) {
      dey $$7 = $$0.a_($$3);
      dey $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      csk.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(cpk $$0, dey $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", jc.f.b($$3), $$3.f(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + jc.f.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new y($$7);
      }
   }
}
