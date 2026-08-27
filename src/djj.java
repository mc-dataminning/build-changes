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

public abstract class djj implements crl, ctf.a, djw, dkg {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final crm d;
   private long q;
   @Nullable
   @Deprecated
   private cte r;
   @Nullable
   protected dna e;
   protected final dkh f;
   @Nullable
   protected dnz g;
   protected final Map<dmw.a, dmw> h = Maps.newEnumMap(dmw.a.class);
   protected ech i;
   private final Map<dxm, dxu> s = Maps.newHashMap();
   private final Map<dxm, LongSet> t = Maps.newHashMap();
   protected final Map<hx, sd> j = Maps.newHashMap();
   protected final Map<hx, dfi> k = Maps.newHashMap();
   protected final csh l;
   protected final djv[] m;

   public djj(crm $$0, dkh $$1, csh $$2, is<ctd> $$3, long $$4, @Nullable djv[] $$5, @Nullable dnz $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new djv[$$2.al()];
      this.q = $$4;
      this.b = new ShortList[$$2.al()];
      this.g = $$6;
      this.i = new ech($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(is<ctd> $$0, djv[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new djv($$0);
         }
      }
   }

   public dma a(int $$0) {
      return dma.a;
   }

   @Nullable
   public abstract dhn a(hx var1, dhn var2, boolean var3);

   public abstract void a(dfi var1);

   public abstract void a(bkv var1);

   public int a() {
      djv[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         djv $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.J_() : iy.c(this.g($$0));
   }

   public Set<hx> c() {
      Set<hx> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public djv[] d() {
      return this.m;
   }

   public djv b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dmw.a, dmw>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(dmw.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dmw a(dmw.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new dmw(this, $$0x));
   }

   public boolean b(dmw.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(dmw.a $$0, int $$1, int $$2) {
      dmw $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (aa.aT && this instanceof dju) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dmw.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public crm f() {
      return this.d;
   }

   @Nullable
   @Override
   public dxu a(dxm $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(dxm $$0, dxu $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<dxm, dxu> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<dxm, dxu> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(dxm $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(dxm $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<dxm, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<dxm, LongSet> $$0) {
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

   public abstract djo j();

   public djo k() {
      djo $$0 = this.j();
      dmk $$1 = this.x();
      if ($$1 != null) {
         djo $$2 = $$1.a();
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

   public void a(sd $$0) {
      this.j.put(dfi.c($$0), $$0);
   }

   @Nullable
   public sd f(hx $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract sd g(hx var1);

   @Override
   public final void a(BiConsumer<hx, dhn> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<dhn> $$0, BiConsumer<hx, dhn> $$1) {
      hx.a $$2 = new hx.a();

      for (int $$3 = this.am(); $$3 < this.an(); $$3++) {
         djv $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            hx $$5 = iy.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dhn $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract elo<cvf> o();

   public abstract elo<ecw> p();

   public abstract djj.a q();

   public dkh r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public dnz t() {
      return this.g;
   }

   public void a(dnz $$0) {
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

   public dna a(Function<djj, dna> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public cte a(Supplier<cte> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public ig<ctd> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = ir.a(this.J_());
         int $$4 = $$3 + ir.a(this.K_()) - 1;
         int $$5 = atq.a($$1, $$3, $$4);
         int $$6 = this.e(ir.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$8);
      }
   }

   public void a(ctg $$0, ctm.f $$1) {
      crm $$2 = this.f();
      int $$3 = ir.a($$2.d());
      int $$4 = ir.a($$2.e());
      csh $$5 = this.z();

      for (int $$6 = $$5.am(); $$6 < $$5.an(); $$6++) {
         djv $$7 = this.b(this.f($$6));
         int $$8 = ir.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dmk x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public csh z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public ech B() {
      return this.i;
   }

   public static record a(elm<cvf> a, elm<ecw> b) {
   }
}
