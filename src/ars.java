import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ars {
   private static final Logger a = LogUtils.getLogger();
   protected arq c;
   protected final arr d;
   private djj b;
   @Nullable
   private djj e;
   private boolean f;
   private int g;
   private iv h;
   private int i;
   private boolean j;
   private iv k;
   private int l;
   private int m;

   public ars(arr $$0) {
      this.b = djj.e;
      this.h = iv.c;
      this.k = iv.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.y();
   }

   public boolean a(djj $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.x();
         this.d.g.ag().a(new aeb(aeb.a.c, this.d));
         this.c.f();
         if ($$0 == djj.b) {
            this.d.gO();
         }

         return true;
      }
   }

   protected void a(djj $$0, @Nullable djj $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.gj());
   }

   public djj b() {
      return this.b;
   }

   @Nullable
   public djj c() {
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
         eat $$0 = this.c.a_(this.k);
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
         eat $$2 = this.c.a_(this.h);
         if ($$2.l()) {
            this.c.a(this.d.ao(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(eat $$0, iv $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dU(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.ao(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(iv $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(iv $$0, ahv.a $$1, jb $$2, int $$3, int $$4) {
      if (!this.d.a($$0, 1.0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() > $$3) {
         this.d.f.b(new acc($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == ahv.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.f.b(new acc($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.d.gj().d) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.f.b(new acc($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            eat $$6 = this.c.a_($$0);
            if (!$$6.l()) {
               dgc.a(this.c, this.d.fa(), this.d, this.d, bws.a, ffc.b($$0), $$6, $$0x -> this.d.a($$0x, bws.a));
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dU(), $$0);
            }

            if (!$$6.l() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.f.b(new acc(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.j();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.ao(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == ahv.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               eat $$9 = this.c.a_($$0);
               if (!$$9.l()) {
                  float $$10 = $$9.a(this.d, this.d.dU(), $$0) * (float)($$8 + 1);
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
         } else if ($$1 == ahv.a.b) {
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
         this.d.f.b(new acc($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(iv $$0) {
      eat $$1 = this.c.a_($$0);
      if (!this.d.fa().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         dxr $$2 = this.c.c_($$0);
         dmr $$3 = $$1.b();
         if ($$3 instanceof dqd && !this.d.gF()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            eat $$4 = $$3.a(this.c, $$0, $$1, (crm)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a(this.c, $$0, $$4);
            }

            if (this.d.gk()) {
               return true;
            } else {
               czn $$6 = this.d.fa();
               czn $$7 = $$6.v();
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

   public bug a(arr $$0, djm $$1, czn $$2, buf $$3) {
      if (this.b == djj.d) {
         return bug.e;
      } else if ($$0.gE().a($$2)) {
         return bug.e;
      } else {
         int $$4 = $$2.M();
         int $$5 = $$2.o();
         bug $$6 = $$2.a($$1, $$0, $$3);
         czn $$8;
         if ($$6 instanceof bug.d $$7) {
            $$8 = Objects.requireNonNullElse($$7.d(), $$0.b($$3));
         } else {
            $$8 = $$0.b($$3);
         }

         if ($$8 == $$2 && $$8.M() == $$4 && $$8.a((bxj)$$0) <= 0 && $$8.o() == $$5) {
            return $$6;
         } else if ($$6 instanceof bug.a && $$8.a((bxj)$$0) > 0 && !$$0.fy()) {
            return $$6;
         } else {
            if ($$2 != $$8) {
               $$0.a($$3, $$8);
            }

            if ($$8.f()) {
               $$0.a($$3, czn.k);
            }

            if (!$$0.fy()) {
               $$0.bQ.b();
            }

            return $$6;
         }
      }
   }

   public bug a(arr $$0, djm $$1, czn $$2, buf $$3, fey $$4) {
      iv $$5 = $$4.b();
      eat $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.K())) {
         return bug.d;
      } else if (this.b == djj.d) {
         bui $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bug.c;
         } else {
            return bug.e;
         }
      } else {
         boolean $$8 = !$$0.fa().f() || !$$0.fb().f();
         boolean $$9 = $$0.fX() && $$8;
         czn $$10 = $$2.v();
         if (!$$9) {
            bug $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               aq.N.a($$0, $$5, $$10);
               return $$11;
            }

            if ($$11 instanceof bug.f && $$3 == buf.a) {
               bug $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  aq.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.f() && !$$0.gE().a($$2)) {
            ddi $$13 = new ddi($$0, $$3, $$4);
            bug $$15;
            if ($$0.fU()) {
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
            return bug.e;
         }
      }
   }

   public void a(arq $$0) {
      this.c = $$0;
   }
}
