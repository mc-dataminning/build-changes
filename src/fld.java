import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fld {
   private static final Logger a = LogUtils.getLogger();
   private final esr b;
   private final fkx c;
   private ht d = new ht(-1, -1, -1);
   private clb e = clb.b;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private crp j = crp.e;
   @Nullable
   private crp k;
   private int l;

   public fld(esr $$0, fkx $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cdm $$0) {
      this.j.a($$0.fT());
   }

   public void a(crp $$0, @Nullable crp $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fT());
   }

   public void a(crp $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.fT());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(ht $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         crs $$1 = this.b.r;
         dgw $$2 = $$1.a_($$0);
         if (!this.b.s.eS().d().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            cut $$3 = $$2.b();
            if ($$3 instanceof cya && !this.b.s.gp()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cdm)this.b.s);
               ecg $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((crt)$$1, $$0, $$2);
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
            dgw $$2 = this.b.r.a_($$0);
            this.b.ay().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new adm(adm.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new adm(adm.a.b, this.d, $$1));
            }

            dgw $$3 = this.b.r.a_($$0);
            this.b.ay().a(this.b.r, $$0, $$3, 0.0F);
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

               return new adm(adm.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dgw $$0 = this.b.r.a_(this.d);
         this.b.ay().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new adm(adm.a.b, this.d, hx.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.ah(), this.d, -1);
         this.b.s.gm();
      }
   }

   public boolean b(ht $$0, hx $$1) {
      this.o();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.C_().a($$0)) {
         this.h = 5;
         dgw $$2 = this.b.r.a_($$0);
         this.b.ay().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new adm(adm.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dgw $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dL(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dcf $$4 = $$3.w();
               this.b.ah().a(new gek($$4.f(), aqo.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gep.t(), $$0));
            }

            this.g++;
            this.b.ay().a(this.b.r, $$0, $$3, ati.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new adm(adm.a.c, $$0, $$1, $$2);
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

   private void a(fkw $$0, fme $$1) {
      try (fmd $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         wk<acj> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public float c() {
      return cdm.v(this.j.g());
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
      clb $$1 = this.b.s.eS();
      return $$0.equals(this.d) && clb.c($$1, this.e);
   }

   private void o() {
      int $$0 = this.b.s.fS().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new adv(this.l));
      }
   }

   public biq a(fpj $$0, bip $$1, eje $$2) {
      this.o();
      if (!this.b.r.C_().a($$2.a())) {
         return biq.e;
      } else {
         MutableObject<biq> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aee($$1, $$2, $$4);
         });
         return (biq)$$3.getValue();
      }
   }

   private biq b(fpj $$0, bip $$1, eje $$2) {
      ht $$3 = $$2.a();
      clb $$4 = $$0.b($$1);
      if (this.j == crp.d) {
         return biq.a;
      } else {
         boolean $$5 = !$$0.eS().b() || !$$0.eT().b();
         boolean $$6 = $$0.fI() && $$5;
         if (!$$6) {
            dgw $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return biq.e;
            }

            biq $$8 = $$7.a(this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }
         }

         if (!$$4.b() && !$$0.gn().a($$4.d())) {
            cnl $$9 = new cnl($$0, $$1, $$2);
            biq $$11;
            if (this.j.g()) {
               int $$10 = $$4.L();
               $$11 = $$4.a($$9);
               $$4.f($$10);
            } else {
               $$11 = $$4.a($$9);
            }

            return $$11;
         } else {
            return biq.d;
         }
      }
   }

   public biq a(cdm $$0, bip $$1) {
      if (this.j == crp.d) {
         return biq.d;
      } else {
         this.o();
         this.c.b(new adg.b($$0.dq(), $$0.ds(), $$0.dw(), $$0.dB(), $$0.dD(), $$0.aA()));
         MutableObject<biq> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            aef $$4 = new aef($$1, $$3);
            clb $$5 = $$0.b($$1);
            if ($$0.gn().a($$5.d())) {
               $$2.setValue(biq.d);
               return $$4;
            } else {
               bir<clb> $$6 = $$5.a(this.b.r, $$0, $$1);
               clb $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (biq)$$2.getValue();
      }
   }

   public fpj a(fkw $$0, aqy $$1, ese $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fpj a(fkw $$0, aqy $$1, ese $$2, boolean $$3, boolean $$4) {
      return new fpj(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cdm $$0, bki $$1) {
      this.o();
      this.c.b(add.a($$1, $$0.bR()));
      if (this.j != crp.d) {
         $$0.d($$1);
         $$0.gm();
      }
   }

   public biq a(cdm $$0, bki $$1, bip $$2) {
      this.o();
      this.c.b(add.a($$1, $$0.bR(), $$2));
      return this.j == crp.d ? biq.d : $$0.a($$1, $$2);
   }

   public biq a(cdm $$0, bki $$1, ejf $$2, bip $$3) {
      this.o();
      eji $$4 = $$2.e().a($$1.dq(), $$1.ds(), $$1.dw());
      this.c.b(add.a($$1, $$0.bR(), $$3, $$4));
      return this.j == crp.d ? biq.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cgn $$3, cdm $$4) {
      cge $$5 = $$4.bS;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         il<chz> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<clb> $$8 = Lists.newArrayListWithCapacity($$7);

         for (chz $$9 : $$6) {
            $$8.add($$9.f().p());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<clb> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            clb $$12 = $$8.get($$11);
            clb $$13 = $$6.get($$11).f();
            if (!clb.a($$12, $$13)) {
               $$10.put($$11, $$13.p());
            }
         }

         this.c.b(new acy($$0, $$5.j(), $$1, $$2, $$3, $$5.g().p(), $$10));
      }
   }

   public void a(int $$0, coh<?> $$1, boolean $$2) {
      this.c.b(new adk($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new acx($$0, $$1));
   }

   public void a(clb $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new ady($$1, $$0));
      }
   }

   public void a(clb $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new ady(-1, $$0));
      }
   }

   public void b(cdm $$0) {
      this.o();
      this.c.b(new adm(adm.a.f, ht.b, hx.a));
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
      return this.b.s.bN() && this.b.s.cY() instanceof bkr;
   }

   public boolean j() {
      return this.j == crp.d;
   }

   @Nullable
   public crp k() {
      return this.k;
   }

   public crp l() {
      return this.j;
   }

   public boolean m() {
      return this.i;
   }

   public int n() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new adj($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ada($$0, $$1, $$2));
   }
}
