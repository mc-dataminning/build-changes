import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fol {
   private static final Logger a = LogUtils.getLogger();
   private final evr b;
   private final fof c;
   private hx d = new hx(-1, -1, -1);
   private cng e = cng.f;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private ctu j = ctu.e;
   @Nullable
   private ctu k;
   private int l;

   public fol(evr $$0, fof $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cfq $$0) {
      this.j.a($$0.fT());
   }

   public void a(ctu $$0, @Nullable ctu $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fT());
   }

   public void a(ctu $$0) {
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
         ctx $$1 = this.b.r;
         djp $$2 = $$1.a_($$0);
         if (!this.b.s.eT().d().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            cwy $$3 = $$2.b();
            if ($$3 instanceof dag && !this.b.s.gp()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cfq)this.b.s);
               eez $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((cty)$$1, $$0, $$2);
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
            djp $$2 = this.b.r.a_($$0);
            this.b.az().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new aen(aen.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new aen(aen.a.b, this.d, $$1));
            }

            djp $$3 = this.b.r.a_($$0);
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
                  this.e = this.b.s.eT();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.aj(), this.d, this.l());
               }

               return new aen(aen.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         djp $$0 = this.b.r.a_(this.d);
         this.b.az().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new aen(aen.a.b, this.d, ic.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.aj(), this.d, -1);
         this.b.s.gm();
      }
   }

   public boolean b(hx $$0, ic $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.D_().a($$0)) {
         this.h = 5;
         djp $$2 = this.b.r.a_($$0);
         this.b.az().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new aen(aen.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         djp $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dL(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dek $$4 = $$3.w();
               this.b.ai().a(new gij($$4.f(), aru.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gio.t(), $$0));
            }

            this.g++;
            this.b.az().a(this.b.r, $$0, $$3, aup.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new aen(aen.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.r.a(this.b.s.aj(), this.d, this.l());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(foe $$0, fpn $$1) {
      try (fpm $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         xg<adk> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public void c() {
      this.m();
      if (this.c.m().k()) {
         this.c.m().d();
      } else {
         this.c.m().p();
      }
   }

   private boolean b(hx $$0) {
      cng $$1 = this.b.s.eT();
      return $$0.equals(this.d) && cng.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.fS().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aew(this.l));
      }
   }

   public bkc a(fsv $$0, bkb $$1, ely $$2) {
      this.m();
      if (!this.b.r.D_().a($$2.a())) {
         return bkc.e;
      } else {
         MutableObject<bkc> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aff($$1, $$2, $$4);
         });
         return (bkc)$$3.getValue();
      }
   }

   private bkc b(fsv $$0, bkb $$1, ely $$2) {
      hx $$3 = $$2.a();
      cng $$4 = $$0.b($$1);
      if (this.j == ctu.d) {
         return bkc.a;
      } else {
         boolean $$5 = !$$0.eT().b() || !$$0.eU().b();
         boolean $$6 = $$0.fI() && $$5;
         if (!$$6) {
            djp $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bkc.e;
            }

            bke $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bke.d && $$1 == bkb.a) {
               bkc $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.b() && !$$0.gn().a($$4.d())) {
            cpr $$10 = new cpr($$0, $$1, $$2);
            bkc $$12;
            if (this.j.g()) {
               int $$11 = $$4.L();
               $$12 = $$4.a($$10);
               $$4.f($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bkc.d;
         }
      }
   }

   public bkc a(cfq $$0, bkb $$1) {
      if (this.j == ctu.d) {
         return bkc.d;
      } else {
         this.m();
         this.c.b(new aeh.b($$0.dq(), $$0.ds(), $$0.dw(), $$0.dB(), $$0.dD(), $$0.aC()));
         MutableObject<bkc> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            afg $$4 = new afg($$1, $$3);
            cng $$5 = $$0.b($$1);
            if ($$0.gn().a($$5.d())) {
               $$2.setValue(bkc.d);
               return $$4;
            } else {
               bkd<cng> $$6 = $$5.a(this.b.r, $$0, $$1);
               cng $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bkc)$$2.getValue();
      }
   }

   public fsv a(foe $$0, ase $$1, eve $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fsv a(foe $$0, ase $$1, eve $$2, boolean $$3, boolean $$4) {
      return new fsv(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cfq $$0, blw $$1) {
      this.m();
      this.c.b(aee.a($$1, $$0.bS()));
      if (this.j != ctu.d) {
         $$0.d($$1);
         $$0.gm();
      }
   }

   public bkc a(cfq $$0, blw $$1, bkb $$2) {
      this.m();
      this.c.b(aee.a($$1, $$0.bS(), $$2));
      return this.j == ctu.d ? bkc.d : $$0.a($$1, $$2);
   }

   public bkc a(cfq $$0, blw $$1, elz $$2, bkb $$3) {
      this.m();
      emc $$4 = $$2.e().a($$1.dq(), $$1.ds(), $$1.dw());
      this.c.b(aee.a($$1, $$0.bS(), $$3, $$4));
      return this.j == ctu.d ? bkc.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cis $$3, cfq $$4) {
      cij $$5 = $$4.bW;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         iq<cke> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cng> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cke $$9 : $$6) {
            $$8.add($$9.g().p());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cng> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cng $$12 = $$8.get($$11);
            cng $$13 = $$6.get($$11).g();
            if (!cng.a($$12, $$13)) {
               $$10.put($$11, $$13.p());
            }
         }

         this.c.b(new adz($$0, $$5.j(), $$1, $$2, $$3, $$5.g().p(), $$10));
      }
   }

   public void a(int $$0, cqm<?> $$1, boolean $$2) {
      this.c.b(new ael($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ady($$0, $$1));
   }

   public void a(cng $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new aez($$1, $$0));
      }
   }

   public void a(cng $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new aez(-1, $$0));
      }
   }

   public void b(cfq $$0) {
      this.m();
      this.c.b(new aen(aen.a.f, hx.b, ic.a));
      $$0.fs();
   }

   public boolean d() {
      return this.j.h();
   }

   public boolean e() {
      return !this.j.g();
   }

   public boolean f() {
      return this.j.g();
   }

   public boolean g() {
      return this.b.s.bO() && this.b.s.cZ() instanceof bmh;
   }

   public boolean h() {
      return this.j == ctu.d;
   }

   @Nullable
   public ctu i() {
      return this.k;
   }

   public ctu j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new aek($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new aeb($$0, $$1, $$2));
   }
}
