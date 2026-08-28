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

public class dwy extends dwo {
   static final Logger n = LogUtils.getLogger();
   private static final dtp o = new dtp() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public jf c() {
         return jf.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<jf, dwy.d> p = Maps.newHashMap();
   private boolean q;
   final dej r;
   @Nullable
   private Supplier<aqz> s;
   @Nullable
   private dwy.c t;
   private final Int2ObjectMap<dzs> u;
   private final faj<dhm> v;
   private final faj<eqs> w;

   public dwy(dej $$0, ddp $$1) {
      this($$0, $$1, dxl.a, new faj<>(), new faj<>(), 0L, null, null, null);
   }

   public dwy(dej $$0, ddp $$1, dxl $$2, faj<dhm> $$3, faj<eqs> $$4, long $$5, @Nullable dwz[] $$6, @Nullable dwy.c $$7, @Nullable ebr $$8) {
      super($$1, $$2, $$0, $$0.G_().e(lw.aH), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (eao.a $$9 : eao.a.values()) {
         if (dxp.n.e().contains($$9)) {
            this.h.put($$9, new eao(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dwy(arj $$0, dxi $$1, @Nullable dwy.c $$2) {
      this($$0, $$1.f(), $$1.q(), $$1.H(), $$1.I(), $$1.t(), $$1.d(), $$2, $$1.s());

      for (drv $$3 : $$1.E().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.G());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<eao.a, eao> $$5 : $$1.e()) {
         if (dxp.n.e().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.u());
      this.c = true;
   }

   @Override
   public far<dhm> o() {
      return this.v;
   }

   @Override
   public far<eqs> p() {
      return this.w;
   }

   @Override
   public dwo.a a(long $$0) {
      return new dwo.a(this.v.a($$0), this.w.a($$0));
   }

   @Override
   public dzs a(int $$0) {
      return this.r instanceof arj $$1 ? (dzs)this.u.computeIfAbsent($$0, $$2 -> new dzo($$1, $$0, this::i)) : super.a($$0);
   }

   @Override
   public dus a_(jf $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.aj()) {
         dus $$4 = null;
         if ($$2 == 60) {
            $$4 = dho.hW.n();
         }

         if ($$2 == 70) {
            $$4 = eaf.a($$1, $$3);
         }

         return $$4 == null ? dho.a.n() : $$4;
      } else {
         try {
            int $$5 = this.f($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dwz $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dho.a.n();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }

   @Override
   public eqt b_(jf $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public eqt a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.f($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dwz $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return equ.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$6);
      }
   }

   @Nullable
   @Override
   public dus a(jf $$0, dus $$1, boolean $$2) {
      int $$3 = $$0.v();
      dwz $$4 = this.b(this.f($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.l()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dus $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dhm $$10 = $$1.b();
            this.h.get(eao.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(eao.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(eao.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(eao.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.P().p().a($$0, $$11);
               this.r.P().a(this.d.e, kh.a($$3), this.d.f, $$11);
            }

            if (eqk.a($$9, $$1)) {
               bog $$12 = this.r.ah();
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
                  drv $$14 = this.a($$0, dwy.b.c);
                  if ($$14 != null && !$$14.b($$1)) {
                     n.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{$$0, $$14.q().a().h().a(), $$1});
                     this.d($$0);
                     $$14 = null;
                  }

                  if ($$14 == null) {
                     $$14 = ((dke)$$10).a($$0, $$1);
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
   public void a(btr $$0) {
   }

   @Nullable
   private drv g(jf $$0) {
      dus $$1 = this.a_($$0);
      return !$$1.x() ? null : ((dke)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public drv c_(jf $$0) {
      return this.a($$0, dwy.b.c);
   }

   @Nullable
   public drv a(jf $$0, dwy.b $$1) {
      drv $$2 = this.k.get($$0);
      if ($$2 == null) {
         ug $$3 = this.j.remove($$0);
         if ($$3 != null) {
            drv $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dwy.b.a) {
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

   public void b(drv $$0) {
      this.a($$0);
      if (this.J()) {
         if (this.r instanceof arj $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean J() {
      return this.q || this.r.x_();
   }

   boolean h(jf $$0) {
      if (!this.r.B_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof arj $$1) ? true : this.C().a(aqz.c) && $$1.c(ddp.a($$0));
      }
   }

   @Override
   public void a(drv $$0) {
      jf $$1 = $$0.aC_();
      dus $$2 = this.a_($$1);
      if (!$$2.x()) {
         n.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
      } else {
         dus $$3 = $$0.m();
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
         drv $$4 = this.k.put($$1.j(), $$0);
         if ($$4 != null && $$4 != $$0) {
            $$4.ax_();
         }
      }
   }

   @Nullable
   @Override
   public ug a(jf $$0, jq.a $$1) {
      drv $$2 = this.c_($$0);
      if ($$2 != null && !$$2.n()) {
         ug $$3 = $$2.b(this.r.G_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         ug $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.i();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(jf $$0) {
      if (this.J()) {
         drv $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof arj $$2) {
               this.a($$1, $$2);
            }

            $$1.ax_();
         }
      }

      this.k($$0);
   }

   private <T extends drv> void a(T $$0, arj $$1) {
      dhm $$2 = $$0.m().b();
      if ($$2 instanceof dke) {
         dzr $$3 = ((dke)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = kh.a($$0.aC_().v());
            dzs $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void i(int $$0) {
      this.u.remove($$0);
   }

   private void k(jf $$0) {
      dwy.d $$1 = this.p.remove($$0);
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

   public void a(wb $$0, ug $$1, Consumer<adl.b> $$2) {
      this.H();

      for (dwz $$3 : this.m) {
         $$3.a($$0);
      }

      for (eao.a $$4 : eao.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.z();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         drv $$3 = this.a($$0x, dwy.b.a);
         if ($$3 != null && $$2x != null && $$3.q() == $$1x) {
            $$3.c($$2x, this.r.G_());
         }
      });
   }

   public void a(wb $$0) {
      for (dwz $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public dej E() {
      return this.r;
   }

   public Map<jf, drv> F() {
      return this.k;
   }

   public void G() {
      ddp $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               jf $$3 = dxi.a($$2, this.h($$1), $$0);
               dus $$4 = this.a_($$3);
               eqt $$5 = $$4.y();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3, $$4);
               }

               if (!($$4.b() instanceof dmc)) {
                  dus $$6 = dhm.b($$4, this.r, $$3);
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
         jf $$7 = (jf)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private drv a(jf $$0, ug $$1) {
      dus $$2 = this.a_($$0);
      drv $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.x()) {
            $$3 = ((dke)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = drv.a($$0, $$2, $$1, this.r.G_());
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

   public void a(arj $$0) {
      $$0.m().a(this.d, this.v);
      $$0.n().a(this.d, this.w);
   }

   public void b(arj $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public dxp j() {
      return dxp.n;
   }

   public aqz C() {
      return this.s == null ? aqz.b : this.s.get();
   }

   public void b(Supplier<aqz> $$0) {
      this.s = $$0;
   }

   public void H() {
      this.k.values().forEach(drv::ax_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void I() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof arj $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends drv> void b(T $$0, arj $$1) {
      dhm $$2 = $$0.m().b();
      if ($$2 instanceof dke) {
         dzr $$3 = ((dke)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(kh.a($$0.aC_().v())).a($$3);
         }
      }
   }

   private <T extends drv> void c(T $$0) {
      dus $$1 = $$0.m();
      drw<T> $$2 = $$1.a(this.r, (drx<T>)$$0.q());
      if ($$2 == null) {
         this.k($$0.aC_());
      } else {
         this.p.compute($$0.aC_(), ($$2x, $$3) -> {
            dtp $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dwy.d)$$3;
            } else if (this.J()) {
               dwy.d $$5 = new dwy.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends drv> dtp a(T $$0, drw<T> $$1) {
      return new dwy.a<>($$0, $$1);
   }

   class a<T extends drv> implements dtp {
      private final T b;
      private final drw<T> c;
      private boolean d;

      a(final T $$0, final drw<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.n() && this.b.l()) {
            jf $$0 = this.b.aC_();
            if (dwy.this.h($$0)) {
               try {
                  bog $$1 = dwy.this.r.ah();
                  $$1.a(this::d);
                  dus $$2 = dwy.this.a_($$0);
                  if (this.b.q().a($$2)) {
                     this.c.tick(dwy.this.r, this.b.aC_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dwy.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
      public jf c() {
         return this.b.aC_();
      }

      @Override
      public String d() {
         return drx.a(this.b.q()).toString();
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
      void run(dwy var1);
   }

   class d implements dtp {
      private dtp a;

      d(final dtp $$0) {
         this.a = $$0;
      }

      void a(dtp $$0) {
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
      public jf c() {
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
