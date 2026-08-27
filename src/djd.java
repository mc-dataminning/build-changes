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

public class djd extends dis {
   static final Logger n = LogUtils.getLogger();
   private static final dgi o = new dgi() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public ht c() {
         return ht.b;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<ht, djd.d> p = Maps.newHashMap();
   private boolean q;
   final crs r;
   @Nullable
   private Supplier<alt> s;
   @Nullable
   private djd.c t;
   private final Int2ObjectMap<dlj> u;
   private final ekp<cut> v;
   private final ekp<ecf> w;

   public djd(crs $$0, cqz $$1) {
      this($$0, $$1, djq.a, new ekp<>(), new ekp<>(), 0L, null, null, null);
   }

   public djd(crs $$0, cqz $$1, djq $$2, ekp<cut> $$3, ekp<ecf> $$4, long $$5, @Nullable dje[] $$6, @Nullable djd.c $$7, @Nullable dni $$8) {
      super($$1, $$2, $$0, $$0.H_().d(jz.ar), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dmf.a $$9 : dmf.a.values()) {
         if (dix.n.h().contains($$9)) {
            this.h.put($$9, new dmf(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public djd(ama $$0, djn $$1, @Nullable djd.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (der $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dmf.a, dmf> $$5 : $$1.e()) {
         if (dix.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public ekx<cut> o() {
      return this.v;
   }

   @Override
   public ekx<ecf> p() {
      return this.w;
   }

   @Override
   public dis.a q() {
      return new dis.a(this.v, this.w);
   }

   @Override
   public dlj a(int $$0) {
      return this.r instanceof ama $$1 ? (dlj)this.u.computeIfAbsent($$0, $$2 -> new dlf($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public dgw a_(ht $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.af()) {
         dgw $$4 = null;
         if ($$2 == 60) {
            $$4 = cuv.hW.o();
         }

         if ($$2 == 70) {
            $$4 = dlw.a($$1, $$3);
         }

         return $$4 == null ? cuv.a.o() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dje $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return cuv.a.o();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public ecg b_(ht $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public ecg a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dje $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return ech.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public dgw a(ht $$0, dgw $$1, boolean $$2) {
      int $$3 = $$0.v();
      dje $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dgw $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            cut $$10 = $$1.b();
            this.h.get(dmf.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dmf.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dmf.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dmf.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.J().p().a($$0, $$11);
            }

            if (ebx.a(this, $$0, $$9, $$1)) {
               bfh $$12 = this.r.ad();
               $$12.a("updateSkyLightSources");
               this.i.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.r.J().p().a($$0);
               $$12.c();
            }

            boolean $$13 = $$9.t();
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

               if ($$1.t()) {
                  der $$14 = this.a($$0, djd.b.c);
                  if ($$14 == null) {
                     $$14 = ((cxk)$$10).a($$0, $$1);
                     if ($$14 != null) {
                        this.b($$14);
                     }
                  } else {
                     $$14.b($$1);
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
   public void a(bki $$0) {
   }

   @Nullable
   private der j(ht $$0) {
      dgw $$1 = this.a_($$0);
      return !$$1.t() ? null : ((cxk)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public der c_(ht $$0) {
      return this.a($$0, djd.b.c);
   }

   @Nullable
   public der a(ht $$0, djd.b $$1) {
      der $$2 = this.k.get($$0);
      if ($$2 == null) {
         rz $$3 = this.j.remove($$0);
         if ($$3 != null) {
            der $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == djd.b.a) {
            $$2 = this.j($$0);
            if ($$2 != null) {
               this.b($$2);
            }
         }
      } else if ($$2.r()) {
         this.k.remove($$0);
         return null;
      }

      return $$2;
   }

   public void b(der $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof ama $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean K() {
      return this.q || this.r.x_();
   }

   boolean k(ht $$0) {
      if (!this.r.C_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof ama $$1) ? true : this.D().a(alt.c) && $$1.c(cqz.a($$0));
      }
   }

   @Override
   public void a(der $$0) {
      ht $$1 = $$0.p();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.s();
         der $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.aw_();
         }
      }
   }

   @Nullable
   @Override
   public rz g(ht $$0) {
      der $$1 = this.c_($$0);
      if ($$1 != null && !$$1.r()) {
         rz $$2 = $$1.m();
         $$2.a("keepPacked", false);
         return $$2;
      } else {
         rz $$3 = this.j.get($$0);
         if ($$3 != null) {
            $$3 = $$3.h();
            $$3.a("keepPacked", true);
         }

         return $$3;
      }
   }

   @Override
   public void d(ht $$0) {
      if (this.K()) {
         der $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof ama $$2) {
               this.a($$1, $$2);
            }

            $$1.aw_();
         }
      }

      this.l($$0);
   }

   private <T extends der> void a(T $$0, ama $$1) {
      cut $$2 = $$0.q().b();
      if ($$2 instanceof cxk) {
         dli $$3 = ((cxk)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = iu.a($$0.p().v());
            dlj $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void l(ht $$0) {
      djd.d $$1 = this.p.remove($$0);
      if ($$1 != null) {
         $$1.a(o);
      }
   }

   public void E() {
      if (this.t != null) {
         this.t.run(this);
         this.t = null;
      }
   }

   public boolean C() {
      return false;
   }

   public void a(tu $$0, rz $$1, Consumer<zm.b> $$2) {
      this.I();

      for (dje $$3 : this.m) {
         $$3.a($$0);
      }

      for (dmf.a $$4 : dmf.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         der $$3 = this.a($$0x, djd.b.a);
         if ($$3 != null && $$2x != null && $$3.u() == $$1x) {
            $$3.a($$2x);
         }
      });
   }

   public void a(tu $$0) {
      for (dje $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public crs F() {
      return this.r;
   }

   public Map<ht, der> G() {
      return this.k;
   }

   public void H() {
      cqz $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               ht $$3 = djn.a($$2, this.g($$1), $$0);
               dgw $$4 = this.a_($$3);
               ecg $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof czi)) {
                  dgw $$6 = cut.b($$4, this.r, $$3);
                  this.r.a($$3, $$6, 20);
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         ht $$7 = (ht)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private der a(ht $$0, rz $$1) {
      dgw $$2 = this.a_($$0);
      der $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((cxk)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = der.a($$0, $$2, $$1);
      }

      if ($$3 != null) {
         $$3.a(this.r);
         this.b($$3);
      } else {
         n.warn("Tried to load a block entity for block {} but failed at location {}", $$2, $$0);
      }

      return $$3;
   }

   public void c(long $$0) {
      this.v.a($$0);
      this.w.a($$0);
   }

   public void a(ama $$0) {
      $$0.l().a(this.d, this.v);
      $$0.m().a(this.d, this.w);
   }

   public void b(ama $$0) {
      $$0.l().a(this.d);
      $$0.m().a(this.d);
   }

   @Override
   public dix j() {
      return dix.n;
   }

   public alt D() {
      return this.s == null ? alt.b : this.s.get();
   }

   public void b(Supplier<alt> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(der::aw_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof ama $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends der> void b(T $$0, ama $$1) {
      cut $$2 = $$0.q().b();
      if ($$2 instanceof cxk) {
         dli $$3 = ((cxk)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(iu.a($$0.p().v())).a($$3);
         }
      }
   }

   private <T extends der> void c(T $$0) {
      dgw $$1 = $$0.q();
      des<T> $$2 = $$1.a(this.r, (det<T>)$$0.u());
      if ($$2 == null) {
         this.l($$0.p());
      } else {
         this.p.compute($$0.p(), ($$2x, $$3) -> {
            dgi $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (djd.d)$$3;
            } else if (this.K()) {
               djd.d $$5 = new djd.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends der> dgi a(T $$0, des<T> $$1) {
      return new djd.a<>($$0, $$1);
   }

   class a<T extends der> implements dgi {
      private final T b;
      private final des<T> c;
      private boolean d;

      a(T $$0, des<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.r() && this.b.l()) {
            ht $$0 = this.b.p();
            if (djd.this.k($$0)) {
               try {
                  bfh $$1 = djd.this.r.ad();
                  $$1.a(this::d);
                  dgw $$2 = djd.this.a_($$0);
                  if (this.b.u().a($$2)) {
                     this.c.tick(djd.this.r, this.b.p(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     djd.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
                  }

                  $$1.c();
               } catch (Throwable var5) {
                  o $$4 = o.a(var5, "Ticking block entity");
                  p $$5 = $$4.a("Block entity being ticked");
                  this.b.a($$5);
                  throw new y($$4);
               }
            }
         }
      }

      @Override
      public boolean b() {
         return this.b.r();
      }

      @Override
      public ht c() {
         return this.b.p();
      }

      @Override
      public String d() {
         return det.a(this.b.u()).toString();
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
      void run(djd var1);
   }

   class d implements dgi {
      private dgi b;

      d(dgi $$0) {
         this.b = $$0;
      }

      void a(dgi $$0) {
         this.b = $$0;
      }

      @Override
      public void a() {
         this.b.a();
      }

      @Override
      public boolean b() {
         return this.b.b();
      }

      @Override
      public ht c() {
         return this.b.c();
      }

      @Override
      public String d() {
         return this.b.d();
      }

      @Override
      public String toString() {
         return this.b + " <wrapped>";
      }
   }
}
