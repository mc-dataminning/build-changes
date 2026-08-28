import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aru {
   private static final Logger a = LogUtils.getLogger();
   protected ars c;
   protected final art d;
   private dju b;
   @Nullable
   private dju e;
   private boolean f;
   private int g;
   private iv h;
   private int i;
   private boolean j;
   private iv k;
   private int l;
   private int m;

   public aru(art $$0) {
      this.b = dju.e;
      this.h = iv.c;
      this.k = iv.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.y();
   }

   public boolean a(dju $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.x();
         this.d.g.ag().a(new aed(aed.a.c, this.d));
         this.c.f();
         if ($$0 == dju.b) {
            this.d.gP();
         }

         return true;
      }
   }

   protected void a(dju $$0, @Nullable dju $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.gk());
   }

   public dju b() {
      return this.b;
   }

   @Nullable
   public dju c() {
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
         ebe $$0 = this.c.a_(this.k);
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
         ebe $$2 = this.c.a_(this.h);
         if ($$2.l()) {
            this.c.a(this.d.ao(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(ebe $$0, iv $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dV(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.ao(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(iv $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(iv $$0, ahx.a $$1, jb $$2, int $$3, int $$4) {
      if (!this.d.a($$0, 1.0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() > $$3) {
         this.d.f.b(new ace($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == ahx.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.f.b(new ace($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.d.gk().d) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.f.b(new ace($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            ebe $$6 = this.c.a_($$0);
            if (!$$6.l()) {
               dgn.a(this.c, this.d.fb(), this.d, this.d, bxd.a, ffq.b($$0), $$6, $$0x -> this.d.a($$0x, bxd.a));
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dV(), $$0);
            }

            if (!$$6.l() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.f.b(new ace(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.j();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.ao(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == ahx.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               ebe $$9 = this.c.a_($$0);
               if (!$$9.l()) {
                  float $$10 = $$9.a(this.d, this.d.dV(), $$0) * (float)($$8 + 1);
                  if ($$10 >= 0.7F) {
                     this.f = false;
                     this.c.a(this.d.ao(), $$0, -1);
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
         } else if ($$1 == ahx.a.b) {
            this.f = false;
            if (!Objects.equals(this.h, $$0)) {
               a.warn("Mismatch in destroy block pos: {} {}", this.h, $$0);
               this.c.a(this.d.ao(), this.h, -1);
               this.a($$0, true, $$4, "aborted mismatched destroying");
            }

            this.c.a(this.d.ao(), $$0, -1);
            this.a($$0, true, $$4, "aborted destroying");
         }
      }
   }

   public void a(iv $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.f.b(new ace($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(iv $$0) {
      ebe $$1 = this.c.a_($$0);
      if (!this.d.fb().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dyc $$2 = this.c.c_($$0);
         dnc $$3 = $$1.b();
         if ($$3 instanceof dqo && !this.d.gG()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            ebe $$4 = $$3.a(this.c, $$0, $$1, (crx)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a(this.c, $$0, $$4);
            }

            if (this.d.gl()) {
               return true;
            } else {
               czy $$6 = this.d.fb();
               czy $$7 = $$6.v();
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

   public bur a(art $$0, djx $$1, czy $$2, buq $$3) {
      if (this.b == dju.d) {
         return bur.e;
      } else if ($$0.gF().a($$2)) {
         return bur.e;
      } else {
         int $$4 = $$2.M();
         int $$5 = $$2.o();
         bur $$6 = $$2.a($$1, $$0, $$3);
         czy $$8;
         if ($$6 instanceof bur.d $$7) {
            $$8 = Objects.requireNonNullElse($$7.d(), $$0.b($$3));
         } else {
            $$8 = $$0.b($$3);
         }

         if ($$8 == $$2 && $$8.M() == $$4 && $$8.a((bxu)$$0) <= 0 && $$8.o() == $$5) {
            return $$6;
         } else if ($$6 instanceof bur.a && $$8.a((bxu)$$0) > 0 && !$$0.fz()) {
            return $$6;
         } else {
            if ($$2 != $$8) {
               $$0.a($$3, $$8);
            }

            if ($$8.f()) {
               $$0.a($$3, czy.k);
            }

            if (!$$0.fz()) {
               $$0.bQ.b();
            }

            return $$6;
         }
      }
   }

   public bur a(art $$0, djx $$1, czy $$2, buq $$3, ffm $$4) {
      iv $$5 = $$4.b();
      ebe $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.K())) {
         return bur.d;
      } else if (this.b == dju.d) {
         but $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bur.c;
         } else {
            return bur.e;
         }
      } else {
         boolean $$8 = !$$0.fb().f() || !$$0.fc().f();
         boolean $$9 = $$0.fY() && $$8;
         czy $$10 = $$2.v();
         if (!$$9) {
            bur $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               aq.N.a($$0, $$5, $$10);
               return $$11;
            }

            if ($$11 instanceof bur.f && $$3 == buq.a) {
               bur $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  aq.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.f() && !$$0.gF().a($$2)) {
            ddt $$13 = new ddt($$0, $$3, $$4);
            bur $$15;
            if ($$0.fV()) {
               int $$14 = $$2.M();
               $$15 = $$2.a($$13);
               $$2.e($$14);
            } else {
               $$15 = $$2.a($$13);
            }

            if ($$15.a()) {
               aq.N.a($$0, $$5, $$10);
            }

            return $$15;
         } else {
            return bur.e;
         }
      }
   }

   public void a(ars $$0) {
      this.c = $$0;
   }
}
