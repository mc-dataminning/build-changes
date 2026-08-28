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

public abstract class dxj implements dgj.a, dxv, dyf {
   public static final int a = -1;
   private static final Logger o = LogUtils.getLogger();
   private static final LongSet p = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean q;
   protected final del d;
   private long r;
   @Nullable
   @Deprecated
   private dgi s;
   @Nullable
   protected ebn e;
   protected final dyg f;
   @Nullable
   protected ecm h;
   protected final Map<ebj.a, ebj> i = Maps.newEnumMap(ebj.a.class);
   protected eqy j;
   private final Map<emb, emj> t = Maps.newHashMap();
   private final Map<emb, LongSet> u = Maps.newHashMap();
   protected final Map<jh, un> k = Maps.newHashMap();
   protected final Map<jh, dsr> l = new Object2ObjectOpenHashMap();
   protected final dfh m;
   protected final dxu[] n;

   public dxj(del $$0, dyg $$1, dfh $$2, kd<dgh> $$3, long $$4, @Nullable dxu[] $$5, @Nullable ecm $$6) {
      this.d = $$0;
      this.f = $$1;
      this.m = $$2;
      this.n = new dxu[$$2.am()];
      this.r = $$4;
      this.b = new ShortList[$$2.am()];
      this.h = $$6;
      this.j = new eqy($$2);
      if ($$5 != null) {
         if (this.n.length == $$5.length) {
            System.arraycopy($$5, 0, this.n, 0, this.n.length);
         } else {
            o.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.n.length);
         }
      }

      a($$3, this.n);
   }

   private static void a(kd<dgh> $$0, dxu[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dxu($$0);
         }
      }
   }

   public ean a(int $$0) {
      return ean.a;
   }

   @Nullable
   public abstract dvo a(jh var1, dvo var2, boolean var3);

   public abstract void a(dsr var1);

   public abstract void a(bui var1);

   public int a() {
      dxu[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dxu $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.I_() : kj.c(this.h($$0));
   }

   public Set<jh> c() {
      Set<jh> $$0 = Sets.newHashSet(this.k.keySet());
      $$0.addAll(this.l.keySet());
      return $$0;
   }

   public dxu[] d() {
      return this.n;
   }

   public dxu b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<ebj.a, ebj>> e() {
      return Collections.unmodifiableSet(this.i.entrySet());
   }

   public void a(ebj.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public ebj a(ebj.a $$0) {
      return this.i.computeIfAbsent($$0, $$0x -> new ebj(this, $$0x));
   }

   public boolean b(ebj.a $$0) {
      return this.i.get($$0) != null;
   }

   public int a(ebj.a $$0, int $$1, int $$2) {
      ebj $$3 = this.i.get($$0);
      if ($$3 == null) {
         if (ab.aV && this instanceof dxt) {
            o.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         ebj.a(this, EnumSet.of($$0));
         $$3 = this.i.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public del f() {
      return this.d;
   }

   @Nullable
   @Override
   public emj a(emb $$0) {
      return this.t.get($$0);
   }

   @Override
   public void a(emb $$0, emj $$1) {
      this.t.put($$0, $$1);
      this.c = true;
   }

   public Map<emb, emj> g() {
      return Collections.unmodifiableMap(this.t);
   }

   public void a(Map<emb, emj> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(emb $$0) {
      return this.u.getOrDefault($$0, p);
   }

   @Override
   public void a(emb $$0, long $$1) {
      this.u.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<emb, LongSet> h() {
      return Collections.unmodifiableMap(this.u);
   }

   @Override
   public void b(Map<emb, LongSet> $$0) {
      this.u.clear();
      this.u.putAll($$0);
      this.c = true;
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.I_()) {
         $$0 = this.I_();
      }

      if ($$1 > this.al()) {
         $$1 = this.al();
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

   public abstract dyk j();

   public dyk m() {
      dyk $$0 = this.j();
      eax $$1 = this.w();
      if ($$1 != null) {
         dyk $$2 = $$1.a();
         return dyk.a($$2, $$0);
      } else {
         return $$0;
      }
   }

   public abstract void d(jh var1);

   public void e(jh $$0) {
      o.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] n() {
      return this.b;
   }

   public void a(ShortList $$0, int $$1) {
      a(this.n(), $$1).addAll($$0);
   }

   public void a(un $$0) {
      this.k.put(dsr.b($$0), $$0);
   }

   @Nullable
   public un f(jh $$0) {
      return this.k.get($$0);
   }

   @Nullable
   public abstract un a(jh var1, js.a var2);

   @Override
   public final void a(BiConsumer<jh, dvo> $$0) {
      this.a($$0x -> $$0x.k() != 0, $$0);
   }

   public void a(Predicate<dvo> $$0, BiConsumer<jh, dvo> $$1) {
      jh.a $$2 = new jh.a();

      for (int $$3 = this.an(); $$3 <= this.ao(); $$3++) {
         dxu $$4 = this.b(this.g($$3));
         if ($$4.a($$0)) {
            jh $$5 = kj.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dvo $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract fbm<dij> o();

   public abstract fbm<ern> p();

   public abstract dxj.a a(long var1);

   public dyg q() {
      return this.f;
   }

   public boolean r() {
      return this.h != null;
   }

   @Nullable
   public ecm s() {
      return this.h;
   }

   public long t() {
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

   public boolean u() {
      return this.q;
   }

   public void b(boolean $$0) {
      this.q = $$0;
      this.a(true);
   }

   @Override
   public int I_() {
      return this.m.I_();
   }

   @Override
   public int J_() {
      return this.m.J_();
   }

   public ebn a(Function<dxj, ebn> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public dgi a(Supplier<dgi> $$0) {
      if (this.s == null) {
         this.s = $$0.get();
      }

      return this.s;
   }

   @Override
   public jq<dgh> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = kb.a(this.I_());
         int $$4 = $$3 + kb.a(this.J_()) - 1;
         int $$5 = azn.a($$1, $$3, $$4);
         int $$6 = this.f(kb.c($$5));
         return this.n[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$8);
      }
   }

   public void a(dgk $$0, dgq.f $$1) {
      del $$2 = this.f();
      int $$3 = kb.a($$2.d());
      int $$4 = kb.a($$2.e());
      dfh $$5 = this.y();

      for (int $$6 = $$5.an(); $$6 <= $$5.ao(); $$6++) {
         dxu $$7 = this.b(this.g($$6));
         int $$8 = kb.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean v() {
      return !this.h().isEmpty();
   }

   @Nullable
   public eax w() {
      return null;
   }

   public boolean x() {
      return this.w() != null;
   }

   public dfh y() {
      return this;
   }

   public void z() {
      this.j.a(this);
   }

   @Override
   public eqy A() {
      return this.j;
   }

   public static record a(List<fbi<dij>> a, List<fbi<ern>> b) {
   }
}
