public class fqj extends fhz<fqj.a> {
   static final ale a = new ale("transferable_list/select_highlighted");
   static final ale m = new ale("transferable_list/select");
   static final ale n = new ale("transferable_list/unselect_highlighted");
   static final ale o = new ale("transferable_list/unselect");
   static final ale p = new ale("transferable_list/move_up_highlighted");
   static final ale q = new ale("transferable_list/move_up");
   static final ale r = new ale("transferable_list/move_down_highlighted");
   static final ale s = new ale("transferable_list/move_down");
   static final xo u = xo.c("pack.incompatible");
   static final xo v = xo.c("pack.incompatible.confirm.title");
   private final xo w;
   final fqi x;

   public fqj(ffe $$0, fqi $$1, int $$2, int $$3, xo $$4) {
      super($$0, $$2, $$3, 33, 36);
      this.x = $$1;
      this.w = $$4;
      this.e = false;
      this.a(true, (int)(9.0F * 1.5F));
   }

   @Override
   protected void a(fgq $$0, int $$1, int $$2) {
      xo $$3 = xo.i().b(this.w).a(n.t, n.r);
      $$0.a(this.c.h, $$3, $$1 + this.g / 2 - this.c.h.a($$3) / 2, Math.min(this.D() + 3, $$2), -1, false);
   }

   @Override
   public int b() {
      return this.g;
   }

   @Override
   protected int p() {
      return this.E() - 6;
   }

   @Override
   protected void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      if (this.m()) {
         int $$6 = 2;
         int $$7 = this.r() - 2;
         int $$8 = this.E() - 6 - 1;
         int $$9 = $$1 - 2;
         int $$10 = $$1 + $$3 + 2;
         $$0.a($$7, $$9, $$8, $$10, $$4);
         $$0.a($$7 + 1, $$9 + 1, $$8 - 1, $$10 - 1, $$5);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.h() != null) {
         switch ($$0) {
            case 32:
            case 257:
               this.h().c();
               return true;
            default:
               if (fnc.t()) {
                  switch ($$0) {
                     case 264:
                        this.h().f();
                        return true;
                     case 265:
                        this.h().e();
                        return true;
                  }
               }
         }
      }

      return super.a($$0, $$1, $$2);
   }

   public static class a extends fhz.a<fqj.a> {
      private static final int b = 157;
      private static final int c = 157;
      private static final String d = "...";
      private final fqj e;
      protected final ffe a;
      private final fqh.a f;
      private final ayk g;
      private final fhw h;
      private final ayk i;
      private final fhw j;

      public a(ffe $$0, fqj $$1, fqh.a $$2) {
         this.a = $$0;
         this.f = $$2;
         this.e = $$1;
         this.g = a($$0, $$2.d());
         this.h = b($$0, $$2.g());
         this.i = a($$0, fqj.u);
         this.j = b($$0, $$2.b().b());
      }

      private static ayk a(ffe $$0, xo $$1) {
         int $$2 = $$0.h.a($$1);
         if ($$2 > 157) {
            xt $$3 = xt.a($$0.h.a($$1, 157 - $$0.h.b("...")), xt.e("..."));
            return um.a().a($$3);
         } else {
            return $$1.g();
         }
      }

      private static fhw b(ffe $$0, xo $$1) {
         return fhw.a($$0.h, $$1, 157, 2);
      }

      @Override
      public xo a() {
         return xo.a("narrator.select", this.f.d());
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         atx $$10 = this.f.b();
         if (!$$10.a()) {
            int $$11 = $$3 + $$4 - 3 - (this.e.m() ? 7 : 0);
            $$0.a($$3 - 1, $$2 - 1, $$11, $$2 + $$5 + 1, -8978432);
         }

         $$0.a(this.f.a(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         ayk $$12 = this.g;
         fhw $$13 = this.h;
         if (this.d() && (this.a.m.Z().c() || $$8 || this.e.h() == this && this.e.aH_())) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            int $$15 = $$7 - $$2;
            if (!this.f.b().a()) {
               $$12 = this.i;
               $$13 = this.j;
            }

            if (this.f.o()) {
               if ($$14 < 32) {
                  $$0.a(fqj.a, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqj.m, $$3, $$2, 32, 32);
               }
            } else {
               if (this.f.p()) {
                  if ($$14 < 16) {
                     $$0.a(fqj.n, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fqj.o, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.q()) {
                  if ($$14 < 32 && $$14 > 16 && $$15 < 16) {
                     $$0.a(fqj.p, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fqj.q, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.r()) {
                  if ($$14 < 32 && $$14 > 16 && $$15 > 16) {
                     $$0.a(fqj.r, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fqj.s, $$3, $$2, 32, 32);
                  }
               }
            }
         }

         $$0.b(this.a.h, $$12, $$3 + 32 + 2, $$2 + 1, 16777215);
         $$13.b($$0, $$3 + 32 + 2, $$2 + 12, 10, -8355712);
      }

      public String b() {
         return this.f.c();
      }

      private boolean d() {
         return !this.f.h() || !this.f.i();
      }

      public void c() {
         if (this.f.o() && this.h()) {
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

      private boolean h() {
         if (this.f.b().a()) {
            this.f.j();
            return true;
         } else {
            xo $$0 = this.f.b().c();
            this.a.a(new flu($$0x -> {
               this.a.a(this.e.x);
               if ($$0x) {
                  this.f.j();
               }
            }, fqj.v, $$0));
            return false;
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)this.e.r();
         double $$4 = $$1 - (double)this.e.g(this.e.aD_().indexOf(this));
         if (this.d() && $$3 <= 32.0) {
            this.e.x.m();
            if (this.f.o()) {
               this.h();
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

         return super.a($$0, $$1, $$2);
      }
   }
}
