import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class amc {
   private static final Logger a = LogUtils.getLogger();
   protected ama c;
   protected final amb d;
   private crp b;
   @Nullable
   private crp e;
   private boolean f;
   private int g;
   private ht h;
   private int i;
   private boolean j;
   private ht k;
   private int l;
   private int m;

   public amc(amb $$0) {
      this.b = crp.e;
      this.h = ht.b;
      this.k = ht.b;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.x();
   }

   public boolean a(crp $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.w();
         this.d.d.ac().a(new aah(aah.a.c, this.d));
         this.c.e();
         return true;
      }
   }

   protected void a(crp $$0, @Nullable crp $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.fT());
   }

   public crp b() {
      return this.b;
   }

   @Nullable
   public crp c() {
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
         dgw $$0 = this.c.a_(this.k);
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
         dgw $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.ah(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dgw $$0, ht $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dL(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.ah(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(ht $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(ht $$0, adm.a $$1, hx $$2, int $$3, int $$4) {
      if (this.d.bp().g(eji.b($$0)) > amz.d) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.c.b(new ym($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == adm.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.c.b(new ym($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.c.b(new ym($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dgw $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dL(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.c.b(new ym(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.ah(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == adm.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dgw $$9 = this.c.a_($$0);
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
         } else if ($$1 == adm.a.b) {
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

   public void a(ht $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.c.b(new ym($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(ht $$0) {
      dgw $$1 = this.c.a_($$0);
      if (!this.d.eS().d().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         der $$2 = this.c.c_($$0);
         cut $$3 = $$1.b();
         if ($$3 instanceof cya && !this.d.gp()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dgw $$4 = $$3.a(this.c, $$0, $$1, (cdm)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((crt)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               clb $$6 = this.d.eS();
               clb $$7 = $$6.p();
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

   public biq a(amb $$0, crs $$1, clb $$2, bip $$3) {
      if (this.b == crp.d) {
         return biq.d;
      } else if ($$0.gn().a($$2.d())) {
         return biq.d;
      } else {
         int $$4 = $$2.L();
         int $$5 = $$2.k();
         bir<clb> $$6 = $$2.a($$1, $$0, $$3);
         clb $$7 = $$6.b();
         if ($$7 == $$2 && $$7.L() == $$4 && $$7.r() <= 0 && $$7.k() == $$5) {
            return $$6.a();
         } else if ($$6.a() == biq.e && $$7.r() > 0 && !$$0.fn()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if (this.e() && $$7 != clb.b) {
               $$7.f($$4);
               if ($$7.i() && $$7.k() != $$5) {
                  $$7.b($$5);
               }
            }

            if ($$7.b()) {
               $$0.a($$3, clb.b);
            }

            if (!$$0.fn()) {
               $$0.bR.b();
            }

            return $$6.a();
         }
      }
   }

   public biq a(amb $$0, crs $$1, clb $$2, bip $$3, eje $$4) {
      ht $$5 = $$4.a();
      dgw $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.G())) {
         return biq.e;
      } else if (this.b == crp.d) {
         bit $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return biq.a;
         } else {
            return biq.d;
         }
      } else {
         boolean $$8 = !$$0.eS().b() || !$$0.eT().b();
         boolean $$9 = $$0.fI() && $$8;
         clb $$10 = $$2.p();
         if (!$$9) {
            biq $$11 = $$6.a($$1, $$0, $$3, $$4);
            if ($$11.a()) {
               al.M.a($$0, $$5, $$10);
               return $$11;
            }
         }

         if (!$$2.b() && !$$0.gn().a($$2.d())) {
            cnl $$12 = new cnl($$0, $$3, $$4);
            biq $$14;
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
            return biq.d;
         }
      }
   }

   public void a(ama $$0) {
      this.c = $$0;
   }
}
