import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dur extends dtx {
   @Nullable
   private volatile enj n;
   private volatile duw o = duw.c;
   private final List<ur> p = Lists.newArrayList();
   private final Map<dxp.a, dtw> q = new Object2ObjectArrayMap();
   @Nullable
   private dxh r;
   private final exf<dey> s;
   private final exf<ent> t;

   public dur(dbe $$0, duu $$1, dbz $$2, jv<dcw> $$3, @Nullable dyw $$4) {
      this($$0, $$1, null, new exf<>(), new exf<>(), $$2, $$3, $$4);
   }

   public dur(dbe $$0, duu $$1, @Nullable dui[] $$2, exf<dey> $$3, exf<ent> $$4, dbz $$5, jv<dcw> $$6, @Nullable dyw $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public exk<dey> o() {
      return this.s;
   }

   @Override
   public exk<ent> p() {
      return this.t;
   }

   @Override
   public dtx.a q() {
      return new dtx.a(this.s, this.t);
   }

   @Override
   public dsb a_(iz $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dfa.nb.o();
      } else {
         dui $$2 = this.b(this.e($$1));
         return $$2.c() ? dfa.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public enu b_(iz $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return env.a.g();
      } else {
         dui $$2 = this.b(this.e($$1));
         return $$2.c() ? env.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dsb a(iz $$0, dsb $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.am()) {
         int $$6 = this.e($$4);
         dui $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dfa.a)) {
            return $$1;
         } else {
            int $$9 = kb.b($$3);
            int $$10 = kb.b($$4);
            int $$11 = kb.b($$5);
            dsb $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(duw.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (enl.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dxt.a> $$14 = this.j().h();
            EnumSet<dxt.a> $$15 = null;

            for (dxt.a $$16 : $$14) {
               dxt $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dxt.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dxt.a(this, $$15);
            }

            for (dxt.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dfa.nb.o();
      }
   }

   @Override
   public void a(dpg $$0) {
      this.k.put($$0.ay_(), $$0);
   }

   @Nullable
   @Override
   public dpg c_(iz $$0) {
      return this.k.get($$0);
   }

   public Map<iz, dpg> D() {
      return this.k;
   }

   public void b(ur $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bst $$0) {
      if (!$$0.bR()) {
         ur $$1 = new ur();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eij $$0, eir $$1) {
      dxh $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         eib $$3 = $$1.a();
         dbz $$4 = this.z();
         if ($$3.i() < $$4.I_() || $$3.l() >= $$4.am()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<ur> E() {
      return this.p;
   }

   @Override
   public duw j() {
      return this.o;
   }

   public void a(duw $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ji<dcw> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(duw.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(iz $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static iz a(short $$0, int $$1, dbe $$2) {
      int $$3 = kb.a($$2.e, $$0 & 15);
      int $$4 = kb.a($$1, $$0 >>> 4 & 15);
      int $$5 = kb.a($$2.f, $$0 >>> 8 & 15);
      return new iz($$3, $$4, $$5);
   }

   @Override
   public void e(iz $$0) {
      if (!this.s($$0)) {
         dtx.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dtx.a(this.b, $$1).add($$0);
   }

   public Map<iz, ur> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ur a(iz $$0, jk.a $$1) {
      dpg $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(iz $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dtw a(dxp.a $$0) {
      return this.q.get($$0);
   }

   public dtw b(dxp.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dtw(this.J_(), this.I_()));
   }

   public void a(dxp.a $$0, dtw $$1) {
      this.q.put($$0, $$1);
   }

   public void a(enj $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dxh $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dxh x() {
      return this.r;
   }

   private static <T> exc<T> a(exf<T> $$0) {
      return new exc<>($$0.b());
   }

   public exc<dey> G() {
      return a(this.s);
   }

   public exc<ent> H() {
      return a(this.t);
   }

   @Override
   public dbz z() {
      return (dbz)(this.y() ? dxh.b : this);
   }
}
