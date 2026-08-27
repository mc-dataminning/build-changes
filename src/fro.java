public class fro implements api {
   private final frn a;
   private final frq b;
   private final fqh c;
   private final frp d;
   private final ats e = ats.a();
   private final euf f;

   public fro(frn $$0, fqh $$1, euf $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new frq(this.f);
      this.d = new frp();
   }

   public frn a() {
      return this.a;
   }

   public void a(dhi $$0, ht $$1, crd $$2, enw $$3, eoa $$4) {
      if ($$0.l() == dbf.c) {
         gdv $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gbl.d);
      }
   }

   public void a(dhi $$0, ht $$1, crd $$2, enw $$3, eoa $$4, boolean $$5, ats $$6) {
      try {
         dbf $$7 = $$0.l();
         if ($$7 == dbf.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gbl.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(ht $$0, crd $$1, eoa $$2, dhi $$3, ecs $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public frq b() {
      return this.b;
   }

   public gdv a(dhi $$0) {
      return this.a.b($$0);
   }

   public void a(dhi $$0, enw $$1, fqu $$2, int $$3, int $$4) {
      dbf $$5 = $$0.l();
      if ($$5 != dbf.a) {
         switch ($$5) {
            case c:
               gdv $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fqp.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new clj($$0.b()), clg.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(aph $$0) {
      this.d.a();
   }
}
