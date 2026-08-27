import java.util.Locale;
import javax.annotation.Nullable;

public interface ejp {
   ih[] a = new ih[]{ih.e, ih.f, ih.a, ih.b, ih.c, ih.d};

   void a(ih var1, dmz var2, ib var3, ib var4, int var5, int var6);

   void a(ib var1, daa var2, ib var3);

   void a(dmz var1, ib var2, daa var3, ib var4, boolean var5);

   default void a(ib $$0, daa $$1, @Nullable ih $$2) {
      for (ih $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }
   }

   static void a(cxa $$0, ih $$1, dmz $$2, ib $$3, ib $$4, int $$5, int $$6) {
      dmz $$7 = $$0.a_($$3);
      dmz $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      daa.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(cwz $$0, dmz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", ki.e.b($$3), $$3.g(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + ki.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new y($$7);
      }
   }
}
