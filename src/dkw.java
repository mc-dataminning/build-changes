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

public class dkw extends dkl {
   static final Logger n = LogUtils.getLogger();
   private static final dhu o = new dhu() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public hv c() {
         return hv.b;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<hv, dkw.d> p = Maps.newHashMap();
   private boolean q;
   final csy r;
   @Nullable
   private Supplier<ami> s;
   @Nullable
   private dkw.c t;
   private final Int2ObjectMap<dnc> u;
   private final emi<cvz> v;
   private final emi<edy> w;

   public dkw(csy $$0, csf $$1) {
      this($$0, $$1, dlj.a, new emi<>(), new emi<>(), 0L, null, null, null);
   }

   public dkw(csy $$0, csf $$1, dlj $$2, emi<cvz> $$3, emi<edy> $$4, long $$5, @Nullable dkx[] $$6, @Nullable dkw.c $$7, @Nullable dpb $$8) {
      super($$1, $$2, $$0, $$0.I_().d(kc.as), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dny.a $$9 : dny.a.values()) {
         if (dkq.n.h().contains($$9)) {
            this.h.put($$9, new dny(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dkw(amp $$0, dlg $$1, @Nullable dkw.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dgd $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dny.a, dny> $$5 : $$1.e()) {
         if (dkq.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public emq<cvz> o() {
      return this.v;
   }

   @Override
   public emq<edy> p() {
      return this.w;
   }

   @Override
   public dkl.a q() {
      return new dkl.a(this.v, this.w);
   }

   @Override
   public dnc a(int $$0) {
      return this.r instanceof amp $$1 ? (dnc)this.u.computeIfAbsent($$0, $$2 -> new dmy($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public dip a_(hv $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ag()) {
         dip $$4 = null;
         if ($$2 == 60) {
            $$4 = cwb.hW.o();
         }

         if ($$2 == 70) {
            $$4 = dnp.a($$1, $$3);
         }

         return $$4 == null ? cwb.a.o() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dkx $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return cwb.a.o();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public edz b_(hv $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public edz a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dkx $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return eea.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public dip a(hv $$0, dip $$1, boolean $$2) {
      int $$3 = $$0.v();
      dkx $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dip $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            cvz $$10 = $$1.b();
            this.h.get(dny.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dny.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dny.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dny.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.K().p().a($$0, $$11);
            }

            if (edq.a(this, $$0, $$9, $$1)) {
               bgc $$12 = this.r.ae();
               $$12.a("updateSkyLightSources");
               this.i.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.r.K().p().a($$0);
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
                  dgd $$14 = this.a($$0, dkw.b.c);
                  if ($$14 == null) {
                     $$14 = ((cyr)$$10).a($$0, $$1);
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
   public void a(blf $$0) {
   }

   @Nullable
   private dgd j(hv $$0) {
      dip $$1 = this.a_($$0);
      return !$$1.t() ? null : ((cyr)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dgd c_(hv $$0) {
      return this.a($$0, dkw.b.c);
   }

   @Nullable
   public dgd a(hv $$0, dkw.b $$1) {
      dgd $$2 = this.k.get($$0);
      if ($$2 == null) {
         sj $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dgd $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dkw.b.a) {
            $$2 = this.j($$0);
            if ($$2 != null) {
               this.b($$2);
            }
         }
      } else if ($$2.s()) {
         this.k.remove($$0);
         return null;
      }

      return $$2;
   }

   public void b(dgd $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof amp $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean K() {
      return this.q || this.r.y_();
   }

   boolean k(hv $$0) {
      if (!this.r.D_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof amp $$1) ? true : this.D().a(ami.c) && $$1.c(csf.a($$0));
      }
   }

   @Override
   public void a(dgd $$0) {
      hv $$1 = $$0.aB_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.t();
         dgd $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.ay_();
         }
      }
   }

   @Nullable
   @Override
   public sj g(hv $$0) {
      dgd $$1 = this.c_($$0);
      if ($$1 != null && !$$1.s()) {
         sj $$2 = $$1.o();
         $$2.a("keepPacked", false);
         return $$2;
      } else {
         sj $$3 = this.j.get($$0);
         if ($$3 != null) {
            $$3 = $$3.h();
            $$3.a("keepPacked", true);
         }

         return $$3;
      }
   }

   @Override
   public void d(hv $$0) {
      if (this.K()) {
         dgd $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof amp $$2) {
               this.a($$1, $$2);
            }

            $$1.ay_();
         }
      }

      this.l($$0);
   }

   private <T extends dgd> void a(T $$0, amp $$1) {
      cvz $$2 = $$0.r().b();
      if ($$2 instanceof cyr) {
         dnb $$3 = ((cyr)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = ix.a($$0.aB_().v());
            dnc $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void l(hv $$0) {
      dkw.d $$1 = this.p.remove($$0);
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

   public void a(ue $$0, sj $$1, Consumer<zx.b> $$2) {
      this.I();

      for (dkx $$3 : this.m) {
         $$3.a($$0);
      }

      for (dny.a $$4 : dny.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dgd $$3 = this.a($$0x, dkw.b.a);
         if ($$3 != null && $$2x != null && $$3.v() == $$1x) {
            $$3.a($$2x);
         }
      });
   }

   public void a(ue $$0) {
      for (dkx $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public csy F() {
      return this.r;
   }

   public Map<hv, dgd> G() {
      return this.k;
   }

   public void H() {
      csf $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               hv $$3 = dlg.a($$2, this.g($$1), $$0);
               dip $$4 = this.a_($$3);
               edz $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof dao)) {
                  dip $$6 = cvz.b($$4, this.r, $$3);
                  this.r.a($$3, $$6, 20);
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         hv $$7 = (hv)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private dgd a(hv $$0, sj $$1) {
      dip $$2 = this.a_($$0);
      dgd $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((cyr)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dgd.a($$0, $$2, $$1);
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

   public void a(amp $$0) {
      $$0.l().a(this.d, this.v);
      $$0.m().a(this.d, this.w);
   }

   public void b(amp $$0) {
      $$0.l().a(this.d);
      $$0.m().a(this.d);
   }

   @Override
   public dkq j() {
      return dkq.n;
   }

   public ami D() {
      return this.s == null ? ami.b : this.s.get();
   }

   public void b(Supplier<ami> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dgd::ay_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof amp $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dgd> void b(T $$0, amp $$1) {
      cvz $$2 = $$0.r().b();
      if ($$2 instanceof cyr) {
         dnb $$3 = ((cyr)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(ix.a($$0.aB_().v())).a($$3);
         }
      }
   }

   private <T extends dgd> void c(T $$0) {
      dip $$1 = $$0.r();
      dge<T> $$2 = $$1.a(this.r, (dgf<T>)$$0.v());
      if ($$2 == null) {
         this.l($$0.aB_());
      } else {
         this.p.compute($$0.aB_(), ($$2x, $$3) -> {
            dhu $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dkw.d)$$3;
            } else if (this.K()) {
               dkw.d $$5 = new dkw.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dgd> dhu a(T $$0, dge<T> $$1) {
      return new dkw.a<>($$0, $$1);
   }

   class a<T extends dgd> implements dhu {
      private final T b;
      private final dge<T> c;
      private boolean d;

      a(T $$0, dge<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.s() && this.b.n()) {
            hv $$0 = this.b.aB_();
            if (dkw.this.k($$0)) {
               try {
                  bgc $$1 = dkw.this.r.ae();
                  $$1.a(this::d);
                  dip $$2 = dkw.this.a_($$0);
                  if (this.b.v().a($$2)) {
                     this.c.tick(dkw.this.r, this.b.aB_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dkw.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return this.b.s();
      }

      @Override
      public hv c() {
         return this.b.aB_();
      }

      @Override
      public String d() {
         return dgf.a(this.b.v()).toString();
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
      void run(dkw var1);
   }

   class d implements dhu {
      private dhu b;

      d(dhu $$0) {
         this.b = $$0;
      }

      void a(dhu $$0) {
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
      public hv c() {
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
