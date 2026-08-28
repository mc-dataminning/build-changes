import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class arr {
   private static final Logger a = LogUtils.getLogger();
   protected arp c;
   protected final arq d;
   private dfj b;
   @Nullable
   private dfj e;
   private boolean f;
   private int g;
   private jh h;
   private int i;
   private boolean j;
   private jh k;
   private int l;
   private int m;

   public arr(arq $$0) {
      this.b = dfj.e;
      this.h = jh.c;
      this.k = jh.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.y();
   }

   public boolean a(dfj $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.x();
         this.d.g.ag().a(new aem(aem.a.c, this.d));
         this.c.f();
         if ($$0 == dfj.b) {
            this.d.gL();
         }

         return true;
      }
   }

   protected void a(dfj $$0, @Nullable dfj $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.gh());
   }

   public dfj b() {
      return this.b;
   }

   @Nullable
   public dfj c() {
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
         dvv $$0 = this.c.a_(this.k);
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
         dvv $$2 = this.c.a_(this.h);
         if ($$2.l()) {
            this.c.a(this.d.ar(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dvv $$0, jh $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dV(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.ar(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(jh $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(jh $$0, aib.a $$1, jm $$2, int $$3, int $$4) {
      if (!this.d.a($$0, 1.0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() > $$3) {
         this.d.f.b(new aco($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == aib.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.f.b(new aco($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.f.b(new aco($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dvv $$6 = this.c.a_($$0);
            if (!$$6.l()) {
               dcf.a(this.c, this.d.eX(), this.d, this.d, but.a, ezy.b($$0), $$6, $$0x -> this.d.a($$0x, but.a));
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dV(), $$0);
            }

            if (!$$6.l() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.f.b(new aco(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.j();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.ar(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == aib.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dvv $$9 = this.c.a_($$0);
               if (!$$9.l()) {
                  float $$10 = $$9.a(this.d, this.d.dV(), $$0) * (float)($$8 + 1);
                  if ($$10 >= 0.7F) {
                     this.f = false;
                     this.c.a(this.d.ar(), $$0, -1);
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
         } else if ($$1 == aib.a.b) {
            this.f = false;
            if (!Objects.equals(this.h, $$0)) {
               a.warn("Mismatch in destroy block pos: {} {}", this.h, $$0);
               this.c.a(this.d.ar(), this.h, -1);
               this.a($$0, true, $$4, "aborted mismatched destroying");
            }

            this.c.a(this.d.ar(), $$0, -1);
            this.a($$0, true, $$4, "aborted destroying");
         }
      }
   }

   public void a(jh $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.f.b(new aco($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(jh $$0) {
      dvv $$1 = this.c.a_($$0);
      if (!this.d.eX().h().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dsy $$2 = this.c.c_($$0);
         diq $$3 = $$1.b();
         if ($$3 instanceof dlx && !this.d.gE()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dvv $$4 = $$3.a(this.c, $$0, $$1, (cou)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a((dfn)this.c, $$0, $$4);
            }

            if (this.e()) {
               return true;
            } else {
               cwm $$6 = this.d.eX();
               cwm $$7 = $$6.v();
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

   public bsk a(arq $$0, dfm $$1, cwm $$2, bsj $$3) {
      if (this.b == dfj.d) {
         return bsk.e;
      } else if ($$0.gC().a($$2)) {
         return bsk.e;
      } else {
         int $$4 = $$2.L();
         int $$5 = $$2.o();
         bsk $$6 = $$2.a($$1, $$0, $$3);
         cwm $$8;
         if ($$6 instanceof bsk.d $$7) {
            $$8 = Objects.requireNonNullElse($$7.d(), $$0.b($$3));
         } else {
            $$8 = $$0.b($$3);
         }

         if ($$8 == $$2 && $$8.L() == $$4 && $$8.a((bvh)$$0) <= 0 && $$8.o() == $$5) {
            return $$6;
         } else if ($$6 instanceof bsk.a && $$8.a((bvh)$$0) > 0 && !$$0.fx()) {
            return $$6;
         } else {
            if ($$2 != $$8) {
               $$0.a($$3, $$8);
            }

            if ($$8.f()) {
               $$0.a($$3, cwm.k);
            }

            if (!$$0.fx()) {
               $$0.cb.b();
            }

            return $$6;
         }
      }
   }

   public bsk a(arq $$0, dfm $$1, cwm $$2, bsj $$3, ezu $$4) {
      jh $$5 = $$4.b();
      dvv $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.J())) {
         return bsk.d;
      } else if (this.b == dfj.d) {
         bsm $$7 = $$6.c($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bsk.c;
         } else {
            return bsk.e;
         }
      } else {
         boolean $$8 = !$$0.eX().f() || !$$0.eY().f();
         boolean $$9 = $$0.fW() && $$8;
         cwm $$10 = $$2.v();
         if (!$$9) {
            bsk $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               ao.N.a($$0, $$5, $$10);
               return $$11;
            }

            if ($$11 instanceof bsk.f && $$3 == bsj.a) {
               bsk $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  ao.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.f() && !$$0.gC().a($$2)) {
            daf $$13 = new daf($$0, $$3, $$4);
            bsk $$15;
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
            return bsk.e;
         }
      }
   }

   public void a(arp $$0) {
      this.c = $$0;
   }
}
