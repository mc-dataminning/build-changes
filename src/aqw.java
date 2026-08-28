import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aqw {
   private static final Logger a = LogUtils.getLogger();
   protected aqu c;
   protected final aqv d;
   private dct b;
   @Nullable
   private dct e;
   private boolean f;
   private int g;
   private jd h;
   private int i;
   private boolean j;
   private jd k;
   private int l;
   private int m;

   public aqw(aqv $$0) {
      this.b = dct.e;
      this.h = jd.c;
      this.k = jd.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.A();
   }

   public boolean a(dct $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.z();
         this.d.d.ah().a(new aea(aea.a.c, this.d));
         this.c.e();
         if ($$0 == dct.b) {
            this.d.gB();
         }

         return true;
      }
   }

   protected void a(dct $$0, @Nullable dct $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.fZ());
   }

   public dct b() {
      return this.b;
   }

   @Nullable
   public dct c() {
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
            this.c.a(this.d.an(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dtc $$0, jd $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dO(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.an(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(jd $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(jd $$0, ahm.a $$1, ji $$2, int $$3, int $$4) {
      if (!this.d.a($$0, 1.0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.c.b(new acd($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == ahm.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.c.b(new acd($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.c.b(new acd($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dtc $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               dae.a(this.c, this.d.eT(), this.d, this.d, bsy.a, exc.b($$0), $$6, $$0x -> this.d.a($$0x, bsy.a));
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dO(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.c.b(new acd(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.j();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.an(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == ahm.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dtc $$9 = this.c.a_($$0);
               if (!$$9.i()) {
                  float $$10 = $$9.a(this.d, this.d.dO(), $$0) * (float)($$8 + 1);
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
         } else if ($$1 == ahm.a.b) {
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
         this.d.c.b(new acd($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(jd $$0) {
      dtc $$1 = this.c.a_($$0);
      if (!this.d.eT().g().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dqh $$2 = this.c.c_($$0);
         dfy $$3 = $$1.b();
         if ($$3 instanceof djg && !this.d.gv()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dtc $$4 = $$3.a(this.c, $$0, $$1, (cmx)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((dcx)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               cuq $$6 = this.d.eT();
               cuq $$7 = $$6.s();
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

   public bqr a(aqv $$0, dcw $$1, cuq $$2, bqq $$3) {
      if (this.b == dct.d) {
         return bqr.e;
      } else if ($$0.gt().a($$2.g())) {
         return bqr.e;
      } else {
         int $$4 = $$2.H();
         int $$5 = $$2.n();
         bqs<cuq> $$6 = $$2.a($$1, $$0, $$3);
         cuq $$7 = $$6.b();
         if ($$7 == $$2 && $$7.H() == $$4 && $$7.a((btn)$$0) <= 0 && $$7.n() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bqr.f && $$7.a((btn)$$0) > 0 && !$$0.fr()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if ($$7.e()) {
               $$0.a($$3, cuq.l);
            }

            if (!$$0.fr()) {
               $$0.cc.b();
            }

            return $$6.a();
         }
      }
   }

   public bqr a(aqv $$0, dcw $$1, cuq $$2, bqq $$3, ewy $$4) {
      jd $$5 = $$4.a();
      dtc $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.J())) {
         return bqr.f;
      } else if (this.b == dct.d) {
         bqv $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bqr.a;
         } else {
            return bqr.e;
         }
      } else {
         boolean $$8 = !$$0.eT().e() || !$$0.eU().e();
         boolean $$9 = $$0.fN() && $$8;
         cuq $$10 = $$2.s();
         if (!$$9) {
            bqt $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               an.N.a($$0, $$5, $$10);
               return $$11.b();
            }

            if ($$11 == bqt.d && $$3 == bqq.a) {
               bqr $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  an.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.e() && !$$0.gt().a($$2.g())) {
            cyf $$13 = new cyf($$0, $$3, $$4);
            bqr $$15;
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
            return bqr.e;
         }
      }
   }

   public void a(aqu $$0) {
      this.c = $$0;
   }
}
