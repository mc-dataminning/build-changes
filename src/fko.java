public class fko implements aky {
   private final fkn a;
   private final fkq b;
   private final fjj c;
   private final fkp d;
   private final apf e = apf.a();
   private final eoo f;

   public fko(fkn $$0, fjj $$1, eoo $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fkq(this.f);
      this.d = new fkp();
   }

   public fkn a() {
      return this.a;
   }

   public void a(dcb $$0, gu $$1, clp $$2, eij $$3, ein $$4) {
      if ($$0.l() == cvs.c) {
         fwr $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, fum.d);
      }
   }

   public void a(dcb $$0, gu $$1, clp $$2, eij $$3, ein $$4, boolean $$5, apf $$6) {
      try {
         cvs $$7 = $$0.l();
         if ($$7 == cvs.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), fum.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(gu $$0, clp $$1, ein $$2, dcb $$3, dxe $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fkq b() {
      return this.b;
   }

   public fwr a(dcb $$0) {
      return this.a.b($$0);
   }

   public void a(dcb $$0, eij $$1, fjx $$2, int $$3, int $$4) {
      cvs $$5 = $$0.l();
      if ($$5 != cvs.a) {
         switch ($$5) {
            case c:
               fwr $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fjs.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cfz($$0.b()), cfw.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(akx $$0) {
      this.d.a();
   }
}
