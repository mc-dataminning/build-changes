import java.util.Locale;
import javax.annotation.Nullable;

public interface eug {
   jn[] a = new jn[]{jn.e, jn.f, jn.a, jn.b, jn.c, jn.d};

   void a(jn var1, dwx var2, ji var3, ji var4, int var5, int var6);

   void a(ji var1, djm var2, @Nullable euh var3);

   void a(dwx var1, ji var2, djm var3, @Nullable euh var4, boolean var5);

   default void a(ji $$0, djm $$1, @Nullable jn $$2, @Nullable euh $$3) {
      for (jn $$4 : a) {
         if ($$4 != $$2) {
            this.a($$0.a($$4), $$1, null);
         }
      }
   }

   static void a(dgj $$0, jn $$1, ji $$2, ji $$3, dwx $$4, int $$5, int $$6) {
      dwx $$7 = $$0.a_($$2);
      if (($$5 & 128) == 0 || !$$7.a(djo.cE)) {
         dwx $$8 = $$7.a($$0, $$0, $$2, $$1, $$3, $$4, $$0.H_());
         djm.a($$7, $$8, $$0, $$2, $$5, $$6);
      }
   }

   static void a(dgi $$0, dwx $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", mb.e.b($$3), $$3.v(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + mb.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new z($$7);
      }
   }
}
