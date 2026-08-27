import javax.annotation.Nullable;

public class byy {
   @Nullable
   public static ens a(boo $$0, int $$1, int $$2) {
      boolean $$3 = byz.a($$0, $$1);
      return bzc.a($$0, () -> {
         hz $$4 = bzc.a($$0.eh(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ens a(boo $$0, int $$1, int $$2, ens $$3, double $$4) {
      ens $$5 = $$3.a($$0.dr(), $$0.dt(), $$0.dx());
      boolean $$6 = byz.a($$0, $$1);
      return bzc.a($$0, () -> {
         hz $$6x = bzc.a($$0.eh(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ens a(boo $$0, int $$1, int $$2, ens $$3) {
      ens $$4 = $$0.dk().d($$3);
      boolean $$5 = byz.a($$0, $$1);
      return bzc.a($$0, () -> {
         hz $$5x = bzc.a($$0.eh(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static hz a(boo $$0, int $$1, boolean $$2, hz $$3) {
      hz $$4 = bzc.a($$0, $$1, $$0.eh(), $$3);
      return !byz.a($$4, $$0) && !byz.a($$2, $$0, $$4) && !byz.a($$0.N(), $$4) && !byz.b($$0, $$4) ? $$4 : null;
   }
}
