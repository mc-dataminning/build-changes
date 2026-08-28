import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class arl {
   private static final Logger a = LogUtils.getLogger();
   protected arj c;
   protected final ark d;
   private deg b;
   @Nullable
   private deg e;
   private boolean f;
   private int g;
   private jf h;
   private int i;
   private boolean j;
   private jf k;
   private int l;
   private int m;

   public arl(ark $$0) {
      this.b = deg.e;
      this.h = jf.c;
      this.k = jf.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.B();
   }

   public boolean a(deg $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.A();
         this.d.d.ag().a(new aeh(aeh.a.c, this.d));
         this.c.e();
         if ($$0 == deg.b) {
            this.d.gH();
         }

         return true;
      }
   }

   protected void a(deg $$0, @Nullable deg $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.ge());
   }

   public deg b() {
      return this.b;
   }

   @Nullable
   public deg c() {
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
         dus $$0 = this.c.a_(this.k);
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
         dus $$2 = this.c.a_(this.h);
         if ($$2.l()) {
            this.c.a(this.d.ap(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dus $$0, jf $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dS(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.ap(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(jf $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(jf $$0, ahw.a $$1, jk $$2, int $$3, int $$4) {
      if (!this.d.a($$0, 1.0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() > $$3) {
         this.d.c.b(new acj($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == ahw.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.c.b(new acj($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.c.b(new acj($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dus $$6 = this.c.a_($$0);
            if (!$$6.l()) {
               dbp.a(this.c, this.d.eW(), this.d, this.d, btz.a, eyw.b($$0), $$6, $$0x -> this.d.a($$0x, btz.a));
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dS(), $$0);
            }

            if (!$$6.l() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.c.b(new acj(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.j();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.ap(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == ahw.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dus $$9 = this.c.a_($$0);
               if (!$$9.l()) {
                  float $$10 = $$9.a(this.d, this.d.dS(), $$0) * (float)($$8 + 1);
                  if ($$10 >= 0.7F) {
                     this.f = false;
                     this.c.a(this.d.ap(), $$0, -1);
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
         } else if ($$1 == ahw.a.b) {
            this.f = false;
            if (!Objects.equals(this.h, $$0)) {
               a.warn("Mismatch in destroy block pos: {} {}", this.h, $$0);
               this.c.a(this.d.ap(), this.h, -1);
               this.a($$0, true, $$4, "aborted mismatched destroying");
            }

            this.c.a(this.d.ap(), $$0, -1);
            this.a($$0, true, $$4, "aborted destroying");
         }
      }
   }

   public void a(jf $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.c.b(new acj($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(jf $$0) {
      dus $$1 = this.c.a_($$0);
      if (!this.d.eW().h().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         drv $$2 = this.c.c_($$0);
         dhm $$3 = $$1.b();
         if ($$3 instanceof dku && !this.d.gA()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dus $$4 = $$3.a(this.c, $$0, $$1, (cnx)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((dek)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               cvs $$6 = this.d.eW();
               cvs $$7 = $$6.u();
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

   public brs a(ark $$0, dej $$1, cvs $$2, brr $$3) {
      if (this.b == deg.d) {
         return brs.e;
      } else if ($$0.gy().a($$2)) {
         return brs.e;
      } else {
         int $$4 = $$2.K();
         int $$5 = $$2.o();
         brs $$6 = $$2.a($$1, $$0, $$3);
         cvs $$8;
         if ($$6 instanceof brs.d $$7) {
            $$8 = Objects.requireNonNullElse($$7.d(), $$0.b($$3));
         } else {
            $$8 = $$0.b($$3);
         }

         if ($$8 == $$2 && $$8.K() == $$4 && $$8.a((bun)$$0) <= 0 && $$8.o() == $$5) {
            return $$6;
         } else if ($$6 instanceof brs.a && $$8.a((bun)$$0) > 0 && !$$0.fv()) {
            return $$6;
         } else {
            if ($$2 != $$8) {
               $$0.a($$3, $$8);
            }

            if ($$8.f()) {
               $$0.a($$3, cvs.k);
            }

            if (!$$0.fv()) {
               $$0.bY.b();
            }

            return $$6;
         }
      }
   }

   public brs a(ark $$0, dej $$1, cvs $$2, brr $$3, eys $$4) {
      jf $$5 = $$4.b();
      dus $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.J())) {
         return brs.d;
      } else if (this.b == deg.d) {
         bru $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return brs.c;
         } else {
            return brs.e;
         }
      } else {
         boolean $$8 = !$$0.eW().f() || !$$0.eX().f();
         boolean $$9 = $$0.fT() && $$8;
         cvs $$10 = $$2.u();
         if (!$$9) {
            brs $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               an.N.a($$0, $$5, $$10);
               return $$11;
            }

            if ($$11 instanceof brs.f && $$3 == brr.a) {
               brs $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  an.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.f() && !$$0.gy().a($$2)) {
            czp $$13 = new czp($$0, $$3, $$4);
            brs $$15;
            if (this.e()) {
               int $$14 = $$2.K();
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
            return brs.e;
         }
      }
   }

   public void a(arj $$0) {
      this.c = $$0;
   }
}
