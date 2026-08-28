import java.util.Locale;
import javax.annotation.Nullable;

public interface eyc {
   jb[] a = new jb[]{jb.e, jb.f, jb.a, jb.b, jb.c, jb.d};

   void a(jb var1, eao var2, iv var3, iv var4, int var5, int var6);

   void a(iv var1, dmm var2, @Nullable eyd var3);

   void a(eao var1, iv var2, dmm var3, @Nullable eyd var4, boolean var5);

   default void a(iv $$0, dmm $$1, @Nullable jb $$2, @Nullable eyd $$3) {
      for (jb $$4 : a) {
         if ($$4 != $$2) {
            this.a($$0.a($$4), $$1, null);
         }
      }
   }

   static void a(dji $$0, jb $$1, iv $$2, iv $$3, eao $$4, int $$5, int $$6) {
      eao $$7 = $$0.a_($$2);
      if (($$5 & 128) == 0 || !$$7.a(dmo.cH)) {
         eao $$8 = $$7.a($$0, $$0, $$2, $$1, $$3, $$4, $$0.C_());
         dmm.a($$7, $$8, $$0, $$2, $$5, $$6);
      }
   }

   static void a(djh $$0, eao $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         p $$7 = p.a(var9, "Exception while updating neighbours");
         q $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", mg.e.b($$3), $$3.v(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + mg.e.b($$3);
            }
         });
         q.a($$8, $$0, $$2, $$1);
         throw new aa($$7);
      }
   }
}
