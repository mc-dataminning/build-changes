import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dhu extends dgz {
   @Nullable
   private volatile dzv n;
   private volatile dhe o = dhe.c;
   private final List<qw> p = Lists.newArrayList();
   private final Map<dki.a, dgy> q = new Object2ObjectArrayMap();
   @Nullable
   private dka r;
   private final eir<ctc> s;
   private final eir<eaf> t;

   public dhu(cpi $$0, dhx $$1, cqd $$2, hq<cqz> $$3, @Nullable dlp $$4) {
      this($$0, $$1, null, new eir<>(), new eir<>(), $$2, $$3, $$4);
   }

   public dhu(cpi $$0, dhx $$1, @Nullable dhl[] $$2, eir<ctc> $$3, eir<eaf> $$4, cqd $$5, hq<cqz> $$6, @Nullable dlp $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public eiw<ctc> o() {
      return this.s;
   }

   @Override
   public eiw<eaf> p() {
      return this.t;
   }

   @Override
   public dgz.a q() {
      return new dgz.a(this.s, this.t);
   }

   @Override
   public dfd a_(gw $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return cte.nb.o();
      } else {
         dhl $$2 = this.b(this.e($$1));
         return $$2.c() ? cte.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eag b_(gw $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return eah.a.g();
      } else {
         dhl $$2 = this.b(this.e($$1));
         return $$2.c() ? eah.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dfd a(gw $$0, dfd $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.H_() && $$4 < this.aj()) {
         int $$6 = this.e($$4);
         dhl $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(cte.a)) {
            return $$1;
         } else {
            int $$9 = hw.b($$3);
            int $$10 = hw.b($$4);
            int $$11 = hw.b($$5);
            dfd $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dhe.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (dzx.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dkm.a> $$14 = this.j().h();
            EnumSet<dkm.a> $$15 = null;

            for (dkm.a $$16 : $$14) {
               dkm $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dkm.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dkm.a(this, $$15);
            }

            for (dkm.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return cte.nb.o();
      }
   }

   @Override
   public void a(dcz $$0) {
      this.k.put($$0.p(), $$0);
   }

   @Nullable
   @Override
   public dcz c_(gw $$0) {
      return this.k.get($$0);
   }

   public Map<gw, dcz> D() {
      return this.k;
   }

   public void b(qw $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(biw $$0) {
      if (!$$0.bN()) {
         qw $$1 = new qw();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(dvc $$0, dvk $$1) {
      dka $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         duu $$3 = $$1.a();
         cqd $$4 = this.z();
         if ($$3.h() < $$4.H_() || $$3.k() >= $$4.aj()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<qw> E() {
      return this.p;
   }

   @Override
   public dhe j() {
      return this.o;
   }

   public void a(dhe $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public he<cqz> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dhe.f)) {
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

   public static gw a(short $$0, int $$1, cpi $$2) {
      int $$3 = hw.a($$2.e, $$0 & 15);
      int $$4 = hw.a($$1, $$0 >>> 4 & 15);
      int $$5 = hw.a($$2.f, $$0 >>> 8 & 15);
      return new gw($$3, $$4, $$5);
   }

   @Override
   public void e(gw $$0) {
      if (!this.r($$0)) {
         dgz.a(this.b, this.e($$0.v())).add(j($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dgz.a(this.b, $$1).add($$0);
   }

   public Map<gw, qw> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public qw g(gw $$0) {
      dcz $$1 = this.c_($$0);
      return $$1 != null ? $$1.m() : this.j.get($$0);
   }

   @Override
   public void d(gw $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dgy a(dki.a $$0) {
      return this.q.get($$0);
   }

   public dgy b(dki.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dgy(this.I_(), this.H_()));
   }

   public void a(dki.a $$0, dgy $$1) {
      this.q.put($$0, $$1);
   }

   public void a(dzv $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dka $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dka x() {
      return this.r;
   }

   private static <T> eio<T> a(eir<T> $$0) {
      return new eio<>($$0.b());
   }

   public eio<ctc> G() {
      return a(this.s);
   }

   public eio<eaf> H() {
      return a(this.t);
   }

   @Override
   public cqd z() {
      return (cqd)(this.y() ? dka.b : this);
   }
}
