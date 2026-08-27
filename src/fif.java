import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fif extends fig {
   private static final wg d = wg.c("chat.copy");
   private static final wg o = wg.c("chat.link.warning");
   private final String p;
   private final boolean q;

   public fif(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), wg.b($$1), $$1, $$2 ? wf.e : wf.g, $$2);
   }

   public fif(BooleanConsumer $$0, wg $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? wf.e : wf.g, $$3);
   }

   public fif(BooleanConsumer $$0, wg $$1, wg $$2, String $$3, wg $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (wg)($$5 ? wg.c("chat.link.open") : wf.f);
      this.b = $$4;
      this.q = !$$5;
      this.p = $$3;
   }

   protected static wu a(boolean $$0, String $$1) {
      return c($$0).b(wf.v).b(wg.b($$1));
   }

   protected static wu c(boolean $$0) {
      return wg.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fdp.a(this.a, $$0x -> this.c.accept(true)).a(this.k / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fdp.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.k / 2 - 50, $$0, 100, 20).a());
      this.c(fdp.a(this.b, $$0x -> this.c.accept(false)).a(this.k / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.j.o.a(this.p);
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.q) {
         $$0.a(this.m, o, this.k / 2, 110, 16764108);
      }
   }

   public static void a(fjo $$0, String $$1) {
      fbp $$2 = fbp.Q();
      $$2.a(new fif($$3 -> {
         if ($$3) {
            ac.j().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static fdp.c b(fjo $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
