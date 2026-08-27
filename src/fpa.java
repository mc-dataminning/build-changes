public class fpa implements anw {
   private final foz a;
   private final fpc b;
   private final fnt c;
   private final fpb d;
   private final ase e = ase.a();
   private final ery f;

   public fpa(foz $$0, fnt $$1, ery $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fpc(this.f);
      this.d = new fpb();
   }

   public foz a() {
      return this.a;
   }

   public void a(dfl $$0, gw $$1, cpa $$2, elr $$3, elv $$4) {
      if ($$0.l() == czc.c) {
         gbh $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, fyx.d);
      }
   }

   public void a(dfl $$0, gw $$1, cpa $$2, elr $$3, elv $$4, boolean $$5, ase $$6) {
      try {
         czc $$7 = $$0.l();
         if ($$7 == czc.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), fyx.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(gw $$0, cpa $$1, elv $$2, dfl $$3, eao $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fpc b() {
      return this.b;
   }

   public gbh a(dfl $$0) {
      return this.a.b($$0);
   }

   public void a(dfl $$0, elr $$1, fog $$2, int $$3, int $$4) {
      czc $$5 = $$0.l();
      if ($$5 != czc.a) {
         switch ($$5) {
            case c:
               gbh $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fob.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cjh($$0.b()), cje.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(anv $$0) {
      this.d.a();
   }
}
