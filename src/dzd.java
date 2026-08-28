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

public class dzd extends dyt {
   static final Logger n = LogUtils.getLogger();
   private static final dvv o = new dvv() {
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
   private final Map<ji, dzd.d> p = Maps.newHashMap();
   private boolean q;
   final dgj r;
   @Nullable
   private Supplier<aqs> s;
   @Nullable
   private dzd.c t;
   private final Int2ObjectMap<ebx> u;
   private final fco<djn> v;
   private final fco<esz> w;
   private dzd.e x = $$0x -> {
   };

   public dzd(dgj $$0, dfp $$1) {
      this($$0, $$1, dzq.a, new fco<>(), new fco<>(), 0L, null, null, null);
   }

   public dzd(dgj $$0, dfp $$1, dzq $$2, fco<djn> $$3, fco<esz> $$4, long $$5, @Nullable dze[] $$6, @Nullable dzd.c $$7, @Nullable edw $$8) {
      super($$1, $$2, $$0, $$0.K_().e(mc.aI), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (ect.a $$9 : ect.a.values()) {
         if (dzu.n.e().contains($$9)) {
            this.h.put($$9, new ect(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dzd(ard $$0, dzn $$1, @Nullable dzd.c $$2) {
      this($$0, $$1.f(), $$1.t(), $$1.K(), $$1.L(), $$1.w(), $$1.d(), $$2, $$1.v());
      if (!Collections.disjoint($$1.j.keySet(), $$1.k.keySet())) {
         n.error("Chunk at {} contains duplicated block entities", $$1.f());
      }

      for (dua $$3 : $$1.H().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.J());

      for (int $$4 = 0; $$4 < $$1.p().length; $$4++) {
         this.b[$$4] = $$1.p()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<ect.a, ect> $$5 : $$1.e()) {
         if (dzu.n.e().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.a($$1.x());
      this.i();
   }

   public void a(dzd.e $$0) {
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
   public fcw<djn> q() {
      return this.v;
   }

   @Override
   public fcw<esz> r() {
      return this.w;
   }

   @Override
   public dyt.a a(long $$0) {
      return new dyt.a(this.v.a($$0), this.w.a($$0));
   }

   @Override
   public ebx a(int $$0) {
      return this.r instanceof ard $$1 ? (ebx)this.u.computeIfAbsent($$0, $$2 -> new ebt($$1, $$0, this::i)) : super.a($$0);
   }

   @Override
   public dwy a_(ji $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.aj()) {
         dwy $$4 = null;
         if ($$2 == 60) {
            $$4 = djp.iu.m();
         }

         if ($$2 == 70) {
            $$4 = eck.a($$1, $$3);
         }

         return $$4 == null ? djp.a.m() : $$4;
      } else {
         try {
            int $$5 = this.f($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dze $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return djp.a.m();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }

   @Override
   public eta b_(ji $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public eta a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.f($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dze $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return etb.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$6);
      }
   }

   @Nullable
   @Override
   public dwy a(ji $$0, dwy $$1, boolean $$2) {
      int $$3 = $$0.v();
      dze $$4 = this.b(this.f($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.l()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dwy $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            djn $$10 = $$1.b();
            this.h.get(ect.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(ect.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(ect.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(ect.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.S().p().a($$0, $$11);
               this.r.S().a(this.c.h, kk.a($$3), this.c.i, $$11);
            }

            if (esr.a($$9, $$1)) {
               bou $$12 = bot.a();
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
                  dua $$14 = this.a($$0, dzd.b.c);
                  if ($$14 != null && !$$14.b($$1)) {
                     n.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{$$0, $$14.p().a().h().a(), $$1});
                     this.d($$0);
                     $$14 = null;
                  }

                  if ($$14 == null) {
                     $$14 = ((dmg)$$10).a($$0, $$1);
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
   public void a(bum $$0) {
   }

   @Nullable
   private dua g(ji $$0) {
      dwy $$1 = this.a_($$0);
      return !$$1.x() ? null : ((dmg)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dua c_(ji $$0) {
      return this.a($$0, dzd.b.c);
   }

   @Nullable
   public dua a(ji $$0, dzd.b $$1) {
      dua $$2 = this.k.get($$0);
      if ($$2 == null) {
         tq $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dua $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dzd.b.a) {
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

   public void b(dua $$0) {
      this.a($$0);
      if (this.L()) {
         if (this.r instanceof ard $$1) {
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
         return !(this.r instanceof ard $$1) ? true : this.F().a(aqs.c) && $$1.c(dfp.a($$0));
      }
   }

   @Override
   public void a(dua $$0) {
      ji $$1 = $$0.aA_();
      dwy $$2 = this.a_($$1);
      if (!$$2.x()) {
         n.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
      } else {
         dwy $$3 = $$0.m();
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
         dua $$4 = this.k.put($$1.j(), $$0);
         if ($$4 != null && $$4 != $$0) {
            $$4.av_();
         }
      }
   }

   @Nullable
   @Override
   public tq a(ji $$0, jt.a $$1) {
      dua $$2 = this.c_($$0);
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
         dua $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof ard $$2) {
               this.a($$1, $$2);
            }

            $$1.av_();
         }
      }

      this.k($$0);
   }

   private <T extends dua> void a(T $$0, ard $$1) {
      djn $$2 = $$0.m().b();
      if ($$2 instanceof dmg) {
         ebw $$3 = ((dmg)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = kk.a($$0.aA_().v());
            ebx $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void i(int $$0) {
      this.u.remove($$0);
   }

   private void k(ji $$0) {
      dzd.d $$1 = this.p.remove($$0);
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

   public void a(vl $$0, tq $$1, Consumer<acx.b> $$2) {
      this.J();

      for (dze $$3 : this.m) {
         $$3.a($$0);
      }

      for (ect.a $$4 : ect.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.C();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dua $$3 = this.a($$0x, dzd.b.a);
         if ($$3 != null && $$2x != null && $$3.p() == $$1x) {
            $$3.c($$2x, this.r.K_());
         }
      });
   }

   public void a(vl $$0) {
      for (dze $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void b(boolean $$0) {
      this.q = $$0;
   }

   public dgj H() {
      return this.r;
   }

   public Map<ji, dua> I() {
      return this.k;
   }

   public void a(ard $$0) {
      dfp $$1 = this.f();

      for (int $$2 = 0; $$2 < this.b.length; $$2++) {
         if (this.b[$$2] != null) {
            ShortListIterator $$8 = this.b[$$2].iterator();

            while ($$8.hasNext()) {
               Short $$3 = (Short)$$8.next();
               ji $$4 = dzn.a($$3, this.h($$2), $$1);
               dwy $$5 = this.a_($$4);
               eta $$6 = $$5.y();
               if (!$$6.c()) {
                  $$6.a($$0, $$4, $$5);
               }

               if (!($$5.b() instanceof dof)) {
                  dwy $$7 = djn.b($$5, $$0, $$4);
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
   private dua a(ji $$0, tq $$1) {
      dwy $$2 = this.a_($$0);
      dua $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.x()) {
            $$3 = ((dmg)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dua.a($$0, $$2, $$1, this.r.K_());
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
   public dzu n() {
      return dzu.n;
   }

   public aqs F() {
      return this.s == null ? aqs.b : this.s.get();
   }

   public void b(Supplier<aqs> $$0) {
      this.s = $$0;
   }

   public void J() {
      this.k.values().forEach(dua::av_);
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

   private <T extends dua> void b(T $$0, ard $$1) {
      djn $$2 = $$0.m().b();
      if ($$2 instanceof dmg) {
         ebw $$3 = ((dmg)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(kk.a($$0.aA_().v())).a($$3);
         }
      }
   }

   private <T extends dua> void c(T $$0) {
      dwy $$1 = $$0.m();
      dub<T> $$2 = $$1.a(this.r, (duc<T>)$$0.p());
      if ($$2 == null) {
         this.k($$0.aA_());
      } else {
         this.p.compute($$0.aA_(), ($$2x, $$3) -> {
            dvv $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dzd.d)$$3;
            } else if (this.L()) {
               dzd.d $$5 = new dzd.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dua> dvv a(T $$0, dub<T> $$1) {
      return new dzd.a<>($$0, $$1);
   }

   class a<T extends dua> implements dvv {
      private final T b;
      private final dub<T> c;
      private boolean d;

      a(final T $$0, final dub<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.n() && this.b.l()) {
            ji $$0 = this.b.aA_();
            if (dzd.this.h($$0)) {
               try {
                  bou $$1 = bot.a();
                  $$1.a(this::d);
                  dwy $$2 = dzd.this.a_($$0);
                  if (this.b.p().a($$2)) {
                     this.c.tick(dzd.this.r, this.b.aA_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dzd.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return duc.a(this.b.p()).toString();
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
      void run(dzd var1);
   }

   static class d implements dvv {
      private dvv a;

      d(dvv $$0) {
         this.a = $$0;
      }

      void a(dvv $$0) {
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
      void setUnsaved(dfp var1);
   }
}
