import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsn extends dsd {
   static final Logger n = LogUtils.getLogger();
   private static final dpe o = new dpe() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public in c() {
         return in.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<in, dsn.d> p = Maps.newHashMap();
   private boolean q;
   final dad r;
   @Nullable
   private Supplier<aqa> s;
   @Nullable
   private dsn.c t;
   private final Int2ObjectMap<dvd> u;
   private final evb<dde> v;
   private final evb<elz> w;

   public dsn(dad $$0, czk $$1) {
      this($$0, $$1, dta.a, new evb<>(), new evb<>(), 0L, null, null, null);
   }

   public dsn(dad $$0, czk $$1, dta $$2, evb<dde> $$3, evb<elz> $$4, long $$5, @Nullable dso[] $$6, @Nullable dsn.c $$7, @Nullable dxc $$8) {
      super($$1, $$2, $$0, $$0.H_().d(le.az), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dvz.a $$9 : dvz.a.values()) {
         if (dtc.n.h().contains($$9)) {
            this.h.put($$9, new dvz(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dsn(aqh $$0, dsx $$1, @Nullable dsn.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dnm $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dvz.a, dvz> $$5 : $$1.e()) {
         if (dtc.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public evj<dde> o() {
      return this.v;
   }

   @Override
   public evj<elz> p() {
      return this.w;
   }

   @Override
   public dsd.a q() {
      return new dsd.a(this.v, this.w);
   }

   @Override
   public dvd a(int $$0) {
      return this.r instanceof aqh $$1 ? (dvd)this.u.computeIfAbsent($$0, $$2 -> new duz($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public dqh a_(in $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ah()) {
         dqh $$4 = null;
         if ($$2 == 60) {
            $$4 = ddg.hW.n();
         }

         if ($$2 == 70) {
            $$4 = dvq.a($$1, $$3);
         }

         return $$4 == null ? ddg.a.n() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dso $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return ddg.a.n();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public ema b_(in $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public ema a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dso $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return emb.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public dqh a(in $$0, dqh $$1, boolean $$2) {
      int $$3 = $$0.v();
      dso $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dqh $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dde $$10 = $$1.b();
            this.h.get(dvz.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dvz.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dvz.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dvz.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.M().p().a($$0, $$11);
            }

            if (elr.a(this, $$0, $$9, $$1)) {
               bma $$12 = this.r.af();
               $$12.a("updateSkyLightSources");
               this.i.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.r.M().p().a($$0);
               $$12.c();
            }

            boolean $$13 = $$9.t();
            if (!this.r.B) {
               $$9.b(this.r, $$0, $$1, $$2);
            } else if (!$$9.a($$10) && $$13) {
               this.d($$0);
            }

            if (!$$4.a($$6, $$7, $$8).a($$10)) {
               return null;
            } else {
               if (!this.r.B) {
                  $$1.a(this.r, $$0, $$9, $$2);
               }

               if ($$1.t()) {
                  dnm $$14 = this.a($$0, dsn.b.c);
                  if ($$14 == null) {
                     $$14 = ((dfw)$$10).a($$0, $$1);
                     if ($$14 != null) {
                        this.b($$14);
                     }
                  } else {
                     $$14.b($$1);
                     this.c($$14);
                  }
               }

               this.c = true;
               return $$9;
            }
         }
      }
   }

   @Deprecated
   @Override
   public void a(brh $$0) {
   }

   @Nullable
   private dnm g(in $$0) {
      dqh $$1 = this.a_($$0);
      return !$$1.t() ? null : ((dfw)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dnm c_(in $$0) {
      return this.a($$0, dsn.b.c);
   }

   @Nullable
   public dnm a(in $$0, dsn.b $$1) {
      dnm $$2 = this.k.get($$0);
      if ($$2 == null) {
         ua $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dnm $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dsn.b.a) {
            $$2 = this.g($$0);
            if ($$2 != null) {
               this.b($$2);
            }
         }
      } else if ($$2.o()) {
         this.k.remove($$0);
         return null;
      }

      return $$2;
   }

   public void b(dnm $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof aqh $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean K() {
      return this.q || this.r.x_();
   }

   boolean h(in $$0) {
      if (!this.r.C_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof aqh $$1) ? true : this.D().a(aqa.c) && $$1.c(czk.a($$0));
      }
   }

   @Override
   public void a(dnm $$0) {
      in $$1 = $$0.az_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.p();
         dnm $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.aw_();
         }
      }
   }

   @Nullable
   @Override
   public ua a(in $$0, iy.a $$1) {
      dnm $$2 = this.c_($$0);
      if ($$2 != null && !$$2.o()) {
         ua $$3 = $$2.b(this.r.H_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         ua $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.h();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(in $$0) {
      if (this.K()) {
         dnm $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof aqh $$2) {
               this.a($$1, $$2);
            }

            $$1.aw_();
         }
      }

      this.k($$0);
   }

   private <T extends dnm> void a(T $$0, aqh $$1) {
      dde $$2 = $$0.n().b();
      if ($$2 instanceof dfw) {
         dvc $$3 = ((dfw)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = jp.a($$0.az_().v());
            dvd $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void k(in $$0) {
      dsn.d $$1 = this.p.remove($$0);
      if ($$1 != null) {
         $$1.a(o);
      }
   }

   public void E() {
      if (this.t != null) {
         this.t.run(this);
         this.t = null;
      }
   }

   public boolean C() {
      return false;
   }

   public void a(vu $$0, ua $$1, Consumer<acx.b> $$2) {
      this.I();

      for (dso $$3 : this.m) {
         $$3.a($$0);
      }

      for (dvz.a $$4 : dvz.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dnm $$3 = this.a($$0x, dsn.b.a);
         if ($$3 != null && $$2x != null && $$3.r() == $$1x) {
            $$3.a($$2x, this.r.H_());
         }
      });
   }

   public void a(vu $$0) {
      for (dso $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public dad F() {
      return this.r;
   }

   public Map<in, dnm> G() {
      return this.k;
   }

   public void H() {
      czk $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               in $$3 = dsx.a($$2, this.g($$1), $$0);
               dqh $$4 = this.a_($$3);
               ema $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof dhu)) {
                  dqh $$6 = dde.b($$4, this.r, $$3);
                  this.r.a($$3, $$6, 20);
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         in $$7 = (in)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private dnm a(in $$0, ua $$1) {
      dqh $$2 = this.a_($$0);
      dnm $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((dfw)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dnm.a($$0, $$2, $$1, this.r.H_());
      }

      if ($$3 != null) {
         $$3.a(this.r);
         this.b($$3);
      } else {
         n.warn("Tried to load a block entity for block {} but failed at location {}", $$2, $$0);
      }

      return $$3;
   }

   public void c(long $$0) {
      this.v.a($$0);
      this.w.a($$0);
   }

   public void a(aqh $$0) {
      $$0.m().a(this.d, this.v);
      $$0.n().a(this.d, this.w);
   }

   public void b(aqh $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public dtc j() {
      return dtc.n;
   }

   public aqa D() {
      return this.s == null ? aqa.b : this.s.get();
   }

   public void b(Supplier<aqa> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dnm::aw_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof aqh $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dnm> void b(T $$0, aqh $$1) {
      dde $$2 = $$0.n().b();
      if ($$2 instanceof dfw) {
         dvc $$3 = ((dfw)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(jp.a($$0.az_().v())).a($$3);
         }
      }
   }

   private <T extends dnm> void c(T $$0) {
      dqh $$1 = $$0.n();
      dnn<T> $$2 = $$1.a(this.r, (dno<T>)$$0.r());
      if ($$2 == null) {
         this.k($$0.az_());
      } else {
         this.p.compute($$0.az_(), ($$2x, $$3) -> {
            dpe $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dsn.d)$$3;
            } else if (this.K()) {
               dsn.d $$5 = new dsn.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dnm> dpe a(T $$0, dnn<T> $$1) {
      return new dsn.a<>($$0, $$1);
   }

   class a<T extends dnm> implements dpe {
      private final T b;
      private final dnn<T> c;
      private boolean d;

      a(T $$0, dnn<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.o() && this.b.m()) {
            in $$0 = this.b.az_();
            if (dsn.this.h($$0)) {
               try {
                  bma $$1 = dsn.this.r.af();
                  $$1.a(this::d);
                  dqh $$2 = dsn.this.a_($$0);
                  if (this.b.r().a($$2)) {
                     this.c.tick(dsn.this.r, this.b.az_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dsn.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
                  }

                  $$1.c();
               } catch (Throwable var5) {
                  o $$4 = o.a(var5, "Ticking block entity");
                  p $$5 = $$4.a("Block entity being ticked");
                  this.b.a($$5);
                  throw new y($$4);
               }
            }
         }
      }

      @Override
      public boolean b() {
         return this.b.o();
      }

      @Override
      public in c() {
         return this.b.az_();
      }

      @Override
      public String d() {
         return dno.a(this.b.r()).toString();
      }

      @Override
      public String toString() {
         return "Level ticker for " + this.d() + "@" + this.c();
      }
   }

   public static enum b {
      a,
      b,
      c;
   }

   @FunctionalInterface
   public interface c {
      void run(dsn var1);
   }

   class d implements dpe {
      private dpe b;

      d(dpe $$0) {
         this.b = $$0;
      }

      void a(dpe $$0) {
         this.b = $$0;
      }

      @Override
      public void a() {
         this.b.a();
      }

      @Override
      public boolean b() {
         return this.b.b();
      }

      @Override
      public in c() {
         return this.b.c();
      }

      @Override
      public String d() {
         return this.b.d();
      }

      @Override
      public String toString() {
         return this.b + " <wrapped>";
      }
   }
}
