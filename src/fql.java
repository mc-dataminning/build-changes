import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fql {
   private static final Logger a = LogUtils.getLogger();
   private final exo b;
   private final fqf c;
   private hz d = new hz(-1, -1, -1);
   private cpd e = cpd.h;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private cvo j = cvo.e;
   @Nullable
   private cvo k;
   private int l;

   public fql(exo $$0, fqf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(chl $$0) {
      this.j.a($$0.fU());
   }

   public void a(cvo $$0, @Nullable cvo $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fU());
   }

   public void a(cvo $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.fU());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(hz $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         cvr $$1 = this.b.r;
         dlj $$2 = $$1.a_($$0);
         if (!this.b.s.eT().d().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            cys $$3 = $$2.b();
            if ($$3 instanceof dca && !this.b.s.gq()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (chl)this.b.s);
               egw $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((cvs)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(hz $$0, ie $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.D_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dlj $$2 = this.b.r.a_($$0);
            this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new afu(afu.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new afu(afu.a.b, this.d, $$1));
            }

            dlj $$3 = this.b.r.a_($$0);
            this.b.aA().a(this.b.r, $$0, $$3, 0.0F);
            this.a(this.b.r, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.r, $$0, this.b.s);
               }

               if ($$4 && $$3.a(this.b.s, this.b.s.dM(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.s.eT();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.aj(), this.d, this.l());
               }

               return new afu(afu.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dlj $$0 = this.b.r.a_(this.d);
         this.b.aA().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new afu(afu.a.b, this.d, ie.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.aj(), this.d, -1);
         this.b.s.gn();
      }
   }

   public boolean b(hz $$0, ie $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.D_().a($$0)) {
         this.h = 5;
         dlj $$2 = this.b.r.a_($$0);
         this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new afu(afu.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dlj $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dM(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dge $$4 = $$3.w();
               this.b.aj().a(new gkj($$4.f(), atm.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gko.t(), $$0));
            }

            this.g++;
            this.b.aA().a(this.b.r, $$0, $$3, awi.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new afu(afu.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.r.a(this.b.s.aj(), this.d, this.l());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(fqe $$0, fro $$1) {
      try (frn $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         xx<aes> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public void c() {
      this.m();
      if (this.c.l().i()) {
         this.c.l().b();
      } else {
         this.c.l().n();
      }
   }

   private boolean b(hz $$0) {
      cpd $$1 = this.b.s.eT();
      return $$0.equals(this.d) && cpd.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.fT().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new agd(this.l));
      }
   }

   public blw a(fuv $$0, blv $$1, env $$2) {
      this.m();
      if (!this.b.r.D_().a($$2.a())) {
         return blw.e;
      } else {
         MutableObject<blw> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new agm($$1, $$2, $$4);
         });
         return (blw)$$3.getValue();
      }
   }

   private blw b(fuv $$0, blv $$1, env $$2) {
      hz $$3 = $$2.a();
      cpd $$4 = $$0.b($$1);
      if (this.j == cvo.d) {
         return blw.a;
      } else {
         boolean $$5 = !$$0.eT().b() || !$$0.eU().b();
         boolean $$6 = $$0.fI() && $$5;
         if (!$$6) {
            dlj $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return blw.e;
            }

            bly $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bly.d && $$1 == blv.a) {
               blw $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.b() && !$$0.go().a($$4.d())) {
            crm $$10 = new crm($$0, $$1, $$2);
            blw $$12;
            if (this.j.g()) {
               int $$11 = $$4.M();
               $$12 = $$4.a($$10);
               $$4.f($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return blw.d;
         }
      }
   }

   public blw a(chl $$0, blv $$1) {
      if (this.j == cvo.d) {
         return blw.d;
      } else {
         this.m();
         this.c.b(new afo.b($$0.dr(), $$0.dt(), $$0.dx(), $$0.dC(), $$0.dE(), $$0.aC()));
         MutableObject<blw> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            agn $$4 = new agn($$1, $$3);
            cpd $$5 = $$0.b($$1);
            if ($$0.go().a($$5.d())) {
               $$2.setValue(blw.d);
               return $$4;
            } else {
               blx<cpd> $$6 = $$5.a(this.b.r, $$0, $$1);
               cpd $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (blw)$$2.getValue();
      }
   }

   public fuv a(fqe $$0, atw $$1, exb $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fuv a(fqe $$0, atw $$1, exb $$2, boolean $$3, boolean $$4) {
      return new fuv(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(chl $$0, bnq $$1) {
      this.m();
      this.c.b(afl.a($$1, $$0.bS()));
      if (this.j != cvo.d) {
         $$0.d($$1);
         $$0.gn();
      }
   }

   public blw a(chl $$0, bnq $$1, blv $$2) {
      this.m();
      this.c.b(afl.a($$1, $$0.bS(), $$2));
      return this.j == cvo.d ? blw.d : $$0.a($$1, $$2);
   }

   public blw a(chl $$0, bnq $$1, enw $$2, blv $$3) {
      this.m();
      enz $$4 = $$2.e().a($$1.dr(), $$1.dt(), $$1.dx());
      this.c.b(afl.a($$1, $$0.bS(), $$3, $$4));
      return this.j == cvo.d ? blw.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cko $$3, chl $$4) {
      ckf $$5 = $$4.bW;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         is<cma> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cpd> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cma $$9 : $$6) {
            $$8.add($$9.g().q());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cpd> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cpd $$12 = $$8.get($$11);
            cpd $$13 = $$6.get($$11).g();
            if (!cpd.a($$12, $$13)) {
               $$10.put($$11, $$13.q());
            }
         }

         this.c.b(new afg($$0, $$5.j(), $$1, $$2, $$3, $$5.g().q(), $$10));
      }
   }

   public void a(int $$0, csh<?> $$1, boolean $$2) {
      this.c.b(new afs($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new aff($$0, $$1));
   }

   public void a(cpd $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new agg($$1, $$0));
      }
   }

   public void a(cpd $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new agg(-1, $$0));
      }
   }

   public void b(chl $$0) {
      this.m();
      this.c.b(new afu(afu.a.f, hz.c, ie.a));
      $$0.fs();
   }

   public boolean d() {
      return this.j.h();
   }

   public boolean e() {
      return !this.j.g();
   }

   public boolean f() {
      return this.j.g();
   }

   public boolean g() {
      return this.b.s.bO() && this.b.s.cZ() instanceof bob;
   }

   public boolean h() {
      return this.j == cvo.d;
   }

   @Nullable
   public cvo i() {
      return this.k;
   }

   public cvo j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new afr($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new afi($$0, $$1, $$2));
   }
}
