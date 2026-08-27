import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fio {
   private static final Logger a = LogUtils.getLogger();
   private final eqm b;
   private final fij c;
   private gu d = new gu(-1, -1, -1);
   private ciy e = ciy.b;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private cpj j = cpj.e;
   @Nullable
   private cpj k;
   private int l;

   public fio(eqm $$0, fij $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cbn $$0) {
      this.j.a($$0.fR());
   }

   public void a(cpj $$0, @Nullable cpj $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.v.fR());
   }

   public void a(cpj $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.v.fR());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(gu $$0) {
      if (this.b.v.a(this.b.u, $$0, this.j)) {
         return false;
      } else {
         cpm $$1 = this.b.u;
         dfa $$2 = $$1.a_($$0);
         if (!this.b.v.eR().d().a($$2, $$1, $$0, this.b.v)) {
            return false;
         } else {
            csm $$3 = $$2.b();
            if ($$3 instanceof cvq && !this.b.v.gn()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cbn)this.b.v);
               ead $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((cpn)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(gu $$0, ha $$1) {
      if (this.b.v.a(this.b.u, $$0, this.j)) {
         return false;
      } else if (!this.b.u.w_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dfa $$2 = this.b.u.a_($$0);
            this.b.aA().a(this.b.u, $$0, $$2, 1.0F);
            this.a(this.b.u, $$2x -> {
               this.a($$0);
               return new abz(abz.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new abz(abz.a.b, this.d, $$1));
            }

            dfa $$3 = this.b.u.a_($$0);
            this.b.aA().a(this.b.u, $$0, $$3, 0.0F);
            this.a(this.b.u, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.u, $$0, this.b.v);
               }

               if ($$4 && $$3.a(this.b.v, this.b.v.dK(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.v.eR();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.u.a(this.b.v.ah(), this.d, this.n());
               }

               return new abz(abz.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dfa $$0 = this.b.u.a_(this.d);
         this.b.aA().a(this.b.u, this.d, $$0, -1.0F);
         this.c.b(new abz(abz.a.b, this.d, ha.a));
         this.i = false;
         this.f = 0.0F;
         this.b.u.a(this.b.v.ah(), this.d, -1);
         this.b.v.gk();
      }
   }

   public boolean b(gu $$0, ha $$1) {
      this.o();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.u.w_().a($$0)) {
         this.h = 5;
         dfa $$2 = this.b.u.a_($$0);
         this.b.aA().a(this.b.u, $$0, $$2, 1.0F);
         this.a(this.b.u, $$2x -> {
            this.a($$0);
            return new abz(abz.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dfa $$3 = this.b.u.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.v, this.b.v.dK(), $$0);
            if (this.g % 4.0F == 0.0F) {
               czz $$4 = $$3.w();
               this.b.ai().a(new gbo($$4.f(), aox.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gbt.t(), $$0));
            }

            this.g++;
            this.b.aA().a(this.b.u, $$0, $$3, arp.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.u, $$2 -> {
                  this.a($$0);
                  return new abz(abz.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.u.a(this.b.v.ah(), this.d, this.n());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(fii $$0, fjl $$1) {
      try (fjk $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         ux<aaw> $$4 = $$1.predict($$3);
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

   private boolean b(gu $$0) {
      ciy $$1 = this.b.v.eR();
      return $$0.equals(this.d) && ciy.c($$1, this.e);
   }

   private void o() {
      int $$0 = this.b.v.fQ().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aci(this.l));
      }
   }

   public bgq a(fmn $$0, bgp $$1, eha $$2) {
      this.o();
      if (!this.b.u.w_().a($$2.a())) {
         return bgq.e;
      } else {
         MutableObject<bgq> $$3 = new MutableObject();
         this.a(this.b.u, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new acr($$1, $$2, $$4);
         });
         return (bgq)$$3.getValue();
      }
   }

   private bgq b(fmn $$0, bgp $$1, eha $$2) {
      gu $$3 = $$2.a();
      ciy $$4 = $$0.b($$1);
      if (this.j == cpj.d) {
         return bgq.a;
      } else {
         boolean $$5 = !$$0.eR().b() || !$$0.eS().b();
         boolean $$6 = $$0.fG() && $$5;
         if (!$$6) {
            dfa $$7 = this.b.u.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bgq.e;
            }

            bgq $$8 = $$7.a(this.b.u, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }
         }

         if (!$$4.b() && !$$0.gl().a($$4.d())) {
            cli $$9 = new cli($$0, $$1, $$2);
            bgq $$11;
            if (this.j.g()) {
               int $$10 = $$4.L();
               $$11 = $$4.a($$9);
               $$4.f($$10);
            } else {
               $$11 = $$4.a($$9);
            }

            return $$11;
         } else {
            return bgq.d;
         }
      }
   }

   public bgq a(cbn $$0, bgp $$1) {
      if (this.j == cpj.d) {
         return bgq.d;
      } else {
         this.o();
         this.c.b(new abt.b($$0.dp(), $$0.dr(), $$0.dv(), $$0.dA(), $$0.dC(), $$0.aA()));
         MutableObject<bgq> $$2 = new MutableObject();
         this.a(this.b.u, $$3 -> {
            acs $$4 = new acs($$1, $$3);
            ciy $$5 = $$0.b($$1);
            if ($$0.gl().a($$5.d())) {
               $$2.setValue(bgq.d);
               return $$4;
            } else {
               bgr<ciy> $$6 = $$5.a(this.b.u, $$0, $$1);
               ciy $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bgq)$$2.getValue();
      }
   }

   public fmn a(fii $$0, aph $$1, epz $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fmn a(fii $$0, aph $$1, epz $$2, boolean $$3, boolean $$4) {
      return new fmn(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cbn $$0, bii $$1) {
      this.o();
      this.c.b(abq.a($$1, $$0.bR()));
      if (this.j != cpj.d) {
         $$0.d($$1);
         $$0.gk();
      }
   }

   public bgq a(cbn $$0, bii $$1, bgp $$2) {
      this.o();
      this.c.b(abq.a($$1, $$0.bR(), $$2));
      return this.j == cpj.d ? bgq.d : $$0.a($$1, $$2);
   }

   public bgq a(cbn $$0, bii $$1, ehb $$2, bgp $$3) {
      this.o();
      ehe $$4 = $$2.e().a($$1.dp(), $$1.dr(), $$1.dv());
      this.c.b(abq.a($$1, $$0.bR(), $$3, $$4));
      return this.j == cpj.d ? bgq.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cen $$3, cbn $$4) {
      cee $$5 = $$4.bQ;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         hn<cfw> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<ciy> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cfw $$9 : $$6) {
            $$8.add($$9.e().p());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<ciy> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            ciy $$12 = $$8.get($$11);
            ciy $$13 = $$6.get($$11).e();
            if (!ciy.a($$12, $$13)) {
               $$10.put($$11, $$13.p());
            }
         }

         this.c.b(new abm($$0, $$5.j(), $$1, $$2, $$3, $$5.g().p(), $$10));
      }
   }

   public void a(int $$0, cmb<?> $$1, boolean $$2) {
      this.c.b(new abx($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new abl($$0, $$1));
   }

   public void a(ciy $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new acl($$1, $$0));
      }
   }

   public void a(ciy $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new acl(-1, $$0));
      }
   }

   public void b(cbn $$0) {
      this.o();
      this.c.b(new abz(abz.a.f, gu.b, ha.a));
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
      return this.b.v.bN() && this.b.v.cY() instanceof bir;
   }

   public boolean j() {
      return this.j == cpj.d;
   }

   @Nullable
   public cpj k() {
      return this.k;
   }

   public cpj l() {
      return this.j;
   }

   public boolean m() {
      return this.i;
   }

   public int n() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new abw($$0));
   }
}
