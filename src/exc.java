import java.util.Locale;
import javax.annotation.Nullable;

public interface exc {
   ja[] a = new ja[]{ja.e, ja.f, ja.a, ja.b, ja.c, ja.d};

   void a(ja var1, dzo var2, iu var3, iu var4, int var5, int var6);

   void a(iu var1, dlu var2, @Nullable exd var3);

   void a(dzo var1, iu var2, dlu var3, @Nullable exd var4, boolean var5);

   default void a(iu $$0, dlu $$1, @Nullable ja $$2, @Nullable exd $$3) {
      for (ja $$4 : a) {
         if ($$4 != $$2) {
            this.a($$0.a($$4), $$1, null);
         }
      }
   }

   static void a(diq $$0, ja $$1, iu $$2, iu $$3, dzo $$4, int $$5, int $$6) {
      dzo $$7 = $$0.a_($$2);
      if (($$5 & 128) == 0 || !$$7.a(dlw.cE)) {
         dzo $$8 = $$7.a($$0, $$0, $$2, $$1, $$3, $$4, $$0.C_());
         dlu.a($$7, $$8, $$0, $$2, $$5, $$6);
      }
   }

   static void a(dip $$0, dzo $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", mf.e.b($$3), $$3.v(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + mf.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new z($$7);
      }
   }
}
