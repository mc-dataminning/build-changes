import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aqo {
   private static final Logger a = LogUtils.getLogger();
   protected aqm c;
   protected final aqn d;
   private dcc b;
   @Nullable
   private dcc e;
   private boolean f;
   private int g;
   private ja h;
   private int i;
   private boolean j;
   private ja k;
   private int l;
   private int m;

   public aqo(aqn $$0) {
      this.b = dcc.e;
      this.h = ja.c;
      this.k = ja.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.z();
   }

   public boolean a(dcc $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.y();
         this.d.d.ai().a(new adt(adt.a.c, this.d));
         this.c.e();
         if ($$0 == dcc.b) {
            this.d.gB();
         }

         return true;
      }
   }

   protected void a(dcc $$0, @Nullable dcc $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.ga());
   }

   public dcc b() {
      return this.b;
   }

   @Nullable
   public dcc c() {
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
         dsk $$0 = this.c.a_(this.k);
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
         dsk $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.am(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dsk $$0, ja $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dQ(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.am(), $$1, $$5);
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
            dsk $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               czn.a(this.c, this.d.eU(), this.d, this.d, bsn.a, ewf.b($$0), () -> this.d.e(bsn.a));
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dQ(), $$0);
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
               this.c.a(this.d.am(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == ahf.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dsk $$9 = this.c.a_($$0);
               if (!$$9.i()) {
                  float $$10 = $$9.a(this.d, this.d.dQ(), $$0) * (float)($$8 + 1);
                  if ($$10 >= 0.7F) {
                     this.f = false;
                     this.c.a(this.d.am(), $$0, -1);
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
               this.c.a(this.d.am(), this.h, -1);
               this.a($$0, true, $$4, "aborted mismatched destroying");
            }

            this.c.a(this.d.am(), $$0, -1);
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
      dsk $$1 = this.c.a_($$0);
      if (!this.d.eU().g().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dpp $$2 = this.c.c_($$0);
         dfh $$3 = $$1.b();
         if ($$3 instanceof dip && !this.d.gw()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dsk $$4 = $$3.a(this.c, $$0, $$1, (cmk)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((dcg)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               cuc $$6 = this.d.eU();
               cuc $$7 = $$6.s();
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

   public bqg a(aqn $$0, dcf $$1, cuc $$2, bqf $$3) {
      if (this.b == dcc.d) {
         return bqg.e;
      } else if ($$0.gu().a($$2.g())) {
         return bqg.e;
      } else {
         int $$4 = $$2.H();
         int $$5 = $$2.n();
         bqh<cuc> $$6 = $$2.a($$1, $$0, $$3);
         cuc $$7 = $$6.b();
         if ($$7 == $$2 && $$7.H() == $$4 && $$7.a((btb)$$0) <= 0 && $$7.n() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bqg.f && $$7.a((btb)$$0) > 0 && !$$0.fs()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if ($$7.e()) {
               $$0.a($$3, cuc.l);
            }

            if (!$$0.fs()) {
               $$0.cc.b();
            }

            return $$6.a();
         }
      }
   }

   public bqg a(aqn $$0, dcf $$1, cuc $$2, bqf $$3, ewb $$4) {
      ja $$5 = $$4.a();
      dsk $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.J())) {
         return bqg.f;
      } else if (this.b == dcc.d) {
         bqk $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bqg.a;
         } else {
            return bqg.e;
         }
      } else {
         boolean $$8 = !$$0.eU().e() || !$$0.eV().e();
         boolean $$9 = $$0.fO() && $$8;
         cuc $$10 = $$2.s();
         if (!$$9) {
            bqi $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               am.N.a($$0, $$5, $$10);
               return $$11.b();
            }

            if ($$11 == bqi.d && $$3 == bqf.a) {
               bqg $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  am.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.e() && !$$0.gu().a($$2.g())) {
            cxo $$13 = new cxo($$0, $$3, $$4);
            bqg $$15;
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
            return bqg.e;
         }
      }
   }

   public void a(aqm $$0) {
      this.c = $$0;
   }
}
