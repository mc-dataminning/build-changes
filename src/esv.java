import java.util.Locale;
import javax.annotation.Nullable;

public interface esv {
   jm[] a = new jm[]{jm.e, jm.f, jm.a, jm.b, jm.c, jm.d};

   void a(jm var1, dvo var2, jh var3, jh var4, int var5, int var6);

   void a(jh var1, dij var2, @Nullable esw var3);

   void a(dvo var1, jh var2, dij var3, @Nullable esw var4, boolean var5);

   default void a(jh $$0, dij $$1, @Nullable jm $$2, @Nullable esw $$3) {
      for (jm $$4 : a) {
         if ($$4 != $$2) {
            this.a($$0.a($$4), $$1, null);
         }
      }
   }

   static void a(dfg $$0, jm $$1, jh $$2, jh $$3, dvo $$4, int $$5, int $$6) {
      dvo $$7 = $$0.a_($$2);
      if (($$5 & 128) == 0 || !$$7.a(dil.cw)) {
         dvo $$8 = $$7.a($$0, $$0, $$2, $$1, $$3, $$4, $$0.E_());
         dij.a($$7, $$8, $$0, $$2, $$5, $$6);
      }
   }

   static void a(dff $$0, dvo $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", lz.e.b($$3), $$3.v(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + lz.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new z($$7);
      }
   }
}
