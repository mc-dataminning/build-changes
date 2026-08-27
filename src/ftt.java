public class ftt implements aqd {
   private final fts a;
   private final ftv b;
   private final fsm c;
   private final ftu d;
   private final aup e = aup.a();
   private final ewd f;

   public ftt(fts $$0, fsm $$1, ewd $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new ftv(this.f);
      this.d = new ftu();
   }

   public fts a() {
      return this.a;
   }

   public void a(dja $$0, hx $$1, csl $$2, ept $$3, epx $$4) {
      if ($$0.l() == dco.c) {
         ggg $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gdw.d);
      }
   }

   public void a(dja $$0, hx $$1, csl $$2, ept $$3, epx $$4, boolean $$5, aup $$6) {
      try {
         dco $$7 = $$0.l();
         if ($$7 == dco.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gdw.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(hx $$0, csl $$1, epx $$2, dja $$3, eek $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public ftv b() {
      return this.b;
   }

   public ggg a(dja $$0) {
      return this.a.b($$0);
   }

   public void a(dja $$0, ept $$1, fsz $$2, int $$3, int $$4) {
      dco $$5 = $$0.l();
      if ($$5 != dco.a) {
         switch ($$5) {
            case c:
               ggg $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fsu.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cmr($$0.b()), cmo.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(aqc $$0) {
      this.d.a();
   }
}
