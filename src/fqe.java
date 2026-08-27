import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fqe {
   private static final Logger a = LogUtils.getLogger();
   private final exh b;
   private final fpy c;
   private hz d = new hz(-1, -1, -1);
   private coz e = coz.h;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private cvk j = cvk.e;
   @Nullable
   private cvk k;
   private int l;

   public fqe(exh $$0, fpy $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(chh $$0) {
      this.j.a($$0.fU());
   }

   public void a(cvk $$0, @Nullable cvk $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fU());
   }

   public void a(cvk $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.fU());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(hz $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         cvn $$1 = this.b.r;
         dlf $$2 = $$1.a_($$0);
         if (!this.b.s.eT().d().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            cyo $$3 = $$2.b();
            if ($$3 instanceof dbw && !this.b.s.gq()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (chh)this.b.s);
               egp $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((cvo)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(hz $$0, ie $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.D_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dlf $$2 = this.b.r.a_($$0);
            this.b.az().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new afu(afu.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new afu(afu.a.b, this.d, $$1));
            }

            dlf $$3 = this.b.r.a_($$0);
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
                  this.b.r.a(this.b.s.aj(), this.d, this.l());
               }

               return new afu(afu.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dlf $$0 = this.b.r.a_(this.d);
         this.b.az().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new afu(afu.a.b, this.d, ie.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.aj(), this.d, -1);
         this.b.s.gn();
      }
   }

   public boolean b(hz $$0, ie $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.D_().a($$0)) {
         this.h = 5;
         dlf $$2 = this.b.r.a_($$0);
         this.b.az().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new afu(afu.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dlf $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dM(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dga $$4 = $$3.w();
               this.b.ai().a(new gkc($$4.f(), atl.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gkh.t(), $$0));
            }

            this.g++;
            this.b.az().a(this.b.r, $$0, $$3, awh.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new afu(afu.a.c, $$0, $$1, $$2);
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

   private void a(fpx $$0, frg $$1) {
      try (frf $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         xx<aes> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public void c() {
      this.m();
      if (this.c.m().i()) {
         this.c.m().b();
      } else {
         this.c.m().n();
      }
   }

   private boolean b(hz $$0) {
      coz $$1 = this.b.s.eT();
      return $$0.equals(this.d) && coz.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.fT().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new agd(this.l));
      }
   }

   public blu a(fuo $$0, blt $$1, eno $$2) {
      this.m();
      if (!this.b.r.D_().a($$2.a())) {
         return blu.e;
      } else {
         MutableObject<blu> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new agm($$1, $$2, $$4);
         });
         return (blu)$$3.getValue();
      }
   }

   private blu b(fuo $$0, blt $$1, eno $$2) {
      hz $$3 = $$2.a();
      coz $$4 = $$0.b($$1);
      if (this.j == cvk.d) {
         return blu.a;
      } else {
         boolean $$5 = !$$0.eT().b() || !$$0.eU().b();
         boolean $$6 = $$0.fI() && $$5;
         if (!$$6) {
            dlf $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return blu.e;
            }

            blw $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == blw.d && $$1 == blt.a) {
               blu $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.b() && !$$0.go().a($$4.d())) {
            cri $$10 = new cri($$0, $$1, $$2);
            blu $$12;
            if (this.j.g()) {
               int $$11 = $$4.M();
               $$12 = $$4.a($$10);
               $$4.f($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return blu.d;
         }
      }
   }

   public blu a(chh $$0, blt $$1) {
      if (this.j == cvk.d) {
         return blu.d;
      } else {
         this.m();
         this.c.b(new afo.b($$0.dr(), $$0.dt(), $$0.dx(), $$0.dC(), $$0.dE(), $$0.aC()));
         MutableObject<blu> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            agn $$4 = new agn($$1, $$3);
            coz $$5 = $$0.b($$1);
            if ($$0.go().a($$5.d())) {
               $$2.setValue(blu.d);
               return $$4;
            } else {
               blv<coz> $$6 = $$5.a(this.b.r, $$0, $$1);
               coz $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (blu)$$2.getValue();
      }
   }

   public fuo a(fpx $$0, atv $$1, ewu $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fuo a(fpx $$0, atv $$1, ewu $$2, boolean $$3, boolean $$4) {
      return new fuo(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(chh $$0, bno $$1) {
      this.m();
      this.c.b(afl.a($$1, $$0.bS()));
      if (this.j != cvk.d) {
         $$0.d($$1);
         $$0.gn();
      }
   }

   public blu a(chh $$0, bno $$1, blt $$2) {
      this.m();
      this.c.b(afl.a($$1, $$0.bS(), $$2));
      return this.j == cvk.d ? blu.d : $$0.a($$1, $$2);
   }

   public blu a(chh $$0, bno $$1, enp $$2, blt $$3) {
      this.m();
      ens $$4 = $$2.e().a($$1.dr(), $$1.dt(), $$1.dx());
      this.c.b(afl.a($$1, $$0.bS(), $$3, $$4));
      return this.j == cvk.d ? blu.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, ckk $$3, chh $$4) {
      ckb $$5 = $$4.bW;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         is<clw> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<coz> $$8 = Lists.newArrayListWithCapacity($$7);

         for (clw $$9 : $$6) {
            $$8.add($$9.g().q());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<coz> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            coz $$12 = $$8.get($$11);
            coz $$13 = $$6.get($$11).g();
            if (!coz.a($$12, $$13)) {
               $$10.put($$11, $$13.q());
            }
         }

         this.c.b(new afg($$0, $$5.j(), $$1, $$2, $$3, $$5.g().q(), $$10));
      }
   }

   public void a(int $$0, csd<?> $$1, boolean $$2) {
      this.c.b(new afs($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new aff($$0, $$1));
   }

   public void a(coz $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new agg($$1, $$0));
      }
   }

   public void a(coz $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new agg(-1, $$0));
      }
   }

   public void b(chh $$0) {
      this.m();
      this.c.b(new afu(afu.a.f, hz.c, ie.a));
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
      return this.b.s.bO() && this.b.s.cZ() instanceof bnz;
   }

   public boolean h() {
      return this.j == cvk.d;
   }

   @Nullable
   public cvk i() {
      return this.k;
   }

   public cvk j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new afr($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new afi($$0, $$1, $$2));
   }
}
