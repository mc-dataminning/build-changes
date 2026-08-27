public class evs extends gob {
   private static final vs a = vs.c("mco.client.incompatible.title");
   private static final vs[] b = new vs[]{
      vs.c("mco.client.incompatible.msg.line1"), vs.c("mco.client.incompatible.msg.line2"), vs.c("mco.client.incompatible.msg.line3")
   };
   private static final vs[] c = new vs[]{vs.c("mco.client.incompatible.msg.line1"), vs.c("mco.client.incompatible.msg.line2")};
   private final fgh v;

   public evs(fgh $$0) {
      super(a);
      this.v = $$0;
   }

   @Override
   public void aP_() {
      this.c(fak.a(vr.k, $$0 -> this.f.a(this.v)).a(this.g / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, g(3), -65536);
      vs[] $$4 = this.E();

      for (int $$5 = 0; $$5 < $$4.length; $$5++) {
         $$0.a(this.i, $$4[$$5], this.g / 2, g(5) + $$5 * 12, -1);
      }
   }

   private vs[] E() {
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
