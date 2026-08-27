public class fnz implements anl {
   private final fny a;
   private final fob b;
   private final fmt c;
   private final foa d;
   private final art e = art.a();
   private final ero f;

   public fnz(fny $$0, fmt $$1, ero $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fob(this.f);
      this.d = new foa();
   }

   public fny a() {
      return this.a;
   }

   public void a(dey $$0, gv $$1, com $$2, elh $$3, ell $$4) {
      if ($$0.l() == cyp.c) {
         gah $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, fxx.d);
      }
   }

   public void a(dey $$0, gv $$1, com $$2, elh $$3, ell $$4, boolean $$5, art $$6) {
      try {
         cyp $$7 = $$0.l();
         if ($$7 == cyp.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), fxx.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(gv $$0, com $$1, ell $$2, dey $$3, eab $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fob b() {
      return this.b;
   }

   public gah a(dey $$0) {
      return this.a.b($$0);
   }

   public void a(dey $$0, elh $$1, fng $$2, int $$3, int $$4) {
      cyp $$5 = $$0.l();
      if ($$5 != cyp.a) {
         switch ($$5) {
            case c:
               gah $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fnb.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new ciw($$0.b()), cit.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(ank $$0) {
      this.d.a();
   }
}
