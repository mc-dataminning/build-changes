public class fbb extends ete<fbb.a> {
   static final aep a = new aep("transferable_list/select_highlighted");
   static final aep l = new aep("transferable_list/select");
   static final aep m = new aep("transferable_list/unselect_highlighted");
   static final aep n = new aep("transferable_list/unselect");
   static final aep o = new aep("transferable_list/move_up_highlighted");
   static final aep p = new aep("transferable_list/move_up");
   static final aep q = new aep("transferable_list/move_down_highlighted");
   static final aep s = new aep("transferable_list/move_down");
   static final te t = te.c("pack.incompatible");
   static final te u = te.c("pack.incompatible.confirm.title");
   private final te v;
   final fba w;

   public fbb(eqn $$0, fba $$1, int $$2, int $$3, te $$4) {
      super($$0, $$2, $$3, 32, $$3 - 55 + 4, 36);
      this.w = $$1;
      this.v = $$4;
      this.j = false;
      this.a(true, (int)(9.0F * 1.5F));
   }

   @Override
   protected void a(erx $$0, int $$1, int $$2) {
      te $$3 = te.h().b(this.v).a(n.t, n.r);
      $$0.a(this.b.h, $$3, $$1 + this.d / 2 - this.b.h.a($$3) / 2, Math.min(this.f + 3, $$2), 16777215, false);
   }

   @Override
   public int b() {
      return this.d;
   }

   @Override
   protected int c() {
      return this.h - 6;
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
               if (exv.q()) {
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

   public static class a extends ete.a<fbb.a> {
      private static final int b = 157;
      private static final int c = 157;
      private static final String d = "...";
      private final fbb e;
      protected final eqn a;
      private final faz.a f;
      private final ara g;
      private final etb h;
      private final ara i;
      private final etb j;

      public a(eqn $$0, fbb $$1, faz.a $$2) {
         this.a = $$0;
         this.f = $$2;
         this.e = $$1;
         this.g = a($$0, $$2.d());
         this.h = b($$0, $$2.g());
         this.i = a($$0, fbb.t);
         this.j = b($$0, $$2.b().b());
      }

      private static ara a(eqn $$0, te $$1) {
         int $$2 = $$0.h.a($$1);
         if ($$2 > 157) {
            ti $$3 = ti.a($$0.h.a($$1, 157 - $$0.h.b("...")), ti.e("..."));
            return qn.a().a($$3);
         } else {
            return $$1.f();
         }
      }

      private static etb b(eqn $$0, te $$1) {
         return etb.a($$0.h, $$1, 157, 2);
      }

      @Override
      public te a() {
         return te.a("narrator.select", this.f.d());
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         amt $$10 = this.f.b();
         if (!$$10.a()) {
            $$0.a($$3 - 1, $$2 - 1, $$3 + $$4 - 9, $$2 + $$5 + 1, -8978432);
         }

         $$0.a(this.f.a(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         ara $$11 = this.g;
         etb $$12 = this.h;
         if (this.e() && (this.a.m.U().c() || $$8 || this.e.f() == this && this.e.ax_())) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$13 = $$6 - $$3;
            int $$14 = $$7 - $$2;
            if (!this.f.b().a()) {
               $$11 = this.i;
               $$12 = this.j;
            }

            if (this.f.o()) {
               if ($$13 < 32) {
                  $$0.a(fbb.a, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fbb.l, $$3, $$2, 32, 32);
               }
            } else {
               if (this.f.p()) {
                  if ($$13 < 16) {
                     $$0.a(fbb.m, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fbb.n, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.q()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 < 16) {
                     $$0.a(fbb.o, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fbb.p, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.r()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 > 16) {
                     $$0.a(fbb.q, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fbb.s, $$3, $$2, 32, 32);
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
            this.e.w.a(this.e);
         } else if (this.f.p()) {
            this.f.k();
            this.e.w.a(this.e);
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
            te $$0 = this.f.b().c();
            this.a.a(new ewo($$0x -> {
               this.a.a(this.e.w);
               if ($$0x) {
                  this.f.j();
               }
            }, fbb.u, $$0));
            return false;
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 != 0) {
            return false;
         } else {
            double $$3 = $$0 - (double)this.e.o();
            double $$4 = $$1 - (double)this.e.g(this.e.i().indexOf(this));
            if (this.e() && $$3 <= 32.0) {
               this.e.w.l();
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
}
