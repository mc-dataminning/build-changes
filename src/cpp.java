public class cpp extends cpi {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cpu s;
   long t;
   public final bqa n = new bqq(2) {
      @Override
      public void e() {
         cpp.this.a(this);
         super.e();
      }
   };
   private final cqz u = new cqz() {
      @Override
      public void e() {
         cpp.this.a(this);
         super.e();
      }
   };

   public cpp(int $$0, cmk $$1) {
      this($$0, $$1, cpu.a);
   }

   public cpp(int $$0, cmk $$1, final cpu $$2) {
      super(cqq.x, $$0);
      this.s = $$2;
      this.a(new cre(this.n, 0, 15, 15) {
         @Override
         public boolean a(cud $$0) {
            return $$0.a(cug.rU);
         }
      });
      this.a(new cre(this.n, 1, 15, 52) {
         @Override
         public boolean a(cud $$0) {
            return $$0.a(cug.qO) || $$0.a(cug.uj) || $$0.a(cug.fT);
         }
      });
      this.a(new cre(this.u, 2, 145, 39) {
         @Override
         public boolean a(cud $$0) {
            return false;
         }

         @Override
         public void a(cml $$0, cud $$1) {
            cpp.this.i.get(0).a(1);
            cpp.this.i.get(1).a(1);
            $$1.g().b($$1, $$0.dR(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cpp.this.t != $$2xx) {
                  $$0x.a(null, $$1x, avh.Au, avi.e, 1.0F, 1.0F);
                  cpp.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cre($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cre($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean b(cml $$0) {
      return a(this.s, $$0, dfk.nX);
   }

   @Override
   public void a(bqa $$0) {
      cud $$1 = this.n.a(0);
      cud $$2 = this.n.a(1);
      cud $$3 = this.u.a(2);
      if ($$3.e() || !$$1.e() && !$$2.e()) {
         if (!$$1.e() && !$$2.e()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(cud $$0, cud $$1, cud $$2) {
      this.s.a(($$3, $$4) -> {
         epy $$5 = cul.b($$0, $$3);
         if ($$5 != null) {
            cud $$6;
            if ($$1.a(cug.qO) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(kn.D, cxd.b);
               this.d();
            } else if ($$1.a(cug.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(kn.D, cxd.a);
               this.d();
            } else {
               if (!$$1.a(cug.uj)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!cud.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(cud $$0, cre $$1) {
      return $$1.c != this.u && super.a($$0, $$1);
   }

   @Override
   public cud b(cml $$0, int $$1) {
      cud $$2 = cud.l;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cud $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            $$4.g().b($$4, $$0.dR(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cud.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(cug.rU)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cud.l;
               }
            } else if (!$$4.a(cug.qO) && !$$4.a(cug.uj) && !$$4.a(cug.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cud.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cud.l;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cud.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cud.l;
         }

         if ($$4.e()) {
            $$3.e(cud.l);
         }

         $$3.c();
         if ($$4.H() == $$2.H()) {
            return cud.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cml $$0) {
      super.a($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
