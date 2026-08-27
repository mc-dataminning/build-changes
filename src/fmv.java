public class fmv extends fel<fmv.a> {
   static final ajt a = new ajt("transferable_list/select_highlighted");
   static final ajt m = new ajt("transferable_list/select");
   static final ajt n = new ajt("transferable_list/unselect_highlighted");
   static final ajt o = new ajt("transferable_list/unselect");
   static final ajt p = new ajt("transferable_list/move_up_highlighted");
   static final ajt q = new ajt("transferable_list/move_up");
   static final ajt r = new ajt("transferable_list/move_down_highlighted");
   static final ajt s = new ajt("transferable_list/move_down");
   static final wg u = wg.c("pack.incompatible");
   static final wg v = wg.c("pack.incompatible.confirm.title");
   private final wg w;
   final fmu x;

   public fmv(fbp $$0, fmu $$1, int $$2, int $$3, wg $$4) {
      super($$0, $$2, $$3, 33, 36);
      this.x = $$1;
      this.w = $$4;
      this.e = false;
      this.a(true, (int)(9.0F * 1.5F));
   }

   @Override
   protected void a(fdc $$0, int $$1, int $$2) {
      wg $$3 = wg.i().b(this.w).a(n.t, n.r);
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
   protected void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
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
               if (fjo.s()) {
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

   public static class a extends fel.a<fmv.a> {
      private static final int b = 157;
      private static final int c = 157;
      private static final String d = "...";
      private final fmv e;
      protected final fbp a;
      private final fmt.a f;
      private final aww g;
      private final fei h;
      private final aww i;
      private final fei j;

      public a(fbp $$0, fmv $$1, fmt.a $$2) {
         this.a = $$0;
         this.f = $$2;
         this.e = $$1;
         this.g = a($$0, $$2.d());
         this.h = b($$0, $$2.g());
         this.i = a($$0, fmv.u);
         this.j = b($$0, $$2.b().b());
      }

      private static aww a(fbp $$0, wg $$1) {
         int $$2 = $$0.h.a($$1);
         if ($$2 > 157) {
            wl $$3 = wl.a($$0.h.a($$1, 157 - $$0.h.b("...")), wl.e("..."));
            return th.a().a($$3);
         } else {
            return $$1.g();
         }
      }

      private static fei b(fbp $$0, wg $$1) {
         return fei.a($$0.h, $$1, 157, 2);
      }

      @Override
      public wg a() {
         return wg.a("narrator.select", this.f.d());
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         asl $$10 = this.f.b();
         if (!$$10.a()) {
            $$0.a($$3 - 1, $$2 - 1, $$3 + $$4 - 3, $$2 + $$5 + 1, -8978432);
         }

         $$0.a(this.f.a(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         aww $$11 = this.g;
         fei $$12 = this.h;
         if (this.d() && (this.a.m.Z().c() || $$8 || this.e.h() == this && this.e.aJ_())) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$13 = $$6 - $$3;
            int $$14 = $$7 - $$2;
            if (!this.f.b().a()) {
               $$11 = this.i;
               $$12 = this.j;
            }

            if (this.f.o()) {
               if ($$13 < 32) {
                  $$0.a(fmv.a, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fmv.m, $$3, $$2, 32, 32);
               }
            } else {
               if (this.f.p()) {
                  if ($$13 < 16) {
                     $$0.a(fmv.n, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fmv.o, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.q()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 < 16) {
                     $$0.a(fmv.p, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fmv.q, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.r()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 > 16) {
                     $$0.a(fmv.r, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fmv.s, $$3, $$2, 32, 32);
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
            wg $$0 = this.f.b().c();
            this.a.a(new fig($$0x -> {
               this.a.a(this.e.x);
               if ($$0x) {
                  this.f.j();
               }
            }, fmv.v, $$0));
            return false;
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)this.e.r();
         double $$4 = $$1 - (double)this.e.g(this.e.aF_().indexOf(this));
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
