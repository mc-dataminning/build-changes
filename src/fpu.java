public class fpu implements aou {
   private final fpt a;
   private final fpw b;
   private final fon c;
   private final fpv d;
   private final ate e = ate.a();
   private final esp f;

   public fpu(fpt $$0, fon $$1, esp $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fpw(this.f);
      this.d = new fpv();
   }

   public fpt a() {
      return this.a;
   }

   public void a(dgb $$0, ht $$1, cqc $$2, emh $$3, eml $$4) {
      if ($$0.l() == dae.c) {
         gcb $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, fzr.d);
      }
   }

   public void a(dgb $$0, ht $$1, cqc $$2, emh $$3, eml $$4, boolean $$5, ate $$6) {
      try {
         dae $$7 = $$0.l();
         if ($$7 == dae.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), fzr.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(ht $$0, cqc $$1, eml $$2, dgb $$3, ebe $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fpw b() {
      return this.b;
   }

   public gcb a(dgb $$0) {
      return this.a.b($$0);
   }

   public void a(dgb $$0, emh $$1, fpb $$2, int $$3, int $$4) {
      dae $$5 = $$0.l();
      if ($$5 != dae.a) {
         switch ($$5) {
            case c:
               gcb $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fow.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new ckj($$0.b()), ckg.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(aot $$0) {
      this.d.a();
   }
}
