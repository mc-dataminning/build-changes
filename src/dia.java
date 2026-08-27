import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dia extends dhf {
   @Nullable
   private volatile eab n;
   private volatile dhk o = dhk.c;
   private final List<qw> p = Lists.newArrayList();
   private final Map<dko.a, dhe> q = new Object2ObjectArrayMap();
   @Nullable
   private dkg r;
   private final eix<csv> s;
   private final eix<eal> t;

   public dia(cpc $$0, did $$1, cpx $$2, hq<cqt> $$3, @Nullable dlv $$4) {
      this($$0, $$1, null, new eix<>(), new eix<>(), $$2, $$3, $$4);
   }

   public dia(cpc $$0, did $$1, @Nullable dhr[] $$2, eix<csv> $$3, eix<eal> $$4, cpx $$5, hq<cqt> $$6, @Nullable dlv $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public ejc<csv> o() {
      return this.s;
   }

   @Override
   public ejc<eal> p() {
      return this.t;
   }

   @Override
   public dhf.a q() {
      return new dhf.a(this.s, this.t);
   }

   @Override
   public dfj a_(gw $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return csw.nb.n();
      } else {
         dhr $$2 = this.b(this.e($$1));
         return $$2.c() ? csw.a.n() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eam b_(gw $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return ean.a.g();
      } else {
         dhr $$2 = this.b(this.e($$1));
         return $$2.c() ? ean.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dfj a(gw $$0, dfj $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.H_() && $$4 < this.aj()) {
         int $$6 = this.e($$4);
         dhr $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(csw.a)) {
            return $$1;
         } else {
            int $$9 = hw.b($$3);
            int $$10 = hw.b($$4);
            int $$11 = hw.b($$5);
            dfj $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dhk.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (ead.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dks.a> $$14 = this.j().h();
            EnumSet<dks.a> $$15 = null;

            for (dks.a $$16 : $$14) {
               dks $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dks.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dks.a(this, $$15);
            }

            for (dks.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return csw.nb.n();
      }
   }

   @Override
   public void a(dcv $$0) {
      this.k.put($$0.p(), $$0);
   }

   @Nullable
   @Override
   public dcv c_(gw $$0) {
      return this.k.get($$0);
   }

   public Map<gw, dcv> D() {
      return this.k;
   }

   public void b(qw $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(biq $$0) {
      if (!$$0.bN()) {
         qw $$1 = new qw();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(dvi $$0, dvq $$1) {
      dkg $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         dva $$3 = $$1.a();
         cpx $$4 = this.z();
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
   public dhk j() {
      return this.o;
   }

   public void a(dhk $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public he<cqt> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dhk.f)) {
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

   public static gw a(short $$0, int $$1, cpc $$2) {
      int $$3 = hw.a($$2.e, $$0 & 15);
      int $$4 = hw.a($$1, $$0 >>> 4 & 15);
      int $$5 = hw.a($$2.f, $$0 >>> 8 & 15);
      return new gw($$3, $$4, $$5);
   }

   @Override
   public void e(gw $$0) {
      if (!this.r($$0)) {
         dhf.a(this.b, this.e($$0.v())).add(j($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dhf.a(this.b, $$1).add($$0);
   }

   public Map<gw, qw> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public qw g(gw $$0) {
      dcv $$1 = this.c_($$0);
      return $$1 != null ? $$1.m() : this.j.get($$0);
   }

   @Override
   public void d(gw $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dhe a(dko.a $$0) {
      return this.q.get($$0);
   }

   public dhe b(dko.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dhe(this.I_(), this.H_()));
   }

   public void a(dko.a $$0, dhe $$1) {
      this.q.put($$0, $$1);
   }

   public void a(eab $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dkg $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dkg x() {
      return this.r;
   }

   private static <T> eiu<T> a(eix<T> $$0) {
      return new eiu<>($$0.b());
   }

   public eiu<csv> G() {
      return a(this.s);
   }

   public eiu<eal> H() {
      return a(this.t);
   }

   @Override
   public cpx z() {
      return (cpx)(this.y() ? dkg.b : this);
   }
}
