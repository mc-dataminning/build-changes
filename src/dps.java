import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dps extends dox {
   @Nullable
   private volatile eie n;
   private volatile dpc o = dpc.c;
   private final List<ta> p = Lists.newArrayList();
   private final Map<dsk.a, dow> q = new Object2ObjectArrayMap();
   @Nullable
   private dsc r;
   private final eri<dac> s;
   private final eri<eio> t;

   public dps(cwi $$0, dpv $$1, cxd $$2, iy<cya> $$3, @Nullable dtr $$4) {
      this($$0, $$1, null, new eri<>(), new eri<>(), $$2, $$3, $$4);
   }

   public dps(cwi $$0, dpv $$1, @Nullable dpj[] $$2, eri<dac> $$3, eri<eio> $$4, cxd $$5, iy<cya> $$6, @Nullable dtr $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public ern<dac> o() {
      return this.s;
   }

   @Override
   public ern<eio> p() {
      return this.t;
   }

   @Override
   public dox.a q() {
      return new dox.a(this.s, this.t);
   }

   @Override
   public dnb a_(ib $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dae.nb.o();
      } else {
         dpj $$2 = this.b(this.e($$1));
         return $$2.c() ? dae.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eip b_(ib $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return eiq.a.g();
      } else {
         dpj $$2 = this.b(this.e($$1));
         return $$2.c() ? eiq.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dnb a(ib $$0, dnb $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.ak()) {
         int $$6 = this.e($$4);
         dpj $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dae.a)) {
            return $$1;
         } else {
            int $$9 = je.b($$3);
            int $$10 = je.b($$4);
            int $$11 = je.b($$5);
            dnb $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dpc.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eig.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dso.a> $$14 = this.j().h();
            EnumSet<dso.a> $$15 = null;

            for (dso.a $$16 : $$14) {
               dso $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dso.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dso.a(this, $$15);
            }

            for (dso.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dae.nb.o();
      }
   }

   @Override
   public void a(dki $$0) {
      this.k.put($$0.aC_(), $$0);
   }

   @Nullable
   @Override
   public dki c_(ib $$0) {
      return this.k.get($$0);
   }

   public Map<ib, dki> D() {
      return this.k;
   }

   public void b(ta $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(box $$0) {
      if (!$$0.bO()) {
         ta $$1 = new ta();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(ede $$0, edm $$1) {
      dsc $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         ecw $$3 = $$1.a();
         cxd $$4 = this.z();
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
   public dpc j() {
      return this.o;
   }

   public void a(dpc $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public il<cya> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dpc.f)) {
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

   public static ib a(short $$0, int $$1, cwi $$2) {
      int $$3 = je.a($$2.e, $$0 & 15);
      int $$4 = je.a($$1, $$0 >>> 4 & 15);
      int $$5 = je.a($$2.f, $$0 >>> 8 & 15);
      return new ib($$3, $$4, $$5);
   }

   @Override
   public void e(ib $$0) {
      if (!this.s($$0)) {
         dox.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dox.a(this.b, $$1).add($$0);
   }

   public Map<ib, ta> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ta a(ib $$0, in.a $$1) {
      dki $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(ib $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dow a(dsk.a $$0) {
      return this.q.get($$0);
   }

   public dow b(dsk.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dow(this.J_(), this.I_()));
   }

   public void a(dsk.a $$0, dow $$1) {
      this.q.put($$0, $$1);
   }

   public void a(eie $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dsc $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dsc x() {
      return this.r;
   }

   private static <T> erf<T> a(eri<T> $$0) {
      return new erf<>($$0.b());
   }

   public erf<dac> G() {
      return a(this.s);
   }

   public erf<eio> H() {
      return a(this.t);
   }

   @Override
   public cxd z() {
      return (cxd)(this.y() ? dsc.b : this);
   }
}
