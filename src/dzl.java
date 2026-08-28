import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dzl extends dyr {
   @Nullable
   private volatile esn n;
   private volatile dzs o = dzs.c;
   private final List<tq> p = Lists.newArrayList();
   @Nullable
   private dyq q;
   @Nullable
   private ecf r;
   private final fcp<djl> s;
   private final fcp<esx> t;

   public dzl(dfn $$0, dzo $$1, dgj $$2, ke<dhj> $$3, @Nullable edu $$4) {
      this($$0, $$1, null, new fcp<>(), new fcp<>(), $$2, $$3, $$4);
   }

   public dzl(dfn $$0, dzo $$1, @Nullable dzc[] $$2, fcp<djl> $$3, fcp<esx> $$4, dgj $$5, ke<dhj> $$6, @Nullable edu $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fcu<djl> q() {
      return this.s;
   }

   @Override
   public fcu<esx> r() {
      return this.t;
   }

   @Override
   public dyr.a a(long $$0) {
      return new dyr.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public dww a_(ji $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return djn.nD.m();
      } else {
         dzc $$2 = this.b(this.f($$1));
         return $$2.c() ? djn.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public esy b_(ji $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return esz.a.g();
      } else {
         dzc $$2 = this.b(this.f($$1));
         return $$2.c() ? esz.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dww a(ji $$0, dww $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return djn.nD.m();
      } else {
         int $$6 = this.f($$4);
         dzc $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(djn.a)) {
            return $$1;
         } else {
            int $$9 = kk.b($$3);
            int $$10 = kk.b($$4);
            int $$11 = kk.b($$5);
            dww $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(dzs.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (esp.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<ecr.a> $$14 = this.n().e();
            EnumSet<ecr.a> $$15 = null;

            for (ecr.a $$16 : $$14) {
               ecr $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(ecr.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               ecr.a(this, $$15);
            }

            for (ecr.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dty $$0) {
      this.k.put($$0.aA_(), $$0);
   }

   @Nullable
   @Override
   public dty c_(ji $$0) {
      return this.k.get($$0);
   }

   public Map<ji, dty> H() {
      return this.k;
   }

   public void b(tq $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(buk $$0) {
      if (!$$0.bZ()) {
         tq $$1 = new tq();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(enl $$0, ent $$1) {
      ecf $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         end $$3 = $$1.a();
         dgj $$4 = this.B();
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
   public dzs n() {
      return this.o;
   }

   public void a(dzs $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public jr<dhj> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(dzs.f)) {
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

   public static ji a(short $$0, int $$1, dfn $$2) {
      int $$3 = kk.a($$2.h, $$0 & 15);
      int $$4 = kk.a($$1, $$0 >>> 4 & 15);
      int $$5 = kk.a($$2.i, $$0 >>> 8 & 15);
      return new ji($$3, $$4, $$5);
   }

   @Override
   public void e(ji $$0) {
      if (!this.s($$0)) {
         dyr.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      dyr.a(this.b, $$1).addAll($$0);
   }

   public Map<ji, tq> J() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public tq a(ji $$0, jt.a $$1) {
      dty $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(ji $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dyq E() {
      return this.q;
   }

   public dyq F() {
      if (this.q == null) {
         this.q = new dyq(this.M_(), this.L_());
      }

      return this.q;
   }

   public void a(dyq $$0) {
      this.q = $$0;
   }

   public void a(esn $$0) {
      this.n = $$0;
   }

   public void a(@Nullable ecf $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public ecf z() {
      return this.r;
   }

   private static <T> fcm<T> a(fcp<T> $$0) {
      return new fcm<>($$0.b());
   }

   public fcm<djl> K() {
      return a(this.s);
   }

   public fcm<esx> L() {
      return a(this.t);
   }

   @Override
   public dgj B() {
      return (dgj)(this.A() ? ecf.b : this);
   }
}
