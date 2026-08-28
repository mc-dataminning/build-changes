import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dzm extends dys {
   @Nullable
   private volatile eso n;
   private volatile dzt o = dzt.c;
   private final List<tq> p = Lists.newArrayList();
   @Nullable
   private dyr q;
   @Nullable
   private ecg r;
   private final fcq<djm> s;
   private final fcq<esy> t;

   public dzm(dfo $$0, dzp $$1, dgk $$2, ke<dhk> $$3, @Nullable edv $$4) {
      this($$0, $$1, null, new fcq<>(), new fcq<>(), $$2, $$3, $$4);
   }

   public dzm(dfo $$0, dzp $$1, @Nullable dzd[] $$2, fcq<djm> $$3, fcq<esy> $$4, dgk $$5, ke<dhk> $$6, @Nullable edv $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fcv<djm> q() {
      return this.s;
   }

   @Override
   public fcv<esy> r() {
      return this.t;
   }

   @Override
   public dys.a a(long $$0) {
      return new dys.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public dwx a_(ji $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return djo.nD.m();
      } else {
         dzd $$2 = this.b(this.f($$1));
         return $$2.c() ? djo.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public esz b_(ji $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return eta.a.g();
      } else {
         dzd $$2 = this.b(this.f($$1));
         return $$2.c() ? eta.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dwx a(ji $$0, dwx $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return djo.nD.m();
      } else {
         int $$6 = this.f($$4);
         dzd $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(djo.a)) {
            return $$1;
         } else {
            int $$9 = kk.b($$3);
            int $$10 = kk.b($$4);
            int $$11 = kk.b($$5);
            dwx $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(dzt.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (esq.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<ecs.a> $$14 = this.n().e();
            EnumSet<ecs.a> $$15 = null;

            for (ecs.a $$16 : $$14) {
               ecs $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(ecs.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               ecs.a(this, $$15);
            }

            for (ecs.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dtz $$0) {
      this.k.put($$0.aA_(), $$0);
   }

   @Nullable
   @Override
   public dtz c_(ji $$0) {
      return this.k.get($$0);
   }

   public Map<ji, dtz> H() {
      return this.k;
   }

   public void b(tq $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(buk $$0) {
      if (!$$0.bZ()) {
         tq $$1 = new tq();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(enm $$0, enu $$1) {
      ecg $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         ene $$3 = $$1.a();
         dgk $$4 = this.B();
         if ($$3.i() < $$4.L_() || $$3.l() > $$4.an()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<tq> I() {
      return this.p;
   }

   @Override
   public dzt n() {
      return this.o;
   }

   public void a(dzt $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public jr<dhk> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(dzt.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(ji $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static ji a(short $$0, int $$1, dfo $$2) {
      int $$3 = kk.a($$2.h, $$0 & 15);
      int $$4 = kk.a($$1, $$0 >>> 4 & 15);
      int $$5 = kk.a($$2.i, $$0 >>> 8 & 15);
      return new ji($$3, $$4, $$5);
   }

   @Override
   public void e(ji $$0) {
      if (!this.s($$0)) {
         dys.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      dys.a(this.b, $$1).addAll($$0);
   }

   public Map<ji, tq> J() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public tq a(ji $$0, jt.a $$1) {
      dtz $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(ji $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dyr E() {
      return this.q;
   }

   public dyr F() {
      if (this.q == null) {
         this.q = new dyr(this.M_(), this.L_());
      }

      return this.q;
   }

   public void a(dyr $$0) {
      this.q = $$0;
   }

   public void a(eso $$0) {
      this.n = $$0;
   }

   public void a(@Nullable ecg $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public ecg z() {
      return this.r;
   }

   private static <T> fcn<T> a(fcq<T> $$0) {
      return new fcn<>($$0.b());
   }

   public fcn<djm> K() {
      return a(this.s);
   }

   public fcn<esy> L() {
      return a(this.t);
   }

   @Override
   public dgk B() {
      return (dgk)(this.A() ? ecg.b : this);
   }
}
