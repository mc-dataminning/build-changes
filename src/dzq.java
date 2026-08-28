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

public abstract class dzq implements dim.a, eac, eam {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   private volatile boolean p;
   private volatile boolean q;
   protected final dgo c;
   private long r;
   @Nullable
   @Deprecated
   private dil s;
   @Nullable
   protected edu d;
   protected final ean e;
   @Nullable
   protected eet f;
   protected final Map<edq.a, edq> h = Maps.newEnumMap(edq.a.class);
   protected eth i;
   private final Map<eok, eos> t = Maps.newHashMap();
   private final Map<eok, LongSet> u = Maps.newHashMap();
   protected final Map<jh, ux> j = Maps.newHashMap();
   protected final Map<jh, dux> k = new Object2ObjectOpenHashMap();
   protected final dhk l;
   protected final eab[] m;

   public dzq(dgo $$0, ean $$1, dhk $$2, kd<dik> $$3, long $$4, @Nullable eab[] $$5, @Nullable eet $$6) {
      this.c = $$0;
      this.e = $$1;
      this.l = $$2;
      this.m = new eab[$$2.an()];
      this.r = $$4;
      this.b = new ShortList[$$2.an()];
      this.f = $$6;
      this.i = new eth($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(kd<dik> $$0, eab[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new eab($$0);
         }
      }
   }

   public ecu a(int $$0) {
      return ecu.a;
   }

   @Nullable
   public abstract dxv a(jh var1, dxv var2, boolean var3);

   public abstract void a(dux var1);

   public abstract void a(bvk var1);

   public int a() {
      eab[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         eab $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.L_() : kj.c(this.h($$0));
   }

   public Set<jh> c() {
      Set<jh> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public eab[] d() {
      return this.m;
   }

   public eab b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<edq.a, edq>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(edq.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public edq a(edq.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new edq(this, $$0x));
   }

   public boolean b(edq.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(edq.a $$0, int $$1, int $$2) {
      edq $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (ab.aU && this instanceof eaa) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         edq.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public dgo f() {
      return this.c;
   }

   @Nullable
   @Override
   public eos a(eok $$0) {
      return this.t.get($$0);
   }

   @Override
   public void a(eok $$0, eos $$1) {
      this.t.put($$0, $$1);
      this.i();
   }

   public Map<eok, eos> g() {
      return Collections.unmodifiableMap(this.t);
   }

   public void a(Map<eok, eos> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.i();
   }

   @Override
   public LongSet b(eok $$0) {
      return this.u.getOrDefault($$0, o);
   }

   @Override
   public void a(eok $$0, long $$1) {
      this.u.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.i();
   }

   @Override
   public Map<eok, LongSet> h() {
      return Collections.unmodifiableMap(this.u);
   }

   @Override
   public void b(Map<eok, LongSet> $$0) {
      this.u.clear();
      this.u.putAll($$0);
      this.i();
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.L_()) {
         $$0 = this.L_();
      }

      if ($$1 > this.am()) {
         $$1 = this.am();
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

   public void i() {
      this.p = true;
   }

   public boolean j() {
      if (this.p) {
         this.p = false;
         return true;
      } else {
         return false;
      }
   }

   public boolean k() {
      return this.p;
   }

   public abstract ear n();

   public ear o() {
      ear $$0 = this.n();
      ede $$1 = this.z();
      if ($$1 != null) {
         ear $$2 = $$1.a();
         return ear.a($$2, $$0);
      } else {
         return $$0;
      }
   }

   public abstract void d(jh var1);

   public void e(jh $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] p() {
      return this.b;
   }

   public void a(ShortList $$0, int $$1) {
      a(this.p(), $$1).addAll($$0);
   }

   public void a(ux $$0) {
      this.j.put(dux.b($$0), $$0);
   }

   @Nullable
   public ux f(jh $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract ux a(jh var1, js.a var2);

   @Override
   public final void a(BiConsumer<jh, dxv> $$0) {
      this.a($$0x -> $$0x.k() != 0, $$0);
   }

   public void a(Predicate<dxv> $$0, BiConsumer<jh, dxv> $$1) {
      jh.a $$2 = new jh.a();

      for (int $$3 = this.ao(); $$3 <= this.ap(); $$3++) {
         eab $$4 = this.b(this.g($$3));
         if ($$4.a($$0)) {
            jh $$5 = kj.a(this.c, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dxv $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract fdt<dkm> q();

   public abstract fdt<etw> r();

   public boolean s() {
      return true;
   }

   public abstract dzq.a a(long var1);

   public ean t() {
      return this.e;
   }

   public boolean u() {
      return this.f != null;
   }

   @Nullable
   public eet v() {
      return this.f;
   }

   public long w() {
      return this.r;
   }

   public void b(long $$0) {
      this.r += $$0;
   }

   public void c(long $$0) {
      this.r = $$0;
   }

   public static ShortList a(ShortList[] $$0, int $$1) {
      if ($$0[$$1] == null) {
         $$0[$$1] = new ShortArrayList();
      }

      return $$0[$$1];
   }

   public boolean x() {
      return this.q;
   }

   public void a(boolean $$0) {
      this.q = $$0;
      this.i();
   }

   @Override
   public int L_() {
      return this.l.L_();
   }

   @Override
   public int M_() {
      return this.l.M_();
   }

   public edu a(Function<dzq, edu> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this);
      }

      return this.d;
   }

   @Deprecated
   public dil a(Supplier<dil> $$0) {
      if (this.s == null) {
         this.s = $$0.get();
      }

      return this.s;
   }

   @Override
   public jq<dik> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = kb.a(this.L_());
         int $$4 = $$3 + kb.a(this.M_()) - 1;
         int $$5 = bae.a($$1, $$3, $$4);
         int $$6 = this.f(kb.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$8);
      }
   }

   public void a(din $$0, dit.f $$1) {
      dgo $$2 = this.f();
      int $$3 = kb.a($$2.d());
      int $$4 = kb.a($$2.e());
      dhk $$5 = this.B();

      for (int $$6 = $$5.ao(); $$6 <= $$5.ap(); $$6++) {
         eab $$7 = this.b(this.g($$6));
         int $$8 = kb.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean y() {
      return !this.h().isEmpty();
   }

   @Nullable
   public ede z() {
      return null;
   }

   public boolean A() {
      return this.z() != null;
   }

   public dhk B() {
      return this;
   }

   public void C() {
      this.i.a(this);
   }

   @Override
   public eth D() {
      return this.i;
   }

   public static record a(List<fdp<dkm>> a, List<fdp<etw>> b) {
   }
}
