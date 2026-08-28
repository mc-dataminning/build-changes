import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ars {
   private static final Logger a = LogUtils.getLogger();
   protected arq c;
   protected final arr d;
   private dfc b;
   @Nullable
   private dfc e;
   private boolean f;
   private int g;
   private jh h;
   private int i;
   private boolean j;
   private jh k;
   private int l;
   private int m;

   public ars(arr $$0) {
      this.b = dfc.e;
      this.h = jh.c;
      this.k = jh.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.B();
   }

   public boolean a(dfc $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.A();
         this.d.h.ag().a(new aeo(aeo.a.c, this.d));
         this.c.e();
         if ($$0 == dfc.b) {
            this.d.gQ();
         }

         return true;
      }
   }

   protected void a(dfc $$0, @Nullable dfc $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.gm());
   }

   public dfc b() {
      return this.b;
   }

   @Nullable
   public dfc c() {
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
         dvo $$0 = this.c.a_(this.k);
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
         dvo $$2 = this.c.a_(this.h);
         if ($$2.l()) {
            this.c.a(this.d.as(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dvo $$0, jh $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dY(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.as(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(jh $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(jh $$0, aid.a $$1, jm $$2, int $$3, int $$4) {
      if (!this.d.a($$0, 1.0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() > $$3) {
         this.d.g.b(new acq($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == aid.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.g.b(new acq($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.g.b(new acq($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dvo $$6 = this.c.a_($$0);
            if (!$$6.l()) {
               dby.a(this.c, this.d.fc(), this.d, this.d, buq.a, ezr.b($$0), $$6, $$0x -> this.d.a($$0x, buq.a));
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dY(), $$0);
            }

            if (!$$6.l() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.g.b(new acq(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.j();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.as(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == aid.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dvo $$9 = this.c.a_($$0);
               if (!$$9.l()) {
                  float $$10 = $$9.a(this.d, this.d.dY(), $$0) * (float)($$8 + 1);
                  if ($$10 >= 0.7F) {
                     this.f = false;
                     this.c.a(this.d.as(), $$0, -1);
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
         } else if ($$1 == aid.a.b) {
            this.f = false;
            if (!Objects.equals(this.h, $$0)) {
               a.warn("Mismatch in destroy block pos: {} {}", this.h, $$0);
               this.c.a(this.d.as(), this.h, -1);
               this.a($$0, true, $$4, "aborted mismatched destroying");
            }

            this.c.a(this.d.as(), $$0, -1);
            this.a($$0, true, $$4, "aborted destroying");
         }
      }
   }

   public void a(jh $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.g.b(new acq($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(jh $$0) {
      dvo $$1 = this.c.a_($$0);
      if (!this.d.fc().h().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dsr $$2 = this.c.c_($$0);
         dij $$3 = $$1.b();
         if ($$3 instanceof dlq && !this.d.gJ()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dvo $$4 = $$3.a(this.c, $$0, $$1, (cor)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((dfg)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               cwf $$6 = this.d.fc();
               cwf $$7 = $$6.v();
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

   public bsh a(arr $$0, dff $$1, cwf $$2, bsg $$3) {
      if (this.b == dfc.d) {
         return bsh.e;
      } else if ($$0.gH().a($$2)) {
         return bsh.e;
      } else {
         int $$4 = $$2.L();
         int $$5 = $$2.o();
         bsh $$6 = $$2.a($$1, $$0, $$3);
         cwf $$8;
         if ($$6 instanceof bsh.d $$7) {
            $$8 = Objects.requireNonNullElse($$7.d(), $$0.b($$3));
         } else {
            $$8 = $$0.b($$3);
         }

         if ($$8 == $$2 && $$8.L() == $$4 && $$8.a((bve)$$0) <= 0 && $$8.o() == $$5) {
            return $$6;
         } else if ($$6 instanceof bsh.a && $$8.a((bve)$$0) > 0 && !$$0.fC()) {
            return $$6;
         } else {
            if ($$2 != $$8) {
               $$0.a($$3, $$8);
            }

            if ($$8.f()) {
               $$0.a($$3, cwf.k);
            }

            if (!$$0.fC()) {
               $$0.cc.b();
            }

            return $$6;
         }
      }
   }

   public bsh a(arr $$0, dff $$1, cwf $$2, bsg $$3, ezn $$4) {
      jh $$5 = $$4.b();
      dvo $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.J())) {
         return bsh.d;
      } else if (this.b == dfc.d) {
         bsj $$7 = $$6.c($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bsh.c;
         } else {
            return bsh.e;
         }
      } else {
         boolean $$8 = !$$0.fc().f() || !$$0.fd().f();
         boolean $$9 = $$0.gb() && $$8;
         cwf $$10 = $$2.v();
         if (!$$9) {
            bsh $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               ao.N.a($$0, $$5, $$10);
               return $$11;
            }

            if ($$11 instanceof bsh.f && $$3 == bsg.a) {
               bsh $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  ao.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.f() && !$$0.gH().a($$2)) {
            czy $$13 = new czy($$0, $$3, $$4);
            bsh $$15;
            if (this.e()) {
               int $$14 = $$2.L();
               $$15 = $$2.a($$13);
               $$2.e($$14);
            } else {
               $$15 = $$2.a($$13);
            }

            if ($$15.a()) {
               ao.N.a($$0, $$5, $$10);
            }

            return $$15;
         } else {
            return bsh.e;
         }
      }
   }

   public void a(arq $$0) {
      this.c = $$0;
   }
}
