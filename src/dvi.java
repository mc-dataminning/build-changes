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
   private static final drz o = new drz() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public ir c() {
         return ir.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<ir, dvi.d> p = Maps.newHashMap();
   private boolean q;
   final dca r;
   @Nullable
   private Supplier<aqm> s;
   @Nullable
   private dvi.c t;
   private final Int2ObjectMap<dxy> u;
   private final eyg<dfc> v;
   private final eyg<epd> w;

   public dvi(dca $$0, dbh $$1) {
      this($$0, $$1, dvv.a, new eyg<>(), new eyg<>(), 0L, null, null, null);
   }

   public dvi(dca $$0, dbh $$1, dvv $$2, eyg<dfc> $$3, eyg<epd> $$4, long $$5, @Nullable dvj[] $$6, @Nullable dvi.c $$7, @Nullable dzx $$8) {
      super($$1, $$2, $$0, $$0.I_().d(li.az), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dyu.a $$9 : dyu.a.values()) {
         if (dvx.n.h().contains($$9)) {
            this.h.put($$9, new dyu(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dvi(aqt $$0, dvs $$1, @Nullable dvi.c $$2) {
      this($$0, $$1.g(), $$1.s(), $$1.H(), $$1.I(), $$1.v(), $$1.e(), $$2, $$1.u());

      for (dqc $$3 : $$1.E().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.G());

      for (int $$4 = 0; $$4 < $$1.o().length; $$4++) {
         this.b[$$4] = $$1.o()[$$4];
      }

      this.a($$1.h());
      this.b($$1.i());

      for (Entry<dyu.a, dyu> $$5 : $$1.f()) {
         if (dvx.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.w());
      this.c = true;
   }

   @Override
   public eyo<dfc> p() {
      return this.v;
   }

   @Override
   public eyo<epd> q() {
      return this.w;
   }

   @Override
   public duy.a r() {
      return new duy.a(this.v, this.w);
   }

   @Override
   public dxy a(int $$0) {
      return this.r instanceof aqt $$1 ? (dxy)this.u.computeIfAbsent($$0, $$2 -> new dxu($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public dtc a_(ir $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ai()) {
         dtc $$4 = null;
         if ($$2 == 60) {
            $$4 = dfe.iQ.n();
         }

         if ($$2 == 70) {
            $$4 = dyl.a($$1, $$3);
         }

         return $$4 == null ? dfe.a.n() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dvj $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dfe.a.n();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }

   @Override
   public epe b_(ir $$0) {
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
   public dtc a(ir $$0, dtc $$1, boolean $$2) {
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
            dfc $$10 = $$1.b();
            this.h.get(dyu.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dyu.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dyu.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dyu.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.N().p().a($$0, $$11);
            }

            if (eov.a(this, $$0, $$9, $$1)) {
               bmo $$12 = this.r.ag();
               $$12.a("updateSkyLightSources");
               this.i.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.r.N().p().a($$0);
               $$12.c();
            }

            boolean $$13 = $$9.t();
            if (!this.r.C) {
               $$9.b(this.r, $$0, $$1, $$2);
            } else if (!$$9.a($$10) && $$13) {
               this.d($$0);
            }

            if (!$$4.a($$6, $$7, $$8).a($$10)) {
               return null;
            } else {
               if (!this.r.C) {
                  $$1.a(this.r, $$0, $$9, $$2);
               }

               if ($$1.t()) {
                  dqc $$14 = this.a($$0, dvi.b.c);
                  if ($$14 == null) {
                     $$14 = ((dhw)$$10).a($$0, $$1);
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
   public void a(brv $$0) {
   }

   @Nullable
   private dqc g(ir $$0) {
      dtc $$1 = this.a_($$0);
      return !$$1.t() ? null : ((dhw)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dqc c_(ir $$0) {
      return this.a($$0, dvi.b.c);
   }

   @Nullable
   public dqc a(ir $$0, dvi.b $$1) {
      dqc $$2 = this.k.get($$0);
      if ($$2 == null) {
         uk $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dqc $$4 = this.a($$0, $$3);
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

   public void b(dqc $$0) {
      this.a($$0);
      if (this.L()) {
         if (this.r instanceof aqt $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean L() {
      return this.q || this.r.x_();
   }

   boolean h(ir $$0) {
      if (!this.r.D_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof aqt $$1) ? true : this.E().a(aqm.c) && $$1.c(dbh.a($$0));
      }
   }

   @Override
   public void a(dqc $$0) {
      ir $$1 = $$0.az_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.p();
         dqc $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.aw_();
         }
      }
   }

   @Nullable
   @Override
   public uk a(ir $$0, jc.a $$1) {
      dqc $$2 = this.c_($$0);
      if ($$2 != null && !$$2.o()) {
         uk $$3 = $$2.b(this.r.I_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         uk $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.h();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(ir $$0) {
      if (this.L()) {
         dqc $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof aqt $$2) {
               this.a($$1, $$2);
            }

            $$1.aw_();
         }
      }

      this.k($$0);
   }

   private <T extends dqc> void a(T $$0, aqt $$1) {
      dfc $$2 = $$0.n().b();
      if ($$2 instanceof dhw) {
         dxx $$3 = ((dhw)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = jt.a($$0.az_().v());
            dxy $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void k(ir $$0) {
      dvi.d $$1 = this.p.remove($$0);
      if ($$1 != null) {
         $$1.a(o);
      }
   }

   public void F() {
      if (this.t != null) {
         this.t.run(this);
         this.t = null;
      }
   }

   public boolean D() {
      return false;
   }

   public void a(we $$0, uk $$1, Consumer<adi.b> $$2) {
      this.J();

      for (dvj $$3 : this.m) {
         $$3.a($$0);
      }

      for (dyu.a $$4 : dyu.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.B();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dqc $$3 = this.a($$0x, dvi.b.a);
         if ($$3 != null && $$2x != null && $$3.r() == $$1x) {
            $$3.a($$2x, this.r.I_());
         }
      });
   }

   public void a(we $$0) {
      for (dvj $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public dca G() {
      return this.r;
   }

   public Map<ir, dqc> H() {
      return this.k;
   }

   public void I() {
      dbh $$0 = this.g();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               ir $$3 = dvs.a($$2, this.g($$1), $$0);
               dtc $$4 = this.a_($$3);
               epe $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof djw)) {
                  dtc $$6 = dfc.b($$4, this.r, $$3);
                  this.r.a($$3, $$6, 20);
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         ir $$7 = (ir)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private dqc a(ir $$0, uk $$1) {
      dtc $$2 = this.a_($$0);
      dqc $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((dhw)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dqc.a($$0, $$2, $$1, this.r.I_());
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
   public dvx k() {
      return dvx.n;
   }

   public aqm E() {
      return this.s == null ? aqm.b : this.s.get();
   }

   public void b(Supplier<aqm> $$0) {
      this.s = $$0;
   }

   public void J() {
      this.k.values().forEach(dqc::aw_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void K() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof aqt $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dqc> void b(T $$0, aqt $$1) {
      dfc $$2 = $$0.n().b();
      if ($$2 instanceof dhw) {
         dxx $$3 = ((dhw)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(jt.a($$0.az_().v())).a($$3);
         }
      }
   }

   private <T extends dqc> void c(T $$0) {
      dtc $$1 = $$0.n();
      dqd<T> $$2 = $$1.a(this.r, (dqe<T>)$$0.r());
      if ($$2 == null) {
         this.k($$0.az_());
      } else {
         this.p.compute($$0.az_(), ($$2x, $$3) -> {
            drz $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dvi.d)$$3;
            } else if (this.L()) {
               dvi.d $$5 = new dvi.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dqc> drz a(T $$0, dqd<T> $$1) {
      return new dvi.a<>($$0, $$1);
   }

   @Override
   public boolean z_() {
      return this.r.z_();
   }

   class a<T extends dqc> implements drz {
      private final T b;
      private final dqd<T> c;
      private boolean d;

      a(T $$0, dqd<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.o() && this.b.m()) {
            ir $$0 = this.b.az_();
            if (dvi.this.h($$0)) {
               try {
                  bmo $$1 = dvi.this.r.ag();
                  $$1.a(this::d);
                  dtc $$2 = dvi.this.a_($$0);
                  if (this.b.r().a($$2)) {
                     this.c.tick(dvi.this.r, this.b.az_(), $$2, this.b);
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
      public ir c() {
         return this.b.az_();
      }

      @Override
      public String d() {
         return dqe.a(this.b.r()).toString();
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

   class d implements drz {
      private drz b;

      d(drz $$0) {
         this.b = $$0;
      }

      void a(drz $$0) {
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
      public ir c() {
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
