import java.util.Locale;
import javax.annotation.Nullable;

public interface eri {
   jj[] a = new jj[]{jj.e, jj.f, jj.a, jj.b, jj.c, jj.d};

   void a(jj var1, dua var2, je var3, je var4, int var5, int var6);

   void a(je var1, dgv var2, @Nullable erj var3);

   void a(dua var1, je var2, dgv var3, @Nullable erj var4, boolean var5);

   default void a(je $$0, dgv $$1, @Nullable jj $$2, @Nullable erj $$3) {
      for (jj $$4 : a) {
         if ($$4 != $$2) {
            this.a($$0.a($$4), $$1, null);
         }
      }
   }

   static void a(ddt $$0, jj $$1, dua $$2, je $$3, je $$4, int $$5, int $$6) {
      dua $$7 = $$0.a_($$3);
      dua $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      dgv.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(dds $$0, dua $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", lu.e.b($$3), $$3.g(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + lu.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new z($$7);
      }
   }
}
