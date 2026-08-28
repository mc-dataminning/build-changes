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

public class dzz extends dzp {
   static final Logger o = LogUtils.getLogger();
   private static final dwr p = new dwr() {
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
   private final Map<jh, dzz.d> q = Maps.newHashMap();
   private boolean r;
   final dhh s;
   @Nullable
   private Supplier<arw> t;
   @Nullable
   private dzz.c u;
   private final Int2ObjectMap<ect> v;
   private final fdk<dkl> w;
   private final fdk<etv> x;

   public dzz(dhh $$0, dgn $$1) {
      this($$0, $$1, eam.a, new fdk<>(), new fdk<>(), 0L, null, null, null);
   }

   public dzz(dhh $$0, dgn $$1, eam $$2, fdk<dkl> $$3, fdk<etv> $$4, long $$5, @Nullable eaa[] $$6, @Nullable dzz.c $$7, @Nullable ees $$8) {
      super($$1, $$2, $$0, $$0.K_().e(mb.aI), $$5, $$6, $$8);
      this.s = $$0;
      this.v = new Int2ObjectOpenHashMap();

      for (edp.a $$9 : edp.a.values()) {
         if (eaq.n.e().contains($$9)) {
            this.i.put($$9, new edp(this, $$9));
         }
      }

      this.u = $$7;
      this.w = $$3;
      this.x = $$4;
   }

   public dzz(ash $$0, eaj $$1, @Nullable dzz.c $$2) {
      this($$0, $$1.f(), $$1.q(), $$1.H(), $$1.I(), $$1.t(), $$1.d(), $$2, $$1.s());

      for (duw $$3 : $$1.E().values()) {
         this.a($$3);
      }

      this.k.putAll($$1.G());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<edp.a, edp> $$5 : $$1.e()) {
         if (eaq.n.e().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.j = $$1.j;
      this.b($$1.u());
      this.c = true;
   }

   @Override
   public fds<dkl> o() {
      return this.w;
   }

   @Override
   public fds<etv> p() {
      return this.x;
   }

   @Override
   public dzp.a a(long $$0) {
      return new dzp.a(this.w.a($$0), this.x.a($$0));
   }

   @Override
   public ect a(int $$0) {
      return this.s instanceof ash $$1 ? (ect)this.v.computeIfAbsent($$0, $$2 -> new ecp($$1, $$0, this::i)) : super.a($$0);
   }

   @Override
   public dxu a_(jh $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.s.ai()) {
         dxu $$4 = null;
         if ($$2 == 60) {
            $$4 = dkn.in.m();
         }

         if ($$2 == 70) {
            $$4 = edg.a($$1, $$3);
         }

         return $$4 == null ? dkn.a.m() : $$4;
      } else {
         try {
            int $$5 = this.f($$2);
            if ($$5 >= 0 && $$5 < this.n.length) {
               eaa $$6 = this.n[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dkn.a.m();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }

   @Override
   public etw b_(jh $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public etw a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.f($$1);
         if ($$3 >= 0 && $$3 < this.n.length) {
            eaa $$4 = this.n[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return etx.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$6);
      }
   }

   @Nullable
   @Override
   public dxu a(jh $$0, dxu $$1, boolean $$2) {
      int $$3 = $$0.v();
      eaa $$4 = this.b(this.f($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.l()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dxu $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dkl $$10 = $$1.b();
            this.i.get(edp.a.e).a($$6, $$3, $$8, $$1);
            this.i.get(edp.a.f).a($$6, $$3, $$8, $$1);
            this.i.get(edp.a.d).a($$6, $$3, $$8, $$1);
            this.i.get(edp.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.s.R().p().a($$0, $$11);
               this.s.R().a(this.d.g, kj.a($$3), this.d.h, $$11);
            }

            if (etn.a($$9, $$1)) {
               bps $$12 = bpr.a();
               $$12.a("updateSkyLightSources");
               this.j.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.s.R().p().a($$0);
               $$12.c();
            }

            boolean $$13 = $$9.x();
            if (!this.s.C) {
               $$9.b(this.s, $$0, $$1, $$2);
            } else if (!$$9.a($$10) && $$13) {
               this.d($$0);
            }

            if (!$$4.a($$6, $$7, $$8).a($$10)) {
               return null;
            } else {
               if (!this.s.C) {
                  $$1.a(this.s, $$0, $$9, $$2);
               }

               if ($$1.x()) {
                  duw $$14 = this.a($$0, dzz.b.c);
                  if ($$14 != null && !$$14.b($$1)) {
                     o.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{$$0, $$14.q().a().h().a(), $$1});
                     this.d($$0);
                     $$14 = null;
                  }

                  if ($$14 == null) {
                     $$14 = ((dnf)$$10).a($$0, $$1);
                     if ($$14 != null) {
                        this.b($$14);
                     }
                  } else {
                     $$14.c($$1);
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
   public void a(bvj $$0) {
   }

   @Nullable
   private duw g(jh $$0) {
      dxu $$1 = this.a_($$0);
      return !$$1.x() ? null : ((dnf)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public duw c_(jh $$0) {
      return this.a($$0, dzz.b.c);
   }

   @Nullable
   public duw a(jh $$0, dzz.b $$1) {
      duw $$2 = this.l.get($$0);
      if ($$2 == null) {
         ux $$3 = this.k.remove($$0);
         if ($$3 != null) {
            duw $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dzz.b.a) {
            $$2 = this.g($$0);
            if ($$2 != null) {
               this.b($$2);
            }
         }
      } else if ($$2.n()) {
         this.l.remove($$0);
         return null;
      }

      return $$2;
   }

   public void b(duw $$0) {
      this.a($$0);
      if (this.I()) {
         if (this.s instanceof ash $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean I() {
      return this.r || this.s.B_();
   }

   boolean h(jh $$0) {
      if (!this.s.F_().a($$0)) {
         return false;
      } else {
         return !(this.s instanceof ash $$1) ? true : this.C().a(arw.c) && $$1.c(dgn.a($$0));
      }
   }

   @Override
   public void a(duw $$0) {
      jh $$1 = $$0.aB_();
      dxu $$2 = this.a_($$1);
      if (!$$2.x()) {
         o.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
      } else {
         dxu $$3 = $$0.m();
         if ($$2 != $$3) {
            if (!$$0.q().a($$2)) {
               o.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
               return;
            }

            if ($$2.b() != $$3.b()) {
               o.warn("Block state mismatch on block entity {} in position {}, {} != {}, updating", new Object[]{$$0, $$1, $$2, $$3});
            }

            $$0.c($$2);
         }

         $$0.a(this.s);
         $$0.o();
         duw $$4 = this.l.put($$1.j(), $$0);
         if ($$4 != null && $$4 != $$0) {
            $$4.aw_();
         }
      }
   }

   @Nullable
   @Override
   public ux a(jh $$0, js.a $$1) {
      duw $$2 = this.c_($$0);
      if ($$2 != null && !$$2.n()) {
         ux $$3 = $$2.b(this.s.K_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         ux $$4 = this.k.get($$0);
         if ($$4 != null) {
            $$4 = $$4.i();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(jh $$0) {
      if (this.I()) {
         duw $$1 = this.l.remove($$0);
         if ($$1 != null) {
            if (this.s instanceof ash $$2) {
               this.a($$1, $$2);
            }

            $$1.aw_();
         }
      }

      this.k($$0);
   }

   private <T extends duw> void a(T $$0, ash $$1) {
      dkl $$2 = $$0.m().b();
      if ($$2 instanceof dnf) {
         ecs $$3 = ((dnf)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = kj.a($$0.aB_().v());
            ect $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void i(int $$0) {
      this.v.remove($$0);
   }

   private void k(jh $$0) {
      dzz.d $$1 = this.q.remove($$0);
      if ($$1 != null) {
         $$1.a(p);
      }
   }

   public void D() {
      if (this.u != null) {
         this.u.run(this);
         this.u = null;
      }
   }

   public boolean B() {
      return false;
   }

   public void a(ws $$0, ux $$1, Consumer<aed.b> $$2) {
      this.G();

      for (eaa $$3 : this.n) {
         $$3.a($$0);
      }

      for (edp.a $$4 : edp.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.z();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         duw $$3 = this.a($$0x, dzz.b.a);
         if ($$3 != null && $$2x != null && $$3.q() == $$1x) {
            $$3.c($$2x, this.s.K_());
         }
      });
   }

   public void a(ws $$0) {
      for (eaa $$1 : this.n) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.r = $$0;
   }

   public dhh E() {
      return this.s;
   }

   public Map<jh, duw> F() {
      return this.l;
   }

   public void a(ash $$0) {
      dgn $$1 = this.f();

      for (int $$2 = 0; $$2 < this.b.length; $$2++) {
         if (this.b[$$2] != null) {
            ShortListIterator $$8 = this.b[$$2].iterator();

            while ($$8.hasNext()) {
               Short $$3 = (Short)$$8.next();
               jh $$4 = eaj.a($$3, this.h($$2), $$1);
               dxu $$5 = this.a_($$4);
               etw $$6 = $$5.y();
               if (!$$6.c()) {
                  $$6.a($$0, $$4, $$5);
               }

               if (!($$5.b() instanceof dpd)) {
                  dxu $$7 = dkl.b($$5, $$0, $$4);
                  if ($$7 != $$5) {
                     $$0.a($$4, $$7, 20);
                  }
               }
            }

            this.b[$$2].clear();
         }
      }

      UnmodifiableIterator var10 = ImmutableList.copyOf(this.k.keySet()).iterator();

      while (var10.hasNext()) {
         jh $$8 = (jh)var10.next();
         this.c_($$8);
      }

      this.k.clear();
      this.f.a(this);
   }

   @Nullable
   private duw a(jh $$0, ux $$1) {
      dxu $$2 = this.a_($$0);
      duw $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.x()) {
            $$3 = ((dnf)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            o.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = duw.a($$0, $$2, $$1, this.s.K_());
      }

      if ($$3 != null) {
         $$3.a(this.s);
         this.b($$3);
      } else {
         o.warn("Tried to load a block entity for block {} but failed at location {}", $$2, $$0);
      }

      return $$3;
   }

   public void d(long $$0) {
      this.w.b($$0);
      this.x.b($$0);
   }

   public void b(ash $$0) {
      $$0.n().a(this.d, this.w);
      $$0.o().a(this.d, this.x);
   }

   public void c(ash $$0) {
      $$0.n().a(this.d);
      $$0.o().a(this.d);
   }

   @Override
   public eaq j() {
      return eaq.n;
   }

   public arw C() {
      return this.t == null ? arw.b : this.t.get();
   }

   public void b(Supplier<arw> $$0) {
      this.t = $$0;
   }

   public void G() {
      this.l.values().forEach(duw::aw_);
      this.l.clear();
      this.q.values().forEach($$0 -> $$0.a(p));
      this.q.clear();
   }

   public void H() {
      this.l.values().forEach($$0 -> {
         if (this.s instanceof ash $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends duw> void b(T $$0, ash $$1) {
      dkl $$2 = $$0.m().b();
      if ($$2 instanceof dnf) {
         ecs $$3 = ((dnf)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(kj.a($$0.aB_().v())).a($$3);
         }
      }
   }

   private <T extends duw> void c(T $$0) {
      dxu $$1 = $$0.m();
      dux<T> $$2 = $$1.a(this.s, (duy<T>)$$0.q());
      if ($$2 == null) {
         this.k($$0.aB_());
      } else {
         this.q.compute($$0.aB_(), ($$2x, $$3) -> {
            dwr $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dzz.d)$$3;
            } else if (this.I()) {
               dzz.d $$5 = new dzz.d($$4);
               this.s.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends duw> dwr a(T $$0, dux<T> $$1) {
      return new dzz.a<>($$0, $$1);
   }

   class a<T extends duw> implements dwr {
      private final T b;
      private final dux<T> c;
      private boolean d;

      a(final T $$0, final dux<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.n() && this.b.l()) {
            jh $$0 = this.b.aB_();
            if (dzz.this.h($$0)) {
               try {
                  bps $$1 = bpr.a();
                  $$1.a(this::d);
                  dxu $$2 = dzz.this.a_($$0);
                  if (this.b.q().a($$2)) {
                     this.c.tick(dzz.this.s, this.b.aB_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dzz.o.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return duy.a(this.b.q()).toString();
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
      void run(dzz var1);
   }

   class d implements dwr {
      private dwr a;

      d(final dwr $$0) {
         this.a = $$0;
      }

      void a(dwr $$0) {
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
}
