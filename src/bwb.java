import javax.annotation.Nullable;

public class bwb {
   @Nullable
   public static ejz a(blu $$0, int $$1, int $$2) {
      boolean $$3 = bwc.a($$0, $$1);
      return bwf.a($$0, () -> {
         hx $$4 = bwf.a($$0.eh(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ejz a(blu $$0, int $$1, int $$2, ejz $$3, double $$4) {
      ejz $$5 = $$3.a($$0.ds(), $$0.du(), $$0.dy());
      boolean $$6 = bwc.a($$0, $$1);
      return bwf.a($$0, () -> {
         hx $$6x = bwf.a($$0.eh(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ejz a(blu $$0, int $$1, int $$2, ejz $$3) {
      ejz $$4 = $$0.dl().d($$3);
      boolean $$5 = bwc.a($$0, $$1);
      return bwf.a($$0, () -> {
         hx $$5x = bwf.a($$0.eh(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static hx a(blu $$0, int $$1, boolean $$2, hx $$3) {
      hx $$4 = bwf.a($$0, $$1, $$0.eh(), $$3);
      return !bwc.a($$4, $$0) && !bwc.a($$2, $$0, $$4) && !bwc.a($$0.N(), $$4) && !bwc.b($$0, $$4) ? $$4 : null;
   }
}
