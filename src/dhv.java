import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dhv extends dha {
   @Nullable
   private volatile dzw n;
   private volatile dhf o = dhf.c;
   private final List<qu> p = Lists.newArrayList();
   private final Map<dkj.a, dgz> q = new Object2ObjectArrayMap();
   @Nullable
   private dkb r;
   private final eis<csq> s;
   private final eis<eag> t;

   public dhv(cox $$0, dhy $$1, cps $$2, ht<cqo> $$3, @Nullable dlq $$4) {
      this($$0, $$1, null, new eis<>(), new eis<>(), $$2, $$3, $$4);
   }

   public dhv(cox $$0, dhy $$1, @Nullable dhm[] $$2, eis<csq> $$3, eis<eag> $$4, cps $$5, ht<cqo> $$6, @Nullable dlq $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public eix<csq> o() {
      return this.s;
   }

   @Override
   public eix<eag> p() {
      return this.t;
   }

   @Override
   public dha.a q() {
      return new dha.a(this.s, this.t);
   }

   @Override
   public dfe a_(gw $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return csr.nb.n();
      } else {
         dhm $$2 = this.b(this.e($$1));
         return $$2.c() ? csr.a.n() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eah b_(gw $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return eai.a.g();
      } else {
         dhm $$2 = this.b(this.e($$1));
         return $$2.c() ? eai.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dfe a(gw $$0, dfe $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.C_() && $$4 < this.aj()) {
         int $$6 = this.e($$4);
         dhm $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(csr.a)) {
            return $$1;
         } else {
            int $$9 = hz.b($$3);
            int $$10 = hz.b($$4);
            int $$11 = hz.b($$5);
            dfe $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dhf.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (dzy.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dkn.a> $$14 = this.j().h();
            EnumSet<dkn.a> $$15 = null;

            for (dkn.a $$16 : $$14) {
               dkn $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dkn.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dkn.a(this, $$15);
            }

            for (dkn.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return csr.nb.n();
      }
   }

   @Override
   public void a(dcq $$0) {
      this.k.put($$0.p(), $$0);
   }

   @Nullable
   @Override
   public dcq c_(gw $$0) {
      return this.k.get($$0);
   }

   public Map<gw, dcq> D() {
      return this.k;
   }

   public void b(qu $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bil $$0) {
      if (!$$0.bN()) {
         qu $$1 = new qu();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(dvd $$0, dvl $$1) {
      dkb $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         duv $$3 = $$1.a();
         cps $$4 = this.z();
         if ($$3.h() < $$4.C_() || $$3.k() >= $$4.aj()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<qu> E() {
      return this.p;
   }

   @Override
   public dhf j() {
      return this.o;
   }

   public void a(dhf $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public hg<cqo> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dhf.f)) {
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

   public static gw a(short $$0, int $$1, cox $$2) {
      int $$3 = hz.a($$2.e, $$0 & 15);
      int $$4 = hz.a($$1, $$0 >>> 4 & 15);
      int $$5 = hz.a($$2.f, $$0 >>> 8 & 15);
      return new gw($$3, $$4, $$5);
   }

   @Override
   public void e(gw $$0) {
      if (!this.r($$0)) {
         dha.a(this.b, this.e($$0.v())).add(j($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dha.a(this.b, $$1).add($$0);
   }

   public Map<gw, qu> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public qu g(gw $$0) {
      dcq $$1 = this.c_($$0);
      return $$1 != null ? $$1.m() : this.j.get($$0);
   }

   @Override
   public void d(gw $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dgz a(dkj.a $$0) {
      return this.q.get($$0);
   }

   public dgz b(dkj.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dgz(this.D_(), this.C_()));
   }

   public void a(dkj.a $$0, dgz $$1) {
      this.q.put($$0, $$1);
   }

   public void a(dzw $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dkb $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dkb x() {
      return this.r;
   }

   private static <T> eip<T> a(eis<T> $$0) {
      return new eip<>($$0.b());
   }

   public eip<csq> G() {
      return a(this.s);
   }

   public eip<eag> H() {
      return a(this.t);
   }

   @Override
   public cps z() {
      return (cps)(this.y() ? dkb.b : this);
   }
}
