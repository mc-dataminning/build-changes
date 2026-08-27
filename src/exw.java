public class exw extends eqc<exw.a> {
   static final acq a = new acq("textures/gui/resource_packs.png");
   static final sw l = sw.c("pack.incompatible");
   static final sw m = sw.c("pack.incompatible.confirm.title");
   private final sw n;
   final exv o;

   public exw(enn $$0, exv $$1, int $$2, int $$3, sw $$4) {
      super($$0, $$2, $$3, 32, $$3 - 55 + 4, 36);
      this.o = $$1;
      this.n = $$4;
      this.j = false;
      this.a(true, (int)(9.0F * 1.5F));
   }

   @Override
   protected void a(eox $$0, int $$1, int $$2) {
      sw $$3 = sw.h().b(this.n).a(n.t, n.r);
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
               if (euq.q()) {
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

   public static class a extends eqc.a<exw.a> {
      private static final int b = 0;
      private static final int c = 32;
      private static final int d = 64;
      private static final int e = 96;
      private static final int f = 0;
      private static final int g = 32;
      private static final int h = 157;
      private static final int i = 157;
      private static final String j = "...";
      private final exw k;
      protected final enn a;
      private final exu.a l;
      private final aom m;
      private final epz n;
      private final aom o;
      private final epz p;

      public a(enn $$0, exw $$1, exu.a $$2) {
         this.a = $$0;
         this.l = $$2;
         this.k = $$1;
         this.m = a($$0, $$2.d());
         this.n = b($$0, $$2.g());
         this.o = a($$0, exw.l);
         this.p = b($$0, $$2.b().b());
      }

      private static aom a(enn $$0, sw $$1) {
         int $$2 = $$0.h.a($$1);
         if ($$2 > 157) {
            ta $$3 = ta.a($$0.h.a($$1, 157 - $$0.h.b("...")), ta.e("..."));
            return qm.a().a($$3);
         } else {
            return $$1.f();
         }
      }

      private static epz b(enn $$0, sw $$1) {
         return epz.a($$0.h, $$1, 157, 2);
      }

      @Override
      public sw a() {
         return sw.a("narrator.select", this.l.d());
      }

      @Override
      public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         akh $$10 = this.l.b();
         if (!$$10.a()) {
            $$0.a($$3 - 1, $$2 - 1, $$3 + $$4 - 9, $$2 + $$5 + 1, -8978432);
         }

         $$0.a(this.l.a(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         aom $$11 = this.m;
         epz $$12 = this.n;
         if (this.e() && (this.a.m.U().c() || $$8 || this.k.f() == this && this.k.aB_())) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$13 = $$6 - $$3;
            int $$14 = $$7 - $$2;
            if (!this.l.b().a()) {
               $$11 = this.o;
               $$12 = this.p;
            }

            if (this.l.o()) {
               if ($$13 < 32) {
                  $$0.a(exw.a, $$3, $$2, 0.0F, 32.0F, 32, 32, 256, 256);
               } else {
                  $$0.a(exw.a, $$3, $$2, 0.0F, 0.0F, 32, 32, 256, 256);
               }
            } else {
               if (this.l.p()) {
                  if ($$13 < 16) {
                     $$0.a(exw.a, $$3, $$2, 32.0F, 32.0F, 32, 32, 256, 256);
                  } else {
                     $$0.a(exw.a, $$3, $$2, 32.0F, 0.0F, 32, 32, 256, 256);
                  }
               }

               if (this.l.q()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 < 16) {
                     $$0.a(exw.a, $$3, $$2, 96.0F, 32.0F, 32, 32, 256, 256);
                  } else {
                     $$0.a(exw.a, $$3, $$2, 96.0F, 0.0F, 32, 32, 256, 256);
                  }
               }

               if (this.l.r()) {
                  if ($$13 < 32 && $$13 > 16 && $$14 > 16) {
                     $$0.a(exw.a, $$3, $$2, 64.0F, 32.0F, 32, 32, 256, 256);
                  } else {
                     $$0.a(exw.a, $$3, $$2, 64.0F, 0.0F, 32, 32, 256, 256);
                  }
               }
            }
         }

         $$0.b(this.a.h, $$11, $$3 + 32 + 2, $$2 + 1, 16777215);
         $$12.b($$0, $$3 + 32 + 2, $$2 + 12, 10, 8421504);
      }

      public String b() {
         return this.l.c();
      }

      private boolean e() {
         return !this.l.h() || !this.l.i();
      }

      public void d() {
         if (this.l.o() && this.h()) {
            this.k.o.a(this.k);
         } else if (this.l.p()) {
            this.l.k();
            this.k.o.a(this.k);
         }
      }

      void f() {
         if (this.l.q()) {
            this.l.l();
         }
      }

      void g() {
         if (this.l.r()) {
            this.l.m();
         }
      }

      private boolean h() {
         if (this.l.b().a()) {
            this.l.j();
            return true;
         } else {
            sw $$0 = this.l.b().c();
            this.a.a(new etk($$0x -> {
               this.a.a(this.k.o);
               if ($$0x) {
                  this.l.j();
               }
            }, exw.m, $$0));
            return false;
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 != 0) {
            return false;
         } else {
            double $$3 = $$0 - (double)this.k.o();
            double $$4 = $$1 - (double)this.k.g(this.k.i().indexOf(this));
            if (this.e() && $$3 <= 32.0) {
               this.k.o.l();
               if (this.l.o()) {
                  this.h();
                  return true;
               }

               if ($$3 < 16.0 && this.l.p()) {
                  this.l.k();
                  return true;
               }

               if ($$3 > 16.0 && $$4 < 16.0 && this.l.q()) {
                  this.l.l();
                  return true;
               }

               if ($$3 > 16.0 && $$4 > 16.0 && this.l.r()) {
                  this.l.m();
                  return true;
               }
            }

            return false;
         }
      }
   }
}
