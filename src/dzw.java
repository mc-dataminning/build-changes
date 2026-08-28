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

public class dzw extends dzm {
   static final Logger n = LogUtils.getLogger();
   private static final dwn o = new dwn() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public ji c() {
         return ji.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<ji, dzw.d> p = Maps.newHashMap();
   private boolean q;
   final dgz r;
   @Nullable
   private Supplier<aqr> s;
   @Nullable
   private dzw.c t;
   private final Int2ObjectMap<ecs> u;
   private final fdk<dke> v;
   private final fdk<etv> w;
   private dzw.e x = $$0x -> {
   };

   public dzw(dgz $$0, dgg $$1) {
      this($$0, $$1, eaj.a, new fdk<>(), new fdk<>(), 0L, null, null, null);
   }

   public dzw(dgz $$0, dgg $$1, eaj $$2, fdk<dke> $$3, fdk<etv> $$4, long $$5, @Nullable dzx[] $$6, @Nullable dzw.c $$7, @Nullable eer $$8) {
      super($$1, $$2, $$0, $$0.F_().e(mc.aJ), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (edo.a $$9 : edo.a.values()) {
         if (ean.n.e().contains($$9)) {
            this.h.put($$9, new edo(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dzw(ard $$0, eag $$1, @Nullable dzw.c $$2) {
      this($$0, $$1.f(), $$1.t(), $$1.K(), $$1.L(), $$1.w(), $$1.d(), $$2, $$1.v());
      if (!Collections.disjoint($$1.j.keySet(), $$1.k.keySet())) {
         n.error("Chunk at {} contains duplicated block entities", $$1.f());
      }

      for (dus $$3 : $$1.H().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.J());

      for (int $$4 = 0; $$4 < $$1.p().length; $$4++) {
         this.b[$$4] = $$1.p()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<edo.a, edo> $$5 : $$1.e()) {
         if (ean.n.e().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.a($$1.x());
      this.i();
   }

   public void a(dzw.e $$0) {
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
   public fds<dke> q() {
      return this.v;
   }

   @Override
   public fds<etv> r() {
      return this.w;
   }

   @Override
   public dzm.a a(long $$0) {
      return new dzm.a(this.v.a($$0), this.w.a($$0));
   }

   @Override
   public ecs a(int $$0) {
      return this.r instanceof ard $$1 ? (ecs)this.u.computeIfAbsent($$0, $$2 -> new eco($$1, $$0, this::i)) : super.a($$0);
   }

   @Override
   public dxq a_(ji $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ak()) {
         dxq $$4 = null;
         if ($$2 == 60) {
            $$4 = dkg.iu.m();
         }

         if ($$2 == 70) {
            $$4 = edf.a($$1, $$3);
         }

         return $$4 == null ? dkg.a.m() : $$4;
      } else {
         try {
            int $$5 = this.f($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dzx $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dkg.a.m();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }

   @Override
   public etw b_(ji $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public etw a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.f($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dzx $$4 = this.m[$$3];
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
   public dxq a(ji $$0, dxq $$1, int $$2) {
      int $$3 = $$0.v();
      dzx $$4 = this.b(this.f($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.l()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dxq $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dke $$10 = $$1.b();
            this.h.get(edo.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(edo.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(edo.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(edo.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.S().q().a($$0, $$11);
               this.r.S().a(this.c.h, kk.a($$3), this.c.i, $$11);
            }

            if (etn.a($$9, $$1)) {
               bpj $$12 = bpi.a();
               $$12.a("updateSkyLightSources");
               this.i.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.r.S().q().a($$0);
               $$12.c();
            }

            boolean $$13 = $$9.x();
            boolean $$14 = !$$9.a($$10);
            boolean $$15 = ($$2 & 64) != 0;
            boolean $$16 = ($$2 & 256) == 0;
            if ($$14) {
               if (this.r instanceof ard $$17) {
                  if ($$13 && $$16) {
                     dus $$18 = this.r.c_($$0);
                     if ($$18 != null) {
                        $$18.a($$0, $$9, $$15);
                     }
                  }

                  if ($$13) {
                     this.d($$0);
                  }

                  if (($$2 & 1) != 0) {
                     $$9.a($$17, $$0, $$15);
                  }
               } else if ($$13) {
                  this.d($$0);
               }
            }

            if (!$$4.a($$6, $$7, $$8).a($$10)) {
               return null;
            } else {
               if (!this.r.C && $$16) {
                  $$1.a(this.r, $$0, $$9, $$15);
               }

               if ($$1.x()) {
                  dus $$19 = this.a($$0, dzw.b.c);
                  if ($$19 != null && !$$19.b($$1)) {
                     n.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{$$0, $$19.p().a().h().a(), $$1});
                     this.d($$0);
                     $$19 = null;
                  }

                  if ($$19 == null) {
                     $$19 = ((dmx)$$10).a($$0, $$1);
                     if ($$19 != null) {
                        this.b($$19);
                     }
                  } else {
                     $$19.c($$1);
                     this.c($$19);
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
   public void a(bva $$0) {
   }

   @Nullable
   private dus g(ji $$0) {
      dxq $$1 = this.a_($$0);
      return !$$1.x() ? null : ((dmx)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dus c_(ji $$0) {
      return this.a($$0, dzw.b.c);
   }

   @Nullable
   public dus a(ji $$0, dzw.b $$1) {
      dus $$2 = this.k.get($$0);
      if ($$2 == null) {
         tq $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dus $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dzw.b.a) {
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

   public void b(dus $$0) {
      this.a($$0);
      if (this.L()) {
         if (this.r instanceof ard $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean L() {
      return this.q || this.r.w_();
   }

   boolean h(ji $$0) {
      if (!this.r.A_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof ard $$1) ? true : this.F().a(aqr.c) && $$1.c(dgg.a($$0));
      }
   }

   @Override
   public void a(dus $$0) {
      ji $$1 = $$0.aA_();
      dxq $$2 = this.a_($$1);
      if (!$$2.x()) {
         n.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
      } else {
         dxq $$3 = $$0.m();
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
         dus $$4 = this.k.put($$1.j(), $$0);
         if ($$4 != null && $$4 != $$0) {
            $$4.av_();
         }
      }
   }

   @Nullable
   @Override
   public tq a(ji $$0, jt.a $$1) {
      dus $$2 = this.c_($$0);
      if ($$2 != null && !$$2.n()) {
         tq $$3 = $$2.b(this.r.F_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         tq $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.i();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(ji $$0) {
      if (this.L()) {
         dus $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof ard $$2) {
               this.a($$1, $$2);
            }

            $$1.av_();
         }
      }

      this.k($$0);
   }

   private <T extends dus> void a(T $$0, ard $$1) {
      dke $$2 = $$0.m().b();
      if ($$2 instanceof dmx) {
         ecr $$3 = ((dmx)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = kk.a($$0.aA_().v());
            ecs $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void i(int $$0) {
      this.u.remove($$0);
   }

   private void k(ji $$0) {
      dzw.d $$1 = this.p.remove($$0);
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

   public void a(vl $$0, tq $$1, Consumer<acw.b> $$2) {
      this.J();

      for (dzx $$3 : this.m) {
         $$3.a($$0);
      }

      for (edo.a $$4 : edo.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.C();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dus $$3 = this.a($$0x, dzw.b.a);
         if ($$3 != null && $$2x != null && $$3.p() == $$1x) {
            $$3.c($$2x, this.r.F_());
         }
      });
   }

   public void a(vl $$0) {
      for (dzx $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void b(boolean $$0) {
      this.q = $$0;
   }

   public dgz H() {
      return this.r;
   }

   public Map<ji, dus> I() {
      return this.k;
   }

   public void a(ard $$0) {
      dgg $$1 = this.f();

      for (int $$2 = 0; $$2 < this.b.length; $$2++) {
         if (this.b[$$2] != null) {
            ShortListIterator $$8 = this.b[$$2].iterator();

            while ($$8.hasNext()) {
               Short $$3 = (Short)$$8.next();
               ji $$4 = eag.a($$3, this.h($$2), $$1);
               dxq $$5 = this.a_($$4);
               etw $$6 = $$5.y();
               if (!$$6.c()) {
                  $$6.a($$0, $$4, $$5);
               }

               if (!($$5.b() instanceof doy)) {
                  dxq $$7 = dke.b($$5, $$0, $$4);
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
         ji $$8 = (ji)var10.next();
         this.c_($$8);
      }

      this.j.clear();
      this.e.a(this);
   }

   @Nullable
   private dus a(ji $$0, tq $$1) {
      dxq $$2 = this.a_($$0);
      dus $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.x()) {
            $$3 = ((dmx)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dus.a($$0, $$2, $$1, this.r.F_());
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

   public void b(ard $$0) {
      $$0.n().a(this.c, this.v);
      $$0.o().a(this.c, this.w);
   }

   public void c(ard $$0) {
      $$0.n().a(this.c);
      $$0.o().a(this.c);
   }

   @Override
   public ean n() {
      return ean.n;
   }

   public aqr F() {
      return this.s == null ? aqr.b : this.s.get();
   }

   public void b(Supplier<aqr> $$0) {
      this.s = $$0;
   }

   public void J() {
      this.k.values().forEach(dus::av_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void K() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof ard $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dus> void b(T $$0, ard $$1) {
      dke $$2 = $$0.m().b();
      if ($$2 instanceof dmx) {
         ecr $$3 = ((dmx)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(kk.a($$0.aA_().v())).a($$3);
         }
      }
   }

   private <T extends dus> void c(T $$0) {
      dxq $$1 = $$0.m();
      dut<T> $$2 = $$1.a(this.r, (duu<T>)$$0.p());
      if ($$2 == null) {
         this.k($$0.aA_());
      } else {
         this.p.compute($$0.aA_(), ($$2x, $$3) -> {
            dwn $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dzw.d)$$3;
            } else if (this.L()) {
               dzw.d $$5 = new dzw.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dus> dwn a(T $$0, dut<T> $$1) {
      return new dzw.a<>($$0, $$1);
   }

   class a<T extends dus> implements dwn {
      private final T b;
      private final dut<T> c;
      private boolean d;

      a(final T $$0, final dut<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.n() && this.b.l()) {
            ji $$0 = this.b.aA_();
            if (dzw.this.h($$0)) {
               try {
                  bpj $$1 = bpi.a();
                  $$1.a(this::d);
                  dxq $$2 = dzw.this.a_($$0);
                  if (this.b.p().a($$2)) {
                     this.c.tick(dzw.this.r, this.b.aA_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dzw.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
      public ji c() {
         return this.b.aA_();
      }

      @Override
      public String d() {
         return duu.a(this.b.p()).toString();
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
      void run(dzw var1);
   }

   static class d implements dwn {
      private dwn a;

      d(dwn $$0) {
         this.a = $$0;
      }

      void a(dwn $$0) {
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
      public ji c() {
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
      void setUnsaved(dgg var1);
   }
}
