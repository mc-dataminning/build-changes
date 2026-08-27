public class fti extends ftg<bsh, fcv<bsh>> {
   private static final acq a = new acq("textures/entity/sheep/sheep_fur.png");
   private final fcu<bsh> b;

   public fti(fqt<bsh, fcv<bsh>> $$0, fea $$1) {
      super($$0);
      this.b = new fcu<>($$1.a(fed.bc));
   }

   public void a(eij $$0, fjx $$1, int $$2, bsh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.w()) {
         if ($$3.cb()) {
            enn $$10 = enn.N();
            boolean $$11 = $$10.b($$3);
            if ($$11) {
               this.c().a(this.b);
               this.b.a($$3, $$4, $$5, $$6);
               this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
               ein $$12 = $$1.getBuffer(fkf.p(a));
               this.b.a($$0, $$12, $$2, fpz.c($$3, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float $$21;
            float $$22;
            float $$23;
            if ($$3.aa() && "jeb_".equals($$3.Z().getString())) {
               int $$13 = 25;
               int $$14 = $$3.ag / 25 + $$3.af();
               int $$15 = cen.values().length;
               int $$16 = $$14 % $$15;
               int $$17 = ($$14 + 1) % $$15;
               float $$18 = ((float)($$3.ag % 25) + $$6) / 25.0F;
               float[] $$19 = bsh.a(cen.a($$16));
               float[] $$20 = bsh.a(cen.a($$17));
               $$21 = $$19[0] * (1.0F - $$18) + $$20[0] * $$18;
               $$22 = $$19[1] * (1.0F - $$18) + $$20[1] * $$18;
               $$23 = $$19[2] * (1.0F - $$18) + $$20[2] * $$18;
            } else {
               float[] $$24 = bsh.a($$3.r());
               $$21 = $$24[0];
               $$22 = $$24[1];
               $$23 = $$24[2];
            }

            a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$21, $$22, $$23);
         }
      }
   }
}
