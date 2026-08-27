import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fbq extends gty {
   static final wx b = wx.c("mco.warning");
   static final wx c = wx.c("mco.info");
   private final fbq.a B;
   private final wx C;
   private final wx D;
   protected final BooleanConsumer a;
   private final boolean E;

   public fbq(BooleanConsumer $$0, fbq.a $$1, wx $$2, wx $$3, boolean $$4) {
      super(fdt.a);
      this.a = $$0;
      this.B = $$1;
      this.C = $$2;
      this.D = $$3;
      this.E = $$4;
   }

   @Override
   public void aN_() {
      if (this.E) {
         this.c(fga.a(ww.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(8), 100, 20).a());
         this.c(fga.a(ww.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(8), 100, 20).a());
      } else {
         this.c(fga.a(ww.h, $$0 -> this.a.accept(true)).a(this.n / 2 - 50, g(8), 100, 20).a());
      }
   }

   @Override
   public wx i() {
      return ww.b(this.B.d, this.C, this.D);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.a.accept(false);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.B.d, this.n / 2, g(2), this.B.c);
      $$0.a(this.p, this.C, this.n / 2, g(4), -1);
      $$0.a(this.p, this.D, this.n / 2, g(6), -1);
   }

   public static enum a {
      a(fbq.b, -65536),
      b(fbq.c, 8226750);

      public final int c;
      public final wx d;

      private a(wx $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
