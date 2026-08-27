import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class akk {
   private static final Logger a = LogUtils.getLogger();
   protected aki c;
   protected final akj d;
   private cph b;
   @Nullable
   private cph e;
   private boolean f;
   private int g;
   private gv h;
   private int i;
   private boolean j;
   private gv k;
   private int l;
   private int m;

   public akk(akj $$0) {
      this.b = cph.e;
      this.h = gv.b;
      this.k = gv.b;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.x();
   }

   public boolean a(cph $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.w();
         this.d.d.ac().a(new yt(yt.a.c, this.d));
         this.c.e();
         return true;
      }
   }

   protected void a(cph $$0, @Nullable cph $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.fR());
   }

   public cph b() {
      return this.b;
   }

   @Nullable
   public cph c() {
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
         dey $$0 = this.c.a_(this.k);
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
         dey $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.ah(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dey $$0, gv $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dK(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.ah(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(gv $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(gv $$0, abx.a $$1, hb $$2, int $$3, int $$4) {
      if (this.d.bp().g(ehf.b($$0)) > alg.d) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.c.b(new wy($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == abx.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.c.b(new wy($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.c.b(new wy($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dey $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dK(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.c.b(new wy(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.ah(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == abx.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dey $$9 = this.c.a_($$0);
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
         } else if ($$1 == abx.a.b) {
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

   public void a(gv $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.c.b(new wy($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(gv $$0) {
      dey $$1 = this.c.a_($$0);
      if (!this.d.eR().d().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dck $$2 = this.c.c_($$0);
         csk $$3 = $$1.b();
         if ($$3 instanceof cvo && !this.d.gn()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            $$3.a(this.c, $$0, $$1, (cbl)this.d);
            boolean $$4 = this.c.a($$0, false);
            if ($$4) {
               $$3.a((cpl)this.c, $$0, $$1);
            }

            if (this.e()) {
               return true;
            } else {
               ciw $$5 = this.d.eR();
               ciw $$6 = $$5.p();
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

   public bgo a(akj $$0, cpk $$1, ciw $$2, bgn $$3) {
      if (this.b == cph.d) {
         return bgo.d;
      } else if ($$0.gl().a($$2.d())) {
         return bgo.d;
      } else {
         int $$4 = $$2.L();
         int $$5 = $$2.k();
         bgp<ciw> $$6 = $$2.a($$1, $$0, $$3);
         ciw $$7 = $$6.b();
         if ($$7 == $$2 && $$7.L() == $$4 && $$7.r() <= 0 && $$7.k() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bgo.e && $$7.r() > 0 && !$$0.fl()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if (this.e() && $$7 != ciw.b) {
               $$7.f($$4);
               if ($$7.i() && $$7.k() != $$5) {
                  $$7.b($$5);
               }
            }

            if ($$7.b()) {
               $$0.a($$3, ciw.b);
            }

            if (!$$0.fl()) {
               $$0.bP.b();
            }

            return $$6.a();
         }
      }
   }

   public bgo a(akj $$0, cpk $$1, ciw $$2, bgn $$3, ehb $$4) {
      gv $$5 = $$4.a();
      dey $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.G())) {
         return bgo.e;
      } else if (this.b == cph.d) {
         bgr $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bgo.a;
         } else {
            return bgo.d;
         }
      } else {
         boolean $$8 = !$$0.eR().b() || !$$0.eS().b();
         boolean $$9 = $$0.fG() && $$8;
         ciw $$10 = $$2.p();
         if (!$$9) {
            bgo $$11 = $$6.a($$1, $$0, $$3, $$4);
            if ($$11.a()) {
               ai.M.a($$0, $$5, $$10);
               return $$11;
            }
         }

         if (!$$2.b() && !$$0.gl().a($$2.d())) {
            clg $$12 = new clg($$0, $$3, $$4);
            bgo $$14;
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
            return bgo.d;
         }
      }
   }

   public void a(aki $$0) {
      this.c = $$0;
   }
}
