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

public class dhf extends dgu {
   static final Logger n = LogUtils.getLogger();
   private static final dea o = new dea() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public gv c() {
         return gv.b;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<gv, dhf.d> p = Maps.newHashMap();
   private boolean q;
   final cpk r;
   @Nullable
   private Supplier<akb> s;
   @Nullable
   private dhf.c t;
   private final Int2ObjectMap<djl> u;
   private final eim<csk> v;
   private final eim<eaa> w;

   public dhf(cpk $$0, cor $$1) {
      this($$0, $$1, dhs.a, new eim<>(), new eim<>(), 0L, null, null, null);
   }

   public dhf(cpk $$0, cor $$1, dhs $$2, eim<csk> $$3, eim<eaa> $$4, long $$5, @Nullable dhg[] $$6, @Nullable dhf.c $$7, @Nullable dlk $$8) {
      super($$1, $$2, $$0, $$0.B_().d(jd.ap), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dkh.a $$9 : dkh.a.values()) {
         if (dgz.n.h().contains($$9)) {
            this.h.put($$9, new dkh(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dhf(aki $$0, dhp $$1, @Nullable dhf.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dck $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dkh.a, dkh> $$5 : $$1.e()) {
         if (dgz.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public eiu<csk> o() {
      return this.v;
   }

   @Override
   public eiu<eaa> p() {
      return this.w;
   }

   @Override
   public dgu.a q() {
      return new dgu.a(this.v, this.w);
   }

   @Override
   public djl a(int $$0) {
      return this.r instanceof aki $$1 ? (djl)this.u.computeIfAbsent($$0, $$2 -> new djh($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public dey a_(gv $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.af()) {
         dey $$4 = null;
         if ($$2 == 60) {
            $$4 = csl.hW.n();
         }

         if ($$2 == 70) {
            $$4 = djy.a($$1, $$3);
         }

         return $$4 == null ? csl.a.n() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dhg $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return csl.a.n();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public eab b_(gv $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public eab a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dhg $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return eac.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public dey a(gv $$0, dey $$1, boolean $$2) {
      int $$3 = $$0.v();
      dhg $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dey $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            csk $$10 = $$1.b();
            this.h.get(dkh.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dkh.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dkh.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dkh.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.J().p().a($$0, $$11);
            }

            if (dzs.a(this, $$0, $$9, $$1)) {
               bde $$12 = this.r.ad();
               $$12.a("updateSkyLightSources");
               this.i.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.r.J().p().a($$0);
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
                  dck $$14 = this.a($$0, dhf.b.c);
                  if ($$14 == null) {
                     $$14 = ((cuy)$$10).a($$0, $$1);
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
   public void a(big $$0) {
   }

   @Nullable
   private dck j(gv $$0) {
      dey $$1 = this.a_($$0);
      return !$$1.t() ? null : ((cuy)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dck c_(gv $$0) {
      return this.a($$0, dhf.b.c);
   }

   @Nullable
   public dck a(gv $$0, dhf.b $$1) {
      dck $$2 = this.k.get($$0);
      if ($$2 == null) {
         qs $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dck $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dhf.b.a) {
            $$2 = this.j($$0);
            if ($$2 != null) {
               this.b($$2);
            }
         }
      } else if ($$2.r()) {
         this.k.remove($$0);
         return null;
      }

      return $$2;
   }

   public void b(dck $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof aki $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean K() {
      return this.q || this.r.r_();
   }

   boolean k(gv $$0) {
      if (!this.r.w_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof aki $$1) ? true : this.D().a(akb.c) && $$1.c(cor.a($$0));
      }
   }

   @Override
   public void a(dck $$0) {
      gv $$1 = $$0.p();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.s();
         dck $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.ap_();
         }
      }
   }

   @Nullable
   @Override
   public qs g(gv $$0) {
      dck $$1 = this.c_($$0);
      if ($$1 != null && !$$1.r()) {
         qs $$2 = $$1.m();
         $$2.a("keepPacked", false);
         return $$2;
      } else {
         qs $$3 = this.j.get($$0);
         if ($$3 != null) {
            $$3 = $$3.h();
            $$3.a("keepPacked", true);
         }

         return $$3;
      }
   }

   @Override
   public void d(gv $$0) {
      if (this.K()) {
         dck $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof aki $$2) {
               this.a($$1, $$2);
            }

            $$1.ap_();
         }
      }

      this.l($$0);
   }

   private <T extends dck> void a(T $$0, aki $$1) {
      csk $$2 = $$0.q().b();
      if ($$2 instanceof cuy) {
         djk $$3 = ((cuy)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = hy.a($$0.p().v());
            djl $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void l(gv $$0) {
      dhf.d $$1 = this.p.remove($$0);
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

   public void a(sh $$0, qs $$1, Consumer<xy.b> $$2) {
      this.I();

      for (dhg $$3 : this.m) {
         $$3.a($$0);
      }

      for (dkh.a $$4 : dkh.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dck $$3 = this.a($$0x, dhf.b.a);
         if ($$3 != null && $$2x != null && $$3.u() == $$1x) {
            $$3.a($$2x);
         }
      });
   }

   public void a(sh $$0) {
      for (dhg $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public cpk F() {
      return this.r;
   }

   public Map<gv, dck> G() {
      return this.k;
   }

   public void H() {
      cor $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               gv $$3 = dhp.a($$2, this.g($$1), $$0);
               dey $$4 = this.a_($$3);
               eab $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof cwx)) {
                  dey $$6 = csk.b($$4, this.r, $$3);
                  this.r.a($$3, $$6, 20);
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         gv $$7 = (gv)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private dck a(gv $$0, qs $$1) {
      dey $$2 = this.a_($$0);
      dck $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((cuy)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dck.a($$0, $$2, $$1);
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

   public void a(aki $$0) {
      $$0.l().a(this.d, this.v);
      $$0.m().a(this.d, this.w);
   }

   public void b(aki $$0) {
      $$0.l().a(this.d);
      $$0.m().a(this.d);
   }

   @Override
   public dgz j() {
      return dgz.n;
   }

   public akb D() {
      return this.s == null ? akb.b : this.s.get();
   }

   public void b(Supplier<akb> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dck::ap_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof aki $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dck> void b(T $$0, aki $$1) {
      csk $$2 = $$0.q().b();
      if ($$2 instanceof cuy) {
         djk $$3 = ((cuy)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(hy.a($$0.p().v())).a($$3);
         }
      }
   }

   private <T extends dck> void c(T $$0) {
      dey $$1 = $$0.q();
      dcl<T> $$2 = $$1.a(this.r, (dcm<T>)$$0.u());
      if ($$2 == null) {
         this.l($$0.p());
      } else {
         this.p.compute($$0.p(), ($$2x, $$3) -> {
            dea $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dhf.d)$$3;
            } else if (this.K()) {
               dhf.d $$5 = new dhf.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dck> dea a(T $$0, dcl<T> $$1) {
      return new dhf.a<>($$0, $$1);
   }

   class a<T extends dck> implements dea {
      private final T b;
      private final dcl<T> c;
      private boolean d;

      a(T $$0, dcl<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.r() && this.b.l()) {
            gv $$0 = this.b.p();
            if (dhf.this.k($$0)) {
               try {
                  bde $$1 = dhf.this.r.ad();
                  $$1.a(this::d);
                  dey $$2 = dhf.this.a_($$0);
                  if (this.b.u().a($$2)) {
                     this.c.tick(dhf.this.r, this.b.p(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dhf.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return this.b.r();
      }

      @Override
      public gv c() {
         return this.b.p();
      }

      @Override
      public String d() {
         return dcm.a(this.b.u()).toString();
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
      void run(dhf var1);
   }

   class d implements dea {
      private dea b;

      d(dea $$0) {
         this.b = $$0;
      }

      void a(dea $$0) {
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
      public gv c() {
         return this.b.c();
      }

      @Override
      public String d() {
         return this.b.d();
      }

      @Override
      public String toString() {
         return this.b.toString() + " <wrapped>";
      }
   }
}
