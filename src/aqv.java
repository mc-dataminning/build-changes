import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aqv {
   private static final Logger a = LogUtils.getLogger();
   protected aqt c;
   protected final aqu d;
   private dbx b;
   @Nullable
   private dbx e;
   private boolean f;
   private int g;
   private ir h;
   private int i;
   private boolean j;
   private ir k;
   private int l;
   private int m;

   public aqv(aqu $$0) {
      this.b = dbx.e;
      this.h = ir.c;
      this.k = ir.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.B();
   }

   public boolean a(dbx $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.A();
         this.d.e.ah().a(new aed(aed.a.c, this.d));
         this.c.e();
         if ($$0 == dbx.b) {
            this.d.gP();
         }

         return true;
      }
   }

   protected void a(dbx $$0, @Nullable dbx $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.gm());
   }

   public dbx b() {
      return this.b;
   }

   @Nullable
   public dbx c() {
      return this.e;
   }

   public boolean d() {
      return this.b.h();
   }

   public boolean e() {
      return this.b.g();
   }

   public void a() {
      this.i++;
      if (this.j) {
         dtc $$0 = this.c.a_(this.k);
         if ($$0.i()) {
            this.j = false;
         } else {
            float $$1 = this.a($$0, this.k, this.l);
            if ($$1 >= 1.0F) {
               this.j = false;
               this.a(this.k);
            }
         }
      } else if (this.f) {
         dtc $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.al(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dtc $$0, ir $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dU(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.al(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(ir $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(ir $$0, aho.a $$1, iw $$2, int $$3, int $$4) {
      if (!this.d.a($$0, 1.0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.d.b(new acg($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == aho.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.d.b(new acg($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.d.b(new acg($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dtc $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dU(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.d.b(new acg(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.al(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == aho.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dtc $$9 = this.c.a_($$0);
               if (!$$9.i()) {
                  float $$10 = $$9.a(this.d, this.d.dU(), $$0) * (float)($$8 + 1);
                  if ($$10 >= 0.7F) {
                     this.f = false;
                     this.c.a(this.d.al(), $$0, -1);
                     this.a($$0, $$4, "destroyed");
                     return;
                  }

                  if (!this.j) {
                     this.f = false;
                     this.j = true;
                     this.k = $$0;
                     this.l = this.g;
                  }
               }
            }

            this.a($$0, true, $$4, "stopped destroying");
         } else if ($$1 == aho.a.b) {
            this.f = false;
            if (!Objects.equals(this.h, $$0)) {
               a.warn("Mismatch in destroy block pos: {} {}", this.h, $$0);
               this.c.a(this.d.al(), this.h, -1);
               this.a($$0, true, $$4, "aborted mismatched destroying");
            }

            this.c.a(this.d.al(), $$0, -1);
            this.a($$0, true, $$4, "aborted destroying");
         }
      }
   }

   public void a(ir $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.d.b(new acg($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(ir $$0) {
      dtc $$1 = this.c.a_($$0);
      if (!this.d.fg().f().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dqc $$2 = this.c.c_($$0);
         dfc $$3 = $$1.b();
         if ($$3 instanceof dio && !this.d.gK()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dtc $$4 = $$3.a(this.c, $$0, $$1, (cly)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((dcb)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               cuh $$6 = this.d.fg();
               cuh $$7 = $$6.r();
               boolean $$8 = this.d.e($$4);
               $$6.a(this.c, $$4, $$0, this.d);
               if ($$5 && $$8) {
                  $$3.a(this.c, this.d, $$0, $$4, $$2, $$7);
               }

               return true;
            }
         }
      }
   }

   public bqa a(aqu $$0, dca $$1, cuh $$2, bpz $$3) {
      if (this.b == dbx.d) {
         return bqa.d;
      } else if ($$0.gI().a($$2.f())) {
         return bqa.d;
      } else {
         int $$4 = $$2.G();
         int $$5 = $$2.m();
         bqb<cuh> $$6 = $$2.a($$1, $$0, $$3);
         cuh $$7 = $$6.b();
         if ($$7 == $$2 && $$7.G() == $$4 && $$7.t() <= 0 && $$7.m() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bqa.e && $$7.t() > 0 && !$$0.fE()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if ($$7.d()) {
               $$0.a($$3, cuh.i);
            }

            if (!$$0.fE()) {
               $$0.cp.b();
            }

            return $$6.a();
         }
      }
   }

   public bqa a(aqu $$0, dca $$1, cuh $$2, bpz $$3, ewq $$4) {
      ir $$5 = $$4.a();
      dtc $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.K())) {
         return bqa.e;
      } else if (this.b == dbx.d) {
         bqe $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bqa.a;
         } else {
            return bqa.d;
         }
      } else {
         boolean $$8 = !$$0.fg().d() || !$$0.fh().d();
         boolean $$9 = $$0.ga() && $$8;
         cuh $$10 = $$2.r();
         if (!$$9) {
            bqc $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               an.N.a($$0, $$5, $$10);
               return $$11.b();
            }

            if ($$11 == bqc.d && $$3 == bpz.a) {
               bqa $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  an.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.d() && !$$0.gI().a($$2.f())) {
            cyf $$13 = new cyf($$0, $$3, $$4);
            bqa $$15;
            if (this.e()) {
               int $$14 = $$2.G();
               $$15 = $$2.a($$13);
               $$2.e($$14);
            } else {
               $$15 = $$2.a($$13);
            }

            if ($$15.a()) {
               an.N.a($$0, $$5, $$10);
            }

            return $$15;
         } else {
            return bqa.d;
         }
      }
   }

   public void a(aqt $$0) {
      this.c = $$0;
   }
}
