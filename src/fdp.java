public class fdp extends evi<fdp.a> {
   static final agg a = new agg("transferable_list/select_highlighted");
   static final agg m = new agg("transferable_list/select");
   static final agg n = new agg("transferable_list/unselect_highlighted");
   static final agg o = new agg("transferable_list/unselect");
   static final agg p = new agg("transferable_list/move_up_highlighted");
   static final agg q = new agg("transferable_list/move_up");
   static final agg r = new agg("transferable_list/move_down_highlighted");
   static final agg t = new agg("transferable_list/move_down");
   static final ur u = ur.c("pack.incompatible");
   static final ur v = ur.c("pack.incompatible.confirm.title");
   private final ur w;
   final fdo x;

   public fdp(esr $$0, fdo $$1, int $$2, int $$3, ur $$4) {
      super($$0, $$2, $$3, 32, $$3 - 55 + 4, 36);
      this.x = $$1;
      this.w = $$4;
      this.k = false;
      this.a(true, (int)(9.0F * 1.5F));
   }

   @Override
   protected void a(eub $$0, int $$1, int $$2) {
      ur $$3 = ur.i().b(this.w).a(n.t, n.r);
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
               this.f().c();
               return true;
            default:
               if (fah.q()) {
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

   public static class a extends evi.a<fdp.a> {
      private static final int b = 157;
      private static final int c = 157;
      private static final String d = "...";
      private final fdp e;
      protected final esr a;
      private final fdn.a f;
      private final asu g;
      private final evf h;
      private final asu i;
      private final evf j;

      public a(esr $$0, fdp $$1, fdn.a $$2) {
         this.a = $$0;
         this.f = $$2;
         this.e = $$1;
         this.g = a($$0, $$2.d());
         this.h = b($$0, $$2.g());
         this.i = a($$0, fdp.u);
         this.j = b($$0, $$2.b().b());
      }

      private static asu a(esr $$0, ur $$1) {
         int $$2 = $$0.h.a($$1);
         if ($$2 > 157) {
            uw $$3 = uw.a($$0.h.a($$1, 157 - $$0.h.b("...")), uw.e("..."));
            return ru.a().a($$3);
         } else {
            return $$1.g();
         }
      }

      private static evf b(esr $$0, ur $$1) {
         return evf.a($$0.h, $$1, 157, 2);
      }

      @Override
      public ur a() {
         return ur.a("narrator.select", this.f.d());
      }

      @Override
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         aom $$10 = this.f.b();
         if (!$$10.a()) {
            $$0.a($$3 - 1, $$2 - 1, $$3 + $$4 - 3, $$2 + $$5 + 1, -8978432);
         }

         $$0.a(this.f.a(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         asu $$11 = this.g;
         evf $$12 = this.h;
         if (this.e() && (this.a.m.W().c() || $$8 || this.e.f() == this && this.e.aI_())) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$13 = $$6 - $$3;
            int $$14 = $$7 - $$2;
            if (!this.f.b().a()) {
               $$11 = this.i;
               $$12 = this.j;
            }

            if (this.f.o()) {
               if ($$13 < 32) {
                  $$0.a(fdp.a, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fdp.m, $$3, $$2, 32, 32);
               }
            } else {
               if (this.f.p()) {
                  if ($$13 < 16) {
                     $$0.a(fdp.n, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fdp.o, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.q()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 < 16) {
                     $$0.a(fdp.p, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fdp.q, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.r()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 > 16) {
                     $$0.a(fdp.r, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fdp.t, $$3, $$2, 32, 32);
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

      public void c() {
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
            ur $$0 = this.f.b().c();
            this.a.a(new eza($$0x -> {
               this.a.a(this.e.x);
               if ($$0x) {
                  this.f.j();
               }
            }, fdp.v, $$0));
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
