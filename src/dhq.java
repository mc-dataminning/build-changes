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

public class dhq extends dhf {
   static final Logger n = LogUtils.getLogger();
   private static final del o = new del() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public gw c() {
         return gw.b;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<gw, dhq.d> p = Maps.newHashMap();
   private boolean q;
   final cpv r;
   @Nullable
   private Supplier<akj> s;
   @Nullable
   private dhq.c t;
   private final Int2ObjectMap<djw> u;
   private final eiu<csv> v;
   private final eiu<eal> w;

   public dhq(cpv $$0, cpc $$1) {
      this($$0, $$1, did.a, new eiu<>(), new eiu<>(), 0L, null, null, null);
   }

   public dhq(cpv $$0, cpc $$1, did $$2, eiu<csv> $$3, eiu<eal> $$4, long $$5, @Nullable dhr[] $$6, @Nullable dhq.c $$7, @Nullable dlv $$8) {
      super($$1, $$2, $$0, $$0.G_().d(jc.ap), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dks.a $$9 : dks.a.values()) {
         if (dhk.n.h().contains($$9)) {
            this.h.put($$9, new dks(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dhq(akq $$0, dia $$1, @Nullable dhq.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dcv $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dks.a, dks> $$5 : $$1.e()) {
         if (dhk.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public ejc<csv> o() {
      return this.v;
   }

   @Override
   public ejc<eal> p() {
      return this.w;
   }

   @Override
   public dhf.a q() {
      return new dhf.a(this.v, this.w);
   }

   @Override
   public djw a(int $$0) {
      return this.r instanceof akq $$1 ? (djw)this.u.computeIfAbsent($$0, $$2 -> new djs($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public dfj a_(gw $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.af()) {
         dfj $$4 = null;
         if ($$2 == 60) {
            $$4 = csw.hW.n();
         }

         if ($$2 == 70) {
            $$4 = dkj.a($$1, $$3);
         }

         return $$4 == null ? csw.a.n() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dhr $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return csw.a.n();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public eam b_(gw $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public eam a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dhr $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return ean.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public dfj a(gw $$0, dfj $$1, boolean $$2) {
      int $$3 = $$0.v();
      dhr $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dfj $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            csv $$10 = $$1.b();
            this.h.get(dks.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dks.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dks.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dks.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.J().p().a($$0, $$11);
            }

            if (ead.a(this, $$0, $$9, $$1)) {
               bdp $$12 = this.r.ad();
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
                  dcv $$14 = this.a($$0, dhq.b.c);
                  if ($$14 == null) {
                     $$14 = ((cvj)$$10).a($$0, $$1);
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
   public void a(biq $$0) {
   }

   @Nullable
   private dcv j(gw $$0) {
      dfj $$1 = this.a_($$0);
      return !$$1.t() ? null : ((cvj)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dcv c_(gw $$0) {
      return this.a($$0, dhq.b.c);
   }

   @Nullable
   public dcv a(gw $$0, dhq.b $$1) {
      dcv $$2 = this.k.get($$0);
      if ($$2 == null) {
         qw $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dcv $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dhq.b.a) {
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

   public void b(dcv $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof akq $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean K() {
      return this.q || this.r.w_();
   }

   boolean k(gw $$0) {
      if (!this.r.B_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof akq $$1) ? true : this.D().a(akj.c) && $$1.c(cpc.a($$0));
      }
   }

   @Override
   public void a(dcv $$0) {
      gw $$1 = $$0.p();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.s();
         dcv $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.at_();
         }
      }
   }

   @Nullable
   @Override
   public qw g(gw $$0) {
      dcv $$1 = this.c_($$0);
      if ($$1 != null && !$$1.r()) {
         qw $$2 = $$1.m();
         $$2.a("keepPacked", false);
         return $$2;
      } else {
         qw $$3 = this.j.get($$0);
         if ($$3 != null) {
            $$3 = $$3.h();
            $$3.a("keepPacked", true);
         }

         return $$3;
      }
   }

   @Override
   public void d(gw $$0) {
      if (this.K()) {
         dcv $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof akq $$2) {
               this.a($$1, $$2);
            }

            $$1.at_();
         }
      }

      this.l($$0);
   }

   private <T extends dcv> void a(T $$0, akq $$1) {
      csv $$2 = $$0.q().b();
      if ($$2 instanceof cvj) {
         djv $$3 = ((cvj)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = hw.a($$0.p().v());
            djw $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void l(gw $$0) {
      dhq.d $$1 = this.p.remove($$0);
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

   public void a(so $$0, qw $$1, Consumer<yf.b> $$2) {
      this.I();

      for (dhr $$3 : this.m) {
         $$3.a($$0);
      }

      for (dks.a $$4 : dks.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dcv $$3 = this.a($$0x, dhq.b.a);
         if ($$3 != null && $$2x != null && $$3.u() == $$1x) {
            $$3.a($$2x);
         }
      });
   }

   public void a(so $$0) {
      for (dhr $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public cpv F() {
      return this.r;
   }

   public Map<gw, dcv> G() {
      return this.k;
   }

   public void H() {
      cpc $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               gw $$3 = dia.a($$2, this.g($$1), $$0);
               dfj $$4 = this.a_($$3);
               eam $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof cxi)) {
                  dfj $$6 = csv.b($$4, this.r, $$3);
                  this.r.a($$3, $$6, 20);
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         gw $$7 = (gw)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private dcv a(gw $$0, qw $$1) {
      dfj $$2 = this.a_($$0);
      dcv $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((cvj)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dcv.a($$0, $$2, $$1);
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

   public void a(akq $$0) {
      $$0.l().a(this.d, this.v);
      $$0.m().a(this.d, this.w);
   }

   public void b(akq $$0) {
      $$0.l().a(this.d);
      $$0.m().a(this.d);
   }

   @Override
   public dhk j() {
      return dhk.n;
   }

   public akj D() {
      return this.s == null ? akj.b : this.s.get();
   }

   public void b(Supplier<akj> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dcv::at_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof akq $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dcv> void b(T $$0, akq $$1) {
      csv $$2 = $$0.q().b();
      if ($$2 instanceof cvj) {
         djv $$3 = ((cvj)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(hw.a($$0.p().v())).a($$3);
         }
      }
   }

   private <T extends dcv> void c(T $$0) {
      dfj $$1 = $$0.q();
      dcw<T> $$2 = $$1.a(this.r, (dcx<T>)$$0.u());
      if ($$2 == null) {
         this.l($$0.p());
      } else {
         this.p.compute($$0.p(), ($$2x, $$3) -> {
            del $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dhq.d)$$3;
            } else if (this.K()) {
               dhq.d $$5 = new dhq.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dcv> del a(T $$0, dcw<T> $$1) {
      return new dhq.a<>($$0, $$1);
   }

   class a<T extends dcv> implements del {
      private final T b;
      private final dcw<T> c;
      private boolean d;

      a(T $$0, dcw<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.r() && this.b.l()) {
            gw $$0 = this.b.p();
            if (dhq.this.k($$0)) {
               try {
                  bdp $$1 = dhq.this.r.ad();
                  $$1.a(this::d);
                  dfj $$2 = dhq.this.a_($$0);
                  if (this.b.u().a($$2)) {
                     this.c.tick(dhq.this.r, this.b.p(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dhq.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
      public gw c() {
         return this.b.p();
      }

      @Override
      public String d() {
         return dcx.a(this.b.u()).toString();
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
      void run(dhq var1);
   }

   class d implements del {
      private del b;

      d(del $$0) {
         this.b = $$0;
      }

      void a(del $$0) {
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
      public gw c() {
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
