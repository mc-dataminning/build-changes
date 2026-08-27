import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fna {
   private static final Logger a = LogUtils.getLogger();
   private final euk b;
   private final fmu c;
   private hv d = new hv(-1, -1, -1);
   private cmh e = cmh.f;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private csv j = csv.e;
   @Nullable
   private csv k;
   private int l;

   public fna(euk $$0, fmu $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cer $$0) {
      this.j.a($$0.fT());
   }

   public void a(csv $$0, @Nullable csv $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fT());
   }

   public void a(csv $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.fT());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(hv $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         csy $$1 = this.b.r;
         dip $$2 = $$1.a_($$0);
         if (!this.b.s.eT().d().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            cvz $$3 = $$2.b();
            if ($$3 instanceof czh && !this.b.s.gp()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cer)this.b.s);
               edz $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((csz)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(hv $$0, ia $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.D_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dip $$2 = this.b.r.a_($$0);
            this.b.ay().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new adz(adz.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new adz(adz.a.b, this.d, $$1));
            }

            dip $$3 = this.b.r.a_($$0);
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

               return new adz(adz.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dip $$0 = this.b.r.a_(this.d);
         this.b.ay().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new adz(adz.a.b, this.d, ia.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.aj(), this.d, -1);
         this.b.s.gm();
      }
   }

   public boolean b(hv $$0, ia $$1) {
      this.o();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.D_().a($$0)) {
         this.h = 5;
         dip $$2 = this.b.r.a_($$0);
         this.b.ay().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new adz(adz.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dip $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dM(), $$0);
            if (this.g % 4.0F == 0.0F) {
               ddl $$4 = $$3.w();
               this.b.ah().a(new ggr($$4.f(), ard.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, ggw.t(), $$0));
            }

            this.g++;
            this.b.ay().a(this.b.r, $$0, $$3, aty.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new adz(adz.a.c, $$0, $$1, $$2);
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

   private void a(fmt $$0, fob $$1) {
      try (foa $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         wu<acw> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public float c() {
      return cer.v(this.j.g());
   }

   public void d() {
      this.o();
      if (this.c.m().k()) {
         this.c.m().d();
      } else {
         this.c.m().p();
      }
   }

   private boolean b(hv $$0) {
      cmh $$1 = this.b.s.eT();
      return $$0.equals(this.d) && cmh.c($$1, this.e);
   }

   private void o() {
      int $$0 = this.b.s.fS().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aei(this.l));
      }
   }

   public bjl a(frk $$0, bjk $$1, ekx $$2) {
      this.o();
      if (!this.b.r.D_().a($$2.a())) {
         return bjl.e;
      } else {
         MutableObject<bjl> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aer($$1, $$2, $$4);
         });
         return (bjl)$$3.getValue();
      }
   }

   private bjl b(frk $$0, bjk $$1, ekx $$2) {
      hv $$3 = $$2.a();
      cmh $$4 = $$0.b($$1);
      if (this.j == csv.d) {
         return bjl.a;
      } else {
         boolean $$5 = !$$0.eT().b() || !$$0.eU().b();
         boolean $$6 = $$0.fI() && $$5;
         if (!$$6) {
            dip $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bjl.e;
            }

            bjl $$8 = $$7.a(this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }
         }

         if (!$$4.b() && !$$0.gn().a($$4.d())) {
            cos $$9 = new cos($$0, $$1, $$2);
            bjl $$11;
            if (this.j.g()) {
               int $$10 = $$4.L();
               $$11 = $$4.a($$9);
               $$4.f($$10);
            } else {
               $$11 = $$4.a($$9);
            }

            return $$11;
         } else {
            return bjl.d;
         }
      }
   }

   public bjl a(cer $$0, bjk $$1) {
      if (this.j == csv.d) {
         return bjl.d;
      } else {
         this.o();
         this.c.b(new adt.b($$0.dr(), $$0.dt(), $$0.dx(), $$0.dC(), $$0.dE(), $$0.aC()));
         MutableObject<bjl> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            aes $$4 = new aes($$1, $$3);
            cmh $$5 = $$0.b($$1);
            if ($$0.gn().a($$5.d())) {
               $$2.setValue(bjl.d);
               return $$4;
            } else {
               bjm<cmh> $$6 = $$5.a(this.b.r, $$0, $$1);
               cmh $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bjl)$$2.getValue();
      }
   }

   public frk a(fmt $$0, arn $$1, etx $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public frk a(fmt $$0, arn $$1, etx $$2, boolean $$3, boolean $$4) {
      return new frk(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cer $$0, blf $$1) {
      this.o();
      this.c.b(adq.a($$1, $$0.bS()));
      if (this.j != csv.d) {
         $$0.d($$1);
         $$0.gm();
      }
   }

   public bjl a(cer $$0, blf $$1, bjk $$2) {
      this.o();
      this.c.b(adq.a($$1, $$0.bS(), $$2));
      return this.j == csv.d ? bjl.d : $$0.a($$1, $$2);
   }

   public bjl a(cer $$0, blf $$1, eky $$2, bjk $$3) {
      this.o();
      elb $$4 = $$2.e().a($$1.dr(), $$1.dt(), $$1.dx());
      this.c.b(adq.a($$1, $$0.bS(), $$3, $$4));
      return this.j == csv.d ? bjl.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cht $$3, cer $$4) {
      chk $$5 = $$4.bS;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         io<cjf> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cmh> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cjf $$9 : $$6) {
            $$8.add($$9.g().p());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cmh> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cmh $$12 = $$8.get($$11);
            cmh $$13 = $$6.get($$11).g();
            if (!cmh.a($$12, $$13)) {
               $$10.put($$11, $$13.p());
            }
         }

         this.c.b(new adl($$0, $$5.j(), $$1, $$2, $$3, $$5.g().p(), $$10));
      }
   }

   public void a(int $$0, cpn<?> $$1, boolean $$2) {
      this.c.b(new adx($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new adk($$0, $$1));
   }

   public void a(cmh $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new ael($$1, $$0));
      }
   }

   public void a(cmh $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new ael(-1, $$0));
      }
   }

   public void b(cer $$0) {
      this.o();
      this.c.b(new adz(adz.a.f, hv.b, ia.a));
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
      return this.b.s.bO() && this.b.s.cZ() instanceof blo;
   }

   public boolean j() {
      return this.j == csv.d;
   }

   @Nullable
   public csv k() {
      return this.k;
   }

   public csv l() {
      return this.j;
   }

   public boolean m() {
      return this.i;
   }

   public int n() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new adw($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new adn($$0, $$1, $$2));
   }
}
