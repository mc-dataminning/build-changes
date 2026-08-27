public class fot implements anq {
   private final fos a;
   private final fov b;
   private final fnm c;
   private final fou d;
   private final arx e = arx.a();
   private final err f;

   public fot(fos $$0, fnm $$1, err $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fov(this.f);
      this.d = new fou();
   }

   public fos a() {
      return this.a;
   }

   public void a(dfe $$0, gw $$1, cot $$2, elk $$3, elo $$4) {
      if ($$0.l() == cyv.c) {
         gba $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, fyq.d);
      }
   }

   public void a(dfe $$0, gw $$1, cot $$2, elk $$3, elo $$4, boolean $$5, arx $$6) {
      try {
         cyv $$7 = $$0.l();
         if ($$7 == cyv.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), fyq.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(gw $$0, cot $$1, elo $$2, dfe $$3, eah $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fov b() {
      return this.b;
   }

   public gba a(dfe $$0) {
      return this.a.b($$0);
   }

   public void a(dfe $$0, elk $$1, fnz $$2, int $$3, int $$4) {
      cyv $$5 = $$0.l();
      if ($$5 != cyv.a) {
         switch ($$5) {
            case c:
               gba $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fnu.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cja($$0.b()), cix.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(anp $$0) {
      this.d.a();
   }
}
