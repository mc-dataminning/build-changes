import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aqj {
   private static final Logger a = LogUtils.getLogger();
   protected aqh c;
   protected final aqi d;
   private daa b;
   @Nullable
   private daa e;
   private boolean f;
   private int g;
   private in h;
   private int i;
   private boolean j;
   private in k;
   private int l;
   private int m;

   public aqj(aqi $$0) {
      this.b = daa.e;
      this.h = in.c;
      this.k = in.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.z();
   }

   public boolean a(daa $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.y();
         this.d.e.ah().a(new ads(ads.a.c, this.d));
         this.c.e();
         if ($$0 == daa.b) {
            this.d.gC();
         }

         return true;
      }
   }

   protected void a(daa $$0, @Nullable daa $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.gb());
   }

   public daa b() {
      return this.b;
   }

   @Nullable
   public daa c() {
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
         dqh $$0 = this.c.a_(this.k);
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
         dqh $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.aj(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dqh $$0, in $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dN(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.aj(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(in $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(in $$0, ahc.a $$1, is $$2, int $$3, int $$4) {
      if (!this.d.a($$0, 1.0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.d.b(new abv($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == ahc.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.d.b(new abv($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.d.b(new abv($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dqh $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dN(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.d.b(new abv(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.aj(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == ahc.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dqh $$9 = this.c.a_($$0);
               if (!$$9.i()) {
                  float $$10 = $$9.a(this.d, this.d.dN(), $$0) * (float)($$8 + 1);
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
         } else if ($$1 == ahc.a.b) {
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

   public void a(in $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.d.b(new abv($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(in $$0) {
      dqh $$1 = this.c.a_($$0);
      if (!this.d.eV().f().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dnm $$2 = this.c.c_($$0);
         dde $$3 = $$1.b();
         if ($$3 instanceof dgm && !this.d.gx()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dqh $$4 = $$3.a(this.c, $$0, $$1, (clh)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((dae)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               csz $$6 = this.d.eV();
               csz $$7 = $$6.r();
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

   public bpm a(aqi $$0, dad $$1, csz $$2, bpl $$3) {
      if (this.b == daa.d) {
         return bpm.d;
      } else if ($$0.gv().a($$2.f())) {
         return bpm.d;
      } else {
         int $$4 = $$2.G();
         int $$5 = $$2.m();
         bpn<csz> $$6 = $$2.a($$1, $$0, $$3);
         csz $$7 = $$6.b();
         if ($$7 == $$2 && $$7.G() == $$4 && $$7.t() <= 0 && $$7.m() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bpm.e && $$7.t() > 0 && !$$0.ft()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if ($$7.d()) {
               $$0.a($$3, csz.i);
            }

            if (!$$0.ft()) {
               $$0.cb.b();
            }

            return $$6.a();
         }
      }
   }

   public bpm a(aqi $$0, dad $$1, csz $$2, bpl $$3, etl $$4) {
      in $$5 = $$4.a();
      dqh $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.J())) {
         return bpm.e;
      } else if (this.b == daa.d) {
         bpq $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bpm.a;
         } else {
            return bpm.d;
         }
      } else {
         boolean $$8 = !$$0.eV().d() || !$$0.eW().d();
         boolean $$9 = $$0.fP() && $$8;
         csz $$10 = $$2.r();
         if (!$$9) {
            bpo $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               am.N.a($$0, $$5, $$10);
               return $$11.b();
            }

            if ($$11 == bpo.d && $$3 == bpl.a) {
               bpm $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  am.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.d() && !$$0.gv().a($$2.f())) {
            cwk $$13 = new cwk($$0, $$3, $$4);
            bpm $$15;
            if (this.e()) {
               int $$14 = $$2.G();
               $$15 = $$2.a($$13);
               $$2.e($$14);
            } else {
               $$15 = $$2.a($$13);
            }

            if ($$15.a()) {
               am.N.a($$0, $$5, $$10);
            }

            return $$15;
         } else {
            return bpm.d;
         }
      }
   }

   public void a(aqh $$0) {
      this.c = $$0;
   }
}
