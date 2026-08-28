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
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dwk implements dfj.a, dww, dxg {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final ddm d;
   private long q;
   @Nullable
   @Deprecated
   private dfi r;
   @Nullable
   protected eao e;
   protected final dxh f;
   @Nullable
   protected ebn g;
   protected final Map<eak.a, eak> h = Maps.newEnumMap(eak.a.class);
   protected epz i;
   private final Map<elc, elk> s = Maps.newHashMap();
   private final Map<elc, LongSet> t = Maps.newHashMap();
   protected final Map<je, uf> j = Maps.newHashMap();
   protected final Map<je, drs> k = new Object2ObjectOpenHashMap();
   protected final dei l;
   protected final dwv[] m;

   public dwk(ddm $$0, dxh $$1, dei $$2, ka<dfh> $$3, long $$4, @Nullable dwv[] $$5, @Nullable ebn $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dwv[$$2.ao()];
      this.q = $$4;
      this.b = new ShortList[$$2.ao()];
      this.g = $$6;
      this.i = new epz($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(ka<dfh> $$0, dwv[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dwv($$0);
         }
      }
   }

   public dzo a(int $$0) {
      return dzo.a;
   }

   @Nullable
   public abstract duo a(je var1, duo var2, boolean var3);

   public abstract void a(drs var1);

   public abstract void a(bto var1);

   public int a() {
      dwv[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dwv $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.G_() : kg.c(this.h($$0));
   }

   public Set<je> c() {
      Set<je> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public dwv[] d() {
      return this.m;
   }

   public dwv b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<eak.a, eak>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(eak.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public eak a(eak.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new eak(this, $$0x));
   }

   public boolean b(eak.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(eak.a $$0, int $$1, int $$2) {
      eak $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (ab.aW && this instanceof dwu) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         eak.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public ddm f() {
      return this.d;
   }

   @Nullable
   @Override
   public elk a(elc $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(elc $$0, elk $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<elc, elk> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<elc, elk> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(elc $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(elc $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<elc, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<elc, LongSet> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.c = true;
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.G_()) {
         $$0 = this.G_();
      }

      if ($$1 > this.an()) {
         $$1 = this.an();
      }

      for (int $$2 = $$0; $$2 <= $$1; $$2 += 16) {
         if (!this.b(this.f($$2)).c()) {
            return false;
         }
      }

      return true;
   }

   public boolean c(int $$0) {
      return this.b(this.g($$0)).c();
   }

   public void a(boolean $$0) {
      this.c = $$0;
   }

   public boolean i() {
      return this.c;
   }

   public abstract dxl j();

   public dxl m() {
      dxl $$0 = this.j();
      dzy $$1 = this.w();
      if ($$1 != null) {
         dxl $$2 = $$1.a();
         return dxl.a($$2, $$0);
      } else {
         return $$0;
      }
   }

   public abstract void d(je var1);

   public void e(je $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] n() {
      return this.b;
   }

   public void a(ShortList $$0, int $$1) {
      a(this.n(), $$1).addAll($$0);
   }

   public void a(uf $$0) {
      this.j.put(drs.b($$0), $$0);
   }

   @Nullable
   public uf f(je $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract uf a(je var1, jp.a var2);

   @Override
   public final void a(BiConsumer<je, duo> $$0) {
      this.a($$0x -> $$0x.k() != 0, $$0);
   }

   public void a(Predicate<duo> $$0, BiConsumer<je, duo> $$1) {
      je.a $$2 = new je.a();

      for (int $$3 = this.ap(); $$3 <= this.aq(); $$3++) {
         dwv $$4 = this.b(this.g($$3));
         if ($$4.a($$0)) {
            je $$5 = kg.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     duo $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract fan<dhj> o();

   public abstract fan<eqo> p();

   public abstract dwk.a a(long var1);

   public dxh q() {
      return this.f;
   }

   public boolean r() {
      return this.g != null;
   }

   @Nullable
   public ebn s() {
      return this.g;
   }

   public long t() {
      return this.q;
   }

   public void b(long $$0) {
      this.q += $$0;
   }

   public void c(long $$0) {
      this.q = $$0;
   }

   public static ShortList a(ShortList[] $$0, int $$1) {
      if ($$0[$$1] == null) {
         $$0[$$1] = new ShortArrayList();
      }

      return $$0[$$1];
   }

   public boolean u() {
      return this.p;
   }

   public void b(boolean $$0) {
      this.p = $$0;
      this.a(true);
   }

   @Override
   public int G_() {
      return this.l.G_();
   }

   @Override
   public int H_() {
      return this.l.H_();
   }

   public eao a(Function<dwk, eao> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public dfi a(Supplier<dfi> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public jn<dfh> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = jy.a(this.G_());
         int $$4 = $$3 + jy.a(this.H_()) - 1;
         int $$5 = azd.a($$1, $$3, $$4);
         int $$6 = this.f(jy.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$8);
      }
   }

   public void a(dfk $$0, dfq.f $$1) {
      ddm $$2 = this.f();
      int $$3 = jy.a($$2.d());
      int $$4 = jy.a($$2.e());
      dei $$5 = this.y();

      for (int $$6 = $$5.ap(); $$6 <= $$5.aq(); $$6++) {
         dwv $$7 = this.b(this.g($$6));
         int $$8 = jy.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean v() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dzy w() {
      return null;
   }

   public boolean x() {
      return this.w() != null;
   }

   public dei y() {
      return this;
   }

   public void z() {
      this.i.a(this);
   }

   @Override
   public epz A() {
      return this.i;
   }

   public static record a(List<faj<dhj>> a, List<faj<eqo>> b) {
   }
}
