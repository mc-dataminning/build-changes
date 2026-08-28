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

public class dzt extends dzj {
   static final Logger n = LogUtils.getLogger();
   private static final dwl o = new dwl() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public jh c() {
         return jh.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<jh, dzt.d> p = Maps.newHashMap();
   private boolean q;
   final dgz r;
   @Nullable
   private Supplier<arm> s;
   @Nullable
   private dzt.c t;
   private final Int2ObjectMap<ecn> u;
   private final fde<dkd> v;
   private final fde<etp> w;
   private dzt.e x = $$0x -> {
   };

   public dzt(dgz $$0, dgf $$1) {
      this($$0, $$1, eag.a, new fde<>(), new fde<>(), 0L, null, null, null);
   }

   public dzt(dgz $$0, dgf $$1, eag $$2, fde<dkd> $$3, fde<etp> $$4, long $$5, @Nullable dzu[] $$6, @Nullable dzt.c $$7, @Nullable eem $$8) {
      super($$1, $$2, $$0, $$0.K_().e(mb.aI), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (edj.a $$9 : edj.a.values()) {
         if (eak.n.e().contains($$9)) {
            this.h.put($$9, new edj(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dzt(arx $$0, ead $$1, @Nullable dzt.c $$2) {
      this($$0, $$1.f(), $$1.t(), $$1.K(), $$1.L(), $$1.w(), $$1.d(), $$2, $$1.v());

      for (duq $$3 : $$1.H().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.J());

      for (int $$4 = 0; $$4 < $$1.p().length; $$4++) {
         this.b[$$4] = $$1.p()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<edj.a, edj> $$5 : $$1.e()) {
         if (eak.n.e().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.a($$1.x());
      this.i();
   }

   public void a(dzt.e $$0) {
      this.x = $$0;
      if (this.k()) {
         $$0.setUnsaved(this.c);
      }
   }

   @Override
   public void i() {
      boolean $$0 = this.k();
      super.i();
      if (!$$0) {
         this.x.setUnsaved(this.c);
      }
   }

   @Override
   public fdm<dkd> q() {
      return this.v;
   }

   @Override
   public fdm<etp> r() {
      return this.w;
   }

   @Override
   public dzj.a a(long $$0) {
      return new dzj.a(this.v.a($$0), this.w.a($$0));
   }

   @Override
   public ecn a(int $$0) {
      return this.r instanceof arx $$1 ? (ecn)this.u.computeIfAbsent($$0, $$2 -> new ecj($$1, $$0, this::i)) : super.a($$0);
   }

   @Override
   public dxo a_(jh $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.aj()) {
         dxo $$4 = null;
         if ($$2 == 60) {
            $$4 = dkf.iu.m();
         }

         if ($$2 == 70) {
            $$4 = eda.a($$1, $$3);
         }

         return $$4 == null ? dkf.a.m() : $$4;
      } else {
         try {
            int $$5 = this.f($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dzu $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dkf.a.m();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }

   @Override
   public etq b_(jh $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public etq a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.f($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dzu $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return etr.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$6);
      }
   }

   @Nullable
   @Override
   public dxo a(jh $$0, dxo $$1, boolean $$2) {
      int $$3 = $$0.v();
      dzu $$4 = this.b(this.f($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.l()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dxo $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dkd $$10 = $$1.b();
            this.h.get(edj.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(edj.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(edj.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(edj.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.S().p().a($$0, $$11);
               this.r.S().a(this.c.h, kj.a($$3), this.c.i, $$11);
            }

            if (eth.a($$9, $$1)) {
               bpj $$12 = bpi.a();
               $$12.a("updateSkyLightSources");
               this.i.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.r.S().p().a($$0);
               $$12.c();
            }

            boolean $$13 = $$9.x();
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

               if ($$1.x()) {
                  duq $$14 = this.a($$0, dzt.b.c);
                  if ($$14 != null && !$$14.b($$1)) {
                     n.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{$$0, $$14.p().a().h().a(), $$1});
                     this.d($$0);
                     $$14 = null;
                  }

                  if ($$14 == null) {
                     $$14 = ((dmw)$$10).a($$0, $$1);
                     if ($$14 != null) {
                        this.b($$14);
                     }
                  } else {
                     $$14.c($$1);
                     this.c($$14);
                  }
               }

               this.i();
               return $$9;
            }
         }
      }
   }

   @Deprecated
   @Override
   public void a(bvb $$0) {
   }

   @Nullable
   private duq g(jh $$0) {
      dxo $$1 = this.a_($$0);
      return !$$1.x() ? null : ((dmw)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public duq c_(jh $$0) {
      return this.a($$0, dzt.b.c);
   }

   @Nullable
   public duq a(jh $$0, dzt.b $$1) {
      duq $$2 = this.k.get($$0);
      if ($$2 == null) {
         um $$3 = this.j.remove($$0);
         if ($$3 != null) {
            duq $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dzt.b.a) {
            $$2 = this.g($$0);
            if ($$2 != null) {
               this.b($$2);
            }
         }
      } else if ($$2.n()) {
         this.k.remove($$0);
         return null;
      }

      return $$2;
   }

   public void b(duq $$0) {
      this.a($$0);
      if (this.L()) {
         if (this.r instanceof arx $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean L() {
      return this.q || this.r.B_();
   }

   boolean h(jh $$0) {
      if (!this.r.F_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof arx $$1) ? true : this.F().a(arm.c) && $$1.c(dgf.a($$0));
      }
   }

   @Override
   public void a(duq $$0) {
      jh $$1 = $$0.aB_();
      dxo $$2 = this.a_($$1);
      if (!$$2.x()) {
         n.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
      } else {
         dxo $$3 = $$0.m();
         if ($$2 != $$3) {
            if (!$$0.p().a($$2)) {
               n.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
               return;
            }

            if ($$2.b() != $$3.b()) {
               n.warn("Block state mismatch on block entity {} in position {}, {} != {}, updating", new Object[]{$$0, $$1, $$2, $$3});
            }

            $$0.c($$2);
         }

         $$0.a(this.r);
         $$0.o();
         duq $$4 = this.k.put($$1.j(), $$0);
         if ($$4 != null && $$4 != $$0) {
            $$4.aw_();
         }
      }
   }

   @Nullable
   @Override
   public um a(jh $$0, js.a $$1) {
      duq $$2 = this.c_($$0);
      if ($$2 != null && !$$2.n()) {
         um $$3 = $$2.b(this.r.K_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         um $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.i();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(jh $$0) {
      if (this.L()) {
         duq $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof arx $$2) {
               this.a($$1, $$2);
            }

            $$1.aw_();
         }
      }

      this.k($$0);
   }

   private <T extends duq> void a(T $$0, arx $$1) {
      dkd $$2 = $$0.m().b();
      if ($$2 instanceof dmw) {
         ecm $$3 = ((dmw)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = kj.a($$0.aB_().v());
            ecn $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void i(int $$0) {
      this.u.remove($$0);
   }

   private void k(jh $$0) {
      dzt.d $$1 = this.p.remove($$0);
      if ($$1 != null) {
         $$1.a(o);
      }
   }

   public void G() {
      if (this.t != null) {
         this.t.run(this);
         this.t = null;
      }
   }

   public boolean E() {
      return false;
   }

   public void a(wh $$0, um $$1, Consumer<ads.b> $$2) {
      this.J();

      for (dzu $$3 : this.m) {
         $$3.a($$0);
      }

      for (edj.a $$4 : edj.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.C();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         duq $$3 = this.a($$0x, dzt.b.a);
         if ($$3 != null && $$2x != null && $$3.p() == $$1x) {
            $$3.c($$2x, this.r.K_());
         }
      });
   }

   public void a(wh $$0) {
      for (dzu $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void b(boolean $$0) {
      this.q = $$0;
   }

   public dgz H() {
      return this.r;
   }

   public Map<jh, duq> I() {
      return this.k;
   }

   public void a(arx $$0) {
      dgf $$1 = this.f();

      for (int $$2 = 0; $$2 < this.b.length; $$2++) {
         if (this.b[$$2] != null) {
            ShortListIterator $$8 = this.b[$$2].iterator();

            while ($$8.hasNext()) {
               Short $$3 = (Short)$$8.next();
               jh $$4 = ead.a($$3, this.h($$2), $$1);
               dxo $$5 = this.a_($$4);
               etq $$6 = $$5.y();
               if (!$$6.c()) {
                  $$6.a($$0, $$4, $$5);
               }

               if (!($$5.b() instanceof dov)) {
                  dxo $$7 = dkd.b($$5, $$0, $$4);
                  if ($$7 != $$5) {
                     $$0.a($$4, $$7, 20);
                  }
               }
            }

            this.b[$$2].clear();
         }
      }

      UnmodifiableIterator var10 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var10.hasNext()) {
         jh $$8 = (jh)var10.next();
         this.c_($$8);
      }

      this.j.clear();
      this.e.a(this);
   }

   @Nullable
   private duq a(jh $$0, um $$1) {
      dxo $$2 = this.a_($$0);
      duq $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.x()) {
            $$3 = ((dmw)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = duq.a($$0, $$2, $$1, this.r.K_());
      }

      if ($$3 != null) {
         $$3.a(this.r);
         this.b($$3);
      } else {
         n.warn("Tried to load a block entity for block {} but failed at location {}", $$2, $$0);
      }

      return $$3;
   }

   public void d(long $$0) {
      this.v.b($$0);
      this.w.b($$0);
   }

   public void b(arx $$0) {
      $$0.n().a(this.c, this.v);
      $$0.o().a(this.c, this.w);
   }

   public void c(arx $$0) {
      $$0.n().a(this.c);
      $$0.o().a(this.c);
   }

   @Override
   public eak n() {
      return eak.n;
   }

   public arm F() {
      return this.s == null ? arm.b : this.s.get();
   }

   public void b(Supplier<arm> $$0) {
      this.s = $$0;
   }

   public void J() {
      this.k.values().forEach(duq::aw_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void K() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof arx $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends duq> void b(T $$0, arx $$1) {
      dkd $$2 = $$0.m().b();
      if ($$2 instanceof dmw) {
         ecm $$3 = ((dmw)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(kj.a($$0.aB_().v())).a($$3);
         }
      }
   }

   private <T extends duq> void c(T $$0) {
      dxo $$1 = $$0.m();
      dur<T> $$2 = $$1.a(this.r, (dus<T>)$$0.p());
      if ($$2 == null) {
         this.k($$0.aB_());
      } else {
         this.p.compute($$0.aB_(), ($$2x, $$3) -> {
            dwl $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dzt.d)$$3;
            } else if (this.L()) {
               dzt.d $$5 = new dzt.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends duq> dwl a(T $$0, dur<T> $$1) {
      return new dzt.a<>($$0, $$1);
   }

   class a<T extends duq> implements dwl {
      private final T b;
      private final dur<T> c;
      private boolean d;

      a(final T $$0, final dur<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.n() && this.b.l()) {
            jh $$0 = this.b.aB_();
            if (dzt.this.h($$0)) {
               try {
                  bpj $$1 = bpi.a();
                  $$1.a(this::d);
                  dxo $$2 = dzt.this.a_($$0);
                  if (this.b.p().a($$2)) {
                     this.c.tick(dzt.this.r, this.b.aB_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dzt.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return this.b.n();
      }

      @Override
      public jh c() {
         return this.b.aB_();
      }

      @Override
      public String d() {
         return dus.a(this.b.p()).toString();
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
      void run(dzt var1);
   }

   class d implements dwl {
      private dwl a;

      d(final dwl $$0) {
         this.a = $$0;
      }

      void a(dwl $$0) {
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
      public jh c() {
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

   @FunctionalInterface
   public interface e {
      void setUnsaved(dgf var1);
   }
}
