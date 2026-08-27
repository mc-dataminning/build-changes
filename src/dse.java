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

public class dse extends dru {
   static final Logger n = LogUtils.getLogger();
   private static final dov o = new dov() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public im c() {
         return im.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<im, dse.d> p = Maps.newHashMap();
   private boolean q;
   final czu r;
   @Nullable
   private Supplier<apx> s;
   @Nullable
   private dse.c t;
   private final Int2ObjectMap<duu> u;
   private final eur<dcv> v;
   private final eur<elq> w;

   public dse(czu $$0, czb $$1) {
      this($$0, $$1, dsr.a, new eur<>(), new eur<>(), 0L, null, null, null);
   }

   public dse(czu $$0, czb $$1, dsr $$2, eur<dcv> $$3, eur<elq> $$4, long $$5, @Nullable dsf[] $$6, @Nullable dse.c $$7, @Nullable dwt $$8) {
      super($$1, $$2, $$0, $$0.H_().d(ld.ay), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dvq.a $$9 : dvq.a.values()) {
         if (dst.n.h().contains($$9)) {
            this.h.put($$9, new dvq(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dse(aqe $$0, dso $$1, @Nullable dse.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dnd $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dvq.a, dvq> $$5 : $$1.e()) {
         if (dst.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public euz<dcv> o() {
      return this.v;
   }

   @Override
   public euz<elq> p() {
      return this.w;
   }

   @Override
   public dru.a q() {
      return new dru.a(this.v, this.w);
   }

   @Override
   public duu a(int $$0) {
      return this.r instanceof aqe $$1 ? (duu)this.u.computeIfAbsent($$0, $$2 -> new duq($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public dpy a_(im $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ah()) {
         dpy $$4 = null;
         if ($$2 == 60) {
            $$4 = dcx.hW.n();
         }

         if ($$2 == 70) {
            $$4 = dvh.a($$1, $$3);
         }

         return $$4 == null ? dcx.a.n() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dsf $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dcx.a.n();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public elr b_(im $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public elr a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dsf $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return els.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public dpy a(im $$0, dpy $$1, boolean $$2) {
      int $$3 = $$0.v();
      dsf $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dpy $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dcv $$10 = $$1.b();
            this.h.get(dvq.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dvq.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dvq.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dvq.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.M().p().a($$0, $$11);
            }

            if (eli.a(this, $$0, $$9, $$1)) {
               ble $$12 = this.r.af();
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
                  dnd $$14 = this.a($$0, dse.b.c);
                  if ($$14 == null) {
                     $$14 = ((dfn)$$10).a($$0, $$1);
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
   public void a(bql $$0) {
   }

   @Nullable
   private dnd g(im $$0) {
      dpy $$1 = this.a_($$0);
      return !$$1.t() ? null : ((dfn)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dnd c_(im $$0) {
      return this.a($$0, dse.b.c);
   }

   @Nullable
   public dnd a(im $$0, dse.b $$1) {
      dnd $$2 = this.k.get($$0);
      if ($$2 == null) {
         ty $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dnd $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dse.b.a) {
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

   public void b(dnd $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof aqe $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean K() {
      return this.q || this.r.x_();
   }

   boolean h(im $$0) {
      if (!this.r.C_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof aqe $$1) ? true : this.D().a(apx.c) && $$1.c(czb.a($$0));
      }
   }

   @Override
   public void a(dnd $$0) {
      im $$1 = $$0.az_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.p();
         dnd $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.aw_();
         }
      }
   }

   @Nullable
   @Override
   public ty a(im $$0, ix.a $$1) {
      dnd $$2 = this.c_($$0);
      if ($$2 != null && !$$2.o()) {
         ty $$3 = $$2.b(this.r.H_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         ty $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.h();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(im $$0) {
      if (this.K()) {
         dnd $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof aqe $$2) {
               this.a($$1, $$2);
            }

            $$1.aw_();
         }
      }

      this.k($$0);
   }

   private <T extends dnd> void a(T $$0, aqe $$1) {
      dcv $$2 = $$0.n().b();
      if ($$2 instanceof dfn) {
         dut $$3 = ((dfn)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = jo.a($$0.az_().v());
            duu $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void k(im $$0) {
      dse.d $$1 = this.p.remove($$0);
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

   public void a(vs $$0, ty $$1, Consumer<acv.b> $$2) {
      this.I();

      for (dsf $$3 : this.m) {
         $$3.a($$0);
      }

      for (dvq.a $$4 : dvq.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dnd $$3 = this.a($$0x, dse.b.a);
         if ($$3 != null && $$2x != null && $$3.r() == $$1x) {
            $$3.a($$2x, this.r.H_());
         }
      });
   }

   public void a(vs $$0) {
      for (dsf $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public czu F() {
      return this.r;
   }

   public Map<im, dnd> G() {
      return this.k;
   }

   public void H() {
      czb $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               im $$3 = dso.a($$2, this.g($$1), $$0);
               dpy $$4 = this.a_($$3);
               elr $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof dhl)) {
                  dpy $$6 = dcv.b($$4, this.r, $$3);
                  this.r.a($$3, $$6, 20);
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         im $$7 = (im)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private dnd a(im $$0, ty $$1) {
      dpy $$2 = this.a_($$0);
      dnd $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((dfn)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dnd.a($$0, $$2, $$1, this.r.H_());
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

   public void a(aqe $$0) {
      $$0.m().a(this.d, this.v);
      $$0.n().a(this.d, this.w);
   }

   public void b(aqe $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public dst j() {
      return dst.n;
   }

   public apx D() {
      return this.s == null ? apx.b : this.s.get();
   }

   public void b(Supplier<apx> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dnd::aw_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof aqe $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dnd> void b(T $$0, aqe $$1) {
      dcv $$2 = $$0.n().b();
      if ($$2 instanceof dfn) {
         dut $$3 = ((dfn)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(jo.a($$0.az_().v())).a($$3);
         }
      }
   }

   private <T extends dnd> void c(T $$0) {
      dpy $$1 = $$0.n();
      dne<T> $$2 = $$1.a(this.r, (dnf<T>)$$0.r());
      if ($$2 == null) {
         this.k($$0.az_());
      } else {
         this.p.compute($$0.az_(), ($$2x, $$3) -> {
            dov $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dse.d)$$3;
            } else if (this.K()) {
               dse.d $$5 = new dse.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dnd> dov a(T $$0, dne<T> $$1) {
      return new dse.a<>($$0, $$1);
   }

   class a<T extends dnd> implements dov {
      private final T b;
      private final dne<T> c;
      private boolean d;

      a(T $$0, dne<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.o() && this.b.m()) {
            im $$0 = this.b.az_();
            if (dse.this.h($$0)) {
               try {
                  ble $$1 = dse.this.r.af();
                  $$1.a(this::d);
                  dpy $$2 = dse.this.a_($$0);
                  if (this.b.r().a($$2)) {
                     this.c.tick(dse.this.r, this.b.az_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dse.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
      public im c() {
         return this.b.az_();
      }

      @Override
      public String d() {
         return dnf.a(this.b.r()).toString();
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
      void run(dse var1);
   }

   class d implements dov {
      private dov b;

      d(dov $$0) {
         this.b = $$0;
      }

      void a(dov $$0) {
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
      public im c() {
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
