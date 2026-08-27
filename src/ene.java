import java.util.Locale;
import javax.annotation.Nullable;

public interface ene {
   is[] a = new is[]{is.e, is.f, is.a, is.b, is.c, is.d};

   void a(is var1, dqh var2, in var3, in var4, int var5, int var6);

   void a(in var1, dde var2, in var3);

   void a(dqh var1, in var2, dde var3, in var4, boolean var5);

   default void a(in $$0, dde $$1, @Nullable is $$2) {
      for (is $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(dae $$0, is $$1, dqh $$2, in $$3, in $$4, int $$5, int $$6) {
      dqh $$7 = $$0.a_($$3);
      dqh $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      dde.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(dad $$0, dqh $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", ld.e.b($$3), $$3.g(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + ld.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new y($$7);
      }
   }
}
