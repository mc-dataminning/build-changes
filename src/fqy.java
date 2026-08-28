public class fqy extends fio<fqy.a> {
   static final akk a = new akk("transferable_list/select_highlighted");
   static final akk m = new akk("transferable_list/select");
   static final akk n = new akk("transferable_list/unselect_highlighted");
   static final akk o = new akk("transferable_list/unselect");
   static final akk p = new akk("transferable_list/move_up_highlighted");
   static final akk q = new akk("transferable_list/move_up");
   static final akk r = new akk("transferable_list/move_down_highlighted");
   static final akk s = new akk("transferable_list/move_down");
   static final wu u = wu.c("pack.incompatible");
   static final wu v = wu.c("pack.incompatible.confirm.title");
   private final wu w;
   final fqx x;

   public fqy(fft $$0, fqx $$1, int $$2, int $$3, wu $$4) {
      super($$0, $$2, $$3, 33, 36);
      this.x = $$1;
      this.w = $$4;
      this.e = false;
      this.a(true, (int)(9.0F * 1.5F));
   }

   @Override
   protected void a(fhf $$0, int $$1, int $$2) {
      wu $$3 = wu.i().b(this.w).a(n.t, n.r);
      $$0.a(this.c.h, $$3, $$1 + this.g / 2 - this.c.h.a($$3) / 2, Math.min(this.E() + 3, $$2), -1, false);
   }

   @Override
   public int b() {
      return this.g;
   }

   @Override
   protected int q() {
      return this.F() - 6;
   }

   @Override
   protected void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      if (this.m()) {
         int $$6 = 2;
         int $$7 = this.s() - 2;
         int $$8 = this.F() - 6 - 1;
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
               if (fnj.t()) {
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

   public static class a extends fio.a<fqy.a> {
      private static final int b = 157;
      private static final int c = 157;
      private static final String d = "...";
      private final fqy e;
      protected final fft a;
      private final fqw.a f;
      private final axs g;
      private final fil h;
      private final axs i;
      private final fil j;

      public a(fft $$0, fqy $$1, fqw.a $$2) {
         this.a = $$0;
         this.f = $$2;
         this.e = $$1;
         this.g = a($$0, $$2.d());
         this.h = b($$0, $$2.g());
         this.i = a($$0, fqy.u);
         this.j = b($$0, $$2.b().b());
      }

      private static axs a(fft $$0, wu $$1) {
         int $$2 = $$0.h.a($$1);
         if ($$2 > 157) {
            wz $$3 = wz.a($$0.h.a($$1, 157 - $$0.h.b("...")), wz.e("..."));
            return ts.a().a($$3);
         } else {
            return $$1.g();
         }
      }

      private static fil b(fft $$0, wu $$1) {
         return fil.a($$0.h, $$1, 157, 2);
      }

      @Override
      public wu a() {
         return wu.a("narrator.select", this.f.d());
      }

      @Override
      public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         atf $$10 = this.f.b();
         if (!$$10.a()) {
            int $$11 = $$3 + $$4 - 3 - (this.e.m() ? 7 : 0);
            $$0.a($$3 - 1, $$2 - 1, $$11, $$2 + $$5 + 1, -8978432);
         }

         $$0.a(this.f.a(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         axs $$12 = this.g;
         fil $$13 = this.h;
         if (this.d() && (this.a.m.Z().c() || $$8 || this.e.h() == this && this.e.aK_())) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            int $$15 = $$7 - $$2;
            if (!this.f.b().a()) {
               $$12 = this.i;
               $$13 = this.j;
            }

            if (this.f.o()) {
               if ($$14 < 32) {
                  $$0.a(fqy.a, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqy.m, $$3, $$2, 32, 32);
               }
            } else {
               if (this.f.p()) {
                  if ($$14 < 16) {
                     $$0.a(fqy.n, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fqy.o, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.q()) {
                  if ($$14 < 32 && $$14 > 16 && $$15 < 16) {
                     $$0.a(fqy.p, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fqy.q, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.r()) {
                  if ($$14 < 32 && $$14 > 16 && $$15 > 16) {
                     $$0.a(fqy.r, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fqy.s, $$3, $$2, 32, 32);
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
            wu $$0 = this.f.b().c();
            this.a.a(new fmh($$0x -> {
               this.a.a(this.e.x);
               if ($$0x) {
                  this.f.j();
               }
            }, fqy.v, $$0));
            return false;
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)this.e.s();
         double $$4 = $$1 - (double)this.e.g(this.e.aG_().indexOf(this));
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
