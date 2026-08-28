import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dvs extends duy {
   @Nullable
   private volatile eor n;
   private volatile dvz o = dvz.c;
   private final List<ub> p = Lists.newArrayList();
   private final Map<dyu.a, dux> q = new Object2ObjectArrayMap();
   @Nullable
   private dym r;
   private final eyp<dfy> s;
   private final eyp<epb> t;

   public dvs(dcd $$0, dvv $$1, dcy $$2, jz<ddw> $$3, @Nullable eab $$4) {
      this($$0, $$1, null, new eyp<>(), new eyp<>(), $$2, $$3, $$4);
   }

   public dvs(dcd $$0, dvv $$1, @Nullable dvj[] $$2, eyp<dfy> $$3, eyp<epb> $$4, dcy $$5, jz<ddw> $$6, @Nullable eab $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public eyu<dfy> o() {
      return this.s;
   }

   @Override
   public eyu<epb> p() {
      return this.t;
   }

   @Override
   public duy.a q() {
      return new duy.a(this.s, this.t);
   }

   @Override
   public dtc a_(jd $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dga.nb.o();
      } else {
         dvj $$2 = this.b(this.e($$1));
         return $$2.c() ? dga.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public epc b_(jd $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return epd.a.g();
      } else {
         dvj $$2 = this.b(this.e($$1));
         return $$2.c() ? epd.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dtc a(jd $$0, dtc $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.am()) {
         int $$6 = this.e($$4);
         dvj $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dga.a)) {
            return $$1;
         } else {
            int $$9 = kf.b($$3);
            int $$10 = kf.b($$4);
            int $$11 = kf.b($$5);
            dtc $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(dvz.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eot.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dyy.a> $$14 = this.j().e();
            EnumSet<dyy.a> $$15 = null;

            for (dyy.a $$16 : $$14) {
               dyy $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dyy.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dyy.a(this, $$15);
            }

            for (dyy.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dga.nb.o();
      }
   }

   @Override
   public void a(dqh $$0) {
      this.k.put($$0.aD_(), $$0);
   }

   @Nullable
   @Override
   public dqh c_(jd $$0) {
      return this.k.get($$0);
   }

   public Map<jd, dqh> D() {
      return this.k;
   }

   public void b(ub $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bsr $$0) {
      if (!$$0.bS()) {
         ub $$1 = new ub();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(ejp $$0, ejx $$1) {
      dym $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         ejh $$3 = $$1.a();
         dcy $$4 = this.z();
         if ($$3.i() < $$4.I_() || $$3.l() >= $$4.am()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<ub> E() {
      return this.p;
   }

   @Override
   public dvz j() {
      return this.o;
   }

   public void a(dvz $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public jm<ddw> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().a(dvz.f)) {
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

   public static jd a(short $$0, int $$1, dcd $$2) {
      int $$3 = kf.a($$2.e, $$0 & 15);
      int $$4 = kf.a($$1, $$0 >>> 4 & 15);
      int $$5 = kf.a($$2.f, $$0 >>> 8 & 15);
      return new jd($$3, $$4, $$5);
   }

   @Override
   public void e(jd $$0) {
      if (!this.s($$0)) {
         duy.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      duy.a(this.b, $$1).add($$0);
   }

   public Map<jd, ub> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ub a(jd $$0, jo.a $$1) {
      dqh $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(jd $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dux a(dyu.a $$0) {
      return this.q.get($$0);
   }

   public dux b(dyu.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dux(this.J_(), this.I_()));
   }

   public void a(dyu.a $$0, dux $$1) {
      this.q.put($$0, $$1);
   }

   public void a(eor $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dym $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dym x() {
      return this.r;
   }

   private static <T> eym<T> a(eyp<T> $$0) {
      return new eym<>($$0.b());
   }

   public eym<dfy> G() {
      return a(this.s);
   }

   public eym<epb> H() {
      return a(this.t);
   }

   @Override
   public dcy z() {
      return (dcy)(this.y() ? dym.b : this);
   }
}
