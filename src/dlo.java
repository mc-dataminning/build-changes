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

public class dlo extends dld {
   static final Logger n = LogUtils.getLogger();
   private static final dim o = new dim() {
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
   private final Map<hx, dlo.d> p = Maps.newHashMap();
   private boolean q;
   final ctp r;
   @Nullable
   private Supplier<amw> s;
   @Nullable
   private dlo.c t;
   private final Int2ObjectMap<dnu> u;
   private final enf<cwq> v;
   private final enf<eeq> w;

   public dlo(ctp $$0, csw $$1) {
      this($$0, $$1, dmb.a, new enf<>(), new enf<>(), 0L, null, null, null);
   }

   public dlo(ctp $$0, csw $$1, dmb $$2, enf<cwq> $$3, enf<eeq> $$4, long $$5, @Nullable dlp[] $$6, @Nullable dlo.c $$7, @Nullable dpt $$8) {
      super($$1, $$2, $$0, $$0.I_().d(ke.at), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (doq.a $$9 : doq.a.values()) {
         if (dli.n.h().contains($$9)) {
            this.h.put($$9, new doq(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dlo(and $$0, dly $$1, @Nullable dlo.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dgv $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<doq.a, doq> $$5 : $$1.e()) {
         if (dli.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public enn<cwq> o() {
      return this.v;
   }

   @Override
   public enn<eeq> p() {
      return this.w;
   }

   @Override
   public dld.a q() {
      return new dld.a(this.v, this.w);
   }

   @Override
   public dnu a(int $$0) {
      return this.r instanceof and $$1 ? (dnu)this.u.computeIfAbsent($$0, $$2 -> new dnq($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public djh a_(hx $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ah()) {
         djh $$4 = null;
         if ($$2 == 60) {
            $$4 = cws.hW.o();
         }

         if ($$2 == 70) {
            $$4 = doh.a($$1, $$3);
         }

         return $$4 == null ? cws.a.o() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dlp $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return cws.a.o();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public eer b_(hx $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public eer a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dlp $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return ees.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public djh a(hx $$0, djh $$1, boolean $$2) {
      int $$3 = $$0.v();
      dlp $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         djh $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            cwq $$10 = $$1.b();
            this.h.get(doq.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(doq.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(doq.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(doq.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.L().p().a($$0, $$11);
            }

            if (eei.a(this, $$0, $$9, $$1)) {
               bgs $$12 = this.r.af();
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
                  dgv $$14 = this.a($$0, dlo.b.c);
                  if ($$14 == null) {
                     $$14 = ((czi)$$10).a($$0, $$1);
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
   public void a(blv $$0) {
   }

   @Nullable
   private dgv h(hx $$0) {
      djh $$1 = this.a_($$0);
      return !$$1.t() ? null : ((czi)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dgv c_(hx $$0) {
      return this.a($$0, dlo.b.c);
   }

   @Nullable
   public dgv a(hx $$0, dlo.b $$1) {
      dgv $$2 = this.k.get($$0);
      if ($$2 == null) {
         sn $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dgv $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dlo.b.a) {
            $$2 = this.h($$0);
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

   public void b(dgv $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof and $$1) {
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
         return !(this.r instanceof and $$1) ? true : this.D().a(amw.c) && $$1.c(csw.a($$0));
      }
   }

   @Override
   public void a(dgv $$0) {
      hx $$1 = $$0.aB_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.t();
         dgv $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.ay_();
         }
      }
   }

   @Nullable
   @Override
   public sn g(hx $$0) {
      dgv $$1 = this.c_($$0);
      if ($$1 != null && !$$1.s()) {
         sn $$2 = $$1.o();
         $$2.a("keepPacked", false);
         return $$2;
      } else {
         sn $$3 = this.j.get($$0);
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
         dgv $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof and $$2) {
               this.a($$1, $$2);
            }

            $$1.ay_();
         }
      }

      this.l($$0);
   }

   private <T extends dgv> void a(T $$0, and $$1) {
      cwq $$2 = $$0.r().b();
      if ($$2 instanceof czi) {
         dnt $$3 = ((czi)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = iz.a($$0.aB_().v());
            dnu $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void l(hx $$0) {
      dlo.d $$1 = this.p.remove($$0);
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

   public void a(ui $$0, sn $$1, Consumer<aaj.b> $$2) {
      this.I();

      for (dlp $$3 : this.m) {
         $$3.a($$0);
      }

      for (doq.a $$4 : doq.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dgv $$3 = this.a($$0x, dlo.b.a);
         if ($$3 != null && $$2x != null && $$3.v() == $$1x) {
            $$3.a($$2x);
         }
      });
   }

   public void a(ui $$0) {
      for (dlp $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public ctp F() {
      return this.r;
   }

   public Map<hx, dgv> G() {
      return this.k;
   }

   public void H() {
      csw $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               hx $$3 = dly.a($$2, this.g($$1), $$0);
               djh $$4 = this.a_($$3);
               eer $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof dbf)) {
                  djh $$6 = cwq.b($$4, this.r, $$3);
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
   private dgv a(hx $$0, sn $$1) {
      djh $$2 = this.a_($$0);
      dgv $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((czi)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dgv.a($$0, $$2, $$1);
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

   public void a(and $$0) {
      $$0.m().a(this.d, this.v);
      $$0.n().a(this.d, this.w);
   }

   public void b(and $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public dli j() {
      return dli.n;
   }

   public amw D() {
      return this.s == null ? amw.b : this.s.get();
   }

   public void b(Supplier<amw> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dgv::ay_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof and $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dgv> void b(T $$0, and $$1) {
      cwq $$2 = $$0.r().b();
      if ($$2 instanceof czi) {
         dnt $$3 = ((czi)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(iz.a($$0.aB_().v())).a($$3);
         }
      }
   }

   private <T extends dgv> void c(T $$0) {
      djh $$1 = $$0.r();
      dgw<T> $$2 = $$1.a(this.r, (dgx<T>)$$0.v());
      if ($$2 == null) {
         this.l($$0.aB_());
      } else {
         this.p.compute($$0.aB_(), ($$2x, $$3) -> {
            dim $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dlo.d)$$3;
            } else if (this.K()) {
               dlo.d $$5 = new dlo.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dgv> dim a(T $$0, dgw<T> $$1) {
      return new dlo.a<>($$0, $$1);
   }

   class a<T extends dgv> implements dim {
      private final T b;
      private final dgw<T> c;
      private boolean d;

      a(T $$0, dgw<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.s() && this.b.n()) {
            hx $$0 = this.b.aB_();
            if (dlo.this.k($$0)) {
               try {
                  bgs $$1 = dlo.this.r.af();
                  $$1.a(this::d);
                  djh $$2 = dlo.this.a_($$0);
                  if (this.b.v().a($$2)) {
                     this.c.tick(dlo.this.r, this.b.aB_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dlo.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return this.b.aB_();
      }

      @Override
      public String d() {
         return dgx.a(this.b.v()).toString();
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
      void run(dlo var1);
   }

   class d implements dim {
      private dim b;

      d(dim $$0) {
         this.b = $$0;
      }

      void a(dim $$0) {
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
