import javax.annotation.Nullable;

public class bzc {
   @Nullable
   public static enz a(boq $$0, int $$1, int $$2) {
      boolean $$3 = bzd.a($$0, $$1);
      return bzg.a($$0, () -> {
         hz $$4 = bzg.a($$0.eh(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static enz a(boq $$0, int $$1, int $$2, enz $$3, double $$4) {
      enz $$5 = $$3.a($$0.dr(), $$0.dt(), $$0.dx());
      boolean $$6 = bzd.a($$0, $$1);
      return bzg.a($$0, () -> {
         hz $$6x = bzg.a($$0.eh(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static enz a(boq $$0, int $$1, int $$2, enz $$3) {
      enz $$4 = $$0.dk().d($$3);
      boolean $$5 = bzd.a($$0, $$1);
      return bzg.a($$0, () -> {
         hz $$5x = bzg.a($$0.eh(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static hz a(boq $$0, int $$1, boolean $$2, hz $$3) {
      hz $$4 = bzg.a($$0, $$1, $$0.eh(), $$3);
      return !bzd.a($$4, $$0) && !bzd.a($$2, $$0, $$4) && !bzd.a($$0.N(), $$4) && !bzd.b($$0, $$4) ? $$4 : null;
   }
}
