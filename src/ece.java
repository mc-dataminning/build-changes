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

public abstract class ece implements dkf.a, ecq, eda {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   private volatile boolean p;
   private volatile boolean q;
   protected final dih c;
   private long r;
   @Nullable
   @Deprecated
   private dke s;
   @Nullable
   protected egk d;
   protected final edb e;
   @Nullable
   protected ehj f;
   protected final Map<egg.a, egg> h = Maps.newEnumMap(egg.a.class);
   protected evy i;
   private final Map<erb, erj> t = Maps.newHashMap();
   private final Map<erb, LongSet> u = Maps.newHashMap();
   protected final Map<iu, tz> j = Maps.newHashMap();
   protected final Map<iu, dxf> k = new Object2ObjectOpenHashMap();
   protected final djc l;
   protected final ecp[] m;

   public ece(dih $$0, edb $$1, djc $$2, jr<dkd> $$3, long $$4, @Nullable ecp[] $$5, @Nullable ehj $$6) {
      this.c = $$0;
      this.e = $$1;
      this.l = $$2;
      this.m = new ecp[$$2.ap()];
      this.r = $$4;
      this.b = new ShortList[$$2.ap()];
      this.f = $$6;
      this.i = new evy($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(jr<dkd> $$0, ecp[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new ecp($$0);
         }
      }
   }

   public efk a(int $$0) {
      return efk.a;
   }

   @Nullable
   public eah a(iu $$0, eah $$1) {
      return this.a($$0, $$1, 3);
   }

   @Nullable
   public abstract eah a(iu var1, eah var2, int var3);

   public abstract void a(dxf var1);

   public abstract void a(bwf var1);

   public int a() {
      ecp[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         ecp $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.G_() : jx.c(this.h($$0));
   }

   public Set<iu> c() {
      Set<iu> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public ecp[] d() {
      return this.m;
   }

   public ecp b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<egg.a, egg>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(egg.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public egg a(egg.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new egg(this, $$0x));
   }

   public boolean b(egg.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(egg.a $$0, int $$1, int $$2) {
      egg $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (ab.aU && this instanceof eco) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         egg.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public dih f() {
      return this.c;
   }

   @Nullable
   @Override
   public erj a(erb $$0) {
      return this.t.get($$0);
   }

   @Override
   public void a(erb $$0, erj $$1) {
      this.t.put($$0, $$1);
      this.i();
   }

   public Map<erb, erj> g() {
      return Collections.unmodifiableMap(this.t);
   }

   public void a(Map<erb, erj> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.i();
   }

   @Override
   public LongSet b(erb $$0) {
      return this.u.getOrDefault($$0, o);
   }

   @Override
   public void a(erb $$0, long $$1) {
      this.u.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.i();
   }

   @Override
   public Map<erb, LongSet> h() {
      return Collections.unmodifiableMap(this.u);
   }

   @Override
   public void b(Map<erb, LongSet> $$0) {
      this.u.clear();
      this.u.putAll($$0);
      this.i();
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.G_()) {
         $$0 = this.G_();
      }

      if ($$1 > this.ao()) {
         $$1 = this.ao();
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

   public abstract edf n();

   public edf o() {
      edf $$0 = this.n();
      efu $$1 = this.z();
      if ($$1 != null) {
         edf $$2 = $$1.a();
         return edf.a($$2, $$0);
      } else {
         return $$0;
      }
   }

   public abstract void d(iu var1);

   public void e(iu $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] p() {
      return this.b;
   }

   public void a(ShortList $$0, int $$1) {
      a(this.p(), $$1).addAll($$0);
   }

   public void a(tz $$0) {
      iu $$1 = dxf.b($$0);
      if (!this.k.containsKey($$1)) {
         this.j.put($$1, $$0);
      }
   }

   @Nullable
   public tz f(iu $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract tz a(iu var1, jg.a var2);

   @Override
   public final void a(BiConsumer<iu, eah> $$0) {
      this.a($$0x -> $$0x.k() != 0, $$0);
   }

   public void a(Predicate<eah> $$0, BiConsumer<iu, eah> $$1) {
      iu.a $$2 = new iu.a();

      for (int $$3 = this.aq(); $$3 <= this.ar(); $$3++) {
         ecp $$4 = this.b(this.g($$3));
         if ($$4.a($$0)) {
            iu $$5 = jx.a(this.c, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     eah $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract fgl<dmf> q();

   public abstract fgl<ewn> r();

   public boolean s() {
      return true;
   }

   public abstract ece.a a(long var1);

   public edb t() {
      return this.e;
   }

   public boolean u() {
      return this.f != null;
   }

   @Nullable
   public ehj v() {
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
   public int G_() {
      return this.l.G_();
   }

   @Override
   public int H_() {
      return this.l.H_();
   }

   public egk a(Function<ece, egk> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this);
      }

      return this.d;
   }

   @Deprecated
   public dke a(Supplier<dke> $$0) {
      if (this.s == null) {
         this.s = $$0.get();
      }

      return this.s;
   }

   @Override
   public je<dkd> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = jp.a(this.G_());
         int $$4 = $$3 + jp.a(this.H_()) - 1;
         int $$5 = azm.a($$1, $$3, $$4);
         int $$6 = this.f(jp.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$8);
      }
   }

   public void a(dkg $$0, dkm.f $$1) {
      dih $$2 = this.f();
      int $$3 = jp.a($$2.d());
      int $$4 = jp.a($$2.e());
      djc $$5 = this.B();

      for (int $$6 = $$5.aq(); $$6 <= $$5.ar(); $$6++) {
         ecp $$7 = this.b(this.g($$6));
         int $$8 = jp.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean y() {
      return !this.h().isEmpty();
   }

   @Nullable
   public efu z() {
      return null;
   }

   public boolean A() {
      return this.z() != null;
   }

   public djc B() {
      return this;
   }

   public void C() {
      this.i.a(this);
   }

   @Override
   public evy D() {
      return this.i;
   }

   public static record a(List<fgh<dmf>> a, List<fgh<ewn>> b) {
   }
}
