import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dov extends doa {
   @Nullable
   private volatile ehg n;
   private volatile dof o = dof.c;
   private final List<sy> p = Lists.newArrayList();
   private final Map<drm.a, dnz> q = new Object2ObjectArrayMap();
   @Nullable
   private dre r;
   private final eqk<czf> s;
   private final eqk<ehq> t;

   public dov(cvl $$0, doy $$1, cwg $$2, ix<cxd> $$3, @Nullable dst $$4) {
      this($$0, $$1, null, new eqk<>(), new eqk<>(), $$2, $$3, $$4);
   }

   public dov(cvl $$0, doy $$1, @Nullable dom[] $$2, eqk<czf> $$3, eqk<ehq> $$4, cwg $$5, ix<cxd> $$6, @Nullable dst $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public eqp<czf> o() {
      return this.s;
   }

   @Override
   public eqp<ehq> p() {
      return this.t;
   }

   @Override
   public doa.a q() {
      return new doa.a(this.s, this.t);
   }

   @Override
   public dme a_(ib $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return czh.nb.o();
      } else {
         dom $$2 = this.b(this.e($$1));
         return $$2.c() ? czh.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public ehr b_(ib $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return ehs.a.g();
      } else {
         dom $$2 = this.b(this.e($$1));
         return $$2.c() ? ehs.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dme a(ib $$0, dme $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.J_() && $$4 < this.ak()) {
         int $$6 = this.e($$4);
         dom $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(czh.a)) {
            return $$1;
         } else {
            int $$9 = jd.b($$3);
            int $$10 = jd.b($$4);
            int $$11 = jd.b($$5);
            dme $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dof.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (ehi.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<drq.a> $$14 = this.j().h();
            EnumSet<drq.a> $$15 = null;

            for (drq.a $$16 : $$14) {
               drq $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(drq.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               drq.a(this, $$15);
            }

            for (drq.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return czh.nb.o();
      }
   }

   @Override
   public void a(djl $$0) {
      this.k.put($$0.aD_(), $$0);
   }

   @Nullable
   @Override
   public djl c_(ib $$0) {
      return this.k.get($$0);
   }

   public Map<ib, djl> D() {
      return this.k;
   }

   public void b(sy $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bof $$0) {
      if (!$$0.bL()) {
         sy $$1 = new sy();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(ecg $$0, eco $$1) {
      dre $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         eby $$3 = $$1.a();
         cwg $$4 = this.z();
         if ($$3.i() < $$4.J_() || $$3.l() >= $$4.ak()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<sy> E() {
      return this.p;
   }

   @Override
   public dof j() {
      return this.o;
   }

   public void a(dof $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public il<cxd> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dof.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(ib $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static ib a(short $$0, int $$1, cvl $$2) {
      int $$3 = jd.a($$2.e, $$0 & 15);
      int $$4 = jd.a($$1, $$0 >>> 4 & 15);
      int $$5 = jd.a($$2.f, $$0 >>> 8 & 15);
      return new ib($$3, $$4, $$5);
   }

   @Override
   public void e(ib $$0) {
      if (!this.s($$0)) {
         doa.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      doa.a(this.b, $$1).add($$0);
   }

   public Map<ib, sy> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public sy a(ib $$0, in.a $$1) {
      djl $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(ib $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dnz a(drm.a $$0) {
      return this.q.get($$0);
   }

   public dnz b(drm.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dnz(this.K_(), this.J_()));
   }

   public void a(drm.a $$0, dnz $$1) {
      this.q.put($$0, $$1);
   }

   public void a(ehg $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dre $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dre x() {
      return this.r;
   }

   private static <T> eqh<T> a(eqk<T> $$0) {
      return new eqh<>($$0.b());
   }

   public eqh<czf> G() {
      return a(this.s);
   }

   public eqh<ehq> H() {
      return a(this.t);
   }

   @Override
   public cwg z() {
      return (cwg)(this.y() ? dre.b : this);
   }
}
