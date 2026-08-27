import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dpq extends dov {
   @Nullable
   private volatile eic n;
   private volatile dpa o = dpa.c;
   private final List<ta> p = Lists.newArrayList();
   private final Map<dsi.a, dou> q = new Object2ObjectArrayMap();
   @Nullable
   private dsa r;
   private final erg<daa> s;
   private final erg<eim> t;

   public dpq(cwg $$0, dpt $$1, cxb $$2, iy<cxy> $$3, @Nullable dtp $$4) {
      this($$0, $$1, null, new erg<>(), new erg<>(), $$2, $$3, $$4);
   }

   public dpq(cwg $$0, dpt $$1, @Nullable dph[] $$2, erg<daa> $$3, erg<eim> $$4, cxb $$5, iy<cxy> $$6, @Nullable dtp $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public erl<daa> o() {
      return this.s;
   }

   @Override
   public erl<eim> p() {
      return this.t;
   }

   @Override
   public dov.a q() {
      return new dov.a(this.s, this.t);
   }

   @Override
   public dmz a_(ib $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dac.nb.o();
      } else {
         dph $$2 = this.b(this.e($$1));
         return $$2.c() ? dac.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public ein b_(ib $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return eio.a.g();
      } else {
         dph $$2 = this.b(this.e($$1));
         return $$2.c() ? eio.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dmz a(ib $$0, dmz $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.ak()) {
         int $$6 = this.e($$4);
         dph $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dac.a)) {
            return $$1;
         } else {
            int $$9 = je.b($$3);
            int $$10 = je.b($$4);
            int $$11 = je.b($$5);
            dmz $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dpa.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eie.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dsm.a> $$14 = this.j().h();
            EnumSet<dsm.a> $$15 = null;

            for (dsm.a $$16 : $$14) {
               dsm $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dsm.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dsm.a(this, $$15);
            }

            for (dsm.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dac.nb.o();
      }
   }

   @Override
   public void a(dkg $$0) {
      this.k.put($$0.aC_(), $$0);
   }

   @Nullable
   @Override
   public dkg c_(ib $$0) {
      return this.k.get($$0);
   }

   public Map<ib, dkg> D() {
      return this.k;
   }

   public void b(ta $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bow $$0) {
      if (!$$0.bO()) {
         ta $$1 = new ta();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(edc $$0, edk $$1) {
      dsa $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         ecu $$3 = $$1.a();
         cxb $$4 = this.z();
         if ($$3.i() < $$4.I_() || $$3.l() >= $$4.ak()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<ta> E() {
      return this.p;
   }

   @Override
   public dpa j() {
      return this.o;
   }

   public void a(dpa $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public il<cxy> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dpa.f)) {
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

   public static ib a(short $$0, int $$1, cwg $$2) {
      int $$3 = je.a($$2.e, $$0 & 15);
      int $$4 = je.a($$1, $$0 >>> 4 & 15);
      int $$5 = je.a($$2.f, $$0 >>> 8 & 15);
      return new ib($$3, $$4, $$5);
   }

   @Override
   public void e(ib $$0) {
      if (!this.s($$0)) {
         dov.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dov.a(this.b, $$1).add($$0);
   }

   public Map<ib, ta> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ta a(ib $$0, in.a $$1) {
      dkg $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(ib $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dou a(dsi.a $$0) {
      return this.q.get($$0);
   }

   public dou b(dsi.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dou(this.J_(), this.I_()));
   }

   public void a(dsi.a $$0, dou $$1) {
      this.q.put($$0, $$1);
   }

   public void a(eic $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dsa $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dsa x() {
      return this.r;
   }

   private static <T> erd<T> a(erg<T> $$0) {
      return new erd<>($$0.b());
   }

   public erd<daa> G() {
      return a(this.s);
   }

   public erd<eim> H() {
      return a(this.t);
   }

   @Override
   public cxb z() {
      return (cxb)(this.y() ? dsa.b : this);
   }
}
