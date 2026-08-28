import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dzk extends dyq {
   @Nullable
   private volatile esm n;
   private volatile dzr o = dzr.c;
   private final List<tq> p = Lists.newArrayList();
   @Nullable
   private dyp q;
   @Nullable
   private ece r;
   private final fco<djk> s;
   private final fco<esw> t;

   public dzk(dfm $$0, dzn $$1, dgi $$2, ke<dhi> $$3, @Nullable edt $$4) {
      this($$0, $$1, null, new fco<>(), new fco<>(), $$2, $$3, $$4);
   }

   public dzk(dfm $$0, dzn $$1, @Nullable dzb[] $$2, fco<djk> $$3, fco<esw> $$4, dgi $$5, ke<dhi> $$6, @Nullable edt $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fct<djk> q() {
      return this.s;
   }

   @Override
   public fct<esw> r() {
      return this.t;
   }

   @Override
   public dyq.a a(long $$0) {
      return new dyq.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public dwv a_(ji $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return djm.nD.m();
      } else {
         dzb $$2 = this.b(this.f($$1));
         return $$2.c() ? djm.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public esx b_(ji $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return esy.a.g();
      } else {
         dzb $$2 = this.b(this.f($$1));
         return $$2.c() ? esy.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dwv a(ji $$0, dwv $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return djm.nD.m();
      } else {
         int $$6 = this.f($$4);
         dzb $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(djm.a)) {
            return $$1;
         } else {
            int $$9 = kk.b($$3);
            int $$10 = kk.b($$4);
            int $$11 = kk.b($$5);
            dwv $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(dzr.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eso.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<ecq.a> $$14 = this.n().e();
            EnumSet<ecq.a> $$15 = null;

            for (ecq.a $$16 : $$14) {
               ecq $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(ecq.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               ecq.a(this, $$15);
            }

            for (ecq.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dtx $$0) {
      this.k.put($$0.aA_(), $$0);
   }

   @Nullable
   @Override
   public dtx c_(ji $$0) {
      return this.k.get($$0);
   }

   public Map<ji, dtx> H() {
      return this.k;
   }

   public void b(tq $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(buj $$0) {
      if (!$$0.bZ()) {
         tq $$1 = new tq();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(enk $$0, ens $$1) {
      ece $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         enc $$3 = $$1.a();
         dgi $$4 = this.B();
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
   public dzr n() {
      return this.o;
   }

   public void a(dzr $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public jr<dhi> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(dzr.f)) {
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

   public static ji a(short $$0, int $$1, dfm $$2) {
      int $$3 = kk.a($$2.h, $$0 & 15);
      int $$4 = kk.a($$1, $$0 >>> 4 & 15);
      int $$5 = kk.a($$2.i, $$0 >>> 8 & 15);
      return new ji($$3, $$4, $$5);
   }

   @Override
   public void e(ji $$0) {
      if (!this.s($$0)) {
         dyq.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      dyq.a(this.b, $$1).addAll($$0);
   }

   public Map<ji, tq> J() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public tq a(ji $$0, jt.a $$1) {
      dtx $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(ji $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dyp E() {
      return this.q;
   }

   public dyp F() {
      if (this.q == null) {
         this.q = new dyp(this.M_(), this.L_());
      }

      return this.q;
   }

   public void a(dyp $$0) {
      this.q = $$0;
   }

   public void a(esm $$0) {
      this.n = $$0;
   }

   public void a(@Nullable ece $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public ece z() {
      return this.r;
   }

   private static <T> fcl<T> a(fco<T> $$0) {
      return new fcl<>($$0.b());
   }

   public fcl<djk> K() {
      return a(this.s);
   }

   public fcl<esw> L() {
      return a(this.t);
   }

   @Override
   public dgi B() {
      return (dgi)(this.A() ? ece.b : this);
   }
}
