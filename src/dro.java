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

public class dro extends dre {
   static final Logger n = LogUtils.getLogger();
   private static final dog o = new dog() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public id c() {
         return id.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<id, dro.d> p = Maps.newHashMap();
   private boolean q;
   final czg r;
   @Nullable
   private Supplier<apn> s;
   @Nullable
   private dro.c t;
   private final Int2ObjectMap<due> u;
   private final etv<dch> v;
   private final etv<ela> w;

   public dro(czg $$0, cyn $$1) {
      this($$0, $$1, dsb.a, new etv<>(), new etv<>(), 0L, null, null, null);
   }

   public dro(czg $$0, cyn $$1, dsb $$2, etv<dch> $$3, etv<ela> $$4, long $$5, @Nullable drp[] $$6, @Nullable dro.c $$7, @Nullable dwd $$8) {
      super($$1, $$2, $$0, $$0.H_().d(ku.aw), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dva.a $$9 : dva.a.values()) {
         if (dsd.n.h().contains($$9)) {
            this.h.put($$9, new dva(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dro(apu $$0, dry $$1, @Nullable dro.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.G(), $$1.H(), $$1.u(), $$1.d(), $$2, $$1.t());

      for (dmo $$3 : $$1.D().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.F());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dva.a, dva> $$5 : $$1.e()) {
         if (dsd.n.h().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.v());
      this.c = true;
   }

   @Override
   public eud<dch> o() {
      return this.v;
   }

   @Override
   public eud<ela> p() {
      return this.w;
   }

   @Override
   public dre.a q() {
      return new dre.a(this.v, this.w);
   }

   @Override
   public due a(int $$0) {
      return this.r instanceof apu $$1 ? (due)this.u.computeIfAbsent($$0, $$2 -> new dua($$1, $$0, this::c)) : super.a($$0);
   }

   @Override
   public dpi a_(id $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.ah()) {
         dpi $$4 = null;
         if ($$2 == 60) {
            $$4 = dcj.hW.n();
         }

         if ($$2 == 70) {
            $$4 = dur.a($$1, $$3);
         }

         return $$4 == null ? dcj.a.n() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               drp $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dcj.a.n();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }

   @Override
   public elb b_(id $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public elb a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            drp $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return elc.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$6);
      }
   }

   @Nullable
   @Override
   public dpi a(id $$0, dpi $$1, boolean $$2) {
      int $$3 = $$0.v();
      drp $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.i()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dpi $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dch $$10 = $$1.b();
            this.h.get(dva.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dva.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dva.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dva.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.M().p().a($$0, $$11);
            }

            if (eks.a(this, $$0, $$9, $$1)) {
               bkt $$12 = this.r.af();
               $$12.a("updateSkyLightSources");
               this.i.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.r.M().p().a($$0);
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
                  dmo $$14 = this.a($$0, dro.b.c);
                  if ($$14 == null) {
                     $$14 = ((dez)$$10).a($$0, $$1);
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
   public void a(bqa $$0) {
   }

   @Nullable
   private dmo g(id $$0) {
      dpi $$1 = this.a_($$0);
      return !$$1.t() ? null : ((dez)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dmo c_(id $$0) {
      return this.a($$0, dro.b.c);
   }

   @Nullable
   public dmo a(id $$0, dro.b $$1) {
      dmo $$2 = this.k.get($$0);
      if ($$2 == null) {
         to $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dmo $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dro.b.a) {
            $$2 = this.g($$0);
            if ($$2 != null) {
               this.b($$2);
            }
         }
      } else if ($$2.o()) {
         this.k.remove($$0);
         return null;
      }

      return $$2;
   }

   public void b(dmo $$0) {
      this.a($$0);
      if (this.K()) {
         if (this.r instanceof apu $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean K() {
      return this.q || this.r.x_();
   }

   boolean h(id $$0) {
      if (!this.r.C_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof apu $$1) ? true : this.D().a(apn.c) && $$1.c(cyn.a($$0));
      }
   }

   @Override
   public void a(dmo $$0) {
      id $$1 = $$0.az_();
      if (this.a_($$1).t()) {
         $$0.a(this.r);
         $$0.p();
         dmo $$2 = this.k.put($$1.i(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.aw_();
         }
      }
   }

   @Nullable
   @Override
   public to a(id $$0, ip.a $$1) {
      dmo $$2 = this.c_($$0);
      if ($$2 != null && !$$2.o()) {
         to $$3 = $$2.b(this.r.H_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         to $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.h();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(id $$0) {
      if (this.K()) {
         dmo $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof apu $$2) {
               this.a($$1, $$2);
            }

            $$1.aw_();
         }
      }

      this.k($$0);
   }

   private <T extends dmo> void a(T $$0, apu $$1) {
      dch $$2 = $$0.n().b();
      if ($$2 instanceof dez) {
         dud $$3 = ((dez)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = jg.a($$0.az_().v());
            due $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void c(int $$0) {
      this.u.remove($$0);
   }

   private void k(id $$0) {
      dro.d $$1 = this.p.remove($$0);
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

   public void a(vi $$0, to $$1, Consumer<acl.b> $$2) {
      this.I();

      for (drp $$3 : this.m) {
         $$3.a($$0);
      }

      for (dva.a $$4 : dva.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.A();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dmo $$3 = this.a($$0x, dro.b.a);
         if ($$3 != null && $$2x != null && $$3.r() == $$1x) {
            $$3.a($$2x, this.r.H_());
         }
      });
   }

   public void a(vi $$0) {
      for (drp $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public czg F() {
      return this.r;
   }

   public Map<id, dmo> G() {
      return this.k;
   }

   public void H() {
      cyn $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               id $$3 = dry.a($$2, this.g($$1), $$0);
               dpi $$4 = this.a_($$3);
               elb $$5 = $$4.u();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3);
               }

               if (!($$4.b() instanceof dgw)) {
                  dpi $$6 = dch.b($$4, this.r, $$3);
                  this.r.a($$3, $$6, 20);
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         id $$7 = (id)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private dmo a(id $$0, to $$1) {
      dpi $$2 = this.a_($$0);
      dmo $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.t()) {
            $$3 = ((dez)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dmo.a($$0, $$2, $$1, this.r.H_());
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

   public void a(apu $$0) {
      $$0.m().a(this.d, this.v);
      $$0.n().a(this.d, this.w);
   }

   public void b(apu $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public dsd j() {
      return dsd.n;
   }

   public apn D() {
      return this.s == null ? apn.b : this.s.get();
   }

   public void b(Supplier<apn> $$0) {
      this.s = $$0;
   }

   public void I() {
      this.k.values().forEach(dmo::aw_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void J() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof apu $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dmo> void b(T $$0, apu $$1) {
      dch $$2 = $$0.n().b();
      if ($$2 instanceof dez) {
         dud $$3 = ((dez)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(jg.a($$0.az_().v())).a($$3);
         }
      }
   }

   private <T extends dmo> void c(T $$0) {
      dpi $$1 = $$0.n();
      dmp<T> $$2 = $$1.a(this.r, (dmq<T>)$$0.r());
      if ($$2 == null) {
         this.k($$0.az_());
      } else {
         this.p.compute($$0.az_(), ($$2x, $$3) -> {
            dog $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dro.d)$$3;
            } else if (this.K()) {
               dro.d $$5 = new dro.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dmo> dog a(T $$0, dmp<T> $$1) {
      return new dro.a<>($$0, $$1);
   }

   class a<T extends dmo> implements dog {
      private final T b;
      private final dmp<T> c;
      private boolean d;

      a(T $$0, dmp<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.o() && this.b.m()) {
            id $$0 = this.b.az_();
            if (dro.this.h($$0)) {
               try {
                  bkt $$1 = dro.this.r.af();
                  $$1.a(this::d);
                  dpi $$2 = dro.this.a_($$0);
                  if (this.b.r().a($$2)) {
                     this.c.tick(dro.this.r, this.b.az_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dro.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
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
         return this.b.o();
      }

      @Override
      public id c() {
         return this.b.az_();
      }

      @Override
      public String d() {
         return dmq.a(this.b.r()).toString();
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
      void run(dro var1);
   }

   class d implements dog {
      private dog b;

      d(dog $$0) {
         this.b = $$0;
      }

      void a(dog $$0) {
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
      public id c() {
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
