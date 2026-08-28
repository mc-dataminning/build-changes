import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ecf extends ebl {
   @Nullable
   private volatile evk n;
   private volatile ecm o = ecm.c;
   private final List<tx> p = Lists.newArrayList();
   @Nullable
   private ebk q;
   @Nullable
   private efb r;
   private final ffm<dlu> s;
   private final ffm<evu> t;

   public ecf(dhw $$0, eci $$1, dir $$2, jr<djs> $$3, @Nullable egq $$4) {
      this($$0, $$1, null, new ffm<>(), new ffm<>(), $$2, $$3, $$4);
   }

   public ecf(dhw $$0, eci $$1, @Nullable ebw[] $$2, ffm<dlu> $$3, ffm<evu> $$4, dir $$5, jr<djs> $$6, @Nullable egq $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public ffr<dlu> q() {
      return this.s;
   }

   @Override
   public ffr<evu> r() {
      return this.t;
   }

   @Override
   public ebl.a a(long $$0) {
      return new ebl.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public dzo a_(iu $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dlw.nD.m();
      } else {
         ebw $$2 = this.b(this.f($$1));
         return $$2.c() ? dlw.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public evv b_(iu $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return evw.a.g();
      } else {
         ebw $$2 = this.b(this.f($$1));
         return $$2.c() ? evw.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dzo a(iu $$0, dzo $$1, int $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dlw.nD.m();
      } else {
         int $$6 = this.f($$4);
         ebw $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dlw.a)) {
            return $$1;
         } else {
            int $$9 = jx.b($$3);
            int $$10 = jx.b($$4);
            int $$11 = jx.b($$5);
            dzo $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(ecm.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (evm.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<efn.a> $$14 = this.n().e();
            EnumSet<efn.a> $$15 = null;

            for (efn.a $$16 : $$14) {
               efn $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(efn.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               efn.a(this, $$15);
            }

            for (efn.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dwn $$0) {
      this.j.remove($$0.aw_());
      this.k.put($$0.aw_(), $$0);
   }

   @Nullable
   @Override
   public dwn c_(iu $$0) {
      return this.k.get($$0);
   }

   public Map<iu, dwn> H() {
      return this.k;
   }

   public void b(tx $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bwa $$0) {
      if (!$$0.bZ()) {
         tx $$1 = new tx();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eqi $$0, eqq $$1) {
      efb $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         eqa $$3 = $$1.a();
         dir $$4 = this.B();
         if ($$3.i() < $$4.G_() || $$3.l() > $$4.ao()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<tx> I() {
      return this.p;
   }

   @Override
   public ecm n() {
      return this.o;
   }

   public void a(ecm $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public je<djs> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(ecm.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(iu $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static iu a(short $$0, int $$1, dhw $$2) {
      int $$3 = jx.a($$2.h, $$0 & 15);
      int $$4 = jx.a($$1, $$0 >>> 4 & 15);
      int $$5 = jx.a($$2.i, $$0 >>> 8 & 15);
      return new iu($$3, $$4, $$5);
   }

   @Override
   public void e(iu $$0) {
      if (!this.t($$0)) {
         ebl.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      ebl.a(this.b, $$1).addAll($$0);
   }

   public Map<iu, tx> J() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public tx a(iu $$0, jg.a $$1) {
      dwn $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(iu $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public ebk E() {
      return this.q;
   }

   public ebk F() {
      if (this.q == null) {
         this.q = new ebk(this.H_(), this.G_());
      }

      return this.q;
   }

   public void a(ebk $$0) {
      this.q = $$0;
   }

   public void a(evk $$0) {
      this.n = $$0;
   }

   public void a(@Nullable efb $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public efb z() {
      return this.r;
   }

   private static <T> ffj<T> a(ffm<T> $$0) {
      return new ffj<>($$0.b());
   }

   public ffj<dlu> K() {
      return a(this.s);
   }

   public ffj<evu> L() {
      return a(this.t);
   }

   @Override
   public dir B() {
      return (dir)(this.A() ? efb.b : this);
   }
}
