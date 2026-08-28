import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dva extends dug {
   @Nullable
   private volatile enw n;
   private volatile dvh o = dvh.c;
   private final List<tx> p = Lists.newArrayList();
   private final Map<dyb.a, duf> q = new Object2ObjectArrayMap();
   @Nullable
   private dxt r;
   private final exu<dfh> s;
   private final exu<eog> t;

   public dva(dbm $$0, dvd $$1, dch $$2, jw<ddf> $$3, @Nullable dzi $$4) {
      this($$0, $$1, null, new exu<>(), new exu<>(), $$2, $$3, $$4);
   }

   public dva(dbm $$0, dvd $$1, @Nullable dur[] $$2, exu<dfh> $$3, exu<eog> $$4, dch $$5, jw<ddf> $$6, @Nullable dzi $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public exz<dfh> o() {
      return this.s;
   }

   @Override
   public exz<eog> p() {
      return this.t;
   }

   @Override
   public dug.a q() {
      return new dug.a(this.s, this.t);
   }

   @Override
   public dsk a_(ja $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dfj.nb.o();
      } else {
         dur $$2 = this.b(this.e($$1));
         return $$2.c() ? dfj.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eoh b_(ja $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return eoi.a.g();
      } else {
         dur $$2 = this.b(this.e($$1));
         return $$2.c() ? eoi.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dsk a(ja $$0, dsk $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.am()) {
         int $$6 = this.e($$4);
         dur $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dfj.a)) {
            return $$1;
         } else {
            int $$9 = kc.b($$3);
            int $$10 = kc.b($$4);
            int $$11 = kc.b($$5);
            dsk $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(dvh.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eny.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dyf.a> $$14 = this.j().e();
            EnumSet<dyf.a> $$15 = null;

            for (dyf.a $$16 : $$14) {
               dyf $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dyf.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dyf.a(this, $$15);
            }

            for (dyf.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dfj.nb.o();
      }
   }

   @Override
   public void a(dpp $$0) {
      this.k.put($$0.az_(), $$0);
   }

   @Nullable
   @Override
   public dpp c_(ja $$0) {
      return this.k.get($$0);
   }

   public Map<ja, dpp> D() {
      return this.k;
   }

   public void b(tx $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bsg $$0) {
      if (!$$0.bS()) {
         tx $$1 = new tx();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eiw $$0, eje $$1) {
      dxt $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         eio $$3 = $$1.a();
         dch $$4 = this.z();
         if ($$3.i() < $$4.I_() || $$3.l() >= $$4.am()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<tx> E() {
      return this.p;
   }

   @Override
   public dvh j() {
      return this.o;
   }

   public void a(dvh $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public jj<ddf> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().a(dvh.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(ja $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static ja a(short $$0, int $$1, dbm $$2) {
      int $$3 = kc.a($$2.e, $$0 & 15);
      int $$4 = kc.a($$1, $$0 >>> 4 & 15);
      int $$5 = kc.a($$2.f, $$0 >>> 8 & 15);
      return new ja($$3, $$4, $$5);
   }

   @Override
   public void e(ja $$0) {
      if (!this.s($$0)) {
         dug.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dug.a(this.b, $$1).add($$0);
   }

   public Map<ja, tx> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public tx a(ja $$0, jl.a $$1) {
      dpp $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(ja $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public duf a(dyb.a $$0) {
      return this.q.get($$0);
   }

   public duf b(dyb.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new duf(this.J_(), this.I_()));
   }

   public void a(dyb.a $$0, duf $$1) {
      this.q.put($$0, $$1);
   }

   public void a(enw $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dxt $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dxt x() {
      return this.r;
   }

   private static <T> exr<T> a(exu<T> $$0) {
      return new exr<>($$0.b());
   }

   public exr<dfh> G() {
      return a(this.s);
   }

   public exr<eog> H() {
      return a(this.t);
   }

   @Override
   public dch z() {
      return (dch)(this.y() ? dxt.b : this);
   }
}
