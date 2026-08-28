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

public class eco extends ece {
   static final Logger n = LogUtils.getLogger();
   private static final dzd o = new dzd() {
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
   private final Map<iu, eco.d> p = Maps.newHashMap();
   private boolean q;
   final dja r;
   @Nullable
   private Supplier<are> s;
   @Nullable
   private eco.c t;
   private final Int2ObjectMap<efk> u;
   private final fgd<dmf> v;
   private final fgd<ewn> w;
   private eco.e x = $$0x -> {
   };

   public eco(dja $$0, dih $$1) {
      this($$0, $$1, edb.a, new fgd<>(), new fgd<>(), 0L, null, null, null);
   }

   public eco(dja $$0, dih $$1, edb $$2, fgd<dmf> $$3, fgd<ewn> $$4, long $$5, @Nullable ecp[] $$6, @Nullable eco.c $$7, @Nullable ehj $$8) {
      super($$1, $$2, $$0, $$0.F_().f(mg.aG), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (egg.a $$9 : egg.a.values()) {
         if (edf.n.e().contains($$9)) {
            this.h.put($$9, new egg(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public eco(arq $$0, ecy $$1, @Nullable eco.c $$2) {
      this($$0, $$1.f(), $$1.t(), $$1.K(), $$1.L(), $$1.w(), $$1.d(), $$2, $$1.v());
      if (!Collections.disjoint($$1.j.keySet(), $$1.k.keySet())) {
         n.error("Chunk at {} contains duplicated block entities", $$1.f());
      }

      for (dxf $$3 : $$1.H().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.J());

      for (int $$4 = 0; $$4 < $$1.p().length; $$4++) {
         this.b[$$4] = $$1.p()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<egg.a, egg> $$5 : $$1.e()) {
         if (edf.n.e().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.a($$1.x());
      this.i();
   }

   public void a(eco.e $$0) {
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
   public fgl<dmf> q() {
      return this.v;
   }

   @Override
   public fgl<ewn> r() {
      return this.w;
   }

   @Override
   public ece.a a(long $$0) {
      return new ece.a(this.v.a($$0), this.w.a($$0));
   }

   @Override
   public efk a(int $$0) {
      return this.r instanceof arq $$1 ? (efk)this.u.computeIfAbsent($$0, $$2 -> new efg($$1, $$0, this::i)) : super.a($$0);
   }

   @Override
   public eah a_(iu $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ak()) {
         eah $$4 = null;
         if ($$2 == 60) {
            $$4 = dmh.iy.m();
         }

         if ($$2 == 70) {
            $$4 = efx.a($$1, $$3);
         }

         return $$4 == null ? dmh.a.m() : $$4;
      } else {
         try {
            int $$5 = this.f($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               ecp $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dmh.a.m();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }

   @Override
   public ewo b_(iu $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public ewo a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.f($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            ecp $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return ewp.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$6);
      }
   }

   @Nullable
   @Override
   public eah a(iu $$0, eah $$1, int $$2) {
      int $$3 = $$0.v();
      ecp $$4 = this.b(this.f($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.l()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         eah $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dmf $$10 = $$1.b();
            this.h.get(egg.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(egg.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(egg.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(egg.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.S().q().a($$0, $$11);
               this.r.S().a(this.c.h, jx.a($$3), this.c.i, $$11);
            }

            if (ewf.a($$9, $$1)) {
               bqo $$12 = bqn.a();
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
                  dxf $$16 = this.r.c_($$0);
                  if ($$16 != null) {
                     $$16.a($$0, $$9);
                  }
               }

               this.d($$0);
            }

            if (($$13 || $$10 instanceof dlu) && this.r instanceof arq $$17 && (($$2 & 1) != 0 || $$14)) {
               $$9.a($$17, $$0, $$14);
            }

            if (!$$4.a($$6, $$7, $$8).a($$10)) {
               return null;
            } else {
               if (!this.r.C && ($$2 & 512) == 0) {
                  $$1.a(this.r, $$0, $$9, $$14);
               }

               if ($$1.x()) {
                  dxf $$18 = this.a($$0, eco.b.c);
                  if ($$18 != null && !$$18.b($$1)) {
                     n.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{$$0, $$18.p().a().h().a(), $$1});
                     this.d($$0);
                     $$18 = null;
                  }

                  if ($$18 == null) {
                     $$18 = ((doz)$$10).a($$0, $$1);
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
   public void a(bwf $$0) {
   }

   @Nullable
   private dxf g(iu $$0) {
      eah $$1 = this.a_($$0);
      return !$$1.x() ? null : ((doz)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dxf c_(iu $$0) {
      return this.a($$0, eco.b.c);
   }

   @Nullable
   public dxf a(iu $$0, eco.b $$1) {
      dxf $$2 = this.k.get($$0);
      if ($$2 == null) {
         tz $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dxf $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == eco.b.a) {
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

   public void b(dxf $$0) {
      this.a($$0);
      if (this.L()) {
         if (this.r instanceof arq $$1) {
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
         return !(this.r instanceof arq $$1) ? true : this.F().a(are.c) && $$1.c(dih.a($$0));
      }
   }

   @Override
   public void a(dxf $$0) {
      iu $$1 = $$0.ax_();
      eah $$2 = this.a_($$1);
      if (!$$2.x()) {
         n.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
      } else {
         eah $$3 = $$0.m();
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
         dxf $$4 = this.k.put($$1.j(), $$0);
         if ($$4 != null && $$4 != $$0) {
            $$4.as_();
         }
      }
   }

   @Nullable
   @Override
   public tz a(iu $$0, jg.a $$1) {
      dxf $$2 = this.c_($$0);
      if ($$2 != null && !$$2.n()) {
         tz $$3 = $$2.b(this.r.F_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         tz $$4 = this.j.get($$0);
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
         dxf $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof arq $$2) {
               this.a($$1, $$2);
            }

            $$1.as_();
         }
      }

      this.k($$0);
   }

   private <T extends dxf> void a(T $$0, arq $$1) {
      dmf $$2 = $$0.m().b();
      if ($$2 instanceof doz) {
         efj $$3 = ((doz)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = jx.a($$0.ax_().v());
            efk $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void i(int $$0) {
      this.u.remove($$0);
   }

   private void k(iu $$0) {
      eco.d $$1 = this.p.remove($$0);
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

   public void a(vu $$0, tz $$1, Consumer<adf.b> $$2) {
      this.J();

      for (ecp $$3 : this.m) {
         $$3.a($$0);
      }

      for (egg.a $$4 : egg.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.C();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dxf $$3 = this.a($$0x, eco.b.a);
         if ($$3 != null && $$2x != null && $$3.p() == $$1x) {
            $$3.c($$2x, this.r.F_());
         }
      });
   }

   public void a(vu $$0) {
      for (ecp $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void b(boolean $$0) {
      this.q = $$0;
   }

   public dja H() {
      return this.r;
   }

   public Map<iu, dxf> I() {
      return this.k;
   }

   public void a(arq $$0) {
      dih $$1 = this.f();

      for (int $$2 = 0; $$2 < this.b.length; $$2++) {
         if (this.b[$$2] != null) {
            ShortListIterator $$8 = this.b[$$2].iterator();

            while ($$8.hasNext()) {
               Short $$3 = (Short)$$8.next();
               iu $$4 = ecy.a($$3, this.h($$2), $$1);
               eah $$5 = this.a_($$4);
               ewo $$6 = $$5.y();
               if (!$$6.c()) {
                  $$6.a($$0, $$4, $$5);
               }

               if (!($$5.b() instanceof drb)) {
                  eah $$7 = dmf.b($$5, $$0, $$4);
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
   private dxf a(iu $$0, tz $$1) {
      eah $$2 = this.a_($$0);
      dxf $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.x()) {
            $$3 = ((doz)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dxf.a($$0, $$2, $$1, this.r.F_());
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

   public void b(arq $$0) {
      $$0.n().a(this.c, this.v);
      $$0.o().a(this.c, this.w);
   }

   public void c(arq $$0) {
      $$0.n().a(this.c);
      $$0.o().a(this.c);
   }

   @Override
   public edf n() {
      return edf.n;
   }

   public are F() {
      return this.s == null ? are.b : this.s.get();
   }

   public void b(Supplier<are> $$0) {
      this.s = $$0;
   }

   public void J() {
      this.k.values().forEach(dxf::as_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void K() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof arq $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dxf> void b(T $$0, arq $$1) {
      dmf $$2 = $$0.m().b();
      if ($$2 instanceof doz) {
         efj $$3 = ((doz)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(jx.a($$0.ax_().v())).a($$3);
         }
      }
   }

   private <T extends dxf> void c(T $$0) {
      eah $$1 = $$0.m();
      dxg<T> $$2 = $$1.a(this.r, (dxh<T>)$$0.p());
      if ($$2 == null) {
         this.k($$0.ax_());
      } else {
         this.p.compute($$0.ax_(), ($$2x, $$3) -> {
            dzd $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (eco.d)$$3;
            } else if (this.L()) {
               eco.d $$5 = new eco.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dxf> dzd a(T $$0, dxg<T> $$1) {
      return new eco.a<>($$0, $$1);
   }

   class a<T extends dxf> implements dzd {
      private final T b;
      private final dxg<T> c;
      private boolean d;

      a(final T $$0, final dxg<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.n() && this.b.l()) {
            iu $$0 = this.b.ax_();
            if (eco.this.h($$0)) {
               try {
                  bqo $$1 = bqn.a();
                  $$1.a(this::d);
                  eah $$2 = eco.this.a_($$0);
                  if (this.b.p().a($$2)) {
                     this.c.tick(eco.this.r, this.b.ax_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     eco.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return this.b.ax_();
      }

      @Override
      public String d() {
         return dxh.a(this.b.p()).toString();
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
      void run(eco var1);
   }

   static class d implements dzd {
      private dzd a;

      d(dzd $$0) {
         this.a = $$0;
      }

      void a(dzd $$0) {
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
      void setUnsaved(dih var1);
   }
}
