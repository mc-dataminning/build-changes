import java.util.Locale;
import javax.annotation.Nullable;

public interface esl {
   jl[] a = new jl[]{jl.e, jl.f, jl.a, jl.b, jl.c, jl.d};

   void a(jl var1, dvd var2, jg var3, jg var4, int var5, int var6);

   void a(jg var1, dhy var2, @Nullable esm var3);

   void a(dvd var1, jg var2, dhy var3, @Nullable esm var4, boolean var5);

   default void a(jg $$0, dhy $$1, @Nullable jl $$2, @Nullable esm $$3) {
      for (jl $$4 : a) {
         if ($$4 != $$2) {
            this.a($$0.a($$4), $$1, null);
         }
      }
   }

   static void a(dew $$0, jl $$1, jg $$2, jg $$3, dvd $$4, int $$5, int $$6) {
      dvd $$7 = $$0.a_($$2);
      if (($$5 & 128) == 0 || !$$7.a(dia.cw)) {
         dvd $$8 = $$7.a($$1, $$4, $$0, $$2, $$3);
         dhy.a($$7, $$8, $$0, $$2, $$5, $$6);
      }
   }

   static void a(dev $$0, dvd $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         o $$7 = o.a(var9, "Exception while updating neighbours");
         p $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", lx.e.b($$3), $$3.v(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + lx.e.b($$3);
            }
         });
         p.a($$8, $$0, $$2, $$1);
         throw new z($$7);
      }
   }
}
