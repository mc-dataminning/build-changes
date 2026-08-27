import java.util.Locale;
import javax.annotation.Nullable;

public interface ebe {
   ha[] a = new ha[]{ha.e, ha.f, ha.a, ha.b, ha.c, ha.d};

   void a(ha var1, dez var2, gu var3, gu var4, int var5, int var6);

   void a(gu var1, csl var2, gu var3);

   void a(dez var1, gu var2, csl var3, gu var4, boolean var5);

   default void a(gu $$0, csl $$1, @Nullable ha $$2) {
      for (ha $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(cpm $$0, ha $$1, dez $$2, gu $$3, gu $$4, int $$5, int $$6) {
      dez $$7 = $$0.a_($$3);
      dez $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      csl.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(cpl $$0, dez $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", jb.f.b($$3), $$3.f(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + jb.f.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new y($$7);
      }
   }
}
