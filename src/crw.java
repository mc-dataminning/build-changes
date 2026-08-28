public class crw extends cro {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final csb u;
   long v;
   public final brw p = new bsk(2) {
      @Override
      public void e() {
         crw.this.a(this);
         super.e();
      }
   };
   private final ctg w = new ctg() {
      @Override
      public void e() {
         crw.this.a(this);
         super.e();
      }
   };

   public crw(int $$0, col $$1) {
      this($$0, $$1, csb.a);
   }

   public crw(int $$0, col $$1, final csb $$2) {
      super(csx.x, $$0);
      this.u = $$2;
      this.a(new ctl(this.p, 0, 15, 15) {
         @Override
         public boolean a(cwb $$0) {
            return $$0.b(ku.L);
         }
      });
      this.a(new ctl(this.p, 1, 15, 52) {
         @Override
         public boolean a(cwb $$0) {
            return $$0.a(cwf.qP) || $$0.a(cwf.ul) || $$0.a(cwf.fT);
         }
      });
      this.a(new ctl(this.w, 2, 145, 39) {
         @Override
         public boolean a(cwb $$0) {
            return false;
         }

         @Override
         public void a(com $$0, cwb $$1) {
            crw.this.k.get(0).a(1);
            crw.this.k.get(1).a(1);
            $$1.h().a($$1, $$0.dX(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.aa();
               if (crw.this.v != $$2xx) {
                  $$0x.a(null, $$1x, awl.Ay, awm.e, 1.0F, 1.0F);
                  crw.this.v = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(com $$0) {
      return a(this.u, $$0, dig.nX);
   }

   @Override
   public void a(brw $$0) {
      cwb $$1 = this.p.a(0);
      cwb $$2 = this.p.a(1);
      cwb $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(cwb $$0, cwb $$1, cwb $$2) {
      this.u.a(($$3, $$4) -> {
         ete $$5 = cwo.b($$0, $$3);
         if ($$5 != null) {
            cwb $$6;
            if ($$1.a(cwf.qP) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(ku.N, cyy.b);
               this.d();
            } else if ($$1.a(cwf.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(ku.N, cyy.a);
               this.d();
            } else {
               if (!$$1.a(cwf.ul)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cwb.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cwb $$0, ctl $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public cwb b(com $$0, int $$1) {
      cwb $$2 = cwb.k;
      ctl $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwb $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().a($$4, $$0.dX(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cwb.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.b(ku.L)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cwb.k;
               }
            } else if (!$$4.a(cwf.qP) && !$$4.a(cwf.ul) && !$$4.a(cwf.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cwb.k;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cwb.k;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cwb.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cwb.k;
         }

         if ($$4.f()) {
            $$3.e(cwb.k);
         }

         $$3.c();
         if ($$4.L() == $$2.L()) {
            return cwb.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(com $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
