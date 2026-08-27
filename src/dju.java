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

public class dju extends djj {
   static final Logger n = LogUtils.getLogger();
   private static final dgz o = new dgz() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public hx c() {
         return hx.b;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<hx, dju.d> p = Maps.newHashMap();
   private boolean q;
   final csf r;
   @Nullable
   private Supplier<amb> s;
   @Nullable
   private dju.c t;
   private final Int2ObjectMap<dma> u;
   private final elg<cvf> v;
   private final elg<ecw> w;

   public dju(csf $$0, crm $$1) {
      this($$0, $$1, dkh.a, new elg<>(), new elg<>(), 0L, null, null, null);
   }

   public dju(csf $$0, crm $$1, dkh $$2, elg<cvf> $$3, elg<ecw> $$4, long $$5, @Nullable djv[] $$6, @Nullable dju.c $$7, @Nullable dnz $$8) {
      super($$1, $$2, $$0, $$0.I_().d(kd.ar), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dmw.a $$9 : dmw.a.values()) {
         if (djo.n.h().contains($$9)) {
            this.h.put($$9, new dmw(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dju(ami $$0, dke $$1, @Nullable dju.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dfi $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dmw.a, dmw> $$5 : $$1.e()) {
         if (djo.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public elo<cvf> o() {
      return this.v;
   }

   @Override
   public elo<ecw> p() {
      return this.w;
   }

   @Override
   public djj.a q() {
      return new djj.a(this.v, this.w);
   }

   @Override
   public dma a(int $$0) {
      return this.r instanceof ami $$1 ? (dma)this.u.computeIfAbsent($$0, $$2 -> new dlw($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public dhn a_(hx $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ag()) {
         dhn $$4 = null;
         if ($$2 == 60) {
            $$4 = cvh.hW.o();
         }

         if ($$2 == 70) {
            $$4 = dmn.a($$1, $$3);
         }

         return $$4 == null ? cvh.a.o() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               djv $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return cvh.a.o();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public ecx b_(hx $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public ecx a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            djv $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return ecy.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public dhn a(hx $$0, dhn $$1, boolean $$2) {
      int $$3 = $$0.v();
      djv $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dhn $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            cvf $$10 = $$1.b();
            this.h.get(dmw.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dmw.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dmw.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dmw.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.K().p().a($$0, $$11);
            }

            if (eco.a(this, $$0, $$9, $$1)) {
               bfs $$12 = this.r.ae();
               $$12.a("updateSkyLightSources");
               this.i.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.r.K().p().a($$0);
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
                  dfi $$14 = this.a($$0, dju.b.c);
                  if ($$14 == null) {
                     $$14 = ((cxx)$$10).a($$0, $$1);
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
   public void a(bkv $$0) {
   }

   @Nullable
   private dfi j(hx $$0) {
      dhn $$1 = this.a_($$0);
      return !$$1.t() ? null : ((cxx)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dfi c_(hx $$0) {
      return this.a($$0, dju.b.c);
   }

   @Nullable
   public dfi a(hx $$0, dju.b $$1) {
      dfi $$2 = this.k.get($$0);
      if ($$2 == null) {
         sd $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dfi $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dju.b.a) {
            $$2 = this.j($$0);
            if ($$2 != null) {
               this.b($$2);
            }
         }
      } else if ($$2.s()) {
         this.k.remove($$0);
         return null;
      }

      return $$2;
   }

   public void b(dfi $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof ami $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean K() {
      return this.q || this.r.y_();
   }

   boolean k(hx $$0) {
      if (!this.r.D_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof ami $$1) ? true : this.D().a(amb.c) && $$1.c(crm.a($$0));
      }
   }

   @Override
   public void a(dfi $$0) {
      hx $$1 = $$0.aC_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.t();
         dfi $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.az_();
         }
      }
   }

   @Nullable
   @Override
   public sd g(hx $$0) {
      dfi $$1 = this.c_($$0);
      if ($$1 != null && !$$1.s()) {
         sd $$2 = $$1.o();
         $$2.a("keepPacked", false);
         return $$2;
      } else {
         sd $$3 = this.j.get($$0);
         if ($$3 != null) {
            $$3 = $$3.h();
            $$3.a("keepPacked", true);
         }

         return $$3;
      }
   }

   @Override
   public void d(hx $$0) {
      if (this.K()) {
         dfi $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof ami $$2) {
               this.a($$1, $$2);
            }

            $$1.az_();
         }
      }

      this.l($$0);
   }

   private <T extends dfi> void a(T $$0, ami $$1) {
      cvf $$2 = $$0.r().b();
      if ($$2 instanceof cxx) {
         dlz $$3 = ((cxx)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = iy.a($$0.aC_().v());
            dma $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void l(hx $$0) {
      dju.d $$1 = this.p.remove($$0);
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

   public void a(ty $$0, sd $$1, Consumer<zq.b> $$2) {
      this.I();

      for (djv $$3 : this.m) {
         $$3.a($$0);
      }

      for (dmw.a $$4 : dmw.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dfi $$3 = this.a($$0x, dju.b.a);
         if ($$3 != null && $$2x != null && $$3.v() == $$1x) {
            $$3.a($$2x);
         }
      });
   }

   public void a(ty $$0) {
      for (djv $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public csf F() {
      return this.r;
   }

   public Map<hx, dfi> G() {
      return this.k;
   }

   public void H() {
      crm $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               hx $$3 = dke.a($$2, this.g($$1), $$0);
               dhn $$4 = this.a_($$3);
               ecx $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof czu)) {
                  dhn $$6 = cvf.b($$4, this.r, $$3);
                  this.r.a($$3, $$6, 20);
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         hx $$7 = (hx)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private dfi a(hx $$0, sd $$1) {
      dhn $$2 = this.a_($$0);
      dfi $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((cxx)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dfi.a($$0, $$2, $$1);
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

   public void a(ami $$0) {
      $$0.l().a(this.d, this.v);
      $$0.m().a(this.d, this.w);
   }

   public void b(ami $$0) {
      $$0.l().a(this.d);
      $$0.m().a(this.d);
   }

   @Override
   public djo j() {
      return djo.n;
   }

   public amb D() {
      return this.s == null ? amb.b : this.s.get();
   }

   public void b(Supplier<amb> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dfi::az_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof ami $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dfi> void b(T $$0, ami $$1) {
      cvf $$2 = $$0.r().b();
      if ($$2 instanceof cxx) {
         dlz $$3 = ((cxx)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(iy.a($$0.aC_().v())).a($$3);
         }
      }
   }

   private <T extends dfi> void c(T $$0) {
      dhn $$1 = $$0.r();
      dfj<T> $$2 = $$1.a(this.r, (dfk<T>)$$0.v());
      if ($$2 == null) {
         this.l($$0.aC_());
      } else {
         this.p.compute($$0.aC_(), ($$2x, $$3) -> {
            dgz $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dju.d)$$3;
            } else if (this.K()) {
               dju.d $$5 = new dju.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dfi> dgz a(T $$0, dfj<T> $$1) {
      return new dju.a<>($$0, $$1);
   }

   class a<T extends dfi> implements dgz {
      private final T b;
      private final dfj<T> c;
      private boolean d;

      a(T $$0, dfj<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.s() && this.b.n()) {
            hx $$0 = this.b.aC_();
            if (dju.this.k($$0)) {
               try {
                  bfs $$1 = dju.this.r.ae();
                  $$1.a(this::d);
                  dhn $$2 = dju.this.a_($$0);
                  if (this.b.v().a($$2)) {
                     this.c.tick(dju.this.r, this.b.aC_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dju.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return this.b.s();
      }

      @Override
      public hx c() {
         return this.b.aC_();
      }

      @Override
      public String d() {
         return dfk.a(this.b.v()).toString();
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
      void run(dju var1);
   }

   class d implements dgz {
      private dgz b;

      d(dgz $$0) {
         this.b = $$0;
      }

      void a(dgz $$0) {
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
      public hx c() {
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
