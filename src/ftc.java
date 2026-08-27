public class ftc implements apt {
   private final ftb a;
   private final fte b;
   private final frv c;
   private final ftd d;
   private final auf e = auf.a();
   private final evn f;

   public ftc(ftb $$0, frv $$1, evn $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new fte(this.f);
      this.d = new ftd();
   }

   public ftb a() {
      return this.a;
   }

   public void a(dip $$0, hv $$1, csb $$2, epd $$3, eph $$4) {
      if ($$0.l() == dce.c) {
         gfp $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gdf.d);
      }
   }

   public void a(dip $$0, hv $$1, csb $$2, epd $$3, eph $$4, boolean $$5, auf $$6) {
      try {
         dce $$7 = $$0.l();
         if ($$7 == dce.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gdf.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(hv $$0, csb $$1, eph $$2, dip $$3, edz $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public fte b() {
      return this.b;
   }

   public gfp a(dip $$0) {
      return this.a.b($$0);
   }

   public void a(dip $$0, epd $$1, fsi $$2, int $$3, int $$4) {
      dce $$5 = $$0.l();
      if ($$5 != dce.a) {
         switch ($$5) {
            case c:
               gfp $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fsd.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new cmh($$0.b()), cme.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(aps $$0) {
      this.d.a();
   }
}
