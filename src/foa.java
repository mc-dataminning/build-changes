public class foa extends ffq<foa.a> {
   static final akf a = new akf("transferable_list/select_highlighted");
   static final akf m = new akf("transferable_list/select");
   static final akf n = new akf("transferable_list/unselect_highlighted");
   static final akf o = new akf("transferable_list/unselect");
   static final akf p = new akf("transferable_list/move_up_highlighted");
   static final akf q = new akf("transferable_list/move_up");
   static final akf r = new akf("transferable_list/move_down_highlighted");
   static final akf s = new akf("transferable_list/move_down");
   static final ws u = ws.c("pack.incompatible");
   static final ws v = ws.c("pack.incompatible.confirm.title");
   private final ws w;
   final fnz x;

   public foa(fcu $$0, fnz $$1, int $$2, int $$3, ws $$4) {
      super($$0, $$2, $$3, 33, 36);
      this.x = $$1;
      this.w = $$4;
      this.e = false;
      this.a(true, (int)(9.0F * 1.5F));
   }

   @Override
   protected void a(feh $$0, int $$1, int $$2) {
      ws $$3 = ws.i().b(this.w).a(n.t, n.r);
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
   protected void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
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
               if (fkt.s()) {
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

   public static class a extends ffq.a<foa.a> {
      private static final int b = 157;
      private static final int c = 157;
      private static final String d = "...";
      private final foa e;
      protected final fcu a;
      private final fny.a f;
      private final axi g;
      private final ffn h;
      private final axi i;
      private final ffn j;

      public a(fcu $$0, foa $$1, fny.a $$2) {
         this.a = $$0;
         this.f = $$2;
         this.e = $$1;
         this.g = a($$0, $$2.d());
         this.h = b($$0, $$2.g());
         this.i = a($$0, foa.u);
         this.j = b($$0, $$2.b().b());
      }

      private static axi a(fcu $$0, ws $$1) {
         int $$2 = $$0.h.a($$1);
         if ($$2 > 157) {
            wx $$3 = wx.a($$0.h.a($$1, 157 - $$0.h.b("...")), wx.e("..."));
            return tt.a().a($$3);
         } else {
            return $$1.g();
         }
      }

      private static ffn b(fcu $$0, ws $$1) {
         return ffn.a($$0.h, $$1, 157, 2);
      }

      @Override
      public ws a() {
         return ws.a("narrator.select", this.f.d());
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         asx $$10 = this.f.b();
         if (!$$10.a()) {
            $$0.a($$3 - 1, $$2 - 1, $$3 + $$4 - 3, $$2 + $$5 + 1, -8978432);
         }

         $$0.a(this.f.a(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         axi $$11 = this.g;
         ffn $$12 = this.h;
         if (this.d() && (this.a.m.Z().c() || $$8 || this.e.h() == this && this.e.aI_())) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$13 = $$6 - $$3;
            int $$14 = $$7 - $$2;
            if (!this.f.b().a()) {
               $$11 = this.i;
               $$12 = this.j;
            }

            if (this.f.o()) {
               if ($$13 < 32) {
                  $$0.a(foa.a, $$3, $$2, 32, 32);
               } else {
                  $$0.a(foa.m, $$3, $$2, 32, 32);
               }
            } else {
               if (this.f.p()) {
                  if ($$13 < 16) {
                     $$0.a(foa.n, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(foa.o, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.q()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 < 16) {
                     $$0.a(foa.p, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(foa.q, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.r()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 > 16) {
                     $$0.a(foa.r, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(foa.s, $$3, $$2, 32, 32);
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
            ws $$0 = this.f.b().c();
            this.a.a(new fjl($$0x -> {
               this.a.a(this.e.x);
               if ($$0x) {
                  this.f.j();
               }
            }, foa.v, $$0));
            return false;
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)this.e.r();
         double $$4 = $$1 - (double)this.e.g(this.e.aE_().indexOf(this));
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
