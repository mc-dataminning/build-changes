import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fsj {
   private static final Logger a = LogUtils.getLogger();
   private final ezi b;
   private final fsb c;
   private ib d = new ib(-1, -1, -1);
   private cqm e = cqm.h;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private cwy j = cwy.e;
   @Nullable
   private cwy k;
   private int l;

   public fsj(ezi $$0, fsb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(ciu $$0) {
      this.j.a($$0.ga());
   }

   public void a(cwy $$0, @Nullable cwy $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.ga());
   }

   public void a(cwy $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.ga());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(ib $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         cxb $$1 = this.b.r;
         dnb $$2 = $$1.a_($$0);
         if (!this.b.s.eU().d().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            dac $$3 = $$2.b();
            if ($$3 instanceof ddk && !this.b.s.gw()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (ciu)this.b.s);
               eip $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((cxc)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(ib $$0, ih $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.C_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dnb $$2 = this.b.r.a_($$0);
            this.b.aB().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new agc(agc.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new agc(agc.a.b, this.d, $$1));
            }

            dnb $$3 = this.b.r.a_($$0);
            this.b.aB().a(this.b.r, $$0, $$3, 0.0F);
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
                  this.e = this.b.s.eU();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.aj(), this.d, this.l());
               }

               return new agc(agc.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dnb $$0 = this.b.r.a_(this.d);
         this.b.aB().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new agc(agc.a.b, this.d, ih.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.aj(), this.d, -1);
         this.b.s.gt();
      }
   }

   public boolean b(ib $$0, ih $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.C_().a($$0)) {
         this.h = 5;
         dnb $$2 = this.b.r.a_($$0);
         this.b.aB().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new agc(agc.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dnb $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dM(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dho $$4 = $$3.w();
               this.b.ak().a(new gmk($$4.f(), atz.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gmp.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.r, $$0, $$3, aww.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new agc(agc.a.c, $$0, $$1, $$2);
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

   private void a(fsa $$0, ftn $$1) {
      try (ftm $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         yb<aez> $$4 = $$1.predict($$3);
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

   private boolean b(ib $$0) {
      cqm $$1 = this.b.s.eU();
      return $$0.equals(this.d) && cqm.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.fZ().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new agl(this.l));
      }
   }

   public bnd a(fwu $$0, bnc $$1, epp $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return bnd.e;
      } else {
         MutableObject<bnd> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new agu($$1, $$2, $$4);
         });
         return (bnd)$$3.getValue();
      }
   }

   private bnd b(fwu $$0, bnc $$1, epp $$2) {
      ib $$3 = $$2.a();
      cqm $$4 = $$0.b($$1);
      if (this.j == cwy.d) {
         return bnd.a;
      } else {
         boolean $$5 = !$$0.eU().b() || !$$0.eV().b();
         boolean $$6 = $$0.fO() && $$5;
         if (!$$6) {
            dnb $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bnd.e;
            }

            bnf $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bnf.d && $$1 == bnc.a) {
               bnd $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.b() && !$$0.gu().a($$4.d())) {
            csw $$10 = new csw($$0, $$1, $$2);
            bnd $$12;
            if (this.j.g()) {
               int $$11 = $$4.M();
               $$12 = $$4.a($$10);
               $$4.f($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bnd.d;
         }
      }
   }

   public bnd a(ciu $$0, bnc $$1) {
      if (this.j == cwy.d) {
         return bnd.d;
      } else {
         this.m();
         this.c.b(new afw.b($$0.dr(), $$0.dt(), $$0.dx(), $$0.dC(), $$0.dE(), $$0.aC()));
         MutableObject<bnd> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            agv $$4 = new agv($$1, $$3);
            cqm $$5 = $$0.b($$1);
            if ($$0.gu().a($$5.d())) {
               $$2.setValue(bnd.d);
               return $$4;
            } else {
               bne<cqm> $$6 = $$5.a(this.b.r, $$0, $$1);
               cqm $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bnd)$$2.getValue();
      }
   }

   public fwu a(fsa $$0, auj $$1, eyv $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fwu a(fsa $$0, auj $$1, eyv $$2, boolean $$3, boolean $$4) {
      return new fwu(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(ciu $$0, box $$1) {
      this.m();
      this.c.b(aft.a($$1, $$0.bS()));
      if (this.j != cwy.d) {
         $$0.e($$1);
         $$0.gt();
      }
   }

   public bnd a(ciu $$0, box $$1, bnc $$2) {
      this.m();
      this.c.b(aft.a($$1, $$0.bS(), $$2));
      return this.j == cwy.d ? bnd.d : $$0.a($$1, $$2);
   }

   public bnd a(ciu $$0, box $$1, epq $$2, bnc $$3) {
      this.m();
      ept $$4 = $$2.e().a($$1.dr(), $$1.dt(), $$1.dx());
      this.c.b(aft.a($$1, $$0.bS(), $$3, $$4));
      return this.j == cwy.d ? bnd.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, clz $$3, ciu $$4) {
      clq $$5 = $$4.bZ;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         iu<cnl> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cqm> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cnl $$9 : $$6) {
            $$8.add($$9.g().q());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cqm> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cqm $$12 = $$8.get($$11);
            cqm $$13 = $$6.get($$11).g();
            if (!cqm.a($$12, $$13)) {
               $$10.put($$11, $$13.q());
            }
         }

         this.c.b(new afn($$0, $$5.j(), $$1, $$2, $$3, $$5.g().q(), $$10));
      }
   }

   public void a(int $$0, ctr<?> $$1, boolean $$2) {
      this.c.b(new aga($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new afm($$0, $$1));
   }

   public void a(cqm $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new ago($$1, $$0));
      }
   }

   public void a(cqm $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new ago(-1, $$0));
      }
   }

   public void b(ciu $$0) {
      this.m();
      this.c.b(new agc(agc.a.f, ib.c, ih.a));
      $$0.fx();
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
      return this.b.s.bO() && this.b.s.cZ() instanceof bpi;
   }

   public boolean h() {
      return this.j == cwy.d;
   }

   @Nullable
   public cwy i() {
      return this.k;
   }

   public cwy j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new afz($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new afp($$0, $$1, $$2));
   }
}
