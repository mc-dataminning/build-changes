import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fed extends fee {
   private static final vq k = vq.c("chat.copy");
   private static final vq l = vq.c("chat.link.warning");
   private final String m;
   private final boolean n;

   public fed(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), vq.b($$1), $$1, $$2 ? vp.e : vp.g, $$2);
   }

   public fed(BooleanConsumer $$0, vq $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? vp.e : vp.g, $$3);
   }

   public fed(BooleanConsumer $$0, vq $$1, vq $$2, String $$3, vq $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (vq)($$5 ? vq.c("chat.link.open") : vp.f);
      this.b = $$4;
      this.n = !$$5;
      this.m = $$3;
   }

   protected static we a(boolean $$0, String $$1) {
      return c($$0).b(vp.v).b(vq.b($$1));
   }

   protected static we c(boolean $$0) {
      return vq.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(ezo.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(ezo.a(k, $$0x -> {
         this.n();
         this.c.accept(false);
      }).a(this.g / 2 - 50, $$0, 100, 20).a());
      this.c(ezo.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void n() {
      this.f.o.a(this.m);
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.n) {
         $$0.a(this.i, l, this.g / 2, 110, 16764108);
      }
   }

   public static void a(ffl $$0, String $$1) {
      exo $$2 = exo.P();
      $$2.a(new fed($$3 -> {
         if ($$3) {
            ac.j().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static ezo.c b(ffl $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
