import java.util.Locale;
import javax.annotation.Nullable;

public interface ebi {
   ha[] a = new ha[]{ha.e, ha.f, ha.a, ha.b, ha.c, ha.d};

   void a(ha var1, dfd var2, gw var3, gw var4, int var5, int var6);

   void a(gw var1, ctc var2, gw var3);

   void a(dfd var1, gw var2, ctc var3, gw var4, boolean var5);

   default void a(gw $$0, ctc $$1, @Nullable ha $$2) {
      for (ha $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(cqc $$0, ha $$1, dfd $$2, gw $$3, gw $$4, int $$5, int $$6) {
      dfd $$7 = $$0.a_($$3);
      dfd $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      ctc.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(cqb $$0, dfd $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", jb.f.b($$3), $$3.h(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + jb.f.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new y($$7);
      }
   }
}
