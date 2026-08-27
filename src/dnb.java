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

public abstract class dnb implements cut, cwo.a, dno, dny {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final cuu d;
   private long q;
   @Nullable
   @Deprecated
   private cwn r;
   @Nullable
   protected dqs e;
   protected final dnz f;
   @Nullable
   protected drr g;
   protected final Map<dqo.a, dqo> h = Maps.newEnumMap(dqo.a.class);
   protected efz i;
   private final Map<ebe, ebm> s = Maps.newHashMap();
   private final Map<ebe, LongSet> t = Maps.newHashMap();
   protected final Map<hz, sw> j = Maps.newHashMap();
   protected final Map<hz, dit> k = Maps.newHashMap();
   protected final cvp l;
   protected final dnn[] m;

   public dnb(cuu $$0, dnz $$1, cvp $$2, iv<cwm> $$3, long $$4, @Nullable dnn[] $$5, @Nullable drr $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dnn[$$2.am()];
      this.q = $$4;
      this.b = new ShortList[$$2.am()];
      this.g = $$6;
      this.i = new efz($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(iv<cwm> $$0, dnn[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dnn($$0);
         }
      }
   }

   public dps a(int $$0) {
      return dps.a;
   }

   @Nullable
   public abstract dlf a(hz var1, dlf var2, boolean var3);

   public abstract void a(dit var1);

   public abstract void a(bno var1);

   public int a() {
      dnn[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dnn $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.J_() : jb.c(this.g($$0));
   }

   public Set<hz> c() {
      Set<hz> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public dnn[] d() {
      return this.m;
   }

   public dnn b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dqo.a, dqo>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(dqo.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dqo a(dqo.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new dqo(this, $$0x));
   }

   public boolean b(dqo.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(dqo.a $$0, int $$1, int $$2) {
      dqo $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (aa.aU && this instanceof dnm) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dqo.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public cuu f() {
      return this.d;
   }

   @Nullable
   @Override
   public ebm a(ebe $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(ebe $$0, ebm $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<ebe, ebm> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<ebe, ebm> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(ebe $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(ebe $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<ebe, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<ebe, LongSet> $$0) {
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

   public abstract dng j();

   public dng k() {
      dng $$0 = this.j();
      dqc $$1 = this.x();
      if ($$1 != null) {
         dng $$2 = $$1.a();
         return $$2.b($$0) ? $$2 : $$0;
      } else {
         return $$0;
      }
   }

   public abstract void d(hz var1);

   public void e(hz $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] n() {
      return this.b;
   }

   public void a(short $$0, int $$1) {
      a(this.n(), $$1).add($$0);
   }

   public void a(sw $$0) {
      this.j.put(dit.c($$0), $$0);
   }

   @Nullable
   public sw f(hz $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract sw g(hz var1);

   @Override
   public final void a(BiConsumer<hz, dlf> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<dlf> $$0, BiConsumer<hz, dlf> $$1) {
      hz.a $$2 = new hz.a();

      for (int $$3 = this.an(); $$3 < this.ao(); $$3++) {
         dnn $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            hz $$5 = jb.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dlf $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract epm<cyo> o();

   public abstract epm<ego> p();

   public abstract dnb.a q();

   public dnz r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public drr t() {
      return this.g;
   }

   public void a(drr $$0) {
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

   public dqs a(Function<dnb, dqs> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public cwn a(Supplier<cwn> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public ij<cwm> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = iu.a(this.J_());
         int $$4 = $$3 + iu.a(this.K_()) - 1;
         int $$5 = awh.a($$1, $$3, $$4);
         int $$6 = this.e(iu.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$8);
      }
   }

   public void a(cwp $$0, cwv.f $$1) {
      cuu $$2 = this.f();
      int $$3 = iu.a($$2.d());
      int $$4 = iu.a($$2.e());
      cvp $$5 = this.z();

      for (int $$6 = $$5.an(); $$6 < $$5.ao(); $$6++) {
         dnn $$7 = this.b(this.f($$6));
         int $$8 = iu.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dqc x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public cvp z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public efz B() {
      return this.i;
   }

   public static record a(epk<cyo> a, epk<ego> b) {
   }
}
