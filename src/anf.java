import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class anf {
   private static final Logger a = LogUtils.getLogger();
   protected and c;
   protected final ane d;
   private ctm b;
   @Nullable
   private ctm e;
   private boolean f;
   private int g;
   private hx h;
   private int i;
   private boolean j;
   private hx k;
   private int l;
   private int m;

   public anf(ane $$0) {
      this.b = ctm.e;
      this.h = hx.b;
      this.k = hx.b;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.z();
   }

   public boolean a(ctm $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.y();
         this.d.d.ae().a(new abe(abe.a.c, this.d));
         this.c.e();
         return true;
      }
   }

   protected void a(ctm $$0, @Nullable ctm $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.fT());
   }

   public ctm b() {
      return this.b;
   }

   @Nullable
   public ctm c() {
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
         djh $$0 = this.c.a_(this.k);
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
         djh $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.aj(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(djh $$0, hx $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dM(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.aj(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(hx $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(hx $$0, aem.a $$1, ic $$2, int $$3, int $$4) {
      if (this.d.br().g(elt.b($$0)) > aoc.d) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.c.b(new zj($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == aem.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.c.b(new zj($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.c.b(new zj($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            djh $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dM(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.c.b(new zj(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.aj(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == aem.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               djh $$9 = this.c.a_($$0);
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
         } else if ($$1 == aem.a.b) {
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
         this.d.c.b(new zj($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(hx $$0) {
      djh $$1 = this.c.a_($$0);
      if (!this.d.eT().d().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dgv $$2 = this.c.c_($$0);
         cwq $$3 = $$1.b();
         if ($$3 instanceof czy && !this.d.gp()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            djh $$4 = $$3.a(this.c, $$0, $$1, (cfi)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((ctq)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               cmy $$6 = this.d.eT();
               cmy $$7 = $$6.p();
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

   public bkb a(ane $$0, ctp $$1, cmy $$2, bka $$3) {
      if (this.b == ctm.d) {
         return bkb.d;
      } else if ($$0.gn().a($$2.d())) {
         return bkb.d;
      } else {
         int $$4 = $$2.L();
         int $$5 = $$2.k();
         bkc<cmy> $$6 = $$2.a($$1, $$0, $$3);
         cmy $$7 = $$6.b();
         if ($$7 == $$2 && $$7.L() == $$4 && $$7.r() <= 0 && $$7.k() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bkb.e && $$7.r() > 0 && !$$0.fn()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if (this.e() && $$7 != cmy.f) {
               $$7.f($$4);
               if ($$7.i() && $$7.k() != $$5) {
                  $$7.b($$5);
               }
            }

            if ($$7.b()) {
               $$0.a($$3, cmy.f);
            }

            if (!$$0.fn()) {
               $$0.bR.b();
            }

            return $$6.a();
         }
      }
   }

   public bkb a(ane $$0, ctp $$1, cmy $$2, bka $$3, elp $$4) {
      hx $$5 = $$4.a();
      djh $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.I())) {
         return bkb.e;
      } else if (this.b == ctm.d) {
         bke $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bkb.a;
         } else {
            return bkb.d;
         }
      } else {
         boolean $$8 = !$$0.eT().b() || !$$0.eU().b();
         boolean $$9 = $$0.fI() && $$8;
         cmy $$10 = $$2.p();
         if (!$$9) {
            bkb $$11 = $$6.a($$1, $$0, $$3, $$4);
            if ($$11.a()) {
               am.N.a($$0, $$5, $$10);
               return $$11;
            }
         }

         if (!$$2.b() && !$$0.gn().a($$2.d())) {
            cpj $$12 = new cpj($$0, $$3, $$4);
            bkb $$14;
            if (this.e()) {
               int $$13 = $$2.L();
               $$14 = $$2.a($$12);
               $$2.f($$13);
            } else {
               $$14 = $$2.a($$12);
            }

            if ($$14.a()) {
               am.N.a($$0, $$5, $$10);
            }

            return $$14;
         } else {
            return bkb.d;
         }
      }
   }

   public void a(and $$0) {
      this.c = $$0;
   }
}
