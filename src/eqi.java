import java.util.Locale;
import javax.annotation.Nullable;

public interface eqi {
   ji[] a = new ji[]{ji.e, ji.f, ji.a, ji.b, ji.c, ji.d};

   void a(ji var1, dtc var2, jd var3, jd var4, int var5, int var6);

   void a(jd var1, dfy var2, jd var3);

   void a(dtc var1, jd var2, dfy var3, jd var4, boolean var5);

   default void a(jd $$0, dfy $$1, @Nullable ji $$2) {
      for (ji $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(dcx $$0, ji $$1, dtc $$2, jd $$3, jd $$4, int $$5, int $$6) {
      dtc $$7 = $$0.a_($$3);
      dtc $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      dfy.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(dcw $$0, dtc $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
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
