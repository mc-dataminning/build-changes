import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dzn extends dyt {
   @Nullable
   private volatile esp n;
   private volatile dzu o = dzu.c;
   private final List<tq> p = Lists.newArrayList();
   @Nullable
   private dys q;
   @Nullable
   private ech r;
   private final fcr<djn> s;
   private final fcr<esz> t;

   public dzn(dfp $$0, dzq $$1, dgl $$2, ke<dhl> $$3, @Nullable edw $$4) {
      this($$0, $$1, null, new fcr<>(), new fcr<>(), $$2, $$3, $$4);
   }

   public dzn(dfp $$0, dzq $$1, @Nullable dze[] $$2, fcr<djn> $$3, fcr<esz> $$4, dgl $$5, ke<dhl> $$6, @Nullable edw $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fcw<djn> q() {
      return this.s;
   }

   @Override
   public fcw<esz> r() {
      return this.t;
   }

   @Override
   public dyt.a a(long $$0) {
      return new dyt.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public dwy a_(ji $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return djp.nD.m();
      } else {
         dze $$2 = this.b(this.f($$1));
         return $$2.c() ? djp.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eta b_(ji $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return etb.a.g();
      } else {
         dze $$2 = this.b(this.f($$1));
         return $$2.c() ? etb.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dwy a(ji $$0, dwy $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return djp.nD.m();
      } else {
         int $$6 = this.f($$4);
         dze $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(djp.a)) {
            return $$1;
         } else {
            int $$9 = kk.b($$3);
            int $$10 = kk.b($$4);
            int $$11 = kk.b($$5);
            dwy $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(dzu.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (esr.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<ect.a> $$14 = this.n().e();
            EnumSet<ect.a> $$15 = null;

            for (ect.a $$16 : $$14) {
               ect $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(ect.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               ect.a(this, $$15);
            }

            for (ect.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dua $$0) {
      this.j.remove($$0.aA_());
      this.k.put($$0.aA_(), $$0);
   }

   @Nullable
   @Override
   public dua c_(ji $$0) {
      return this.k.get($$0);
   }

   public Map<ji, dua> H() {
      return this.k;
   }

   public void b(tq $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bum $$0) {
      if (!$$0.bZ()) {
         tq $$1 = new tq();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(enn $$0, env $$1) {
      ech $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         enf $$3 = $$1.a();
         dgl $$4 = this.B();
         if ($$3.i() < $$4.L_() || $$3.l() > $$4.an()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<tq> I() {
      return this.p;
   }

   @Override
   public dzu n() {
      return this.o;
   }

   public void a(dzu $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public jr<dhl> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(dzu.f)) {
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

   public static ji a(short $$0, int $$1, dfp $$2) {
      int $$3 = kk.a($$2.h, $$0 & 15);
      int $$4 = kk.a($$1, $$0 >>> 4 & 15);
      int $$5 = kk.a($$2.i, $$0 >>> 8 & 15);
      return new ji($$3, $$4, $$5);
   }

   @Override
   public void e(ji $$0) {
      if (!this.s($$0)) {
         dyt.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      dyt.a(this.b, $$1).addAll($$0);
   }

   public Map<ji, tq> J() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public tq a(ji $$0, jt.a $$1) {
      dua $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(ji $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dys E() {
      return this.q;
   }

   public dys F() {
      if (this.q == null) {
         this.q = new dys(this.M_(), this.L_());
      }

      return this.q;
   }

   public void a(dys $$0) {
      this.q = $$0;
   }

   public void a(esp $$0) {
      this.n = $$0;
   }

   public void a(@Nullable ech $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public ech z() {
      return this.r;
   }

   private static <T> fco<T> a(fcr<T> $$0) {
      return new fco<>($$0.b());
   }

   public fco<djn> K() {
      return a(this.s);
   }

   public fco<esz> L() {
      return a(this.t);
   }

   @Override
   public dgl B() {
      return (dgl)(this.A() ? ech.b : this);
   }
}
