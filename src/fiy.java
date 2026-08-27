import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fiy {
   private static final Logger a = LogUtils.getLogger();
   private final eqq b;
   private final fit c;
   private gw d = new gw(-1, -1, -1);
   private cja e = cja.b;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private cpn j = cpn.e;
   @Nullable
   private cpn k;
   private int l;

   public fiy(eqq $$0, fit $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cbp $$0) {
      this.j.a($$0.fR());
   }

   public void a(cpn $$0, @Nullable cpn $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fR());
   }

   public void a(cpn $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.fR());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(gw $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         cpq $$1 = this.b.r;
         dfe $$2 = $$1.a_($$0);
         if (!this.b.s.eR().d().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            csq $$3 = $$2.b();
            if ($$3 instanceof cvu && !this.b.s.gn()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cbp)this.b.s);
               eah $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((cpr)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(gw $$0, hc $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.w_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dfe $$2 = this.b.r.a_($$0);
            this.b.az().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new acc(acc.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new acc(acc.a.b, this.d, $$1));
            }

            dfe $$3 = this.b.r.a_($$0);
            this.b.az().a(this.b.r, $$0, $$3, 0.0F);
            this.a(this.b.r, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.r, $$0, this.b.s);
               }

               if ($$4 && $$3.a(this.b.s, this.b.s.dK(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.s.eR();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.ah(), this.d, this.n());
               }

               return new acc(acc.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dfe $$0 = this.b.r.a_(this.d);
         this.b.az().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new acc(acc.a.b, this.d, hc.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.ah(), this.d, -1);
         this.b.s.gk();
      }
   }

   public boolean b(gw $$0, hc $$1) {
      this.o();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.w_().a($$0)) {
         this.h = 5;
         dfe $$2 = this.b.r.a_($$0);
         this.b.az().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new acc(acc.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dfe $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dK(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dad $$4 = $$3.w();
               this.b.ai().a(new gcc($$4.f(), apa.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gch.t(), $$0));
            }

            this.g++;
            this.b.az().a(this.b.r, $$0, $$3, ars.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new acc(acc.a.c, $$0, $$1, $$2);
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

   private void a(fis $$0, fjz $$1) {
      try (fjy $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         va<aaz> $$4 = $$1.predict($$3);
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
      cja $$1 = this.b.s.eR();
      return $$0.equals(this.d) && cja.c($$1, this.e);
   }

   private void o() {
      int $$0 = this.b.s.fQ().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new acl(this.l));
      }
   }

   public bgt a(fnb $$0, bgs $$1, ehe $$2) {
      this.o();
      if (!this.b.r.w_().a($$2.a())) {
         return bgt.e;
      } else {
         MutableObject<bgt> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new acu($$1, $$2, $$4);
         });
         return (bgt)$$3.getValue();
      }
   }

   private bgt b(fnb $$0, bgs $$1, ehe $$2) {
      gw $$3 = $$2.a();
      cja $$4 = $$0.b($$1);
      if (this.j == cpn.d) {
         return bgt.a;
      } else {
         boolean $$5 = !$$0.eR().b() || !$$0.eS().b();
         boolean $$6 = $$0.fG() && $$5;
         if (!$$6) {
            dfe $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bgt.e;
            }

            bgt $$8 = $$7.a(this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }
         }

         if (!$$4.b() && !$$0.gl().a($$4.d())) {
            clk $$9 = new clk($$0, $$1, $$2);
            bgt $$11;
            if (this.j.g()) {
               int $$10 = $$4.L();
               $$11 = $$4.a($$9);
               $$4.f($$10);
            } else {
               $$11 = $$4.a($$9);
            }

            return $$11;
         } else {
            return bgt.d;
         }
      }
   }

   public bgt a(cbp $$0, bgs $$1) {
      if (this.j == cpn.d) {
         return bgt.d;
      } else {
         this.o();
         this.c.b(new abw.b($$0.dp(), $$0.dr(), $$0.dv(), $$0.dA(), $$0.dC(), $$0.aA()));
         MutableObject<bgt> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            acv $$4 = new acv($$1, $$3);
            cja $$5 = $$0.b($$1);
            if ($$0.gl().a($$5.d())) {
               $$2.setValue(bgt.d);
               return $$4;
            } else {
               bgu<cja> $$6 = $$5.a(this.b.r, $$0, $$1);
               cja $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bgt)$$2.getValue();
      }
   }

   public fnb a(fis $$0, apk $$1, eqd $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fnb a(fis $$0, apk $$1, eqd $$2, boolean $$3, boolean $$4) {
      return new fnb(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cbp $$0, bil $$1) {
      this.o();
      this.c.b(abt.a($$1, $$0.bR()));
      if (this.j != cpn.d) {
         $$0.d($$1);
         $$0.gk();
      }
   }

   public bgt a(cbp $$0, bil $$1, bgs $$2) {
      this.o();
      this.c.b(abt.a($$1, $$0.bR(), $$2));
      return this.j == cpn.d ? bgt.d : $$0.a($$1, $$2);
   }

   public bgt a(cbp $$0, bil $$1, ehf $$2, bgs $$3) {
      this.o();
      ehi $$4 = $$2.e().a($$1.dp(), $$1.dr(), $$1.dv());
      this.c.b(abt.a($$1, $$0.bR(), $$3, $$4));
      return this.j == cpn.d ? bgt.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cep $$3, cbp $$4) {
      ceg $$5 = $$4.bQ;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         hp<cfy> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cja> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cfy $$9 : $$6) {
            $$8.add($$9.e().p());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cja> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cja $$12 = $$8.get($$11);
            cja $$13 = $$6.get($$11).e();
            if (!cja.a($$12, $$13)) {
               $$10.put($$11, $$13.p());
            }
         }

         this.c.b(new abp($$0, $$5.j(), $$1, $$2, $$3, $$5.g().p(), $$10));
      }
   }

   public void a(int $$0, cmf<?> $$1, boolean $$2) {
      this.c.b(new aca($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new abo($$0, $$1));
   }

   public void a(cja $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new aco($$1, $$0));
      }
   }

   public void a(cja $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new aco(-1, $$0));
      }
   }

   public void b(cbp $$0) {
      this.o();
      this.c.b(new acc(acc.a.f, gw.b, hc.a));
      $$0.fq();
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
      return this.b.s.bN() && this.b.s.cY() instanceof biu;
   }

   public boolean j() {
      return this.j == cpn.d;
   }

   @Nullable
   public cpn k() {
      return this.k;
   }

   public cpn l() {
      return this.j;
   }

   public boolean m() {
      return this.i;
   }

   public int n() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new abz($$0));
   }
}
