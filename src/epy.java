import java.util.function.Consumer;

public class epy extends epb {
   private static final int a = 1;
   private static final int b = -3092272;
   private static final String c = "_";
   private static final int d = -2039584;
   private static final int e = -857677600;
   private final eov f;
   private final sw g;
   private final eqb h;
   private int i;

   public epy(eov $$0, int $$1, int $$2, int $$3, int $$4, sw $$5, sw $$6) {
      super($$1, $$2, $$3, $$4, $$6);
      this.f = $$0;
      this.g = $$5;
      this.h = new eqb($$0, $$3 - this.b());
      this.h.a(this::w);
   }

   public void a(int $$0) {
      this.h.a($$0);
   }

   public void b(Consumer<String> $$0) {
      this.h.a($$0);
   }

   public void a(String $$0) {
      this.h.a($$0);
   }

   public String u() {
      return this.h.c();
   }

   public void v() {
      this.i++;
   }

   @Override
   public void a(esp $$0) {
      $$0.a(eso.a, sw.a("gui.narrate.editBox", this.l(), this.u()));
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.c($$0, $$1) && $$2 == 0) {
         this.h.a(euq.q());
         this.f($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else if (this.c($$0, $$1) && $$2 == 0) {
         this.h.a(true);
         this.f($$0, $$1);
         this.h.a(euq.q());
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.h.e($$0);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.s && this.aB_() && aa.a($$0)) {
         this.h.b(Character.toString($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void c(eox $$0, int $$1, int $$2, float $$3) {
      String $$4 = this.h.c();
      if ($$4.isEmpty() && !this.aB_()) {
         $$0.a(this.f, this.g, this.p() + this.a(), this.r() + this.a(), this.o - this.b(), -857677600);
      } else {
         int $$5 = this.h.d();
         boolean $$6 = this.aB_() && this.i / 6 % 2 == 0;
         boolean $$7 = $$5 < $$4.length();
         int $$8 = 0;
         int $$9 = 0;
         int $$10 = this.r() + this.a();

         for (eqb.a $$11 : this.h.h()) {
            boolean $$12 = this.a($$10, $$10 + 9);
            if ($$6 && $$7 && $$5 >= $$11.a() && $$5 <= $$11.b()) {
               if ($$12) {
                  $$8 = $$0.b(this.f, $$4.substring($$11.a(), $$5), this.p() + this.a(), $$10, -2039584) - 1;
                  $$0.a($$8, $$10 - 1, $$8 + 1, $$10 + 1 + 9, -3092272);
                  $$0.b(this.f, $$4.substring($$5, $$11.b()), $$8, $$10, -2039584);
               }
            } else {
               if ($$12) {
                  $$8 = $$0.b(this.f, $$4.substring($$11.a(), $$11.b()), this.p() + this.a(), $$10, -2039584) - 1;
               }

               $$9 = $$10;
            }

            $$10 += 9;
         }

         if ($$6 && !$$7 && this.a($$9, $$9 + 9)) {
            $$0.b(this.f, "_", $$8, $$9, -3092272);
         }

         if (this.h.i()) {
            eqb.a $$13 = this.h.e();
            int $$14 = this.p() + this.a();
            $$10 = this.r() + this.a();

            for (eqb.a $$15 : this.h.h()) {
               if ($$13.a() > $$15.b()) {
                  $$10 += 9;
               } else {
                  if ($$15.a() > $$13.b()) {
                     break;
                  }

                  if (this.a($$10, $$10 + 9)) {
                     int $$16 = this.f.b($$4.substring($$15.a(), Math.max($$13.a(), $$15.a())));
                     int $$17;
                     if ($$13.b() > $$15.b()) {
                        $$17 = this.o - this.a();
                     } else {
                        $$17 = this.f.b($$4.substring($$15.a(), $$13.b()));
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
   protected void a(eox $$0) {
      super.a($$0);
      if (this.h.b()) {
         int $$1 = this.h.a();
         sw $$2 = sw.a("gui.multiLineEditBox.character_limit", this.h.c().length(), $$1);
         $$0.b(this.f, $$2, this.p() + this.o - this.f.a($$2), this.r() + this.p + 4, 10526880);
      }
   }

   @Override
   public int f() {
      return 9 * this.h.f();
   }

   @Override
   protected boolean e() {
      return (double)this.h.f() > this.x();
   }

   @Override
   protected double g() {
      return 9.0 / 2.0;
   }

   private void b(eox $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.a(fkf.E(), $$1, $$2, $$3, $$4, -16776961);
   }

   private void w() {
      double $$0 = this.c();
      eqb.a $$1 = this.h.c((int)($$0 / 9.0));
      if (this.h.d() <= $$1.a()) {
         $$0 = (double)(this.h.g() * 9);
      } else {
         eqb.a $$2 = this.h.c((int)(($$0 + (double)this.p) / 9.0) - 1);
         if (this.h.d() > $$2.b()) {
            $$0 = (double)(this.h.g() * 9 - this.p + 9 + this.b());
         }
      }

      this.a($$0);
   }

   private double x() {
      return (double)(this.p - this.b()) / 9.0;
   }

   private void f(double $$0, double $$1) {
      double $$2 = $$0 - (double)this.p() - (double)this.a();
      double $$3 = $$1 - (double)this.r() - (double)this.a() + this.c();
      this.h.a($$2, $$3);
   }
}
