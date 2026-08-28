import java.util.Locale;
import javax.annotation.Nullable;

public interface erw {
   jj[] a = new jj[]{jj.e, jj.f, jj.a, jj.b, jj.c, jj.d};

   void a(jj var1, duo var2, je var3, je var4, int var5, int var6);

   void a(je var1, dhj var2, @Nullable erx var3);

   void a(duo var1, je var2, dhj var3, @Nullable erx var4, boolean var5);

   default void a(je $$0, dhj $$1, @Nullable jj $$2, @Nullable erx $$3) {
      for (jj $$4 : a) {
         if ($$4 != $$2) {
            this.a($$0.a($$4), $$1, null);
         }
      }
   }

   static void a(deh $$0, jj $$1, duo $$2, je $$3, je $$4, int $$5, int $$6) {
      duo $$7 = $$0.a_($$3);
      if (($$5 & 128) == 0 || !$$2.a(dhl.cw)) {
         duo $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
         dhj.a($$7, $$8, $$0, $$3, $$5, $$6);
      }
   }

   static void a(deg $$0, duo $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
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
