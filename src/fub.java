public class fub implements aqj {
   private final fua a;
   private final fud b;
   private final fsu c;
   private final fuc d;
   private final auv e = auv.a();
   private final ewl f;

   public fub(fua $$0, fsu $$1, ewl $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fud(this.f);
      this.d = new fuc();
   }

   public fua a() {
      return this.a;
   }

   public void a(djh $$0, hx $$1, css $$2, eqb $$3, eqf $$4) {
      if ($$0.l() == dcv.c) {
         ggn $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gee.d);
      }
   }

   public void a(djh $$0, hx $$1, css $$2, eqb $$3, eqf $$4, boolean $$5, auv $$6) {
      try {
         dcv $$7 = $$0.l();
         if ($$7 == dcv.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gee.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(hx $$0, css $$1, eqf $$2, djh $$3, eer $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fud b() {
      return this.b;
   }

   public ggn a(djh $$0) {
      return this.a.b($$0);
   }

   public void a(djh $$0, eqb $$1, fth $$2, int $$3, int $$4) {
      dcv $$5 = $$0.l();
      if ($$5 != dcv.a) {
         switch ($$5) {
            case c:
               ggn $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(ftc.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cmy($$0.b()), cmv.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(aqi $$0) {
      this.d.a();
   }
}
