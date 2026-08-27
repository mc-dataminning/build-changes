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

public class dth extends dsx {
   static final Logger n = LogUtils.getLogger();
   private static final dpy o = new dpy() {
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
   private final Map<io, dth.d> p = Maps.newHashMap();
   private boolean q;
   final dax r;
   @Nullable
   private Supplier<aqf> s;
   @Nullable
   private dth.c t;
   private final Int2ObjectMap<dvx> u;
   private final evw<ddy> v;
   private final evw<emt> w;

   public dth(dax $$0, dae $$1) {
      this($$0, $$1, dtu.a, new evw<>(), new evw<>(), 0L, null, null, null);
   }

   public dth(dax $$0, dae $$1, dtu $$2, evw<ddy> $$3, evw<emt> $$4, long $$5, @Nullable dti[] $$6, @Nullable dth.c $$7, @Nullable dxw $$8) {
      super($$1, $$2, $$0, $$0.H_().d(lf.az), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dwt.a $$9 : dwt.a.values()) {
         if (dtw.n.h().contains($$9)) {
            this.h.put($$9, new dwt(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dth(aqm $$0, dtr $$1, @Nullable dth.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dog $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dwt.a, dwt> $$5 : $$1.e()) {
         if (dtw.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public ewe<ddy> o() {
      return this.v;
   }

   @Override
   public ewe<emt> p() {
      return this.w;
   }

   @Override
   public dsx.a q() {
      return new dsx.a(this.v, this.w);
   }

   @Override
   public dvx a(int $$0) {
      return this.r instanceof aqm $$1 ? (dvx)this.u.computeIfAbsent($$0, $$2 -> new dvt($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public drb a_(io $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ah()) {
         drb $$4 = null;
         if ($$2 == 60) {
            $$4 = dea.hW.n();
         }

         if ($$2 == 70) {
            $$4 = dwk.a($$1, $$3);
         }

         return $$4 == null ? dea.a.n() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dti $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dea.a.n();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public emu b_(io $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public emu a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dti $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return emv.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public drb a(io $$0, drb $$1, boolean $$2) {
      int $$3 = $$0.v();
      dti $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         drb $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            ddy $$10 = $$1.b();
            this.h.get(dwt.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dwt.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dwt.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dwt.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.M().p().a($$0, $$11);
            }

            if (eml.a(this, $$0, $$9, $$1)) {
               bmi $$12 = this.r.af();
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
                  dog $$14 = this.a($$0, dth.b.c);
                  if ($$14 == null) {
                     $$14 = ((dgq)$$10).a($$0, $$1);
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
   public void a(bru $$0) {
   }

   @Nullable
   private dog g(io $$0) {
      drb $$1 = this.a_($$0);
      return !$$1.t() ? null : ((dgq)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dog c_(io $$0) {
      return this.a($$0, dth.b.c);
   }

   @Nullable
   public dog a(io $$0, dth.b $$1) {
      dog $$2 = this.k.get($$0);
      if ($$2 == null) {
         ud $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dog $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dth.b.a) {
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

   public void b(dog $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof aqm $$1) {
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
         return !(this.r instanceof aqm $$1) ? true : this.D().a(aqf.c) && $$1.c(dae.a($$0));
      }
   }

   @Override
   public void a(dog $$0) {
      io $$1 = $$0.az_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.p();
         dog $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.aw_();
         }
      }
   }

   @Nullable
   @Override
   public ud a(io $$0, iz.a $$1) {
      dog $$2 = this.c_($$0);
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
         dog $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof aqm $$2) {
               this.a($$1, $$2);
            }

            $$1.aw_();
         }
      }

      this.k($$0);
   }

   private <T extends dog> void a(T $$0, aqm $$1) {
      ddy $$2 = $$0.n().b();
      if ($$2 instanceof dgq) {
         dvw $$3 = ((dgq)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = jq.a($$0.az_().v());
            dvx $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void k(io $$0) {
      dth.d $$1 = this.p.remove($$0);
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

      for (dti $$3 : this.m) {
         $$3.a($$0);
      }

      for (dwt.a $$4 : dwt.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dog $$3 = this.a($$0x, dth.b.a);
         if ($$3 != null && $$2x != null && $$3.r() == $$1x) {
            $$3.c($$2x, this.r.H_());
         }
      });
   }

   public void a(vx $$0) {
      for (dti $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public dax F() {
      return this.r;
   }

   public Map<io, dog> G() {
      return this.k;
   }

   public void H() {
      dae $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               io $$3 = dtr.a($$2, this.g($$1), $$0);
               drb $$4 = this.a_($$3);
               emu $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof dio)) {
                  drb $$6 = ddy.b($$4, this.r, $$3);
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
   private dog a(io $$0, ud $$1) {
      drb $$2 = this.a_($$0);
      dog $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((dgq)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dog.a($$0, $$2, $$1, this.r.H_());
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

   public void a(aqm $$0) {
      $$0.m().a(this.d, this.v);
      $$0.n().a(this.d, this.w);
   }

   public void b(aqm $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public dtw j() {
      return dtw.n;
   }

   public aqf D() {
      return this.s == null ? aqf.b : this.s.get();
   }

   public void b(Supplier<aqf> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dog::aw_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof aqm $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dog> void b(T $$0, aqm $$1) {
      ddy $$2 = $$0.n().b();
      if ($$2 instanceof dgq) {
         dvw $$3 = ((dgq)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(jq.a($$0.az_().v())).a($$3);
         }
      }
   }

   private <T extends dog> void c(T $$0) {
      drb $$1 = $$0.n();
      doh<T> $$2 = $$1.a(this.r, (doi<T>)$$0.r());
      if ($$2 == null) {
         this.k($$0.az_());
      } else {
         this.p.compute($$0.az_(), ($$2x, $$3) -> {
            dpy $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dth.d)$$3;
            } else if (this.K()) {
               dth.d $$5 = new dth.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dog> dpy a(T $$0, doh<T> $$1) {
      return new dth.a<>($$0, $$1);
   }

   class a<T extends dog> implements dpy {
      private final T b;
      private final doh<T> c;
      private boolean d;

      a(T $$0, doh<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.o() && this.b.m()) {
            io $$0 = this.b.az_();
            if (dth.this.h($$0)) {
               try {
                  bmi $$1 = dth.this.r.af();
                  $$1.a(this::d);
                  drb $$2 = dth.this.a_($$0);
                  if (this.b.r().a($$2)) {
                     this.c.tick(dth.this.r, this.b.az_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dth.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return this.b.az_();
      }

      @Override
      public String d() {
         return doi.a(this.b.r()).toString();
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
      void run(dth var1);
   }

   class d implements dpy {
      private dpy b;

      d(dpy $$0) {
         this.b = $$0;
      }

      void a(dpy $$0) {
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
      public io c() {
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
