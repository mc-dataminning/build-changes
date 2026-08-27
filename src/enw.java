public class enw extends gei {
   private static final tf a = tf.c("mco.client.incompatible.title");
   private static final tf[] b = new tf[]{
      tf.c("mco.client.incompatible.msg.line1"), tf.c("mco.client.incompatible.msg.line2"), tf.c("mco.client.incompatible.msg.line3")
   };
   private static final tf[] c = new tf[]{tf.c("mco.client.incompatible.msg.line1"), tf.c("mco.client.incompatible.msg.line2")};
   private final exz y;

   public enw(exz $$0) {
      super(a);
      this.y = $$0;
   }

   @Override
   public void aE_() {
      this.d(esh.a(te.k, $$0 -> this.f.a(this.y)).a(this.g / 2 - 100, h(12), 200, 20).a());
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, h(3), -65536);
      tf[] $$4 = this.B();

      for (int $$5 = 0; $$5 < $$4.length; $$5++) {
         $$0.a(this.i, $$4[$$5], this.g / 2, h(5) + $$5 * 12, -1);
      }
   }

   private tf[] B() {
      return aa.b().g() ? c : b;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 != 257 && $$0 != 335 && $$0 != 256) {
         return super.a($$0, $$1, $$2);
      } else {
         this.f.a(this.y);
         return true;
      }
   }
}
