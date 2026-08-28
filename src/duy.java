import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class duy implements dcc, ddy.a, dvk, dvu {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final dcd d;
   private long q;
   @Nullable
   @Deprecated
   private ddx r;
   @Nullable
   protected dzc e;
   protected final dvv f;
   @Nullable
   protected eab g;
   protected final Map<dyy.a, dyy> h = Maps.newEnumMap(dyy.a.class);
   protected eoo i;
   private final Map<ejr, ejz> s = Maps.newHashMap();
   private final Map<ejr, LongSet> t = Maps.newHashMap();
   protected final Map<jd, ub> j = Maps.newHashMap();
   protected final Map<jd, dqh> k = new Object2ObjectOpenHashMap();
   protected final dcy l;
   protected final dvj[] m;

   public duy(dcd $$0, dvv $$1, dcy $$2, jz<ddw> $$3, long $$4, @Nullable dvj[] $$5, @Nullable eab $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dvj[$$2.an()];
      this.q = $$4;
      this.b = new ShortList[$$2.an()];
      this.g = $$6;
      this.i = new eoo($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(jz<ddw> $$0, dvj[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dvj($$0);
         }
      }
   }

   public dyc a(int $$0) {
      return dyc.a;
   }

   @Nullable
   public abstract dtc a(jd var1, dtc var2, boolean var3);

   public abstract void a(dqh var1);

   public abstract void a(bsr var1);

   public int a() {
      dvj[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dvj $$2 = $$0[$$1];
         if (!$$2.c()) {
            return $$1;
         }
      }

      return -1;
   }

   @Deprecated(
      forRemoval = true
   )
   public int b() {
      int $$0 = this.a();
      return $$0 == -1 ? this.I_() : kf.c(this.g($$0));
   }

   public Set<jd> c() {
      Set<jd> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public dvj[] d() {
      return this.m;
   }

   public dvj b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dyy.a, dyy>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(dyy.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dyy a(dyy.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new dyy(this, $$0x));
   }

   public boolean b(dyy.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(dyy.a $$0, int $$1, int $$2) {
      dyy $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (ab.aU && this instanceof dvi) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dyy.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public dcd f() {
      return this.d;
   }

   @Nullable
   @Override
   public ejz a(ejr $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(ejr $$0, ejz $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<ejr, ejz> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<ejr, ejz> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(ejr $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(ejr $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<ejr, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<ejr, LongSet> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.c = true;
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.I_()) {
         $$0 = this.I_();
      }

      if ($$1 >= this.am()) {
         $$1 = this.am() - 1;
      }

      for (int $$2 = $$0; $$2 <= $$1; $$2 += 16) {
         if (!this.b(this.e($$2)).c()) {
            return false;
         }
      }

      return true;
   }

   public boolean c(int $$0) {
      return this.b(this.f($$0)).c();
   }

   public void a(boolean $$0) {
      this.c = $$0;
   }

   public boolean i() {
      return this.c;
   }

   public abstract dvz j();

   public dvz k() {
      dvz $$0 = this.j();
      dym $$1 = this.x();
      if ($$1 != null) {
         dvz $$2 = $$1.a();
         return dvz.a($$2, $$0);
      } else {
         return $$0;
      }
   }

   public abstract void d(jd var1);

   public void e(jd $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] n() {
      return this.b;
   }

   public void a(short $$0, int $$1) {
      a(this.n(), $$1).add($$0);
   }

   public void a(ub $$0) {
      this.j.put(dqh.b($$0), $$0);
   }

   @Nullable
   public ub f(jd $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract ub a(jd var1, jo.a var2);

   @Override
   public final void a(BiConsumer<jd, dtc> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<dtc> $$0, BiConsumer<jd, dtc> $$1) {
      jd.a $$2 = new jd.a();

      for (int $$3 = this.ao(); $$3 < this.ap(); $$3++) {
         dvj $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            jd $$5 = kf.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dtc $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract eyw<dfy> o();

   public abstract eyw<epd> p();

   public abstract duy.a q();

   public dvv r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public eab t() {
      return this.g;
   }

   public void a(eab $$0) {
      this.g = $$0;
   }

   public long u() {
      return this.q;
   }

   public void a(long $$0) {
      this.q += $$0;
   }

   public void b(long $$0) {
      this.q = $$0;
   }

   public static ShortList a(ShortList[] $$0, int $$1) {
      if ($$0[$$1] == null) {
         $$0[$$1] = new ShortArrayList();
      }

      return $$0[$$1];
   }

   public boolean v() {
      return this.p;
   }

   public void b(boolean $$0) {
      this.p = $$0;
      this.a(true);
   }

   @Override
   public int I_() {
      return this.l.I_();
   }

   @Override
   public int J_() {
      return this.l.J_();
   }

   public dzc a(Function<duy, dzc> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public ddx a(Supplier<ddx> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public jm<ddw> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = jx.a(this.I_());
         int $$4 = $$3 + jx.a(this.J_()) - 1;
         int $$5 = ayo.a($$1, $$3, $$4);
         int $$6 = this.e(jx.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$8);
      }
   }

   public void a(ddz $$0, def.f $$1) {
      dcd $$2 = this.f();
      int $$3 = jx.a($$2.d());
      int $$4 = jx.a($$2.e());
      dcy $$5 = this.z();

      for (int $$6 = $$5.ao(); $$6 < $$5.ap(); $$6++) {
         dvj $$7 = this.b(this.f($$6));
         int $$8 = jx.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dym x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public dcy z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public eoo B() {
      return this.i;
   }

   public static record a(eyu<dfy> a, eyu<epd> b) {
   }
}
