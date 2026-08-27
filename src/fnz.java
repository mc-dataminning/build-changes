import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fnz {
   private static final Logger a = LogUtils.getLogger();
   private final evi b;
   private final fnt c;
   private hx d = new hx(-1, -1, -1);
   private cmy e = cmy.f;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private ctm j = ctm.e;
   @Nullable
   private ctm k;
   private int l;

   public fnz(evi $$0, fnt $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cfi $$0) {
      this.j.a($$0.fT());
   }

   public void a(ctm $$0, @Nullable ctm $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fT());
   }

   public void a(ctm $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.fT());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(hx $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         ctp $$1 = this.b.r;
         djh $$2 = $$1.a_($$0);
         if (!this.b.s.eT().d().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            cwq $$3 = $$2.b();
            if ($$3 instanceof czy && !this.b.s.gp()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cfi)this.b.s);
               eer $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((ctq)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(hx $$0, ic $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.D_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            djh $$2 = this.b.r.a_($$0);
            this.b.az().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new aem(aem.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new aem(aem.a.b, this.d, $$1));
            }

            djh $$3 = this.b.r.a_($$0);
            this.b.az().a(this.b.r, $$0, $$3, 0.0F);
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
                  this.b.r.a(this.b.s.aj(), this.d, this.n());
               }

               return new aem(aem.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         djh $$0 = this.b.r.a_(this.d);
         this.b.az().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new aem(aem.a.b, this.d, ic.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.aj(), this.d, -1);
         this.b.s.gm();
      }
   }

   public boolean b(hx $$0, ic $$1) {
      this.o();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.D_().a($$0)) {
         this.h = 5;
         djh $$2 = this.b.r.a_($$0);
         this.b.az().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new aem(aem.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         djh $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dM(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dec $$4 = $$3.w();
               this.b.ai().a(new ghv($$4.f(), art.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gia.t(), $$0));
            }

            this.g++;
            this.b.az().a(this.b.r, $$0, $$3, auo.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new aem(aem.a.c, $$0, $$1, $$2);
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

   private void a(fns $$0, fpb $$1) {
      try (fpa $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         xf<adj> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public float c() {
      return cfi.v(this.j.g());
   }

   public void d() {
      this.o();
      if (this.c.m().k()) {
         this.c.m().d();
      } else {
         this.c.m().p();
      }
   }

   private boolean b(hx $$0) {
      cmy $$1 = this.b.s.eT();
      return $$0.equals(this.d) && cmy.c($$1, this.e);
   }

   private void o() {
      int $$0 = this.b.s.fS().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aev(this.l));
      }
   }

   public bkb a(fsj $$0, bka $$1, elp $$2) {
      this.o();
      if (!this.b.r.D_().a($$2.a())) {
         return bkb.e;
      } else {
         MutableObject<bkb> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new afe($$1, $$2, $$4);
         });
         return (bkb)$$3.getValue();
      }
   }

   private bkb b(fsj $$0, bka $$1, elp $$2) {
      hx $$3 = $$2.a();
      cmy $$4 = $$0.b($$1);
      if (this.j == ctm.d) {
         return bkb.a;
      } else {
         boolean $$5 = !$$0.eT().b() || !$$0.eU().b();
         boolean $$6 = $$0.fI() && $$5;
         if (!$$6) {
            djh $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bkb.e;
            }

            bkb $$8 = $$7.a(this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }
         }

         if (!$$4.b() && !$$0.gn().a($$4.d())) {
            cpj $$9 = new cpj($$0, $$1, $$2);
            bkb $$11;
            if (this.j.g()) {
               int $$10 = $$4.L();
               $$11 = $$4.a($$9);
               $$4.f($$10);
            } else {
               $$11 = $$4.a($$9);
            }

            return $$11;
         } else {
            return bkb.d;
         }
      }
   }

   public bkb a(cfi $$0, bka $$1) {
      if (this.j == ctm.d) {
         return bkb.d;
      } else {
         this.o();
         this.c.b(new aeg.b($$0.dr(), $$0.dt(), $$0.dx(), $$0.dC(), $$0.dE(), $$0.aC()));
         MutableObject<bkb> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            aff $$4 = new aff($$1, $$3);
            cmy $$5 = $$0.b($$1);
            if ($$0.gn().a($$5.d())) {
               $$2.setValue(bkb.d);
               return $$4;
            } else {
               bkc<cmy> $$6 = $$5.a(this.b.r, $$0, $$1);
               cmy $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bkb)$$2.getValue();
      }
   }

   public fsj a(fns $$0, asd $$1, euv $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fsj a(fns $$0, asd $$1, euv $$2, boolean $$3, boolean $$4) {
      return new fsj(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cfi $$0, blv $$1) {
      this.o();
      this.c.b(aed.a($$1, $$0.bS()));
      if (this.j != ctm.d) {
         $$0.d($$1);
         $$0.gm();
      }
   }

   public bkb a(cfi $$0, blv $$1, bka $$2) {
      this.o();
      this.c.b(aed.a($$1, $$0.bS(), $$2));
      return this.j == ctm.d ? bkb.d : $$0.a($$1, $$2);
   }

   public bkb a(cfi $$0, blv $$1, elq $$2, bka $$3) {
      this.o();
      elt $$4 = $$2.e().a($$1.dr(), $$1.dt(), $$1.dx());
      this.c.b(aed.a($$1, $$0.bS(), $$3, $$4));
      return this.j == ctm.d ? bkb.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cik $$3, cfi $$4) {
      cib $$5 = $$4.bS;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         iq<cjw> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cmy> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cjw $$9 : $$6) {
            $$8.add($$9.g().p());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cmy> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cmy $$12 = $$8.get($$11);
            cmy $$13 = $$6.get($$11).g();
            if (!cmy.a($$12, $$13)) {
               $$10.put($$11, $$13.p());
            }
         }

         this.c.b(new ady($$0, $$5.j(), $$1, $$2, $$3, $$5.g().p(), $$10));
      }
   }

   public void a(int $$0, cqe<?> $$1, boolean $$2) {
      this.c.b(new aek($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new adx($$0, $$1));
   }

   public void a(cmy $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new aey($$1, $$0));
      }
   }

   public void a(cmy $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new aey(-1, $$0));
      }
   }

   public void b(cfi $$0) {
      this.o();
      this.c.b(new aem(aem.a.f, hx.b, ic.a));
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
      return this.b.s.bO() && this.b.s.cZ() instanceof bme;
   }

   public boolean j() {
      return this.j == ctm.d;
   }

   @Nullable
   public ctm k() {
      return this.k;
   }

   public ctm l() {
      return this.j;
   }

   public boolean m() {
      return this.i;
   }

   public int n() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new aej($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new aea($$0, $$1, $$2));
   }
}
