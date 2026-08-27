import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ang {
   private static final Logger a = LogUtils.getLogger();
   protected ane c;
   protected final anf d;
   private ctu b;
   @Nullable
   private ctu e;
   private boolean f;
   private int g;
   private hx h;
   private int i;
   private boolean j;
   private hx k;
   private int l;
   private int m;

   public ang(anf $$0) {
      this.b = ctu.e;
      this.h = hx.b;
      this.k = hx.b;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.z();
   }

   public boolean a(ctu $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.y();
         this.d.d.ae().a(new abf(abf.a.c, this.d));
         this.c.e();
         return true;
      }
   }

   protected void a(ctu $$0, @Nullable ctu $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.fT());
   }

   public ctu b() {
      return this.b;
   }

   @Nullable
   public ctu c() {
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
         djp $$0 = this.c.a_(this.k);
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
         djp $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.aj(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(djp $$0, hx $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dL(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.aj(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(hx $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(hx $$0, aen.a $$1, ic $$2, int $$3, int $$4) {
      if (!this.d.d($$0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.c.b(new zk($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == aen.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.c.b(new zk($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.c.b(new zk($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            djp $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dL(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.c.b(new zk(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.aj(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == aen.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               djp $$9 = this.c.a_($$0);
               if (!$$9.i()) {
                  float $$10 = $$9.a(this.d, this.d.dL(), $$0) * (float)($$8 + 1);
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
         } else if ($$1 == aen.a.b) {
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

   public void a(hx $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.c.b(new zk($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(hx $$0) {
      djp $$1 = this.c.a_($$0);
      if (!this.d.eT().d().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dhd $$2 = this.c.c_($$0);
         cwy $$3 = $$1.b();
         if ($$3 instanceof dag && !this.d.gp()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            djp $$4 = $$3.a(this.c, $$0, $$1, (cfq)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((cty)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               cng $$6 = this.d.eT();
               cng $$7 = $$6.p();
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

   public bkc a(anf $$0, ctx $$1, cng $$2, bkb $$3) {
      if (this.b == ctu.d) {
         return bkc.d;
      } else if ($$0.gn().a($$2.d())) {
         return bkc.d;
      } else {
         int $$4 = $$2.L();
         int $$5 = $$2.k();
         bkd<cng> $$6 = $$2.a($$1, $$0, $$3);
         cng $$7 = $$6.b();
         if ($$7 == $$2 && $$7.L() == $$4 && $$7.r() <= 0 && $$7.k() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bkc.e && $$7.r() > 0 && !$$0.fn()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if ($$7.b()) {
               $$0.a($$3, cng.f);
            }

            if (!$$0.fn()) {
               $$0.bV.b();
            }

            return $$6.a();
         }
      }
   }

   public bkc a(anf $$0, ctx $$1, cng $$2, bkb $$3, ely $$4) {
      hx $$5 = $$4.a();
      djp $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.I())) {
         return bkc.e;
      } else if (this.b == ctu.d) {
         bkg $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bkc.a;
         } else {
            return bkc.d;
         }
      } else {
         boolean $$8 = !$$0.eT().b() || !$$0.eU().b();
         boolean $$9 = $$0.fI() && $$8;
         cng $$10 = $$2.p();
         if (!$$9) {
            bke $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               am.N.a($$0, $$5, $$10);
               return $$11.b();
            }

            if ($$11 == bke.d && $$3 == bkb.a) {
               bkc $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  return $$12;
               }
            }
         }

         if (!$$2.b() && !$$0.gn().a($$2.d())) {
            cpr $$13 = new cpr($$0, $$3, $$4);
            bkc $$15;
            if (this.e()) {
               int $$14 = $$2.L();
               $$15 = $$2.a($$13);
               $$2.f($$14);
            } else {
               $$15 = $$2.a($$13);
            }

            if ($$15.a()) {
               am.N.a($$0, $$5, $$10);
            }

            return $$15;
         } else {
            return bkc.d;
         }
      }
   }

   public void a(ane $$0) {
      this.c = $$0;
   }
}
