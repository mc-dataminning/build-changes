import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fnd extends fne {
   private static final xe d = xe.c("chat.copy");
   private static final xe r = xe.c("chat.link.warning");
   private final String s;
   private final boolean u;

   public fnd(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), xe.b($$1), $$1, $$2 ? xd.e : xd.g, $$2);
   }

   public fnd(BooleanConsumer $$0, xe $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? xd.e : xd.g, $$3);
   }

   public fnd(BooleanConsumer $$0, xe $$1, xe $$2, String $$3, xe $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (xe)($$5 ? xe.c("chat.link.open") : xd.f);
      this.b = $$4;
      this.u = !$$5;
      this.s = $$3;
   }

   protected static xs a(boolean $$0, String $$1) {
      return c($$0).a(xd.v).a(xe.b($$1));
   }

   protected static xs c(boolean $$0) {
      return xe.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fin.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fin.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(fin.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.m.o.a(this.s);
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.u) {
         $$0.a(this.p, r, this.n / 2, 110, 16764108);
      }
   }

   public static void a(fon $$0, String $$1) {
      fgj $$2 = fgj.Q();
      $$2.a(new fnd($$3 -> {
         if ($$3) {
            ad.j().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static fin.c b(fon $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
