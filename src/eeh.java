import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class eeh extends edn {
   @Nullable
   private volatile exp n;
   private volatile eeo o = eeo.c;
   private final List<ua> p = Lists.newArrayList();
   @Nullable
   private edm q;
   @Nullable
   private ehd r;
   private final fhs<dno> s;
   private final fhs<exz> t;

   public eeh(djo $$0, eek $$1, dkl $$2, jt<dlm> $$3, @Nullable eis $$4) {
      this($$0, $$1, null, new fhs<>(), new fhs<>(), $$2, $$3, $$4);
   }

   public eeh(djo $$0, eek $$1, @Nullable edy[] $$2, fhs<dno> $$3, fhs<exz> $$4, dkl $$5, jt<dlm> $$6, @Nullable eis $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fhx<dno> q() {
      return this.s;
   }

   @Override
   public fhx<exz> r() {
      return this.t;
   }

   @Override
   public edn.a a(long $$0) {
      return new edn.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public ebq a_(iw $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dnq.nH.m();
      } else {
         edy $$2 = this.b(this.f($$1));
         return $$2.c() ? dnq.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eya b_(iw $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return eyb.a.g();
      } else {
         edy $$2 = this.b(this.f($$1));
         return $$2.c() ? eyb.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public ebq a(iw $$0, ebq $$1, int $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dnq.nH.m();
      } else {
         int $$6 = this.f($$4);
         edy $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dnq.a)) {
            return $$1;
         } else {
            int $$9 = jz.b($$3);
            int $$10 = jz.b($$4);
            int $$11 = jz.b($$5);
            ebq $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(eeo.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (exr.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<ehp.a> $$14 = this.n().e();
            EnumSet<ehp.a> $$15 = null;

            for (ehp.a $$16 : $$14) {
               ehp $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(ehp.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               ehp.a(this, $$15);
            }

            for (ehp.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dyo $$0) {
      this.j.remove($$0.aC_());
      this.k.put($$0.aC_(), $$0);
   }

   @Nullable
   @Override
   public dyo c_(iw $$0) {
      return this.k.get($$0);
   }

   public Map<iw, dyo> H() {
      return this.k;
   }

   public void b(ua $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bxe $$0) {
      if (!$$0.bY()) {
         ua $$1 = new ua();
         $$0.g($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(esn $$0, esv $$1) {
      ehd $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         esf $$3 = $$1.a();
         dkl $$4 = this.B();
         if ($$3.i() < $$4.K_() || $$3.l() > $$4.ao()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<ua> I() {
      return this.p;
   }

   @Override
   public eeo n() {
      return this.o;
   }

   public void a(eeo $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public jg<dlm> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(eeo.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(iw $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static iw a(short $$0, int $$1, djo $$2) {
      int $$3 = jz.a($$2.h, $$0 & 15);
      int $$4 = jz.a($$1, $$0 >>> 4 & 15);
      int $$5 = jz.a($$2.i, $$0 >>> 8 & 15);
      return new iw($$3, $$4, $$5);
   }

   @Override
   public void e(iw $$0) {
      if (!this.t($$0)) {
         edn.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      edn.a(this.b, $$1).addAll($$0);
   }

   public Map<iw, ua> J() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ua a(iw $$0, ji.a $$1) {
      dyo $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(iw $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public edm E() {
      return this.q;
   }

   public edm F() {
      if (this.q == null) {
         this.q = new edm(this.L_(), this.K_());
      }

      return this.q;
   }

   public void a(edm $$0) {
      this.q = $$0;
   }

   public void a(exp $$0) {
      this.n = $$0;
   }

   public void a(@Nullable ehd $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public ehd z() {
      return this.r;
   }

   private static <T> fhp<T> a(fhs<T> $$0) {
      return new fhp<>($$0.b());
   }

   public fhp<dno> K() {
      return a(this.s);
   }

   public fhp<exz> L() {
      return a(this.t);
   }

   @Override
   public dkl B() {
      return (dkl)(this.A() ? ehd.b : this);
   }
}
