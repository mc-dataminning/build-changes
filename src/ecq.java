import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ecq extends ebw {
   @Nullable
   private volatile evv n;
   private volatile ecx o = ecx.c;
   private final List<tz> p = Lists.newArrayList();
   @Nullable
   private ebv q;
   @Nullable
   private efm r;
   private final ffy<dma> s;
   private final ffy<ewf> t;

   public ecq(dic $$0, ect $$1, dix $$2, jr<djy> $$3, @Nullable ehb $$4) {
      this($$0, $$1, null, new ffy<>(), new ffy<>(), $$2, $$3, $$4);
   }

   public ecq(dic $$0, ect $$1, @Nullable ech[] $$2, ffy<dma> $$3, ffy<ewf> $$4, dix $$5, jr<djy> $$6, @Nullable ehb $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fgd<dma> q() {
      return this.s;
   }

   @Override
   public fgd<ewf> r() {
      return this.t;
   }

   @Override
   public ebw.a a(long $$0) {
      return new ebw.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public dzz a_(iu $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dmc.nE.m();
      } else {
         ech $$2 = this.b(this.f($$1));
         return $$2.c() ? dmc.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public ewg b_(iu $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return ewh.a.g();
      } else {
         ech $$2 = this.b(this.f($$1));
         return $$2.c() ? ewh.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dzz a(iu $$0, dzz $$1, int $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dmc.nE.m();
      } else {
         int $$6 = this.f($$4);
         ech $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dmc.a)) {
            return $$1;
         } else {
            int $$9 = jx.b($$3);
            int $$10 = jx.b($$4);
            int $$11 = jx.b($$5);
            dzz $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(ecx.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (evx.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<efy.a> $$14 = this.n().e();
            EnumSet<efy.a> $$15 = null;

            for (efy.a $$16 : $$14) {
               efy $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(efy.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               efy.a(this, $$15);
            }

            for (efy.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dwx $$0) {
      this.j.remove($$0.aw_());
      this.k.put($$0.aw_(), $$0);
   }

   @Nullable
   @Override
   public dwx c_(iu $$0) {
      return this.k.get($$0);
   }

   public Map<iu, dwx> H() {
      return this.k;
   }

   public void b(tz $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bwd $$0) {
      if (!$$0.bZ()) {
         tz $$1 = new tz();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eqt $$0, erb $$1) {
      efm $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         eql $$3 = $$1.a();
         dix $$4 = this.B();
         if ($$3.i() < $$4.G_() || $$3.l() > $$4.ao()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<tz> I() {
      return this.p;
   }

   @Override
   public ecx n() {
      return this.o;
   }

   public void a(ecx $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public je<djy> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(ecx.f)) {
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

   public static iu a(short $$0, int $$1, dic $$2) {
      int $$3 = jx.a($$2.h, $$0 & 15);
      int $$4 = jx.a($$1, $$0 >>> 4 & 15);
      int $$5 = jx.a($$2.i, $$0 >>> 8 & 15);
      return new iu($$3, $$4, $$5);
   }

   @Override
   public void e(iu $$0) {
      if (!this.t($$0)) {
         ebw.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      ebw.a(this.b, $$1).addAll($$0);
   }

   public Map<iu, tz> J() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public tz a(iu $$0, jg.a $$1) {
      dwx $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(iu $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public ebv E() {
      return this.q;
   }

   public ebv F() {
      if (this.q == null) {
         this.q = new ebv(this.H_(), this.G_());
      }

      return this.q;
   }

   public void a(ebv $$0) {
      this.q = $$0;
   }

   public void a(evv $$0) {
      this.n = $$0;
   }

   public void a(@Nullable efm $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public efm z() {
      return this.r;
   }

   private static <T> ffv<T> a(ffy<T> $$0) {
      return new ffv<>($$0.b());
   }

   public ffv<dma> K() {
      return a(this.s);
   }

   public ffv<ewf> L() {
      return a(this.t);
   }

   @Override
   public dix B() {
      return (dix)(this.A() ? efm.b : this);
   }
}
