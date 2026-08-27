import java.util.function.Consumer;

public class eve extends eug {
   private static final int a = 1;
   private static final int b = -3092272;
   private static final String c = "_";
   private static final int d = -2039584;
   private static final int e = -857677600;
   private static final int l = 300;
   private final etz m;
   private final ur n;
   private final evh o;
   private long p = ac.b();

   public eve(etz $$0, int $$1, int $$2, int $$3, int $$4, ur $$5, ur $$6) {
      super($$1, $$2, $$3, $$4, $$6);
      this.m = $$0;
      this.n = $$5;
      this.o = new evh($$0, $$3 - this.b());
      this.o.a(this::v);
   }

   public void a(int $$0) {
      this.o.a($$0);
   }

   public void b(Consumer<String> $$0) {
      this.o.a($$0);
   }

   public void a(String $$0) {
      this.o.a($$0);
   }

   public String u() {
      return this.o.c();
   }

   @Override
   public void a(eyf $$0) {
      $$0.a(eye.a, ur.a("gui.narrate.editBox", this.l(), this.u()));
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.c($$0, $$1) && $$2 == 0) {
         this.o.a(fah.q());
         this.f($$0, $$1);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else if (this.c($$0, $$1) && $$2 == 0) {
         this.o.a(true);
         this.f($$0, $$1);
         this.o.a(fah.q());
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.o.e($$0);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.j && this.aI_() && aa.a($$0)) {
         this.o.b(Character.toString($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void c(eub $$0, int $$1, int $$2, float $$3) {
      String $$4 = this.o.c();
      if ($$4.isEmpty() && !this.aI_()) {
         $$0.a(this.m, this.n, this.p() + this.a(), this.r() + this.a(), this.f - this.b(), -857677600);
      } else {
         int $$5 = this.o.d();
         boolean $$6 = this.aI_() && (ac.b() - this.p) / 300L % 2L == 0L;
         boolean $$7 = $$5 < $$4.length();
         int $$8 = 0;
         int $$9 = 0;
         int $$10 = this.r() + this.a();

         for (evh.a $$11 : this.o.h()) {
            boolean $$12 = this.a($$10, $$10 + 9);
            if ($$6 && $$7 && $$5 >= $$11.a() && $$5 <= $$11.b()) {
               if ($$12) {
                  $$8 = $$0.b(this.m, $$4.substring($$11.a(), $$5), this.p() + this.a(), $$10, -2039584) - 1;
                  $$0.a($$8, $$10 - 1, $$8 + 1, $$10 + 1 + 9, -3092272);
                  $$0.b(this.m, $$4.substring($$5, $$11.b()), $$8, $$10, -2039584);
               }
            } else {
               if ($$12) {
                  $$8 = $$0.b(this.m, $$4.substring($$11.a(), $$11.b()), this.p() + this.a(), $$10, -2039584) - 1;
               }

               $$9 = $$10;
            }

            $$10 += 9;
         }

         if ($$6 && !$$7 && this.a($$9, $$9 + 9)) {
            $$0.b(this.m, "_", $$8, $$9, -3092272);
         }

         if (this.o.i()) {
            evh.a $$13 = this.o.e();
            int $$14 = this.p() + this.a();
            $$10 = this.r() + this.a();

            for (evh.a $$15 : this.o.h()) {
               if ($$13.a() > $$15.b()) {
                  $$10 += 9;
               } else {
                  if ($$15.a() > $$13.b()) {
                     break;
                  }

                  if (this.a($$10, $$10 + 9)) {
                     int $$16 = this.m.b($$4.substring($$15.a(), Math.max($$13.a(), $$15.a())));
                     int $$17;
                     if ($$13.b() > $$15.b()) {
                        $$17 = this.f - this.a();
                     } else {
                        $$17 = this.m.b($$4.substring($$15.a(), $$13.b()));
                     }

                     this.b($$0, $$14 + $$16, $$10, $$14 + $$17, $$10 + 9);
                  }

                  $$10 += 9;
               }
            }
         }
      }
   }

   @Override
   protected void a(eub $$0) {
      super.a($$0);
      if (this.o.b()) {
         int $$1 = this.o.a();
         ur $$2 = ur.a("gui.multiLineEditBox.character_limit", this.o.c().length(), $$1);
         $$0.b(this.m, $$2, this.p() + this.f - this.m.a($$2), this.r() + this.g + 4, 10526880);
      }
   }

   @Override
   public int g() {
      return 9 * this.o.f();
   }

   @Override
   protected boolean e() {
      return (double)this.o.f() > this.w();
   }

   @Override
   protected double h() {
      return 9.0 / 2.0;
   }

   private void b(eub $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.a(fqp.D(), $$1, $$2, $$3, $$4, -16776961);
   }

   private void v() {
      double $$0 = this.c();
      evh.a $$1 = this.o.c((int)($$0 / 9.0));
      if (this.o.d() <= $$1.a()) {
         $$0 = (double)(this.o.g() * 9);
      } else {
         evh.a $$2 = this.o.c((int)(($$0 + (double)this.g) / 9.0) - 1);
         if (this.o.d() > $$2.b()) {
            $$0 = (double)(this.o.g() * 9 - this.g + 9 + this.b());
         }
      }

      this.a($$0);
   }

   private double w() {
      return (double)(this.g - this.b()) / 9.0;
   }

   private void f(double $$0, double $$1) {
      double $$2 = $$0 - (double)this.p() - (double)this.a();
      double $$3 = $$1 - (double)this.r() - (double)this.a() + this.c();
      this.o.a($$2, $$3);
   }

   @Override
   public void b_(boolean $$0) {
      super.b_($$0);
      if ($$0) {
         this.p = ac.b();
      }
   }
}
