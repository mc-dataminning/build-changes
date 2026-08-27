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

public class dhk extends dgz {
   static final Logger n = LogUtils.getLogger();
   private static final dep o = new dep() {
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
   private final Map<gw, dhk.d> p = Maps.newHashMap();
   private boolean q;
   final cqb r;
   @Nullable
   private Supplier<akm> s;
   @Nullable
   private dhk.c t;
   private final Int2ObjectMap<djq> u;
   private final eio<ctc> v;
   private final eio<eaf> w;

   public dhk(cqb $$0, cpi $$1) {
      this($$0, $$1, dhx.a, new eio<>(), new eio<>(), 0L, null, null, null);
   }

   public dhk(cqb $$0, cpi $$1, dhx $$2, eio<ctc> $$3, eio<eaf> $$4, long $$5, @Nullable dhl[] $$6, @Nullable dhk.c $$7, @Nullable dlp $$8) {
      super($$1, $$2, $$0, $$0.G_().d(jc.aq), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dkm.a $$9 : dkm.a.values()) {
         if (dhe.n.h().contains($$9)) {
            this.h.put($$9, new dkm(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dhk(akt $$0, dhu $$1, @Nullable dhk.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dcz $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dkm.a, dkm> $$5 : $$1.e()) {
         if (dhe.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public eiw<ctc> o() {
      return this.v;
   }

   @Override
   public eiw<eaf> p() {
      return this.w;
   }

   @Override
   public dgz.a q() {
      return new dgz.a(this.v, this.w);
   }

   @Override
   public djq a(int $$0) {
      return this.r instanceof akt $$1 ? (djq)this.u.computeIfAbsent($$0, $$2 -> new djm($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public dfd a_(gw $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.af()) {
         dfd $$4 = null;
         if ($$2 == 60) {
            $$4 = cte.hW.o();
         }

         if ($$2 == 70) {
            $$4 = dkd.a($$1, $$3);
         }

         return $$4 == null ? cte.a.o() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dhl $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return cte.a.o();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public eag b_(gw $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public eag a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dhl $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return eah.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public dfd a(gw $$0, dfd $$1, boolean $$2) {
      int $$3 = $$0.v();
      dhl $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dfd $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            ctc $$10 = $$1.b();
            this.h.get(dkm.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dkm.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dkm.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dkm.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.J().p().a($$0, $$11);
            }

            if (dzx.a(this, $$0, $$9, $$1)) {
               bdv $$12 = this.r.ad();
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
                  dcz $$14 = this.a($$0, dhk.b.c);
                  if ($$14 == null) {
                     $$14 = ((cvs)$$10).a($$0, $$1);
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
   public void a(biw $$0) {
   }

   @Nullable
   private dcz j(gw $$0) {
      dfd $$1 = this.a_($$0);
      return !$$1.t() ? null : ((cvs)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dcz c_(gw $$0) {
      return this.a($$0, dhk.b.c);
   }

   @Nullable
   public dcz a(gw $$0, dhk.b $$1) {
      dcz $$2 = this.k.get($$0);
      if ($$2 == null) {
         qw $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dcz $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dhk.b.a) {
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

   public void b(dcz $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof akt $$1) {
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
         return !(this.r instanceof akt $$1) ? true : this.D().a(akm.c) && $$1.c(cpi.a($$0));
      }
   }

   @Override
   public void a(dcz $$0) {
      gw $$1 = $$0.p();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.s();
         dcz $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.at_();
         }
      }
   }

   @Nullable
   @Override
   public qw g(gw $$0) {
      dcz $$1 = this.c_($$0);
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
         dcz $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof akt $$2) {
               this.a($$1, $$2);
            }

            $$1.at_();
         }
      }

      this.l($$0);
   }

   private <T extends dcz> void a(T $$0, akt $$1) {
      ctc $$2 = $$0.q().b();
      if ($$2 instanceof cvs) {
         djp $$3 = ((cvs)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = hw.a($$0.p().v());
            djq $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void l(gw $$0) {
      dhk.d $$1 = this.p.remove($$0);
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

   public void a(so $$0, qw $$1, Consumer<yg.b> $$2) {
      this.I();

      for (dhl $$3 : this.m) {
         $$3.a($$0);
      }

      for (dkm.a $$4 : dkm.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dcz $$3 = this.a($$0x, dhk.b.a);
         if ($$3 != null && $$2x != null && $$3.u() == $$1x) {
            $$3.a($$2x);
         }
      });
   }

   public void a(so $$0) {
      for (dhl $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public cqb F() {
      return this.r;
   }

   public Map<gw, dcz> G() {
      return this.k;
   }

   public void H() {
      cpi $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               gw $$3 = dhu.a($$2, this.g($$1), $$0);
               dfd $$4 = this.a_($$3);
               eag $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof cxq)) {
                  dfd $$6 = ctc.b($$4, this.r, $$3);
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
   private dcz a(gw $$0, qw $$1) {
      dfd $$2 = this.a_($$0);
      dcz $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((cvs)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dcz.a($$0, $$2, $$1);
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

   public void a(akt $$0) {
      $$0.l().a(this.d, this.v);
      $$0.m().a(this.d, this.w);
   }

   public void b(akt $$0) {
      $$0.l().a(this.d);
      $$0.m().a(this.d);
   }

   @Override
   public dhe j() {
      return dhe.n;
   }

   public akm D() {
      return this.s == null ? akm.b : this.s.get();
   }

   public void b(Supplier<akm> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dcz::at_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof akt $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dcz> void b(T $$0, akt $$1) {
      ctc $$2 = $$0.q().b();
      if ($$2 instanceof cvs) {
         djp $$3 = ((cvs)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(hw.a($$0.p().v())).a($$3);
         }
      }
   }

   private <T extends dcz> void c(T $$0) {
      dfd $$1 = $$0.q();
      dda<T> $$2 = $$1.a(this.r, (ddb<T>)$$0.u());
      if ($$2 == null) {
         this.l($$0.p());
      } else {
         this.p.compute($$0.p(), ($$2x, $$3) -> {
            dep $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dhk.d)$$3;
            } else if (this.K()) {
               dhk.d $$5 = new dhk.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dcz> dep a(T $$0, dda<T> $$1) {
      return new dhk.a<>($$0, $$1);
   }

   class a<T extends dcz> implements dep {
      private final T b;
      private final dda<T> c;
      private boolean d;

      a(T $$0, dda<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.r() && this.b.l()) {
            gw $$0 = this.b.p();
            if (dhk.this.k($$0)) {
               try {
                  bdv $$1 = dhk.this.r.ad();
                  $$1.a(this::d);
                  dfd $$2 = dhk.this.a_($$0);
                  if (this.b.u().a($$2)) {
                     this.c.tick(dhk.this.r, this.b.p(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dhk.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return ddb.a(this.b.u()).toString();
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
      void run(dhk var1);
   }

   class d implements dep {
      private dep b;

      d(dep $$0) {
         this.b = $$0;
      }

      void a(dep $$0) {
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
