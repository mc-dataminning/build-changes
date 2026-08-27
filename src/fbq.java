public class fbq extends etm<fbq.a> {
   static final aex a = new aex("transferable_list/select_highlighted");
   static final aex m = new aex("transferable_list/select");
   static final aex n = new aex("transferable_list/unselect_highlighted");
   static final aex o = new aex("transferable_list/unselect");
   static final aex p = new aex("transferable_list/move_up_highlighted");
   static final aex q = new aex("transferable_list/move_up");
   static final aex s = new aex("transferable_list/move_down_highlighted");
   static final aex t = new aex("transferable_list/move_down");
   static final tl u = tl.c("pack.incompatible");
   static final tl v = tl.c("pack.incompatible.confirm.title");
   private final tl w;
   final fbp x;

   public fbq(eqv $$0, fbp $$1, int $$2, int $$3, tl $$4) {
      super($$0, $$2, $$3, 32, $$3 - 55 + 4, 36);
      this.x = $$1;
      this.w = $$4;
      this.k = false;
      this.a(true, (int)(9.0F * 1.5F));
   }

   @Override
   protected void a(esf $$0, int $$1, int $$2) {
      tl $$3 = tl.h().b(this.w).a(n.t, n.r);
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
               if (eyk.q()) {
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

   public static class a extends etm.a<fbq.a> {
      private static final int b = 157;
      private static final int c = 157;
      private static final String d = "...";
      private final fbq e;
      protected final eqv a;
      private final fbo.a f;
      private final ark g;
      private final etj h;
      private final ark i;
      private final etj j;

      public a(eqv $$0, fbq $$1, fbo.a $$2) {
         this.a = $$0;
         this.f = $$2;
         this.e = $$1;
         this.g = a($$0, $$2.d());
         this.h = b($$0, $$2.g());
         this.i = a($$0, fbq.u);
         this.j = b($$0, $$2.b().b());
      }

      private static ark a(eqv $$0, tl $$1) {
         int $$2 = $$0.h.a($$1);
         if ($$2 > 157) {
            tp $$3 = tp.a($$0.h.a($$1, 157 - $$0.h.b("...")), tp.e("..."));
            return qs.a().a($$3);
         } else {
            return $$1.f();
         }
      }

      private static etj b(eqv $$0, tl $$1) {
         return etj.a($$0.h, $$1, 157, 2);
      }

      @Override
      public tl a() {
         return tl.a("narrator.select", this.f.d());
      }

      @Override
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         and $$10 = this.f.b();
         if (!$$10.a()) {
            $$0.a($$3 - 1, $$2 - 1, $$3 + $$4 - 3, $$2 + $$5 + 1, -8978432);
         }

         $$0.a(this.f.a(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         ark $$11 = this.g;
         etj $$12 = this.h;
         if (this.e() && (this.a.m.V().c() || $$8 || this.e.f() == this && this.e.aD_())) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$13 = $$6 - $$3;
            int $$14 = $$7 - $$2;
            if (!this.f.b().a()) {
               $$11 = this.i;
               $$12 = this.j;
            }

            if (this.f.o()) {
               if ($$13 < 32) {
                  $$0.a(fbq.a, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fbq.m, $$3, $$2, 32, 32);
               }
            } else {
               if (this.f.p()) {
                  if ($$13 < 16) {
                     $$0.a(fbq.n, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fbq.o, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.q()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 < 16) {
                     $$0.a(fbq.p, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fbq.q, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.r()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 > 16) {
                     $$0.a(fbq.s, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fbq.t, $$3, $$2, 32, 32);
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
            tl $$0 = this.f.b().c();
            this.a.a(new exd($$0x -> {
               this.a.a(this.e.x);
               if ($$0x) {
                  this.f.j();
               }
            }, fbq.v, $$0));
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
