public class coj extends cod {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final cop s;
   long t;
   public final bpf n = new bpv(2) {
      @Override
      public void e() {
         coj.this.a(this);
         super.e();
      }
   };
   private final cpu u = new cpu() {
      @Override
      public void e() {
         coj.this.a(this);
         super.e();
      }
   };

   public coj(int $$0, clg $$1) {
      this($$0, $$1, cop.a);
   }

   public coj(int $$0, clg $$1, final cop $$2) {
      super(cpl.x, $$0);
      this.s = $$2;
      this.a(new cpz(this.n, 0, 15, 15) {
         @Override
         public boolean a(csz $$0) {
            return $$0.a(ctc.rU);
         }
      });
      this.a(new cpz(this.n, 1, 15, 52) {
         @Override
         public boolean a(csz $$0) {
            return $$0.a(ctc.qO) || $$0.a(ctc.uj) || $$0.a(ctc.fT);
         }
      });
      this.a(new cpz(this.u, 2, 145, 39) {
         @Override
         public boolean a(csz $$0) {
            return false;
         }

         @Override
         public void a(clh $$0, csz $$1) {
            coj.this.i.get(0).a(1);
            coj.this.i.get(1).a(1);
            $$1.f().b($$1, $$0.dN(), $$0);
            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Y();
               if (coj.this.t != $$2xx) {
                  $$0x.a(null, $$1x, avc.Ag, avd.e, 1.0F, 1.0F);
                  coj.this.t = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cpz($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cpz($$1, $$5, 8 + $$5 * 18, 142));
      }
   }

   @Override
   public boolean a(clh $$0) {
      return a(this.s, $$0, ddg.nX);
   }

   @Override
   public void a(bpf $$0) {
      csz $$1 = this.n.a(0);
      csz $$2 = this.n.a(1);
      csz $$3 = this.u.a(2);
      if ($$3.d() || !$$1.d() && !$$2.d()) {
         if (!$$1.d() && !$$2.d()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }
   }

   private void a(csz $$0, csz $$1, csz $$2) {
      this.s.a(($$3, $$4) -> {
         enp $$5 = cth.b($$0, $$3);
         if ($$5 != null) {
            csz $$6;
            if ($$1.a(ctc.qO) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.c(1);
               $$6.b(ka.B, cvy.b);
               this.d();
            } else if ($$1.a(ctc.fT) && !$$5.h) {
               $$6 = $$0.c(1);
               $$6.b(ka.B, cvy.a);
               this.d();
            } else {
               if (!$$1.a(ctc.uj)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!csz.a($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(csz $$0, cpz $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public csz a(clh $$0, int $$1) {
      csz $$2 = csz.i;
      cpz $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csz $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 2) {
            $$4.f().b($$4, $$0.dN(), $$0);
            if (!this.a($$4, 3, 39, true)) {
               return csz.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(ctc.rU)) {
               if (!this.a($$4, 0, 1, false)) {
                  return csz.i;
               }
            } else if (!$$4.a(ctc.qO) && !$$4.a(ctc.uj) && !$$4.a(ctc.fT)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return csz.i;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return csz.i;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return csz.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return csz.i;
         }

         if ($$4.d()) {
            $$3.e(csz.i);
         }

         $$3.b();
         if ($$4.G() == $$2.G()) {
            return csz.i;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(clh $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a(($$1, $$2) -> this.a($$0, this.n));
   }
}
