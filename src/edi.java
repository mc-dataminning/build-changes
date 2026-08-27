import java.util.Locale;
import javax.annotation.Nullable;

public interface edi {
   hx[] a = new hx[]{hx.e, hx.f, hx.a, hx.b, hx.c, hx.d};

   void a(hx var1, dgw var2, ht var3, ht var4, int var5, int var6);

   void a(ht var1, cut var2, ht var3);

   void a(dgw var1, ht var2, cut var3, ht var4, boolean var5);

   default void a(ht $$0, cut $$1, @Nullable hx $$2) {
      for (hx $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(crt $$0, hx $$1, dgw $$2, ht $$3, ht $$4, int $$5, int $$6) {
      dgw $$7 = $$0.a_($$3);
      dgw $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      cut.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(crs $$0, dgw $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", jy.f.b($$3), $$3.h(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + jy.f.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new y($$7);
      }
   }
}
