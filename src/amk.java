import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class amk {
   private static final Logger a = LogUtils.getLogger();
   protected ami c;
   protected final amj d;
   private csc b;
   @Nullable
   private csc e;
   private boolean f;
   private int g;
   private hx h;
   private int i;
   private boolean j;
   private hx k;
   private int l;
   private int m;

   public amk(amj $$0) {
      this.b = csc.e;
      this.h = hx.b;
      this.k = hx.b;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.z();
   }

   public boolean a(csc $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.y();
         this.d.d.ae().a(new aal(aal.a.c, this.d));
         this.c.e();
         return true;
      }
   }

   protected void a(csc $$0, @Nullable csc $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.fU());
   }

   public csc b() {
      return this.b;
   }

   @Nullable
   public csc c() {
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
         dhn $$0 = this.c.a_(this.k);
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
         dhn $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.aj(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dhn $$0, hx $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dN(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.aj(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(hx $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(hx $$0, ads.a $$1, ib $$2, int $$3, int $$4) {
      if (this.d.br().g(ejz.b($$0)) > anh.d) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.c.b(new yq($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == ads.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.c.b(new yq($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.c.b(new yq($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dhn $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dN(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.c.b(new yq(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.aj(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == ads.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dhn $$9 = this.c.a_($$0);
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
         } else if ($$1 == ads.a.b) {
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
         this.d.c.b(new yq($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(hx $$0) {
      dhn $$1 = this.c.a_($$0);
      if (!this.d.eU().d().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dfi $$2 = this.c.c_($$0);
         cvf $$3 = $$1.b();
         if ($$3 instanceof cyn && !this.d.gq()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dhn $$4 = $$3.a(this.c, $$0, $$1, (cdz)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((csg)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               clo $$6 = this.d.eU();
               clo $$7 = $$6.p();
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

   public bjb a(amj $$0, csf $$1, clo $$2, bja $$3) {
      if (this.b == csc.d) {
         return bjb.d;
      } else if ($$0.go().a($$2.d())) {
         return bjb.d;
      } else {
         int $$4 = $$2.L();
         int $$5 = $$2.k();
         bjc<clo> $$6 = $$2.a($$1, $$0, $$3);
         clo $$7 = $$6.b();
         if ($$7 == $$2 && $$7.L() == $$4 && $$7.r() <= 0 && $$7.k() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bjb.e && $$7.r() > 0 && !$$0.fo()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if (this.e() && $$7 != clo.b) {
               $$7.f($$4);
               if ($$7.i() && $$7.k() != $$5) {
                  $$7.b($$5);
               }
            }

            if ($$7.b()) {
               $$0.a($$3, clo.b);
            }

            if (!$$0.fo()) {
               $$0.bR.b();
            }

            return $$6.a();
         }
      }
   }

   public bjb a(amj $$0, csf $$1, clo $$2, bja $$3, ejv $$4) {
      hx $$5 = $$4.a();
      dhn $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.H())) {
         return bjb.e;
      } else if (this.b == csc.d) {
         bje $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bjb.a;
         } else {
            return bjb.d;
         }
      } else {
         boolean $$8 = !$$0.eU().b() || !$$0.eV().b();
         boolean $$9 = $$0.fJ() && $$8;
         clo $$10 = $$2.p();
         if (!$$9) {
            bjb $$11 = $$6.a($$1, $$0, $$3, $$4);
            if ($$11.a()) {
               al.M.a($$0, $$5, $$10);
               return $$11;
            }
         }

         if (!$$2.b() && !$$0.go().a($$2.d())) {
            cny $$12 = new cny($$0, $$3, $$4);
            bjb $$14;
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
            return bjb.d;
         }
      }
   }

   public void a(ami $$0) {
      this.c = $$0;
   }
}
