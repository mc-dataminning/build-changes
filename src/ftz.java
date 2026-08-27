public class ftz implements aqi {
   private final fty a;
   private final fub b;
   private final fss c;
   private final fua d;
   private final auu e = auu.a();
   private final ewj f;

   public ftz(fty $$0, fss $$1, ewj $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fub(this.f);
      this.d = new fua();
   }

   public fty a() {
      return this.a;
   }

   public void a(djg $$0, hx $$1, csr $$2, epz $$3, eqd $$4) {
      if ($$0.l() == dcu.c) {
         ggl $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gec.d);
      }
   }

   public void a(djg $$0, hx $$1, csr $$2, epz $$3, eqd $$4, boolean $$5, auu $$6) {
      try {
         dcu $$7 = $$0.l();
         if ($$7 == dcu.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gec.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(hx $$0, csr $$1, eqd $$2, djg $$3, eeq $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fub b() {
      return this.b;
   }

   public ggl a(djg $$0) {
      return this.a.b($$0);
   }

   public void a(djg $$0, epz $$1, ftf $$2, int $$3, int $$4) {
      dcu $$5 = $$0.l();
      if ($$5 != dcu.a) {
         switch ($$5) {
            case c:
               ggl $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fta.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cmx($$0.b()), cmu.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(aqh $$0) {
      this.d.a();
   }
}
