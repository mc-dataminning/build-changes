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

public abstract class dtz implements dbf, dda.a, dul, duv {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final dbg d;
   private long q;
   @Nullable
   @Deprecated
   private dcz r;
   @Nullable
   protected dxz e;
   protected final duw f;
   @Nullable
   protected dyy g;
   protected final Map<dxv.a, dxv> h = Maps.newEnumMap(dxv.a.class);
   protected eng i;
   private final Map<eil, eit> s = Maps.newHashMap();
   private final Map<eil, LongSet> t = Maps.newHashMap();
   protected final Map<iz, us> j = Maps.newHashMap();
   protected final Map<iz, dpi> k = new Object2ObjectOpenHashMap();
   protected final dcb l;
   protected final duk[] m;

   public dtz(dbg $$0, duw $$1, dcb $$2, jv<dcy> $$3, long $$4, @Nullable duk[] $$5, @Nullable dyy $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new duk[$$2.an()];
      this.q = $$4;
      this.b = new ShortList[$$2.an()];
      this.g = $$6;
      this.i = new eng($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(jv<dcy> $$0, duk[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new duk($$0);
         }
      }
   }

   public dwz a(int $$0) {
      return dwz.a;
   }

   @Nullable
   public abstract dsd a(iz var1, dsd var2, boolean var3);

   public abstract void a(dpi var1);

   public abstract void a(bsv var1);

   public int a() {
      duk[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         duk $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.I_() : kb.c(this.g($$0));
   }

   public Set<iz> c() {
      Set<iz> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public duk[] d() {
      return this.m;
   }

   public duk b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dxv.a, dxv>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(dxv.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dxv a(dxv.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new dxv(this, $$0x));
   }

   public boolean b(dxv.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(dxv.a $$0, int $$1, int $$2) {
      dxv $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (aa.aX && this instanceof duj) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dxv.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public dbg f() {
      return this.d;
   }

   @Nullable
   @Override
   public eit a(eil $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(eil $$0, eit $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<eil, eit> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<eil, eit> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(eil $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(eil $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<eil, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<eil, LongSet> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.c = true;
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.I_()) {
         $$0 = this.I_();
      }

      if ($$1 >= this.am()) {
         $$1 = this.am() - 1;
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

   public abstract duy j();

   public duy k() {
      duy $$0 = this.j();
      dxj $$1 = this.x();
      if ($$1 != null) {
         duy $$2 = $$1.a();
         return $$2.b($$0) ? $$2 : $$0;
      } else {
         return $$0;
      }
   }

   public abstract void d(iz var1);

   public void e(iz $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] n() {
      return this.b;
   }

   public void a(short $$0, int $$1) {
      a(this.n(), $$1).add($$0);
   }

   public void a(us $$0) {
      this.j.put(dpi.b($$0), $$0);
   }

   @Nullable
   public us f(iz $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract us a(iz var1, jk.a var2);

   @Override
   public final void a(BiConsumer<iz, dsd> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<dsd> $$0, BiConsumer<iz, dsd> $$1) {
      iz.a $$2 = new iz.a();

      for (int $$3 = this.ao(); $$3 < this.ap(); $$3++) {
         duk $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            iz $$5 = kb.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dsd $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract exm<dfa> o();

   public abstract exm<env> p();

   public abstract dtz.a q();

   public duw r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public dyy t() {
      return this.g;
   }

   public void a(dyy $$0) {
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

   public dxz a(Function<dtz, dxz> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public dcz a(Supplier<dcz> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public ji<dcy> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = jt.a(this.I_());
         int $$4 = $$3 + jt.a(this.J_()) - 1;
         int $$5 = ayz.a($$1, $$3, $$4);
         int $$6 = this.e(jt.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$8);
      }
   }

   public void a(ddb $$0, ddh.f $$1) {
      dbg $$2 = this.f();
      int $$3 = jt.a($$2.d());
      int $$4 = jt.a($$2.e());
      dcb $$5 = this.z();

      for (int $$6 = $$5.ao(); $$6 < $$5.ap(); $$6++) {
         duk $$7 = this.b(this.f($$6));
         int $$8 = jt.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dxj x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public dcb z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public eng B() {
      return this.i;
   }

   public static record a(exk<dfa> a, exk<env> b) {
   }
}
