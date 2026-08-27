public class fkn extends fcc<fkn.a> {
   static final ajh a = new ajh("transferable_list/select_highlighted");
   static final ajh m = new ajh("transferable_list/select");
   static final ajh n = new ajh("transferable_list/unselect_highlighted");
   static final ajh o = new ajh("transferable_list/unselect");
   static final ajh p = new ajh("transferable_list/move_up_highlighted");
   static final ajh q = new ajh("transferable_list/move_up");
   static final ajh r = new ajh("transferable_list/move_down_highlighted");
   static final ajh t = new ajh("transferable_list/move_down");
   static final vu u = vu.c("pack.incompatible");
   static final vu v = vu.c("pack.incompatible.confirm.title");
   private final vu w;
   final fkm x;

   public fkn(ezg $$0, fkm $$1, int $$2, int $$3, vu $$4) {
      super($$0, $$2, $$3 - 83, 32, 36);
      this.x = $$1;
      this.w = $$4;
      this.e = false;
      this.a(true, (int)(9.0F * 1.5F));
   }

   @Override
   protected void a(fat $$0, int $$1, int $$2) {
      vu $$3 = vu.i().b(this.w).a(n.t, n.r);
      $$0.a(this.c.h, $$3, $$1 + this.g / 2 - this.c.h.a($$3) / 2, Math.min(this.C() + 3, $$2), 16777215, false);
   }

   @Override
   public int b() {
      return this.g;
   }

   @Override
   protected int c() {
      return this.D() - 6;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.i() != null) {
         switch ($$0) {
            case 32:
            case 257:
               this.i().c();
               return true;
            default:
               if (fhf.v()) {
                  switch ($$0) {
                     case 264:
                        this.i().f();
                        return true;
                     case 265:
                        this.i().e();
                        return true;
                  }
               }
         }
      }

      return super.a($$0, $$1, $$2);
   }

   public static class a extends fcc.a<fkn.a> {
      private static final int b = 157;
      private static final int c = 157;
      private static final String d = "...";
      private final fkn e;
      protected final ezg a;
      private final fkl.a f;
      private final awi g;
      private final fbz h;
      private final awi i;
      private final fbz j;

      public a(ezg $$0, fkn $$1, fkl.a $$2) {
         this.a = $$0;
         this.f = $$2;
         this.e = $$1;
         this.g = a($$0, $$2.d());
         this.h = b($$0, $$2.g());
         this.i = a($$0, fkn.u);
         this.j = b($$0, $$2.b().b());
      }

      private static awi a(ezg $$0, vu $$1) {
         int $$2 = $$0.h.a($$1);
         if ($$2 > 157) {
            vz $$3 = vz.a($$0.h.a($$1, 157 - $$0.h.b("...")), vz.e("..."));
            return sv.a().a($$3);
         } else {
            return $$1.g();
         }
      }

      private static fbz b(ezg $$0, vu $$1) {
         return fbz.a($$0.h, $$1, 157, 2);
      }

      @Override
      public vu a() {
         return vu.a("narrator.select", this.f.d());
      }

      @Override
      public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         arx $$10 = this.f.b();
         if (!$$10.a()) {
            $$0.a($$3 - 1, $$2 - 1, $$3 + $$4 - 3, $$2 + $$5 + 1, -8978432);
         }

         $$0.a(this.f.a(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         awi $$11 = this.g;
         fbz $$12 = this.h;
         if (this.d() && (this.a.m.X().c() || $$8 || this.e.i() == this && this.e.aJ_())) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$13 = $$6 - $$3;
            int $$14 = $$7 - $$2;
            if (!this.f.b().a()) {
               $$11 = this.i;
               $$12 = this.j;
            }

            if (this.f.o()) {
               if ($$13 < 32) {
                  $$0.a(fkn.a, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fkn.m, $$3, $$2, 32, 32);
               }
            } else {
               if (this.f.p()) {
                  if ($$13 < 16) {
                     $$0.a(fkn.n, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fkn.o, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.q()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 < 16) {
                     $$0.a(fkn.p, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fkn.q, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.r()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 > 16) {
                     $$0.a(fkn.r, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fkn.t, $$3, $$2, 32, 32);
                  }
               }
            }
         }

         $$0.b(this.a.h, $$11, $$3 + 32 + 2, $$2 + 1, 16777215);
         $$12.b($$0, $$3 + 32 + 2, $$2 + 12, 10, -8355712);
      }

      public String b() {
         return this.f.c();
      }

      private boolean d() {
         return !this.f.h() || !this.f.i();
      }

      public void c() {
         if (this.f.o() && this.g()) {
            this.e.x.a(this.e);
         } else if (this.f.p()) {
            this.f.k();
            this.e.x.a(this.e);
         }
      }

      void e() {
         if (this.f.q()) {
            this.f.l();
         }
      }

      void f() {
         if (this.f.r()) {
            this.f.m();
         }
      }

      private boolean g() {
         if (this.f.b().a()) {
            this.f.j();
            return true;
         } else {
            vu $$0 = this.f.b().c();
            this.a.a(new ffx($$0x -> {
               this.a.a(this.e.x);
               if ($$0x) {
                  this.f.j();
               }
            }, fkn.v, $$0));
            return false;
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)this.e.q();
         double $$4 = $$1 - (double)this.e.g(this.e.l().indexOf(this));
         if (this.d() && $$3 <= 32.0) {
            this.e.x.o();
            if (this.f.o()) {
               this.g();
               return true;
            }

            if ($$3 < 16.0 && this.f.p()) {
               this.f.k();
               return true;
            }

            if ($$3 > 16.0 && $$4 < 16.0 && this.f.q()) {
               this.f.l();
               return true;
            }

            if ($$3 > 16.0 && $$4 > 16.0 && this.f.r()) {
               this.f.m();
               return true;
            }
         }

         return false;
      }
   }
}
