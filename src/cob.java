public class cob extends cnc {
   private static final akj<Boolean> f = akn.a(cob.class, akl.k);

   public cob(bsy<? extends cob> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public cob(dbw $$0, btn $$1, double $$2, double $$3, double $$4) {
      super(bsy.br, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected float w() {
      return this.z() ? 0.73F : super.w();
   }

   @Override
   public boolean bQ() {
      return false;
   }

   @Override
   public float a(dbo $$0, dbc $$1, iz $$2, dsa $$3, ent $$4, float $$5) {
      return this.z() && cit.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(evm $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bss $$1 = $$0.a();
         boolean $$4;
         if (this.s() instanceof btn $$3) {
            $$4 = $$1.a(this.dQ().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bD()) {
                  this.a($$3, $$1);
               } else {
                  $$3.c(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dQ().o(), 5.0F);
         }

         if ($$4 && $$1 instanceof btn $$6) {
            int $$7 = 0;
            if (this.dP().al() == bqp.c) {
               $$7 = 10;
            } else if (this.dP().al() == bqp.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bsa(bsc.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(evn $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.dP().a(this, this.du(), this.dw(), this.dA(), 1.0F, false, dbw.a.c);
         this.ao();
      }
   }

   @Override
   public boolean a(brl $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(f, false);
   }

   public boolean z() {
      return this.ao.a(f);
   }

   public void a(boolean $$0) {
      this.ao.a(f, $$0);
   }

   @Override
   protected boolean u() {
      return false;
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("dangerous", this.z());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
