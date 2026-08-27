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

public class dtj extends dsz {
   static final Logger n = LogUtils.getLogger();
   private static final dqa o = new dqa() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public io c() {
         return io.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<io, dtj.d> p = Maps.newHashMap();
   private boolean q;
   final daz r;
   @Nullable
   private Supplier<aqg> s;
   @Nullable
   private dtj.c t;
   private final Int2ObjectMap<dvz> u;
   private final evy<dea> v;
   private final evy<emv> w;

   public dtj(daz $$0, dag $$1) {
      this($$0, $$1, dtw.a, new evy<>(), new evy<>(), 0L, null, null, null);
   }

   public dtj(daz $$0, dag $$1, dtw $$2, evy<dea> $$3, evy<emv> $$4, long $$5, @Nullable dtk[] $$6, @Nullable dtj.c $$7, @Nullable dxy $$8) {
      super($$1, $$2, $$0, $$0.H_().d(lf.az), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dwv.a $$9 : dwv.a.values()) {
         if (dty.n.h().contains($$9)) {
            this.h.put($$9, new dwv(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dtj(aqn $$0, dtt $$1, @Nullable dtj.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (doi $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dwv.a, dwv> $$5 : $$1.e()) {
         if (dty.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public ewg<dea> o() {
      return this.v;
   }

   @Override
   public ewg<emv> p() {
      return this.w;
   }

   @Override
   public dsz.a q() {
      return new dsz.a(this.v, this.w);
   }

   @Override
   public dvz a(int $$0) {
      return this.r instanceof aqn $$1 ? (dvz)this.u.computeIfAbsent($$0, $$2 -> new dvv($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public drd a_(io $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ah()) {
         drd $$4 = null;
         if ($$2 == 60) {
            $$4 = dec.hW.n();
         }

         if ($$2 == 70) {
            $$4 = dwm.a($$1, $$3);
         }

         return $$4 == null ? dec.a.n() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dtk $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dec.a.n();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public emw b_(io $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public emw a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dtk $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return emx.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public drd a(io $$0, drd $$1, boolean $$2) {
      int $$3 = $$0.v();
      dtk $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         drd $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dea $$10 = $$1.b();
            this.h.get(dwv.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dwv.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dwv.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dwv.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.M().p().a($$0, $$11);
            }

            if (emn.a(this, $$0, $$9, $$1)) {
               bmk $$12 = this.r.af();
               $$12.a("updateSkyLightSources");
               this.i.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.r.M().p().a($$0);
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
                  doi $$14 = this.a($$0, dtj.b.c);
                  if ($$14 == null) {
                     $$14 = ((dgs)$$10).a($$0, $$1);
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
   public void a(brw $$0) {
   }

   @Nullable
   private doi g(io $$0) {
      drd $$1 = this.a_($$0);
      return !$$1.t() ? null : ((dgs)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public doi c_(io $$0) {
      return this.a($$0, dtj.b.c);
   }

   @Nullable
   public doi a(io $$0, dtj.b $$1) {
      doi $$2 = this.k.get($$0);
      if ($$2 == null) {
         ud $$3 = this.j.remove($$0);
         if ($$3 != null) {
            doi $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dtj.b.a) {
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

   public void b(doi $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof aqn $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean K() {
      return this.q || this.r.x_();
   }

   boolean h(io $$0) {
      if (!this.r.C_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof aqn $$1) ? true : this.D().a(aqg.c) && $$1.c(dag.a($$0));
      }
   }

   @Override
   public void a(doi $$0) {
      io $$1 = $$0.aA_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.p();
         doi $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.ax_();
         }
      }
   }

   @Nullable
   @Override
   public ud a(io $$0, iz.a $$1) {
      doi $$2 = this.c_($$0);
      if ($$2 != null && !$$2.o()) {
         ud $$3 = $$2.b(this.r.H_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         ud $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.h();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(io $$0) {
      if (this.K()) {
         doi $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof aqn $$2) {
               this.a($$1, $$2);
            }

            $$1.ax_();
         }
      }

      this.k($$0);
   }

   private <T extends doi> void a(T $$0, aqn $$1) {
      dea $$2 = $$0.n().b();
      if ($$2 instanceof dgs) {
         dvy $$3 = ((dgs)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = jq.a($$0.aA_().v());
            dvz $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void k(io $$0) {
      dtj.d $$1 = this.p.remove($$0);
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

   public void a(vx $$0, ud $$1, Consumer<adb.b> $$2) {
      this.I();

      for (dtk $$3 : this.m) {
         $$3.a($$0);
      }

      for (dwv.a $$4 : dwv.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         doi $$3 = this.a($$0x, dtj.b.a);
         if ($$3 != null && $$2x != null && $$3.r() == $$1x) {
            $$3.c($$2x, this.r.H_());
         }
      });
   }

   public void a(vx $$0) {
      for (dtk $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public daz F() {
      return this.r;
   }

   public Map<io, doi> G() {
      return this.k;
   }

   public void H() {
      dag $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               io $$3 = dtt.a($$2, this.g($$1), $$0);
               drd $$4 = this.a_($$3);
               emw $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof diq)) {
                  drd $$6 = dea.b($$4, this.r, $$3);
                  this.r.a($$3, $$6, 20);
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         io $$7 = (io)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private doi a(io $$0, ud $$1) {
      drd $$2 = this.a_($$0);
      doi $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((dgs)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = doi.a($$0, $$2, $$1, this.r.H_());
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

   public void a(aqn $$0) {
      $$0.m().a(this.d, this.v);
      $$0.n().a(this.d, this.w);
   }

   public void b(aqn $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public dty j() {
      return dty.n;
   }

   public aqg D() {
      return this.s == null ? aqg.b : this.s.get();
   }

   public void b(Supplier<aqg> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(doi::ax_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof aqn $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends doi> void b(T $$0, aqn $$1) {
      dea $$2 = $$0.n().b();
      if ($$2 instanceof dgs) {
         dvy $$3 = ((dgs)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(jq.a($$0.aA_().v())).a($$3);
         }
      }
   }

   private <T extends doi> void c(T $$0) {
      drd $$1 = $$0.n();
      doj<T> $$2 = $$1.a(this.r, (dok<T>)$$0.r());
      if ($$2 == null) {
         this.k($$0.aA_());
      } else {
         this.p.compute($$0.aA_(), ($$2x, $$3) -> {
            dqa $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dtj.d)$$3;
            } else if (this.K()) {
               dtj.d $$5 = new dtj.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends doi> dqa a(T $$0, doj<T> $$1) {
      return new dtj.a<>($$0, $$1);
   }

   class a<T extends doi> implements dqa {
      private final T b;
      private final doj<T> c;
      private boolean d;

      a(T $$0, doj<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.o() && this.b.m()) {
            io $$0 = this.b.aA_();
            if (dtj.this.h($$0)) {
               try {
                  bmk $$1 = dtj.this.r.af();
                  $$1.a(this::d);
                  drd $$2 = dtj.this.a_($$0);
                  if (this.b.r().a($$2)) {
                     this.c.tick(dtj.this.r, this.b.aA_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dtj.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
      public io c() {
         return this.b.aA_();
      }

      @Override
      public String d() {
         return dok.a(this.b.r()).toString();
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
      void run(dtj var1);
   }

   class d implements dqa {
      private dqa a;

      d(dqa $$0) {
         this.a = $$0;
      }

      void a(dqa $$0) {
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
      public io c() {
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
