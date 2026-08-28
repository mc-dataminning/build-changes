import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dvq extends duw {
   @Nullable
   private volatile eon n;
   private volatile dvx o = dvx.c;
   private final List<ua> p = Lists.newArrayList();
   private final Map<dyr.a, duv> q = new Object2ObjectArrayMap();
   @Nullable
   private dyj r;
   private final eyl<dfw> s;
   private final eyl<eox> t;

   public dvq(dcb $$0, dvt $$1, dcw $$2, jz<ddu> $$3, @Nullable dzy $$4) {
      this($$0, $$1, null, new eyl<>(), new eyl<>(), $$2, $$3, $$4);
   }

   public dvq(dcb $$0, dvt $$1, @Nullable dvh[] $$2, eyl<dfw> $$3, eyl<eox> $$4, dcw $$5, jz<ddu> $$6, @Nullable dzy $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public eyq<dfw> o() {
      return this.s;
   }

   @Override
   public eyq<eox> p() {
      return this.t;
   }

   @Override
   public duw.a q() {
      return new duw.a(this.s, this.t);
   }

   @Override
   public dta a_(jd $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dfy.nb.o();
      } else {
         dvh $$2 = this.b(this.e($$1));
         return $$2.c() ? dfy.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eoy b_(jd $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return eoz.a.g();
      } else {
         dvh $$2 = this.b(this.e($$1));
         return $$2.c() ? eoz.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dta a(jd $$0, dta $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.am()) {
         int $$6 = this.e($$4);
         dvh $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dfy.a)) {
            return $$1;
         } else {
            int $$9 = kf.b($$3);
            int $$10 = kf.b($$4);
            int $$11 = kf.b($$5);
            dta $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(dvx.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eop.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dyv.a> $$14 = this.j().e();
            EnumSet<dyv.a> $$15 = null;

            for (dyv.a $$16 : $$14) {
               dyv $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dyv.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dyv.a(this, $$15);
            }

            for (dyv.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dfy.nb.o();
      }
   }

   @Override
   public void a(dqf $$0) {
      this.k.put($$0.az_(), $$0);
   }

   @Nullable
   @Override
   public dqf c_(jd $$0) {
      return this.k.get($$0);
   }

   public Map<jd, dqf> D() {
      return this.k;
   }

   public void b(ua $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bsq $$0) {
      if (!$$0.bS()) {
         ua $$1 = new ua();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(ejm $$0, eju $$1) {
      dyj $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         eje $$3 = $$1.a();
         dcw $$4 = this.z();
         if ($$3.i() < $$4.I_() || $$3.l() >= $$4.am()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<ua> E() {
      return this.p;
   }

   @Override
   public dvx j() {
      return this.o;
   }

   public void a(dvx $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public jm<ddu> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().a(dvx.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(jd $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static jd a(short $$0, int $$1, dcb $$2) {
      int $$3 = kf.a($$2.e, $$0 & 15);
      int $$4 = kf.a($$1, $$0 >>> 4 & 15);
      int $$5 = kf.a($$2.f, $$0 >>> 8 & 15);
      return new jd($$3, $$4, $$5);
   }

   @Override
   public void e(jd $$0) {
      if (!this.s($$0)) {
         duw.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      duw.a(this.b, $$1).add($$0);
   }

   public Map<jd, ua> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ua a(jd $$0, jo.a $$1) {
      dqf $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(jd $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public duv a(dyr.a $$0) {
      return this.q.get($$0);
   }

   public duv b(dyr.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new duv(this.J_(), this.I_()));
   }

   public void a(dyr.a $$0, duv $$1) {
      this.q.put($$0, $$1);
   }

   public void a(eon $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dyj $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dyj x() {
      return this.r;
   }

   private static <T> eyi<T> a(eyl<T> $$0) {
      return new eyi<>($$0.b());
   }

   public eyi<dfw> G() {
      return a(this.s);
   }

   public eyi<eox> H() {
      return a(this.t);
   }

   @Override
   public dcw z() {
      return (dcw)(this.y() ? dyj.b : this);
   }
}
