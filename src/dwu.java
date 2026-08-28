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

public class dwu extends dwk {
   static final Logger n = LogUtils.getLogger();
   private static final dtm o = new dtm() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public je c() {
         return je.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<je, dwu.d> p = Maps.newHashMap();
   private boolean q;
   final deg r;
   @Nullable
   private Supplier<aqx> s;
   @Nullable
   private dwu.c t;
   private final Int2ObjectMap<dzo> u;
   private final faf<dhj> v;
   private final faf<eqo> w;

   public dwu(deg $$0, ddm $$1) {
      this($$0, $$1, dxh.a, new faf<>(), new faf<>(), 0L, null, null, null);
   }

   public dwu(deg $$0, ddm $$1, dxh $$2, faf<dhj> $$3, faf<eqo> $$4, long $$5, @Nullable dwv[] $$6, @Nullable dwu.c $$7, @Nullable ebn $$8) {
      super($$1, $$2, $$0, $$0.F_().d(lv.aG), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (eak.a $$9 : eak.a.values()) {
         if (dxl.n.e().contains($$9)) {
            this.h.put($$9, new eak(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dwu(arh $$0, dxe $$1, @Nullable dwu.c $$2) {
      this($$0, $$1.f(), $$1.q(), $$1.H(), $$1.I(), $$1.t(), $$1.d(), $$2, $$1.s());

      for (drs $$3 : $$1.E().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.G());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<eak.a, eak> $$5 : $$1.e()) {
         if (dxl.n.e().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.u());
      this.c = true;
   }

   @Override
   public fan<dhj> o() {
      return this.v;
   }

   @Override
   public fan<eqo> p() {
      return this.w;
   }

   @Override
   public dwk.a a(long $$0) {
      return new dwk.a(this.v.a($$0), this.w.a($$0));
   }

   @Override
   public dzo a(int $$0) {
      return this.r instanceof arh $$1 ? (dzo)this.u.computeIfAbsent($$0, $$2 -> new dzk($$1, $$0, this::i)) : super.a($$0);
   }

   @Override
   public duo a_(je $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.aj()) {
         duo $$4 = null;
         if ($$2 == 60) {
            $$4 = dhl.hW.o();
         }

         if ($$2 == 70) {
            $$4 = eab.a($$1, $$3);
         }

         return $$4 == null ? dhl.a.o() : $$4;
      } else {
         try {
            int $$5 = this.f($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dwv $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dhl.a.o();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }

   @Override
   public eqp b_(je $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public eqp a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.f($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dwv $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return eqq.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$6);
      }
   }

   @Nullable
   @Override
   public duo a(je $$0, duo $$1, boolean $$2) {
      int $$3 = $$0.v();
      dwv $$4 = this.b(this.f($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.l()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         duo $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dhj $$10 = $$1.b();
            this.h.get(eak.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(eak.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(eak.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(eak.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.P().p().a($$0, $$11);
               this.r.P().a(this.d.e, kg.a($$3), this.d.f, $$11);
            }

            if (eqg.a($$9, $$1)) {
               bod $$12 = this.r.ah();
               $$12.a("updateSkyLightSources");
               this.i.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.r.P().p().a($$0);
               $$12.c();
            }

            boolean $$13 = $$9.x();
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

               if ($$1.x()) {
                  drs $$14 = this.a($$0, dwu.b.c);
                  if ($$14 != null && !$$14.b($$1)) {
                     n.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{$$0, $$14.q().a().h().a(), $$1});
                     this.d($$0);
                     $$14 = null;
                  }

                  if ($$14 == null) {
                     $$14 = ((dkb)$$10).a($$0, $$1);
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
   public void a(bto $$0) {
   }

   @Nullable
   private drs g(je $$0) {
      duo $$1 = this.a_($$0);
      return !$$1.x() ? null : ((dkb)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public drs c_(je $$0) {
      return this.a($$0, dwu.b.c);
   }

   @Nullable
   public drs a(je $$0, dwu.b $$1) {
      drs $$2 = this.k.get($$0);
      if ($$2 == null) {
         uf $$3 = this.j.remove($$0);
         if ($$3 != null) {
            drs $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dwu.b.a) {
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

   public void b(drs $$0) {
      this.a($$0);
      if (this.J()) {
         if (this.r instanceof arh $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean J() {
      return this.q || this.r.w_();
   }

   boolean h(je $$0) {
      if (!this.r.A_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof arh $$1) ? true : this.C().a(aqx.c) && $$1.c(ddm.a($$0));
      }
   }

   @Override
   public void a(drs $$0) {
      je $$1 = $$0.aB_();
      duo $$2 = this.a_($$1);
      if (!$$2.x()) {
         n.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
      } else {
         duo $$3 = $$0.m();
         if ($$2 != $$3) {
            if (!$$0.q().a($$2)) {
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
         drs $$4 = this.k.put($$1.j(), $$0);
         if ($$4 != null && $$4 != $$0) {
            $$4.aw_();
         }
      }
   }

   @Nullable
   @Override
   public uf a(je $$0, jp.a $$1) {
      drs $$2 = this.c_($$0);
      if ($$2 != null && !$$2.n()) {
         uf $$3 = $$2.b(this.r.F_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         uf $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.i();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(je $$0) {
      if (this.J()) {
         drs $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof arh $$2) {
               this.a($$1, $$2);
            }

            $$1.aw_();
         }
      }

      this.k($$0);
   }

   private <T extends drs> void a(T $$0, arh $$1) {
      dhj $$2 = $$0.m().b();
      if ($$2 instanceof dkb) {
         dzn $$3 = ((dkb)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = kg.a($$0.aB_().v());
            dzo $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void i(int $$0) {
      this.u.remove($$0);
   }

   private void k(je $$0) {
      dwu.d $$1 = this.p.remove($$0);
      if ($$1 != null) {
         $$1.a(o);
      }
   }

   public void D() {
      if (this.t != null) {
         this.t.run(this);
         this.t = null;
      }
   }

   public boolean B() {
      return false;
   }

   public void a(wa $$0, uf $$1, Consumer<adk.b> $$2) {
      this.H();

      for (dwv $$3 : this.m) {
         $$3.a($$0);
      }

      for (eak.a $$4 : eak.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.z();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         drs $$3 = this.a($$0x, dwu.b.a);
         if ($$3 != null && $$2x != null && $$3.q() == $$1x) {
            $$3.c($$2x, this.r.F_());
         }
      });
   }

   public void a(wa $$0) {
      for (dwv $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public deg E() {
      return this.r;
   }

   public Map<je, drs> F() {
      return this.k;
   }

   public void G() {
      ddm $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               je $$3 = dxe.a($$2, this.h($$1), $$0);
               duo $$4 = this.a_($$3);
               eqp $$5 = $$4.y();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3, $$4);
               }

               if (!($$4.b() instanceof dlz)) {
                  duo $$6 = dhj.b($$4, this.r, $$3);
                  if ($$6 != $$4) {
                     this.r.a($$3, $$6, 20);
                  }
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         je $$7 = (je)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private drs a(je $$0, uf $$1) {
      duo $$2 = this.a_($$0);
      drs $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.x()) {
            $$3 = ((dkb)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = drs.a($$0, $$2, $$1, this.r.F_());
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

   public void a(arh $$0) {
      $$0.m().a(this.d, this.v);
      $$0.n().a(this.d, this.w);
   }

   public void b(arh $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public dxl j() {
      return dxl.n;
   }

   public aqx C() {
      return this.s == null ? aqx.b : this.s.get();
   }

   public void b(Supplier<aqx> $$0) {
      this.s = $$0;
   }

   public void H() {
      this.k.values().forEach(drs::aw_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void I() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof arh $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends drs> void b(T $$0, arh $$1) {
      dhj $$2 = $$0.m().b();
      if ($$2 instanceof dkb) {
         dzn $$3 = ((dkb)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(kg.a($$0.aB_().v())).a($$3);
         }
      }
   }

   private <T extends drs> void c(T $$0) {
      duo $$1 = $$0.m();
      drt<T> $$2 = $$1.a(this.r, (dru<T>)$$0.q());
      if ($$2 == null) {
         this.k($$0.aB_());
      } else {
         this.p.compute($$0.aB_(), ($$2x, $$3) -> {
            dtm $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dwu.d)$$3;
            } else if (this.J()) {
               dwu.d $$5 = new dwu.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends drs> dtm a(T $$0, drt<T> $$1) {
      return new dwu.a<>($$0, $$1);
   }

   class a<T extends drs> implements dtm {
      private final T b;
      private final drt<T> c;
      private boolean d;

      a(final T $$0, final drt<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.n() && this.b.l()) {
            je $$0 = this.b.aB_();
            if (dwu.this.h($$0)) {
               try {
                  bod $$1 = dwu.this.r.ah();
                  $$1.a(this::d);
                  duo $$2 = dwu.this.a_($$0);
                  if (this.b.q().a($$2)) {
                     this.c.tick(dwu.this.r, this.b.aB_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dwu.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
      public je c() {
         return this.b.aB_();
      }

      @Override
      public String d() {
         return dru.a(this.b.q()).toString();
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
      void run(dwu var1);
   }

   class d implements dtm {
      private dtm a;

      d(final dtm $$0) {
         this.a = $$0;
      }

      void a(dtm $$0) {
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
      public je c() {
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
