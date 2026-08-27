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

public class dol extends doa {
   static final Logger n = LogUtils.getLogger();
   private static final dlc o = new dlc() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public ib c() {
         return ib.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<ib, dol.d> p = Maps.newHashMap();
   private boolean q;
   final cwe r;
   @Nullable
   private Supplier<aot> s;
   @Nullable
   private dol.c t;
   private final Int2ObjectMap<dqu> u;
   private final eqh<czf> v;
   private final eqh<ehq> w;

   public dol(cwe $$0, cvl $$1) {
      this($$0, $$1, doy.a, new eqh<>(), new eqh<>(), 0L, null, null, null);
   }

   public dol(cwe $$0, cvl $$1, doy $$2, eqh<czf> $$3, eqh<ehq> $$4, long $$5, @Nullable dom[] $$6, @Nullable dol.c $$7, @Nullable dst $$8) {
      super($$1, $$2, $$0, $$0.I_().d(ki.au), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (drq.a $$9 : drq.a.values()) {
         if (dof.n.h().contains($$9)) {
            this.h.put($$9, new drq(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dol(apa $$0, dov $$1, @Nullable dol.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (djl $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<drq.a, drq> $$5 : $$1.e()) {
         if (dof.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public eqp<czf> o() {
      return this.v;
   }

   @Override
   public eqp<ehq> p() {
      return this.w;
   }

   @Override
   public doa.a q() {
      return new doa.a(this.v, this.w);
   }

   @Override
   public dqu a(int $$0) {
      return this.r instanceof apa $$1 ? (dqu)this.u.computeIfAbsent($$0, $$2 -> new dqq($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public dme a_(ib $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ag()) {
         dme $$4 = null;
         if ($$2 == 60) {
            $$4 = czh.hW.o();
         }

         if ($$2 == 70) {
            $$4 = drh.a($$1, $$3);
         }

         return $$4 == null ? czh.a.o() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dom $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return czh.a.o();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public ehr b_(ib $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public ehr a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dom $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return ehs.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public dme a(ib $$0, dme $$1, boolean $$2) {
      int $$3 = $$0.v();
      dom $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dme $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            czf $$10 = $$1.b();
            this.h.get(drq.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(drq.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(drq.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(drq.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.L().p().a($$0, $$11);
            }

            if (ehi.a(this, $$0, $$9, $$1)) {
               bjc $$12 = this.r.ae();
               $$12.a("updateSkyLightSources");
               this.i.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.r.L().p().a($$0);
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
                  djl $$14 = this.a($$0, dol.b.c);
                  if ($$14 == null) {
                     $$14 = ((dbx)$$10).a($$0, $$1);
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
   public void a(bof $$0) {
   }

   @Nullable
   private djl g(ib $$0) {
      dme $$1 = this.a_($$0);
      return !$$1.t() ? null : ((dbx)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public djl c_(ib $$0) {
      return this.a($$0, dol.b.c);
   }

   @Nullable
   public djl a(ib $$0, dol.b $$1) {
      djl $$2 = this.k.get($$0);
      if ($$2 == null) {
         sy $$3 = this.j.remove($$0);
         if ($$3 != null) {
            djl $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dol.b.a) {
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

   public void b(djl $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof apa $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean K() {
      return this.q || this.r.y_();
   }

   boolean h(ib $$0) {
      if (!this.r.D_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof apa $$1) ? true : this.D().a(aot.c) && $$1.c(cvl.a($$0));
      }
   }

   @Override
   public void a(djl $$0) {
      ib $$1 = $$0.aD_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.p();
         djl $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.aA_();
         }
      }
   }

   @Nullable
   @Override
   public sy a(ib $$0, in.a $$1) {
      djl $$2 = this.c_($$0);
      if ($$2 != null && !$$2.o()) {
         sy $$3 = $$2.b(this.r.I_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         sy $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.h();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(ib $$0) {
      if (this.K()) {
         djl $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof apa $$2) {
               this.a($$1, $$2);
            }

            $$1.aA_();
         }
      }

      this.k($$0);
   }

   private <T extends djl> void a(T $$0, apa $$1) {
      czf $$2 = $$0.n().b();
      if ($$2 instanceof dbx) {
         dqt $$3 = ((dbx)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = jd.a($$0.aD_().v());
            dqu $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void k(ib $$0) {
      dol.d $$1 = this.p.remove($$0);
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

   public void a(us $$0, sy $$1, Consumer<abt.b> $$2) {
      this.I();

      for (dom $$3 : this.m) {
         $$3.a($$0);
      }

      for (drq.a $$4 : drq.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         djl $$3 = this.a($$0x, dol.b.a);
         if ($$3 != null && $$2x != null && $$3.r() == $$1x) {
            $$3.a($$2x, this.r.I_());
         }
      });
   }

   public void a(us $$0) {
      for (dom $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public cwe F() {
      return this.r;
   }

   public Map<ib, djl> G() {
      return this.k;
   }

   public void H() {
      cvl $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               ib $$3 = dov.a($$2, this.g($$1), $$0);
               dme $$4 = this.a_($$3);
               ehr $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof ddu)) {
                  dme $$6 = czf.b($$4, this.r, $$3);
                  this.r.a($$3, $$6, 20);
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         ib $$7 = (ib)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private djl a(ib $$0, sy $$1) {
      dme $$2 = this.a_($$0);
      djl $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((dbx)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = djl.a($$0, $$2, $$1, this.r.I_());
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

   public void a(apa $$0) {
      $$0.m().a(this.d, this.v);
      $$0.n().a(this.d, this.w);
   }

   public void b(apa $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public dof j() {
      return dof.n;
   }

   public aot D() {
      return this.s == null ? aot.b : this.s.get();
   }

   public void b(Supplier<aot> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(djl::aA_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof apa $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends djl> void b(T $$0, apa $$1) {
      czf $$2 = $$0.n().b();
      if ($$2 instanceof dbx) {
         dqt $$3 = ((dbx)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(jd.a($$0.aD_().v())).a($$3);
         }
      }
   }

   private <T extends djl> void c(T $$0) {
      dme $$1 = $$0.n();
      djm<T> $$2 = $$1.a(this.r, (djn<T>)$$0.r());
      if ($$2 == null) {
         this.k($$0.aD_());
      } else {
         this.p.compute($$0.aD_(), ($$2x, $$3) -> {
            dlc $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dol.d)$$3;
            } else if (this.K()) {
               dol.d $$5 = new dol.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends djl> dlc a(T $$0, djm<T> $$1) {
      return new dol.a<>($$0, $$1);
   }

   class a<T extends djl> implements dlc {
      private final T b;
      private final djm<T> c;
      private boolean d;

      a(T $$0, djm<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.o() && this.b.m()) {
            ib $$0 = this.b.aD_();
            if (dol.this.h($$0)) {
               try {
                  bjc $$1 = dol.this.r.ae();
                  $$1.a(this::d);
                  dme $$2 = dol.this.a_($$0);
                  if (this.b.r().a($$2)) {
                     this.c.tick(dol.this.r, this.b.aD_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dol.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
      public ib c() {
         return this.b.aD_();
      }

      @Override
      public String d() {
         return djn.a(this.b.r()).toString();
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
      void run(dol var1);
   }

   class d implements dlc {
      private dlc b;

      d(dlc $$0) {
         this.b = $$0;
      }

      void a(dlc $$0) {
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
      public ib c() {
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
