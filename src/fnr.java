import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fnr {
   private static final Logger a = LogUtils.getLogger();
   private final eva b;
   private final fnl c;
   private hx d = new hx(-1, -1, -1);
   private cmr e = cmr.f;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private ctf j = ctf.e;
   @Nullable
   private ctf k;
   private int l;

   public fnr(eva $$0, fnl $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cfb $$0) {
      this.j.a($$0.fT());
   }

   public void a(ctf $$0, @Nullable ctf $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fT());
   }

   public void a(ctf $$0) {
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
         cti $$1 = this.b.r;
         dja $$2 = $$1.a_($$0);
         if (!this.b.s.eT().d().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            cwj $$3 = $$2.b();
            if ($$3 instanceof czr && !this.b.s.gp()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cfb)this.b.s);
               eek $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((ctj)$$1, $$0, $$2);
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
            dja $$2 = this.b.r.a_($$0);
            this.b.ay().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new aej(aej.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new aej(aej.a.b, this.d, $$1));
            }

            dja $$3 = this.b.r.a_($$0);
            this.b.ay().a(this.b.r, $$0, $$3, 0.0F);
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

               return new aej(aej.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dja $$0 = this.b.r.a_(this.d);
         this.b.ay().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new aej(aej.a.b, this.d, ic.a));
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
         dja $$2 = this.b.r.a_($$0);
         this.b.ay().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new aej(aej.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dja $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dM(), $$0);
            if (this.g % 4.0F == 0.0F) {
               ddv $$4 = $$3.w();
               this.b.ah().a(new ghi($$4.f(), arn.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, ghn.t(), $$0));
            }

            this.g++;
            this.b.ay().a(this.b.r, $$0, $$3, aui.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new aej(aej.a.c, $$0, $$1, $$2);
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

   private void a(fnk $$0, fot $$1) {
      try (fos $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         xd<adg> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public float c() {
      return cfb.v(this.j.g());
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
      cmr $$1 = this.b.s.eT();
      return $$0.equals(this.d) && cmr.c($$1, this.e);
   }

   private void o() {
      int $$0 = this.b.s.fS().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aes(this.l));
      }
   }

   public bjv a(fsb $$0, bju $$1, eli $$2) {
      this.o();
      if (!this.b.r.D_().a($$2.a())) {
         return bjv.e;
      } else {
         MutableObject<bjv> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new afb($$1, $$2, $$4);
         });
         return (bjv)$$3.getValue();
      }
   }

   private bjv b(fsb $$0, bju $$1, eli $$2) {
      hx $$3 = $$2.a();
      cmr $$4 = $$0.b($$1);
      if (this.j == ctf.d) {
         return bjv.a;
      } else {
         boolean $$5 = !$$0.eT().b() || !$$0.eU().b();
         boolean $$6 = $$0.fI() && $$5;
         if (!$$6) {
            dja $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bjv.e;
            }

            bjv $$8 = $$7.a(this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }
         }

         if (!$$4.b() && !$$0.gn().a($$4.d())) {
            cpc $$9 = new cpc($$0, $$1, $$2);
            bjv $$11;
            if (this.j.g()) {
               int $$10 = $$4.L();
               $$11 = $$4.a($$9);
               $$4.f($$10);
            } else {
               $$11 = $$4.a($$9);
            }

            return $$11;
         } else {
            return bjv.d;
         }
      }
   }

   public bjv a(cfb $$0, bju $$1) {
      if (this.j == ctf.d) {
         return bjv.d;
      } else {
         this.o();
         this.c.b(new aed.b($$0.dr(), $$0.dt(), $$0.dx(), $$0.dC(), $$0.dE(), $$0.aC()));
         MutableObject<bjv> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            afc $$4 = new afc($$1, $$3);
            cmr $$5 = $$0.b($$1);
            if ($$0.gn().a($$5.d())) {
               $$2.setValue(bjv.d);
               return $$4;
            } else {
               bjw<cmr> $$6 = $$5.a(this.b.r, $$0, $$1);
               cmr $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bjv)$$2.getValue();
      }
   }

   public fsb a(fnk $$0, arx $$1, eun $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fsb a(fnk $$0, arx $$1, eun $$2, boolean $$3, boolean $$4) {
      return new fsb(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cfb $$0, blp $$1) {
      this.o();
      this.c.b(aea.a($$1, $$0.bS()));
      if (this.j != ctf.d) {
         $$0.d($$1);
         $$0.gm();
      }
   }

   public bjv a(cfb $$0, blp $$1, bju $$2) {
      this.o();
      this.c.b(aea.a($$1, $$0.bS(), $$2));
      return this.j == ctf.d ? bjv.d : $$0.a($$1, $$2);
   }

   public bjv a(cfb $$0, blp $$1, elj $$2, bju $$3) {
      this.o();
      elm $$4 = $$2.e().a($$1.dr(), $$1.dt(), $$1.dx());
      this.c.b(aea.a($$1, $$0.bS(), $$3, $$4));
      return this.j == ctf.d ? bjv.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cid $$3, cfb $$4) {
      chu $$5 = $$4.bS;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         iq<cjp> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cmr> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cjp $$9 : $$6) {
            $$8.add($$9.g().p());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cmr> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cmr $$12 = $$8.get($$11);
            cmr $$13 = $$6.get($$11).g();
            if (!cmr.a($$12, $$13)) {
               $$10.put($$11, $$13.p());
            }
         }

         this.c.b(new adv($$0, $$5.j(), $$1, $$2, $$3, $$5.g().p(), $$10));
      }
   }

   public void a(int $$0, cpx<?> $$1, boolean $$2) {
      this.c.b(new aeh($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new adu($$0, $$1));
   }

   public void a(cmr $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new aev($$1, $$0));
      }
   }

   public void a(cmr $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new aev(-1, $$0));
      }
   }

   public void b(cfb $$0) {
      this.o();
      this.c.b(new aej(aej.a.f, hx.b, ic.a));
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
      return this.b.s.bO() && this.b.s.cZ() instanceof bly;
   }

   public boolean j() {
      return this.j == ctf.d;
   }

   @Nullable
   public ctf k() {
      return this.k;
   }

   public ctf l() {
      return this.j;
   }

   public boolean m() {
      return this.i;
   }

   public int n() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new aeg($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new adx($$0, $$1, $$2));
   }
}
