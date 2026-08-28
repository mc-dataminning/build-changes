import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class arh {
   private static final Logger a = LogUtils.getLogger();
   protected arf c;
   protected final arg d;
   private dbv b;
   @Nullable
   private dbv e;
   private boolean f;
   private int g;
   private iz h;
   private int i;
   private boolean j;
   private iz k;
   private int l;
   private int m;

   public arh(arg $$0) {
      this.b = dbv.e;
      this.h = iz.c;
      this.k = iz.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.z();
   }

   public boolean a(dbv $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.y();
         this.d.d.ah().a(new aeo(aeo.a.c, this.d));
         this.c.e();
         if ($$0 == dbv.b) {
            this.d.gE();
         }

         return true;
      }
   }

   protected void a(dbv $$0, @Nullable dbv $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.gd());
   }

   public dbv b() {
      return this.b;
   }

   @Nullable
   public dbv c() {
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
         dsc $$0 = this.c.a_(this.k);
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
         dsc $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.al(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dsc $$0, iz $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dP(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.al(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(iz $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(iz $$0, aia.a $$1, je $$2, int $$3, int $$4) {
      if (!this.d.a($$0, 1.0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.c.b(new acr($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == aia.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.c.b(new acr($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.c.b(new acr($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dsc $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dP(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.c.b(new acr(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.al(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == aia.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dsc $$9 = this.c.a_($$0);
               if (!$$9.i()) {
                  float $$10 = $$9.a(this.d, this.d.dP(), $$0) * (float)($$8 + 1);
                  if ($$10 >= 0.7F) {
                     this.f = false;
                     this.c.a(this.d.al(), $$0, -1);
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
               this.c.a(this.d.al(), this.h, -1);
               this.a($$0, true, $$4, "aborted mismatched destroying");
            }

            this.c.a(this.d.al(), $$0, -1);
            this.a($$0, true, $$4, "aborted destroying");
         }
      }
   }

   public void a(iz $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.c.b(new acr($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(iz $$0) {
      dsc $$1 = this.c.a_($$0);
      if (!this.d.eX().g().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dph $$2 = this.c.c_($$0);
         dez $$3 = $$1.b();
         if ($$3 instanceof dih && !this.d.gz()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dsc $$4 = $$3.a(this.c, $$0, $$1, (cmx)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((dbz)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               cup $$6 = this.d.eX();
               cup $$7 = $$6.s();
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

   public bqu a(arg $$0, dby $$1, cup $$2, bqt $$3) {
      if (this.b == dbv.d) {
         return bqu.e;
      } else if ($$0.gx().a($$2.g())) {
         return bqu.e;
      } else {
         int $$4 = $$2.I();
         int $$5 = $$2.n();
         bqv<cup> $$6 = $$2.a($$1, $$0, $$3);
         cup $$7 = $$6.b();
         if ($$7 == $$2 && $$7.I() == $$4 && $$7.u() <= 0 && $$7.n() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bqu.f && $$7.u() > 0 && !$$0.fv()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if ($$7.e()) {
               $$0.a($$3, cup.l);
            }

            if (!$$0.fv()) {
               $$0.ca.b();
            }

            return $$6.a();
         }
      }
   }

   public bqu a(arg $$0, dby $$1, cup $$2, bqt $$3, evn $$4) {
      iz $$5 = $$4.a();
      dsc $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.J())) {
         return bqu.f;
      } else if (this.b == dbv.d) {
         bqy $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bqu.a;
         } else {
            return bqu.e;
         }
      } else {
         boolean $$8 = !$$0.eX().e() || !$$0.eY().e();
         boolean $$9 = $$0.fR() && $$8;
         cup $$10 = $$2.s();
         if (!$$9) {
            bqw $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               am.N.a($$0, $$5, $$10);
               return $$11.b();
            }

            if ($$11 == bqw.d && $$3 == bqt.a) {
               bqu $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  am.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.e() && !$$0.gx().a($$2.g())) {
            cyc $$13 = new cyc($$0, $$3, $$4);
            bqu $$15;
            if (this.e()) {
               int $$14 = $$2.I();
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
            return bqu.e;
         }
      }
   }

   public void a(arf $$0) {
      this.c = $$0;
   }
}
