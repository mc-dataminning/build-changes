import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
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

public abstract class dld implements csv, cuq.a, dlq, dma {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final csw d;
   private long q;
   @Nullable
   @Deprecated
   private cup r;
   @Nullable
   protected dou e;
   protected final dmb f;
   @Nullable
   protected dpt g;
   protected final Map<doq.a, doq> h = Maps.newEnumMap(doq.a.class);
   protected eeb i;
   private final Map<dzg, dzo> s = Maps.newHashMap();
   private final Map<dzg, LongSet> t = Maps.newHashMap();
   protected final Map<hx, sn> j = Maps.newHashMap();
   protected final Map<hx, dgv> k = Maps.newHashMap();
   protected final ctr l;
   protected final dlp[] m;

   public dld(csw $$0, dmb $$1, ctr $$2, it<cuo> $$3, long $$4, @Nullable dlp[] $$5, @Nullable dpt $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dlp[$$2.am()];
      this.q = $$4;
      this.b = new ShortList[$$2.am()];
      this.g = $$6;
      this.i = new eeb($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(it<cuo> $$0, dlp[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dlp($$0);
         }
      }
   }

   public dnu a(int $$0) {
      return dnu.a;
   }

   @Nullable
   public abstract djh a(hx var1, djh var2, boolean var3);

   public abstract void a(dgv var1);

   public abstract void a(blv var1);

   public int a() {
      dlp[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dlp $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.J_() : iz.c(this.g($$0));
   }

   public Set<hx> c() {
      Set<hx> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public dlp[] d() {
      return this.m;
   }

   public dlp b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<doq.a, doq>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(doq.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public doq a(doq.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new doq(this, $$0x));
   }

   public boolean b(doq.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(doq.a $$0, int $$1, int $$2) {
      doq $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (aa.aW && this instanceof dlo) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         doq.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public csw f() {
      return this.d;
   }

   @Nullable
   @Override
   public dzo a(dzg $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(dzg $$0, dzo $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<dzg, dzo> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<dzg, dzo> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(dzg $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(dzg $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<dzg, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<dzg, LongSet> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.c = true;
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.J_()) {
         $$0 = this.J_();
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

   public abstract dli j();

   public dli k() {
      dli $$0 = this.j();
      doe $$1 = this.x();
      if ($$1 != null) {
         dli $$2 = $$1.a();
         return $$2.b($$0) ? $$2 : $$0;
      } else {
         return $$0;
      }
   }

   public abstract void d(hx var1);

   public void e(hx $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] n() {
      return this.b;
   }

   public void a(short $$0, int $$1) {
      a(this.n(), $$1).add($$0);
   }

   public void a(sn $$0) {
      this.j.put(dgv.c($$0), $$0);
   }

   @Nullable
   public sn f(hx $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract sn g(hx var1);

   @Override
   public final void a(BiConsumer<hx, djh> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<djh> $$0, BiConsumer<hx, djh> $$1) {
      hx.a $$2 = new hx.a();

      for (int $$3 = this.an(); $$3 < this.ao(); $$3++) {
         dlp $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            hx $$5 = iz.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     djh $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract enn<cwq> o();

   public abstract enn<eeq> p();

   public abstract dld.a q();

   public dmb r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public dpt t() {
      return this.g;
   }

   public void a(dpt $$0) {
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
   public int J_() {
      return this.l.J_();
   }

   @Override
   public int K_() {
      return this.l.K_();
   }

   public dou a(Function<dld, dou> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public cup a(Supplier<cup> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public ih<cuo> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = is.a(this.J_());
         int $$4 = $$3 + is.a(this.K_()) - 1;
         int $$5 = auo.a($$1, $$3, $$4);
         int $$6 = this.e(is.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$8);
      }
   }

   public void a(cur $$0, cux.f $$1) {
      csw $$2 = this.f();
      int $$3 = is.a($$2.d());
      int $$4 = is.a($$2.e());
      ctr $$5 = this.z();

      for (int $$6 = $$5.an(); $$6 < $$5.ao(); $$6++) {
         dlp $$7 = this.b(this.f($$6));
         int $$8 = is.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public doe x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public ctr z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public eeb B() {
      return this.i;
   }

   public static record a(enl<cwq> a, enl<eeq> b) {
   }
}
