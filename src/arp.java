import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class arp {
   private static final Logger a = LogUtils.getLogger();
   protected arn c;
   protected final aro d;
   private dey b;
   @Nullable
   private dey e;
   private boolean f;
   private int g;
   private jh h;
   private int i;
   private boolean j;
   private jh k;
   private int l;
   private int m;

   public arp(aro $$0) {
      this.b = dey.e;
      this.h = jh.c;
      this.k = jh.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.B();
   }

   public boolean a(dey $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.A();
         this.d.h.ag().a(new ael(ael.a.c, this.d));
         this.c.e();
         if ($$0 == dey.b) {
            this.d.gO();
         }

         return true;
      }
   }

   protected void a(dey $$0, @Nullable dey $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.gl());
   }

   public dey b() {
      return this.b;
   }

   @Nullable
   public dey c() {
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
         dvj $$0 = this.c.a_(this.k);
         if ($$0.l()) {
            this.j = false;
         } else {
            float $$1 = this.a($$0, this.k, this.l);
            if ($$1 >= 1.0F) {
               this.j = false;
               this.a(this.k);
            }
         }
      } else if (this.f) {
         dvj $$2 = this.c.a_(this.h);
         if ($$2.l()) {
            this.c.a(this.d.as(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dvj $$0, jh $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dX(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.as(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(jh $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(jh $$0, aia.a $$1, jm $$2, int $$3, int $$4) {
      if (!this.d.a($$0, 1.0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() > $$3) {
         this.d.g.b(new acn($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == aia.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.g.b(new acn($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.g.b(new acn($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dvj $$6 = this.c.a_($$0);
            if (!$$6.l()) {
               dbu.a(this.c, this.d.fb(), this.d, this.d, bum.a, ezn.b($$0), $$6, $$0x -> this.d.a($$0x, bum.a));
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dX(), $$0);
            }

            if (!$$6.l() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.g.b(new acn(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.j();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.as(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == aia.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dvj $$9 = this.c.a_($$0);
               if (!$$9.l()) {
                  float $$10 = $$9.a(this.d, this.d.dX(), $$0) * (float)($$8 + 1);
                  if ($$10 >= 0.7F) {
                     this.f = false;
                     this.c.a(this.d.as(), $$0, -1);
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
         } else if ($$1 == aia.a.b) {
            this.f = false;
            if (!Objects.equals(this.h, $$0)) {
               a.warn("Mismatch in destroy block pos: {} {}", this.h, $$0);
               this.c.a(this.d.as(), this.h, -1);
               this.a($$0, true, $$4, "aborted mismatched destroying");
            }

            this.c.a(this.d.as(), $$0, -1);
            this.a($$0, true, $$4, "aborted destroying");
         }
      }
   }

   public void a(jh $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.g.b(new acn($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(jh $$0) {
      dvj $$1 = this.c.a_($$0);
      if (!this.d.fb().h().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dsm $$2 = this.c.c_($$0);
         die $$3 = $$1.b();
         if ($$3 instanceof dll && !this.d.gH()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dvj $$4 = $$3.a(this.c, $$0, $$1, (com)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((dfc)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               cwb $$6 = this.d.fb();
               cwb $$7 = $$6.v();
               boolean $$8 = this.d.d($$4);
               $$6.a(this.c, $$4, $$0, this.d);
               if ($$5 && $$8) {
                  $$3.a(this.c, this.d, $$0, $$4, $$2, $$7);
               }

               return true;
            }
         }
      }
   }

   public bsd a(aro $$0, dfb $$1, cwb $$2, bsc $$3) {
      if (this.b == dey.d) {
         return bsd.e;
      } else if ($$0.gF().a($$2)) {
         return bsd.e;
      } else {
         int $$4 = $$2.L();
         int $$5 = $$2.o();
         bsd $$6 = $$2.a($$1, $$0, $$3);
         cwb $$8;
         if ($$6 instanceof bsd.d $$7) {
            $$8 = Objects.requireNonNullElse($$7.d(), $$0.b($$3));
         } else {
            $$8 = $$0.b($$3);
         }

         if ($$8 == $$2 && $$8.L() == $$4 && $$8.a((bva)$$0) <= 0 && $$8.o() == $$5) {
            return $$6;
         } else if ($$6 instanceof bsd.a && $$8.a((bva)$$0) > 0 && !$$0.fB()) {
            return $$6;
         } else {
            if ($$2 != $$8) {
               $$0.a($$3, $$8);
            }

            if ($$8.f()) {
               $$0.a($$3, cwb.k);
            }

            if (!$$0.fB()) {
               $$0.cc.b();
            }

            return $$6;
         }
      }
   }

   public bsd a(aro $$0, dfb $$1, cwb $$2, bsc $$3, ezj $$4) {
      jh $$5 = $$4.b();
      dvj $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.J())) {
         return bsd.d;
      } else if (this.b == dey.d) {
         bsf $$7 = $$6.c($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bsd.c;
         } else {
            return bsd.e;
         }
      } else {
         boolean $$8 = !$$0.fb().f() || !$$0.fc().f();
         boolean $$9 = $$0.ga() && $$8;
         cwb $$10 = $$2.v();
         if (!$$9) {
            bsd $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               ao.N.a($$0, $$5, $$10);
               return $$11;
            }

            if ($$11 instanceof bsd.f && $$3 == bsc.a) {
               bsd $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  ao.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.f() && !$$0.gF().a($$2)) {
            czu $$13 = new czu($$0, $$3, $$4);
            bsd $$15;
            if (this.e()) {
               int $$14 = $$2.L();
               $$15 = $$2.a($$13);
               $$2.e($$14);
            } else {
               $$15 = $$2.a($$13);
            }

            if ($$15.a()) {
               ao.N.a($$0, $$5, $$10);
            }

            return $$15;
         } else {
            return bsd.e;
         }
      }
   }

   public void a(arn $$0) {
      this.c = $$0;
   }
}
