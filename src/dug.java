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

public class dug extends dtw {
   static final Logger n = LogUtils.getLogger();
   private static final dqx o = new dqx() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public iz c() {
         return iz.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<iz, dug.d> p = Maps.newHashMap();
   private boolean q;
   final dbw r;
   @Nullable
   private Supplier<aqx> s;
   @Nullable
   private dug.c t;
   private final Int2ObjectMap<dww> u;
   private final exb<dex> v;
   private final exb<ens> w;

   public dug(dbw $$0, dbd $$1) {
      this($$0, $$1, dut.a, new exb<>(), new exb<>(), 0L, null, null, null);
   }

   public dug(dbw $$0, dbd $$1, dut $$2, exb<dex> $$3, exb<ens> $$4, long $$5, @Nullable duh[] $$6, @Nullable dug.c $$7, @Nullable dyv $$8) {
      super($$1, $$2, $$0, $$0.H_().d(lq.az), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dxs.a $$9 : dxs.a.values()) {
         if (duv.n.h().contains($$9)) {
            this.h.put($$9, new dxs(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dug(are $$0, duq $$1, @Nullable dug.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dpf $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dxs.a, dxs> $$5 : $$1.e()) {
         if (duv.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public exj<dex> o() {
      return this.v;
   }

   @Override
   public exj<ens> p() {
      return this.w;
   }

   @Override
   public dtw.a q() {
      return new dtw.a(this.v, this.w);
   }

   @Override
   public dww a(int $$0) {
      return this.r instanceof are $$1 ? (dww)this.u.computeIfAbsent($$0, $$2 -> new dws($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public dsa a_(iz $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ai()) {
         dsa $$4 = null;
         if ($$2 == 60) {
            $$4 = dez.hW.o();
         }

         if ($$2 == 70) {
            $$4 = dxj.a($$1, $$3);
         }

         return $$4 == null ? dez.a.o() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               duh $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dez.a.o();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public ent b_(iz $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public ent a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            duh $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return enu.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public dsa a(iz $$0, dsa $$1, boolean $$2) {
      int $$3 = $$0.v();
      duh $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dsa $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dex $$10 = $$1.b();
            this.h.get(dxs.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dxs.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dxs.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dxs.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.N().p().a($$0, $$11);
            }

            if (enk.a(this, $$0, $$9, $$1)) {
               bng $$12 = this.r.ag();
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
                  dpf $$14 = this.a($$0, dug.b.c);
                  if ($$14 == null) {
                     $$14 = ((dhp)$$10).a($$0, $$1);
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
   public void a(bss $$0) {
   }

   @Nullable
   private dpf g(iz $$0) {
      dsa $$1 = this.a_($$0);
      return !$$1.t() ? null : ((dhp)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dpf c_(iz $$0) {
      return this.a($$0, dug.b.c);
   }

   @Nullable
   public dpf a(iz $$0, dug.b $$1) {
      dpf $$2 = this.k.get($$0);
      if ($$2 == null) {
         ur $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dpf $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dug.b.a) {
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

   public void b(dpf $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof are $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean K() {
      return this.q || this.r.x_();
   }

   boolean h(iz $$0) {
      if (!this.r.C_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof are $$1) ? true : this.D().a(aqx.c) && $$1.c(dbd.a($$0));
      }
   }

   @Override
   public void a(dpf $$0) {
      iz $$1 = $$0.az_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.p();
         dpf $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.aw_();
         }
      }
   }

   @Nullable
   @Override
   public ur a(iz $$0, jk.a $$1) {
      dpf $$2 = this.c_($$0);
      if ($$2 != null && !$$2.o()) {
         ur $$3 = $$2.b(this.r.H_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         ur $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.h();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(iz $$0) {
      if (this.K()) {
         dpf $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof are $$2) {
               this.a($$1, $$2);
            }

            $$1.aw_();
         }
      }

      this.k($$0);
   }

   private <T extends dpf> void a(T $$0, are $$1) {
      dex $$2 = $$0.n().b();
      if ($$2 instanceof dhp) {
         dwv $$3 = ((dhp)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = kb.a($$0.az_().v());
            dww $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void k(iz $$0) {
      dug.d $$1 = this.p.remove($$0);
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

   public void a(wl $$0, ur $$1, Consumer<ads.b> $$2) {
      this.I();

      for (duh $$3 : this.m) {
         $$3.a($$0);
      }

      for (dxs.a $$4 : dxs.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dpf $$3 = this.a($$0x, dug.b.a);
         if ($$3 != null && $$2x != null && $$3.r() == $$1x) {
            $$3.c($$2x, this.r.H_());
         }
      });
   }

   public void a(wl $$0) {
      for (duh $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public dbw F() {
      return this.r;
   }

   public Map<iz, dpf> G() {
      return this.k;
   }

   public void H() {
      dbd $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               iz $$3 = duq.a($$2, this.g($$1), $$0);
               dsa $$4 = this.a_($$3);
               ent $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof djn)) {
                  dsa $$6 = dex.b($$4, this.r, $$3);
                  this.r.a($$3, $$6, 20);
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         iz $$7 = (iz)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private dpf a(iz $$0, ur $$1) {
      dsa $$2 = this.a_($$0);
      dpf $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((dhp)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dpf.a($$0, $$2, $$1, this.r.H_());
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

   public void a(are $$0) {
      $$0.m().a(this.d, this.v);
      $$0.n().a(this.d, this.w);
   }

   public void b(are $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public duv j() {
      return duv.n;
   }

   public aqx D() {
      return this.s == null ? aqx.b : this.s.get();
   }

   public void b(Supplier<aqx> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dpf::aw_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof are $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dpf> void b(T $$0, are $$1) {
      dex $$2 = $$0.n().b();
      if ($$2 instanceof dhp) {
         dwv $$3 = ((dhp)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(kb.a($$0.az_().v())).a($$3);
         }
      }
   }

   private <T extends dpf> void c(T $$0) {
      dsa $$1 = $$0.n();
      dpg<T> $$2 = $$1.a(this.r, (dph<T>)$$0.r());
      if ($$2 == null) {
         this.k($$0.az_());
      } else {
         this.p.compute($$0.az_(), ($$2x, $$3) -> {
            dqx $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dug.d)$$3;
            } else if (this.K()) {
               dug.d $$5 = new dug.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dpf> dqx a(T $$0, dpg<T> $$1) {
      return new dug.a<>($$0, $$1);
   }

   class a<T extends dpf> implements dqx {
      private final T b;
      private final dpg<T> c;
      private boolean d;

      a(final T $$0, final dpg<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.o() && this.b.m()) {
            iz $$0 = this.b.az_();
            if (dug.this.h($$0)) {
               try {
                  bng $$1 = dug.this.r.ag();
                  $$1.a(this::d);
                  dsa $$2 = dug.this.a_($$0);
                  if (this.b.r().a($$2)) {
                     this.c.tick(dug.this.r, this.b.az_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dug.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
      public iz c() {
         return this.b.az_();
      }

      @Override
      public String d() {
         return dph.a(this.b.r()).toString();
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
      void run(dug var1);
   }

   class d implements dqx {
      private dqx a;

      d(final dqx $$0) {
         this.a = $$0;
      }

      void a(dqx $$0) {
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
      public iz c() {
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
