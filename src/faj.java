import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class faj extends gsq {
   static final ws b = ws.c("mco.warning");
   static final ws c = ws.c("mco.info");
   private final faj.a B;
   private final ws C;
   private final ws D;
   protected final BooleanConsumer a;
   private final boolean E;

   public faj(BooleanConsumer $$0, faj.a $$1, ws $$2, ws $$3, boolean $$4) {
      super(fcm.a);
      this.a = $$0;
      this.B = $$1;
      this.C = $$2;
      this.D = $$3;
      this.E = $$4;
   }

   @Override
   public void aM_() {
      if (this.E) {
         this.c(feu.a(wr.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(8), 100, 20).a());
         this.c(feu.a(wr.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(8), 100, 20).a());
      } else {
         this.c(feu.a(wr.h, $$0 -> this.a.accept(true)).a(this.n / 2 - 50, g(8), 100, 20).a());
      }
   }

   @Override
   public ws i() {
      return wr.b(this.B.d, this.C, this.D);
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
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.B.d, this.n / 2, g(2), this.B.c);
      $$0.a(this.p, this.C, this.n / 2, g(4), -1);
      $$0.a(this.p, this.D, this.n / 2, g(6), -1);
   }

   public static enum a {
      a(faj.b, -65536),
      b(faj.c, 8226750);

      public final int c;
      public final ws d;

      private a(ws $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
