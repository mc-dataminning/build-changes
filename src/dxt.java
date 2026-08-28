import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dxt extends dwz {
   @Nullable
   private volatile eqt o;
   private volatile dya p = dya.c;
   private final List<uj> q = Lists.newArrayList();
   @Nullable
   private dwy r;
   @Nullable
   private ean s;
   private final fax<dhy> t;
   private final fax<erd> u;

   public dxt(deb $$0, dxw $$1, dex $$2, kc<dfw> $$3, @Nullable ecc $$4) {
      this($$0, $$1, null, new fax<>(), new fax<>(), $$2, $$3, $$4);
   }

   public dxt(deb $$0, dxw $$1, @Nullable dxk[] $$2, fax<dhy> $$3, fax<erd> $$4, dex $$5, kc<dfw> $$6, @Nullable ecc $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.t = $$3;
      this.u = $$4;
   }

   @Override
   public fbc<dhy> o() {
      return this.t;
   }

   @Override
   public fbc<erd> p() {
      return this.u;
   }

   @Override
   public dwz.a a(long $$0) {
      return new dwz.a(this.t.a($$0), this.u.a($$0));
   }

   @Override
   public dvd a_(jg $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dia.nb.m();
      } else {
         dxk $$2 = this.b(this.f($$1));
         return $$2.c() ? dia.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public ere b_(jg $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return erf.a.g();
      } else {
         dxk $$2 = this.b(this.f($$1));
         return $$2.c() ? erf.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dvd a(jg $$0, dvd $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dia.nb.m();
      } else {
         int $$6 = this.f($$4);
         dxk $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dia.a)) {
            return $$1;
         } else {
            int $$9 = ki.b($$3);
            int $$10 = ki.b($$4);
            int $$11 = ki.b($$5);
            dvd $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.p.a(dya.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.o.a($$0, $$13);
               }

               if (eqv.a($$12, $$1)) {
                  this.j.a(this, $$9, $$4, $$11);
                  this.o.a($$0);
               }
            }

            EnumSet<eaz.a> $$14 = this.j().e();
            EnumSet<eaz.a> $$15 = null;

            for (eaz.a $$16 : $$14) {
               eaz $$17 = this.i.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(eaz.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               eaz.a(this, $$15);
            }

            for (eaz.a $$18 : $$14) {
               this.i.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dsg $$0) {
      this.l.put($$0.aC_(), $$0);
   }

   @Nullable
   @Override
   public dsg c_(jg $$0) {
      return this.l.get($$0);
   }

   public Map<jg, dsg> E() {
      return this.l;
   }

   public void b(uj $$0) {
      this.q.add($$0);
   }

   @Override
   public void a(btz $$0) {
      if (!$$0.ca()) {
         uj $$1 = new uj();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(elr $$0, elz $$1) {
      ean $$2 = this.w();
      if ($$2 != null && $$1.b()) {
         elj $$3 = $$1.a();
         dex $$4 = this.y();
         if ($$3.i() < $$4.I_() || $$3.l() > $$4.an()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<uj> F() {
      return this.q;
   }

   @Override
   public dya j() {
      return this.p;
   }

   public void a(dya $$0) {
      this.p = $$0;
      if (this.s != null && $$0.a(this.s.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public jp<dfw> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.m().a(dya.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(jg $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static jg a(short $$0, int $$1, deb $$2) {
      int $$3 = ki.a($$2.e, $$0 & 15);
      int $$4 = ki.a($$1, $$0 >>> 4 & 15);
      int $$5 = ki.a($$2.f, $$0 >>> 8 & 15);
      return new jg($$3, $$4, $$5);
   }

   @Override
   public void e(jg $$0) {
      if (!this.s($$0)) {
         dwz.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      dwz.a(this.b, $$1).addAll($$0);
   }

   public Map<jg, uj> G() {
      return Collections.unmodifiableMap(this.k);
   }

   @Nullable
   @Override
   public uj a(jg $$0, jr.a $$1) {
      dsg $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.k.get($$0);
   }

   @Override
   public void d(jg $$0) {
      this.l.remove($$0);
      this.k.remove($$0);
   }

   @Nullable
   public dwy B() {
      return this.r;
   }

   public dwy C() {
      if (this.r == null) {
         this.r = new dwy(this.J_(), this.I_());
      }

      return this.r;
   }

   public void a(dwy $$0) {
      this.r = $$0;
   }

   public void a(eqt $$0) {
      this.o = $$0;
   }

   public void a(@Nullable ean $$0) {
      this.s = $$0;
   }

   @Nullable
   @Override
   public ean w() {
      return this.s;
   }

   private static <T> fau<T> a(fax<T> $$0) {
      return new fau<>($$0.b());
   }

   public fau<dhy> H() {
      return a(this.t);
   }

   public fau<erd> I() {
      return a(this.u);
   }

   @Override
   public dex y() {
      return (dex)(this.x() ? ean.b : this);
   }
}
