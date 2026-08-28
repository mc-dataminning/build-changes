import java.util.Locale;
import javax.annotation.Nullable;

public interface eyx {
   jc[] a = new jc[]{jc.e, jc.f, jc.a, jc.b, jc.c, jc.d};

   void a(jc var1, ebg var2, iw var3, iw var4, int var5, int var6);

   void a(iw var1, dne var2, @Nullable eyy var3);

   void a(ebg var1, iw var2, dne var3, @Nullable eyy var4, boolean var5);

   default void a(iw $$0, dne $$1, @Nullable jc $$2, @Nullable eyy $$3) {
      for (jc $$4 : a) {
         if ($$4 != $$2) {
            this.a($$0.a($$4), $$1, null);
         }
      }
   }

   static void a(dka $$0, jc $$1, iw $$2, iw $$3, ebg $$4, int $$5, int $$6) {
      ebg $$7 = $$0.a_($$2);
      if (($$5 & 128) == 0 || !$$7.a(dng.cH)) {
         ebg $$8 = $$7.a($$0, $$0, $$2, $$1, $$3, $$4, $$0.G_());
         dne.a($$7, $$8, $$0, $$2, $$5, $$6);
      }
   }

   static void a(djz $$0, ebg $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         p $$7 = p.a(var9, "Exception while updating neighbours");
         q $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", mh.e.b($$3), $$3.v(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + mh.e.b($$3);
            }
         });
         q.a($$8, $$0, $$2, $$1);
         throw new aa($$7);
      }
   }
}
