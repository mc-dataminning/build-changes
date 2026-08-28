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

public class edn extends edd {
   static final Logger n = LogUtils.getLogger();
   private static final eac o = new eac() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public iw c() {
         return iw.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<iw, edn.d> p = Maps.newHashMap();
   private boolean q;
   final djz r;
   @Nullable
   private Supplier<ari> s;
   @Nullable
   private edn.c t;
   private final Int2ObjectMap<egj> u;
   private final fhf<dne> v;
   private final fhf<exp> w;
   private edn.e x = $$0x -> {
   };

   public edn(djz $$0, dje $$1) {
      this($$0, $$1, eea.a, new fhf<>(), new fhf<>(), 0L, null, null, null);
   }

   public edn(djz $$0, dje $$1, eea $$2, fhf<dne> $$3, fhf<exp> $$4, long $$5, @Nullable edo[] $$6, @Nullable edn.c $$7, @Nullable eii $$8) {
      super($$1, $$2, $$0, $$0.J_().f(mi.aG), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (ehf.a $$9 : ehf.a.values()) {
         if (eee.n.e().contains($$9)) {
            this.h.put($$9, new ehf(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public edn(aru $$0, edx $$1, @Nullable edn.c $$2) {
      this($$0, $$1.f(), $$1.t(), $$1.K(), $$1.L(), $$1.w(), $$1.d(), $$2, $$1.v());
      if (!Collections.disjoint($$1.j.keySet(), $$1.k.keySet())) {
         n.error("Chunk at {} contains duplicated block entities", $$1.f());
      }

      for (dye $$3 : $$1.H().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.J());

      for (int $$4 = 0; $$4 < $$1.p().length; $$4++) {
         this.b[$$4] = $$1.p()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<ehf.a, ehf> $$5 : $$1.e()) {
         if (eee.n.e().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.a($$1.x());
      this.i();
   }

   public void a(edn.e $$0) {
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
   public fhn<dne> q() {
      return this.v;
   }

   @Override
   public fhn<exp> r() {
      return this.w;
   }

   @Override
   public edd.a a(long $$0) {
      return new edd.a(this.v.a($$0), this.w.a($$0));
   }

   @Override
   public egj a(int $$0) {
      return this.r instanceof aru $$1 ? (egj)this.u.computeIfAbsent($$0, $$2 -> new egf($$1, $$0, this::i)) : super.a($$0);
   }

   @Override
   public ebg a_(iw $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ak()) {
         ebg $$4 = null;
         if ($$2 == 60) {
            $$4 = dng.iy.m();
         }

         if ($$2 == 70) {
            $$4 = egw.a($$1, $$3);
         }

         return $$4 == null ? dng.a.m() : $$4;
      } else {
         try {
            int $$5 = this.f($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               edo $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dng.a.m();
         } catch (Throwable var8) {
            p $$8 = p.a(var8, "Getting block state");
            q $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> q.a(this, $$1, $$2, $$3));
            throw new aa($$8);
         }
      }
   }

   @Override
   public exq b_(iw $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public exq a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.f($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            edo $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return exr.a.g();
      } catch (Throwable var7) {
         p $$6 = p.a(var7, "Getting fluid state");
         q $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> q.a(this, $$0, $$1, $$2));
         throw new aa($$6);
      }
   }

   @Nullable
   @Override
   public ebg a(iw $$0, ebg $$1, int $$2) {
      int $$3 = $$0.v();
      edo $$4 = this.b(this.f($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.l()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         ebg $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dne $$10 = $$1.b();
            this.h.get(ehf.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(ehf.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(ehf.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(ehf.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.S().q().a($$0, $$11);
               this.r.S().a(this.c.h, jz.a($$3), this.c.i, $$11);
            }

            if (exh.a($$9, $$1)) {
               brd $$12 = brc.a();
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
                  dye $$16 = this.r.c_($$0);
                  if ($$16 != null) {
                     $$16.a($$0, $$9);
                  }
               }

               this.d($$0);
            }

            if (($$13 || $$10 instanceof dmt) && this.r instanceof aru $$17 && (($$2 & 1) != 0 || $$14)) {
               $$9.a($$17, $$0, $$14);
            }

            if (!$$4.a($$6, $$7, $$8).a($$10)) {
               return null;
            } else {
               if (!this.r.C && ($$2 & 512) == 0) {
                  $$1.a(this.r, $$0, $$9, $$14);
               }

               if ($$1.x()) {
                  dye $$18 = this.a($$0, edn.b.c);
                  if ($$18 != null && !$$18.b($$1)) {
                     n.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{$$0, $$18.p().a().h().a(), $$1});
                     this.d($$0);
                     $$18 = null;
                  }

                  if ($$18 == null) {
                     $$18 = ((dpy)$$10).a($$0, $$1);
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
   public void a(bwv $$0) {
   }

   @Nullable
   private dye g(iw $$0) {
      ebg $$1 = this.a_($$0);
      return !$$1.x() ? null : ((dpy)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dye c_(iw $$0) {
      return this.a($$0, edn.b.c);
   }

   @Nullable
   public dye a(iw $$0, edn.b $$1) {
      dye $$2 = this.k.get($$0);
      if ($$2 == null) {
         ua $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dye $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == edn.b.a) {
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

   public void b(dye $$0) {
      this.a($$0);
      if (this.L()) {
         if (this.r instanceof aru $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean L() {
      return this.q || this.r.A_();
   }

   boolean h(iw $$0) {
      if (!this.r.E_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof aru $$1) ? true : this.F().a(ari.c) && $$1.c(dje.a($$0));
      }
   }

   @Override
   public void a(dye $$0) {
      iw $$1 = $$0.aB_();
      ebg $$2 = this.a_($$1);
      if (!$$2.x()) {
         n.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
      } else {
         ebg $$3 = $$0.m();
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
         dye $$4 = this.k.put($$1.j(), $$0);
         if ($$4 != null && $$4 != $$0) {
            $$4.aw_();
         }
      }
   }

   @Nullable
   @Override
   public ua a(iw $$0, ji.a $$1) {
      dye $$2 = this.c_($$0);
      if ($$2 != null && !$$2.n()) {
         ua $$3 = $$2.b(this.r.J_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         ua $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.l();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(iw $$0) {
      if (this.L()) {
         dye $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof aru $$2) {
               this.a($$1, $$2);
            }

            $$1.aw_();
         }
      }

      this.k($$0);
   }

   private <T extends dye> void a(T $$0, aru $$1) {
      dne $$2 = $$0.m().b();
      if ($$2 instanceof dpy) {
         egi $$3 = ((dpy)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = jz.a($$0.aB_().v());
            egj $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void i(int $$0) {
      this.u.remove($$0);
   }

   private void k(iw $$0) {
      edn.d $$1 = this.p.remove($$0);
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

   public void a(vy $$0, Map<ehf.a, long[]> $$1, Consumer<adj.b> $$2) {
      this.J();

      for (edo $$3 : this.m) {
         $$3.a($$0);
      }

      $$1.forEach(this::a);
      this.C();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dye $$3x = this.a($$0x, edn.b.a);
         if ($$3x != null && $$2x != null && $$3x.p() == $$1x) {
            $$3x.c($$2x, this.r.J_());
         }
      });
   }

   public void a(vy $$0) {
      for (edo $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void b(boolean $$0) {
      this.q = $$0;
   }

   public djz H() {
      return this.r;
   }

   public Map<iw, dye> I() {
      return this.k;
   }

   public void a(aru $$0) {
      dje $$1 = this.f();

      for (int $$2 = 0; $$2 < this.b.length; $$2++) {
         if (this.b[$$2] != null) {
            ShortListIterator $$8 = this.b[$$2].iterator();

            while ($$8.hasNext()) {
               Short $$3 = (Short)$$8.next();
               iw $$4 = edx.a($$3, this.h($$2), $$1);
               ebg $$5 = this.a_($$4);
               exq $$6 = $$5.y();
               if (!$$6.c()) {
                  $$6.a($$0, $$4, $$5);
               }

               if (!($$5.b() instanceof dsa)) {
                  ebg $$7 = dne.b($$5, $$0, $$4);
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
         iw $$8 = (iw)var10.next();
         this.c_($$8);
      }

      this.j.clear();
      this.e.a(this);
   }

   @Nullable
   private dye a(iw $$0, ua $$1) {
      ebg $$2 = this.a_($$0);
      dye $$3;
      if ("DUMMY".equals($$1.b("id", ""))) {
         if ($$2.x()) {
            $$3 = ((dpy)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dye.a($$0, $$2, $$1, this.r.J_());
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

   public void b(aru $$0) {
      $$0.n().a(this.c, this.v);
      $$0.o().a(this.c, this.w);
   }

   public void c(aru $$0) {
      $$0.n().a(this.c);
      $$0.o().a(this.c);
   }

   @Override
   public eee n() {
      return eee.n;
   }

   public ari F() {
      return this.s == null ? ari.b : this.s.get();
   }

   public void b(Supplier<ari> $$0) {
      this.s = $$0;
   }

   public void J() {
      this.k.values().forEach(dye::aw_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void K() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof aru $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dye> void b(T $$0, aru $$1) {
      dne $$2 = $$0.m().b();
      if ($$2 instanceof dpy) {
         egi $$3 = ((dpy)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(jz.a($$0.aB_().v())).a($$3);
         }
      }
   }

   private <T extends dye> void c(T $$0) {
      ebg $$1 = $$0.m();
      dyf<T> $$2 = $$1.a(this.r, (dyg<T>)$$0.p());
      if ($$2 == null) {
         this.k($$0.aB_());
      } else {
         this.p.compute($$0.aB_(), ($$2x, $$3) -> {
            eac $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (edn.d)$$3;
            } else if (this.L()) {
               edn.d $$5 = new edn.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dye> eac a(T $$0, dyf<T> $$1) {
      return new edn.a<>($$0, $$1);
   }

   class a<T extends dye> implements eac {
      private final T b;
      private final dyf<T> c;
      private boolean d;

      a(final T $$0, final dyf<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.n() && this.b.l()) {
            iw $$0 = this.b.aB_();
            if (edn.this.h($$0)) {
               try {
                  brd $$1 = brc.a();
                  $$1.a(this::d);
                  ebg $$2 = edn.this.a_($$0);
                  if (this.b.p().a($$2)) {
                     this.c.tick(edn.this.r, this.b.aB_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     edn.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
                  }

                  $$1.c();
               } catch (Throwable var5) {
                  p $$4 = p.a(var5, "Ticking block entity");
                  q $$5 = $$4.a("Block entity being ticked");
                  this.b.a($$5);
                  throw new aa($$4);
               }
            }
         }
      }

      @Override
      public boolean b() {
         return this.b.n();
      }

      @Override
      public iw c() {
         return this.b.aB_();
      }

      @Override
      public String d() {
         return dyg.a(this.b.p()).toString();
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
      void run(edn var1);
   }

   static class d implements eac {
      private eac a;

      d(eac $$0) {
         this.a = $$0;
      }

      void a(eac $$0) {
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
      public iw c() {
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
      void setUnsaved(dje var1);
   }
}
