import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class drp extends dqv {
   @Nullable
   private volatile ekh n;
   private volatile dru o = dru.c;
   private final List<tm> p = Lists.newArrayList();
   private final Map<dun.a, dqu> q = new Object2ObjectArrayMap();
   @Nullable
   private duf r;
   private final etp<dby> s;
   private final etp<ekr> t;

   public drp(cye $$0, drs $$1, cyz $$2, iy<czw> $$3, @Nullable dvu $$4) {
      this($$0, $$1, null, new etp<>(), new etp<>(), $$2, $$3, $$4);
   }

   public drp(cye $$0, drs $$1, @Nullable drg[] $$2, etp<dby> $$3, etp<ekr> $$4, cyz $$5, iy<czw> $$6, @Nullable dvu $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public etu<dby> o() {
      return this.s;
   }

   @Override
   public etu<ekr> p() {
      return this.t;
   }

   @Override
   public dqv.a q() {
      return new dqv.a(this.s, this.t);
   }

   @Override
   public doz a_(ib $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dca.nb.n();
      } else {
         drg $$2 = this.b(this.e($$1));
         return $$2.c() ? dca.a.n() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eks b_(ib $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return ekt.a.g();
      } else {
         drg $$2 = this.b(this.e($$1));
         return $$2.c() ? ekt.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public doz a(ib $$0, doz $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.al()) {
         int $$6 = this.e($$4);
         drg $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dca.a)) {
            return $$1;
         } else {
            int $$9 = je.b($$3);
            int $$10 = je.b($$4);
            int $$11 = je.b($$5);
            doz $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dru.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (ekj.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dur.a> $$14 = this.j().h();
            EnumSet<dur.a> $$15 = null;

            for (dur.a $$16 : $$14) {
               dur $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dur.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dur.a(this, $$15);
            }

            for (dur.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dca.nb.n();
      }
   }

   @Override
   public void a(dmf $$0) {
      this.k.put($$0.aA_(), $$0);
   }

   @Nullable
   @Override
   public dmf c_(ib $$0) {
      return this.k.get($$0);
   }

   public Map<ib, dmf> D() {
      return this.k;
   }

   public void b(tm $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bpv $$0) {
      if (!$$0.bO()) {
         tm $$1 = new tm();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(efh $$0, efp $$1) {
      duf $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         eez $$3 = $$1.a();
         cyz $$4 = this.z();
         if ($$3.i() < $$4.I_() || $$3.l() >= $$4.al()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<tm> E() {
      return this.p;
   }

   @Override
   public dru j() {
      return this.o;
   }

   public void a(dru $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public il<czw> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dru.f)) {
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

   public static ib a(short $$0, int $$1, cye $$2) {
      int $$3 = je.a($$2.e, $$0 & 15);
      int $$4 = je.a($$1, $$0 >>> 4 & 15);
      int $$5 = je.a($$2.f, $$0 >>> 8 & 15);
      return new ib($$3, $$4, $$5);
   }

   @Override
   public void e(ib $$0) {
      if (!this.s($$0)) {
         dqv.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dqv.a(this.b, $$1).add($$0);
   }

   public Map<ib, tm> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public tm a(ib $$0, in.a $$1) {
      dmf $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(ib $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dqu a(dun.a $$0) {
      return this.q.get($$0);
   }

   public dqu b(dun.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dqu(this.J_(), this.I_()));
   }

   public void a(dun.a $$0, dqu $$1) {
      this.q.put($$0, $$1);
   }

   public void a(ekh $$0) {
      this.n = $$0;
   }

   public void a(@Nullable duf $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public duf x() {
      return this.r;
   }

   private static <T> etm<T> a(etp<T> $$0) {
      return new etm<>($$0.b());
   }

   public etm<dby> G() {
      return a(this.s);
   }

   public etm<ekr> H() {
      return a(this.t);
   }

   @Override
   public cyz z() {
      return (cyz)(this.y() ? duf.b : this);
   }
}
