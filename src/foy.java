public class foy implements anu {
   private final fox a;
   private final fpa b;
   private final fnr c;
   private final foz d;
   private final asc e = asc.a();
   private final erw f;

   public foy(fox $$0, fnr $$1, erw $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fpa(this.f);
      this.d = new foz();
   }

   public fox a() {
      return this.a;
   }

   public void a(dfj $$0, gw $$1, coy $$2, elp $$3, elt $$4) {
      if ($$0.l() == cza.c) {
         gbf $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, fyv.d);
      }
   }

   public void a(dfj $$0, gw $$1, coy $$2, elp $$3, elt $$4, boolean $$5, asc $$6) {
      try {
         cza $$7 = $$0.l();
         if ($$7 == cza.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), fyv.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(gw $$0, coy $$1, elt $$2, dfj $$3, eam $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fpa b() {
      return this.b;
   }

   public gbf a(dfj $$0) {
      return this.a.b($$0);
   }

   public void a(dfj $$0, elp $$1, foe $$2, int $$3, int $$4) {
      cza $$5 = $$0.l();
      if ($$5 != cza.a) {
         switch ($$5) {
            case c:
               gbf $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fnz.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cjf($$0.b()), cjc.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(ant $$0) {
      this.d.a();
   }
}
