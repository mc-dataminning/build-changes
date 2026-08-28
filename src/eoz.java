import java.util.Locale;
import javax.annotation.Nullable;

public interface eoz {
   je[] a = new je[]{je.e, je.f, je.a, je.b, je.c, je.d};

   void a(je var1, dsc var2, iz var3, iz var4, int var5, int var6);

   void a(iz var1, dez var2, iz var3);

   void a(dsc var1, iz var2, dez var3, iz var4, boolean var5);

   default void a(iz $$0, dez $$1, @Nullable je $$2) {
      for (je $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(dbz $$0, je $$1, dsc $$2, iz $$3, iz $$4, int $$5, int $$6) {
      dsc $$7 = $$0.a_($$3);
      dsc $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      dez.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(dby $$0, dsc $$1, iz $$2, dez $$3, iz $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", lp.e.b($$3), $$3.g(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + lp.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new y($$7);
      }
   }
}
