import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aks {
   private static final Logger a = LogUtils.getLogger();
   protected akq c;
   protected final akr d;
   private cps b;
   @Nullable
   private cps e;
   private boolean f;
   private int g;
   private gw h;
   private int i;
   private boolean j;
   private gw k;
   private int l;
   private int m;

   public aks(akr $$0) {
      this.b = cps.e;
      this.h = gw.b;
      this.k = gw.b;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.x();
   }

   public boolean a(cps $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.w();
         this.d.d.ac().a(new za(za.a.c, this.d));
         this.c.e();
         return true;
      }
   }

   protected void a(cps $$0, @Nullable cps $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.fS());
   }

   public cps b() {
      return this.b;
   }

   @Nullable
   public cps c() {
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
         dfj $$0 = this.c.a_(this.k);
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
         dfj $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.ah(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dfj $$0, gw $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dL(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.ah(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(gw $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(gw $$0, ace.a $$1, ha $$2, int $$3, int $$4) {
      if (this.d.bp().g(ehn.b($$0)) > alp.d) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.c.b(new xf($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == ace.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.c.b(new xf($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.c.b(new xf($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dfj $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dL(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.c.b(new xf(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.ah(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == ace.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dfj $$9 = this.c.a_($$0);
               if (!$$9.i()) {
                  float $$10 = $$9.a(this.d, this.d.dL(), $$0) * (float)($$8 + 1);
                  if ($$10 >= 0.7F) {
                     this.f = false;
                     this.c.a(this.d.ah(), $$0, -1);
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
         } else if ($$1 == ace.a.b) {
            this.f = false;
            if (!Objects.equals(this.h, $$0)) {
               a.warn("Mismatch in destroy block pos: {} {}", this.h, $$0);
               this.c.a(this.d.ah(), this.h, -1);
               this.a($$0, true, $$4, "aborted mismatched destroying");
            }

            this.c.a(this.d.ah(), $$0, -1);
            this.a($$0, true, $$4, "aborted destroying");
         }
      }
   }

   public void a(gw $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.c.b(new xf($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(gw $$0) {
      dfj $$1 = this.c.a_($$0);
      if (!this.d.eS().d().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dcv $$2 = this.c.c_($$0);
         csv $$3 = $$1.b();
         if ($$3 instanceof cvz && !this.d.go()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            $$3.a(this.c, $$0, $$1, (cbu)this.d);
            boolean $$4 = this.c.a($$0, false);
            if ($$4) {
               $$3.a((cpw)this.c, $$0, $$1);
            }

            if (this.e()) {
               return true;
            } else {
               cjf $$5 = this.d.eS();
               cjf $$6 = $$5.p();
               boolean $$7 = this.d.e($$1);
               $$5.a(this.c, $$1, $$0, this.d);
               if ($$4 && $$7) {
                  $$3.a(this.c, this.d, $$0, $$1, $$2, $$6);
               }

               return true;
            }
         }
      }
   }

   public bgy a(akr $$0, cpv $$1, cjf $$2, bgx $$3) {
      if (this.b == cps.d) {
         return bgy.d;
      } else if ($$0.gm().a($$2.d())) {
         return bgy.d;
      } else {
         int $$4 = $$2.L();
         int $$5 = $$2.k();
         bgz<cjf> $$6 = $$2.a($$1, $$0, $$3);
         cjf $$7 = $$6.b();
         if ($$7 == $$2 && $$7.L() == $$4 && $$7.r() <= 0 && $$7.k() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bgy.e && $$7.r() > 0 && !$$0.fm()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if (this.e() && $$7 != cjf.b) {
               $$7.f($$4);
               if ($$7.i() && $$7.k() != $$5) {
                  $$7.b($$5);
               }
            }

            if ($$7.b()) {
               $$0.a($$3, cjf.b);
            }

            if (!$$0.fm()) {
               $$0.bR.b();
            }

            return $$6.a();
         }
      }
   }

   public bgy a(akr $$0, cpv $$1, cjf $$2, bgx $$3, ehj $$4) {
      gw $$5 = $$4.a();
      dfj $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.G())) {
         return bgy.e;
      } else if (this.b == cps.d) {
         bhb $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bgy.a;
         } else {
            return bgy.d;
         }
      } else {
         boolean $$8 = !$$0.eS().b() || !$$0.eT().b();
         boolean $$9 = $$0.fH() && $$8;
         cjf $$10 = $$2.p();
         if (!$$9) {
            bgy $$11 = $$6.a($$1, $$0, $$3, $$4);
            if ($$11.a()) {
               al.M.a($$0, $$5, $$10);
               return $$11;
            }
         }

         if (!$$2.b() && !$$0.gm().a($$2.d())) {
            clp $$12 = new clp($$0, $$3, $$4);
            bgy $$14;
            if (this.e()) {
               int $$13 = $$2.L();
               $$14 = $$2.a($$12);
               $$2.f($$13);
            } else {
               $$14 = $$2.a($$12);
            }

            if ($$14.a()) {
               al.M.a($$0, $$5, $$10);
            }

            return $$14;
         } else {
            return bgy.d;
         }
      }
   }

   public void a(akq $$0) {
      this.c = $$0;
   }
}
