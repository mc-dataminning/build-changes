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

public abstract class dvw implements dev.a, dwi, dws {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final dcy d;
   private long q;
   @Nullable
   @Deprecated
   private deu r;
   @Nullable
   protected eaa e;
   protected final dwt f;
   @Nullable
   protected eaz g;
   protected final Map<dzw.a, dzw> h = Maps.newEnumMap(dzw.a.class);
   protected epl i;
   private final Map<eko, ekw> s = Maps.newHashMap();
   private final Map<eko, LongSet> t = Maps.newHashMap();
   protected final Map<je, uf> j = Maps.newHashMap();
   protected final Map<je, dre> k = new Object2ObjectOpenHashMap();
   protected final ddu l;
   protected final dwh[] m;

   public dvw(dcy $$0, dwt $$1, ddu $$2, ka<det> $$3, long $$4, @Nullable dwh[] $$5, @Nullable eaz $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dwh[$$2.ao()];
      this.q = $$4;
      this.b = new ShortList[$$2.ao()];
      this.g = $$6;
      this.i = new epl($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(ka<det> $$0, dwh[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dwh($$0);
         }
      }
   }

   public dza a(int $$0) {
      return dza.a;
   }

   @Nullable
   public abstract dua a(je var1, dua var2, boolean var3);

   public abstract void a(dre var1);

   public abstract void a(btj var1);

   public int a() {
      dwh[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dwh $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.G_() : kg.c(this.g($$0));
   }

   public Set<je> c() {
      Set<je> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public dwh[] d() {
      return this.m;
   }

   public dwh b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dzw.a, dzw>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(dzw.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dzw a(dzw.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new dzw(this, $$0x));
   }

   public boolean b(dzw.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(dzw.a $$0, int $$1, int $$2) {
      dzw $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (ab.aW && this instanceof dwg) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dzw.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public dcy f() {
      return this.d;
   }

   @Nullable
   @Override
   public ekw a(eko $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(eko $$0, ekw $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<eko, ekw> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<eko, ekw> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(eko $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(eko $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<eko, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<eko, LongSet> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.c = true;
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.G_()) {
         $$0 = this.G_();
      }

      if ($$1 >= this.an()) {
         $$1 = this.an() - 1;
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

   public abstract dwx j();

   public dwx m() {
      dwx $$0 = this.j();
      dzk $$1 = this.w();
      if ($$1 != null) {
         dwx $$2 = $$1.a();
         return dwx.a($$2, $$0);
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
      this.j.put(dre.b($$0), $$0);
   }

   @Nullable
   public uf f(je $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract uf a(je var1, jp.a var2);

   @Override
   public final void a(BiConsumer<je, dua> $$0) {
      this.a($$0x -> $$0x.k() != 0, $$0);
   }

   public void a(Predicate<dua> $$0, BiConsumer<je, dua> $$1) {
      je.a $$2 = new je.a();

      for (int $$3 = this.ap(); $$3 < this.aq(); $$3++) {
         dwh $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            je $$5 = kg.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dua $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract ezy<dgv> o();

   public abstract ezy<eqa> p();

   public abstract dvw.a a(long var1);

   public dwt q() {
      return this.f;
   }

   public boolean r() {
      return this.g != null;
   }

   @Nullable
   public eaz s() {
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

   public eaa a(Function<dvw, eaa> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public deu a(Supplier<deu> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public jn<det> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = jy.a(this.G_());
         int $$4 = $$3 + jy.a(this.H_()) - 1;
         int $$5 = azc.a($$1, $$3, $$4);
         int $$6 = this.e(jy.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$8);
      }
   }

   public void a(dew $$0, dfc.f $$1) {
      dcy $$2 = this.f();
      int $$3 = jy.a($$2.d());
      int $$4 = jy.a($$2.e());
      ddu $$5 = this.y();

      for (int $$6 = $$5.ap(); $$6 < $$5.aq(); $$6++) {
         dwh $$7 = this.b(this.f($$6));
         int $$8 = jy.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean v() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dzk w() {
      return null;
   }

   public boolean x() {
      return this.w() != null;
   }

   public ddu y() {
      return this;
   }

   public void z() {
      this.i.a(this);
   }

   @Override
   public epl A() {
      return this.i;
   }

   public static record a(List<ezu<dgv>> a, List<ezu<eqa>> b) {
   }
}
