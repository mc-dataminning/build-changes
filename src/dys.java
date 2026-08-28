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

public abstract class dys implements dhm.a, dze, dzo {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   private volatile boolean p;
   private volatile boolean q;
   protected final dfo c;
   private long r;
   @Nullable
   @Deprecated
   private dhl s;
   @Nullable
   protected ecw d;
   protected final dzp e;
   @Nullable
   protected edv f;
   protected final Map<ecs.a, ecs> h = Maps.newEnumMap(ecs.a.class);
   protected esj i;
   private final Map<enm, enu> t = Maps.newHashMap();
   private final Map<enm, LongSet> u = Maps.newHashMap();
   protected final Map<ji, tq> j = Maps.newHashMap();
   protected final Map<ji, dtz> k = new Object2ObjectOpenHashMap();
   protected final dgk l;
   protected final dzd[] m;

   public dys(dfo $$0, dzp $$1, dgk $$2, ke<dhk> $$3, long $$4, @Nullable dzd[] $$5, @Nullable edv $$6) {
      this.c = $$0;
      this.e = $$1;
      this.l = $$2;
      this.m = new dzd[$$2.ao()];
      this.r = $$4;
      this.b = new ShortList[$$2.ao()];
      this.f = $$6;
      this.i = new esj($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(ke<dhk> $$0, dzd[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dzd($$0);
         }
      }
   }

   public ebw a(int $$0) {
      return ebw.a;
   }

   @Nullable
   public abstract dwx a(ji var1, dwx var2, boolean var3);

   public abstract void a(dtz var1);

   public abstract void a(buk var1);

   public int a() {
      dzd[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dzd $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.L_() : kk.c(this.h($$0));
   }

   public Set<ji> c() {
      Set<ji> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public dzd[] d() {
      return this.m;
   }

   public dzd b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<ecs.a, ecs>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(ecs.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public ecs a(ecs.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new ecs(this, $$0x));
   }

   public boolean b(ecs.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(ecs.a $$0, int $$1, int $$2) {
      ecs $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (ab.aU && this instanceof dzc) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         ecs.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public dfo f() {
      return this.c;
   }

   @Nullable
   @Override
   public enu a(enm $$0) {
      return this.t.get($$0);
   }

   @Override
   public void a(enm $$0, enu $$1) {
      this.t.put($$0, $$1);
      this.i();
   }

   public Map<enm, enu> g() {
      return Collections.unmodifiableMap(this.t);
   }

   public void a(Map<enm, enu> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.i();
   }

   @Override
   public LongSet b(enm $$0) {
      return this.u.getOrDefault($$0, o);
   }

   @Override
   public void a(enm $$0, long $$1) {
      this.u.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.i();
   }

   @Override
   public Map<enm, LongSet> h() {
      return Collections.unmodifiableMap(this.u);
   }

   @Override
   public void b(Map<enm, LongSet> $$0) {
      this.u.clear();
      this.u.putAll($$0);
      this.i();
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.L_()) {
         $$0 = this.L_();
      }

      if ($$1 > this.an()) {
         $$1 = this.an();
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

   public abstract dzt n();

   public dzt o() {
      dzt $$0 = this.n();
      ecg $$1 = this.z();
      if ($$1 != null) {
         dzt $$2 = $$1.a();
         return dzt.a($$2, $$0);
      } else {
         return $$0;
      }
   }

   public abstract void d(ji var1);

   public void e(ji $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] p() {
      return this.b;
   }

   public void a(ShortList $$0, int $$1) {
      a(this.p(), $$1).addAll($$0);
   }

   public void a(tq $$0) {
      this.j.put(dtz.b($$0), $$0);
   }

   @Nullable
   public tq f(ji $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract tq a(ji var1, jt.a var2);

   @Override
   public final void a(BiConsumer<ji, dwx> $$0) {
      this.a($$0x -> $$0x.k() != 0, $$0);
   }

   public void a(Predicate<dwx> $$0, BiConsumer<ji, dwx> $$1) {
      ji.a $$2 = new ji.a();

      for (int $$3 = this.ap(); $$3 <= this.aq(); $$3++) {
         dzd $$4 = this.b(this.g($$3));
         if ($$4.a($$0)) {
            ji $$5 = kk.a(this.c, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dwx $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract fcv<djm> q();

   public abstract fcv<esy> r();

   public boolean s() {
      return true;
   }

   public abstract dys.a a(long var1);

   public dzp t() {
      return this.e;
   }

   public boolean u() {
      return this.f != null;
   }

   @Nullable
   public edv v() {
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
   public int L_() {
      return this.l.L_();
   }

   @Override
   public int M_() {
      return this.l.M_();
   }

   public ecw a(Function<dys, ecw> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this);
      }

      return this.d;
   }

   @Deprecated
   public dhl a(Supplier<dhl> $$0) {
      if (this.s == null) {
         this.s = $$0.get();
      }

      return this.s;
   }

   @Override
   public jr<dhk> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = kc.a(this.L_());
         int $$4 = $$3 + kc.a(this.M_()) - 1;
         int $$5 = ayz.a($$1, $$3, $$4);
         int $$6 = this.f(kc.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$8);
      }
   }

   public void a(dhn $$0, dht.f $$1) {
      dfo $$2 = this.f();
      int $$3 = kc.a($$2.d());
      int $$4 = kc.a($$2.e());
      dgk $$5 = this.B();

      for (int $$6 = $$5.ap(); $$6 <= $$5.aq(); $$6++) {
         dzd $$7 = this.b(this.g($$6));
         int $$8 = kc.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean y() {
      return !this.h().isEmpty();
   }

   @Nullable
   public ecg z() {
      return null;
   }

   public boolean A() {
      return this.z() != null;
   }

   public dgk B() {
      return this;
   }

   public void C() {
      this.i.a(this);
   }

   @Override
   public esj D() {
      return this.i;
   }

   public static record a(List<fcr<djm>> a, List<fcr<esy>> b) {
   }
}
