import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aqo {
   private static final Logger a = LogUtils.getLogger();
   protected aqm c;
   protected final aqn d;
   private dcd b;
   @Nullable
   private dcd e;
   private boolean f;
   private int g;
   private ja h;
   private int i;
   private boolean j;
   private ja k;
   private int l;
   private int m;

   public aqo(aqn $$0) {
      this.b = dcd.e;
      this.h = ja.c;
      this.k = ja.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.A();
   }

   public boolean a(dcd $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.z();
         this.d.d.ai().a(new adt(adt.a.c, this.d));
         this.c.e();
         if ($$0 == dcd.b) {
            this.d.gC();
         }

         return true;
      }
   }

   protected void a(dcd $$0, @Nullable dcd $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.gb());
   }

   public dcd b() {
      return this.b;
   }

   @Nullable
   public dcd c() {
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
         dsl $$0 = this.c.a_(this.k);
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
         dsl $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.an(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dsl $$0, ja $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dR(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.an(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(ja $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(ja $$0, ahf.a $$1, jf $$2, int $$3, int $$4) {
      if (!this.d.a($$0, 1.0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.c.b(new abw($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == ahf.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.c.b(new abw($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.c.b(new abw($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dsl $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               czo.a(this.c, this.d.eV(), this.d, this.d, bso.a, ewh.b($$0), $$0x -> this.d.a($$0x, bso.a));
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dR(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.c.b(new abw(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.an(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == ahf.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dsl $$9 = this.c.a_($$0);
               if (!$$9.i()) {
                  float $$10 = $$9.a(this.d, this.d.dR(), $$0) * (float)($$8 + 1);
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
         } else if ($$1 == ahf.a.b) {
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

   public void a(ja $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.c.b(new abw($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(ja $$0) {
      dsl $$1 = this.c.a_($$0);
      if (!this.d.eV().g().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dpq $$2 = this.c.c_($$0);
         dfi $$3 = $$1.b();
         if ($$3 instanceof diq && !this.d.gx()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dsl $$4 = $$3.a(this.c, $$0, $$1, (cml)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((dch)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               cud $$6 = this.d.eV();
               cud $$7 = $$6.s();
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

   public bqh a(aqn $$0, dcg $$1, cud $$2, bqg $$3) {
      if (this.b == dcd.d) {
         return bqh.e;
      } else if ($$0.gv().a($$2.g())) {
         return bqh.e;
      } else {
         int $$4 = $$2.H();
         int $$5 = $$2.n();
         bqi<cud> $$6 = $$2.a($$1, $$0, $$3);
         cud $$7 = $$6.b();
         if ($$7 == $$2 && $$7.H() == $$4 && $$7.a((btc)$$0) <= 0 && $$7.n() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bqh.f && $$7.a((btc)$$0) > 0 && !$$0.ft()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if ($$7.e()) {
               $$0.a($$3, cud.l);
            }

            if (!$$0.ft()) {
               $$0.cd.b();
            }

            return $$6.a();
         }
      }
   }

   public bqh a(aqn $$0, dcg $$1, cud $$2, bqg $$3, ewd $$4) {
      ja $$5 = $$4.a();
      dsl $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.J())) {
         return bqh.f;
      } else if (this.b == dcd.d) {
         bql $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bqh.a;
         } else {
            return bqh.e;
         }
      } else {
         boolean $$8 = !$$0.eV().e() || !$$0.eW().e();
         boolean $$9 = $$0.fP() && $$8;
         cud $$10 = $$2.s();
         if (!$$9) {
            bqj $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               am.N.a($$0, $$5, $$10);
               return $$11.b();
            }

            if ($$11 == bqj.d && $$3 == bqg.a) {
               bqh $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  am.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.e() && !$$0.gv().a($$2.g())) {
            cxp $$13 = new cxp($$0, $$3, $$4);
            bqh $$15;
            if (this.e()) {
               int $$14 = $$2.H();
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
            return bqh.e;
         }
      }
   }

   public void a(aqm $$0) {
      this.c = $$0;
   }
}
