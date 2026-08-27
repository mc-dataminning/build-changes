import java.util.Locale;
import javax.annotation.Nullable;

public interface ebq {
   hc[] a = new hc[]{hc.e, hc.f, hc.a, hc.b, hc.c, hc.d};

   void a(hc var1, dfl var2, gw var3, gw var4, int var5, int var6);

   void a(gw var1, csx var2, gw var3);

   void a(dfl var1, gw var2, csx var3, gw var4, boolean var5);

   default void a(gw $$0, csx $$1, @Nullable hc $$2) {
      for (hc $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(cpy $$0, hc $$1, dfl $$2, gw $$3, gw $$4, int $$5, int $$6) {
      dfl $$7 = $$0.a_($$3);
      dfl $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      csx.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(cpx $$0, dfl $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", jd.f.b($$3), $$3.f(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + jd.f.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new y($$7);
      }
   }
}
