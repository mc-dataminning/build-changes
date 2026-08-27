public class eqq extends ghw {
   private static final uv a = uv.c("mco.client.incompatible.title");
   private static final uv[] b = new uv[]{
      uv.c("mco.client.incompatible.msg.line1"), uv.c("mco.client.incompatible.msg.line2"), uv.c("mco.client.incompatible.msg.line3")
   };
   private static final uv[] c = new uv[]{uv.c("mco.client.incompatible.msg.line1"), uv.c("mco.client.incompatible.msg.line2")};
   private final faz v;

   public eqq(faz $$0) {
      super(a);
      this.v = $$0;
   }

   @Override
   public void aQ_() {
      this.d(eve.a(uu.k, $$0 -> this.f.a(this.v)).a(this.g / 2 - 100, h(12), 200, 20).a());
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, h(3), -65536);
      uv[] $$4 = this.C();

      for (int $$5 = 0; $$5 < $$4.length; $$5++) {
         $$0.a(this.i, $$4[$$5], this.g / 2, h(5) + $$5 * 12, -1);
      }
   }

   private uv[] C() {
      return aa.b().g() ? c : b;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 != 257 && $$0 != 335 && $$0 != 256) {
         return super.a($$0, $$1, $$2);
      } else {
         this.f.a(this.v);
         return true;
      }
   }
}
