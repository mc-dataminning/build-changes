import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class eak extends dzq {
   @Nullable
   private volatile etm n;
   private volatile ear o = ear.c;
   private final List<ux> p = Lists.newArrayList();
   @Nullable
   private dzp q;
   @Nullable
   private ede r;
   private final fdo<dkm> s;
   private final fdo<etw> t;

   public eak(dgo $$0, ean $$1, dhk $$2, kd<dik> $$3, @Nullable eet $$4) {
      this($$0, $$1, null, new fdo<>(), new fdo<>(), $$2, $$3, $$4);
   }

   public eak(dgo $$0, ean $$1, @Nullable eab[] $$2, fdo<dkm> $$3, fdo<etw> $$4, dhk $$5, kd<dik> $$6, @Nullable eet $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fdt<dkm> q() {
      return this.s;
   }

   @Override
   public fdt<etw> r() {
      return this.t;
   }

   @Override
   public dzq.a a(long $$0) {
      return new dzq.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public dxv a_(jh $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dko.nw.m();
      } else {
         eab $$2 = this.b(this.f($$1));
         return $$2.c() ? dko.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public etx b_(jh $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return ety.a.g();
      } else {
         eab $$2 = this.b(this.f($$1));
         return $$2.c() ? ety.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dxv a(jh $$0, dxv $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dko.nw.m();
      } else {
         int $$6 = this.f($$4);
         eab $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dko.a)) {
            return $$1;
         } else {
            int $$9 = kj.b($$3);
            int $$10 = kj.b($$4);
            int $$11 = kj.b($$5);
            dxv $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(ear.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eto.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<edq.a> $$14 = this.n().e();
            EnumSet<edq.a> $$15 = null;

            for (edq.a $$16 : $$14) {
               edq $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(edq.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               edq.a(this, $$15);
            }

            for (edq.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dux $$0) {
      this.k.put($$0.aB_(), $$0);
   }

   @Nullable
   @Override
   public dux c_(jh $$0) {
      return this.k.get($$0);
   }

   public Map<jh, dux> H() {
      return this.k;
   }

   public void b(ux $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bvk $$0) {
      if (!$$0.bZ()) {
         ux $$1 = new ux();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eok $$0, eos $$1) {
      ede $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         eoc $$3 = $$1.a();
         dhk $$4 = this.B();
         if ($$3.i() < $$4.L_() || $$3.l() > $$4.am()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<ux> I() {
      return this.p;
   }

   @Override
   public ear n() {
      return this.o;
   }

   public void a(ear $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public jq<dik> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(ear.f)) {
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

   public static jh a(short $$0, int $$1, dgo $$2) {
      int $$3 = kj.a($$2.h, $$0 & 15);
      int $$4 = kj.a($$1, $$0 >>> 4 & 15);
      int $$5 = kj.a($$2.i, $$0 >>> 8 & 15);
      return new jh($$3, $$4, $$5);
   }

   @Override
   public void e(jh $$0) {
      if (!this.s($$0)) {
         dzq.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      dzq.a(this.b, $$1).addAll($$0);
   }

   public Map<jh, ux> J() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ux a(jh $$0, js.a $$1) {
      dux $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(jh $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dzp E() {
      return this.q;
   }

   public dzp F() {
      if (this.q == null) {
         this.q = new dzp(this.M_(), this.L_());
      }

      return this.q;
   }

   public void a(dzp $$0) {
      this.q = $$0;
   }

   public void a(etm $$0) {
      this.n = $$0;
   }

   public void a(@Nullable ede $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public ede z() {
      return this.r;
   }

   private static <T> fdl<T> a(fdo<T> $$0) {
      return new fdl<>($$0.b());
   }

   public fdl<dkm> K() {
      return a(this.s);
   }

   public fdl<etw> L() {
      return a(this.t);
   }

   @Override
   public dhk B() {
      return (dhk)(this.A() ? ede.b : this);
   }
}
