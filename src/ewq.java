public class ewq extends gpe {
   private static final vu a = vu.c("mco.client.incompatible.title");
   private static final vu[] b = new vu[]{
      vu.c("mco.client.incompatible.msg.line1"), vu.c("mco.client.incompatible.msg.line2"), vu.c("mco.client.incompatible.msg.line3")
   };
   private static final vu[] c = new vu[]{vu.c("mco.client.incompatible.msg.line1"), vu.c("mco.client.incompatible.msg.line2")};
   private final fhh v;

   public ewq(fhh $$0) {
      super(a);
      this.v = $$0;
   }

   @Override
   public void aO_() {
      this.c(fbi.a(vt.k, $$0 -> this.f.a(this.v)).a(this.g / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, g(3), -65536);
      vu[] $$4 = this.E();

      for (int $$5 = 0; $$5 < $$4.length; $$5++) {
         $$0.a(this.i, $$4[$$5], this.g / 2, g(5) + $$5 * 12, -1);
      }
   }

   private vu[] E() {
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
