import java.util.Locale;
import javax.annotation.Nullable;

public interface esa {
   jk[] a = new jk[]{jk.e, jk.f, jk.a, jk.b, jk.c, jk.d};

   void a(jk var1, dus var2, jf var3, jf var4, int var5, int var6);

   void a(jf var1, dhm var2, @Nullable esb var3);

   void a(dus var1, jf var2, dhm var3, @Nullable esb var4, boolean var5);

   default void a(jf $$0, dhm $$1, @Nullable jk $$2, @Nullable esb $$3) {
      for (jk $$4 : a) {
         if ($$4 != $$2) {
            this.a($$0.a($$4), $$1, null);
         }
      }
   }

   static void a(dek $$0, jk $$1, jf $$2, jf $$3, dus $$4, int $$5, int $$6) {
      dus $$7 = $$0.a_($$2);
      if (($$5 & 128) == 0 || !$$7.a(dho.cw)) {
         dus $$8 = $$7.a($$1, $$4, $$0, $$2, $$3);
         dhm.a($$7, $$8, $$0, $$2, $$5, $$6);
      }
   }

   static void a(dej $$0, dus $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", lv.e.b($$3), $$3.v(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + lv.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new z($$7);
      }
   }
}
