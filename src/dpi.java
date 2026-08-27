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

public class dpi extends dox {
   static final Logger n = LogUtils.getLogger();
   private static final dlz o = new dlz() {
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
   private final Map<ib, dpi.d> p = Maps.newHashMap();
   private boolean q;
   final cxb r;
   @Nullable
   private Supplier<aoy> s;
   @Nullable
   private dpi.c t;
   private final Int2ObjectMap<drs> u;
   private final erf<dac> v;
   private final erf<eio> w;

   public dpi(cxb $$0, cwi $$1) {
      this($$0, $$1, dpv.a, new erf<>(), new erf<>(), 0L, null, null, null);
   }

   public dpi(cxb $$0, cwi $$1, dpv $$2, erf<dac> $$3, erf<eio> $$4, long $$5, @Nullable dpj[] $$6, @Nullable dpi.c $$7, @Nullable dtr $$8) {
      super($$1, $$2, $$0, $$0.H_().d(kj.au), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dso.a $$9 : dso.a.values()) {
         if (dpc.n.h().contains($$9)) {
            this.h.put($$9, new dso(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dpi(apf $$0, dps $$1, @Nullable dpi.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dki $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dso.a, dso> $$5 : $$1.e()) {
         if (dpc.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public ern<dac> o() {
      return this.v;
   }

   @Override
   public ern<eio> p() {
      return this.w;
   }

   @Override
   public dox.a q() {
      return new dox.a(this.v, this.w);
   }

   @Override
   public drs a(int $$0) {
      return this.r instanceof apf $$1 ? (drs)this.u.computeIfAbsent($$0, $$2 -> new dro($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public dnb a_(ib $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ag()) {
         dnb $$4 = null;
         if ($$2 == 60) {
            $$4 = dae.hW.o();
         }

         if ($$2 == 70) {
            $$4 = dsf.a($$1, $$3);
         }

         return $$4 == null ? dae.a.o() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dpj $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dae.a.o();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public eip b_(ib $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public eip a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dpj $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return eiq.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public dnb a(ib $$0, dnb $$1, boolean $$2) {
      int $$3 = $$0.v();
      dpj $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dnb $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dac $$10 = $$1.b();
            this.h.get(dso.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dso.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dso.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dso.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.L().p().a($$0, $$11);
            }

            if (eig.a(this, $$0, $$9, $$1)) {
               bjr $$12 = this.r.ae();
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
                  dki $$14 = this.a($$0, dpi.b.c);
                  if ($$14 == null) {
                     $$14 = ((dcu)$$10).a($$0, $$1);
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
   public void a(box $$0) {
   }

   @Nullable
   private dki g(ib $$0) {
      dnb $$1 = this.a_($$0);
      return !$$1.t() ? null : ((dcu)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dki c_(ib $$0) {
      return this.a($$0, dpi.b.c);
   }

   @Nullable
   public dki a(ib $$0, dpi.b $$1) {
      dki $$2 = this.k.get($$0);
      if ($$2 == null) {
         ta $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dki $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dpi.b.a) {
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

   public void b(dki $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof apf $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean K() {
      return this.q || this.r.x_();
   }

   boolean h(ib $$0) {
      if (!this.r.C_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof apf $$1) ? true : this.D().a(aoy.c) && $$1.c(cwi.a($$0));
      }
   }

   @Override
   public void a(dki $$0) {
      ib $$1 = $$0.aC_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.p();
         dki $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.az_();
         }
      }
   }

   @Nullable
   @Override
   public ta a(ib $$0, in.a $$1) {
      dki $$2 = this.c_($$0);
      if ($$2 != null && !$$2.o()) {
         ta $$3 = $$2.b(this.r.H_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         ta $$4 = this.j.get($$0);
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
         dki $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof apf $$2) {
               this.a($$1, $$2);
            }

            $$1.az_();
         }
      }

      this.k($$0);
   }

   private <T extends dki> void a(T $$0, apf $$1) {
      dac $$2 = $$0.n().b();
      if ($$2 instanceof dcu) {
         drr $$3 = ((dcu)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = je.a($$0.aC_().v());
            drs $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void k(ib $$0) {
      dpi.d $$1 = this.p.remove($$0);
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

   public void a(uu $$0, ta $$1, Consumer<abx.b> $$2) {
      this.I();

      for (dpj $$3 : this.m) {
         $$3.a($$0);
      }

      for (dso.a $$4 : dso.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dki $$3 = this.a($$0x, dpi.b.a);
         if ($$3 != null && $$2x != null && $$3.r() == $$1x) {
            $$3.a($$2x, this.r.H_());
         }
      });
   }

   public void a(uu $$0) {
      for (dpj $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public cxb F() {
      return this.r;
   }

   public Map<ib, dki> G() {
      return this.k;
   }

   public void H() {
      cwi $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               ib $$3 = dps.a($$2, this.g($$1), $$0);
               dnb $$4 = this.a_($$3);
               eip $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof der)) {
                  dnb $$6 = dac.b($$4, this.r, $$3);
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
   private dki a(ib $$0, ta $$1) {
      dnb $$2 = this.a_($$0);
      dki $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((dcu)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dki.a($$0, $$2, $$1, this.r.H_());
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

   public void a(apf $$0) {
      $$0.m().a(this.d, this.v);
      $$0.n().a(this.d, this.w);
   }

   public void b(apf $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public dpc j() {
      return dpc.n;
   }

   public aoy D() {
      return this.s == null ? aoy.b : this.s.get();
   }

   public void b(Supplier<aoy> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dki::az_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof apf $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dki> void b(T $$0, apf $$1) {
      dac $$2 = $$0.n().b();
      if ($$2 instanceof dcu) {
         drr $$3 = ((dcu)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(je.a($$0.aC_().v())).a($$3);
         }
      }
   }

   private <T extends dki> void c(T $$0) {
      dnb $$1 = $$0.n();
      dkj<T> $$2 = $$1.a(this.r, (dkk<T>)$$0.r());
      if ($$2 == null) {
         this.k($$0.aC_());
      } else {
         this.p.compute($$0.aC_(), ($$2x, $$3) -> {
            dlz $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dpi.d)$$3;
            } else if (this.K()) {
               dpi.d $$5 = new dpi.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dki> dlz a(T $$0, dkj<T> $$1) {
      return new dpi.a<>($$0, $$1);
   }

   class a<T extends dki> implements dlz {
      private final T b;
      private final dkj<T> c;
      private boolean d;

      a(T $$0, dkj<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.o() && this.b.m()) {
            ib $$0 = this.b.aC_();
            if (dpi.this.h($$0)) {
               try {
                  bjr $$1 = dpi.this.r.ae();
                  $$1.a(this::d);
                  dnb $$2 = dpi.this.a_($$0);
                  if (this.b.r().a($$2)) {
                     this.c.tick(dpi.this.r, this.b.aC_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dpi.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return this.b.aC_();
      }

      @Override
      public String d() {
         return dkk.a(this.b.r()).toString();
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
      void run(dpi var1);
   }

   class d implements dlz {
      private dlz b;

      d(dlz $$0) {
         this.b = $$0;
      }

      void a(dlz $$0) {
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
