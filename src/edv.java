import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class edv extends edb {
   @Nullable
   private volatile exd n;
   private volatile eec o = eec.c;
   private final List<tz> p = Lists.newArrayList();
   @Nullable
   private eda q;
   @Nullable
   private egr r;
   private final fhg<dnc> s;
   private final fhg<exn> t;

   public edv(djc $$0, edy $$1, djz $$2, js<dla> $$3, @Nullable eig $$4) {
      this($$0, $$1, null, new fhg<>(), new fhg<>(), $$2, $$3, $$4);
   }

   public edv(djc $$0, edy $$1, @Nullable edm[] $$2, fhg<dnc> $$3, fhg<exn> $$4, djz $$5, js<dla> $$6, @Nullable eig $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fhl<dnc> q() {
      return this.s;
   }

   @Override
   public fhl<exn> r() {
      return this.t;
   }

   @Override
   public edb.a a(long $$0) {
      return new edb.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public ebe a_(iv $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dne.nH.m();
      } else {
         edm $$2 = this.b(this.f($$1));
         return $$2.c() ? dne.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public exo b_(iv $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return exp.a.g();
      } else {
         edm $$2 = this.b(this.f($$1));
         return $$2.c() ? exp.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public ebe a(iv $$0, ebe $$1, int $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dne.nH.m();
      } else {
         int $$6 = this.f($$4);
         edm $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dne.a)) {
            return $$1;
         } else {
            int $$9 = jy.b($$3);
            int $$10 = jy.b($$4);
            int $$11 = jy.b($$5);
            ebe $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(eec.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (exf.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<ehd.a> $$14 = this.n().e();
            EnumSet<ehd.a> $$15 = null;

            for (ehd.a $$16 : $$14) {
               ehd $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(ehd.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               ehd.a(this, $$15);
            }

            for (ehd.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dyc $$0) {
      this.j.remove($$0.aB_());
      this.k.put($$0.aB_(), $$0);
   }

   @Nullable
   @Override
   public dyc c_(iv $$0) {
      return this.k.get($$0);
   }

   public Map<iv, dyc> H() {
      return this.k;
   }

   public void b(tz $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bwt $$0) {
      if (!$$0.bY()) {
         tz $$1 = new tz();
         $$0.g($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(esb $$0, esj $$1) {
      egr $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         ert $$3 = $$1.a();
         djz $$4 = this.B();
         if ($$3.i() < $$4.K_() || $$3.l() > $$4.ao()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<tz> I() {
      return this.p;
   }

   @Override
   public eec n() {
      return this.o;
   }

   public void a(eec $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public jf<dla> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(eec.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(iv $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static iv a(short $$0, int $$1, djc $$2) {
      int $$3 = jy.a($$2.h, $$0 & 15);
      int $$4 = jy.a($$1, $$0 >>> 4 & 15);
      int $$5 = jy.a($$2.i, $$0 >>> 8 & 15);
      return new iv($$3, $$4, $$5);
   }

   @Override
   public void e(iv $$0) {
      if (!this.t($$0)) {
         edb.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      edb.a(this.b, $$1).addAll($$0);
   }

   public Map<iv, tz> J() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public tz a(iv $$0, jh.a $$1) {
      dyc $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(iv $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public eda E() {
      return this.q;
   }

   public eda F() {
      if (this.q == null) {
         this.q = new eda(this.L_(), this.K_());
      }

      return this.q;
   }

   public void a(eda $$0) {
      this.q = $$0;
   }

   public void a(exd $$0) {
      this.n = $$0;
   }

   public void a(@Nullable egr $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public egr z() {
      return this.r;
   }

   private static <T> fhd<T> a(fhg<T> $$0) {
      return new fhd<>($$0.b());
   }

   public fhd<dnc> K() {
      return a(this.s);
   }

   public fhd<exn> L() {
      return a(this.t);
   }

   @Override
   public djz B() {
      return (djz)(this.A() ? egr.b : this);
   }
}
