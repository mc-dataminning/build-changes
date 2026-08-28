import java.util.function.Consumer;

public class ftb extends fsg {
   private static final int a = 1;
   private static final int c = -3092272;
   private static final String d = "_";
   private static final int e = -2039584;
   private static final int f = -857677600;
   private static final int m = 300;
   private final frt n;
   private final wy o;
   private final fte p;
   private long q = af.c();

   public ftb(frt $$0, int $$1, int $$2, int $$3, int $$4, wy $$5, wy $$6) {
      super($$1, $$2, $$3, $$4, $$6);
      this.n = $$0;
      this.o = $$5;
      this.p = new fte($$0, $$3 - this.b());
      this.p.a(this::r);
   }

   public void a(int $$0) {
      this.p.a($$0);
   }

   public void b(Consumer<String> $$0) {
      this.p.a($$0);
   }

   public void a(String $$0) {
      this.p.a($$0);
   }

   public String q() {
      return this.p.c();
   }

   @Override
   public void a(fwg $$0) {
      $$0.a(fwf.a, wy.a("gui.narrate.editBox", this.B(), this.q()));
   }

   @Override
   public void a(double $$0, double $$1) {
      this.p.a(fyb.t());
      this.c($$0, $$1);
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p.a(true);
      this.c($$0, $$1);
      this.p.a(fyb.t());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.p.e($$0);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.k && this.aJ_() && bal.a($$0)) {
         this.p.b(Character.toString($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void c(frv $$0, int $$1, int $$2, float $$3) {
      String $$4 = this.p.c();
      if ($$4.isEmpty() && !this.aJ_()) {
         $$0.a(this.n, (xd)this.o, this.e(), this.p(), this.g - this.b(), -857677600);
      } else {
         int $$5 = this.p.d();
         boolean $$6 = this.aJ_() && (af.c() - this.q) / 300L % 2L == 0L;
         boolean $$7 = $$5 < $$4.length();
         int $$8 = 0;
         int $$9 = 0;
         int $$10 = this.p();

         for (fte.a $$11 : this.p.h()) {
            boolean $$12 = this.a($$10, $$10 + 9);
            if ($$6 && $$7 && $$5 >= $$11.a() && $$5 <= $$11.b()) {
               if ($$12) {
                  $$8 = $$0.b(this.n, $$4.substring($$11.a(), $$5), this.e(), $$10, -2039584) - 1;
                  $$0.a($$8, $$10 - 1, $$8 + 1, $$10 + 1 + 9, -3092272);
                  $$0.b(this.n, $$4.substring($$5, $$11.b()), $$8, $$10, -2039584);
               }
            } else {
               if ($$12) {
                  $$8 = $$0.b(this.n, $$4.substring($$11.a(), $$11.b()), this.e(), $$10, -2039584) - 1;
               }

               $$9 = $$10;
            }

            $$10 += 9;
         }

         if ($$6 && !$$7 && this.a($$9, $$9 + 9)) {
            $$0.b(this.n, "_", $$8, $$9, -3092272);
         }

         if (this.p.i()) {
            fte.a $$13 = this.p.e();
            int $$14 = this.e();
            $$10 = this.p();

            for (fte.a $$15 : this.p.h()) {
               if ($$13.a() > $$15.b()) {
                  $$10 += 9;
               } else {
                  if ($$15.a() > $$13.b()) {
                     break;
                  }

                  if (this.a($$10, $$10 + 9)) {
                     int $$16 = this.n.b($$4.substring($$15.a(), Math.max($$13.a(), $$15.a())));
                     int $$17;
                     if ($$13.b() > $$15.b()) {
                        $$17 = this.g - this.a();
                     } else {
                        $$17 = this.n.b($$4.substring($$15.a(), $$13.b()));
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
   protected void b(frv $$0) {
      super.b($$0);
      if (this.p.b()) {
         int $$1 = this.p.a();
         wy $$2 = wy.a("gui.multiLineEditBox.character_limit", this.p.c().length(), $$1);
         $$0.b(this.n, $$2, this.F() + this.g - this.n.a($$2), this.G() + this.h + 4, 10526880);
      }
   }

   @Override
   public int c() {
      return 9 * this.p.f();
   }

   @Override
   protected double o() {
      return 9.0 / 2.0;
   }

   private void b(frv $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.a(gqk.O(), $$1, $$2, $$3, $$4, -16776961);
   }

   private void r() {
      double $$0 = this.g();
      fte.a $$1 = this.p.c((int)($$0 / 9.0));
      if (this.p.d() <= $$1.a()) {
         $$0 = (double)(this.p.g() * 9);
      } else {
         fte.a $$2 = this.p.c((int)(($$0 + (double)this.h) / 9.0) - 1);
         if (this.p.d() > $$2.b()) {
            $$0 = (double)(this.p.g() * 9 - this.h + 9 + this.b());
         }
      }

      this.a($$0);
   }

   private void c(double $$0, double $$1) {
      double $$2 = $$0 - (double)this.F() - (double)this.a();
      double $$3 = $$1 - (double)this.G() - (double)this.a() + this.g();
      this.p.a($$2, $$3);
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if ($$0) {
         this.q = af.c();
      }
   }
}
