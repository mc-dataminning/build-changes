import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fik {
   private static final Logger a = LogUtils.getLogger();
   private final eqn b;
   private final fif c;
   private gv d = new gv(-1, -1, -1);
   private ciw e = ciw.b;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private cph j = cph.e;
   @Nullable
   private cph k;
   private int l;

   public fik(eqn $$0, fif $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cbl $$0) {
      this.j.a($$0.fR());
   }

   public void a(cph $$0, @Nullable cph $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.fR());
   }

   public void a(cph $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.fR());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(gv $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         cpk $$1 = this.b.s;
         dey $$2 = $$1.a_($$0);
         if (!this.b.t.eR().d().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            csk $$3 = $$2.b();
            if ($$3 instanceof cvo && !this.b.t.gn()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cbl)this.b.t);
               eab $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((cpl)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(gv $$0, hb $$1) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else if (!this.b.s.w_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dey $$2 = this.b.s.a_($$0);
            this.b.az().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new abx(abx.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new abx(abx.a.b, this.d, $$1));
            }

            dey $$3 = this.b.s.a_($$0);
            this.b.az().a(this.b.s, $$0, $$3, 0.0F);
            this.a(this.b.s, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.s, $$0, this.b.t);
               }

               if ($$4 && $$3.a(this.b.t, this.b.t.dK(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.t.eR();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.ah(), this.d, this.n());
               }

               return new abx(abx.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dey $$0 = this.b.s.a_(this.d);
         this.b.az().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new abx(abx.a.b, this.d, hb.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.ah(), this.d, -1);
         this.b.t.gk();
      }
   }

   public boolean b(gv $$0, hb $$1) {
      this.o();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.s.w_().a($$0)) {
         this.h = 5;
         dey $$2 = this.b.s.a_($$0);
         this.b.az().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new abx(abx.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dey $$3 = this.b.s.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dK(), $$0);
            if (this.g % 4.0F == 0.0F) {
               czx $$4 = $$3.w();
               this.b.ah().a(new gbj($$4.f(), aov.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gbo.t(), $$0));
            }

            this.g++;
            this.b.az().a(this.b.s, $$0, $$3, aro.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new abx(abx.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.s.a(this.b.t.ah(), this.d, this.n());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(fie $$0, fjg $$1) {
      try (fjf $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         uw<aav> $$4 = $$1.predict($$3);
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

   private boolean b(gv $$0) {
      ciw $$1 = this.b.t.eR();
      return $$0.equals(this.d) && ciw.c($$1, this.e);
   }

   private void o() {
      int $$0 = this.b.t.fQ().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new acg(this.l));
      }
   }

   public bgo a(fmi $$0, bgn $$1, ehb $$2) {
      this.o();
      if (!this.b.s.w_().a($$2.a())) {
         return bgo.e;
      } else {
         MutableObject<bgo> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new acp($$1, $$2, $$4);
         });
         return (bgo)$$3.getValue();
      }
   }

   private bgo b(fmi $$0, bgn $$1, ehb $$2) {
      gv $$3 = $$2.a();
      ciw $$4 = $$0.b($$1);
      if (this.j == cph.d) {
         return bgo.a;
      } else {
         boolean $$5 = !$$0.eR().b() || !$$0.eS().b();
         boolean $$6 = $$0.fG() && $$5;
         if (!$$6) {
            dey $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bgo.e;
            }

            bgo $$8 = $$7.a(this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }
         }

         if (!$$4.b() && !$$0.gl().a($$4.d())) {
            clg $$9 = new clg($$0, $$1, $$2);
            bgo $$11;
            if (this.j.g()) {
               int $$10 = $$4.L();
               $$11 = $$4.a($$9);
               $$4.f($$10);
            } else {
               $$11 = $$4.a($$9);
            }

            return $$11;
         } else {
            return bgo.d;
         }
      }
   }

   public bgo a(cbl $$0, bgn $$1) {
      if (this.j == cph.d) {
         return bgo.d;
      } else {
         this.o();
         this.c.b(new abr.b($$0.dp(), $$0.dr(), $$0.dv(), $$0.dA(), $$0.dC(), $$0.aA()));
         MutableObject<bgo> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            acq $$4 = new acq($$1, $$3);
            ciw $$5 = $$0.b($$1);
            if ($$0.gl().a($$5.d())) {
               $$2.setValue(bgo.d);
               return $$4;
            } else {
               bgp<ciw> $$6 = $$5.a(this.b.s, $$0, $$1);
               ciw $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bgo)$$2.getValue();
      }
   }

   public fmi a(fie $$0, apf $$1, eqa $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fmi a(fie $$0, apf $$1, eqa $$2, boolean $$3, boolean $$4) {
      return new fmi(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cbl $$0, big $$1) {
      this.o();
      this.c.b(abo.a($$1, $$0.bR()));
      if (this.j != cph.d) {
         $$0.d($$1);
         $$0.gk();
      }
   }

   public bgo a(cbl $$0, big $$1, bgn $$2) {
      this.o();
      this.c.b(abo.a($$1, $$0.bR(), $$2));
      return this.j == cph.d ? bgo.d : $$0.a($$1, $$2);
   }

   public bgo a(cbl $$0, big $$1, ehc $$2, bgn $$3) {
      this.o();
      ehf $$4 = $$2.e().a($$1.dp(), $$1.dr(), $$1.dv());
      this.c.b(abo.a($$1, $$0.bR(), $$3, $$4));
      return this.j == cph.d ? bgo.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cel $$3, cbl $$4) {
      cec $$5 = $$4.bQ;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         ho<cfu> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<ciw> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cfu $$9 : $$6) {
            $$8.add($$9.e().p());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<ciw> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            ciw $$12 = $$8.get($$11);
            ciw $$13 = $$6.get($$11).e();
            if (!ciw.a($$12, $$13)) {
               $$10.put($$11, $$13.p());
            }
         }

         this.c.b(new abk($$0, $$5.j(), $$1, $$2, $$3, $$5.g().p(), $$10));
      }
   }

   public void a(int $$0, clz<?> $$1, boolean $$2) {
      this.c.b(new abv($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new abj($$0, $$1));
   }

   public void a(ciw $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new acj($$1, $$0));
      }
   }

   public void a(ciw $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new acj(-1, $$0));
      }
   }

   public void b(cbl $$0) {
      this.o();
      this.c.b(new abx(abx.a.f, gv.b, hb.a));
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
      return this.b.t.bN() && this.b.t.cY() instanceof bip;
   }

   public boolean j() {
      return this.j == cph.d;
   }

   @Nullable
   public cph k() {
      return this.k;
   }

   public cph l() {
      return this.j;
   }

   public boolean m() {
      return this.i;
   }

   public int n() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new abu($$0));
   }
}
