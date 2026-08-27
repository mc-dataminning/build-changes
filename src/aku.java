import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aku {
   private static final Logger a = LogUtils.getLogger();
   protected aks c;
   protected final akt d;
   private cpu b;
   @Nullable
   private cpu e;
   private boolean f;
   private int g;
   private gw h;
   private int i;
   private boolean j;
   private gw k;
   private int l;
   private int m;

   public aku(akt $$0) {
      this.b = cpu.e;
      this.h = gw.b;
      this.k = gw.b;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.x();
   }

   public boolean a(cpu $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.w();
         this.d.d.ac().a(new zc(zc.a.c, this.d));
         this.c.e();
         return true;
      }
   }

   protected void a(cpu $$0, @Nullable cpu $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.fS());
   }

   public cpu b() {
      return this.b;
   }

   @Nullable
   public cpu c() {
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
         dfl $$0 = this.c.a_(this.k);
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
         dfl $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.ah(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dfl $$0, gw $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dL(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.ah(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(gw $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(gw $$0, acg.a $$1, hc $$2, int $$3, int $$4) {
      if (this.d.bp().g(ehp.b($$0)) > alr.d) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.c.b(new xh($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == acg.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.c.b(new xh($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.c.b(new xh($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dfl $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dL(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.c.b(new xh(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.ah(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == acg.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dfl $$9 = this.c.a_($$0);
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
         } else if ($$1 == acg.a.b) {
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

   public void a(gw $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.c.b(new xh($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(gw $$0) {
      dfl $$1 = this.c.a_($$0);
      if (!this.d.eS().d().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dcx $$2 = this.c.c_($$0);
         csx $$3 = $$1.b();
         if ($$3 instanceof cwb && !this.d.go()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            $$3.a(this.c, $$0, $$1, (cbw)this.d);
            boolean $$4 = this.c.a($$0, false);
            if ($$4) {
               $$3.a((cpy)this.c, $$0, $$1);
            }

            if (this.e()) {
               return true;
            } else {
               cjh $$5 = this.d.eS();
               cjh $$6 = $$5.p();
               boolean $$7 = this.d.e($$1);
               $$5.a(this.c, $$1, $$0, this.d);
               if ($$4 && $$7) {
                  $$3.a(this.c, this.d, $$0, $$1, $$2, $$6);
               }

               return true;
            }
         }
      }
   }

   public bha a(akt $$0, cpx $$1, cjh $$2, bgz $$3) {
      if (this.b == cpu.d) {
         return bha.d;
      } else if ($$0.gm().a($$2.d())) {
         return bha.d;
      } else {
         int $$4 = $$2.L();
         int $$5 = $$2.k();
         bhb<cjh> $$6 = $$2.a($$1, $$0, $$3);
         cjh $$7 = $$6.b();
         if ($$7 == $$2 && $$7.L() == $$4 && $$7.r() <= 0 && $$7.k() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bha.e && $$7.r() > 0 && !$$0.fm()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if (this.e() && $$7 != cjh.b) {
               $$7.f($$4);
               if ($$7.i() && $$7.k() != $$5) {
                  $$7.b($$5);
               }
            }

            if ($$7.b()) {
               $$0.a($$3, cjh.b);
            }

            if (!$$0.fm()) {
               $$0.bR.b();
            }

            return $$6.a();
         }
      }
   }

   public bha a(akt $$0, cpx $$1, cjh $$2, bgz $$3, ehl $$4) {
      gw $$5 = $$4.a();
      dfl $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.G())) {
         return bha.e;
      } else if (this.b == cpu.d) {
         bhd $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bha.a;
         } else {
            return bha.d;
         }
      } else {
         boolean $$8 = !$$0.eS().b() || !$$0.eT().b();
         boolean $$9 = $$0.fH() && $$8;
         cjh $$10 = $$2.p();
         if (!$$9) {
            bha $$11 = $$6.a($$1, $$0, $$3, $$4);
            if ($$11.a()) {
               al.M.a($$0, $$5, $$10);
               return $$11;
            }
         }

         if (!$$2.b() && !$$0.gm().a($$2.d())) {
            clr $$12 = new clr($$0, $$3, $$4);
            bha $$14;
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
            return bha.d;
         }
      }
   }

   public void a(aks $$0) {
      this.c = $$0;
   }
}
