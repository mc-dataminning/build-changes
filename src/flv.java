import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class flv {
   private static final Logger a = LogUtils.getLogger();
   private final eti b;
   private final flp c;
   private hx d = new hx(-1, -1, -1);
   private clo e = clo.b;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private csc j = csc.e;
   @Nullable
   private csc k;
   private int l;

   public flv(eti $$0, flp $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cdz $$0) {
      this.j.a($$0.fU());
   }

   public void a(csc $$0, @Nullable csc $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fU());
   }

   public void a(csc $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.fU());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(hx $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         csf $$1 = this.b.r;
         dhn $$2 = $$1.a_($$0);
         if (!this.b.s.eU().d().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            cvf $$3 = $$2.b();
            if ($$3 instanceof cyn && !this.b.s.gq()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cdz)this.b.s);
               ecx $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((csg)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(hx $$0, ib $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.D_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dhn $$2 = this.b.r.a_($$0);
            this.b.ay().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new ads(ads.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ads(ads.a.b, this.d, $$1));
            }

            dhn $$3 = this.b.r.a_($$0);
            this.b.ay().a(this.b.r, $$0, $$3, 0.0F);
            this.a(this.b.r, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.r, $$0, this.b.s);
               }

               if ($$4 && $$3.a(this.b.s, this.b.s.dN(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.s.eU();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.aj(), this.d, this.n());
               }

               return new ads(ads.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dhn $$0 = this.b.r.a_(this.d);
         this.b.ay().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new ads(ads.a.b, this.d, ib.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.aj(), this.d, -1);
         this.b.s.gn();
      }
   }

   public boolean b(hx $$0, ib $$1) {
      this.o();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.D_().a($$0)) {
         this.h = 5;
         dhn $$2 = this.b.r.a_($$0);
         this.b.ay().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new ads(ads.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dhn $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dN(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dcr $$4 = $$3.w();
               this.b.ah().a(new gfc($$4.f(), aqw.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gfh.t(), $$0));
            }

            this.g++;
            this.b.ay().a(this.b.r, $$0, $$3, atq.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new ads(ads.a.c, $$0, $$1, $$2);
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

   private void a(flo $$0, fmw $$1) {
      try (fmv $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         wo<acp> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public float c() {
      return cdz.v(this.j.g());
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
      clo $$1 = this.b.s.eU();
      return $$0.equals(this.d) && clo.c($$1, this.e);
   }

   private void o() {
      int $$0 = this.b.s.fT().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aeb(this.l));
      }
   }

   public bjb a(fqb $$0, bja $$1, ejv $$2) {
      this.o();
      if (!this.b.r.D_().a($$2.a())) {
         return bjb.e;
      } else {
         MutableObject<bjb> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aek($$1, $$2, $$4);
         });
         return (bjb)$$3.getValue();
      }
   }

   private bjb b(fqb $$0, bja $$1, ejv $$2) {
      hx $$3 = $$2.a();
      clo $$4 = $$0.b($$1);
      if (this.j == csc.d) {
         return bjb.a;
      } else {
         boolean $$5 = !$$0.eU().b() || !$$0.eV().b();
         boolean $$6 = $$0.fJ() && $$5;
         if (!$$6) {
            dhn $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bjb.e;
            }

            bjb $$8 = $$7.a(this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }
         }

         if (!$$4.b() && !$$0.go().a($$4.d())) {
            cny $$9 = new cny($$0, $$1, $$2);
            bjb $$11;
            if (this.j.g()) {
               int $$10 = $$4.L();
               $$11 = $$4.a($$9);
               $$4.f($$10);
            } else {
               $$11 = $$4.a($$9);
            }

            return $$11;
         } else {
            return bjb.d;
         }
      }
   }

   public bjb a(cdz $$0, bja $$1) {
      if (this.j == csc.d) {
         return bjb.d;
      } else {
         this.o();
         this.c.b(new adm.b($$0.ds(), $$0.du(), $$0.dy(), $$0.dD(), $$0.dF(), $$0.aC()));
         MutableObject<bjb> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            ael $$4 = new ael($$1, $$3);
            clo $$5 = $$0.b($$1);
            if ($$0.go().a($$5.d())) {
               $$2.setValue(bjb.d);
               return $$4;
            } else {
               bjc<clo> $$6 = $$5.a(this.b.r, $$0, $$1);
               clo $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bjb)$$2.getValue();
      }
   }

   public fqb a(flo $$0, arg $$1, esv $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fqb a(flo $$0, arg $$1, esv $$2, boolean $$3, boolean $$4) {
      return new fqb(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cdz $$0, bkv $$1) {
      this.o();
      this.c.b(adj.a($$1, $$0.bS()));
      if (this.j != csc.d) {
         $$0.d($$1);
         $$0.gn();
      }
   }

   public bjb a(cdz $$0, bkv $$1, bja $$2) {
      this.o();
      this.c.b(adj.a($$1, $$0.bS(), $$2));
      return this.j == csc.d ? bjb.d : $$0.a($$1, $$2);
   }

   public bjb a(cdz $$0, bkv $$1, ejw $$2, bja $$3) {
      this.o();
      ejz $$4 = $$2.e().a($$1.ds(), $$1.du(), $$1.dy());
      this.c.b(adj.a($$1, $$0.bS(), $$3, $$4));
      return this.j == csc.d ? bjb.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cha $$3, cdz $$4) {
      cgr $$5 = $$4.bS;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         ip<cim> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<clo> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cim $$9 : $$6) {
            $$8.add($$9.f().p());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<clo> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            clo $$12 = $$8.get($$11);
            clo $$13 = $$6.get($$11).f();
            if (!clo.a($$12, $$13)) {
               $$10.put($$11, $$13.p());
            }
         }

         this.c.b(new ade($$0, $$5.j(), $$1, $$2, $$3, $$5.g().p(), $$10));
      }
   }

   public void a(int $$0, cov<?> $$1, boolean $$2) {
      this.c.b(new adq($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new add($$0, $$1));
   }

   public void a(clo $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new aee($$1, $$0));
      }
   }

   public void a(clo $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new aee(-1, $$0));
      }
   }

   public void b(cdz $$0) {
      this.o();
      this.c.b(new ads(ads.a.f, hx.b, ib.a));
      $$0.ft();
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
      return this.b.s.bO() && this.b.s.da() instanceof ble;
   }

   public boolean j() {
      return this.j == csc.d;
   }

   @Nullable
   public csc k() {
      return this.k;
   }

   public csc l() {
      return this.j;
   }

   public boolean m() {
      return this.i;
   }

   public int n() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new adp($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new adg($$0, $$1, $$2));
   }
}
