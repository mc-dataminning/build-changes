import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dvb extends duh {
   @Nullable
   private volatile eny n;
   private volatile dvi o = dvi.c;
   private final List<tx> p = Lists.newArrayList();
   private final Map<dyc.a, dug> q = new Object2ObjectArrayMap();
   @Nullable
   private dxu r;
   private final exw<dfi> s;
   private final exw<eoi> t;

   public dvb(dbn $$0, dve $$1, dci $$2, jw<ddg> $$3, @Nullable dzj $$4) {
      this($$0, $$1, null, new exw<>(), new exw<>(), $$2, $$3, $$4);
   }

   public dvb(dbn $$0, dve $$1, @Nullable dus[] $$2, exw<dfi> $$3, exw<eoi> $$4, dci $$5, jw<ddg> $$6, @Nullable dzj $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public eyb<dfi> o() {
      return this.s;
   }

   @Override
   public eyb<eoi> p() {
      return this.t;
   }

   @Override
   public duh.a q() {
      return new duh.a(this.s, this.t);
   }

   @Override
   public dsl a_(ja $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dfk.nb.o();
      } else {
         dus $$2 = this.b(this.e($$1));
         return $$2.c() ? dfk.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eoj b_(ja $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return eok.a.g();
      } else {
         dus $$2 = this.b(this.e($$1));
         return $$2.c() ? eok.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dsl a(ja $$0, dsl $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.am()) {
         int $$6 = this.e($$4);
         dus $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dfk.a)) {
            return $$1;
         } else {
            int $$9 = kc.b($$3);
            int $$10 = kc.b($$4);
            int $$11 = kc.b($$5);
            dsl $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(dvi.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eoa.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dyg.a> $$14 = this.j().e();
            EnumSet<dyg.a> $$15 = null;

            for (dyg.a $$16 : $$14) {
               dyg $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dyg.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dyg.a(this, $$15);
            }

            for (dyg.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dfk.nb.o();
      }
   }

   @Override
   public void a(dpq $$0) {
      this.k.put($$0.az_(), $$0);
   }

   @Nullable
   @Override
   public dpq c_(ja $$0) {
      return this.k.get($$0);
   }

   public Map<ja, dpq> D() {
      return this.k;
   }

   public void b(tx $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bsh $$0) {
      if (!$$0.bT()) {
         tx $$1 = new tx();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eix $$0, ejf $$1) {
      dxu $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         eip $$3 = $$1.a();
         dci $$4 = this.z();
         if ($$3.i() < $$4.I_() || $$3.l() >= $$4.am()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<tx> E() {
      return this.p;
   }

   @Override
   public dvi j() {
      return this.o;
   }

   public void a(dvi $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public jj<ddg> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().a(dvi.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(ja $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static ja a(short $$0, int $$1, dbn $$2) {
      int $$3 = kc.a($$2.e, $$0 & 15);
      int $$4 = kc.a($$1, $$0 >>> 4 & 15);
      int $$5 = kc.a($$2.f, $$0 >>> 8 & 15);
      return new ja($$3, $$4, $$5);
   }

   @Override
   public void e(ja $$0) {
      if (!this.s($$0)) {
         duh.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      duh.a(this.b, $$1).add($$0);
   }

   public Map<ja, tx> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public tx a(ja $$0, jl.a $$1) {
      dpq $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(ja $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dug a(dyc.a $$0) {
      return this.q.get($$0);
   }

   public dug b(dyc.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dug(this.J_(), this.I_()));
   }

   public void a(dyc.a $$0, dug $$1) {
      this.q.put($$0, $$1);
   }

   public void a(eny $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dxu $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dxu x() {
      return this.r;
   }

   private static <T> ext<T> a(exw<T> $$0) {
      return new ext<>($$0.b());
   }

   public ext<dfi> G() {
      return a(this.s);
   }

   public ext<eoi> H() {
      return a(this.t);
   }

   @Override
   public dci z() {
      return (dci)(this.y() ? dxu.b : this);
   }
}
