import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class arq {
   private static final Logger a = LogUtils.getLogger();
   protected aro c;
   protected final arp d;
   private dim b;
   @Nullable
   private dim e;
   private boolean f;
   private int g;
   private iu h;
   private int i;
   private boolean j;
   private iu k;
   private int l;
   private int m;

   public arq(arp $$0) {
      this.b = dim.e;
      this.h = iu.c;
      this.k = iu.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.y();
   }

   public boolean a(dim $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.x();
         this.d.g.ag().a(new adz(adz.a.c, this.d));
         this.c.f();
         if ($$0 == dim.b) {
            this.d.gO();
         }

         return true;
      }
   }

   protected void a(dim $$0, @Nullable dim $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.gj());
   }

   public dim b() {
      return this.b;
   }

   @Nullable
   public dim c() {
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
         dzo $$0 = this.c.a_(this.k);
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
         dzo $$2 = this.c.a_(this.h);
         if ($$2.l()) {
            this.c.a(this.d.ar(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dzo $$0, iu $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dV(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.ar(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(iu $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(iu $$0, aht.a $$1, ja $$2, int $$3, int $$4) {
      if (!this.d.a($$0, 1.0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() > $$3) {
         this.d.f.b(new aca($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == aht.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.f.b(new aca($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.d.gj().d) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.f.b(new aca($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dzo $$6 = this.c.a_($$0);
            if (!$$6.l()) {
               dfh.a(this.c, this.d.fa(), this.d, this.d, bwk.a, fdw.b($$0), $$6, $$0x -> this.d.a($$0x, bwk.a));
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dV(), $$0);
            }

            if (!$$6.l() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.f.b(new aca(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.j();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.ar(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == aht.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dzo $$9 = this.c.a_($$0);
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
         } else if ($$1 == aht.a.b) {
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

   public void a(iu $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.f.b(new aca($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(iu $$0) {
      dzo $$1 = this.c.a_($$0);
      if (!this.d.fa().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dwn $$2 = this.c.c_($$0);
         dlu $$3 = $$1.b();
         if ($$3 instanceof dpe && !this.d.gF()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            dzo $$4 = $$3.a(this.c, $$0, $$1, (cqs)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a(this.c, $$0, $$4);
            }

            if (this.d.gk()) {
               return true;
            } else {
               cys $$6 = this.d.fa();
               cys $$7 = $$6.v();
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

   public bty a(arp $$0, dip $$1, cys $$2, btx $$3) {
      if (this.b == dim.d) {
         return bty.e;
      } else if ($$0.gE().a($$2)) {
         return bty.e;
      } else {
         int $$4 = $$2.M();
         int $$5 = $$2.o();
         bty $$6 = $$2.a($$1, $$0, $$3);
         cys $$8;
         if ($$6 instanceof bty.d $$7) {
            $$8 = Objects.requireNonNullElse($$7.d(), $$0.b($$3));
         } else {
            $$8 = $$0.b($$3);
         }

         if ($$8 == $$2 && $$8.M() == $$4 && $$8.a((bwz)$$0) <= 0 && $$8.o() == $$5) {
            return $$6;
         } else if ($$6 instanceof bty.a && $$8.a((bwz)$$0) > 0 && !$$0.fy()) {
            return $$6;
         } else {
            if ($$2 != $$8) {
               $$0.a($$3, $$8);
            }

            if ($$8.f()) {
               $$0.a($$3, cys.k);
            }

            if (!$$0.fy()) {
               $$0.bP.b();
            }

            return $$6;
         }
      }
   }

   public bty a(arp $$0, dip $$1, cys $$2, btx $$3, fds $$4) {
      iu $$5 = $$4.b();
      dzo $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.K())) {
         return bty.d;
      } else if (this.b == dim.d) {
         bua $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bty.c;
         } else {
            return bty.e;
         }
      } else {
         boolean $$8 = !$$0.fa().f() || !$$0.fb().f();
         boolean $$9 = $$0.fX() && $$8;
         cys $$10 = $$2.v();
         if (!$$9) {
            bty $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               ap.N.a($$0, $$5, $$10);
               return $$11;
            }

            if ($$11 instanceof bty.f && $$3 == btx.a) {
               bty $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  ap.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.f() && !$$0.gE().a($$2)) {
            dcn $$13 = new dcn($$0, $$3, $$4);
            bty $$15;
            if ($$0.fU()) {
               int $$14 = $$2.M();
               $$15 = $$2.a($$13);
               $$2.e($$14);
            } else {
               $$15 = $$2.a($$13);
            }

            if ($$15.a()) {
               ap.N.a($$0, $$5, $$10);
            }

            return $$15;
         } else {
            return bty.e;
         }
      }
   }

   public void a(aro $$0) {
      this.c = $$0;
   }
}
