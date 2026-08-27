import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fjd {
   private static final Logger a = LogUtils.getLogger();
   private final eqv b;
   private final fiy c;
   private gw d = new gw(-1, -1, -1);
   private cjf e = cjf.b;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private cps j = cps.e;
   @Nullable
   private cps k;
   private int l;

   public fjd(eqv $$0, fiy $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cbu $$0) {
      this.j.a($$0.fS());
   }

   public void a(cps $$0, @Nullable cps $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fS());
   }

   public void a(cps $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.fS());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(gw $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         cpv $$1 = this.b.r;
         dfj $$2 = $$1.a_($$0);
         if (!this.b.s.eS().d().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            csv $$3 = $$2.b();
            if ($$3 instanceof cvz && !this.b.s.go()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cbu)this.b.s);
               eam $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((cpw)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(gw $$0, hc $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.B_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dfj $$2 = this.b.r.a_($$0);
            this.b.az().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new acf(acf.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new acf(acf.a.b, this.d, $$1));
            }

            dfj $$3 = this.b.r.a_($$0);
            this.b.az().a(this.b.r, $$0, $$3, 0.0F);
            this.a(this.b.r, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.r, $$0, this.b.s);
               }

               if ($$4 && $$3.a(this.b.s, this.b.s.dL(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.s.eS();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.ai(), this.d, this.n());
               }

               return new acf(acf.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dfj $$0 = this.b.r.a_(this.d);
         this.b.az().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new acf(acf.a.b, this.d, hc.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.ai(), this.d, -1);
         this.b.s.gl();
      }
   }

   public boolean b(gw $$0, hc $$1) {
      this.o();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.B_().a($$0)) {
         this.h = 5;
         dfj $$2 = this.b.r.a_($$0);
         this.b.az().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new acf(acf.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dfj $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dL(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dai $$4 = $$3.w();
               this.b.ai().a(new gch($$4.f(), apf.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gcm.t(), $$0));
            }

            this.g++;
            this.b.az().a(this.b.r, $$0, $$3, arx.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new acf(acf.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.r.a(this.b.s.ai(), this.d, this.n());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(fix $$0, fke $$1) {
      try (fkd $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         vd<abd> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public float c() {
      return this.j.g() ? 5.0F : 4.5F;
   }

   public void d() {
      this.o();
      if (this.c.l().k()) {
         this.c.l().d();
      } else {
         this.c.l().p();
      }
   }

   private boolean b(gw $$0) {
      cjf $$1 = this.b.s.eS();
      return $$0.equals(this.d) && cjf.c($$1, this.e);
   }

   private void o() {
      int $$0 = this.b.s.fR().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aco(this.l));
      }
   }

   public bgy a(fng $$0, bgx $$1, ehj $$2) {
      this.o();
      if (!this.b.r.B_().a($$2.a())) {
         return bgy.e;
      } else {
         MutableObject<bgy> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new acx($$1, $$2, $$4);
         });
         return (bgy)$$3.getValue();
      }
   }

   private bgy b(fng $$0, bgx $$1, ehj $$2) {
      gw $$3 = $$2.a();
      cjf $$4 = $$0.b($$1);
      if (this.j == cps.d) {
         return bgy.a;
      } else {
         boolean $$5 = !$$0.eS().b() || !$$0.eT().b();
         boolean $$6 = $$0.fH() && $$5;
         if (!$$6) {
            dfj $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bgy.e;
            }

            bgy $$8 = $$7.a(this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }
         }

         if (!$$4.b() && !$$0.gm().a($$4.d())) {
            clp $$9 = new clp($$0, $$1, $$2);
            bgy $$11;
            if (this.j.g()) {
               int $$10 = $$4.L();
               $$11 = $$4.a($$9);
               $$4.f($$10);
            } else {
               $$11 = $$4.a($$9);
            }

            return $$11;
         } else {
            return bgy.d;
         }
      }
   }

   public bgy a(cbu $$0, bgx $$1) {
      if (this.j == cps.d) {
         return bgy.d;
      } else {
         this.o();
         this.c.b(new abz.b($$0.dq(), $$0.ds(), $$0.dw(), $$0.dB(), $$0.dD(), $$0.aB()));
         MutableObject<bgy> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            acy $$4 = new acy($$1, $$3);
            cjf $$5 = $$0.b($$1);
            if ($$0.gm().a($$5.d())) {
               $$2.setValue(bgy.d);
               return $$4;
            } else {
               bgz<cjf> $$6 = $$5.a(this.b.r, $$0, $$1);
               cjf $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bgy)$$2.getValue();
      }
   }

   public fng a(fix $$0, app $$1, eqi $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fng a(fix $$0, app $$1, eqi $$2, boolean $$3, boolean $$4) {
      return new fng(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cbu $$0, biq $$1) {
      this.o();
      this.c.b(abw.a($$1, $$0.bS()));
      if (this.j != cps.d) {
         $$0.d($$1);
         $$0.gl();
      }
   }

   public bgy a(cbu $$0, biq $$1, bgx $$2) {
      this.o();
      this.c.b(abw.a($$1, $$0.bS(), $$2));
      return this.j == cps.d ? bgy.d : $$0.a($$1, $$2);
   }

   public bgy a(cbu $$0, biq $$1, ehk $$2, bgx $$3) {
      this.o();
      ehn $$4 = $$2.e().a($$1.dq(), $$1.ds(), $$1.dw());
      this.c.b(abw.a($$1, $$0.bS(), $$3, $$4));
      return this.j == cps.d ? bgy.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, ceu $$3, cbu $$4) {
      cel $$5 = $$4.bS;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         hp<cgd> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cjf> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cgd $$9 : $$6) {
            $$8.add($$9.e().p());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cjf> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cjf $$12 = $$8.get($$11);
            cjf $$13 = $$6.get($$11).e();
            if (!cjf.a($$12, $$13)) {
               $$10.put($$11, $$13.p());
            }
         }

         this.c.b(new abs($$0, $$5.j(), $$1, $$2, $$3, $$5.g().p(), $$10));
      }
   }

   public void a(int $$0, cmk<?> $$1, boolean $$2) {
      this.c.b(new acd($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new abr($$0, $$1));
   }

   public void a(cjf $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new acr($$1, $$0));
      }
   }

   public void a(cjf $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new acr(-1, $$0));
      }
   }

   public void b(cbu $$0) {
      this.o();
      this.c.b(new acf(acf.a.f, gw.b, hc.a));
      $$0.fr();
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
      return this.b.s.bO() && this.b.s.cZ() instanceof biz;
   }

   public boolean j() {
      return this.j == cps.d;
   }

   @Nullable
   public cps k() {
      return this.k;
   }

   public cps l() {
      return this.j;
   }

   public boolean m() {
      return this.i;
   }

   public int n() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new acc($$0));
   }
}
