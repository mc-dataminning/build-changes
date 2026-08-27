import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class apc {
   private static final Logger a = LogUtils.getLogger();
   protected apa c;
   protected final apb d;
   private cwb b;
   @Nullable
   private cwb e;
   private boolean f;
   private int g;
   private ib h;
   private int i;
   private boolean j;
   private ib k;
   private int l;
   private int m;

   public apc(apb $$0) {
      this.b = cwb.e;
      this.h = ib.c;
      this.k = ib.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.z();
   }

   public boolean a(cwb $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.y();
         this.d.e.ah().a(new aco(aco.a.c, this.d));
         this.c.e();
         return true;
      }
   }

   protected void a(cwb $$0, @Nullable cwb $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.fW());
   }

   public cwb b() {
      return this.b;
   }

   @Nullable
   public cwb c() {
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
         dme $$0 = this.c.a_(this.k);
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
         dme $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.aj(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dme $$0, ib $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dJ(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.aj(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(ib $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(ib $$0, afy.a $$1, ih $$2, int $$3, int $$4) {
      if (!this.d.a($$0, 1.0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.d.b(new aar($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == afy.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.d.b(new aar($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.d.b(new aar($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dme $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dJ(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.d.b(new aar(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.aj(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == afy.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dme $$9 = this.c.a_($$0);
               if (!$$9.i()) {
                  float $$10 = $$9.a(this.d, this.d.dJ(), $$0) * (float)($$8 + 1);
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
         } else if ($$1 == afy.a.b) {
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

   public void a(ib $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.d.b(new aar($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(ib $$0) {
      dme $$1 = this.c.a_($$0);
      if (!this.d.eR().d().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         djl $$2 = this.c.c_($$0);
         czf $$3 = $$1.b();
         if ($$3 instanceof dcn && !this.d.gs()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dme $$4 = $$3.a(this.c, $$0, $$1, (cia)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((cwf)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               cpq $$6 = this.d.eR();
               cpq $$7 = $$6.q();
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

   public bml a(apb $$0, cwe $$1, cpq $$2, bmk $$3) {
      if (this.b == cwb.d) {
         return bml.d;
      } else if ($$0.gq().a($$2.d())) {
         return bml.d;
      } else {
         int $$4 = $$2.M();
         int $$5 = $$2.l();
         bmm<cpq> $$6 = $$2.a($$1, $$0, $$3);
         cpq $$7 = $$6.b();
         if ($$7 == $$2 && $$7.M() == $$4 && $$7.s() <= 0 && $$7.l() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bml.e && $$7.s() > 0 && !$$0.fp()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if ($$7.b()) {
               $$0.a($$3, cpq.h);
            }

            if (!$$0.fp()) {
               $$0.bW.b();
            }

            return $$6.a();
         }
      }
   }

   public bml a(apb $$0, cwe $$1, cpq $$2, bmk $$3, eor $$4) {
      ib $$5 = $$4.a();
      dme $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.I())) {
         return bml.e;
      } else if (this.b == cwb.d) {
         bmp $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bml.a;
         } else {
            return bml.d;
         }
      } else {
         boolean $$8 = !$$0.eR().b() || !$$0.eS().b();
         boolean $$9 = $$0.fK() && $$8;
         cpq $$10 = $$2.q();
         if (!$$9) {
            bmn $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               am.N.a($$0, $$5, $$10);
               return $$11.b();
            }

            if ($$11 == bmn.d && $$3 == bmk.a) {
               bml $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  am.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.b() && !$$0.gq().a($$2.d())) {
            crz $$13 = new crz($$0, $$3, $$4);
            bml $$15;
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
            return bml.d;
         }
      }
   }

   public void a(apa $$0) {
      this.c = $$0;
   }
}
