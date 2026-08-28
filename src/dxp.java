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

public class dxp extends dxf {
   static final Logger o = LogUtils.getLogger();
   private static final dug p = new dug() {
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
   private final Map<jh, dxp.d> q = Maps.newHashMap();
   private boolean r;
   final dfb s;
   @Nullable
   private Supplier<ard> t;
   @Nullable
   private dxp.c u;
   private final Int2ObjectMap<eaj> v;
   private final fba<die> w;
   private final fba<erj> x;

   public dxp(dfb $$0, deh $$1) {
      this($$0, $$1, dyc.a, new fba<>(), new fba<>(), 0L, null, null, null);
   }

   public dxp(dfb $$0, deh $$1, dyc $$2, fba<die> $$3, fba<erj> $$4, long $$5, @Nullable dxq[] $$6, @Nullable dxp.c $$7, @Nullable eci $$8) {
      super($$1, $$2, $$0, $$0.H_().e(lz.aG), $$5, $$6, $$8);
      this.s = $$0;
      this.v = new Int2ObjectOpenHashMap();

      for (ebf.a $$9 : ebf.a.values()) {
         if (dyg.n.e().contains($$9)) {
            this.i.put($$9, new ebf(this, $$9));
         }
      }

      this.u = $$7;
      this.w = $$3;
      this.x = $$4;
   }

   public dxp(arn $$0, dxz $$1, @Nullable dxp.c $$2) {
      this($$0, $$1.f(), $$1.q(), $$1.H(), $$1.I(), $$1.t(), $$1.d(), $$2, $$1.s());

      for (dsm $$3 : $$1.E().values()) {
         this.a($$3);
      }

      this.k.putAll($$1.G());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<ebf.a, ebf> $$5 : $$1.e()) {
         if (dyg.n.e().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.j = $$1.j;
      this.b($$1.u());
      this.c = true;
   }

   @Override
   public fbi<die> o() {
      return this.w;
   }

   @Override
   public fbi<erj> p() {
      return this.x;
   }

   @Override
   public dxf.a a(long $$0) {
      return new dxf.a(this.w.a($$0), this.x.a($$0));
   }

   @Override
   public eaj a(int $$0) {
      return this.s instanceof arn $$1 ? (eaj)this.v.computeIfAbsent($$0, $$2 -> new eaf($$1, $$0, this::i)) : super.a($$0);
   }

   @Override
   public dvj a_(jh $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.s.ah()) {
         dvj $$4 = null;
         if ($$2 == 60) {
            $$4 = dig.hW.m();
         }

         if ($$2 == 70) {
            $$4 = eaw.a($$1, $$3);
         }

         return $$4 == null ? dig.a.m() : $$4;
      } else {
         try {
            int $$5 = this.f($$2);
            if ($$5 >= 0 && $$5 < this.n.length) {
               dxq $$6 = this.n[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dig.a.m();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }

   @Override
   public erk b_(jh $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public erk a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.f($$1);
         if ($$3 >= 0 && $$3 < this.n.length) {
            dxq $$4 = this.n[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return erl.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$6);
      }
   }

   @Nullable
   @Override
   public dvj a(jh $$0, dvj $$1, boolean $$2) {
      int $$3 = $$0.v();
      dxq $$4 = this.b(this.f($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.l()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dvj $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            die $$10 = $$1.b();
            this.i.get(ebf.a.e).a($$6, $$3, $$8, $$1);
            this.i.get(ebf.a.f).a($$6, $$3, $$8, $$1);
            this.i.get(ebf.a.d).a($$6, $$3, $$8, $$1);
            this.i.get(ebf.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.s.P().p().a($$0, $$11);
               this.s.P().a(this.d.g, kj.a($$3), this.d.h, $$11);
            }

            if (erb.a($$9, $$1)) {
               bon $$12 = bom.a();
               $$12.a("updateSkyLightSources");
               this.j.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.s.P().p().a($$0);
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
                  dsm $$14 = this.a($$0, dxp.b.c);
                  if ($$14 != null && !$$14.b($$1)) {
                     o.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{$$0, $$14.q().a().h().a(), $$1});
                     this.d($$0);
                     $$14 = null;
                  }

                  if ($$14 == null) {
                     $$14 = ((dkw)$$10).a($$0, $$1);
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
   public void a(bue $$0) {
   }

   @Nullable
   private dsm g(jh $$0) {
      dvj $$1 = this.a_($$0);
      return !$$1.x() ? null : ((dkw)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dsm c_(jh $$0) {
      return this.a($$0, dxp.b.c);
   }

   @Nullable
   public dsm a(jh $$0, dxp.b $$1) {
      dsm $$2 = this.l.get($$0);
      if ($$2 == null) {
         uk $$3 = this.k.remove($$0);
         if ($$3 != null) {
            dsm $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dxp.b.a) {
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

   public void b(dsm $$0) {
      this.a($$0);
      if (this.J()) {
         if (this.s instanceof arn $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean J() {
      return this.r || this.s.y_();
   }

   boolean h(jh $$0) {
      if (!this.s.C_().a($$0)) {
         return false;
      } else {
         return !(this.s instanceof arn $$1) ? true : this.C().a(ard.c) && $$1.c(deh.a($$0));
      }
   }

   @Override
   public void a(dsm $$0) {
      jh $$1 = $$0.aB_();
      dvj $$2 = this.a_($$1);
      if (!$$2.x()) {
         o.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
      } else {
         dvj $$3 = $$0.m();
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
         dsm $$4 = this.l.put($$1.j(), $$0);
         if ($$4 != null && $$4 != $$0) {
            $$4.aw_();
         }
      }
   }

   @Nullable
   @Override
   public uk a(jh $$0, js.a $$1) {
      dsm $$2 = this.c_($$0);
      if ($$2 != null && !$$2.n()) {
         uk $$3 = $$2.b(this.s.H_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         uk $$4 = this.k.get($$0);
         if ($$4 != null) {
            $$4 = $$4.i();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(jh $$0) {
      if (this.J()) {
         dsm $$1 = this.l.remove($$0);
         if ($$1 != null) {
            if (this.s instanceof arn $$2) {
               this.a($$1, $$2);
            }

            $$1.aw_();
         }
      }

      this.k($$0);
   }

   private <T extends dsm> void a(T $$0, arn $$1) {
      die $$2 = $$0.m().b();
      if ($$2 instanceof dkw) {
         eai $$3 = ((dkw)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = kj.a($$0.aB_().v());
            eaj $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void i(int $$0) {
      this.v.remove($$0);
   }

   private void k(jh $$0) {
      dxp.d $$1 = this.q.remove($$0);
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

   public void a(wf $$0, uk $$1, Consumer<adp.b> $$2) {
      this.H();

      for (dxq $$3 : this.n) {
         $$3.a($$0);
      }

      for (ebf.a $$4 : ebf.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.z();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dsm $$3 = this.a($$0x, dxp.b.a);
         if ($$3 != null && $$2x != null && $$3.q() == $$1x) {
            $$3.c($$2x, this.s.H_());
         }
      });
   }

   public void a(wf $$0) {
      for (dxq $$1 : this.n) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.r = $$0;
   }

   public dfb E() {
      return this.s;
   }

   public Map<jh, dsm> F() {
      return this.l;
   }

   public void G() {
      deh $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               jh $$3 = dxz.a($$2, this.h($$1), $$0);
               dvj $$4 = this.a_($$3);
               erk $$5 = $$4.y();
               if (!$$5.c()) {
                  $$5.a(this.s, $$3, $$4);
               }

               if (!($$4.b() instanceof dmt)) {
                  dvj $$6 = die.b($$4, this.s, $$3);
                  if ($$6 != $$4) {
                     this.s.a($$3, $$6, 20);
                  }
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.k.keySet()).iterator();

      while (var9.hasNext()) {
         jh $$7 = (jh)var9.next();
         this.c_($$7);
      }

      this.k.clear();
      this.f.a(this);
   }

   @Nullable
   private dsm a(jh $$0, uk $$1) {
      dvj $$2 = this.a_($$0);
      dsm $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.x()) {
            $$3 = ((dkw)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            o.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dsm.a($$0, $$2, $$1, this.s.H_());
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

   public void a(arn $$0) {
      $$0.m().a(this.d, this.w);
      $$0.n().a(this.d, this.x);
   }

   public void b(arn $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public dyg j() {
      return dyg.n;
   }

   public ard C() {
      return this.t == null ? ard.b : this.t.get();
   }

   public void b(Supplier<ard> $$0) {
      this.t = $$0;
   }

   public void H() {
      this.l.values().forEach(dsm::aw_);
      this.l.clear();
      this.q.values().forEach($$0 -> $$0.a(p));
      this.q.clear();
   }

   public void I() {
      this.l.values().forEach($$0 -> {
         if (this.s instanceof arn $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dsm> void b(T $$0, arn $$1) {
      die $$2 = $$0.m().b();
      if ($$2 instanceof dkw) {
         eai $$3 = ((dkw)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(kj.a($$0.aB_().v())).a($$3);
         }
      }
   }

   private <T extends dsm> void c(T $$0) {
      dvj $$1 = $$0.m();
      dsn<T> $$2 = $$1.a(this.s, (dso<T>)$$0.q());
      if ($$2 == null) {
         this.k($$0.aB_());
      } else {
         this.q.compute($$0.aB_(), ($$2x, $$3) -> {
            dug $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dxp.d)$$3;
            } else if (this.J()) {
               dxp.d $$5 = new dxp.d($$4);
               this.s.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dsm> dug a(T $$0, dsn<T> $$1) {
      return new dxp.a<>($$0, $$1);
   }

   class a<T extends dsm> implements dug {
      private final T b;
      private final dsn<T> c;
      private boolean d;

      a(final T $$0, final dsn<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.n() && this.b.l()) {
            jh $$0 = this.b.aB_();
            if (dxp.this.h($$0)) {
               try {
                  bon $$1 = bom.a();
                  $$1.a(this::d);
                  dvj $$2 = dxp.this.a_($$0);
                  if (this.b.q().a($$2)) {
                     this.c.tick(dxp.this.s, this.b.aB_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dxp.o.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return dso.a(this.b.q()).toString();
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
      void run(dxp var1);
   }

   class d implements dug {
      private dug a;

      d(final dug $$0) {
         this.a = $$0;
      }

      void a(dug $$0) {
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
