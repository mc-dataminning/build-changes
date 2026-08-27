public class fou implements anx {
   private final fot a;
   private final fow b;
   private final fnn c;
   private final fov d;
   private final ash e = ash.a();
   private final erq f;

   public fou(fot $$0, fnn $$1, erq $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fow(this.f);
      this.d = new fov();
   }

   public fot a() {
      return this.a;
   }

   public void a(dfd $$0, gw $$1, cpe $$2, elj $$3, eln $$4) {
      if ($$0.l() == czg.c) {
         gbb $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, fyr.d);
      }
   }

   public void a(dfd $$0, gw $$1, cpe $$2, elj $$3, eln $$4, boolean $$5, ash $$6) {
      try {
         czg $$7 = $$0.l();
         if ($$7 == czg.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), fyr.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(gw $$0, cpe $$1, eln $$2, dfd $$3, eag $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fow b() {
      return this.b;
   }

   public gbb a(dfd $$0) {
      return this.a.b($$0);
   }

   public void a(dfd $$0, elj $$1, foa $$2, int $$3, int $$4) {
      czg $$5 = $$0.l();
      if ($$5 != czg.a) {
         switch ($$5) {
            case c:
               gbb $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fnv.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cjl($$0.b()), cji.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(anw $$0) {
      this.d.a();
   }
}
