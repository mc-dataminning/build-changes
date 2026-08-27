public class frt implements apm {
   private final frs a;
   private final frv b;
   private final fqm c;
   private final fru d;
   private final atw e = atw.a();
   private final euk f;

   public frt(frs $$0, fqm $$1, euk $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new frv(this.f);
      this.d = new fru();
   }

   public frs a() {
      return this.a;
   }

   public void a(dhn $$0, hx $$1, cri $$2, eob $$3, eof $$4) {
      if ($$0.l() == dbk.c) {
         gea $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gbq.d);
      }
   }

   public void a(dhn $$0, hx $$1, cri $$2, eob $$3, eof $$4, boolean $$5, atw $$6) {
      try {
         dbk $$7 = $$0.l();
         if ($$7 == dbk.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gbq.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(hx $$0, cri $$1, eof $$2, dhn $$3, ecx $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public frv b() {
      return this.b;
   }

   public gea a(dhn $$0) {
      return this.a.b($$0);
   }

   public void a(dhn $$0, eob $$1, fqz $$2, int $$3, int $$4) {
      dbk $$5 = $$0.l();
      if ($$5 != dbk.a) {
         switch ($$5) {
            case c:
               gea $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fqu.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new clo($$0.b()), cll.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(apl $$0) {
      this.d.a();
   }
}
