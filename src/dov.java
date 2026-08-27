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

public abstract class dov implements cwf, cya.a, dpi, dps {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final cwg d;
   private long q;
   @Nullable
   @Deprecated
   private cxz r;
   @Nullable
   protected dsq e;
   protected final dpt f;
   @Nullable
   protected dtp g;
   protected final Map<dsm.a, dsm> h = Maps.newEnumMap(dsm.a.class);
   protected ehx i;
   private final Map<edc, edk> s = Maps.newHashMap();
   private final Map<edc, LongSet> t = Maps.newHashMap();
   protected final Map<ib, ta> j = Maps.newHashMap();
   protected final Map<ib, dkg> k = new Object2ObjectOpenHashMap();
   protected final cxb l;
   protected final dph[] m;

   public dov(cwg $$0, dpt $$1, cxb $$2, iy<cxy> $$3, long $$4, @Nullable dph[] $$5, @Nullable dtp $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dph[$$2.al()];
      this.q = $$4;
      this.b = new ShortList[$$2.al()];
      this.g = $$6;
      this.i = new ehx($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(iy<cxy> $$0, dph[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dph($$0);
         }
      }
   }

   public drq a(int $$0) {
      return drq.a;
   }

   @Nullable
   public abstract dmz a(ib var1, dmz var2, boolean var3);

   public abstract void a(dkg var1);

   public abstract void a(bow var1);

   public int a() {
      dph[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dph $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.I_() : je.c(this.g($$0));
   }

   public Set<ib> c() {
      Set<ib> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public dph[] d() {
      return this.m;
   }

   public dph b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dsm.a, dsm>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(dsm.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dsm a(dsm.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new dsm(this, $$0x));
   }

   public boolean b(dsm.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(dsm.a $$0, int $$1, int $$2) {
      dsm $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (aa.aW && this instanceof dpg) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dsm.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public cwg f() {
      return this.d;
   }

   @Nullable
   @Override
   public edk a(edc $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(edc $$0, edk $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<edc, edk> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<edc, edk> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(edc $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(edc $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<edc, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<edc, LongSet> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.c = true;
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.I_()) {
         $$0 = this.I_();
      }

      if ($$1 >= this.ak()) {
         $$1 = this.ak() - 1;
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

   public abstract dpa j();

   public dpa k() {
      dpa $$0 = this.j();
      dsa $$1 = this.x();
      if ($$1 != null) {
         dpa $$2 = $$1.a();
         return $$2.b($$0) ? $$2 : $$0;
      } else {
         return $$0;
      }
   }

   public abstract void d(ib var1);

   public void e(ib $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] n() {
      return this.b;
   }

   public void a(short $$0, int $$1) {
      a(this.n(), $$1).add($$0);
   }

   public void a(ta $$0) {
      this.j.put(dkg.a($$0), $$0);
   }

   @Nullable
   public ta f(ib $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract ta a(ib var1, in.a var2);

   @Override
   public final void a(BiConsumer<ib, dmz> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<dmz> $$0, BiConsumer<ib, dmz> $$1) {
      ib.a $$2 = new ib.a();

      for (int $$3 = this.am(); $$3 < this.an(); $$3++) {
         dph $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            ib $$5 = je.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dmz $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract erl<daa> o();

   public abstract erl<eim> p();

   public abstract dov.a q();

   public dpt r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public dtp t() {
      return this.g;
   }

   public void a(dtp $$0) {
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

   public dsq a(Function<dov, dsq> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public cxz a(Supplier<cxz> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public il<cxy> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = iw.a(this.I_());
         int $$4 = $$3 + iw.a(this.J_()) - 1;
         int $$5 = aww.a($$1, $$3, $$4);
         int $$6 = this.e(iw.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$8);
      }
   }

   public void a(cyb $$0, cyh.f $$1) {
      cwg $$2 = this.f();
      int $$3 = iw.a($$2.d());
      int $$4 = iw.a($$2.e());
      cxb $$5 = this.z();

      for (int $$6 = $$5.am(); $$6 < $$5.an(); $$6++) {
         dph $$7 = this.b(this.f($$6));
         int $$8 = iw.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dsa x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public cxb z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public ehx B() {
      return this.i;
   }

   public static record a(erj<daa> a, erj<eim> b) {
   }
}
