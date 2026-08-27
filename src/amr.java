import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class amr {
   private static final Logger a = LogUtils.getLogger();
   protected amp c;
   protected final amq d;
   private csv b;
   @Nullable
   private csv e;
   private boolean f;
   private int g;
   private hv h;
   private int i;
   private boolean j;
   private hv k;
   private int l;
   private int m;

   public amr(amq $$0) {
      this.b = csv.e;
      this.h = hv.b;
      this.k = hv.b;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.z();
   }

   public boolean a(csv $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.y();
         this.d.d.ae().a(new aas(aas.a.c, this.d));
         this.c.e();
         return true;
      }
   }

   protected void a(csv $$0, @Nullable csv $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.fT());
   }

   public csv b() {
      return this.b;
   }

   @Nullable
   public csv c() {
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
         dip $$0 = this.c.a_(this.k);
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
         dip $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.aj(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dip $$0, hv $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dM(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.aj(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(hv $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(hv $$0, adz.a $$1, ia $$2, int $$3, int $$4) {
      if (this.d.br().g(elb.b($$0)) > ano.d) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.c.b(new yx($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == adz.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.c.b(new yx($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.c.b(new yx($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dip $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dM(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.c.b(new yx(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.aj(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == adz.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dip $$9 = this.c.a_($$0);
               if (!$$9.i()) {
                  float $$10 = $$9.a(this.d, this.d.dM(), $$0) * (float)($$8 + 1);
                  if ($$10 >= 0.7F) {
                     this.f = false;
                     this.c.a(this.d.aj(), $$0, -1);
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
         } else if ($$1 == adz.a.b) {
            this.f = false;
            if (!Objects.equals(this.h, $$0)) {
               a.warn("Mismatch in destroy block pos: {} {}", this.h, $$0);
               this.c.a(this.d.aj(), this.h, -1);
               this.a($$0, true, $$4, "aborted mismatched destroying");
            }

            this.c.a(this.d.aj(), $$0, -1);
            this.a($$0, true, $$4, "aborted destroying");
         }
      }
   }

   public void a(hv $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.c.b(new yx($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(hv $$0) {
      dip $$1 = this.c.a_($$0);
      if (!this.d.eT().d().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dgd $$2 = this.c.c_($$0);
         cvz $$3 = $$1.b();
         if ($$3 instanceof czh && !this.d.gp()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dip $$4 = $$3.a(this.c, $$0, $$1, (cer)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((csz)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               cmh $$6 = this.d.eT();
               cmh $$7 = $$6.p();
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

   public bjl a(amq $$0, csy $$1, cmh $$2, bjk $$3) {
      if (this.b == csv.d) {
         return bjl.d;
      } else if ($$0.gn().a($$2.d())) {
         return bjl.d;
      } else {
         int $$4 = $$2.L();
         int $$5 = $$2.k();
         bjm<cmh> $$6 = $$2.a($$1, $$0, $$3);
         cmh $$7 = $$6.b();
         if ($$7 == $$2 && $$7.L() == $$4 && $$7.r() <= 0 && $$7.k() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bjl.e && $$7.r() > 0 && !$$0.fn()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if (this.e() && $$7 != cmh.f) {
               $$7.f($$4);
               if ($$7.i() && $$7.k() != $$5) {
                  $$7.b($$5);
               }
            }

            if ($$7.b()) {
               $$0.a($$3, cmh.f);
            }

            if (!$$0.fn()) {
               $$0.bR.b();
            }

            return $$6.a();
         }
      }
   }

   public bjl a(amq $$0, csy $$1, cmh $$2, bjk $$3, ekx $$4) {
      hv $$5 = $$4.a();
      dip $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.H())) {
         return bjl.e;
      } else if (this.b == csv.d) {
         bjo $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bjl.a;
         } else {
            return bjl.d;
         }
      } else {
         boolean $$8 = !$$0.eT().b() || !$$0.eU().b();
         boolean $$9 = $$0.fI() && $$8;
         cmh $$10 = $$2.p();
         if (!$$9) {
            bjl $$11 = $$6.a($$1, $$0, $$3, $$4);
            if ($$11.a()) {
               am.N.a($$0, $$5, $$10);
               return $$11;
            }
         }

         if (!$$2.b() && !$$0.gn().a($$2.d())) {
            cos $$12 = new cos($$0, $$3, $$4);
            bjl $$14;
            if (this.e()) {
               int $$13 = $$2.L();
               $$14 = $$2.a($$12);
               $$2.f($$13);
            } else {
               $$14 = $$2.a($$12);
            }

            if ($$14.a()) {
               am.N.a($$0, $$5, $$10);
            }

            return $$14;
         } else {
            return bjl.d;
         }
      }
   }

   public void a(amp $$0) {
      this.c = $$0;
   }
}
