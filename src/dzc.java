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

public class dzc extends dys {
   static final Logger n = LogUtils.getLogger();
   private static final dvu o = new dvu() {
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
   private final Map<ji, dzc.d> p = Maps.newHashMap();
   private boolean q;
   final dgi r;
   @Nullable
   private Supplier<aqr> s;
   @Nullable
   private dzc.c t;
   private final Int2ObjectMap<ebw> u;
   private final fcn<djm> v;
   private final fcn<esy> w;
   private dzc.e x = $$0x -> {
   };

   public dzc(dgi $$0, dfo $$1) {
      this($$0, $$1, dzp.a, new fcn<>(), new fcn<>(), 0L, null, null, null);
   }

   public dzc(dgi $$0, dfo $$1, dzp $$2, fcn<djm> $$3, fcn<esy> $$4, long $$5, @Nullable dzd[] $$6, @Nullable dzc.c $$7, @Nullable edv $$8) {
      super($$1, $$2, $$0, $$0.K_().e(mc.aI), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (ecs.a $$9 : ecs.a.values()) {
         if (dzt.n.e().contains($$9)) {
            this.h.put($$9, new ecs(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dzc(arc $$0, dzm $$1, @Nullable dzc.c $$2) {
      this($$0, $$1.f(), $$1.t(), $$1.K(), $$1.L(), $$1.w(), $$1.d(), $$2, $$1.v());

      for (dtz $$3 : $$1.H().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.J());

      for (int $$4 = 0; $$4 < $$1.p().length; $$4++) {
         this.b[$$4] = $$1.p()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<ecs.a, ecs> $$5 : $$1.e()) {
         if (dzt.n.e().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.a($$1.x());
      this.i();
   }

   public void a(dzc.e $$0) {
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
   public fcv<djm> q() {
      return this.v;
   }

   @Override
   public fcv<esy> r() {
      return this.w;
   }

   @Override
   public dys.a a(long $$0) {
      return new dys.a(this.v.a($$0), this.w.a($$0));
   }

   @Override
   public ebw a(int $$0) {
      return this.r instanceof arc $$1 ? (ebw)this.u.computeIfAbsent($$0, $$2 -> new ebs($$1, $$0, this::i)) : super.a($$0);
   }

   @Override
   public dwx a_(ji $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.aj()) {
         dwx $$4 = null;
         if ($$2 == 60) {
            $$4 = djo.iu.m();
         }

         if ($$2 == 70) {
            $$4 = ecj.a($$1, $$3);
         }

         return $$4 == null ? djo.a.m() : $$4;
      } else {
         try {
            int $$5 = this.f($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dzd $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return djo.a.m();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }

   @Override
   public esz b_(ji $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public esz a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.f($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dzd $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return eta.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$6);
      }
   }

   @Nullable
   @Override
   public dwx a(ji $$0, dwx $$1, boolean $$2) {
      int $$3 = $$0.v();
      dzd $$4 = this.b(this.f($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.l()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dwx $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            djm $$10 = $$1.b();
            this.h.get(ecs.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(ecs.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(ecs.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(ecs.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.S().p().a($$0, $$11);
               this.r.S().a(this.c.h, kk.a($$3), this.c.i, $$11);
            }

            if (esq.a($$9, $$1)) {
               bos $$12 = bor.a();
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
                  dtz $$14 = this.a($$0, dzc.b.c);
                  if ($$14 != null && !$$14.b($$1)) {
                     n.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{$$0, $$14.p().a().h().a(), $$1});
                     this.d($$0);
                     $$14 = null;
                  }

                  if ($$14 == null) {
                     $$14 = ((dmf)$$10).a($$0, $$1);
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
   public void a(buk $$0) {
   }

   @Nullable
   private dtz g(ji $$0) {
      dwx $$1 = this.a_($$0);
      return !$$1.x() ? null : ((dmf)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dtz c_(ji $$0) {
      return this.a($$0, dzc.b.c);
   }

   @Nullable
   public dtz a(ji $$0, dzc.b $$1) {
      dtz $$2 = this.k.get($$0);
      if ($$2 == null) {
         tq $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dtz $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dzc.b.a) {
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

   public void b(dtz $$0) {
      this.a($$0);
      if (this.L()) {
         if (this.r instanceof arc $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean L() {
      return this.q || this.r.B_();
   }

   boolean h(ji $$0) {
      if (!this.r.F_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof arc $$1) ? true : this.F().a(aqr.c) && $$1.c(dfo.a($$0));
      }
   }

   @Override
   public void a(dtz $$0) {
      ji $$1 = $$0.aA_();
      dwx $$2 = this.a_($$1);
      if (!$$2.x()) {
         n.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
      } else {
         dwx $$3 = $$0.m();
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
         dtz $$4 = this.k.put($$1.j(), $$0);
         if ($$4 != null && $$4 != $$0) {
            $$4.av_();
         }
      }
   }

   @Nullable
   @Override
   public tq a(ji $$0, jt.a $$1) {
      dtz $$2 = this.c_($$0);
      if ($$2 != null && !$$2.n()) {
         tq $$3 = $$2.b(this.r.K_());
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
         dtz $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof arc $$2) {
               this.a($$1, $$2);
            }

            $$1.av_();
         }
      }

      this.k($$0);
   }

   private <T extends dtz> void a(T $$0, arc $$1) {
      djm $$2 = $$0.m().b();
      if ($$2 instanceof dmf) {
         ebv $$3 = ((dmf)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = kk.a($$0.aA_().v());
            ebw $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void i(int $$0) {
      this.u.remove($$0);
   }

   private void k(ji $$0) {
      dzc.d $$1 = this.p.remove($$0);
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

      for (dzd $$3 : this.m) {
         $$3.a($$0);
      }

      for (ecs.a $$4 : ecs.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.C();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dtz $$3 = this.a($$0x, dzc.b.a);
         if ($$3 != null && $$2x != null && $$3.p() == $$1x) {
            $$3.c($$2x, this.r.K_());
         }
      });
   }

   public void a(vl $$0) {
      for (dzd $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void b(boolean $$0) {
      this.q = $$0;
   }

   public dgi H() {
      return this.r;
   }

   public Map<ji, dtz> I() {
      return this.k;
   }

   public void a(arc $$0) {
      dfo $$1 = this.f();

      for (int $$2 = 0; $$2 < this.b.length; $$2++) {
         if (this.b[$$2] != null) {
            ShortListIterator $$8 = this.b[$$2].iterator();

            while ($$8.hasNext()) {
               Short $$3 = (Short)$$8.next();
               ji $$4 = dzm.a($$3, this.h($$2), $$1);
               dwx $$5 = this.a_($$4);
               esz $$6 = $$5.y();
               if (!$$6.c()) {
                  $$6.a($$0, $$4, $$5);
               }

               if (!($$5.b() instanceof doe)) {
                  dwx $$7 = djm.b($$5, $$0, $$4);
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
         ji $$8 = (ji)var10.next();
         this.c_($$8);
      }

      this.j.clear();
      this.e.a(this);
   }

   @Nullable
   private dtz a(ji $$0, tq $$1) {
      dwx $$2 = this.a_($$0);
      dtz $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.x()) {
            $$3 = ((dmf)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dtz.a($$0, $$2, $$1, this.r.K_());
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

   public void b(arc $$0) {
      $$0.n().a(this.c, this.v);
      $$0.o().a(this.c, this.w);
   }

   public void c(arc $$0) {
      $$0.n().a(this.c);
      $$0.o().a(this.c);
   }

   @Override
   public dzt n() {
      return dzt.n;
   }

   public aqr F() {
      return this.s == null ? aqr.b : this.s.get();
   }

   public void b(Supplier<aqr> $$0) {
      this.s = $$0;
   }

   public void J() {
      this.k.values().forEach(dtz::av_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void K() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof arc $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dtz> void b(T $$0, arc $$1) {
      djm $$2 = $$0.m().b();
      if ($$2 instanceof dmf) {
         ebv $$3 = ((dmf)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(kk.a($$0.aA_().v())).a($$3);
         }
      }
   }

   private <T extends dtz> void c(T $$0) {
      dwx $$1 = $$0.m();
      dua<T> $$2 = $$1.a(this.r, (dub<T>)$$0.p());
      if ($$2 == null) {
         this.k($$0.aA_());
      } else {
         this.p.compute($$0.aA_(), ($$2x, $$3) -> {
            dvu $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dzc.d)$$3;
            } else if (this.L()) {
               dzc.d $$5 = new dzc.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dtz> dvu a(T $$0, dua<T> $$1) {
      return new dzc.a<>($$0, $$1);
   }

   class a<T extends dtz> implements dvu {
      private final T b;
      private final dua<T> c;
      private boolean d;

      a(final T $$0, final dua<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.n() && this.b.l()) {
            ji $$0 = this.b.aA_();
            if (dzc.this.h($$0)) {
               try {
                  bos $$1 = bor.a();
                  $$1.a(this::d);
                  dwx $$2 = dzc.this.a_($$0);
                  if (this.b.p().a($$2)) {
                     this.c.tick(dzc.this.r, this.b.aA_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dzc.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return dub.a(this.b.p()).toString();
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
      void run(dzc var1);
   }

   static class d implements dvu {
      private dvu a;

      d(dvu $$0) {
         this.a = $$0;
      }

      void a(dvu $$0) {
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
      void setUnsaved(dfo var1);
   }
}
