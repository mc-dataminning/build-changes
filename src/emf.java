import java.util.Locale;
import javax.annotation.Nullable;

public interface emf {
   ij[] a = new ij[]{ij.e, ij.f, ij.a, ij.b, ij.c, ij.d};

   void a(ij var1, dpi var2, id var3, id var4, int var5, int var6);

   void a(id var1, dch var2, id var3);

   void a(dpi var1, id var2, dch var3, id var4, boolean var5);

   default void a(id $$0, dch $$1, @Nullable ij $$2) {
      for (ij $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(czh $$0, ij $$1, dpi $$2, id $$3, id $$4, int $$5, int $$6) {
      dpi $$7 = $$0.a_($$3);
      dpi $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      dch.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(czg $$0, dpi $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", kt.e.b($$3), $$3.g(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + kt.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new y($$7);
      }
   }
}
