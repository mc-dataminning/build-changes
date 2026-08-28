import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class duq extends dtw {
   @Nullable
   private volatile eni n;
   private volatile duv o = duv.c;
   private final List<ur> p = Lists.newArrayList();
   private final Map<dxo.a, dtv> q = new Object2ObjectArrayMap();
   @Nullable
   private dxg r;
   private final exe<dex> s;
   private final exe<ens> t;

   public duq(dbd $$0, dut $$1, dby $$2, jv<dcv> $$3, @Nullable dyv $$4) {
      this($$0, $$1, null, new exe<>(), new exe<>(), $$2, $$3, $$4);
   }

   public duq(dbd $$0, dut $$1, @Nullable duh[] $$2, exe<dex> $$3, exe<ens> $$4, dby $$5, jv<dcv> $$6, @Nullable dyv $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public exj<dex> o() {
      return this.s;
   }

   @Override
   public exj<ens> p() {
      return this.t;
   }

   @Override
   public dtw.a q() {
      return new dtw.a(this.s, this.t);
   }

   @Override
   public dsa a_(iz $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dez.nb.o();
      } else {
         duh $$2 = this.b(this.e($$1));
         return $$2.c() ? dez.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public ent b_(iz $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return enu.a.g();
      } else {
         duh $$2 = this.b(this.e($$1));
         return $$2.c() ? enu.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dsa a(iz $$0, dsa $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.am()) {
         int $$6 = this.e($$4);
         duh $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dez.a)) {
            return $$1;
         } else {
            int $$9 = kb.b($$3);
            int $$10 = kb.b($$4);
            int $$11 = kb.b($$5);
            dsa $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(duv.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (enk.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dxs.a> $$14 = this.j().h();
            EnumSet<dxs.a> $$15 = null;

            for (dxs.a $$16 : $$14) {
               dxs $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dxs.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dxs.a(this, $$15);
            }

            for (dxs.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dez.nb.o();
      }
   }

   @Override
   public void a(dpf $$0) {
      this.k.put($$0.az_(), $$0);
   }

   @Nullable
   @Override
   public dpf c_(iz $$0) {
      return this.k.get($$0);
   }

   public Map<iz, dpf> D() {
      return this.k;
   }

   public void b(ur $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bss $$0) {
      if (!$$0.bR()) {
         ur $$1 = new ur();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eii $$0, eiq $$1) {
      dxg $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         eia $$3 = $$1.a();
         dby $$4 = this.z();
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
   public duv j() {
      return this.o;
   }

   public void a(duv $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ji<dcv> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(duv.f)) {
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

   public static iz a(short $$0, int $$1, dbd $$2) {
      int $$3 = kb.a($$2.e, $$0 & 15);
      int $$4 = kb.a($$1, $$0 >>> 4 & 15);
      int $$5 = kb.a($$2.f, $$0 >>> 8 & 15);
      return new iz($$3, $$4, $$5);
   }

   @Override
   public void e(iz $$0) {
      if (!this.s($$0)) {
         dtw.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dtw.a(this.b, $$1).add($$0);
   }

   public Map<iz, ur> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ur a(iz $$0, jk.a $$1) {
      dpf $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(iz $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dtv a(dxo.a $$0) {
      return this.q.get($$0);
   }

   public dtv b(dxo.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dtv(this.J_(), this.I_()));
   }

   public void a(dxo.a $$0, dtv $$1) {
      this.q.put($$0, $$1);
   }

   public void a(eni $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dxg $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dxg x() {
      return this.r;
   }

   private static <T> exb<T> a(exe<T> $$0) {
      return new exb<>($$0.b());
   }

   public exb<dex> G() {
      return a(this.s);
   }

   public exb<ens> H() {
      return a(this.t);
   }

   @Override
   public dby z() {
      return (dby)(this.y() ? dxg.b : this);
   }
}
