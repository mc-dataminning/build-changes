import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ezm extends ezn {
   private static final ur k = ur.c("chat.copy");
   private static final ur l = ur.c("chat.link.warning");
   private final String m;
   private final boolean n;

   public ezm(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), ur.b($$1), $$1, $$2 ? uq.e : uq.g, $$2);
   }

   public ezm(BooleanConsumer $$0, ur $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? uq.e : uq.g, $$3);
   }

   public ezm(BooleanConsumer $$0, ur $$1, ur $$2, String $$3, ur $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (ur)($$5 ? ur.c("chat.link.open") : uq.f);
      this.b = $$4;
      this.n = !$$5;
      this.m = $$3;
   }

   protected static vf a(boolean $$0, String $$1) {
      return c($$0).b(uq.u).b(ur.b($$1));
   }

   protected static vf c(boolean $$0) {
      return ur.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.d(euz.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 50 - 105, $$0, 100, 20).a());
      this.d(euz.a(k, $$0x -> {
         this.k();
         this.c.accept(false);
      }).a(this.g / 2 - 50, $$0, 100, 20).a());
      this.d(euz.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void k() {
      this.f.o.a(this.m);
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.n) {
         $$0.a(this.i, l, this.g / 2, 110, 16764108);
      }
   }

   public static void a(fau $$0, String $$1) {
      etd $$2 = etd.N();
      $$2.a(new ezm($$3 -> {
         if ($$3) {
            ac.i().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static euz.c b(fau $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
