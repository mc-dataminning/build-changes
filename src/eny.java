import java.util.Locale;
import javax.annotation.Nullable;

public interface eny {
   it[] a = new it[]{it.e, it.f, it.a, it.b, it.c, it.d};

   void a(it var1, drb var2, io var3, io var4, int var5, int var6);

   void a(io var1, ddy var2, io var3);

   void a(drb var1, io var2, ddy var3, io var4, boolean var5);

   default void a(io $$0, ddy $$1, @Nullable it $$2) {
      for (it $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(day $$0, it $$1, drb $$2, io $$3, io $$4, int $$5, int $$6) {
      drb $$7 = $$0.a_($$3);
      drb $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      ddy.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(dax $$0, drb $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", le.e.b($$3), $$3.g(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + le.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new y($$7);
      }
   }
}
