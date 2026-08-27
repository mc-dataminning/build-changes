import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fjf {
   private static final Logger a = LogUtils.getLogger();
   private final eqx b;
   private final fja c;
   private gw d = new gw(-1, -1, -1);
   private cjh e = cjh.b;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private cpu j = cpu.e;
   @Nullable
   private cpu k;
   private int l;

   public fjf(eqx $$0, fja $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cbw $$0) {
      this.j.a($$0.fS());
   }

   public void a(cpu $$0, @Nullable cpu $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fS());
   }

   public void a(cpu $$0) {
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
         cpx $$1 = this.b.r;
         dfl $$2 = $$1.a_($$0);
         if (!this.b.s.eS().d().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            csx $$3 = $$2.b();
            if ($$3 instanceof cwb && !this.b.s.go()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cbw)this.b.s);
               eao $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((cpy)$$1, $$0, $$2);
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
            dfl $$2 = this.b.r.a_($$0);
            this.b.az().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new acg(acg.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new acg(acg.a.b, this.d, $$1));
            }

            dfl $$3 = this.b.r.a_($$0);
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
                  this.b.r.a(this.b.s.ah(), this.d, this.n());
               }

               return new acg(acg.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dfl $$0 = this.b.r.a_(this.d);
         this.b.az().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new acg(acg.a.b, this.d, hc.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.ah(), this.d, -1);
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
         dfl $$2 = this.b.r.a_($$0);
         this.b.az().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new acg(acg.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dfl $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dL(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dak $$4 = $$3.w();
               this.b.ai().a(new gcj($$4.f(), apg.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gco.t(), $$0));
            }

            this.g++;
            this.b.az().a(this.b.r, $$0, $$3, ary.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new acg(acg.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.r.a(this.b.s.ah(), this.d, this.n());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(fiz $$0, fkg $$1) {
      try (fkf $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         vf<abe> $$4 = $$1.predict($$3);
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
      cjh $$1 = this.b.s.eS();
      return $$0.equals(this.d) && cjh.c($$1, this.e);
   }

   private void o() {
      int $$0 = this.b.s.fR().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new acp(this.l));
      }
   }

   public bha a(fni $$0, bgz $$1, ehl $$2) {
      this.o();
      if (!this.b.r.B_().a($$2.a())) {
         return bha.e;
      } else {
         MutableObject<bha> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new acy($$1, $$2, $$4);
         });
         return (bha)$$3.getValue();
      }
   }

   private bha b(fni $$0, bgz $$1, ehl $$2) {
      gw $$3 = $$2.a();
      cjh $$4 = $$0.b($$1);
      if (this.j == cpu.d) {
         return bha.a;
      } else {
         boolean $$5 = !$$0.eS().b() || !$$0.eT().b();
         boolean $$6 = $$0.fH() && $$5;
         if (!$$6) {
            dfl $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bha.e;
            }

            bha $$8 = $$7.a(this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }
         }

         if (!$$4.b() && !$$0.gm().a($$4.d())) {
            clr $$9 = new clr($$0, $$1, $$2);
            bha $$11;
            if (this.j.g()) {
               int $$10 = $$4.L();
               $$11 = $$4.a($$9);
               $$4.f($$10);
            } else {
               $$11 = $$4.a($$9);
            }

            return $$11;
         } else {
            return bha.d;
         }
      }
   }

   public bha a(cbw $$0, bgz $$1) {
      if (this.j == cpu.d) {
         return bha.d;
      } else {
         this.o();
         this.c.b(new aca.b($$0.dq(), $$0.ds(), $$0.dw(), $$0.dB(), $$0.dD(), $$0.aA()));
         MutableObject<bha> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            acz $$4 = new acz($$1, $$3);
            cjh $$5 = $$0.b($$1);
            if ($$0.gm().a($$5.d())) {
               $$2.setValue(bha.d);
               return $$4;
            } else {
               bhb<cjh> $$6 = $$5.a(this.b.r, $$0, $$1);
               cjh $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bha)$$2.getValue();
      }
   }

   public fni a(fiz $$0, apq $$1, eqk $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fni a(fiz $$0, apq $$1, eqk $$2, boolean $$3, boolean $$4) {
      return new fni(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cbw $$0, bis $$1) {
      this.o();
      this.c.b(abx.a($$1, $$0.bR()));
      if (this.j != cpu.d) {
         $$0.d($$1);
         $$0.gl();
      }
   }

   public bha a(cbw $$0, bis $$1, bgz $$2) {
      this.o();
      this.c.b(abx.a($$1, $$0.bR(), $$2));
      return this.j == cpu.d ? bha.d : $$0.a($$1, $$2);
   }

   public bha a(cbw $$0, bis $$1, ehm $$2, bgz $$3) {
      this.o();
      ehp $$4 = $$2.e().a($$1.dq(), $$1.ds(), $$1.dw());
      this.c.b(abx.a($$1, $$0.bR(), $$3, $$4));
      return this.j == cpu.d ? bha.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cew $$3, cbw $$4) {
      cen $$5 = $$4.bS;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         hp<cgf> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cjh> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cgf $$9 : $$6) {
            $$8.add($$9.e().p());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cjh> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cjh $$12 = $$8.get($$11);
            cjh $$13 = $$6.get($$11).e();
            if (!cjh.a($$12, $$13)) {
               $$10.put($$11, $$13.p());
            }
         }

         this.c.b(new abt($$0, $$5.j(), $$1, $$2, $$3, $$5.g().p(), $$10));
      }
   }

   public void a(int $$0, cmm<?> $$1, boolean $$2) {
      this.c.b(new ace($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new abs($$0, $$1));
   }

   public void a(cjh $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new acs($$1, $$0));
      }
   }

   public void a(cjh $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new acs(-1, $$0));
      }
   }

   public void b(cbw $$0) {
      this.o();
      this.c.b(new acg(acg.a.f, gw.b, hc.a));
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
      return this.b.s.bN() && this.b.s.cY() instanceof bjb;
   }

   public boolean j() {
      return this.j == cpu.d;
   }

   @Nullable
   public cpu k() {
      return this.k;
   }

   public cpu l() {
      return this.j;
   }

   public boolean m() {
      return this.i;
   }

   public int n() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new acd($$0));
   }
}
