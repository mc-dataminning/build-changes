public class fbl extends eth<fbl.a> {
   static final aeu a = new aeu("transferable_list/select_highlighted");
   static final aeu m = new aeu("transferable_list/select");
   static final aeu n = new aeu("transferable_list/unselect_highlighted");
   static final aeu o = new aeu("transferable_list/unselect");
   static final aeu p = new aeu("transferable_list/move_up_highlighted");
   static final aeu q = new aeu("transferable_list/move_up");
   static final aeu s = new aeu("transferable_list/move_down_highlighted");
   static final aeu t = new aeu("transferable_list/move_down");
   static final ti u = ti.c("pack.incompatible");
   static final ti v = ti.c("pack.incompatible.confirm.title");
   private final ti w;
   final fbk x;

   public fbl(eqq $$0, fbk $$1, int $$2, int $$3, ti $$4) {
      super($$0, $$2, $$3, 32, $$3 - 55 + 4, 36);
      this.x = $$1;
      this.w = $$4;
      this.k = false;
      this.a(true, (int)(9.0F * 1.5F));
   }

   @Override
   protected void a(esa $$0, int $$1, int $$2) {
      ti $$3 = ti.h().b(this.w).a(n.t, n.r);
      $$0.a(this.c.h, $$3, $$1 + this.e / 2 - this.c.h.a($$3) / 2, Math.min(this.g + 3, $$2), 16777215, false);
   }

   @Override
   public int b() {
      return this.e;
   }

   @Override
   protected int c() {
      return this.i - 6;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.f() != null) {
         switch ($$0) {
            case 32:
            case 257:
               this.f().d();
               return true;
            default:
               if (eyf.q()) {
                  switch ($$0) {
                     case 264:
                        this.f().g();
                        return true;
                     case 265:
                        this.f().f();
                        return true;
                  }
               }
         }
      }

      return super.a($$0, $$1, $$2);
   }

   public static class a extends eth.a<fbl.a> {
      private static final int b = 157;
      private static final int c = 157;
      private static final String d = "...";
      private final fbl e;
      protected final eqq a;
      private final fbj.a f;
      private final arf g;
      private final ete h;
      private final arf i;
      private final ete j;

      public a(eqq $$0, fbl $$1, fbj.a $$2) {
         this.a = $$0;
         this.f = $$2;
         this.e = $$1;
         this.g = a($$0, $$2.d());
         this.h = b($$0, $$2.g());
         this.i = a($$0, fbl.u);
         this.j = b($$0, $$2.b().b());
      }

      private static arf a(eqq $$0, ti $$1) {
         int $$2 = $$0.h.a($$1);
         if ($$2 > 157) {
            tm $$3 = tm.a($$0.h.a($$1, 157 - $$0.h.b("...")), tm.e("..."));
            return qp.a().a($$3);
         } else {
            return $$1.f();
         }
      }

      private static ete b(eqq $$0, ti $$1) {
         return ete.a($$0.h, $$1, 157, 2);
      }

      @Override
      public ti a() {
         return ti.a("narrator.select", this.f.d());
      }

      @Override
      public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         amy $$10 = this.f.b();
         if (!$$10.a()) {
            $$0.a($$3 - 1, $$2 - 1, $$3 + $$4 - 3, $$2 + $$5 + 1, -8978432);
         }

         $$0.a(this.f.a(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         arf $$11 = this.g;
         ete $$12 = this.h;
         if (this.e() && (this.a.m.V().c() || $$8 || this.e.f() == this && this.e.ay_())) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$13 = $$6 - $$3;
            int $$14 = $$7 - $$2;
            if (!this.f.b().a()) {
               $$11 = this.i;
               $$12 = this.j;
            }

            if (this.f.o()) {
               if ($$13 < 32) {
                  $$0.a(fbl.a, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fbl.m, $$3, $$2, 32, 32);
               }
            } else {
               if (this.f.p()) {
                  if ($$13 < 16) {
                     $$0.a(fbl.n, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fbl.o, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.q()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 < 16) {
                     $$0.a(fbl.p, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fbl.q, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.r()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 > 16) {
                     $$0.a(fbl.s, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fbl.t, $$3, $$2, 32, 32);
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

      private boolean e() {
         return !this.f.h() || !this.f.i();
      }

      public void d() {
         if (this.f.o() && this.h()) {
            this.e.x.a(this.e);
         } else if (this.f.p()) {
            this.f.k();
            this.e.x.a(this.e);
         }
      }

      void f() {
         if (this.f.q()) {
            this.f.l();
         }
      }

      void g() {
         if (this.f.r()) {
            this.f.m();
         }
      }

      private boolean h() {
         if (this.f.b().a()) {
            this.f.j();
            return true;
         } else {
            ti $$0 = this.f.b().c();
            this.a.a(new ewy($$0x -> {
               this.a.a(this.e.x);
               if ($$0x) {
                  this.f.j();
               }
            }, fbl.v, $$0));
            return false;
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)this.e.o();
         double $$4 = $$1 - (double)this.e.h(this.e.i().indexOf(this));
         if (this.e() && $$3 <= 32.0) {
            this.e.x.l();
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

         return false;
      }
   }
}
