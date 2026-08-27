import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dic extends dhh {
   @Nullable
   private volatile ead n;
   private volatile dhm o = dhm.c;
   private final List<qy> p = Lists.newArrayList();
   private final Map<dkq.a, dhg> q = new Object2ObjectArrayMap();
   @Nullable
   private dki r;
   private final eiz<csx> s;
   private final eiz<ean> t;

   public dic(cpe $$0, dif $$1, cpz $$2, ht<cqv> $$3, @Nullable dlx $$4) {
      this($$0, $$1, null, new eiz<>(), new eiz<>(), $$2, $$3, $$4);
   }

   public dic(cpe $$0, dif $$1, @Nullable dht[] $$2, eiz<csx> $$3, eiz<ean> $$4, cpz $$5, ht<cqv> $$6, @Nullable dlx $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public eje<csx> o() {
      return this.s;
   }

   @Override
   public eje<ean> p() {
      return this.t;
   }

   @Override
   public dhh.a q() {
      return new dhh.a(this.s, this.t);
   }

   @Override
   public dfl a_(gw $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return csy.nb.n();
      } else {
         dht $$2 = this.b(this.e($$1));
         return $$2.c() ? csy.a.n() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eao b_(gw $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return eap.a.g();
      } else {
         dht $$2 = this.b(this.e($$1));
         return $$2.c() ? eap.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dfl a(gw $$0, dfl $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.H_() && $$4 < this.aj()) {
         int $$6 = this.e($$4);
         dht $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(csy.a)) {
            return $$1;
         } else {
            int $$9 = hz.b($$3);
            int $$10 = hz.b($$4);
            int $$11 = hz.b($$5);
            dfl $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dhm.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eaf.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dku.a> $$14 = this.j().h();
            EnumSet<dku.a> $$15 = null;

            for (dku.a $$16 : $$14) {
               dku $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dku.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dku.a(this, $$15);
            }

            for (dku.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return csy.nb.n();
      }
   }

   @Override
   public void a(dcx $$0) {
      this.k.put($$0.p(), $$0);
   }

   @Nullable
   @Override
   public dcx c_(gw $$0) {
      return this.k.get($$0);
   }

   public Map<gw, dcx> D() {
      return this.k;
   }

   public void b(qy $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bis $$0) {
      if (!$$0.bN()) {
         qy $$1 = new qy();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(dvk $$0, dvs $$1) {
      dki $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         dvc $$3 = $$1.a();
         cpz $$4 = this.z();
         if ($$3.h() < $$4.H_() || $$3.k() >= $$4.aj()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<qy> E() {
      return this.p;
   }

   @Override
   public dhm j() {
      return this.o;
   }

   public void a(dhm $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public hg<cqv> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dhm.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short j(gw $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static gw a(short $$0, int $$1, cpe $$2) {
      int $$3 = hz.a($$2.e, $$0 & 15);
      int $$4 = hz.a($$1, $$0 >>> 4 & 15);
      int $$5 = hz.a($$2.f, $$0 >>> 8 & 15);
      return new gw($$3, $$4, $$5);
   }

   @Override
   public void e(gw $$0) {
      if (!this.r($$0)) {
         dhh.a(this.b, this.e($$0.v())).add(j($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dhh.a(this.b, $$1).add($$0);
   }

   public Map<gw, qy> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public qy g(gw $$0) {
      dcx $$1 = this.c_($$0);
      return $$1 != null ? $$1.m() : this.j.get($$0);
   }

   @Override
   public void d(gw $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dhg a(dkq.a $$0) {
      return this.q.get($$0);
   }

   public dhg b(dkq.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dhg(this.I_(), this.H_()));
   }

   public void a(dkq.a $$0, dhg $$1) {
      this.q.put($$0, $$1);
   }

   public void a(ead $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dki $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dki x() {
      return this.r;
   }

   private static <T> eiw<T> a(eiz<T> $$0) {
      return new eiw<>($$0.b());
   }

   public eiw<csx> G() {
      return a(this.s);
   }

   public eiw<ean> H() {
      return a(this.t);
   }

   @Override
   public cpz z() {
      return (cpz)(this.y() ? dki.b : this);
   }
}
