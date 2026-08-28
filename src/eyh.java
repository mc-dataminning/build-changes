import java.util.Locale;
import javax.annotation.Nullable;

public interface eyh {
   jb[] a = new jb[]{jb.e, jb.f, jb.a, jb.b, jb.c, jb.d};

   void a(jb var1, eat var2, iv var3, iv var4, int var5, int var6);

   void a(iv var1, dmr var2, @Nullable eyi var3);

   void a(eat var1, iv var2, dmr var3, @Nullable eyi var4, boolean var5);

   default void a(iv $$0, dmr $$1, @Nullable jb $$2, @Nullable eyi $$3) {
      for (jb $$4 : a) {
         if ($$4 != $$2) {
            this.a($$0.a($$4), $$1, null);
         }
      }
   }

   static void a(djn $$0, jb $$1, iv $$2, iv $$3, eat $$4, int $$5, int $$6) {
      eat $$7 = $$0.a_($$2);
      if (($$5 & 128) == 0 || !$$7.a(dmt.cH)) {
         eat $$8 = $$7.a($$0, $$0, $$2, $$1, $$3, $$4, $$0.C_());
         dmr.a($$7, $$8, $$0, $$2, $$5, $$6);
      }
   }

   static void a(djm $$0, eat $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         p $$7 = p.a(var9, "Exception while updating neighbours");
         q $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", mg.e.b($$3), $$3.v(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + mg.e.b($$3);
            }
         });
         q.a($$8, $$0, $$2, $$1);
         throw new aa($$7);
      }
   }
}
