import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fjy {
   private static final Logger a = LogUtils.getLogger();
   private final ero b;
   private final fjs c;
   private ht d = new ht(-1, -1, -1);
   private ckj e = ckj.b;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private cqw j = cqw.e;
   @Nullable
   private cqw k;
   private int l;

   public fjy(ero $$0, fjs $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(ccx $$0) {
      this.j.a($$0.fT());
   }

   public void a(cqw $$0, @Nullable cqw $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fT());
   }

   public void a(cqw $$0) {
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
         cqz $$1 = this.b.r;
         dgb $$2 = $$1.a_($$0);
         if (!this.b.s.eS().d().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            cua $$3 = $$2.b();
            if ($$3 instanceof cxg && !this.b.s.gp()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (ccx)this.b.s);
               ebe $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((cra)$$1, $$0, $$2);
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
            dgb $$2 = this.b.r.a_($$0);
            this.b.az().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new adc(adc.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new adc(adc.a.b, this.d, $$1));
            }

            dgb $$3 = this.b.r.a_($$0);
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

               return new adc(adc.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dgb $$0 = this.b.r.a_(this.d);
         this.b.az().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new adc(adc.a.b, this.d, hx.a));
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
         dgb $$2 = this.b.r.a_($$0);
         this.b.az().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new adc(adc.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dgb $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dL(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dbl $$4 = $$3.w();
               this.b.ai().a(new gdd($$4.f(), aqe.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gdi.t(), $$0));
            }

            this.g++;
            this.b.az().a(this.b.r, $$0, $$3, asy.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new adc(adc.a.c, $$0, $$1, $$2);
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

   private void a(fjr $$0, fkz $$1) {
      try (fky $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         wb<aca> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public float c() {
      return ccx.v(this.j.g());
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
      ckj $$1 = this.b.s.eS();
      return $$0.equals(this.d) && ckj.c($$1, this.e);
   }

   private void o() {
      int $$0 = this.b.s.fS().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new adl(this.l));
      }
   }

   public bib a(foc $$0, bia $$1, eib $$2) {
      this.o();
      if (!this.b.r.C_().a($$2.a())) {
         return bib.e;
      } else {
         MutableObject<bib> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new adu($$1, $$2, $$4);
         });
         return (bib)$$3.getValue();
      }
   }

   private bib b(foc $$0, bia $$1, eib $$2) {
      ht $$3 = $$2.a();
      ckj $$4 = $$0.b($$1);
      if (this.j == cqw.d) {
         return bib.a;
      } else {
         boolean $$5 = !$$0.eS().b() || !$$0.eT().b();
         boolean $$6 = $$0.fI() && $$5;
         if (!$$6) {
            dgb $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bib.e;
            }

            bib $$8 = $$7.a(this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }
         }

         if (!$$4.b() && !$$0.gn().a($$4.d())) {
            cmt $$9 = new cmt($$0, $$1, $$2);
            bib $$11;
            if (this.j.g()) {
               int $$10 = $$4.L();
               $$11 = $$4.a($$9);
               $$4.f($$10);
            } else {
               $$11 = $$4.a($$9);
            }

            return $$11;
         } else {
            return bib.d;
         }
      }
   }

   public bib a(ccx $$0, bia $$1) {
      if (this.j == cqw.d) {
         return bib.d;
      } else {
         this.o();
         this.c.b(new acw.b($$0.dq(), $$0.ds(), $$0.dw(), $$0.dB(), $$0.dD(), $$0.aA()));
         MutableObject<bib> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            adv $$4 = new adv($$1, $$3);
            ckj $$5 = $$0.b($$1);
            if ($$0.gn().a($$5.d())) {
               $$2.setValue(bib.d);
               return $$4;
            } else {
               bic<ckj> $$6 = $$5.a(this.b.r, $$0, $$1);
               ckj $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bib)$$2.getValue();
      }
   }

   public foc a(fjr $$0, aqo $$1, erb $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public foc a(fjr $$0, aqo $$1, erb $$2, boolean $$3, boolean $$4) {
      return new foc(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(ccx $$0, bjt $$1) {
      this.o();
      this.c.b(act.a($$1, $$0.bR()));
      if (this.j != cqw.d) {
         $$0.d($$1);
         $$0.gm();
      }
   }

   public bib a(ccx $$0, bjt $$1, bia $$2) {
      this.o();
      this.c.b(act.a($$1, $$0.bR(), $$2));
      return this.j == cqw.d ? bib.d : $$0.a($$1, $$2);
   }

   public bib a(ccx $$0, bjt $$1, eic $$2, bia $$3) {
      this.o();
      eif $$4 = $$2.e().a($$1.dq(), $$1.ds(), $$1.dw());
      this.c.b(act.a($$1, $$0.bR(), $$3, $$4));
      return this.j == cqw.d ? bib.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cfy $$3, ccx $$4) {
      cfp $$5 = $$4.bS;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         il<chh> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<ckj> $$8 = Lists.newArrayListWithCapacity($$7);

         for (chh $$9 : $$6) {
            $$8.add($$9.e().p());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<ckj> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            ckj $$12 = $$8.get($$11);
            ckj $$13 = $$6.get($$11).e();
            if (!ckj.a($$12, $$13)) {
               $$10.put($$11, $$13.p());
            }
         }

         this.c.b(new acp($$0, $$5.j(), $$1, $$2, $$3, $$5.g().p(), $$10));
      }
   }

   public void a(int $$0, cno<?> $$1, boolean $$2) {
      this.c.b(new ada($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new aco($$0, $$1));
   }

   public void a(ckj $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new ado($$1, $$0));
      }
   }

   public void a(ckj $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new ado(-1, $$0));
      }
   }

   public void b(ccx $$0) {
      this.o();
      this.c.b(new adc(adc.a.f, ht.b, hx.a));
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
      return this.b.s.bN() && this.b.s.cY() instanceof bkc;
   }

   public boolean j() {
      return this.j == cqw.d;
   }

   @Nullable
   public cqw k() {
      return this.k;
   }

   public cqw l() {
      return this.j;
   }

   public boolean m() {
      return this.i;
   }

   public int n() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new acz($$0));
   }
}
