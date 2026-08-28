import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dut extends dtz {
   @Nullable
   private volatile enl n;
   private volatile duy o = duy.c;
   private final List<us> p = Lists.newArrayList();
   private final Map<dxr.a, dty> q = new Object2ObjectArrayMap();
   @Nullable
   private dxj r;
   private final exh<dfa> s;
   private final exh<env> t;

   public dut(dbg $$0, duw $$1, dcb $$2, jv<dcy> $$3, @Nullable dyy $$4) {
      this($$0, $$1, null, new exh<>(), new exh<>(), $$2, $$3, $$4);
   }

   public dut(dbg $$0, duw $$1, @Nullable duk[] $$2, exh<dfa> $$3, exh<env> $$4, dcb $$5, jv<dcy> $$6, @Nullable dyy $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public exm<dfa> o() {
      return this.s;
   }

   @Override
   public exm<env> p() {
      return this.t;
   }

   @Override
   public dtz.a q() {
      return new dtz.a(this.s, this.t);
   }

   @Override
   public dsd a_(iz $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dfc.nb.o();
      } else {
         duk $$2 = this.b(this.e($$1));
         return $$2.c() ? dfc.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public enw b_(iz $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return enx.a.g();
      } else {
         duk $$2 = this.b(this.e($$1));
         return $$2.c() ? enx.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dsd a(iz $$0, dsd $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.am()) {
         int $$6 = this.e($$4);
         duk $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dfc.a)) {
            return $$1;
         } else {
            int $$9 = kb.b($$3);
            int $$10 = kb.b($$4);
            int $$11 = kb.b($$5);
            dsd $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(duy.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (enn.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dxv.a> $$14 = this.j().h();
            EnumSet<dxv.a> $$15 = null;

            for (dxv.a $$16 : $$14) {
               dxv $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dxv.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dxv.a(this, $$15);
            }

            for (dxv.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dfc.nb.o();
      }
   }

   @Override
   public void a(dpi $$0) {
      this.k.put($$0.ay_(), $$0);
   }

   @Nullable
   @Override
   public dpi c_(iz $$0) {
      return this.k.get($$0);
   }

   public Map<iz, dpi> D() {
      return this.k;
   }

   public void b(us $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bsv $$0) {
      if (!$$0.bR()) {
         us $$1 = new us();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eil $$0, eit $$1) {
      dxj $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         eid $$3 = $$1.a();
         dcb $$4 = this.z();
         if ($$3.i() < $$4.I_() || $$3.l() >= $$4.am()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<us> E() {
      return this.p;
   }

   @Override
   public duy j() {
      return this.o;
   }

   public void a(duy $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ji<dcy> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(duy.f)) {
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

   public static iz a(short $$0, int $$1, dbg $$2) {
      int $$3 = kb.a($$2.e, $$0 & 15);
      int $$4 = kb.a($$1, $$0 >>> 4 & 15);
      int $$5 = kb.a($$2.f, $$0 >>> 8 & 15);
      return new iz($$3, $$4, $$5);
   }

   @Override
   public void e(iz $$0) {
      if (!this.s($$0)) {
         dtz.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dtz.a(this.b, $$1).add($$0);
   }

   public Map<iz, us> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public us a(iz $$0, jk.a $$1) {
      dpi $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(iz $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dty a(dxr.a $$0) {
      return this.q.get($$0);
   }

   public dty b(dxr.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dty(this.J_(), this.I_()));
   }

   public void a(dxr.a $$0, dty $$1) {
      this.q.put($$0, $$1);
   }

   public void a(enl $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dxj $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dxj x() {
      return this.r;
   }

   private static <T> exe<T> a(exh<T> $$0) {
      return new exe<>($$0.b());
   }

   public exe<dfa> G() {
      return a(this.s);
   }

   public exe<env> H() {
      return a(this.t);
   }

   @Override
   public dcb z() {
      return (dcb)(this.y() ? dxj.b : this);
   }
}
