public class ffl<T extends bxs> extends fgi<T> {
   private final fiw g = this.b.b("left_chest");
   private final fiw h = this.b.b("right_chest");

   public ffl(fiw $$0) {
      super($$0);
   }

   public static fjc c() {
      fje $$0 = fgi.a(fja.a);
      fjf $$1 = $$0.a();
      fjf $$2 = $$1.a("body");
      fjb $$3 = fjb.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$2.a("left_chest", $$3, fiy.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$2.a("right_chest", $$3, fiy.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      fjf $$4 = $$1.a("head_parts").a("head");
      fjb $$5 = fjb.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$4.a("left_ear", $$5, fiy.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$4.a("right_ear", $$5, fiy.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
      return fjc.a($$0, 64, 64);
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
