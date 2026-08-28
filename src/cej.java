import javax.annotation.Nullable;

public class cej {
   @Nullable
   public static exa a(btw $$0, int $$1, int $$2) {
      boolean $$3 = cek.a($$0, $$1);
      return cen.a($$0, () -> {
         jd $$4 = cen.a($$0.dS(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static exa a(btw $$0, int $$1, int $$2, exa $$3, double $$4) {
      exa $$5 = $$3.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$6 = cek.a($$0, $$1);
      return cen.a($$0, () -> {
         jd $$6x = cen.a($$0.dS(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static exa a(btw $$0, int $$1, int $$2, exa $$3) {
      exa $$4 = $$0.dn().d($$3);
      boolean $$5 = cek.a($$0, $$1);
      return cen.a($$0, () -> {
         jd $$5x = cen.a($$0.dS(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static jd a(btw $$0, int $$1, boolean $$2, jd $$3) {
      jd $$4 = cen.a($$0, $$1, $$0.dS(), $$3);
      return !cek.a($$4, $$0) && !cek.a($$2, $$0, $$4) && !cek.a($$0.N(), $$4) && !cek.b($$0, $$4) ? $$4 : null;
   }
}
