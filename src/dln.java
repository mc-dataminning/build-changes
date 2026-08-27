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

public class dln extends dlc {
   static final Logger n = LogUtils.getLogger();
   private static final dil o = new dil() {
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
   private final Map<hx, dln.d> p = Maps.newHashMap();
   private boolean q;
   final cto r;
   @Nullable
   private Supplier<amw> s;
   @Nullable
   private dln.c t;
   private final Int2ObjectMap<dnt> u;
   private final ene<cwp> v;
   private final ene<eep> w;

   public dln(cto $$0, csv $$1) {
      this($$0, $$1, dma.a, new ene<>(), new ene<>(), 0L, null, null, null);
   }

   public dln(cto $$0, csv $$1, dma $$2, ene<cwp> $$3, ene<eep> $$4, long $$5, @Nullable dlo[] $$6, @Nullable dln.c $$7, @Nullable dps $$8) {
      super($$1, $$2, $$0, $$0.I_().d(ke.at), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dop.a $$9 : dop.a.values()) {
         if (dlh.n.h().contains($$9)) {
            this.h.put($$9, new dop(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dln(and $$0, dlx $$1, @Nullable dln.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dgu $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dop.a, dop> $$5 : $$1.e()) {
         if (dlh.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public enm<cwp> o() {
      return this.v;
   }

   @Override
   public enm<eep> p() {
      return this.w;
   }

   @Override
   public dlc.a q() {
      return new dlc.a(this.v, this.w);
   }

   @Override
   public dnt a(int $$0) {
      return this.r instanceof and $$1 ? (dnt)this.u.computeIfAbsent($$0, $$2 -> new dnp($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public djg a_(hx $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ah()) {
         djg $$4 = null;
         if ($$2 == 60) {
            $$4 = cwr.hW.o();
         }

         if ($$2 == 70) {
            $$4 = dog.a($$1, $$3);
         }

         return $$4 == null ? cwr.a.o() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dlo $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return cwr.a.o();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public eeq b_(hx $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public eeq a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dlo $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return eer.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public djg a(hx $$0, djg $$1, boolean $$2) {
      int $$3 = $$0.v();
      dlo $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         djg $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            cwp $$10 = $$1.b();
            this.h.get(dop.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dop.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dop.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dop.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.L().p().a($$0, $$11);
            }

            if (eeh.a(this, $$0, $$9, $$1)) {
               bgr $$12 = this.r.af();
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
                  dgu $$14 = this.a($$0, dln.b.c);
                  if ($$14 == null) {
                     $$14 = ((czh)$$10).a($$0, $$1);
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
   public void a(blu $$0) {
   }

   @Nullable
   private dgu h(hx $$0) {
      djg $$1 = this.a_($$0);
      return !$$1.t() ? null : ((czh)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dgu c_(hx $$0) {
      return this.a($$0, dln.b.c);
   }

   @Nullable
   public dgu a(hx $$0, dln.b $$1) {
      dgu $$2 = this.k.get($$0);
      if ($$2 == null) {
         sn $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dgu $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dln.b.a) {
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

   public void b(dgu $$0) {
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
         return !(this.r instanceof and $$1) ? true : this.D().a(amw.c) && $$1.c(csv.a($$0));
      }
   }

   @Override
   public void a(dgu $$0) {
      hx $$1 = $$0.aB_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.t();
         dgu $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.ay_();
         }
      }
   }

   @Nullable
   @Override
   public sn g(hx $$0) {
      dgu $$1 = this.c_($$0);
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
         dgu $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof and $$2) {
               this.a($$1, $$2);
            }

            $$1.ay_();
         }
      }

      this.l($$0);
   }

   private <T extends dgu> void a(T $$0, and $$1) {
      cwp $$2 = $$0.r().b();
      if ($$2 instanceof czh) {
         dns $$3 = ((czh)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = iz.a($$0.aB_().v());
            dnt $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void l(hx $$0) {
      dln.d $$1 = this.p.remove($$0);
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

      for (dlo $$3 : this.m) {
         $$3.a($$0);
      }

      for (dop.a $$4 : dop.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dgu $$3 = this.a($$0x, dln.b.a);
         if ($$3 != null && $$2x != null && $$3.v() == $$1x) {
            $$3.a($$2x);
         }
      });
   }

   public void a(ui $$0) {
      for (dlo $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public cto F() {
      return this.r;
   }

   public Map<hx, dgu> G() {
      return this.k;
   }

   public void H() {
      csv $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               hx $$3 = dlx.a($$2, this.g($$1), $$0);
               djg $$4 = this.a_($$3);
               eeq $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof dbe)) {
                  djg $$6 = cwp.b($$4, this.r, $$3);
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
   private dgu a(hx $$0, sn $$1) {
      djg $$2 = this.a_($$0);
      dgu $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((czh)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dgu.a($$0, $$2, $$1);
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
   public dlh j() {
      return dlh.n;
   }

   public amw D() {
      return this.s == null ? amw.b : this.s.get();
   }

   public void b(Supplier<amw> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dgu::ay_);
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

   private <T extends dgu> void b(T $$0, and $$1) {
      cwp $$2 = $$0.r().b();
      if ($$2 instanceof czh) {
         dns $$3 = ((czh)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(iz.a($$0.aB_().v())).a($$3);
         }
      }
   }

   private <T extends dgu> void c(T $$0) {
      djg $$1 = $$0.r();
      dgv<T> $$2 = $$1.a(this.r, (dgw<T>)$$0.v());
      if ($$2 == null) {
         this.l($$0.aB_());
      } else {
         this.p.compute($$0.aB_(), ($$2x, $$3) -> {
            dil $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dln.d)$$3;
            } else if (this.K()) {
               dln.d $$5 = new dln.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dgu> dil a(T $$0, dgv<T> $$1) {
      return new dln.a<>($$0, $$1);
   }

   class a<T extends dgu> implements dil {
      private final T b;
      private final dgv<T> c;
      private boolean d;

      a(T $$0, dgv<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.s() && this.b.n()) {
            hx $$0 = this.b.aB_();
            if (dln.this.k($$0)) {
               try {
                  bgr $$1 = dln.this.r.af();
                  $$1.a(this::d);
                  djg $$2 = dln.this.a_($$0);
                  if (this.b.v().a($$2)) {
                     this.c.tick(dln.this.r, this.b.aB_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dln.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return dgw.a(this.b.v()).toString();
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
      void run(dln var1);
   }

   class d implements dil {
      private dil b;

      d(dil $$0) {
         this.b = $$0;
      }

      void a(dil $$0) {
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
