import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fri {
   private static final Logger a = LogUtils.getLogger();
   private final eyk b;
   private final frb c;
   private ib d = new ib(-1, -1, -1);
   private cpq e = cpq.h;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private cwb j = cwb.e;
   @Nullable
   private cwb k;
   private int l;

   public fri(eyk $$0, frb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cia $$0) {
      this.j.a($$0.fW());
   }

   public void a(cwb $$0, @Nullable cwb $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fW());
   }

   public void a(cwb $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.fW());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(ib $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         cwe $$1 = this.b.r;
         dme $$2 = $$1.a_($$0);
         if (!this.b.s.eR().d().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            czf $$3 = $$2.b();
            if ($$3 instanceof dcn && !this.b.s.gs()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cia)this.b.s);
               ehr $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((cwf)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(ib $$0, ih $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.D_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dme $$2 = this.b.r.a_($$0);
            this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new afy(afy.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new afy(afy.a.b, this.d, $$1));
            }

            dme $$3 = this.b.r.a_($$0);
            this.b.aA().a(this.b.r, $$0, $$3, 0.0F);
            this.a(this.b.r, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.r, $$0, this.b.s);
               }

               if ($$4 && $$3.a(this.b.s, this.b.s.dJ(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.s.eR();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.aj(), this.d, this.l());
               }

               return new afy(afy.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dme $$0 = this.b.r.a_(this.d);
         this.b.aA().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new afy(afy.a.b, this.d, ih.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.aj(), this.d, -1);
         this.b.s.gp();
      }
   }

   public boolean b(ib $$0, ih $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.D_().a($$0)) {
         this.h = 5;
         dme $$2 = this.b.r.a_($$0);
         this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new afy(afy.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dme $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dJ(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dgr $$4 = $$3.w();
               this.b.aj().a(new glh($$4.f(), atq.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, glm.t(), $$0));
            }

            this.g++;
            this.b.aA().a(this.b.r, $$0, $$3, awm.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new afy(afy.a.c, $$0, $$1, $$2);
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

   private void a(fra $$0, fsl $$1) {
      try (fsk $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         xz<aev> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public void c() {
      this.m();
      if (this.c.l().i()) {
         this.c.l().b();
      } else {
         this.c.l().n();
      }
   }

   private boolean b(ib $$0) {
      cpq $$1 = this.b.s.eR();
      return $$0.equals(this.d) && cpq.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.fV().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new agh(this.l));
      }
   }

   public bml a(fvs $$0, bmk $$1, eor $$2) {
      this.m();
      if (!this.b.r.D_().a($$2.a())) {
         return bml.e;
      } else {
         MutableObject<bml> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new agq($$1, $$2, $$4);
         });
         return (bml)$$3.getValue();
      }
   }

   private bml b(fvs $$0, bmk $$1, eor $$2) {
      ib $$3 = $$2.a();
      cpq $$4 = $$0.b($$1);
      if (this.j == cwb.d) {
         return bml.a;
      } else {
         boolean $$5 = !$$0.eR().b() || !$$0.eS().b();
         boolean $$6 = $$0.fK() && $$5;
         if (!$$6) {
            dme $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bml.e;
            }

            bmn $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bmn.d && $$1 == bmk.a) {
               bml $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.b() && !$$0.gq().a($$4.d())) {
            crz $$10 = new crz($$0, $$1, $$2);
            bml $$12;
            if (this.j.g()) {
               int $$11 = $$4.M();
               $$12 = $$4.a($$10);
               $$4.f($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bml.d;
         }
      }
   }

   public bml a(cia $$0, bmk $$1) {
      if (this.j == cwb.d) {
         return bml.d;
      } else {
         this.m();
         this.c.b(new afs.b($$0.do(), $$0.dq(), $$0.du(), $$0.dz(), $$0.dB(), $$0.aC()));
         MutableObject<bml> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            agr $$4 = new agr($$1, $$3);
            cpq $$5 = $$0.b($$1);
            if ($$0.gq().a($$5.d())) {
               $$2.setValue(bml.d);
               return $$4;
            } else {
               bmm<cpq> $$6 = $$5.a(this.b.r, $$0, $$1);
               cpq $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bml)$$2.getValue();
      }
   }

   public fvs a(fra $$0, aua $$1, exx $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fvs a(fra $$0, aua $$1, exx $$2, boolean $$3, boolean $$4) {
      return new fvs(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cia $$0, bof $$1) {
      this.m();
      this.c.b(afp.a($$1, $$0.bP()));
      if (this.j != cwb.d) {
         $$0.d($$1);
         $$0.gp();
      }
   }

   public bml a(cia $$0, bof $$1, bmk $$2) {
      this.m();
      this.c.b(afp.a($$1, $$0.bP(), $$2));
      return this.j == cwb.d ? bml.d : $$0.a($$1, $$2);
   }

   public bml a(cia $$0, bof $$1, eos $$2, bmk $$3) {
      this.m();
      eov $$4 = $$2.e().a($$1.do(), $$1.dq(), $$1.du());
      this.c.b(afp.a($$1, $$0.bP(), $$3, $$4));
      return this.j == cwb.d ? bml.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cld $$3, cia $$4) {
      cku $$5 = $$4.bX;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         iu<cmp> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cpq> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cmp $$9 : $$6) {
            $$8.add($$9.g().q());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cpq> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cpq $$12 = $$8.get($$11);
            cpq $$13 = $$6.get($$11).g();
            if (!cpq.a($$12, $$13)) {
               $$10.put($$11, $$13.q());
            }
         }

         this.c.b(new afj($$0, $$5.j(), $$1, $$2, $$3, $$5.g().q(), $$10));
      }
   }

   public void a(int $$0, csu<?> $$1, boolean $$2) {
      this.c.b(new afw($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new afi($$0, $$1));
   }

   public void a(cpq $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.b(new agk($$1, $$0));
      }
   }

   public void a(cpq $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.b(new agk(-1, $$0));
      }
   }

   public void b(cia $$0) {
      this.m();
      this.c.b(new afy(afy.a.f, ib.c, ih.a));
      $$0.fu();
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
      return this.b.s.bL() && this.b.s.cW() instanceof boq;
   }

   public boolean h() {
      return this.j == cwb.d;
   }

   @Nullable
   public cwb i() {
      return this.k;
   }

   public cwb j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new afv($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new afl($$0, $$1, $$2));
   }
}
