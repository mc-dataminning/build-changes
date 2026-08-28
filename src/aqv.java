import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aqv {
   private static final Logger a = LogUtils.getLogger();
   protected aqt c;
   protected final aqu d;
   private dcr b;
   @Nullable
   private dcr e;
   private boolean f;
   private int g;
   private jd h;
   private int i;
   private boolean j;
   private jd k;
   private int l;
   private int m;

   public aqv(aqu $$0) {
      this.b = dcr.e;
      this.h = jd.c;
      this.k = jd.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.A();
   }

   public boolean a(dcr $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.z();
         this.d.d.ah().a(new adz(adz.a.c, this.d));
         this.c.e();
         if ($$0 == dcr.b) {
            this.d.gB();
         }

         return true;
      }
   }

   protected void a(dcr $$0, @Nullable dcr $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.ga());
   }

   public dcr b() {
      return this.b;
   }

   @Nullable
   public dcr c() {
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
         dta $$0 = this.c.a_(this.k);
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
         dta $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.an(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dta $$0, jd $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dQ(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.an(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(jd $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(jd $$0, ahl.a $$1, ji $$2, int $$3, int $$4) {
      if (!this.d.a($$0, 1.0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.c.b(new acc($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == ahl.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.c.b(new acc($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.c.b(new acc($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dta $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               dac.a(this.c, this.d.eU(), this.d, this.d, bsx.a, eww.b($$0), $$6, $$0x -> this.d.a($$0x, bsx.a));
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dQ(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.c.b(new acc(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.an(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == ahl.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dta $$9 = this.c.a_($$0);
               if (!$$9.i()) {
                  float $$10 = $$9.a(this.d, this.d.dQ(), $$0) * (float)($$8 + 1);
                  if ($$10 >= 0.7F) {
                     this.f = false;
                     this.c.a(this.d.an(), $$0, -1);
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
         } else if ($$1 == ahl.a.b) {
            this.f = false;
            if (!Objects.equals(this.h, $$0)) {
               a.warn("Mismatch in destroy block pos: {} {}", this.h, $$0);
               this.c.a(this.d.an(), this.h, -1);
               this.a($$0, true, $$4, "aborted mismatched destroying");
            }

            this.c.a(this.d.an(), $$0, -1);
            this.a($$0, true, $$4, "aborted destroying");
         }
      }
   }

   public void a(jd $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.c.b(new acc($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(jd $$0) {
      dta $$1 = this.c.a_($$0);
      if (!this.d.eU().g().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dqf $$2 = this.c.c_($$0);
         dfw $$3 = $$1.b();
         if ($$3 instanceof dje && !this.d.gw()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dta $$4 = $$3.a(this.c, $$0, $$1, (cmv)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((dcv)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               cuo $$6 = this.d.eU();
               cuo $$7 = $$6.s();
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

   public bqq a(aqu $$0, dcu $$1, cuo $$2, bqp $$3) {
      if (this.b == dcr.d) {
         return bqq.e;
      } else if ($$0.gu().a($$2.g())) {
         return bqq.e;
      } else {
         int $$4 = $$2.H();
         int $$5 = $$2.n();
         bqr<cuo> $$6 = $$2.a($$1, $$0, $$3);
         cuo $$7 = $$6.b();
         if ($$7 == $$2 && $$7.H() == $$4 && $$7.a((btl)$$0) <= 0 && $$7.n() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bqq.f && $$7.a((btl)$$0) > 0 && !$$0.fs()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if ($$7.e()) {
               $$0.a($$3, cuo.l);
            }

            if (!$$0.fs()) {
               $$0.cc.b();
            }

            return $$6.a();
         }
      }
   }

   public bqq a(aqu $$0, dcu $$1, cuo $$2, bqp $$3, ews $$4) {
      jd $$5 = $$4.a();
      dta $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.J())) {
         return bqq.f;
      } else if (this.b == dcr.d) {
         bqu $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bqq.a;
         } else {
            return bqq.e;
         }
      } else {
         boolean $$8 = !$$0.eU().e() || !$$0.eV().e();
         boolean $$9 = $$0.fO() && $$8;
         cuo $$10 = $$2.s();
         if (!$$9) {
            bqs $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               an.N.a($$0, $$5, $$10);
               return $$11.b();
            }

            if ($$11 == bqs.d && $$3 == bqp.a) {
               bqq $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  an.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.e() && !$$0.gu().a($$2.g())) {
            cyd $$13 = new cyd($$0, $$3, $$4);
            bqq $$15;
            if (this.e()) {
               int $$14 = $$2.H();
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
            return bqq.e;
         }
      }
   }

   public void a(aqt $$0) {
      this.c = $$0;
   }
}
