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

public abstract class dlc implements csu, cup.a, dlp, dlz {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final csv d;
   private long q;
   @Nullable
   @Deprecated
   private cuo r;
   @Nullable
   protected dot e;
   protected final dma f;
   @Nullable
   protected dps g;
   protected final Map<dop.a, dop> h = Maps.newEnumMap(dop.a.class);
   protected eea i;
   private final Map<dzf, dzn> s = Maps.newHashMap();
   private final Map<dzf, LongSet> t = Maps.newHashMap();
   protected final Map<hx, sn> j = Maps.newHashMap();
   protected final Map<hx, dgu> k = Maps.newHashMap();
   protected final ctq l;
   protected final dlo[] m;

   public dlc(csv $$0, dma $$1, ctq $$2, it<cun> $$3, long $$4, @Nullable dlo[] $$5, @Nullable dps $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dlo[$$2.am()];
      this.q = $$4;
      this.b = new ShortList[$$2.am()];
      this.g = $$6;
      this.i = new eea($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(it<cun> $$0, dlo[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dlo($$0);
         }
      }
   }

   public dnt a(int $$0) {
      return dnt.a;
   }

   @Nullable
   public abstract djg a(hx var1, djg var2, boolean var3);

   public abstract void a(dgu var1);

   public abstract void a(blu var1);

   public int a() {
      dlo[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dlo $$2 = $$0[$$1];
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

   public dlo[] d() {
      return this.m;
   }

   public dlo b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dop.a, dop>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(dop.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dop a(dop.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new dop(this, $$0x));
   }

   public boolean b(dop.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(dop.a $$0, int $$1, int $$2) {
      dop $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (aa.aW && this instanceof dln) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dop.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public csv f() {
      return this.d;
   }

   @Nullable
   @Override
   public dzn a(dzf $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(dzf $$0, dzn $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<dzf, dzn> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<dzf, dzn> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(dzf $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(dzf $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<dzf, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<dzf, LongSet> $$0) {
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

   public abstract dlh j();

   public dlh k() {
      dlh $$0 = this.j();
      dod $$1 = this.x();
      if ($$1 != null) {
         dlh $$2 = $$1.a();
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
      this.j.put(dgu.c($$0), $$0);
   }

   @Nullable
   public sn f(hx $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract sn g(hx var1);

   @Override
   public final void a(BiConsumer<hx, djg> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<djg> $$0, BiConsumer<hx, djg> $$1) {
      hx.a $$2 = new hx.a();

      for (int $$3 = this.an(); $$3 < this.ao(); $$3++) {
         dlo $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            hx $$5 = iz.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     djg $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract enm<cwp> o();

   public abstract enm<eep> p();

   public abstract dlc.a q();

   public dma r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public dps t() {
      return this.g;
   }

   public void a(dps $$0) {
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

   public dot a(Function<dlc, dot> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public cuo a(Supplier<cuo> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public ih<cun> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = is.a(this.J_());
         int $$4 = $$3 + is.a(this.K_()) - 1;
         int $$5 = aun.a($$1, $$3, $$4);
         int $$6 = this.e(is.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$8);
      }
   }

   public void a(cuq $$0, cuw.f $$1) {
      csv $$2 = this.f();
      int $$3 = is.a($$2.d());
      int $$4 = is.a($$2.e());
      ctq $$5 = this.z();

      for (int $$6 = $$5.an(); $$6 < $$5.ao(); $$6++) {
         dlo $$7 = this.b(this.f($$6));
         int $$8 = is.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dod x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public ctq z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public eea B() {
      return this.i;
   }

   public static record a(enk<cwp> a, enk<eep> b) {
   }
}
