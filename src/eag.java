import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class eag extends dzm {
   @Nullable
   private volatile etl n;
   private volatile ean o = ean.c;
   private final List<tq> p = Lists.newArrayList();
   @Nullable
   private dzl q;
   @Nullable
   private edc r;
   private final fdn<dke> s;
   private final fdn<etv> t;

   public eag(dgg $$0, eaj $$1, dhb $$2, ke<dic> $$3, @Nullable eer $$4) {
      this($$0, $$1, null, new fdn<>(), new fdn<>(), $$2, $$3, $$4);
   }

   public eag(dgg $$0, eaj $$1, @Nullable dzx[] $$2, fdn<dke> $$3, fdn<etv> $$4, dhb $$5, ke<dic> $$6, @Nullable eer $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fds<dke> q() {
      return this.s;
   }

   @Override
   public fds<etv> r() {
      return this.t;
   }

   @Override
   public dzm.a a(long $$0) {
      return new dzm.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public dxq a_(ji $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dkg.nD.m();
      } else {
         dzx $$2 = this.b(this.f($$1));
         return $$2.c() ? dkg.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public etw b_(ji $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return etx.a.g();
      } else {
         dzx $$2 = this.b(this.f($$1));
         return $$2.c() ? etx.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dxq a(ji $$0, dxq $$1, int $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dkg.nD.m();
      } else {
         int $$6 = this.f($$4);
         dzx $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dkg.a)) {
            return $$1;
         } else {
            int $$9 = kk.b($$3);
            int $$10 = kk.b($$4);
            int $$11 = kk.b($$5);
            dxq $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(ean.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (etn.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<edo.a> $$14 = this.n().e();
            EnumSet<edo.a> $$15 = null;

            for (edo.a $$16 : $$14) {
               edo $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(edo.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               edo.a(this, $$15);
            }

            for (edo.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dus $$0) {
      this.j.remove($$0.aA_());
      this.k.put($$0.aA_(), $$0);
   }

   @Nullable
   @Override
   public dus c_(ji $$0) {
      return this.k.get($$0);
   }

   public Map<ji, dus> H() {
      return this.k;
   }

   public void b(tq $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bva $$0) {
      if (!$$0.bY()) {
         tq $$1 = new tq();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eoj $$0, eor $$1) {
      edc $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         eob $$3 = $$1.a();
         dhb $$4 = this.B();
         if ($$3.i() < $$4.G_() || $$3.l() > $$4.ao()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<tq> I() {
      return this.p;
   }

   @Override
   public ean n() {
      return this.o;
   }

   public void a(ean $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public jr<dic> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(ean.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(ji $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static ji a(short $$0, int $$1, dgg $$2) {
      int $$3 = kk.a($$2.h, $$0 & 15);
      int $$4 = kk.a($$1, $$0 >>> 4 & 15);
      int $$5 = kk.a($$2.i, $$0 >>> 8 & 15);
      return new ji($$3, $$4, $$5);
   }

   @Override
   public void e(ji $$0) {
      if (!this.s($$0)) {
         dzm.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      dzm.a(this.b, $$1).addAll($$0);
   }

   public Map<ji, tq> J() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public tq a(ji $$0, jt.a $$1) {
      dus $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(ji $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dzl E() {
      return this.q;
   }

   public dzl F() {
      if (this.q == null) {
         this.q = new dzl(this.H_(), this.G_());
      }

      return this.q;
   }

   public void a(dzl $$0) {
      this.q = $$0;
   }

   public void a(etl $$0) {
      this.n = $$0;
   }

   public void a(@Nullable edc $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public edc z() {
      return this.r;
   }

   private static <T> fdk<T> a(fdn<T> $$0) {
      return new fdk<>($$0.b());
   }

   public fdk<dke> K() {
      return a(this.s);
   }

   public fdk<etv> L() {
      return a(this.t);
   }

   @Override
   public dhb B() {
      return (dhb)(this.A() ? edc.b : this);
   }
}
