import javax.annotation.Nullable;

public class cfq {
   @Nullable
   public static ezh a(bvd $$0, int $$1, int $$2) {
      boolean $$3 = cfr.a($$0, $$1);
      return cfu.a($$0, () -> {
         jg $$4 = cfu.a($$0.ea(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ezh a(bvd $$0, int $$1, int $$2, ezh $$3, double $$4) {
      ezh $$5 = $$3.a($$0.dC(), $$0.dE(), $$0.dI());
      boolean $$6 = cfr.a($$0, $$1);
      return cfu.a($$0, () -> {
         jg $$6x = cfu.a($$0.ea(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ezh a(bvd $$0, int $$1, int $$2, ezh $$3) {
      ezh $$4 = $$0.dv().d($$3);
      boolean $$5 = cfr.a($$0, $$1);
      return cfu.a($$0, () -> {
         jg $$5x = cfu.a($$0.ea(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static jg a(bvd $$0, int $$1, boolean $$2, jg $$3) {
      jg $$4 = cfu.a($$0, $$1, $$0.ea(), $$3);
      return !cfr.a($$4, $$0) && !cfr.a($$2, $$0, $$4) && !cfr.a($$0.P(), $$4) && !cfr.b($$0, $$4) ? $$4 : null;
   }
}
