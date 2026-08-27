public class cfe extends ceg {
   private static final afs<Boolean> e = afv.a(cfe.class, afu.k);

   public cfe(bkz<? extends cfe> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cfe(csf $$0, bll $$1, double $$2, double $$3, double $$4) {
      super(bkz.bm, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected float u() {
      return this.x() ? 0.73F : super.u();
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   public float a(crx $$0, crl $$1, hx $$2, dhn $$3, ecx $$4, float $$5) {
      return this.x() && cag.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ejw $$0) {
      super.a($$0);
      if (!this.dN().B) {
         bkv $$1 = $$0.a();
         boolean $$4;
         if (this.w() instanceof bll $$3) {
            $$4 = $$1.a(this.dO().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bx()) {
                  this.a($$3, $$1);
               } else {
                  $$3.b(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dO().o(), 5.0F);
         }

         if ($$4 && $$1 instanceof bll $$6) {
            int $$7 = 0;
            if (this.dN().aj() == biy.c) {
               $$7 = 10;
            } else if (this.dN().aj() == biy.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bki(bkk.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(ejx $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.dN().a(this, this.ds(), this.du(), this.dy(), 1.0F, false, csf.a.c);
         this.am();
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      return false;
   }

   @Override
   protected void c_() {
      this.an.a(e, false);
   }

   @Override
   public boolean x() {
      return this.an.b(e);
   }

   public void a(boolean $$0) {
      this.an.b(e, $$0);
   }

   @Override
   protected boolean ag_() {
      return false;
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("dangerous", this.x());
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
