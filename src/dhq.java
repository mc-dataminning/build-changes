import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dhq extends dgv {
   @Nullable
   private volatile dzr n;
   private volatile dha o = dha.c;
   private final List<qr> p = Lists.newArrayList();
   private final Map<dke.a, dgu> q = new Object2ObjectArrayMap();
   @Nullable
   private djw r;
   private final ein<csl> s;
   private final ein<eab> t;

   public dhq(cos $$0, dht $$1, cpn $$2, hr<cqj> $$3, @Nullable dll $$4) {
      this($$0, $$1, null, new ein<>(), new ein<>(), $$2, $$3, $$4);
   }

   public dhq(cos $$0, dht $$1, @Nullable dhh[] $$2, ein<csl> $$3, ein<eab> $$4, cpn $$5, hr<cqj> $$6, @Nullable dll $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public eis<csl> o() {
      return this.s;
   }

   @Override
   public eis<eab> p() {
      return this.t;
   }

   @Override
   public dgv.a q() {
      return new dgv.a(this.s, this.t);
   }

   @Override
   public dez a_(gu $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return csm.nb.n();
      } else {
         dhh $$2 = this.b(this.e($$1));
         return $$2.c() ? csm.a.n() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eac b_(gu $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return ead.a.g();
      } else {
         dhh $$2 = this.b(this.e($$1));
         return $$2.c() ? ead.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dez a(gu $$0, dez $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.C_() && $$4 < this.aj()) {
         int $$6 = this.e($$4);
         dhh $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(csm.a)) {
            return $$1;
         } else {
            int $$9 = hx.b($$3);
            int $$10 = hx.b($$4);
            int $$11 = hx.b($$5);
            dez $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dha.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (dzt.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dki.a> $$14 = this.j().h();
            EnumSet<dki.a> $$15 = null;

            for (dki.a $$16 : $$14) {
               dki $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dki.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dki.a(this, $$15);
            }

            for (dki.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return csm.nb.n();
      }
   }

   @Override
   public void a(dcl $$0) {
      this.k.put($$0.p(), $$0);
   }

   @Nullable
   @Override
   public dcl c_(gu $$0) {
      return this.k.get($$0);
   }

   public Map<gu, dcl> D() {
      return this.k;
   }

   public void b(qr $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bii $$0) {
      if (!$$0.bN()) {
         qr $$1 = new qr();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(duy $$0, dvg $$1) {
      djw $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         duq $$3 = $$1.a();
         cpn $$4 = this.z();
         if ($$3.h() < $$4.C_() || $$3.k() >= $$4.aj()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<qr> E() {
      return this.p;
   }

   @Override
   public dha j() {
      return this.o;
   }

   public void a(dha $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public he<cqj> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dha.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short j(gu $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static gu a(short $$0, int $$1, cos $$2) {
      int $$3 = hx.a($$2.e, $$0 & 15);
      int $$4 = hx.a($$1, $$0 >>> 4 & 15);
      int $$5 = hx.a($$2.f, $$0 >>> 8 & 15);
      return new gu($$3, $$4, $$5);
   }

   @Override
   public void e(gu $$0) {
      if (!this.r($$0)) {
         dgv.a(this.b, this.e($$0.v())).add(j($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dgv.a(this.b, $$1).add($$0);
   }

   public Map<gu, qr> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public qr g(gu $$0) {
      dcl $$1 = this.c_($$0);
      return $$1 != null ? $$1.m() : this.j.get($$0);
   }

   @Override
   public void d(gu $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dgu a(dke.a $$0) {
      return this.q.get($$0);
   }

   public dgu b(dke.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dgu(this.D_(), this.C_()));
   }

   public void a(dke.a $$0, dgu $$1) {
      this.q.put($$0, $$1);
   }

   public void a(dzr $$0) {
      this.n = $$0;
   }

   public void a(@Nullable djw $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public djw x() {
      return this.r;
   }

   private static <T> eik<T> a(ein<T> $$0) {
      return new eik<>($$0.b());
   }

   public eik<csl> G() {
      return a(this.s);
   }

   public eik<eab> H() {
      return a(this.t);
   }

   @Override
   public cpn z() {
      return (cpn)(this.y() ? djw.b : this);
   }
}
