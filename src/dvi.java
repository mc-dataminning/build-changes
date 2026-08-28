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

public class dvi extends duy {
   static final Logger n = LogUtils.getLogger();
   private static final dsa o = new dsa() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public jd c() {
         return jd.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<jd, dvi.d> p = Maps.newHashMap();
   private boolean q;
   final dcw r;
   @Nullable
   private Supplier<aql> s;
   @Nullable
   private dvi.c t;
   private final Int2ObjectMap<dyc> u;
   private final eyo<dfy> v;
   private final eyo<epd> w;

   public dvi(dcw $$0, dcd $$1) {
      this($$0, $$1, dvv.a, new eyo<>(), new eyo<>(), 0L, null, null, null);
   }

   public dvi(dcw $$0, dcd $$1, dvv $$2, eyo<dfy> $$3, eyo<epd> $$4, long $$5, @Nullable dvj[] $$6, @Nullable dvi.c $$7, @Nullable eab $$8) {
      super($$1, $$2, $$0, $$0.H_().d(lu.aF), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dyy.a $$9 : dyy.a.values()) {
         if (dvz.n.e().contains($$9)) {
            this.h.put($$9, new dyy(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dvi(aqu $$0, dvs $$1, @Nullable dvi.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dqh $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dyy.a, dyy> $$5 : $$1.e()) {
         if (dvz.n.e().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public eyw<dfy> o() {
      return this.v;
   }

   @Override
   public eyw<epd> p() {
      return this.w;
   }

   @Override
   public duy.a q() {
      return new duy.a(this.v, this.w);
   }

   @Override
   public dyc a(int $$0) {
      return this.r instanceof aqu $$1 ? (dyc)this.u.computeIfAbsent($$0, $$2 -> new dxy($$1, $$0, this::h)) : super.a($$0);
   }

   @Override
   public dtc a_(jd $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ai()) {
         dtc $$4 = null;
         if ($$2 == 60) {
            $$4 = dga.hW.o();
         }

         if ($$2 == 70) {
            $$4 = dyp.a($$1, $$3);
         }

         return $$4 == null ? dga.a.o() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dvj $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dga.a.o();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }

   @Override
   public epe b_(jd $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public epe a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dvj $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return epf.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$6);
      }
   }

   @Nullable
   @Override
   public dtc a(jd $$0, dtc $$1, boolean $$2) {
      int $$3 = $$0.v();
      dvj $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dtc $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dfy $$10 = $$1.b();
            this.h.get(dyy.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dyy.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dyy.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dyy.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.N().p().a($$0, $$11);
            }

            if (eov.a(this, $$0, $$9, $$1)) {
               bnf $$12 = this.r.ag();
               $$12.a("updateSkyLightSources");
               this.i.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.r.N().p().a($$0);
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
                  dqh $$14 = this.a($$0, dvi.b.c);
                  if ($$14 == null) {
                     $$14 = ((diq)$$10).a($$0, $$1);
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
   public void a(bsr $$0) {
   }

   @Nullable
   private dqh g(jd $$0) {
      dtc $$1 = this.a_($$0);
      return !$$1.t() ? null : ((diq)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dqh c_(jd $$0) {
      return this.a($$0, dvi.b.c);
   }

   @Nullable
   public dqh a(jd $$0, dvi.b $$1) {
      dqh $$2 = this.k.get($$0);
      if ($$2 == null) {
         ub $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dqh $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dvi.b.a) {
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

   public void b(dqh $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof aqu $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean K() {
      return this.q || this.r.x_();
   }

   boolean h(jd $$0) {
      if (!this.r.C_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof aqu $$1) ? true : this.D().a(aql.c) && $$1.c(dcd.a($$0));
      }
   }

   @Override
   public void a(dqh $$0) {
      jd $$1 = $$0.aD_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.p();
         dqh $$2 = this.k.put($$1.j(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.aA_();
         }
      }
   }

   @Nullable
   @Override
   public ub a(jd $$0, jo.a $$1) {
      dqh $$2 = this.c_($$0);
      if ($$2 != null && !$$2.o()) {
         ub $$3 = $$2.b(this.r.H_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         ub $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.i();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(jd $$0) {
      if (this.K()) {
         dqh $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof aqu $$2) {
               this.a($$1, $$2);
            }

            $$1.aA_();
         }
      }

      this.k($$0);
   }

   private <T extends dqh> void a(T $$0, aqu $$1) {
      dfy $$2 = $$0.n().b();
      if ($$2 instanceof diq) {
         dyb $$3 = ((diq)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = kf.a($$0.aD_().v());
            dyc $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void h(int $$0) {
      this.u.remove($$0);
   }

   private void k(jd $$0) {
      dvi.d $$1 = this.p.remove($$0);
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

   public void a(vw $$0, ub $$1, Consumer<adf.b> $$2) {
      this.I();

      for (dvj $$3 : this.m) {
         $$3.a($$0);
      }

      for (dyy.a $$4 : dyy.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dqh $$3 = this.a($$0x, dvi.b.a);
         if ($$3 != null && $$2x != null && $$3.r() == $$1x) {
            $$3.c($$2x, this.r.H_());
         }
      });
   }

   public void a(vw $$0) {
      for (dvj $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public dcw F() {
      return this.r;
   }

   public Map<jd, dqh> G() {
      return this.k;
   }

   public void H() {
      dcd $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               jd $$3 = dvs.a($$2, this.g($$1), $$0);
               dtc $$4 = this.a_($$3);
               epe $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof dko)) {
                  dtc $$6 = dfy.b($$4, this.r, $$3);
                  this.r.a($$3, $$6, 20);
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         jd $$7 = (jd)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private dqh a(jd $$0, ub $$1) {
      dtc $$2 = this.a_($$0);
      dqh $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((diq)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dqh.a($$0, $$2, $$1, this.r.H_());
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

   public void a(aqu $$0) {
      $$0.m().a(this.d, this.v);
      $$0.n().a(this.d, this.w);
   }

   public void b(aqu $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public dvz j() {
      return dvz.n;
   }

   public aql D() {
      return this.s == null ? aql.b : this.s.get();
   }

   public void b(Supplier<aql> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dqh::aA_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof aqu $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dqh> void b(T $$0, aqu $$1) {
      dfy $$2 = $$0.n().b();
      if ($$2 instanceof diq) {
         dyb $$3 = ((diq)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(kf.a($$0.aD_().v())).a($$3);
         }
      }
   }

   private <T extends dqh> void c(T $$0) {
      dtc $$1 = $$0.n();
      dqi<T> $$2 = $$1.a(this.r, (dqj<T>)$$0.r());
      if ($$2 == null) {
         this.k($$0.aD_());
      } else {
         this.p.compute($$0.aD_(), ($$2x, $$3) -> {
            dsa $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dvi.d)$$3;
            } else if (this.K()) {
               dvi.d $$5 = new dvi.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dqh> dsa a(T $$0, dqi<T> $$1) {
      return new dvi.a<>($$0, $$1);
   }

   class a<T extends dqh> implements dsa {
      private final T b;
      private final dqi<T> c;
      private boolean d;

      a(final T $$0, final dqi<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.o() && this.b.m()) {
            jd $$0 = this.b.aD_();
            if (dvi.this.h($$0)) {
               try {
                  bnf $$1 = dvi.this.r.ag();
                  $$1.a(this::d);
                  dtc $$2 = dvi.this.a_($$0);
                  if (this.b.r().a($$2)) {
                     this.c.tick(dvi.this.r, this.b.aD_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dvi.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
                  }

                  $$1.c();
               } catch (Throwable var5) {
                  o $$4 = o.a(var5, "Ticking block entity");
                  p $$5 = $$4.a("Block entity being ticked");
                  this.b.a($$5);
                  throw new z($$4);
               }
            }
         }
      }

      @Override
      public boolean b() {
         return this.b.o();
      }

      @Override
      public jd c() {
         return this.b.aD_();
      }

      @Override
      public String d() {
         return dqj.a(this.b.r()).toString();
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
      void run(dvi var1);
   }

   class d implements dsa {
      private dsa a;

      d(final dsa $$0) {
         this.a = $$0;
      }

      void a(dsa $$0) {
         this.a = $$0;
      }

      @Override
      public void a() {
         this.a.a();
      }

      @Override
      public boolean b() {
         return this.a.b();
      }

      @Override
      public jd c() {
         return this.a.c();
      }

      @Override
      public String d() {
         return this.a.d();
      }

      @Override
      public String toString() {
         return this.a + " <wrapped>";
      }
   }
}
