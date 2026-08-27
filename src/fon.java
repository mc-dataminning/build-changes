public class fon implements ann {
   private final fom a;
   private final fop b;
   private final fnh c;
   private final foo d;
   private final aru e = aru.a();
   private final erm f;

   public fon(fom $$0, fnh $$1, erm $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fop(this.f);
      this.d = new foo();
   }

   public fom a() {
      return this.a;
   }

   public void a(dez $$0, gu $$1, coo $$2, elf $$3, elj $$4) {
      if ($$0.l() == cyq.c) {
         gav $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, fyl.d);
      }
   }

   public void a(dez $$0, gu $$1, coo $$2, elf $$3, elj $$4, boolean $$5, aru $$6) {
      try {
         cyq $$7 = $$0.l();
         if ($$7 == cyq.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), fyl.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(gu $$0, coo $$1, elj $$2, dez $$3, eac $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fop b() {
      return this.b;
   }

   public gav a(dez $$0) {
      return this.a.b($$0);
   }

   public void a(dez $$0, elf $$1, fnu $$2, int $$3, int $$4) {
      cyq $$5 = $$0.l();
      if ($$5 != cyq.a) {
         switch ($$5) {
            case c:
               gav $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fnp.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cix($$0.b()), ciu.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(anm $$0) {
      this.d.a();
   }
}
