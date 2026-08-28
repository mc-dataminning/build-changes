import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dxi extends dwo {
   @Nullable
   private volatile eqi n;
   private volatile dxp o = dxp.c;
   private final List<ug> p = Lists.newArrayList();
   @Nullable
   private dwn q;
   @Nullable
   private eac r;
   private final fam<dhm> s;
   private final fam<eqs> t;

   public dxi(ddp $$0, dxl $$1, del $$2, kb<dfk> $$3, @Nullable ebr $$4) {
      this($$0, $$1, null, new fam<>(), new fam<>(), $$2, $$3, $$4);
   }

   public dxi(ddp $$0, dxl $$1, @Nullable dwz[] $$2, fam<dhm> $$3, fam<eqs> $$4, del $$5, kb<dfk> $$6, @Nullable ebr $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public far<dhm> o() {
      return this.s;
   }

   @Override
   public far<eqs> p() {
      return this.t;
   }

   @Override
   public dwo.a a(long $$0) {
      return new dwo.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public dus a_(jf $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dho.nb.n();
      } else {
         dwz $$2 = this.b(this.f($$1));
         return $$2.c() ? dho.a.n() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eqt b_(jf $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return equ.a.g();
      } else {
         dwz $$2 = this.b(this.f($$1));
         return $$2.c() ? equ.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dus a(jf $$0, dus $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dho.nb.n();
      } else {
         int $$6 = this.f($$4);
         dwz $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dho.a)) {
            return $$1;
         } else {
            int $$9 = kh.b($$3);
            int $$10 = kh.b($$4);
            int $$11 = kh.b($$5);
            dus $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(dxp.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eqk.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<eao.a> $$14 = this.j().e();
            EnumSet<eao.a> $$15 = null;

            for (eao.a $$16 : $$14) {
               eao $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(eao.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               eao.a(this, $$15);
            }

            for (eao.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(drv $$0) {
      this.k.put($$0.aC_(), $$0);
   }

   @Nullable
   @Override
   public drv c_(jf $$0) {
      return this.k.get($$0);
   }

   public Map<jf, drv> E() {
      return this.k;
   }

   public void b(ug $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(btr $$0) {
      if (!$$0.bW()) {
         ug $$1 = new ug();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(elg $$0, elo $$1) {
      eac $$2 = this.w();
      if ($$2 != null && $$1.b()) {
         eky $$3 = $$1.a();
         del $$4 = this.y();
         if ($$3.i() < $$4.H_() || $$3.l() > $$4.an()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<ug> F() {
      return this.p;
   }

   @Override
   public dxp j() {
      return this.o;
   }

   public void a(dxp $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public jo<dfk> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.m().a(dxp.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(jf $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static jf a(short $$0, int $$1, ddp $$2) {
      int $$3 = kh.a($$2.e, $$0 & 15);
      int $$4 = kh.a($$1, $$0 >>> 4 & 15);
      int $$5 = kh.a($$2.f, $$0 >>> 8 & 15);
      return new jf($$3, $$4, $$5);
   }

   @Override
   public void e(jf $$0) {
      if (!this.s($$0)) {
         dwo.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      dwo.a(this.b, $$1).addAll($$0);
   }

   public Map<jf, ug> G() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ug a(jf $$0, jq.a $$1) {
      drv $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(jf $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dwn B() {
      return this.q;
   }

   public dwn C() {
      if (this.q == null) {
         this.q = new dwn(this.I_(), this.H_());
      }

      return this.q;
   }

   public void a(dwn $$0) {
      this.q = $$0;
   }

   public void a(eqi $$0) {
      this.n = $$0;
   }

   public void a(@Nullable eac $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public eac w() {
      return this.r;
   }

   private static <T> faj<T> a(fam<T> $$0) {
      return new faj<>($$0.b());
   }

   public faj<dhm> H() {
      return a(this.s);
   }

   public faj<eqs> I() {
      return a(this.t);
   }

   @Override
   public del y() {
      return (del)(this.x() ? eac.b : this);
   }
}
