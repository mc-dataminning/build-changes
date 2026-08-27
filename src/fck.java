public class fck extends euf<fck.a> {
   static final afw a = new afw("transferable_list/select_highlighted");
   static final afw m = new afw("transferable_list/select");
   static final afw n = new afw("transferable_list/unselect_highlighted");
   static final afw o = new afw("transferable_list/unselect");
   static final afw p = new afw("transferable_list/move_up_highlighted");
   static final afw q = new afw("transferable_list/move_up");
   static final afw s = new afw("transferable_list/move_down_highlighted");
   static final afw t = new afw("transferable_list/move_down");
   static final ui u = ui.c("pack.incompatible");
   static final ui v = ui.c("pack.incompatible.confirm.title");
   private final ui w;
   final fcj x;

   public fck(ero $$0, fcj $$1, int $$2, int $$3, ui $$4) {
      super($$0, $$2, $$3, 32, $$3 - 55 + 4, 36);
      this.x = $$1;
      this.w = $$4;
      this.k = false;
      this.a(true, (int)(9.0F * 1.5F));
   }

   @Override
   protected void a(esy $$0, int $$1, int $$2) {
      ui $$3 = ui.i().b(this.w).a(n.t, n.r);
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
               if (ezd.q()) {
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

   public static class a extends euf.a<fck.a> {
      private static final int b = 157;
      private static final int c = 157;
      private static final String d = "...";
      private final fck e;
      protected final ero a;
      private final fci.a f;
      private final ask g;
      private final euc h;
      private final ask i;
      private final euc j;

      public a(ero $$0, fck $$1, fci.a $$2) {
         this.a = $$0;
         this.f = $$2;
         this.e = $$1;
         this.g = a($$0, $$2.d());
         this.h = b($$0, $$2.g());
         this.i = a($$0, fck.u);
         this.j = b($$0, $$2.b().b());
      }

      private static ask a(ero $$0, ui $$1) {
         int $$2 = $$0.h.a($$1);
         if ($$2 > 157) {
            un $$3 = un.a($$0.h.a($$1, 157 - $$0.h.b("...")), un.e("..."));
            return ro.a().a($$3);
         } else {
            return $$1.g();
         }
      }

      private static euc b(ero $$0, ui $$1) {
         return euc.a($$0.h, $$1, 157, 2);
      }

      @Override
      public ui a() {
         return ui.a("narrator.select", this.f.d());
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         aoc $$10 = this.f.b();
         if (!$$10.a()) {
            $$0.a($$3 - 1, $$2 - 1, $$3 + $$4 - 3, $$2 + $$5 + 1, -8978432);
         }

         $$0.a(this.f.a(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         ask $$11 = this.g;
         euc $$12 = this.h;
         if (this.e() && (this.a.m.V().c() || $$8 || this.e.f() == this && this.e.aG_())) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$13 = $$6 - $$3;
            int $$14 = $$7 - $$2;
            if (!this.f.b().a()) {
               $$11 = this.i;
               $$12 = this.j;
            }

            if (this.f.o()) {
               if ($$13 < 32) {
                  $$0.a(fck.a, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fck.m, $$3, $$2, 32, 32);
               }
            } else {
               if (this.f.p()) {
                  if ($$13 < 16) {
                     $$0.a(fck.n, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fck.o, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.q()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 < 16) {
                     $$0.a(fck.p, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fck.q, $$3, $$2, 32, 32);
                  }
               }

               if (this.f.r()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 > 16) {
                     $$0.a(fck.s, $$3, $$2, 32, 32);
                  } else {
                     $$0.a(fck.t, $$3, $$2, 32, 32);
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
            ui $$0 = this.f.b().c();
            this.a.a(new exx($$0x -> {
               this.a.a(this.e.x);
               if ($$0x) {
                  this.f.j();
               }
            }, fck.v, $$0));
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
