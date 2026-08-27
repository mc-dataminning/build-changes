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

public abstract class dsd implements czj, dbe.a, dsp, dsz {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final czk d;
   private long q;
   @Nullable
   @Deprecated
   private dbd r;
   @Nullable
   protected dwd e;
   protected final dta f;
   @Nullable
   protected dxc g;
   protected final Map<dvz.a, dvz> h = Maps.newEnumMap(dvz.a.class);
   protected elk i;
   private final Map<egp, egx> s = Maps.newHashMap();
   private final Map<egp, LongSet> t = Maps.newHashMap();
   protected final Map<in, ua> j = Maps.newHashMap();
   protected final Map<in, dnm> k = new Object2ObjectOpenHashMap();
   protected final daf l;
   protected final dso[] m;

   public dsd(czk $$0, dta $$1, daf $$2, jj<dbc> $$3, long $$4, @Nullable dso[] $$5, @Nullable dxc $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dso[$$2.am()];
      this.q = $$4;
      this.b = new ShortList[$$2.am()];
      this.g = $$6;
      this.i = new elk($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(jj<dbc> $$0, dso[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dso($$0);
         }
      }
   }

   public dvd a(int $$0) {
      return dvd.a;
   }

   @Nullable
   public abstract dqh a(in var1, dqh var2, boolean var3);

   public abstract void a(dnm var1);

   public abstract void a(brh var1);

   public int a() {
      dso[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dso $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.I_() : jp.c(this.g($$0));
   }

   public Set<in> c() {
      Set<in> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public dso[] d() {
      return this.m;
   }

   public dso b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dvz.a, dvz>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(dvz.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dvz a(dvz.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new dvz(this, $$0x));
   }

   public boolean b(dvz.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(dvz.a $$0, int $$1, int $$2) {
      dvz $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (aa.aX && this instanceof dsn) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dvz.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public czk f() {
      return this.d;
   }

   @Nullable
   @Override
   public egx a(egp $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(egp $$0, egx $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<egp, egx> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<egp, egx> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(egp $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(egp $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<egp, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<egp, LongSet> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.c = true;
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.I_()) {
         $$0 = this.I_();
      }

      if ($$1 >= this.al()) {
         $$1 = this.al() - 1;
      }

      for (int $$2 = $$0; $$2 <= $$1; $$2 += 16) {
         if (!this.b(this.e($$2)).c()) {
            return false;
         }
      }

      return true;
   }

   public void a(boolean $$0) {
      this.c = $$0;
   }

   public boolean i() {
      return this.c;
   }

   public abstract dtc j();

   public dtc k() {
      dtc $$0 = this.j();
      dvn $$1 = this.x();
      if ($$1 != null) {
         dtc $$2 = $$1.a();
         return $$2.b($$0) ? $$2 : $$0;
      } else {
         return $$0;
      }
   }

   public abstract void d(in var1);

   public void e(in $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] n() {
      return this.b;
   }

   public void a(short $$0, int $$1) {
      a(this.n(), $$1).add($$0);
   }

   public void a(ua $$0) {
      this.j.put(dnm.b($$0), $$0);
   }

   @Nullable
   public ua f(in $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract ua a(in var1, iy.a var2);

   @Override
   public final void a(BiConsumer<in, dqh> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<dqh> $$0, BiConsumer<in, dqh> $$1) {
      in.a $$2 = new in.a();

      for (int $$3 = this.an(); $$3 < this.ao(); $$3++) {
         dso $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            in $$5 = jp.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dqh $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract evj<dde> o();

   public abstract evj<elz> p();

   public abstract dsd.a q();

   public dta r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public dxc t() {
      return this.g;
   }

   public void a(dxc $$0) {
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

   public dwd a(Function<dsd, dwd> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public dbd a(Supplier<dbd> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public iw<dbc> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = jh.a(this.I_());
         int $$4 = $$3 + jh.a(this.J_()) - 1;
         int $$5 = axz.a($$1, $$3, $$4);
         int $$6 = this.e(jh.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$8);
      }
   }

   public void a(dbf $$0, dbl.f $$1) {
      czk $$2 = this.f();
      int $$3 = jh.a($$2.d());
      int $$4 = jh.a($$2.e());
      daf $$5 = this.z();

      for (int $$6 = $$5.an(); $$6 < $$5.ao(); $$6++) {
         dso $$7 = this.b(this.f($$6));
         int $$8 = jh.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dvn x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public daf z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public elk B() {
      return this.i;
   }

   public static record a(evh<dde> a, evh<elz> b) {
   }
}
