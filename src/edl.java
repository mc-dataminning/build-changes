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

public class edl extends edb {
   static final Logger n = LogUtils.getLogger();
   private static final eaa o = new eaa() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public iv c() {
         return iv.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<iv, edl.d> p = Maps.newHashMap();
   private boolean q;
   final djx r;
   @Nullable
   private Supplier<arg> s;
   @Nullable
   private edl.c t;
   private final Int2ObjectMap<egh> u;
   private final fhd<dnc> v;
   private final fhd<exn> w;
   private edl.e x = $$0x -> {
   };

   public edl(djx $$0, djc $$1) {
      this($$0, $$1, edy.a, new fhd<>(), new fhd<>(), 0L, null, null, null);
   }

   public edl(djx $$0, djc $$1, edy $$2, fhd<dnc> $$3, fhd<exn> $$4, long $$5, @Nullable edm[] $$6, @Nullable edl.c $$7, @Nullable eig $$8) {
      super($$1, $$2, $$0, $$0.J_().f(mh.aG), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (ehd.a $$9 : ehd.a.values()) {
         if (eec.n.e().contains($$9)) {
            this.h.put($$9, new ehd(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public edl(ars $$0, edv $$1, @Nullable edl.c $$2) {
      this($$0, $$1.f(), $$1.t(), $$1.K(), $$1.L(), $$1.w(), $$1.d(), $$2, $$1.v());
      if (!Collections.disjoint($$1.j.keySet(), $$1.k.keySet())) {
         n.error("Chunk at {} contains duplicated block entities", $$1.f());
      }

      for (dyc $$3 : $$1.H().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.J());

      for (int $$4 = 0; $$4 < $$1.p().length; $$4++) {
         this.b[$$4] = $$1.p()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<ehd.a, ehd> $$5 : $$1.e()) {
         if (eec.n.e().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.a($$1.x());
      this.i();
   }

   public void a(edl.e $$0) {
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
   public fhl<dnc> q() {
      return this.v;
   }

   @Override
   public fhl<exn> r() {
      return this.w;
   }

   @Override
   public edb.a a(long $$0) {
      return new edb.a(this.v.a($$0), this.w.a($$0));
   }

   @Override
   public egh a(int $$0) {
      return this.r instanceof ars $$1 ? (egh)this.u.computeIfAbsent($$0, $$2 -> new egd($$1, $$0, this::i)) : super.a($$0);
   }

   @Override
   public ebe a_(iv $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ak()) {
         ebe $$4 = null;
         if ($$2 == 60) {
            $$4 = dne.iy.m();
         }

         if ($$2 == 70) {
            $$4 = egu.a($$1, $$3);
         }

         return $$4 == null ? dne.a.m() : $$4;
      } else {
         try {
            int $$5 = this.f($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               edm $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dne.a.m();
         } catch (Throwable var8) {
            p $$8 = p.a(var8, "Getting block state");
            q $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> q.a(this, $$1, $$2, $$3));
            throw new aa($$8);
         }
      }
   }

   @Override
   public exo b_(iv $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public exo a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.f($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            edm $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return exp.a.g();
      } catch (Throwable var7) {
         p $$6 = p.a(var7, "Getting fluid state");
         q $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> q.a(this, $$0, $$1, $$2));
         throw new aa($$6);
      }
   }

   @Nullable
   @Override
   public ebe a(iv $$0, ebe $$1, int $$2) {
      int $$3 = $$0.v();
      edm $$4 = this.b(this.f($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.l()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         ebe $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dnc $$10 = $$1.b();
            this.h.get(ehd.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(ehd.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(ehd.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(ehd.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.S().q().a($$0, $$11);
               this.r.S().a(this.c.h, jy.a($$3), this.c.i, $$11);
            }

            if (exf.a($$9, $$1)) {
               brb $$12 = bra.a();
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
                  dyc $$16 = this.r.c_($$0);
                  if ($$16 != null) {
                     $$16.a($$0, $$9);
                  }
               }

               this.d($$0);
            }

            if (($$13 || $$10 instanceof dmr) && this.r instanceof ars $$17 && (($$2 & 1) != 0 || $$14)) {
               $$9.a($$17, $$0, $$14);
            }

            if (!$$4.a($$6, $$7, $$8).a($$10)) {
               return null;
            } else {
               if (!this.r.C && ($$2 & 512) == 0) {
                  $$1.a(this.r, $$0, $$9, $$14);
               }

               if ($$1.x()) {
                  dyc $$18 = this.a($$0, edl.b.c);
                  if ($$18 != null && !$$18.b($$1)) {
                     n.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{$$0, $$18.p().a().h().a(), $$1});
                     this.d($$0);
                     $$18 = null;
                  }

                  if ($$18 == null) {
                     $$18 = ((dpw)$$10).a($$0, $$1);
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
   public void a(bwt $$0) {
   }

   @Nullable
   private dyc g(iv $$0) {
      ebe $$1 = this.a_($$0);
      return !$$1.x() ? null : ((dpw)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dyc c_(iv $$0) {
      return this.a($$0, edl.b.c);
   }

   @Nullable
   public dyc a(iv $$0, edl.b $$1) {
      dyc $$2 = this.k.get($$0);
      if ($$2 == null) {
         tz $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dyc $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == edl.b.a) {
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

   public void b(dyc $$0) {
      this.a($$0);
      if (this.L()) {
         if (this.r instanceof ars $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean L() {
      return this.q || this.r.A_();
   }

   boolean h(iv $$0) {
      if (!this.r.E_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof ars $$1) ? true : this.F().a(arg.c) && $$1.c(djc.a($$0));
      }
   }

   @Override
   public void a(dyc $$0) {
      iv $$1 = $$0.aB_();
      ebe $$2 = this.a_($$1);
      if (!$$2.x()) {
         n.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
      } else {
         ebe $$3 = $$0.m();
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
         dyc $$4 = this.k.put($$1.j(), $$0);
         if ($$4 != null && $$4 != $$0) {
            $$4.aw_();
         }
      }
   }

   @Nullable
   @Override
   public tz a(iv $$0, jh.a $$1) {
      dyc $$2 = this.c_($$0);
      if ($$2 != null && !$$2.n()) {
         tz $$3 = $$2.b(this.r.J_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         tz $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.l();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(iv $$0) {
      if (this.L()) {
         dyc $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof ars $$2) {
               this.a($$1, $$2);
            }

            $$1.aw_();
         }
      }

      this.k($$0);
   }

   private <T extends dyc> void a(T $$0, ars $$1) {
      dnc $$2 = $$0.m().b();
      if ($$2 instanceof dpw) {
         egg $$3 = ((dpw)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = jy.a($$0.aB_().v());
            egh $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void i(int $$0) {
      this.u.remove($$0);
   }

   private void k(iv $$0) {
      edl.d $$1 = this.p.remove($$0);
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

   public void a(vw $$0, Map<ehd.a, long[]> $$1, Consumer<adh.b> $$2) {
      this.J();

      for (edm $$3 : this.m) {
         $$3.a($$0);
      }

      $$1.forEach(this::a);
      this.C();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dyc $$3x = this.a($$0x, edl.b.a);
         if ($$3x != null && $$2x != null && $$3x.p() == $$1x) {
            $$3x.c($$2x, this.r.J_());
         }
      });
   }

   public void a(vw $$0) {
      for (edm $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void b(boolean $$0) {
      this.q = $$0;
   }

   public djx H() {
      return this.r;
   }

   public Map<iv, dyc> I() {
      return this.k;
   }

   public void a(ars $$0) {
      djc $$1 = this.f();

      for (int $$2 = 0; $$2 < this.b.length; $$2++) {
         if (this.b[$$2] != null) {
            ShortListIterator $$8 = this.b[$$2].iterator();

            while ($$8.hasNext()) {
               Short $$3 = (Short)$$8.next();
               iv $$4 = edv.a($$3, this.h($$2), $$1);
               ebe $$5 = this.a_($$4);
               exo $$6 = $$5.y();
               if (!$$6.c()) {
                  $$6.a($$0, $$4, $$5);
               }

               if (!($$5.b() instanceof dry)) {
                  ebe $$7 = dnc.b($$5, $$0, $$4);
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
         iv $$8 = (iv)var10.next();
         this.c_($$8);
      }

      this.j.clear();
      this.e.a(this);
   }

   @Nullable
   private dyc a(iv $$0, tz $$1) {
      ebe $$2 = this.a_($$0);
      dyc $$3;
      if ("DUMMY".equals($$1.b("id", ""))) {
         if ($$2.x()) {
            $$3 = ((dpw)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dyc.a($$0, $$2, $$1, this.r.J_());
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

   public void b(ars $$0) {
      $$0.n().a(this.c, this.v);
      $$0.o().a(this.c, this.w);
   }

   public void c(ars $$0) {
      $$0.n().a(this.c);
      $$0.o().a(this.c);
   }

   @Override
   public eec n() {
      return eec.n;
   }

   public arg F() {
      return this.s == null ? arg.b : this.s.get();
   }

   public void b(Supplier<arg> $$0) {
      this.s = $$0;
   }

   public void J() {
      this.k.values().forEach(dyc::aw_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void K() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof ars $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dyc> void b(T $$0, ars $$1) {
      dnc $$2 = $$0.m().b();
      if ($$2 instanceof dpw) {
         egg $$3 = ((dpw)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(jy.a($$0.aB_().v())).a($$3);
         }
      }
   }

   private <T extends dyc> void c(T $$0) {
      ebe $$1 = $$0.m();
      dyd<T> $$2 = $$1.a(this.r, (dye<T>)$$0.p());
      if ($$2 == null) {
         this.k($$0.aB_());
      } else {
         this.p.compute($$0.aB_(), ($$2x, $$3) -> {
            eaa $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (edl.d)$$3;
            } else if (this.L()) {
               edl.d $$5 = new edl.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dyc> eaa a(T $$0, dyd<T> $$1) {
      return new edl.a<>($$0, $$1);
   }

   class a<T extends dyc> implements eaa {
      private final T b;
      private final dyd<T> c;
      private boolean d;

      a(final T $$0, final dyd<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.n() && this.b.l()) {
            iv $$0 = this.b.aB_();
            if (edl.this.h($$0)) {
               try {
                  brb $$1 = bra.a();
                  $$1.a(this::d);
                  ebe $$2 = edl.this.a_($$0);
                  if (this.b.p().a($$2)) {
                     this.c.tick(edl.this.r, this.b.aB_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     edl.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
      public iv c() {
         return this.b.aB_();
      }

      @Override
      public String d() {
         return dye.a(this.b.p()).toString();
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
      void run(edl var1);
   }

   static class d implements eaa {
      private eaa a;

      d(eaa $$0) {
         this.a = $$0;
      }

      void a(eaa $$0) {
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
      public iv c() {
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
      void setUnsaved(djc var1);
   }
}
