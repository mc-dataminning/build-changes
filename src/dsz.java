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
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dsz implements daf, dca.a, dtl, dtv {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final dag d;
   private long q;
   @Nullable
   @Deprecated
   private dbz r;
   @Nullable
   protected dwz e;
   protected final dtw f;
   @Nullable
   protected dxy g;
   protected final Map<dwv.a, dwv> h = Maps.newEnumMap(dwv.a.class);
   protected emg i;
   private final Map<ehl, eht> s = Maps.newHashMap();
   private final Map<ehl, LongSet> t = Maps.newHashMap();
   protected final Map<io, ud> j = Maps.newHashMap();
   protected final Map<io, doi> k = new Object2ObjectOpenHashMap();
   protected final dbb l;
   protected final dtk[] m;

   public dsz(dag $$0, dtw $$1, dbb $$2, jk<dby> $$3, long $$4, @Nullable dtk[] $$5, @Nullable dxy $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dtk[$$2.am()];
      this.q = $$4;
      this.b = new ShortList[$$2.am()];
      this.g = $$6;
      this.i = new emg($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(jk<dby> $$0, dtk[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dtk($$0);
         }
      }
   }

   public dvz a(int $$0) {
      return dvz.a;
   }

   @Nullable
   public abstract drd a(io var1, drd var2, boolean var3);

   public abstract void a(doi var1);

   public abstract void a(brw var1);

   public int a() {
      dtk[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dtk $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.I_() : jq.c(this.g($$0));
   }

   public Set<io> c() {
      Set<io> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public dtk[] d() {
      return this.m;
   }

   public dtk b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dwv.a, dwv>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(dwv.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dwv a(dwv.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new dwv(this, $$0x));
   }

   public boolean b(dwv.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(dwv.a $$0, int $$1, int $$2) {
      dwv $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (aa.aX && this instanceof dtj) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dwv.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public dag f() {
      return this.d;
   }

   @Nullable
   @Override
   public eht a(ehl $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(ehl $$0, eht $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<ehl, eht> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<ehl, eht> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(ehl $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(ehl $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<ehl, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<ehl, LongSet> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.c = true;
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.I_()) {
         $$0 = this.I_();
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

   public abstract dty j();

   public dty k() {
      dty $$0 = this.j();
      dwj $$1 = this.x();
      if ($$1 != null) {
         dty $$2 = $$1.a();
         return $$2.b($$0) ? $$2 : $$0;
      } else {
         return $$0;
      }
   }

   public abstract void d(io var1);

   public void e(io $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] n() {
      return this.b;
   }

   public void a(short $$0, int $$1) {
      a(this.n(), $$1).add($$0);
   }

   public void a(ud $$0) {
      this.j.put(doi.b($$0), $$0);
   }

   @Nullable
   public ud f(io $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract ud a(io var1, iz.a var2);

   @Override
   public final void a(BiConsumer<io, drd> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<drd> $$0, BiConsumer<io, drd> $$1) {
      io.a $$2 = new io.a();

      for (int $$3 = this.an(); $$3 < this.ao(); $$3++) {
         dtk $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            io $$5 = jq.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     drd $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract ewg<dea> o();

   public abstract ewg<emv> p();

   public abstract dsz.a q();

   public dtw r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public dxy t() {
      return this.g;
   }

   public void a(dxy $$0) {
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

   public dwz a(Function<dsz, dwz> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public dbz a(Supplier<dbz> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public ix<dby> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = ji.a(this.I_());
         int $$4 = $$3 + ji.a(this.J_()) - 1;
         int $$5 = ayf.a($$1, $$3, $$4);
         int $$6 = this.e(ji.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$8);
      }
   }

   public void a(dcb $$0, dch.f $$1) {
      dag $$2 = this.f();
      int $$3 = ji.a($$2.d());
      int $$4 = ji.a($$2.e());
      dbb $$5 = this.z();

      for (int $$6 = $$5.an(); $$6 < $$5.ao(); $$6++) {
         dtk $$7 = this.b(this.f($$6));
         int $$8 = ji.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dwj x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public dbb z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public emg B() {
      return this.i;
   }

   public static record a(ewe<dea> a, ewe<emv> b) {
   }
}
