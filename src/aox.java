import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aox {
   private static final Logger a = LogUtils.getLogger();
   protected aov c;
   protected final aow d;
   private cvk b;
   @Nullable
   private cvk e;
   private boolean f;
   private int g;
   private hz h;
   private int i;
   private boolean j;
   private hz k;
   private int l;
   private int m;

   public aox(aow $$0) {
      this.b = cvk.e;
      this.h = hz.c;
      this.k = hz.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.z();
   }

   public boolean a(cvk $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.y();
         this.d.e.ae().a(new acl(acl.a.c, this.d));
         this.c.e();
         return true;
      }
   }

   protected void a(cvk $$0, @Nullable cvk $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.fU());
   }

   public cvk b() {
      return this.b;
   }

   @Nullable
   public cvk c() {
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
         dlf $$0 = this.c.a_(this.k);
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
         dlf $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.aj(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dlf $$0, hz $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dM(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.aj(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(hz $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(hz $$0, afu.a $$1, ie $$2, int $$3, int $$4) {
      if (!this.d.a($$0, 1.0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.d.b(new aap($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == afu.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.d.b(new aap($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.d.b(new aap($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dlf $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dM(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.d.b(new aap(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.aj(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == afu.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dlf $$9 = this.c.a_($$0);
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
         } else if ($$1 == afu.a.b) {
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

   public void a(hz $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.d.b(new aap($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(hz $$0) {
      dlf $$1 = this.c.a_($$0);
      if (!this.d.eT().d().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dit $$2 = this.c.c_($$0);
         cyo $$3 = $$1.b();
         if ($$3 instanceof dbw && !this.d.gq()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dlf $$4 = $$3.a(this.c, $$0, $$1, (chh)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((cvo)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               coz $$6 = this.d.eT();
               coz $$7 = $$6.q();
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

   public blu a(aow $$0, cvn $$1, coz $$2, blt $$3) {
      if (this.b == cvk.d) {
         return blu.d;
      } else if ($$0.go().a($$2.d())) {
         return blu.d;
      } else {
         int $$4 = $$2.M();
         int $$5 = $$2.l();
         blv<coz> $$6 = $$2.a($$1, $$0, $$3);
         coz $$7 = $$6.b();
         if ($$7 == $$2 && $$7.M() == $$4 && $$7.s() <= 0 && $$7.l() == $$5) {
            return $$6.a();
         } else if ($$6.a() == blu.e && $$7.s() > 0 && !$$0.fn()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if ($$7.b()) {
               $$0.a($$3, coz.h);
            }

            if (!$$0.fn()) {
               $$0.bV.b();
            }

            return $$6.a();
         }
      }
   }

   public blu a(aow $$0, cvn $$1, coz $$2, blt $$3, eno $$4) {
      hz $$5 = $$4.a();
      dlf $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.I())) {
         return blu.e;
      } else if (this.b == cvk.d) {
         bly $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return blu.a;
         } else {
            return blu.d;
         }
      } else {
         boolean $$8 = !$$0.eT().b() || !$$0.eU().b();
         boolean $$9 = $$0.fI() && $$8;
         coz $$10 = $$2.q();
         if (!$$9) {
            blw $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               am.N.a($$0, $$5, $$10);
               return $$11.b();
            }

            if ($$11 == blw.d && $$3 == blt.a) {
               blu $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  am.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.b() && !$$0.go().a($$2.d())) {
            cri $$13 = new cri($$0, $$3, $$4);
            blu $$15;
            if (this.e()) {
               int $$14 = $$2.M();
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
            return blu.d;
         }
      }
   }

   public void a(aov $$0) {
      this.c = $$0;
   }
}
