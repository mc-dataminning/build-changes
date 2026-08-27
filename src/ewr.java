import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ewr extends ews {
   private static final tf k = tf.c("chat.copy");
   private static final tf l = tf.c("chat.link.warning");
   private final String m;
   private final boolean n;

   public ewr(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), tf.b($$1), $$1, $$2 ? te.e : te.g, $$2);
   }

   public ewr(BooleanConsumer $$0, tf $$1, String $$2, boolean $$3) {
      this($$0, $$1, $$2, $$3 ? te.e : te.g, $$3);
   }

   public ewr(BooleanConsumer $$0, tf $$1, String $$2, tf $$3, boolean $$4) {
      this($$0, $$1, a($$4, $$2), $$2, $$3, $$4);
   }

   public ewr(BooleanConsumer $$0, tf $$1, tf $$2, String $$3, tf $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (tf)($$5 ? tf.c("chat.link.open") : te.f);
      this.b = $$4;
      this.n = !$$5;
      this.m = $$3;
   }

   protected static ts a(boolean $$0, String $$1) {
      return c($$0).b(te.u).b(tf.b($$1));
   }

   protected static ts c(boolean $$0) {
      return tf.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.d(esh.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 50 - 105, $$0, 100, 20).a());
      this.d(esh.a(k, $$0x -> {
         this.k();
         this.c.accept(false);
      }).a(this.g / 2 - 50, $$0, 100, 20).a());
      this.d(esh.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void k() {
      this.f.o.a(this.m);
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.n) {
         $$0.a(this.i, l, this.g / 2, 110, 16764108);
      }
   }

   public static void a(String $$0, exz $$1, boolean $$2) {
      eqm $$3 = eqm.O();
      $$3.a(new ewr($$3x -> {
         if ($$3x) {
            ac.i().a($$0);
         }

         $$3.a($$1);
      }, $$0, $$2));
   }

   public static esh.c b(String $$0, exz $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }
}
