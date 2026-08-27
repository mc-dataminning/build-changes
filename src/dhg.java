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

public class dhg extends dgv {
   static final Logger n = LogUtils.getLogger();
   private static final deb o = new deb() {
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
   private final Map<gu, dhg.d> p = Maps.newHashMap();
   private boolean q;
   final cpl r;
   @Nullable
   private Supplier<akd> s;
   @Nullable
   private dhg.c t;
   private final Int2ObjectMap<djm> u;
   private final eik<csl> v;
   private final eik<eab> w;

   public dhg(cpl $$0, cos $$1) {
      this($$0, $$1, dht.a, new eik<>(), new eik<>(), 0L, null, null, null);
   }

   public dhg(cpl $$0, cos $$1, dht $$2, eik<csl> $$3, eik<eab> $$4, long $$5, @Nullable dhh[] $$6, @Nullable dhg.c $$7, @Nullable dll $$8) {
      super($$1, $$2, $$0, $$0.B_().d(jc.ap), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dki.a $$9 : dki.a.values()) {
         if (dha.n.h().contains($$9)) {
            this.h.put($$9, new dki(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dhg(akk $$0, dhq $$1, @Nullable dhg.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dcl $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dki.a, dki> $$5 : $$1.e()) {
         if (dha.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public eis<csl> o() {
      return this.v;
   }

   @Override
   public eis<eab> p() {
      return this.w;
   }

   @Override
   public dgv.a q() {
      return new dgv.a(this.v, this.w);
   }

   @Override
   public djm a(int $$0) {
      return this.r instanceof akk $$1 ? (djm)this.u.computeIfAbsent($$0, $$2 -> new dji($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public dez a_(gu $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.af()) {
         dez $$4 = null;
         if ($$2 == 60) {
            $$4 = csm.hW.n();
         }

         if ($$2 == 70) {
            $$4 = djz.a($$1, $$3);
         }

         return $$4 == null ? csm.a.n() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dhh $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return csm.a.n();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public eac b_(gu $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public eac a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dhh $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return ead.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public dez a(gu $$0, dez $$1, boolean $$2) {
      int $$3 = $$0.v();
      dhh $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dez $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            csl $$10 = $$1.b();
            this.h.get(dki.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dki.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dki.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dki.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.J().p().a($$0, $$11);
            }

            if (dzt.a(this, $$0, $$9, $$1)) {
               bdh $$12 = this.r.ad();
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
                  dcl $$14 = this.a($$0, dhg.b.c);
                  if ($$14 == null) {
                     $$14 = ((cuz)$$10).a($$0, $$1);
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
   public void a(bii $$0) {
   }

   @Nullable
   private dcl j(gu $$0) {
      dez $$1 = this.a_($$0);
      return !$$1.t() ? null : ((cuz)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dcl c_(gu $$0) {
      return this.a($$0, dhg.b.c);
   }

   @Nullable
   public dcl a(gu $$0, dhg.b $$1) {
      dcl $$2 = this.k.get($$0);
      if ($$2 == null) {
         qr $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dcl $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dhg.b.a) {
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

   public void b(dcl $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof akk $$1) {
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
         return !(this.r instanceof akk $$1) ? true : this.D().a(akd.c) && $$1.c(cos.a($$0));
      }
   }

   @Override
   public void a(dcl $$0) {
      gu $$1 = $$0.p();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.s();
         dcl $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.ao_();
         }
      }
   }

   @Nullable
   @Override
   public qr g(gu $$0) {
      dcl $$1 = this.c_($$0);
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
         dcl $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof akk $$2) {
               this.a($$1, $$2);
            }

            $$1.ao_();
         }
      }

      this.l($$0);
   }

   private <T extends dcl> void a(T $$0, akk $$1) {
      csl $$2 = $$0.q().b();
      if ($$2 instanceof cuz) {
         djl $$3 = ((cuz)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = hx.a($$0.p().v());
            djm $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void l(gu $$0) {
      dhg.d $$1 = this.p.remove($$0);
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

   public void a(si $$0, qr $$1, Consumer<xz.b> $$2) {
      this.I();

      for (dhh $$3 : this.m) {
         $$3.a($$0);
      }

      for (dki.a $$4 : dki.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dcl $$3 = this.a($$0x, dhg.b.a);
         if ($$3 != null && $$2x != null && $$3.u() == $$1x) {
            $$3.a($$2x);
         }
      });
   }

   public void a(si $$0) {
      for (dhh $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public cpl F() {
      return this.r;
   }

   public Map<gu, dcl> G() {
      return this.k;
   }

   public void H() {
      cos $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               gu $$3 = dhq.a($$2, this.g($$1), $$0);
               dez $$4 = this.a_($$3);
               eac $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof cwy)) {
                  dez $$6 = csl.b($$4, this.r, $$3);
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
   private dcl a(gu $$0, qr $$1) {
      dez $$2 = this.a_($$0);
      dcl $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((cuz)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dcl.a($$0, $$2, $$1);
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

   public void a(akk $$0) {
      $$0.l().a(this.d, this.v);
      $$0.m().a(this.d, this.w);
   }

   public void b(akk $$0) {
      $$0.l().a(this.d);
      $$0.m().a(this.d);
   }

   @Override
   public dha j() {
      return dha.n;
   }

   public akd D() {
      return this.s == null ? akd.b : this.s.get();
   }

   public void b(Supplier<akd> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dcl::ao_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof akk $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dcl> void b(T $$0, akk $$1) {
      csl $$2 = $$0.q().b();
      if ($$2 instanceof cuz) {
         djl $$3 = ((cuz)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(hx.a($$0.p().v())).a($$3);
         }
      }
   }

   private <T extends dcl> void c(T $$0) {
      dez $$1 = $$0.q();
      dcm<T> $$2 = $$1.a(this.r, (dcn<T>)$$0.u());
      if ($$2 == null) {
         this.l($$0.p());
      } else {
         this.p.compute($$0.p(), ($$2x, $$3) -> {
            deb $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dhg.d)$$3;
            } else if (this.K()) {
               dhg.d $$5 = new dhg.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dcl> deb a(T $$0, dcm<T> $$1) {
      return new dhg.a<>($$0, $$1);
   }

   class a<T extends dcl> implements deb {
      private final T b;
      private final dcm<T> c;
      private boolean d;

      a(T $$0, dcm<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.r() && this.b.l()) {
            gu $$0 = this.b.p();
            if (dhg.this.k($$0)) {
               try {
                  bdh $$1 = dhg.this.r.ad();
                  $$1.a(this::d);
                  dez $$2 = dhg.this.a_($$0);
                  if (this.b.u().a($$2)) {
                     this.c.tick(dhg.this.r, this.b.p(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dhg.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return dcn.a(this.b.u()).toString();
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
      void run(dhg var1);
   }

   class d implements deb {
      private deb b;

      d(deb $$0) {
         this.b = $$0;
      }

      void a(deb $$0) {
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
         return this.b + " <wrapped>";
      }
   }
}
