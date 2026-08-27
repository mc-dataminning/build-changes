public class fta extends ftg<btn, fby<btn>> {
   private static final acq[] a = new acq[]{
      new acq("textures/entity/llama/decor/white.png"),
      new acq("textures/entity/llama/decor/orange.png"),
      new acq("textures/entity/llama/decor/magenta.png"),
      new acq("textures/entity/llama/decor/light_blue.png"),
      new acq("textures/entity/llama/decor/yellow.png"),
      new acq("textures/entity/llama/decor/lime.png"),
      new acq("textures/entity/llama/decor/pink.png"),
      new acq("textures/entity/llama/decor/gray.png"),
      new acq("textures/entity/llama/decor/light_gray.png"),
      new acq("textures/entity/llama/decor/cyan.png"),
      new acq("textures/entity/llama/decor/purple.png"),
      new acq("textures/entity/llama/decor/blue.png"),
      new acq("textures/entity/llama/decor/brown.png"),
      new acq("textures/entity/llama/decor/green.png"),
      new acq("textures/entity/llama/decor/red.png"),
      new acq("textures/entity/llama/decor/black.png")
   };
   private static final acq b = new acq("textures/entity/llama/decor/trader_llama.png");
   private final fby<btn> c;

   public fta(fqt<btn, fby<btn>> $$0, fea $$1) {
      super($$0);
      this.c = new fby<>($$1.a(fed.as));
   }

   public void a(eij $$0, fjx $$1, int $$2, btn $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cen $$10 = $$3.gl();
      acq $$11;
      if ($$10 != null) {
         $$11 = a[$$10.a()];
      } else {
         if (!$$3.gh()) {
            return;
         }

         $$11 = b;
      }

      this.c().a(this.c);
      this.c.a($$3, $$4, $$5, $$7, $$8, $$9);
      ein $$14 = $$1.getBuffer(fkf.d($$11));
      this.c.a($$0, $$14, $$2, fum.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
