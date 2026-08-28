import java.util.Locale;
import javax.annotation.Nullable;

public interface epf {
   jf[] a = new jf[]{jf.e, jf.f, jf.a, jf.b, jf.c, jf.d};

   void a(jf var1, dsh var2, ja var3, ja var4, int var5, int var6);

   void a(ja var1, dff var2, ja var3);

   void a(dsh var1, ja var2, dff var3, ja var4, boolean var5);

   default void a(ja $$0, dff $$1, @Nullable jf $$2) {
      for (jf $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(dce $$0, jf $$1, dsh $$2, ja $$3, ja $$4, int $$5, int $$6) {
      dsh $$7 = $$0.a_($$3);
      dsh $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      dff.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(dcd $$0, dsh $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", lq.e.b($$3), $$3.g(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + lq.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new y($$7);
      }
   }
}
