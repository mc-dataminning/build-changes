import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aih {
   private static final Logger a = LogUtils.getLogger();
   protected aif c;
   protected final aig d;
   private cmj b;
   @Nullable
   private cmj e;
   private boolean f;
   private int g;
   private gu h;
   private int i;
   private boolean j;
   private gu k;
   private int l;
   private int m;

   public aih(aig $$0) {
      this.b = cmj.e;
      this.h = gu.b;
      this.k = gu.b;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.x();
   }

   public boolean a(cmj $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.w();
         this.d.d.ac().a(new wy(wy.a.c, this.d));
         this.c.e();
         return true;
      }
   }

   protected void a(cmj $$0, @Nullable cmj $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.fO());
   }

   public cmj b() {
      return this.b;
   }

   @Nullable
   public cmj c() {
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
         dcb $$0 = this.c.a_(this.k);
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
         dcb $$2 = this.c.a_(this.h);
         if ($$2.i()) {
            this.c.a(this.d.af(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(dcb $$0, gu $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.dI(), $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.af(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(gu $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(gu $$0, aad.a $$1, ha $$2, int $$3, int $$4) {
      if (this.d.bm().g(eei.b($$0)) > aiy.a) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.c.a(new vb($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == aad.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.c.a(new vb($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.c.a(new vb($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            dcb $$6 = this.c.a_($$0);
            if (!$$6.i()) {
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.dI(), $$0);
            }

            if (!$$6.i() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.c.a(new vb(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.i();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.af(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == aad.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               dcb $$9 = this.c.a_($$0);
               if (!$$9.i()) {
                  float $$10 = $$9.a(this.d, this.d.dI(), $$0) * (float)($$8 + 1);
                  if ($$10 >= 0.7F) {
                     this.f = false;
                     this.c.a(this.d.af(), $$0, -1);
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
         } else if ($$1 == aad.a.b) {
            this.f = false;
            if (!Objects.equals(this.h, $$0)) {
               a.warn("Mismatch in destroy block pos: {} {}", this.h, $$0);
               this.c.a(this.d.af(), this.h, -1);
               this.a($$0, true, $$4, "aborted mismatched destroying");
            }

            this.c.a(this.d.af(), $$0, -1);
            this.a($$0, true, $$4, "aborted destroying");
         }
      }
   }

   public void a(gu $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.c.a(new vb($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(gu $$0) {
      dcb $$1 = this.c.a_($$0);
      if (!this.d.eO().d().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         czn $$2 = this.c.c_($$0);
         cpn $$3 = $$1.b();
         if ($$3 instanceof csr && !this.d.gk()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            $$3.a(this.c, $$0, $$1, (byo)this.d);
            boolean $$4 = this.c.a($$0, false);
            if ($$4) {
               $$3.a((cmn)this.c, $$0, $$1);
            }

            if (this.e()) {
               return true;
            } else {
               cfz $$5 = this.d.eO();
               cfz $$6 = $$5.p();
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

   public bdx a(aig $$0, cmm $$1, cfz $$2, bdw $$3) {
      if (this.b == cmj.d) {
         return bdx.d;
      } else if ($$0.gi().a($$2.d())) {
         return bdx.d;
      } else {
         int $$4 = $$2.L();
         int $$5 = $$2.k();
         bdy<cfz> $$6 = $$2.a($$1, $$0, $$3);
         cfz $$7 = $$6.b();
         if ($$7 == $$2 && $$7.L() == $$4 && $$7.r() <= 0 && $$7.k() == $$5) {
            return $$6.a();
         } else if ($$6.a() == bdx.e && $$7.r() > 0 && !$$0.fi()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if (this.e() && $$7 != cfz.b) {
               $$7.f($$4);
               if ($$7.i() && $$7.k() != $$5) {
                  $$7.b($$5);
               }
            }

            if ($$7.b()) {
               $$0.a($$3, cfz.b);
            }

            if (!$$0.fi()) {
               $$0.bQ.b();
            }

            return $$6.a();
         }
      }
   }

   public bdx a(aig $$0, cmm $$1, cfz $$2, bdw $$3, eee $$4) {
      gu $$5 = $$4.a();
      dcb $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.G())) {
         return bdx.e;
      } else if (this.b == cmj.d) {
         bea $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bdx.a;
         } else {
            return bdx.d;
         }
      } else {
         boolean $$8 = !$$0.eO().b() || !$$0.eP().b();
         boolean $$9 = $$0.fD() && $$8;
         cfz $$10 = $$2.p();
         if (!$$9) {
            bdx $$11 = $$6.a($$1, $$0, $$3, $$4);
            if ($$11.a()) {
               ai.M.a($$0, $$5, $$10);
               return $$11;
            }
         }

         if (!$$2.b() && !$$0.gi().a($$2.d())) {
            cij $$12 = new cij($$0, $$3, $$4);
            bdx $$14;
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
            return bdx.d;
         }
      }
   }

   public void a(aif $$0) {
      this.c = $$0;
   }
}
