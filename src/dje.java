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

public abstract class dje implements crg, cta.a, djr, dkb {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final crh d;
   private long q;
   @Nullable
   @Deprecated
   private csz r;
   @Nullable
   protected dmv e;
   protected final dkc f;
   @Nullable
   protected dnu g;
   protected final Map<dmr.a, dmr> h = Maps.newEnumMap(dmr.a.class);
   protected ecc i;
   private final Map<dxh, dxp> s = Maps.newHashMap();
   private final Map<dxh, LongSet> t = Maps.newHashMap();
   protected final Map<ht, rz> j = Maps.newHashMap();
   protected final Map<ht, dfd> k = Maps.newHashMap();
   protected final csc l;
   protected final djq[] m;

   public dje(crh $$0, dkc $$1, csc $$2, io<csy> $$3, long $$4, @Nullable djq[] $$5, @Nullable dnu $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new djq[$$2.al()];
      this.q = $$4;
      this.b = new ShortList[$$2.al()];
      this.g = $$6;
      this.i = new ecc($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(io<csy> $$0, djq[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new djq($$0);
         }
      }
   }

   public dlv a(int $$0) {
      return dlv.a;
   }

   @Nullable
   public abstract dhi a(ht var1, dhi var2, boolean var3);

   public abstract void a(dfd var1);

   public abstract void a(bkq var1);

   public int a() {
      djq[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         djq $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.I_() : iu.c(this.g($$0));
   }

   public Set<ht> c() {
      Set<ht> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public djq[] d() {
      return this.m;
   }

   public djq b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dmr.a, dmr>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(dmr.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dmr a(dmr.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new dmr(this, $$0x));
   }

   public boolean b(dmr.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(dmr.a $$0, int $$1, int $$2) {
      dmr $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (aa.aT && this instanceof djp) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dmr.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public crh f() {
      return this.d;
   }

   @Nullable
   @Override
   public dxp a(dxh $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(dxh $$0, dxp $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<dxh, dxp> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<dxh, dxp> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(dxh $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(dxh $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<dxh, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<dxh, LongSet> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.c = true;
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.I_()) {
         $$0 = this.I_();
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

   public abstract djj j();

   public djj k() {
      djj $$0 = this.j();
      dmf $$1 = this.x();
      if ($$1 != null) {
         djj $$2 = $$1.a();
         return $$2.b($$0) ? $$2 : $$0;
      } else {
         return $$0;
      }
   }

   public abstract void d(ht var1);

   public void e(ht $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] n() {
      return this.b;
   }

   public void a(short $$0, int $$1) {
      a(this.n(), $$1).add($$0);
   }

   public void a(rz $$0) {
      this.j.put(dfd.c($$0), $$0);
   }

   @Nullable
   public rz f(ht $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract rz g(ht var1);

   @Override
   public final void a(BiConsumer<ht, dhi> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<dhi> $$0, BiConsumer<ht, dhi> $$1) {
      ht.a $$2 = new ht.a();

      for (int $$3 = this.am(); $$3 < this.an(); $$3++) {
         djq $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            ht $$5 = iu.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dhi $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract elj<cva> o();

   public abstract elj<ecr> p();

   public abstract dje.a q();

   public dkc r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public dnu t() {
      return this.g;
   }

   public void a(dnu $$0) {
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
   public int I_() {
      return this.l.I_();
   }

   @Override
   public int J_() {
      return this.l.J_();
   }

   public dmv a(Function<dje, dmv> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public csz a(Supplier<csz> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public ib<csy> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = in.a(this.I_());
         int $$4 = $$3 + in.a(this.J_()) - 1;
         int $$5 = atm.a($$1, $$3, $$4);
         int $$6 = this.e(in.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$8);
      }
   }

   public void a(ctb $$0, cth.f $$1) {
      crh $$2 = this.f();
      int $$3 = in.a($$2.d());
      int $$4 = in.a($$2.e());
      csc $$5 = this.z();

      for (int $$6 = $$5.am(); $$6 < $$5.an(); $$6++) {
         djq $$7 = this.b(this.f($$6));
         int $$8 = in.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dmf x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public csc z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public ecc B() {
      return this.i;
   }

   public static record a(elh<cva> a, elh<ecr> b) {
   }
}
