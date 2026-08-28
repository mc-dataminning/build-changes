import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ead extends dzj {
   @Nullable
   private volatile etf n;
   private volatile eak o = eak.c;
   private final List<um> p = Lists.newArrayList();
   @Nullable
   private dzi q;
   @Nullable
   private ecx r;
   private final fdh<dkd> s;
   private final fdh<etp> t;

   public ead(dgf $$0, eag $$1, dhb $$2, kd<dib> $$3, @Nullable eem $$4) {
      this($$0, $$1, null, new fdh<>(), new fdh<>(), $$2, $$3, $$4);
   }

   public ead(dgf $$0, eag $$1, @Nullable dzu[] $$2, fdh<dkd> $$3, fdh<etp> $$4, dhb $$5, kd<dib> $$6, @Nullable eem $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fdm<dkd> q() {
      return this.s;
   }

   @Override
   public fdm<etp> r() {
      return this.t;
   }

   @Override
   public dzj.a a(long $$0) {
      return new dzj.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public dxo a_(jh $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dkf.nD.m();
      } else {
         dzu $$2 = this.b(this.f($$1));
         return $$2.c() ? dkf.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public etq b_(jh $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return etr.a.g();
      } else {
         dzu $$2 = this.b(this.f($$1));
         return $$2.c() ? etr.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dxo a(jh $$0, dxo $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dkf.nD.m();
      } else {
         int $$6 = this.f($$4);
         dzu $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dkf.a)) {
            return $$1;
         } else {
            int $$9 = kj.b($$3);
            int $$10 = kj.b($$4);
            int $$11 = kj.b($$5);
            dxo $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(eak.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eth.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<edj.a> $$14 = this.n().e();
            EnumSet<edj.a> $$15 = null;

            for (edj.a $$16 : $$14) {
               edj $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(edj.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               edj.a(this, $$15);
            }

            for (edj.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(duq $$0) {
      this.k.put($$0.aB_(), $$0);
   }

   @Nullable
   @Override
   public duq c_(jh $$0) {
      return this.k.get($$0);
   }

   public Map<jh, duq> H() {
      return this.k;
   }

   public void b(um $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bvb $$0) {
      if (!$$0.bZ()) {
         um $$1 = new um();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eod $$0, eol $$1) {
      ecx $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         env $$3 = $$1.a();
         dhb $$4 = this.B();
         if ($$3.i() < $$4.L_() || $$3.l() > $$4.an()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<um> I() {
      return this.p;
   }

   @Override
   public eak n() {
      return this.o;
   }

   public void a(eak $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public jq<dib> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(eak.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(jh $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static jh a(short $$0, int $$1, dgf $$2) {
      int $$3 = kj.a($$2.h, $$0 & 15);
      int $$4 = kj.a($$1, $$0 >>> 4 & 15);
      int $$5 = kj.a($$2.i, $$0 >>> 8 & 15);
      return new jh($$3, $$4, $$5);
   }

   @Override
   public void e(jh $$0) {
      if (!this.s($$0)) {
         dzj.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      dzj.a(this.b, $$1).addAll($$0);
   }

   public Map<jh, um> J() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public um a(jh $$0, js.a $$1) {
      duq $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(jh $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dzi E() {
      return this.q;
   }

   public dzi F() {
      if (this.q == null) {
         this.q = new dzi(this.M_(), this.L_());
      }

      return this.q;
   }

   public void a(dzi $$0) {
      this.q = $$0;
   }

   public void a(etf $$0) {
      this.n = $$0;
   }

   public void a(@Nullable ecx $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public ecx z() {
      return this.r;
   }

   private static <T> fde<T> a(fdh<T> $$0) {
      return new fde<>($$0.b());
   }

   public fde<dkd> K() {
      return a(this.s);
   }

   public fde<etp> L() {
      return a(this.t);
   }

   @Override
   public dhb B() {
      return (dhb)(this.A() ? ecx.b : this);
   }
}
