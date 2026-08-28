import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dxe extends dwk {
   @Nullable
   private volatile eqe n;
   private volatile dxl o = dxl.c;
   private final List<uf> p = Lists.newArrayList();
   @Nullable
   private dwj q;
   @Nullable
   private dzy r;
   private final fai<dhj> s;
   private final fai<eqo> t;

   public dxe(ddm $$0, dxh $$1, dei $$2, ka<dfh> $$3, @Nullable ebn $$4) {
      this($$0, $$1, null, new fai<>(), new fai<>(), $$2, $$3, $$4);
   }

   public dxe(ddm $$0, dxh $$1, @Nullable dwv[] $$2, fai<dhj> $$3, fai<eqo> $$4, dei $$5, ka<dfh> $$6, @Nullable ebn $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fan<dhj> o() {
      return this.s;
   }

   @Override
   public fan<eqo> p() {
      return this.t;
   }

   @Override
   public dwk.a a(long $$0) {
      return new dwk.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public duo a_(je $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dhl.nb.o();
      } else {
         dwv $$2 = this.b(this.f($$1));
         return $$2.c() ? dhl.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eqp b_(je $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return eqq.a.g();
      } else {
         dwv $$2 = this.b(this.f($$1));
         return $$2.c() ? eqq.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public duo a(je $$0, duo $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dhl.nb.o();
      } else {
         int $$6 = this.f($$4);
         dwv $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dhl.a)) {
            return $$1;
         } else {
            int $$9 = kg.b($$3);
            int $$10 = kg.b($$4);
            int $$11 = kg.b($$5);
            duo $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(dxl.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eqg.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<eak.a> $$14 = this.j().e();
            EnumSet<eak.a> $$15 = null;

            for (eak.a $$16 : $$14) {
               eak $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(eak.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               eak.a(this, $$15);
            }

            for (eak.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(drs $$0) {
      this.k.put($$0.aB_(), $$0);
   }

   @Nullable
   @Override
   public drs c_(je $$0) {
      return this.k.get($$0);
   }

   public Map<je, drs> E() {
      return this.k;
   }

   public void b(uf $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bto $$0) {
      if (!$$0.bW()) {
         uf $$1 = new uf();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(elc $$0, elk $$1) {
      dzy $$2 = this.w();
      if ($$2 != null && $$1.b()) {
         eku $$3 = $$1.a();
         dei $$4 = this.y();
         if ($$3.i() < $$4.G_() || $$3.l() > $$4.an()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<uf> F() {
      return this.p;
   }

   @Override
   public dxl j() {
      return this.o;
   }

   public void a(dxl $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public jn<dfh> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.m().a(dxl.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(je $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static je a(short $$0, int $$1, ddm $$2) {
      int $$3 = kg.a($$2.e, $$0 & 15);
      int $$4 = kg.a($$1, $$0 >>> 4 & 15);
      int $$5 = kg.a($$2.f, $$0 >>> 8 & 15);
      return new je($$3, $$4, $$5);
   }

   @Override
   public void e(je $$0) {
      if (!this.s($$0)) {
         dwk.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      dwk.a(this.b, $$1).addAll($$0);
   }

   public Map<je, uf> G() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public uf a(je $$0, jp.a $$1) {
      drs $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(je $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dwj B() {
      return this.q;
   }

   public dwj C() {
      if (this.q == null) {
         this.q = new dwj(this.H_(), this.G_());
      }

      return this.q;
   }

   public void a(dwj $$0) {
      this.q = $$0;
   }

   public void a(eqe $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dzy $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dzy w() {
      return this.r;
   }

   private static <T> faf<T> a(fai<T> $$0) {
      return new faf<>($$0.b());
   }

   public faf<dhj> H() {
      return a(this.s);
   }

   public faf<eqo> I() {
      return a(this.t);
   }

   @Override
   public dei y() {
      return (dei)(this.x() ? dzy.b : this);
   }
}
