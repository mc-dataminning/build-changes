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

public abstract class dwo implements dfm.a, dxa, dxk {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final ddp d;
   private long q;
   @Nullable
   @Deprecated
   private dfl r;
   @Nullable
   protected eas e;
   protected final dxl f;
   @Nullable
   protected ebr g;
   protected final Map<eao.a, eao> h = Maps.newEnumMap(eao.a.class);
   protected eqd i;
   private final Map<elg, elo> s = Maps.newHashMap();
   private final Map<elg, LongSet> t = Maps.newHashMap();
   protected final Map<jf, ug> j = Maps.newHashMap();
   protected final Map<jf, drv> k = new Object2ObjectOpenHashMap();
   protected final del l;
   protected final dwz[] m;

   public dwo(ddp $$0, dxl $$1, del $$2, kb<dfk> $$3, long $$4, @Nullable dwz[] $$5, @Nullable ebr $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dwz[$$2.ao()];
      this.q = $$4;
      this.b = new ShortList[$$2.ao()];
      this.g = $$6;
      this.i = new eqd($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(kb<dfk> $$0, dwz[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dwz($$0);
         }
      }
   }

   public dzs a(int $$0) {
      return dzs.a;
   }

   @Nullable
   public abstract dus a(jf var1, dus var2, boolean var3);

   public abstract void a(drv var1);

   public abstract void a(btr var1);

   public int a() {
      dwz[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dwz $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.H_() : kh.c(this.h($$0));
   }

   public Set<jf> c() {
      Set<jf> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public dwz[] d() {
      return this.m;
   }

   public dwz b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<eao.a, eao>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(eao.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public eao a(eao.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new eao(this, $$0x));
   }

   public boolean b(eao.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(eao.a $$0, int $$1, int $$2) {
      eao $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (ab.aW && this instanceof dwy) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         eao.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public ddp f() {
      return this.d;
   }

   @Nullable
   @Override
   public elo a(elg $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(elg $$0, elo $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<elg, elo> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<elg, elo> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(elg $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(elg $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<elg, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<elg, LongSet> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.c = true;
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.H_()) {
         $$0 = this.H_();
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

   public abstract dxp j();

   public dxp m() {
      dxp $$0 = this.j();
      eac $$1 = this.w();
      if ($$1 != null) {
         dxp $$2 = $$1.a();
         return dxp.a($$2, $$0);
      } else {
         return $$0;
      }
   }

   public abstract void d(jf var1);

   public void e(jf $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] n() {
      return this.b;
   }

   public void a(ShortList $$0, int $$1) {
      a(this.n(), $$1).addAll($$0);
   }

   public void a(ug $$0) {
      this.j.put(drv.b($$0), $$0);
   }

   @Nullable
   public ug f(jf $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract ug a(jf var1, jq.a var2);

   @Override
   public final void a(BiConsumer<jf, dus> $$0) {
      this.a($$0x -> $$0x.k() != 0, $$0);
   }

   public void a(Predicate<dus> $$0, BiConsumer<jf, dus> $$1) {
      jf.a $$2 = new jf.a();

      for (int $$3 = this.ap(); $$3 <= this.aq(); $$3++) {
         dwz $$4 = this.b(this.g($$3));
         if ($$4.a($$0)) {
            jf $$5 = kh.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dus $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract far<dhm> o();

   public abstract far<eqs> p();

   public abstract dwo.a a(long var1);

   public dxl q() {
      return this.f;
   }

   public boolean r() {
      return this.g != null;
   }

   @Nullable
   public ebr s() {
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
   public int H_() {
      return this.l.H_();
   }

   @Override
   public int I_() {
      return this.l.I_();
   }

   public eas a(Function<dwo, eas> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public dfl a(Supplier<dfl> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public jo<dfk> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = jz.a(this.H_());
         int $$4 = $$3 + jz.a(this.I_()) - 1;
         int $$5 = azf.a($$1, $$3, $$4);
         int $$6 = this.f(jz.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$8);
      }
   }

   public void a(dfn $$0, dft.f $$1) {
      ddp $$2 = this.f();
      int $$3 = jz.a($$2.d());
      int $$4 = jz.a($$2.e());
      del $$5 = this.y();

      for (int $$6 = $$5.ap(); $$6 <= $$5.aq(); $$6++) {
         dwz $$7 = this.b(this.g($$6));
         int $$8 = jz.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean v() {
      return !this.h().isEmpty();
   }

   @Nullable
   public eac w() {
      return null;
   }

   public boolean x() {
      return this.w() != null;
   }

   public del y() {
      return this;
   }

   public void z() {
      this.i.a(this);
   }

   @Override
   public eqd A() {
      return this.i;
   }

   public static record a(List<fan<dhm>> a, List<fan<eqs>> b) {
   }
}
