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

public class dvg extends duw {
   static final Logger n = LogUtils.getLogger();
   private static final dry o = new dry() {
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
   private final Map<jd, dvg.d> p = Maps.newHashMap();
   private boolean q;
   final dcu r;
   @Nullable
   private Supplier<aqk> s;
   @Nullable
   private dvg.c t;
   private final Int2ObjectMap<dxz> u;
   private final eyi<dfw> v;
   private final eyi<eox> w;

   public dvg(dcu $$0, dcb $$1) {
      this($$0, $$1, dvt.a, new eyi<>(), new eyi<>(), 0L, null, null, null);
   }

   public dvg(dcu $$0, dcb $$1, dvt $$2, eyi<dfw> $$3, eyi<eox> $$4, long $$5, @Nullable dvh[] $$6, @Nullable dvg.c $$7, @Nullable dzy $$8) {
      super($$1, $$2, $$0, $$0.H_().d(lu.aF), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dyv.a $$9 : dyv.a.values()) {
         if (dvx.n.e().contains($$9)) {
            this.h.put($$9, new dyv(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dvg(aqt $$0, dvq $$1, @Nullable dvg.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dqf $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dyv.a, dyv> $$5 : $$1.e()) {
         if (dvx.n.e().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public eyq<dfw> o() {
      return this.v;
   }

   @Override
   public eyq<eox> p() {
      return this.w;
   }

   @Override
   public duw.a q() {
      return new duw.a(this.v, this.w);
   }

   @Override
   public dxz a(int $$0) {
      return this.r instanceof aqt $$1 ? (dxz)this.u.computeIfAbsent($$0, $$2 -> new dxv($$1, $$0, this::h)) : super.a($$0);
   }

   @Override
   public dta a_(jd $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ai()) {
         dta $$4 = null;
         if ($$2 == 60) {
            $$4 = dfy.hW.o();
         }

         if ($$2 == 70) {
            $$4 = dym.a($$1, $$3);
         }

         return $$4 == null ? dfy.a.o() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dvh $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dfy.a.o();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }

   @Override
   public eoy b_(jd $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public eoy a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dvh $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return eoz.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$6);
      }
   }

   @Nullable
   @Override
   public dta a(jd $$0, dta $$1, boolean $$2) {
      int $$3 = $$0.v();
      dvh $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dta $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dfw $$10 = $$1.b();
            this.h.get(dyv.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dyv.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dyv.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dyv.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.N().p().a($$0, $$11);
            }

            if (eop.a(this, $$0, $$9, $$1)) {
               bne $$12 = this.r.ag();
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
                  dqf $$14 = this.a($$0, dvg.b.c);
                  if ($$14 == null) {
                     $$14 = ((dio)$$10).a($$0, $$1);
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
   public void a(bsq $$0) {
   }

   @Nullable
   private dqf g(jd $$0) {
      dta $$1 = this.a_($$0);
      return !$$1.t() ? null : ((dio)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dqf c_(jd $$0) {
      return this.a($$0, dvg.b.c);
   }

   @Nullable
   public dqf a(jd $$0, dvg.b $$1) {
      dqf $$2 = this.k.get($$0);
      if ($$2 == null) {
         ua $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dqf $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dvg.b.a) {
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

   public void b(dqf $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof aqt $$1) {
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
         return !(this.r instanceof aqt $$1) ? true : this.D().a(aqk.c) && $$1.c(dcb.a($$0));
      }
   }

   @Override
   public void a(dqf $$0) {
      jd $$1 = $$0.az_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.p();
         dqf $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.aw_();
         }
      }
   }

   @Nullable
   @Override
   public ua a(jd $$0, jo.a $$1) {
      dqf $$2 = this.c_($$0);
      if ($$2 != null && !$$2.o()) {
         ua $$3 = $$2.b(this.r.H_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         ua $$4 = this.j.get($$0);
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
         dqf $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof aqt $$2) {
               this.a($$1, $$2);
            }

            $$1.aw_();
         }
      }

      this.k($$0);
   }

   private <T extends dqf> void a(T $$0, aqt $$1) {
      dfw $$2 = $$0.n().b();
      if ($$2 instanceof dio) {
         dxy $$3 = ((dio)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = kf.a($$0.az_().v());
            dxz $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void h(int $$0) {
      this.u.remove($$0);
   }

   private void k(jd $$0) {
      dvg.d $$1 = this.p.remove($$0);
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

   public void a(vv $$0, ua $$1, Consumer<ade.b> $$2) {
      this.I();

      for (dvh $$3 : this.m) {
         $$3.a($$0);
      }

      for (dyv.a $$4 : dyv.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dqf $$3 = this.a($$0x, dvg.b.a);
         if ($$3 != null && $$2x != null && $$3.r() == $$1x) {
            $$3.c($$2x, this.r.H_());
         }
      });
   }

   public void a(vv $$0) {
      for (dvh $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public dcu F() {
      return this.r;
   }

   public Map<jd, dqf> G() {
      return this.k;
   }

   public void H() {
      dcb $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               jd $$3 = dvq.a($$2, this.g($$1), $$0);
               dta $$4 = this.a_($$3);
               eoy $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof dkm)) {
                  dta $$6 = dfw.b($$4, this.r, $$3);
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
   private dqf a(jd $$0, ua $$1) {
      dta $$2 = this.a_($$0);
      dqf $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((dio)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dqf.a($$0, $$2, $$1, this.r.H_());
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

   public void a(aqt $$0) {
      $$0.m().a(this.d, this.v);
      $$0.n().a(this.d, this.w);
   }

   public void b(aqt $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public dvx j() {
      return dvx.n;
   }

   public aqk D() {
      return this.s == null ? aqk.b : this.s.get();
   }

   public void b(Supplier<aqk> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dqf::aw_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof aqt $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dqf> void b(T $$0, aqt $$1) {
      dfw $$2 = $$0.n().b();
      if ($$2 instanceof dio) {
         dxy $$3 = ((dio)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(kf.a($$0.az_().v())).a($$3);
         }
      }
   }

   private <T extends dqf> void c(T $$0) {
      dta $$1 = $$0.n();
      dqg<T> $$2 = $$1.a(this.r, (dqh<T>)$$0.r());
      if ($$2 == null) {
         this.k($$0.az_());
      } else {
         this.p.compute($$0.az_(), ($$2x, $$3) -> {
            dry $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dvg.d)$$3;
            } else if (this.K()) {
               dvg.d $$5 = new dvg.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dqf> dry a(T $$0, dqg<T> $$1) {
      return new dvg.a<>($$0, $$1);
   }

   class a<T extends dqf> implements dry {
      private final T b;
      private final dqg<T> c;
      private boolean d;

      a(final T $$0, final dqg<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.o() && this.b.m()) {
            jd $$0 = this.b.az_();
            if (dvg.this.h($$0)) {
               try {
                  bne $$1 = dvg.this.r.ag();
                  $$1.a(this::d);
                  dta $$2 = dvg.this.a_($$0);
                  if (this.b.r().a($$2)) {
                     this.c.tick(dvg.this.r, this.b.az_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dvg.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return this.b.az_();
      }

      @Override
      public String d() {
         return dqh.a(this.b.r()).toString();
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
      void run(dvg var1);
   }

   class d implements dry {
      private dry a;

      d(final dry $$0) {
         this.a = $$0;
      }

      void a(dry $$0) {
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
