public class fue<T extends cgv> extends fvb<T> {
   private final fxq g = this.b.b("left_chest");
   private final fxq h = this.b.b("right_chest");

   public fue(fxq $$0) {
      super($$0);
   }

   public static fxw c() {
      fxy $$0 = fvb.a(fxu.a);
      fxz $$1 = $$0.a();
      fxz $$2 = $$1.a("body");
      fxv $$3 = fxv.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$2.a("left_chest", $$3, fxs.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$2.a("right_chest", $$3, fxs.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      fxz $$4 = $$1.a("head_parts").a("head");
      fxv $$5 = fxv.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$4.a("left_ear", $$5, fxs.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$4.a("right_ear", $$5, fxs.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
      return fxw.a($$0, 64, 64);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.t()) {
         this.g.k = true;
         this.h.k = true;
      } else {
         this.g.k = false;
         this.h.k = false;
      }
   }
}
