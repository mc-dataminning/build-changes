import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dhr extends dgw {
   @Nullable
   private volatile dzs n;
   private volatile dhb o = dhb.c;
   private final List<qr> p = Lists.newArrayList();
   private final Map<dkf.a, dgv> q = new Object2ObjectArrayMap();
   @Nullable
   private djx r;
   private final eio<csm> s;
   private final eio<eac> t;

   public dhr(cot $$0, dhu $$1, cpo $$2, hr<cqk> $$3, @Nullable dlm $$4) {
      this($$0, $$1, null, new eio<>(), new eio<>(), $$2, $$3, $$4);
   }

   public dhr(cot $$0, dhu $$1, @Nullable dhi[] $$2, eio<csm> $$3, eio<eac> $$4, cpo $$5, hr<cqk> $$6, @Nullable dlm $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public eit<csm> o() {
      return this.s;
   }

   @Override
   public eit<eac> p() {
      return this.t;
   }

   @Override
   public dgw.a q() {
      return new dgw.a(this.s, this.t);
   }

   @Override
   public dfa a_(gu $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return csn.nb.n();
      } else {
         dhi $$2 = this.b(this.e($$1));
         return $$2.c() ? csn.a.n() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public ead b_(gu $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return eae.a.g();
      } else {
         dhi $$2 = this.b(this.e($$1));
         return $$2.c() ? eae.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dfa a(gu $$0, dfa $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.C_() && $$4 < this.aj()) {
         int $$6 = this.e($$4);
         dhi $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(csn.a)) {
            return $$1;
         } else {
            int $$9 = hx.b($$3);
            int $$10 = hx.b($$4);
            int $$11 = hx.b($$5);
            dfa $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dhb.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (dzu.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dkj.a> $$14 = this.j().h();
            EnumSet<dkj.a> $$15 = null;

            for (dkj.a $$16 : $$14) {
               dkj $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dkj.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dkj.a(this, $$15);
            }

            for (dkj.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return csn.nb.n();
      }
   }

   @Override
   public void a(dcm $$0) {
      this.k.put($$0.p(), $$0);
   }

   @Nullable
   @Override
   public dcm c_(gu $$0) {
      return this.k.get($$0);
   }

   public Map<gu, dcm> D() {
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
   public void a(duz $$0, dvh $$1) {
      djx $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         dur $$3 = $$1.a();
         cpo $$4 = this.z();
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
   public dhb j() {
      return this.o;
   }

   public void a(dhb $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public he<cqk> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dhb.f)) {
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

   public static gu a(short $$0, int $$1, cot $$2) {
      int $$3 = hx.a($$2.e, $$0 & 15);
      int $$4 = hx.a($$1, $$0 >>> 4 & 15);
      int $$5 = hx.a($$2.f, $$0 >>> 8 & 15);
      return new gu($$3, $$4, $$5);
   }

   @Override
   public void e(gu $$0) {
      if (!this.r($$0)) {
         dgw.a(this.b, this.e($$0.v())).add(j($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dgw.a(this.b, $$1).add($$0);
   }

   public Map<gu, qr> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public qr g(gu $$0) {
      dcm $$1 = this.c_($$0);
      return $$1 != null ? $$1.m() : this.j.get($$0);
   }

   @Override
   public void d(gu $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dgv a(dkf.a $$0) {
      return this.q.get($$0);
   }

   public dgv b(dkf.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dgv(this.D_(), this.C_()));
   }

   public void a(dkf.a $$0, dgv $$1) {
      this.q.put($$0, $$1);
   }

   public void a(dzs $$0) {
      this.n = $$0;
   }

   public void a(@Nullable djx $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public djx x() {
      return this.r;
   }

   private static <T> eil<T> a(eio<T> $$0) {
      return new eil<>($$0.b());
   }

   public eil<csm> G() {
      return a(this.s);
   }

   public eil<eac> H() {
      return a(this.t);
   }

   @Override
   public cpo z() {
      return (cpo)(this.y() ? djx.b : this);
   }
}
