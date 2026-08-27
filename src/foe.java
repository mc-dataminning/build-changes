public class foe implements ann {
   private final fod a;
   private final fog b;
   private final fmy c;
   private final fof d;
   private final aru e = aru.a();
   private final ern f;

   public foe(fod $$0, fmy $$1, ern $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fog(this.f);
      this.d = new fof();
   }

   public fod a() {
      return this.a;
   }

   public void a(dfa $$0, gu $$1, cop $$2, elg $$3, elk $$4) {
      if ($$0.l() == cyr.c) {
         gam $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, fyc.d);
      }
   }

   public void a(dfa $$0, gu $$1, cop $$2, elg $$3, elk $$4, boolean $$5, aru $$6) {
      try {
         cyr $$7 = $$0.l();
         if ($$7 == cyr.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), fyc.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(gu $$0, cop $$1, elk $$2, dfa $$3, ead $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fog b() {
      return this.b;
   }

   public gam a(dfa $$0) {
      return this.a.b($$0);
   }

   public void a(dfa $$0, elg $$1, fnl $$2, int $$3, int $$4) {
      cyr $$5 = $$0.l();
      if ($$5 != cyr.a) {
         switch ($$5) {
            case c:
               gam $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fng.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new ciy($$0.b()), civ.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(anm $$0) {
      this.d.a();
   }
}
