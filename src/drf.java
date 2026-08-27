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

public class drf extends dqv {
   static final Logger n = LogUtils.getLogger();
   private static final dnx o = new dnx() {
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
   private final Map<ib, drf.d> p = Maps.newHashMap();
   private boolean q;
   final cyx r;
   @Nullable
   private Supplier<apl> s;
   @Nullable
   private drf.c t;
   private final Int2ObjectMap<dtv> u;
   private final etm<dby> v;
   private final etm<ekr> w;

   public drf(cyx $$0, cye $$1) {
      this($$0, $$1, drs.a, new etm<>(), new etm<>(), 0L, null, null, null);
   }

   public drf(cyx $$0, cye $$1, drs $$2, etm<dby> $$3, etm<ekr> $$4, long $$5, @Nullable drg[] $$6, @Nullable drf.c $$7, @Nullable dvu $$8) {
      super($$1, $$2, $$0, $$0.H_().d(ks.av), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dur.a $$9 : dur.a.values()) {
         if (dru.n.h().contains($$9)) {
            this.h.put($$9, new dur(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public drf(aps $$0, drp $$1, @Nullable drf.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dmf $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dur.a, dur> $$5 : $$1.e()) {
         if (dru.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public etu<dby> o() {
      return this.v;
   }

   @Override
   public etu<ekr> p() {
      return this.w;
   }

   @Override
   public dqv.a q() {
      return new dqv.a(this.v, this.w);
   }

   @Override
   public dtv a(int $$0) {
      return this.r instanceof aps $$1 ? (dtv)this.u.computeIfAbsent($$0, $$2 -> new dtr($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public doz a_(ib $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ah()) {
         doz $$4 = null;
         if ($$2 == 60) {
            $$4 = dca.hW.n();
         }

         if ($$2 == 70) {
            $$4 = dui.a($$1, $$3);
         }

         return $$4 == null ? dca.a.n() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               drg $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dca.a.n();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public eks b_(ib $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public eks a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            drg $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return ekt.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public doz a(ib $$0, doz $$1, boolean $$2) {
      int $$3 = $$0.v();
      drg $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         doz $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dby $$10 = $$1.b();
            this.h.get(dur.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dur.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dur.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dur.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.M().p().a($$0, $$11);
            }

            if (ekj.a(this, $$0, $$9, $$1)) {
               bko $$12 = this.r.af();
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
                  dmf $$14 = this.a($$0, drf.b.c);
                  if ($$14 == null) {
                     $$14 = ((deq)$$10).a($$0, $$1);
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
   public void a(bpv $$0) {
   }

   @Nullable
   private dmf g(ib $$0) {
      doz $$1 = this.a_($$0);
      return !$$1.t() ? null : ((deq)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dmf c_(ib $$0) {
      return this.a($$0, drf.b.c);
   }

   @Nullable
   public dmf a(ib $$0, drf.b $$1) {
      dmf $$2 = this.k.get($$0);
      if ($$2 == null) {
         tm $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dmf $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == drf.b.a) {
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

   public void b(dmf $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof aps $$1) {
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
         return !(this.r instanceof aps $$1) ? true : this.D().a(apl.c) && $$1.c(cye.a($$0));
      }
   }

   @Override
   public void a(dmf $$0) {
      ib $$1 = $$0.aA_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.p();
         dmf $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.ax_();
         }
      }
   }

   @Nullable
   @Override
   public tm a(ib $$0, in.a $$1) {
      dmf $$2 = this.c_($$0);
      if ($$2 != null && !$$2.o()) {
         tm $$3 = $$2.b(this.r.H_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         tm $$4 = this.j.get($$0);
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
         dmf $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof aps $$2) {
               this.a($$1, $$2);
            }

            $$1.ax_();
         }
      }

      this.k($$0);
   }

   private <T extends dmf> void a(T $$0, aps $$1) {
      dby $$2 = $$0.n().b();
      if ($$2 instanceof deq) {
         dtu $$3 = ((deq)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = je.a($$0.aA_().v());
            dtv $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void k(ib $$0) {
      drf.d $$1 = this.p.remove($$0);
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

   public void a(vg $$0, tm $$1, Consumer<acj.b> $$2) {
      this.I();

      for (drg $$3 : this.m) {
         $$3.a($$0);
      }

      for (dur.a $$4 : dur.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dmf $$3 = this.a($$0x, drf.b.a);
         if ($$3 != null && $$2x != null && $$3.r() == $$1x) {
            $$3.a($$2x, this.r.H_());
         }
      });
   }

   public void a(vg $$0) {
      for (drg $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public cyx F() {
      return this.r;
   }

   public Map<ib, dmf> G() {
      return this.k;
   }

   public void H() {
      cye $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               ib $$3 = drp.a($$2, this.g($$1), $$0);
               doz $$4 = this.a_($$3);
               eks $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof dgn)) {
                  doz $$6 = dby.b($$4, this.r, $$3);
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
   private dmf a(ib $$0, tm $$1) {
      doz $$2 = this.a_($$0);
      dmf $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((deq)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dmf.a($$0, $$2, $$1, this.r.H_());
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

   public void a(aps $$0) {
      $$0.m().a(this.d, this.v);
      $$0.n().a(this.d, this.w);
   }

   public void b(aps $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public dru j() {
      return dru.n;
   }

   public apl D() {
      return this.s == null ? apl.b : this.s.get();
   }

   public void b(Supplier<apl> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dmf::ax_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof aps $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dmf> void b(T $$0, aps $$1) {
      dby $$2 = $$0.n().b();
      if ($$2 instanceof deq) {
         dtu $$3 = ((deq)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(je.a($$0.aA_().v())).a($$3);
         }
      }
   }

   private <T extends dmf> void c(T $$0) {
      doz $$1 = $$0.n();
      dmg<T> $$2 = $$1.a(this.r, (dmh<T>)$$0.r());
      if ($$2 == null) {
         this.k($$0.aA_());
      } else {
         this.p.compute($$0.aA_(), ($$2x, $$3) -> {
            dnx $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (drf.d)$$3;
            } else if (this.K()) {
               drf.d $$5 = new drf.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dmf> dnx a(T $$0, dmg<T> $$1) {
      return new drf.a<>($$0, $$1);
   }

   class a<T extends dmf> implements dnx {
      private final T b;
      private final dmg<T> c;
      private boolean d;

      a(T $$0, dmg<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.o() && this.b.m()) {
            ib $$0 = this.b.aA_();
            if (drf.this.h($$0)) {
               try {
                  bko $$1 = drf.this.r.af();
                  $$1.a(this::d);
                  doz $$2 = drf.this.a_($$0);
                  if (this.b.r().a($$2)) {
                     this.c.tick(drf.this.r, this.b.aA_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     drf.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return this.b.aA_();
      }

      @Override
      public String d() {
         return dmh.a(this.b.r()).toString();
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
      void run(drf var1);
   }

   class d implements dnx {
      private dnx b;

      d(dnx $$0) {
         this.b = $$0;
      }

      void a(dnx $$0) {
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
