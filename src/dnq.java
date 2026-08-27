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

public class dnq extends dnf {
   static final Logger n = LogUtils.getLogger();
   private static final dko o = new dko() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public hz c() {
         return hz.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<hz, dnq.d> p = Maps.newHashMap();
   private boolean q;
   final cvr r;
   @Nullable
   private Supplier<aop> s;
   @Nullable
   private dnq.c t;
   private final Int2ObjectMap<dpz> u;
   private final epl<cys> v;
   private final epl<egv> w;

   public dnq(cvr $$0, cuy $$1) {
      this($$0, $$1, dod.a, new epl<>(), new epl<>(), 0L, null, null, null);
   }

   public dnq(cvr $$0, cuy $$1, dod $$2, epl<cys> $$3, epl<egv> $$4, long $$5, @Nullable dnr[] $$6, @Nullable dnq.c $$7, @Nullable dry $$8) {
      super($$1, $$2, $$0, $$0.I_().d(kg.at), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dqv.a $$9 : dqv.a.values()) {
         if (dnk.n.h().contains($$9)) {
            this.h.put($$9, new dqv(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dnq(aow $$0, doa $$1, @Nullable dnq.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dix $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dqv.a, dqv> $$5 : $$1.e()) {
         if (dnk.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public ept<cys> o() {
      return this.v;
   }

   @Override
   public ept<egv> p() {
      return this.w;
   }

   @Override
   public dnf.a q() {
      return new dnf.a(this.v, this.w);
   }

   @Override
   public dpz a(int $$0) {
      return this.r instanceof aow $$1 ? (dpz)this.u.computeIfAbsent($$0, $$2 -> new dpv($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public dlj a_(hz $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ag()) {
         dlj $$4 = null;
         if ($$2 == 60) {
            $$4 = cyu.hW.o();
         }

         if ($$2 == 70) {
            $$4 = dqm.a($$1, $$3);
         }

         return $$4 == null ? cyu.a.o() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dnr $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return cyu.a.o();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public egw b_(hz $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public egw a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dnr $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return egx.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public dlj a(hz $$0, dlj $$1, boolean $$2) {
      int $$3 = $$0.v();
      dnr $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dlj $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            cys $$10 = $$1.b();
            this.h.get(dqv.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dqv.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dqv.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dqv.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.L().p().a($$0, $$11);
            }

            if (egn.a(this, $$0, $$9, $$1)) {
               bin $$12 = this.r.ae();
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
                  dix $$14 = this.a($$0, dnq.b.c);
                  if ($$14 == null) {
                     $$14 = ((dbk)$$10).a($$0, $$1);
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
   public void a(bnq $$0) {
   }

   @Nullable
   private dix h(hz $$0) {
      dlj $$1 = this.a_($$0);
      return !$$1.t() ? null : ((dbk)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dix c_(hz $$0) {
      return this.a($$0, dnq.b.c);
   }

   @Nullable
   public dix a(hz $$0, dnq.b $$1) {
      dix $$2 = this.k.get($$0);
      if ($$2 == null) {
         sw $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dix $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dnq.b.a) {
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

   public void b(dix $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof aow $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean K() {
      return this.q || this.r.y_();
   }

   boolean k(hz $$0) {
      if (!this.r.D_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof aow $$1) ? true : this.D().a(aop.c) && $$1.c(cuy.a($$0));
      }
   }

   @Override
   public void a(dix $$0) {
      hz $$1 = $$0.aE_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.t();
         dix $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.aB_();
         }
      }
   }

   @Nullable
   @Override
   public sw g(hz $$0) {
      dix $$1 = this.c_($$0);
      if ($$1 != null && !$$1.s()) {
         sw $$2 = $$1.o();
         $$2.a("keepPacked", false);
         return $$2;
      } else {
         sw $$3 = this.j.get($$0);
         if ($$3 != null) {
            $$3 = $$3.h();
            $$3.a("keepPacked", true);
         }

         return $$3;
      }
   }

   @Override
   public void d(hz $$0) {
      if (this.K()) {
         dix $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof aow $$2) {
               this.a($$1, $$2);
            }

            $$1.aB_();
         }
      }

      this.l($$0);
   }

   private <T extends dix> void a(T $$0, aow $$1) {
      cys $$2 = $$0.r().b();
      if ($$2 instanceof dbk) {
         dpy $$3 = ((dbk)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = jb.a($$0.aE_().v());
            dpz $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void l(hz $$0) {
      dnq.d $$1 = this.p.remove($$0);
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

   public void a(uq $$0, sw $$1, Consumer<abq.b> $$2) {
      this.I();

      for (dnr $$3 : this.m) {
         $$3.a($$0);
      }

      for (dqv.a $$4 : dqv.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dix $$3 = this.a($$0x, dnq.b.a);
         if ($$3 != null && $$2x != null && $$3.v() == $$1x) {
            $$3.a($$2x);
         }
      });
   }

   public void a(uq $$0) {
      for (dnr $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public cvr F() {
      return this.r;
   }

   public Map<hz, dix> G() {
      return this.k;
   }

   public void H() {
      cuy $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               hz $$3 = doa.a($$2, this.g($$1), $$0);
               dlj $$4 = this.a_($$3);
               egw $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof ddh)) {
                  dlj $$6 = cys.b($$4, this.r, $$3);
                  this.r.a($$3, $$6, 20);
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         hz $$7 = (hz)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private dix a(hz $$0, sw $$1) {
      dlj $$2 = this.a_($$0);
      dix $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((dbk)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dix.a($$0, $$2, $$1);
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

   public void a(aow $$0) {
      $$0.m().a(this.d, this.v);
      $$0.n().a(this.d, this.w);
   }

   public void b(aow $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public dnk j() {
      return dnk.n;
   }

   public aop D() {
      return this.s == null ? aop.b : this.s.get();
   }

   public void b(Supplier<aop> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dix::aB_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof aow $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dix> void b(T $$0, aow $$1) {
      cys $$2 = $$0.r().b();
      if ($$2 instanceof dbk) {
         dpy $$3 = ((dbk)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(jb.a($$0.aE_().v())).a($$3);
         }
      }
   }

   private <T extends dix> void c(T $$0) {
      dlj $$1 = $$0.r();
      diy<T> $$2 = $$1.a(this.r, (diz<T>)$$0.v());
      if ($$2 == null) {
         this.l($$0.aE_());
      } else {
         this.p.compute($$0.aE_(), ($$2x, $$3) -> {
            dko $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dnq.d)$$3;
            } else if (this.K()) {
               dnq.d $$5 = new dnq.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dix> dko a(T $$0, diy<T> $$1) {
      return new dnq.a<>($$0, $$1);
   }

   class a<T extends dix> implements dko {
      private final T b;
      private final diy<T> c;
      private boolean d;

      a(T $$0, diy<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.s() && this.b.n()) {
            hz $$0 = this.b.aE_();
            if (dnq.this.k($$0)) {
               try {
                  bin $$1 = dnq.this.r.ae();
                  $$1.a(this::d);
                  dlj $$2 = dnq.this.a_($$0);
                  if (this.b.v().a($$2)) {
                     this.c.tick(dnq.this.r, this.b.aE_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dnq.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
      public hz c() {
         return this.b.aE_();
      }

      @Override
      public String d() {
         return diz.a(this.b.v()).toString();
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
      void run(dnq var1);
   }

   class d implements dko {
      private dko b;

      d(dko $$0) {
         this.b = $$0;
      }

      void a(dko $$0) {
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
      public hz c() {
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
