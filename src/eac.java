import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class eac extends dzi {
   @Nullable
   private volatile ete o;
   private volatile eaj p = eaj.c;
   private final List<ux> q = Lists.newArrayList();
   @Nullable
   private dzh r;
   @Nullable
   private ecw s;
   private final fdi<dke> t;
   private final fdi<eto> u;

   public eac(dgg $$0, eaf $$1, dhc $$2, kd<dic> $$3, @Nullable eel $$4) {
      this($$0, $$1, null, new fdi<>(), new fdi<>(), $$2, $$3, $$4);
   }

   public eac(dgg $$0, eaf $$1, @Nullable dzt[] $$2, fdi<dke> $$3, fdi<eto> $$4, dhc $$5, kd<dic> $$6, @Nullable eel $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.t = $$3;
      this.u = $$4;
   }

   @Override
   public fdn<dke> o() {
      return this.t;
   }

   @Override
   public fdn<eto> p() {
      return this.u;
   }

   @Override
   public dzi.a a(long $$0) {
      return new dzi.a(this.t.a($$0), this.u.a($$0));
   }

   @Override
   public dxn a_(jh $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dkg.nw.m();
      } else {
         dzt $$2 = this.b(this.f($$1));
         return $$2.c() ? dkg.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public etp b_(jh $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return etq.a.g();
      } else {
         dzt $$2 = this.b(this.f($$1));
         return $$2.c() ? etq.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dxn a(jh $$0, dxn $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dkg.nw.m();
      } else {
         int $$6 = this.f($$4);
         dzt $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dkg.a)) {
            return $$1;
         } else {
            int $$9 = kj.b($$3);
            int $$10 = kj.b($$4);
            int $$11 = kj.b($$5);
            dxn $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.p.a(eaj.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.o.a($$0, $$13);
               }

               if (etg.a($$12, $$1)) {
                  this.j.a(this, $$9, $$4, $$11);
                  this.o.a($$0);
               }
            }

            EnumSet<edi.a> $$14 = this.j().e();
            EnumSet<edi.a> $$15 = null;

            for (edi.a $$16 : $$14) {
               edi $$17 = this.i.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(edi.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               edi.a(this, $$15);
            }

            for (edi.a $$18 : $$14) {
               this.i.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dup $$0) {
      this.l.put($$0.aB_(), $$0);
   }

   @Nullable
   @Override
   public dup c_(jh $$0) {
      return this.l.get($$0);
   }

   public Map<jh, dup> E() {
      return this.l;
   }

   public void b(ux $$0) {
      this.q.add($$0);
   }

   @Override
   public void a(bvf $$0) {
      if (!$$0.bZ()) {
         ux $$1 = new ux();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eoc $$0, eok $$1) {
      ecw $$2 = this.w();
      if ($$2 != null && $$1.b()) {
         enu $$3 = $$1.a();
         dhc $$4 = this.y();
         if ($$3.i() < $$4.L_() || $$3.l() > $$4.am()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<ux> F() {
      return this.q;
   }

   @Override
   public eaj j() {
      return this.p;
   }

   public void a(eaj $$0) {
      this.p = $$0;
      if (this.s != null && $$0.a(this.s.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public jq<dic> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().a(eaj.f)) {
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

   public static jh a(short $$0, int $$1, dgg $$2) {
      int $$3 = kj.a($$2.g, $$0 & 15);
      int $$4 = kj.a($$1, $$0 >>> 4 & 15);
      int $$5 = kj.a($$2.h, $$0 >>> 8 & 15);
      return new jh($$3, $$4, $$5);
   }

   @Override
   public void e(jh $$0) {
      if (!this.s($$0)) {
         dzi.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      dzi.a(this.b, $$1).addAll($$0);
   }

   public Map<jh, ux> G() {
      return Collections.unmodifiableMap(this.k);
   }

   @Nullable
   @Override
   public ux a(jh $$0, js.a $$1) {
      dup $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.k.get($$0);
   }

   @Override
   public void d(jh $$0) {
      this.l.remove($$0);
      this.k.remove($$0);
   }

   @Nullable
   public dzh B() {
      return this.r;
   }

   public dzh C() {
      if (this.r == null) {
         this.r = new dzh(this.M_(), this.L_());
      }

      return this.r;
   }

   public void a(dzh $$0) {
      this.r = $$0;
   }

   public void a(ete $$0) {
      this.o = $$0;
   }

   public void a(@Nullable ecw $$0) {
      this.s = $$0;
   }

   @Nullable
   @Override
   public ecw w() {
      return this.s;
   }

   private static <T> fdf<T> a(fdi<T> $$0) {
      return new fdf<>($$0.b());
   }

   public fdf<dke> H() {
      return a(this.t);
   }

   public fdf<eto> I() {
      return a(this.u);
   }

   @Override
   public dhc y() {
      return (dhc)(this.x() ? ecw.b : this);
   }
}
