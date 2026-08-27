import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fiz {
   private static final Logger a = LogUtils.getLogger();
   private final eqp b;
   private final fit c;
   private gw d = new gw(-1, -1, -1);
   private cjl e = cjl.b;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private cpy j = cpy.e;
   @Nullable
   private cpy k;
   private int l;

   public fiz(eqp $$0, fit $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cca $$0) {
      this.j.a($$0.fT());
   }

   public void a(cpy $$0, @Nullable cpy $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fT());
   }

   public void a(cpy $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.fT());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(gw $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         cqb $$1 = this.b.r;
         dfd $$2 = $$1.a_($$0);
         if (!this.b.s.eS().d().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            ctc $$3 = $$2.b();
            if ($$3 instanceof cwi && !this.b.s.gp()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cca)this.b.s);
               eag $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((cqc)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(gw $$0, ha $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.B_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dfd $$2 = this.b.r.a_($$0);
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

            dfd $$3 = this.b.r.a_($$0);
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

               return new acf(acf.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dfd $$0 = this.b.r.a_(this.d);
         this.b.az().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new acf(acf.a.b, this.d, ha.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.ah(), this.d, -1);
         this.b.s.gm();
      }
   }

   public boolean b(gw $$0, ha $$1) {
      this.o();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.B_().a($$0)) {
         this.h = 5;
         dfd $$2 = this.b.r.a_($$0);
         this.b.az().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new acf(acf.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dfd $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dL(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dan $$4 = $$3.w();
               this.b.ai().a(new gcd($$4.f(), aph.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gci.t(), $$0));
            }

            this.g++;
            this.b.az().a(this.b.r, $$0, $$3, asb.a(this.f, 0.0F, 1.0F));
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

            this.b.r.a(this.b.s.ah(), this.d, this.n());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(fis $$0, fka $$1) {
      try (fjz $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         ve<abd> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public float c() {
      return this.j.g() ? 5.0F : 4.5F;
   }

   public void d() {
      this.o();
      if (this.c.m().k()) {
         this.c.m().d();
      } else {
         this.c.m().p();
      }
   }

   private boolean b(gw $$0) {
      cjl $$1 = this.b.s.eS();
      return $$0.equals(this.d) && cjl.c($$1, this.e);
   }

   private void o() {
      int $$0 = this.b.s.fS().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aco(this.l));
      }
   }

   public bhe a(fnc $$0, bhd $$1, ehd $$2) {
      this.o();
      if (!this.b.r.B_().a($$2.a())) {
         return bhe.e;
      } else {
         MutableObject<bhe> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new acx($$1, $$2, $$4);
         });
         return (bhe)$$3.getValue();
      }
   }

   private bhe b(fnc $$0, bhd $$1, ehd $$2) {
      gw $$3 = $$2.a();
      cjl $$4 = $$0.b($$1);
      if (this.j == cpy.d) {
         return bhe.a;
      } else {
         boolean $$5 = !$$0.eS().b() || !$$0.eT().b();
         boolean $$6 = $$0.fI() && $$5;
         if (!$$6) {
            dfd $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bhe.e;
            }

            bhe $$8 = $$7.a(this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }
         }

         if (!$$4.b() && !$$0.gn().a($$4.d())) {
            clv $$9 = new clv($$0, $$1, $$2);
            bhe $$11;
            if (this.j.g()) {
               int $$10 = $$4.L();
               $$11 = $$4.a($$9);
               $$4.f($$10);
            } else {
               $$11 = $$4.a($$9);
            }

            return $$11;
         } else {
            return bhe.d;
         }
      }
   }

   public bhe a(cca $$0, bhd $$1) {
      if (this.j == cpy.d) {
         return bhe.d;
      } else {
         this.o();
         this.c.b(new abz.b($$0.dq(), $$0.ds(), $$0.dw(), $$0.dB(), $$0.dD(), $$0.aA()));
         MutableObject<bhe> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            acy $$4 = new acy($$1, $$3);
            cjl $$5 = $$0.b($$1);
            if ($$0.gn().a($$5.d())) {
               $$2.setValue(bhe.d);
               return $$4;
            } else {
               bhf<cjl> $$6 = $$5.a(this.b.r, $$0, $$1);
               cjl $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bhe)$$2.getValue();
      }
   }

   public fnc a(fis $$0, apr $$1, eqc $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fnc a(fis $$0, apr $$1, eqc $$2, boolean $$3, boolean $$4) {
      return new fnc(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cca $$0, biw $$1) {
      this.o();
      this.c.b(abw.a($$1, $$0.bR()));
      if (this.j != cpy.d) {
         $$0.d($$1);
         $$0.gm();
      }
   }

   public bhe a(cca $$0, biw $$1, bhd $$2) {
      this.o();
      this.c.b(abw.a($$1, $$0.bR(), $$2));
      return this.j == cpy.d ? bhe.d : $$0.a($$1, $$2);
   }

   public bhe a(cca $$0, biw $$1, ehe $$2, bhd $$3) {
      this.o();
      ehh $$4 = $$2.e().a($$1.dq(), $$1.ds(), $$1.dw());
      this.c.b(abw.a($$1, $$0.bR(), $$3, $$4));
      return this.j == cpy.d ? bhe.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cfa $$3, cca $$4) {
      cer $$5 = $$4.bS;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         hn<cgj> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cjl> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cgj $$9 : $$6) {
            $$8.add($$9.e().p());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cjl> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cjl $$12 = $$8.get($$11);
            cjl $$13 = $$6.get($$11).e();
            if (!cjl.a($$12, $$13)) {
               $$10.put($$11, $$13.p());
            }
         }

         this.c.b(new abs($$0, $$5.j(), $$1, $$2, $$3, $$5.g().p(), $$10));
      }
   }

   public void a(int $$0, cmq<?> $$1, boolean $$2) {
      this.c.b(new acd($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new abr($$0, $$1));
   }

   public void a(cjl $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new acr($$1, $$0));
      }
   }

   public void a(cjl $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new acr(-1, $$0));
      }
   }

   public void b(cca $$0) {
      this.o();
      this.c.b(new acf(acf.a.f, gw.b, ha.a));
      $$0.fs();
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
      return this.b.s.bN() && this.b.s.cY() instanceof bjf;
   }

   public boolean j() {
      return this.j == cpy.d;
   }

   @Nullable
   public cpy k() {
      return this.k;
   }

   public cpy l() {
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
