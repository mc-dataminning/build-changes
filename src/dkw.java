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

public abstract class dkw implements cso, cuj.a, dlj, dlt {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final csp d;
   private long q;
   @Nullable
   @Deprecated
   private cui r;
   @Nullable
   protected don e;
   protected final dlu f;
   @Nullable
   protected dpm g;
   protected final Map<doj.a, doj> h = Maps.newEnumMap(doj.a.class);
   protected edu i;
   private final Map<dyz, dzh> s = Maps.newHashMap();
   private final Map<dyz, LongSet> t = Maps.newHashMap();
   protected final Map<hx, sl> j = Maps.newHashMap();
   protected final Map<hx, dgo> k = Maps.newHashMap();
   protected final ctk l;
   protected final dli[] m;

   public dkw(csp $$0, dlu $$1, ctk $$2, it<cuh> $$3, long $$4, @Nullable dli[] $$5, @Nullable dpm $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dli[$$2.am()];
      this.q = $$4;
      this.b = new ShortList[$$2.am()];
      this.g = $$6;
      this.i = new edu($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(it<cuh> $$0, dli[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dli($$0);
         }
      }
   }

   public dnn a(int $$0) {
      return dnn.a;
   }

   @Nullable
   public abstract dja a(hx var1, dja var2, boolean var3);

   public abstract void a(dgo var1);

   public abstract void a(blp var1);

   public int a() {
      dli[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dli $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.J_() : iz.c(this.g($$0));
   }

   public Set<hx> c() {
      Set<hx> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public dli[] d() {
      return this.m;
   }

   public dli b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<doj.a, doj>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(doj.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public doj a(doj.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new doj(this, $$0x));
   }

   public boolean b(doj.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(doj.a $$0, int $$1, int $$2) {
      doj $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (aa.aW && this instanceof dlh) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         doj.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public csp f() {
      return this.d;
   }

   @Nullable
   @Override
   public dzh a(dyz $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(dyz $$0, dzh $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<dyz, dzh> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<dyz, dzh> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(dyz $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(dyz $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<dyz, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<dyz, LongSet> $$0) {
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

   public abstract dlb j();

   public dlb k() {
      dlb $$0 = this.j();
      dnx $$1 = this.x();
      if ($$1 != null) {
         dlb $$2 = $$1.a();
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

   public void a(sl $$0) {
      this.j.put(dgo.c($$0), $$0);
   }

   @Nullable
   public sl f(hx $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract sl g(hx var1);

   @Override
   public final void a(BiConsumer<hx, dja> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<dja> $$0, BiConsumer<hx, dja> $$1) {
      hx.a $$2 = new hx.a();

      for (int $$3 = this.an(); $$3 < this.ao(); $$3++) {
         dli $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            hx $$5 = iz.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dja $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract eng<cwj> o();

   public abstract eng<eej> p();

   public abstract dkw.a q();

   public dlu r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public dpm t() {
      return this.g;
   }

   public void a(dpm $$0) {
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

   public don a(Function<dkw, don> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public cui a(Supplier<cui> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public ih<cuh> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = is.a(this.J_());
         int $$4 = $$3 + is.a(this.K_()) - 1;
         int $$5 = aui.a($$1, $$3, $$4);
         int $$6 = this.e(is.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$8);
      }
   }

   public void a(cuk $$0, cuq.f $$1) {
      csp $$2 = this.f();
      int $$3 = is.a($$2.d());
      int $$4 = is.a($$2.e());
      ctk $$5 = this.z();

      for (int $$6 = $$5.an(); $$6 < $$5.ao(); $$6++) {
         dli $$7 = this.b(this.f($$6));
         int $$8 = is.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dnx x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public ctk z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public edu B() {
      return this.i;
   }

   public static record a(ene<cwj> a, ene<eej> b) {
   }
}
