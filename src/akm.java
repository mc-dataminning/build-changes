import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class akm {
   private static final Logger a = LogUtils.getLogger();
   protected akk c;
   protected final akl d;
   private cpi b;
   @Nullable
   private cpi e;
   private boolean f;
   private int g;
   private gu h;
   private int i;
   private boolean j;
   private gu k;
   private int l;
   private int m;

   public akm(akl $$0) {
      this.b = cpi.e;
      this.h = gu.b;
      this.k = gu.b;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.x();
   }

   public boolean a(cpi $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.w();
         this.d.d.ac().a(new yu(yu.a.c, this.d));
         this.c.e();
         return true;
      }
   }

   protected void a(cpi $$0, @Nullable cpi $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.fR());
   }

   public cpi b() {
      return this.b;
   }

   @Nullable
   public cpi c() {
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
         dez $$0 = this.c.a_(this.k);
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
         dez $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.ah(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dez $$0, gu $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dK(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.ah(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(gu $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(gu $$0, abz.a $$1, ha $$2, int $$3, int $$4) {
      if (this.d.bp().g(ehd.b($$0)) > ali.d) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.c.b(new wz($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == abz.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.c.b(new wz($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.c.b(new wz($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dez $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dK(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.c.b(new wz(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.ah(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == abz.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dez $$9 = this.c.a_($$0);
               if (!$$9.i()) {
                  float $$10 = $$9.a(this.d, this.d.dK(), $$0) * (float)($$8 + 1);
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
         } else if ($$1 == abz.a.b) {
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

   public void a(gu $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.c.b(new wz($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(gu $$0) {
      dez $$1 = this.c.a_($$0);
      if (!this.d.eR().d().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dcl $$2 = this.c.c_($$0);
         csl $$3 = $$1.b();
         if ($$3 instanceof cvp && !this.d.gn()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            $$3.a(this.c, $$0, $$1, (cbm)this.d);
            boolean $$4 = this.c.a($$0, false);
            if ($$4) {
               $$3.a((cpm)this.c, $$0, $$1);
            }

            if (this.e()) {
               return true;
            } else {
               cix $$5 = this.d.eR();
               cix $$6 = $$5.p();
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

   public bgq a(akl $$0, cpl $$1, cix $$2, bgp $$3) {
      if (this.b == cpi.d) {
         return bgq.d;
      } else if ($$0.gl().a($$2.d())) {
         return bgq.d;
      } else {
         int $$4 = $$2.L();
         int $$5 = $$2.k();
         bgr<cix> $$6 = $$2.a($$1, $$0, $$3);
         cix $$7 = $$6.b();
         if ($$7 == $$2 && $$7.L() == $$4 && $$7.r() <= 0 && $$7.k() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bgq.e && $$7.r() > 0 && !$$0.fl()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if (this.e() && $$7 != cix.b) {
               $$7.f($$4);
               if ($$7.i() && $$7.k() != $$5) {
                  $$7.b($$5);
               }
            }

            if ($$7.b()) {
               $$0.a($$3, cix.b);
            }

            if (!$$0.fl()) {
               $$0.bP.b();
            }

            return $$6.a();
         }
      }
   }

   public bgq a(akl $$0, cpl $$1, cix $$2, bgp $$3, egz $$4) {
      gu $$5 = $$4.a();
      dez $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.G())) {
         return bgq.e;
      } else if (this.b == cpi.d) {
         bgt $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bgq.a;
         } else {
            return bgq.d;
         }
      } else {
         boolean $$8 = !$$0.eR().b() || !$$0.eS().b();
         boolean $$9 = $$0.fG() && $$8;
         cix $$10 = $$2.p();
         if (!$$9) {
            bgq $$11 = $$6.a($$1, $$0, $$3, $$4);
            if ($$11.a()) {
               ai.M.a($$0, $$5, $$10);
               return $$11;
            }
         }

         if (!$$2.b() && !$$0.gl().a($$2.d())) {
            clh $$12 = new clh($$0, $$3, $$4);
            bgq $$14;
            if (this.e()) {
               int $$13 = $$2.L();
               $$14 = $$2.a($$12);
               $$2.f($$13);
            } else {
               $$14 = $$2.a($$12);
            }

            if ($$14.a()) {
               ai.M.a($$0, $$5, $$10);
            }

            return $$14;
         } else {
            return bgq.d;
         }
      }
   }

   public void a(akk $$0) {
      this.c = $$0;
   }
}
