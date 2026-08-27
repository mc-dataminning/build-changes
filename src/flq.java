import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class flq {
   private static final Logger a = LogUtils.getLogger();
   private final etd b;
   private final flk c;
   private ht d = new ht(-1, -1, -1);
   private clj e = clj.b;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private crx j = crx.e;
   @Nullable
   private crx k;
   private int l;

   public flq(etd $$0, flk $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cdu $$0) {
      this.j.a($$0.fU());
   }

   public void a(crx $$0, @Nullable crx $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fU());
   }

   public void a(crx $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.fU());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(ht $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         csa $$1 = this.b.r;
         dhi $$2 = $$1.a_($$0);
         if (!this.b.s.eU().d().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            cva $$3 = $$2.b();
            if ($$3 instanceof cyi && !this.b.s.gq()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cdu)this.b.s);
               ecs $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((csb)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(ht $$0, hx $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.C_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dhi $$2 = this.b.r.a_($$0);
            this.b.ay().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new ado(ado.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ado(ado.a.b, this.d, $$1));
            }

            dhi $$3 = this.b.r.a_($$0);
            this.b.ay().a(this.b.r, $$0, $$3, 0.0F);
            this.a(this.b.r, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.r, $$0, this.b.s);
               }

               if ($$4 && $$3.a(this.b.s, this.b.s.dN(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.s.eU();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.aj(), this.d, this.n());
               }

               return new ado(ado.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dhi $$0 = this.b.r.a_(this.d);
         this.b.ay().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new ado(ado.a.b, this.d, hx.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.aj(), this.d, -1);
         this.b.s.gn();
      }
   }

   public boolean b(ht $$0, hx $$1) {
      this.o();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.C_().a($$0)) {
         this.h = 5;
         dhi $$2 = this.b.r.a_($$0);
         this.b.ay().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new ado(ado.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dhi $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dN(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dcm $$4 = $$3.w();
               this.b.ah().a(new gex($$4.f(), aqs.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gfc.t(), $$0));
            }

            this.g++;
            this.b.ay().a(this.b.r, $$0, $$3, atm.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new ado(ado.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.r.a(this.b.s.aj(), this.d, this.n());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(flj $$0, fmr $$1) {
      try (fmq $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         wk<acl> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public float c() {
      return cdu.v(this.j.g());
   }

   public void d() {
      this.o();
      if (this.c.m().k()) {
         this.c.m().d();
      } else {
         this.c.m().p();
      }
   }

   private boolean b(ht $$0) {
      clj $$1 = this.b.s.eU();
      return $$0.equals(this.d) && clj.c($$1, this.e);
   }

   private void o() {
      int $$0 = this.b.s.fT().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new adx(this.l));
      }
   }

   public bix a(fpw $$0, biw $$1, ejq $$2) {
      this.o();
      if (!this.b.r.C_().a($$2.a())) {
         return bix.e;
      } else {
         MutableObject<bix> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aeg($$1, $$2, $$4);
         });
         return (bix)$$3.getValue();
      }
   }

   private bix b(fpw $$0, biw $$1, ejq $$2) {
      ht $$3 = $$2.a();
      clj $$4 = $$0.b($$1);
      if (this.j == crx.d) {
         return bix.a;
      } else {
         boolean $$5 = !$$0.eU().b() || !$$0.eV().b();
         boolean $$6 = $$0.fJ() && $$5;
         if (!$$6) {
            dhi $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bix.e;
            }

            bix $$8 = $$7.a(this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }
         }

         if (!$$4.b() && !$$0.go().a($$4.d())) {
            cnt $$9 = new cnt($$0, $$1, $$2);
            bix $$11;
            if (this.j.g()) {
               int $$10 = $$4.L();
               $$11 = $$4.a($$9);
               $$4.f($$10);
            } else {
               $$11 = $$4.a($$9);
            }

            return $$11;
         } else {
            return bix.d;
         }
      }
   }

   public bix a(cdu $$0, biw $$1) {
      if (this.j == crx.d) {
         return bix.d;
      } else {
         this.o();
         this.c.b(new adi.b($$0.ds(), $$0.du(), $$0.dy(), $$0.dD(), $$0.dF(), $$0.aC()));
         MutableObject<bix> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            aeh $$4 = new aeh($$1, $$3);
            clj $$5 = $$0.b($$1);
            if ($$0.go().a($$5.d())) {
               $$2.setValue(bix.d);
               return $$4;
            } else {
               biy<clj> $$6 = $$5.a(this.b.r, $$0, $$1);
               clj $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bix)$$2.getValue();
      }
   }

   public fpw a(flj $$0, arc $$1, esq $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fpw a(flj $$0, arc $$1, esq $$2, boolean $$3, boolean $$4) {
      return new fpw(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cdu $$0, bkq $$1) {
      this.o();
      this.c.b(adf.a($$1, $$0.bS()));
      if (this.j != crx.d) {
         $$0.d($$1);
         $$0.gn();
      }
   }

   public bix a(cdu $$0, bkq $$1, biw $$2) {
      this.o();
      this.c.b(adf.a($$1, $$0.bS(), $$2));
      return this.j == crx.d ? bix.d : $$0.a($$1, $$2);
   }

   public bix a(cdu $$0, bkq $$1, ejr $$2, biw $$3) {
      this.o();
      eju $$4 = $$2.e().a($$1.ds(), $$1.du(), $$1.dy());
      this.c.b(adf.a($$1, $$0.bS(), $$3, $$4));
      return this.j == crx.d ? bix.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cgv $$3, cdu $$4) {
      cgm $$5 = $$4.bS;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         il<cih> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<clj> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cih $$9 : $$6) {
            $$8.add($$9.f().p());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<clj> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            clj $$12 = $$8.get($$11);
            clj $$13 = $$6.get($$11).f();
            if (!clj.a($$12, $$13)) {
               $$10.put($$11, $$13.p());
            }
         }

         this.c.b(new ada($$0, $$5.j(), $$1, $$2, $$3, $$5.g().p(), $$10));
      }
   }

   public void a(int $$0, coq<?> $$1, boolean $$2) {
      this.c.b(new adm($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new acz($$0, $$1));
   }

   public void a(clj $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new aea($$1, $$0));
      }
   }

   public void a(clj $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new aea(-1, $$0));
      }
   }

   public void b(cdu $$0) {
      this.o();
      this.c.b(new ado(ado.a.f, ht.b, hx.a));
      $$0.ft();
   }

   public boolean e() {
      return this.j.h();
   }

   public boolean f() {
      return !this.j.g();
   }

   public boolean g() {
      return this.j.g();
   }

   public boolean h() {
      return this.j.g();
   }

   public boolean i() {
      return this.b.s.bO() && this.b.s.da() instanceof bkz;
   }

   public boolean j() {
      return this.j == crx.d;
   }

   @Nullable
   public crx k() {
      return this.k;
   }

   public crx l() {
      return this.j;
   }

   public boolean m() {
      return this.i;
   }

   public int n() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new adl($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new adc($$0, $$1, $$2));
   }
}
