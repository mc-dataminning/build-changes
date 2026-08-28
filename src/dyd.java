import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dyd extends dxj {
   @Nullable
   private volatile erd o;
   private volatile dyk p = dyk.c;
   private final List<un> q = Lists.newArrayList();
   @Nullable
   private dxi r;
   @Nullable
   private eax s;
   private final fbh<dij> t;
   private final fbh<ern> u;

   public dyd(del $$0, dyg $$1, dfh $$2, kd<dgh> $$3, @Nullable ecm $$4) {
      this($$0, $$1, null, new fbh<>(), new fbh<>(), $$2, $$3, $$4);
   }

   public dyd(del $$0, dyg $$1, @Nullable dxu[] $$2, fbh<dij> $$3, fbh<ern> $$4, dfh $$5, kd<dgh> $$6, @Nullable ecm $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.t = $$3;
      this.u = $$4;
   }

   @Override
   public fbm<dij> o() {
      return this.t;
   }

   @Override
   public fbm<ern> p() {
      return this.u;
   }

   @Override
   public dxj.a a(long $$0) {
      return new dxj.a(this.t.a($$0), this.u.a($$0));
   }

   @Override
   public dvo a_(jh $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dil.nb.m();
      } else {
         dxu $$2 = this.b(this.f($$1));
         return $$2.c() ? dil.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public ero b_(jh $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return erp.a.g();
      } else {
         dxu $$2 = this.b(this.f($$1));
         return $$2.c() ? erp.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dvo a(jh $$0, dvo $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dil.nb.m();
      } else {
         int $$6 = this.f($$4);
         dxu $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dil.a)) {
            return $$1;
         } else {
            int $$9 = kj.b($$3);
            int $$10 = kj.b($$4);
            int $$11 = kj.b($$5);
            dvo $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.p.a(dyk.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.o.a($$0, $$13);
               }

               if (erf.a($$12, $$1)) {
                  this.j.a(this, $$9, $$4, $$11);
                  this.o.a($$0);
               }
            }

            EnumSet<ebj.a> $$14 = this.j().e();
            EnumSet<ebj.a> $$15 = null;

            for (ebj.a $$16 : $$14) {
               ebj $$17 = this.i.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(ebj.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               ebj.a(this, $$15);
            }

            for (ebj.a $$18 : $$14) {
               this.i.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dsr $$0) {
      this.l.put($$0.aB_(), $$0);
   }

   @Nullable
   @Override
   public dsr c_(jh $$0) {
      return this.l.get($$0);
   }

   public Map<jh, dsr> E() {
      return this.l;
   }

   public void b(un $$0) {
      this.q.add($$0);
   }

   @Override
   public void a(bui $$0) {
      if (!$$0.cb()) {
         un $$1 = new un();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(emb $$0, emj $$1) {
      eax $$2 = this.w();
      if ($$2 != null && $$1.b()) {
         elt $$3 = $$1.a();
         dfh $$4 = this.y();
         if ($$3.i() < $$4.I_() || $$3.l() > $$4.al()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<un> F() {
      return this.q;
   }

   @Override
   public dyk j() {
      return this.p;
   }

   public void a(dyk $$0) {
      this.p = $$0;
      if (this.s != null && $$0.a(this.s.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public jq<dgh> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.m().a(dyk.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(jh $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static jh a(short $$0, int $$1, del $$2) {
      int $$3 = kj.a($$2.g, $$0 & 15);
      int $$4 = kj.a($$1, $$0 >>> 4 & 15);
      int $$5 = kj.a($$2.h, $$0 >>> 8 & 15);
      return new jh($$3, $$4, $$5);
   }

   @Override
   public void e(jh $$0) {
      if (!this.s($$0)) {
         dxj.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      dxj.a(this.b, $$1).addAll($$0);
   }

   public Map<jh, un> G() {
      return Collections.unmodifiableMap(this.k);
   }

   @Nullable
   @Override
   public un a(jh $$0, js.a $$1) {
      dsr $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.k.get($$0);
   }

   @Override
   public void d(jh $$0) {
      this.l.remove($$0);
      this.k.remove($$0);
   }

   @Nullable
   public dxi B() {
      return this.r;
   }

   public dxi C() {
      if (this.r == null) {
         this.r = new dxi(this.J_(), this.I_());
      }

      return this.r;
   }

   public void a(dxi $$0) {
      this.r = $$0;
   }

   public void a(erd $$0) {
      this.o = $$0;
   }

   public void a(@Nullable eax $$0) {
      this.s = $$0;
   }

   @Nullable
   @Override
   public eax w() {
      return this.s;
   }

   private static <T> fbe<T> a(fbh<T> $$0) {
      return new fbe<>($$0.b());
   }

   public fbe<dij> H() {
      return a(this.t);
   }

   public fbe<ern> I() {
      return a(this.u);
   }

   @Override
   public dfh y() {
      return (dfh)(this.x() ? eax.b : this);
   }
}
