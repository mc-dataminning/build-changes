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

public abstract class dkl implements cse, ctz.a, dky, dli {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final csf d;
   private long q;
   @Nullable
   @Deprecated
   private cty r;
   @Nullable
   protected doc e;
   protected final dlj f;
   @Nullable
   protected dpb g;
   protected final Map<dny.a, dny> h = Maps.newEnumMap(dny.a.class);
   protected edj i;
   private final Map<dyo, dyw> s = Maps.newHashMap();
   private final Map<dyo, LongSet> t = Maps.newHashMap();
   protected final Map<hv, sj> j = Maps.newHashMap();
   protected final Map<hv, dgd> k = Maps.newHashMap();
   protected final cta l;
   protected final dkx[] m;

   public dkl(csf $$0, dlj $$1, cta $$2, ir<ctx> $$3, long $$4, @Nullable dkx[] $$5, @Nullable dpb $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dkx[$$2.al()];
      this.q = $$4;
      this.b = new ShortList[$$2.al()];
      this.g = $$6;
      this.i = new edj($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(ir<ctx> $$0, dkx[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dkx($$0);
         }
      }
   }

   public dnc a(int $$0) {
      return dnc.a;
   }

   @Nullable
   public abstract dip a(hv var1, dip var2, boolean var3);

   public abstract void a(dgd var1);

   public abstract void a(blf var1);

   public int a() {
      dkx[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dkx $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.J_() : ix.c(this.g($$0));
   }

   public Set<hv> c() {
      Set<hv> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public dkx[] d() {
      return this.m;
   }

   public dkx b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dny.a, dny>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(dny.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dny a(dny.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new dny(this, $$0x));
   }

   public boolean b(dny.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(dny.a $$0, int $$1, int $$2) {
      dny $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (aa.aW && this instanceof dkw) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dny.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public csf f() {
      return this.d;
   }

   @Nullable
   @Override
   public dyw a(dyo $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(dyo $$0, dyw $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<dyo, dyw> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<dyo, dyw> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(dyo $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(dyo $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<dyo, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<dyo, LongSet> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.c = true;
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.J_()) {
         $$0 = this.J_();
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

   public abstract dkq j();

   public dkq k() {
      dkq $$0 = this.j();
      dnm $$1 = this.x();
      if ($$1 != null) {
         dkq $$2 = $$1.a();
         return $$2.b($$0) ? $$2 : $$0;
      } else {
         return $$0;
      }
   }

   public abstract void d(hv var1);

   public void e(hv $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] n() {
      return this.b;
   }

   public void a(short $$0, int $$1) {
      a(this.n(), $$1).add($$0);
   }

   public void a(sj $$0) {
      this.j.put(dgd.c($$0), $$0);
   }

   @Nullable
   public sj f(hv $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract sj g(hv var1);

   @Override
   public final void a(BiConsumer<hv, dip> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<dip> $$0, BiConsumer<hv, dip> $$1) {
      hv.a $$2 = new hv.a();

      for (int $$3 = this.am(); $$3 < this.an(); $$3++) {
         dkx $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            hv $$5 = ix.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dip $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract emq<cvz> o();

   public abstract emq<edy> p();

   public abstract dkl.a q();

   public dlj r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public dpb t() {
      return this.g;
   }

   public void a(dpb $$0) {
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

   public doc a(Function<dkl, doc> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public cty a(Supplier<cty> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public ie<ctx> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = iq.a(this.J_());
         int $$4 = $$3 + iq.a(this.K_()) - 1;
         int $$5 = aty.a($$1, $$3, $$4);
         int $$6 = this.e(iq.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$8);
      }
   }

   public void a(cua $$0, cug.f $$1) {
      csf $$2 = this.f();
      int $$3 = iq.a($$2.d());
      int $$4 = iq.a($$2.e());
      cta $$5 = this.z();

      for (int $$6 = $$5.am(); $$6 < $$5.an(); $$6++) {
         dkx $$7 = this.b(this.f($$6));
         int $$8 = iq.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dnm x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public cta z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public edj B() {
      return this.i;
   }

   public static record a(emo<cvz> a, emo<edy> b) {
   }
}
