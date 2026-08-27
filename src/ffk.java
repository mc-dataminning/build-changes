public class ffk extends exd<ffk.a> {
   static final agt a = new agt("transferable_list/select_highlighted");
   static final agt m = new agt("transferable_list/select");
   static final agt n = new agt("transferable_list/unselect_highlighted");
   static final agt o = new agt("transferable_list/unselect");
   static final agt p = new agt("transferable_list/move_up_highlighted");
   static final agt q = new agt("transferable_list/move_up");
   static final agt r = new agt("transferable_list/move_down_highlighted");
   static final agt t = new agt("transferable_list/move_down");
   static final vb u = vb.c("pack.incompatible");
   static final vb v = vb.c("pack.incompatible.confirm.title");
   private final vb w;
   final ffj x;

   public ffk(euk $$0, ffj $$1, int $$2, int $$3, vb $$4) {
      super($$0, $$2, $$3, 32, $$3 - 55 + 4, 36);
      this.x = $$1;
      this.w = $$4;
      this.k = false;
      this.a(true, (int)(9.0F * 1.5F));
   }

   @Override
   protected void a(evw $$0, int $$1, int $$2) {
      vb $$3 = vb.i().b(this.w).a(n.t, n.r);
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
               if (fcc.q()) {
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

   public static class a extends exd.a<ffk.a> {
      private static final int b = 157;
      private static final int c = 157;
      private static final String d = "...";
      private final ffk e;
      protected final euk a;
      private final ffi.a f;
      private final atk g;
      private final exa h;
      private final atk i;
      private final exa j;

      public a(euk $$0, ffk $$1, ffi.a $$2) {
         this.a = $$0;
         this.f = $$2;
         this.e = $$1;
         this.g = a($$0, $$2.d());
         this.h = b($$0, $$2.g());
         this.i = a($$0, ffk.u);
         this.j = b($$0, $$2.b().b());
      }

      private static atk a(euk $$0, vb $$1) {
         int $$2 = $$0.h.a($$1);
         if ($$2 > 157) {
            vg $$3 = vg.a($$0.h.a($$1, 157 - $$0.h.b("...")), vg.e("..."));
            return se.a().a($$3);
         } else {
            return $$1.g();
         }
      }

      private static exa b(euk $$0, vb $$1) {
         return exa.a($$0.h, $$1, 157, 2);
      }

      @Override
      public vb a() {
         return vb.a("narrator.select", this.f.d());
      }

      @Override
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         apb $$10 = this.f.b();
         if (!$$10.a()) {
            $$0.a($$3 - 1, $$2 - 1, $$3 + $$4 - 3, $$2 + $$5 + 1, -8978432);
         }

         $$0.a(this.f.a(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         atk $$11 = this.g;
         exa $$12 = this.h;
         if (this.e() && (this.a.m.W().c() || $$8 || this.e.f() == this && this.e.aJ_())) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$13 = $$6 - $$3;
            int $$14 = $$7 - $$2;
            if (!this.f.b().a()) {
               $$11 = this.i;
               $$12 = this.j;
            }

            if (this.f.o()) {
               if ($$13 < 32) {
                  $$0.a(ffk.a, $$3, $$2, 32, 32);
               } else {
                  $$0.a(ffk.m, $$3, $$2, 32, 32);
               }
            } else {
               if (this.f.p()) {
                  if ($$13 < 16) {
                     $$0.a(ffk.n, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(ffk.o, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.q()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 < 16) {
                     $$0.a(ffk.p, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(ffk.q, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.r()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 > 16) {
                     $$0.a(ffk.r, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(ffk.t, $$3, $$2, 32, 32);
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
            vb $$0 = this.f.b().c();
            this.a.a(new fav($$0x -> {
               this.a.a(this.e.x);
               if ($$0x) {
                  this.f.j();
               }
            }, ffk.v, $$0));
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
