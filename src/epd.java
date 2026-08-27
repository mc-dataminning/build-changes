import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class epd extends gfx {
   static final ui b = ui.c("mco.warning");
   static final ui c = ui.c("mco.info");
   private final epd.a y;
   private final ui z;
   private final ui A;
   protected final BooleanConsumer a;
   private final boolean B;

   public epd(BooleanConsumer $$0, epd.a $$1, ui $$2, ui $$3, boolean $$4) {
      super(erg.a);
      this.a = $$0;
      this.y = $$1;
      this.z = $$2;
      this.A = $$3;
      this.B = $$4;
   }

   @Override
   public void aM_() {
      if (this.B) {
         this.d(etj.a(uh.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(8), 100, 20).a());
         this.d(etj.a(uh.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(8), 100, 20).a());
      } else {
         this.d(etj.a(uh.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, h(8), 100, 20).a());
      }
   }

   @Override
   public ui h() {
      return uh.b(this.y.d, this.z, this.A);
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
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.y.d, this.g / 2, h(2), this.y.c);
      $$0.a(this.i, this.z, this.g / 2, h(4), -1);
      $$0.a(this.i, this.A, this.g / 2, h(6), -1);
   }

   public static enum a {
      a(epd.b, -65536),
      b(epd.c, 8226750);

      public final int c;
      public final ui d;

      private a(ui $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
