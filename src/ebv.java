import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ebv extends ebl {
   static final Logger n = LogUtils.getLogger();
   private static final dyl o = new dyl() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public iu c() {
         return iu.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<iu, ebv.d> p = Maps.newHashMap();
   private boolean q;
   final dip r;
   @Nullable
   private Supplier<arc> s;
   @Nullable
   private ebv.c t;
   private final Int2ObjectMap<eer> u;
   private final ffj<dlu> v;
   private final ffj<evu> w;
   private ebv.e x = $$0x -> {
   };

   public ebv(dip $$0, dhw $$1) {
      this($$0, $$1, eci.a, new ffj<>(), new ffj<>(), 0L, null, null, null);
   }

   public ebv(dip $$0, dhw $$1, eci $$2, ffj<dlu> $$3, ffj<evu> $$4, long $$5, @Nullable ebw[] $$6, @Nullable ebv.c $$7, @Nullable egq $$8) {
      super($$1, $$2, $$0, $$0.F_().f(mg.aG), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (efn.a $$9 : efn.a.values()) {
         if (ecm.n.e().contains($$9)) {
            this.h.put($$9, new efn(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public ebv(aro $$0, ecf $$1, @Nullable ebv.c $$2) {
      this($$0, $$1.f(), $$1.t(), $$1.K(), $$1.L(), $$1.w(), $$1.d(), $$2, $$1.v());
      if (!Collections.disjoint($$1.j.keySet(), $$1.k.keySet())) {
         n.error("Chunk at {} contains duplicated block entities", $$1.f());
      }

      for (dwn $$3 : $$1.H().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.J());

      for (int $$4 = 0; $$4 < $$1.p().length; $$4++) {
         this.b[$$4] = $$1.p()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<efn.a, efn> $$5 : $$1.e()) {
         if (ecm.n.e().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.a($$1.x());
      this.i();
   }

   public void a(ebv.e $$0) {
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
   public ffr<dlu> q() {
      return this.v;
   }

   @Override
   public ffr<evu> r() {
      return this.w;
   }

   @Override
   public ebl.a a(long $$0) {
      return new ebl.a(this.v.a($$0), this.w.a($$0));
   }

   @Override
   public eer a(int $$0) {
      return this.r instanceof aro $$1 ? (eer)this.u.computeIfAbsent($$0, $$2 -> new een($$1, $$0, this::i)) : super.a($$0);
   }

   @Override
   public dzo a_(iu $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ak()) {
         dzo $$4 = null;
         if ($$2 == 60) {
            $$4 = dlw.iu.m();
         }

         if ($$2 == 70) {
            $$4 = efe.a($$1, $$3);
         }

         return $$4 == null ? dlw.a.m() : $$4;
      } else {
         try {
            int $$5 = this.f($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               ebw $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dlw.a.m();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }

   @Override
   public evv b_(iu $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public evv a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.f($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            ebw $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return evw.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$6);
      }
   }

   @Nullable
   @Override
   public dzo a(iu $$0, dzo $$1, int $$2) {
      int $$3 = $$0.v();
      ebw $$4 = this.b(this.f($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.l()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dzo $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dlu $$10 = $$1.b();
            this.h.get(efn.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(efn.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(efn.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(efn.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.S().q().a($$0, $$11);
               this.r.S().a(this.c.h, jx.a($$3), this.c.i, $$11);
            }

            if (evm.a($$9, $$1)) {
               bqj $$12 = bqi.a();
               $$12.a("updateSkyLightSources");
               this.i.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.r.S().q().a($$0);
               $$12.c();
            }

            boolean $$13 = !$$9.a($$10);
            boolean $$14 = ($$2 & 64) != 0;
            boolean $$15 = ($$2 & 256) == 0;
            if ($$13 && $$9.x()) {
               if (!this.r.C && $$15) {
                  dwn $$16 = this.r.c_($$0);
                  if ($$16 != null) {
                     $$16.a($$0, $$9);
                  }
               }

               this.d($$0);
            }

            if (($$13 || $$10 instanceof dlj) && this.r instanceof aro $$17 && (($$2 & 1) != 0 || $$14)) {
               $$9.a($$17, $$0, $$14);
            }

            if (!$$4.a($$6, $$7, $$8).a($$10)) {
               return null;
            } else {
               if (!this.r.C && $$15) {
                  $$1.a(this.r, $$0, $$9, $$14);
               }

               if ($$1.x()) {
                  dwn $$18 = this.a($$0, ebv.b.c);
                  if ($$18 != null && !$$18.b($$1)) {
                     n.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{$$0, $$18.p().a().h().a(), $$1});
                     this.d($$0);
                     $$18 = null;
                  }

                  if ($$18 == null) {
                     $$18 = ((don)$$10).a($$0, $$1);
                     if ($$18 != null) {
                        this.b($$18);
                     }
                  } else {
                     $$18.c($$1);
                     this.c($$18);
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
   public void a(bwa $$0) {
   }

   @Nullable
   private dwn g(iu $$0) {
      dzo $$1 = this.a_($$0);
      return !$$1.x() ? null : ((don)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dwn c_(iu $$0) {
      return this.a($$0, ebv.b.c);
   }

   @Nullable
   public dwn a(iu $$0, ebv.b $$1) {
      dwn $$2 = this.k.get($$0);
      if ($$2 == null) {
         tx $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dwn $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == ebv.b.a) {
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

   public void b(dwn $$0) {
      this.a($$0);
      if (this.L()) {
         if (this.r instanceof aro $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean L() {
      return this.q || this.r.w_();
   }

   boolean h(iu $$0) {
      if (!this.r.A_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof aro $$1) ? true : this.F().a(arc.c) && $$1.c(dhw.a($$0));
      }
   }

   @Override
   public void a(dwn $$0) {
      iu $$1 = $$0.aw_();
      dzo $$2 = this.a_($$1);
      if (!$$2.x()) {
         n.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
      } else {
         dzo $$3 = $$0.m();
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
         dwn $$4 = this.k.put($$1.j(), $$0);
         if ($$4 != null && $$4 != $$0) {
            $$4.ar_();
         }
      }
   }

   @Nullable
   @Override
   public tx a(iu $$0, jg.a $$1) {
      dwn $$2 = this.c_($$0);
      if ($$2 != null && !$$2.n()) {
         tx $$3 = $$2.b(this.r.F_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         tx $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.i();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(iu $$0) {
      if (this.L()) {
         dwn $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof aro $$2) {
               this.a($$1, $$2);
            }

            $$1.ar_();
         }
      }

      this.k($$0);
   }

   private <T extends dwn> void a(T $$0, aro $$1) {
      dlu $$2 = $$0.m().b();
      if ($$2 instanceof don) {
         eeq $$3 = ((don)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = jx.a($$0.aw_().v());
            eer $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void i(int $$0) {
      this.u.remove($$0);
   }

   private void k(iu $$0) {
      ebv.d $$1 = this.p.remove($$0);
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

   public void a(vs $$0, tx $$1, Consumer<add.b> $$2) {
      this.J();

      for (ebw $$3 : this.m) {
         $$3.a($$0);
      }

      for (efn.a $$4 : efn.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.C();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dwn $$3 = this.a($$0x, ebv.b.a);
         if ($$3 != null && $$2x != null && $$3.p() == $$1x) {
            $$3.c($$2x, this.r.F_());
         }
      });
   }

   public void a(vs $$0) {
      for (ebw $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void b(boolean $$0) {
      this.q = $$0;
   }

   public dip H() {
      return this.r;
   }

   public Map<iu, dwn> I() {
      return this.k;
   }

   public void a(aro $$0) {
      dhw $$1 = this.f();

      for (int $$2 = 0; $$2 < this.b.length; $$2++) {
         if (this.b[$$2] != null) {
            ShortListIterator $$8 = this.b[$$2].iterator();

            while ($$8.hasNext()) {
               Short $$3 = (Short)$$8.next();
               iu $$4 = ecf.a($$3, this.h($$2), $$1);
               dzo $$5 = this.a_($$4);
               evv $$6 = $$5.y();
               if (!$$6.c()) {
                  $$6.a($$0, $$4, $$5);
               }

               if (!($$5.b() instanceof dqo)) {
                  dzo $$7 = dlu.b($$5, $$0, $$4);
                  if ($$7 != $$5) {
                     $$0.a($$4, $$7, 276);
                  }
               }
            }

            this.b[$$2].clear();
         }
      }

      UnmodifiableIterator var10 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var10.hasNext()) {
         iu $$8 = (iu)var10.next();
         this.c_($$8);
      }

      this.j.clear();
      this.e.a(this);
   }

   @Nullable
   private dwn a(iu $$0, tx $$1) {
      dzo $$2 = this.a_($$0);
      dwn $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.x()) {
            $$3 = ((don)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dwn.a($$0, $$2, $$1, this.r.F_());
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

   public void b(aro $$0) {
      $$0.n().a(this.c, this.v);
      $$0.o().a(this.c, this.w);
   }

   public void c(aro $$0) {
      $$0.n().a(this.c);
      $$0.o().a(this.c);
   }

   @Override
   public ecm n() {
      return ecm.n;
   }

   public arc F() {
      return this.s == null ? arc.b : this.s.get();
   }

   public void b(Supplier<arc> $$0) {
      this.s = $$0;
   }

   public void J() {
      this.k.values().forEach(dwn::ar_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void K() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof aro $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dwn> void b(T $$0, aro $$1) {
      dlu $$2 = $$0.m().b();
      if ($$2 instanceof don) {
         eeq $$3 = ((don)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(jx.a($$0.aw_().v())).a($$3);
         }
      }
   }

   private <T extends dwn> void c(T $$0) {
      dzo $$1 = $$0.m();
      dwo<T> $$2 = $$1.a(this.r, (dwp<T>)$$0.p());
      if ($$2 == null) {
         this.k($$0.aw_());
      } else {
         this.p.compute($$0.aw_(), ($$2x, $$3) -> {
            dyl $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (ebv.d)$$3;
            } else if (this.L()) {
               ebv.d $$5 = new ebv.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dwn> dyl a(T $$0, dwo<T> $$1) {
      return new ebv.a<>($$0, $$1);
   }

   class a<T extends dwn> implements dyl {
      private final T b;
      private final dwo<T> c;
      private boolean d;

      a(final T $$0, final dwo<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.n() && this.b.l()) {
            iu $$0 = this.b.aw_();
            if (ebv.this.h($$0)) {
               try {
                  bqj $$1 = bqi.a();
                  $$1.a(this::d);
                  dzo $$2 = ebv.this.a_($$0);
                  if (this.b.p().a($$2)) {
                     this.c.tick(ebv.this.r, this.b.aw_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     ebv.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
      public iu c() {
         return this.b.aw_();
      }

      @Override
      public String d() {
         return dwp.a(this.b.p()).toString();
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
      void run(ebv var1);
   }

   static class d implements dyl {
      private dyl a;

      d(dyl $$0) {
         this.a = $$0;
      }

      void a(dyl $$0) {
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
      public iu c() {
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
      void setUnsaved(dhw var1);
   }
}
