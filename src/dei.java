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

public class dei extends ddx {
   static final Logger n = LogUtils.getLogger();
   private static final dbd o = new dbd() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public gu c() {
         return gu.b;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<gu, dei.d> p = Maps.newHashMap();
   private boolean q;
   final cmm r;
   @Nullable
   private Supplier<ahy> s;
   @Nullable
   private dei.c t;
   private final Int2ObjectMap<dgo> u;
   private final efo<cpn> v;
   private final efo<dxd> w;

   public dei(cmm $$0, clt $$1) {
      this($$0, $$1, dev.a, new efo<>(), new efo<>(), 0L, null, null, null);
   }

   public dei(cmm $$0, clt $$1, dev $$2, efo<cpn> $$3, efo<dxd> $$4, long $$5, @Nullable dej[] $$6, @Nullable dei.c $$7, @Nullable din $$8) {
      super($$1, $$2, $$0, $$0.B_().d(jc.ap), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dhk.a $$9 : dhk.a.values()) {
         if (dec.n.h().contains($$9)) {
            this.h.put($$9, new dhk(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dei(aif $$0, des $$1, @Nullable dei.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (czn $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dhk.a, dhk> $$5 : $$1.e()) {
         if (dec.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public efw<cpn> o() {
      return this.v;
   }

   @Override
   public efw<dxd> p() {
      return this.w;
   }

   @Override
   public ddx.a q() {
      return new ddx.a(this.v, this.w);
   }

   @Override
   public dgo a(int $$0) {
      return this.r instanceof aif $$1 ? (dgo)this.u.computeIfAbsent($$0, $$2 -> new dgk($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public dcb a_(gu $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.af()) {
         dcb $$4 = null;
         if ($$2 == 60) {
            $$4 = cpo.hW.n();
         }

         if ($$2 == 70) {
            $$4 = dhb.a($$1, $$3);
         }

         return $$4 == null ? cpo.a.n() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dej $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return cpo.a.n();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public dxe b_(gu $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public dxe a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dej $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return dxf.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public dcb a(gu $$0, dcb $$1, boolean $$2) {
      int $$3 = $$0.v();
      dej $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dcb $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            cpn $$10 = $$1.b();
            this.h.get(dhk.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dhk.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dhk.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dhk.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.J().p().a($$0, $$11);
            }

            if (dwv.a(this, $$0, $$9, $$1)) {
               ban $$12 = this.r.ad();
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
                  czn $$14 = this.a($$0, dei.b.c);
                  if ($$14 == null) {
                     $$14 = ((csb)$$10).a($$0, $$1);
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
   public void a(bfj $$0) {
   }

   @Nullable
   private czn j(gu $$0) {
      dcb $$1 = this.a_($$0);
      return !$$1.t() ? null : ((csb)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public czn c_(gu $$0) {
      return this.a($$0, dei.b.c);
   }

   @Nullable
   public czn a(gu $$0, dei.b $$1) {
      czn $$2 = this.k.get($$0);
      if ($$2 == null) {
         qr $$3 = this.j.remove($$0);
         if ($$3 != null) {
            czn $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dei.b.a) {
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

   public void b(czn $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof aif $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean K() {
      return this.q || this.r.r_();
   }

   boolean k(gu $$0) {
      if (!this.r.w_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof aif $$1) ? true : this.D().a(ahy.c) && $$1.c(clt.a($$0));
      }
   }

   @Override
   public void a(czn $$0) {
      gu $$1 = $$0.p();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.s();
         czn $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.ap_();
         }
      }
   }

   @Nullable
   @Override
   public qr g(gu $$0) {
      czn $$1 = this.c_($$0);
      if ($$1 != null && !$$1.r()) {
         qr $$2 = $$1.m();
         $$2.a("keepPacked", false);
         return $$2;
      } else {
         qr $$3 = this.j.get($$0);
         if ($$3 != null) {
            $$3 = $$3.h();
            $$3.a("keepPacked", true);
         }

         return $$3;
      }
   }

   @Override
   public void d(gu $$0) {
      if (this.K()) {
         czn $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof aif $$2) {
               this.a($$1, $$2);
            }

            $$1.ap_();
         }
      }

      this.l($$0);
   }

   private <T extends czn> void a(T $$0, aif $$1) {
      cpn $$2 = $$0.q().b();
      if ($$2 instanceof csb) {
         dgn $$3 = ((csb)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = hx.a($$0.p().v());
            dgo $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void l(gu $$0) {
      dei.d $$1 = this.p.remove($$0);
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

   public void a(sf $$0, qr $$1, Consumer<wc.b> $$2) {
      this.I();

      for (dej $$3 : this.m) {
         $$3.a($$0);
      }

      for (dhk.a $$4 : dhk.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         czn $$3 = this.a($$0x, dei.b.a);
         if ($$3 != null && $$2x != null && $$3.u() == $$1x) {
            $$3.a($$2x);
         }
      });
   }

   public void a(sf $$0) {
      for (dej $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public cmm F() {
      return this.r;
   }

   public Map<gu, czn> G() {
      return this.k;
   }

   public void H() {
      clt $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               gu $$3 = des.a($$2, this.g($$1), $$0);
               dcb $$4 = this.a_($$3);
               dxe $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof cua)) {
                  dcb $$6 = cpn.b($$4, this.r, $$3);
                  this.r.a($$3, $$6, 20);
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         gu $$7 = (gu)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private czn a(gu $$0, qr $$1) {
      dcb $$2 = this.a_($$0);
      czn $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((csb)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = czn.a($$0, $$2, $$1);
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

   public void a(aif $$0) {
      $$0.l().a(this.d, this.v);
      $$0.m().a(this.d, this.w);
   }

   public void b(aif $$0) {
      $$0.l().a(this.d);
      $$0.m().a(this.d);
   }

   @Override
   public dec j() {
      return dec.n;
   }

   public ahy D() {
      return this.s == null ? ahy.b : this.s.get();
   }

   public void b(Supplier<ahy> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(czn::ap_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof aif $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends czn> void b(T $$0, aif $$1) {
      cpn $$2 = $$0.q().b();
      if ($$2 instanceof csb) {
         dgn $$3 = ((csb)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(hx.a($$0.p().v())).a($$3);
         }
      }
   }

   private <T extends czn> void c(T $$0) {
      dcb $$1 = $$0.q();
      czo<T> $$2 = $$1.a(this.r, (czp<T>)$$0.u());
      if ($$2 == null) {
         this.l($$0.p());
      } else {
         this.p.compute($$0.p(), ($$2x, $$3) -> {
            dbd $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dei.d)$$3;
            } else if (this.K()) {
               dei.d $$5 = new dei.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends czn> dbd a(T $$0, czo<T> $$1) {
      return new dei.a<>($$0, $$1);
   }

   class a<T extends czn> implements dbd {
      private final T b;
      private final czo<T> c;
      private boolean d;

      a(T $$0, czo<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.r() && this.b.l()) {
            gu $$0 = this.b.p();
            if (dei.this.k($$0)) {
               try {
                  ban $$1 = dei.this.r.ad();
                  $$1.a(this::d);
                  dcb $$2 = dei.this.a_($$0);
                  if (this.b.u().a($$2)) {
                     this.c.tick(dei.this.r, this.b.p(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dei.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
      public gu c() {
         return this.b.p();
      }

      @Override
      public String d() {
         return czp.a(this.b.u()).toString();
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
      void run(dei var1);
   }

   class d implements dbd {
      private dbd b;

      d(dbd $$0) {
         this.b = $$0;
      }

      void a(dbd $$0) {
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
      public gu c() {
         return this.b.c();
      }

      @Override
      public String d() {
         return this.b.d();
      }

      @Override
      public String toString() {
         return this.b.toString() + " <wrapped>";
      }
   }
}
