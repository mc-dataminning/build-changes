import java.util.Locale;
import javax.annotation.Nullable;

public interface eqc {
   ji[] a = new ji[]{ji.e, ji.f, ji.a, ji.b, ji.c, ji.d};

   void a(ji var1, dta var2, jd var3, jd var4, int var5, int var6);

   void a(jd var1, dfw var2, jd var3);

   void a(dta var1, jd var2, dfw var3, jd var4, boolean var5);

   default void a(jd $$0, dfw $$1, @Nullable ji $$2) {
      for (ji $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(dcv $$0, ji $$1, dta $$2, jd $$3, jd $$4, int $$5, int $$6) {
      dta $$7 = $$0.a_($$3);
      dta $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      dfw.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(dcu $$0, dta $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", lt.e.b($$3), $$3.g(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + lt.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new z($$7);
      }
   }
}
