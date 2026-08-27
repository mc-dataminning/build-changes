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

public abstract class dru implements cza, dav.a, dsg, dsq {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final czb d;
   private long q;
   @Nullable
   @Deprecated
   private dau r;
   @Nullable
   protected dvu e;
   protected final dsr f;
   @Nullable
   protected dwt g;
   protected final Map<dvq.a, dvq> h = Maps.newEnumMap(dvq.a.class);
   protected elb i;
   private final Map<egg, ego> s = Maps.newHashMap();
   private final Map<egg, LongSet> t = Maps.newHashMap();
   protected final Map<im, ty> j = Maps.newHashMap();
   protected final Map<im, dnd> k = new Object2ObjectOpenHashMap();
   protected final czw l;
   protected final dsf[] m;

   public dru(czb $$0, dsr $$1, czw $$2, ji<dat> $$3, long $$4, @Nullable dsf[] $$5, @Nullable dwt $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dsf[$$2.am()];
      this.q = $$4;
      this.b = new ShortList[$$2.am()];
      this.g = $$6;
      this.i = new elb($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(ji<dat> $$0, dsf[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dsf($$0);
         }
      }
   }

   public duu a(int $$0) {
      return duu.a;
   }

   @Nullable
   public abstract dpy a(im var1, dpy var2, boolean var3);

   public abstract void a(dnd var1);

   public abstract void a(bql var1);

   public int a() {
      dsf[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dsf $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.I_() : jo.c(this.g($$0));
   }

   public Set<im> c() {
      Set<im> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public dsf[] d() {
      return this.m;
   }

   public dsf b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dvq.a, dvq>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(dvq.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dvq a(dvq.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new dvq(this, $$0x));
   }

   public boolean b(dvq.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(dvq.a $$0, int $$1, int $$2) {
      dvq $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (aa.aX && this instanceof dse) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dvq.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public czb f() {
      return this.d;
   }

   @Nullable
   @Override
   public ego a(egg $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(egg $$0, ego $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<egg, ego> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<egg, ego> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(egg $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(egg $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<egg, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<egg, LongSet> $$0) {
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

   public abstract dst j();

   public dst k() {
      dst $$0 = this.j();
      dve $$1 = this.x();
      if ($$1 != null) {
         dst $$2 = $$1.a();
         return $$2.b($$0) ? $$2 : $$0;
      } else {
         return $$0;
      }
   }

   public abstract void d(im var1);

   public void e(im $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] n() {
      return this.b;
   }

   public void a(short $$0, int $$1) {
      a(this.n(), $$1).add($$0);
   }

   public void a(ty $$0) {
      this.j.put(dnd.b($$0), $$0);
   }

   @Nullable
   public ty f(im $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract ty a(im var1, ix.a var2);

   @Override
   public final void a(BiConsumer<im, dpy> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<dpy> $$0, BiConsumer<im, dpy> $$1) {
      im.a $$2 = new im.a();

      for (int $$3 = this.an(); $$3 < this.ao(); $$3++) {
         dsf $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            im $$5 = jo.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dpy $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract euz<dcv> o();

   public abstract euz<elq> p();

   public abstract dru.a q();

   public dsr r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public dwt t() {
      return this.g;
   }

   public void a(dwt $$0) {
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

   public dvu a(Function<dru, dvu> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public dau a(Supplier<dau> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public iv<dat> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = jg.a(this.I_());
         int $$4 = $$3 + jg.a(this.J_()) - 1;
         int $$5 = axw.a($$1, $$3, $$4);
         int $$6 = this.e(jg.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$8);
      }
   }

   public void a(daw $$0, dbc.f $$1) {
      czb $$2 = this.f();
      int $$3 = jg.a($$2.d());
      int $$4 = jg.a($$2.e());
      czw $$5 = this.z();

      for (int $$6 = $$5.an(); $$6 < $$5.ao(); $$6++) {
         dsf $$7 = this.b(this.f($$6));
         int $$8 = jg.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dve x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public czw z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public elb B() {
      return this.i;
   }

   public static record a(eux<dcv> a, eux<elq> b) {
   }
}
