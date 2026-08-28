import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ecy extends ece {
   @Nullable
   private volatile ewd n;
   private volatile edf o = edf.c;
   private final List<tz> p = Lists.newArrayList();
   @Nullable
   private ecd q;
   @Nullable
   private efu r;
   private final fgg<dmf> s;
   private final fgg<ewn> t;

   public ecy(dih $$0, edb $$1, djc $$2, jr<dkd> $$3, @Nullable ehj $$4) {
      this($$0, $$1, null, new fgg<>(), new fgg<>(), $$2, $$3, $$4);
   }

   public ecy(dih $$0, edb $$1, @Nullable ecp[] $$2, fgg<dmf> $$3, fgg<ewn> $$4, djc $$5, jr<dkd> $$6, @Nullable ehj $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fgl<dmf> q() {
      return this.s;
   }

   @Override
   public fgl<ewn> r() {
      return this.t;
   }

   @Override
   public ece.a a(long $$0) {
      return new ece.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public eah a_(iu $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dmh.nH.m();
      } else {
         ecp $$2 = this.b(this.f($$1));
         return $$2.c() ? dmh.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public ewo b_(iu $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return ewp.a.g();
      } else {
         ecp $$2 = this.b(this.f($$1));
         return $$2.c() ? ewp.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public eah a(iu $$0, eah $$1, int $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dmh.nH.m();
      } else {
         int $$6 = this.f($$4);
         ecp $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dmh.a)) {
            return $$1;
         } else {
            int $$9 = jx.b($$3);
            int $$10 = jx.b($$4);
            int $$11 = jx.b($$5);
            eah $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(edf.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (ewf.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<egg.a> $$14 = this.n().e();
            EnumSet<egg.a> $$15 = null;

            for (egg.a $$16 : $$14) {
               egg $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(egg.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               egg.a(this, $$15);
            }

            for (egg.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dxf $$0) {
      this.j.remove($$0.ax_());
      this.k.put($$0.ax_(), $$0);
   }

   @Nullable
   @Override
   public dxf c_(iu $$0) {
      return this.k.get($$0);
   }

   public Map<iu, dxf> H() {
      return this.k;
   }

   public void b(tz $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bwf $$0) {
      if (!$$0.bZ()) {
         tz $$1 = new tz();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(erb $$0, erj $$1) {
      efu $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         eqt $$3 = $$1.a();
         djc $$4 = this.B();
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
   public edf n() {
      return this.o;
   }

   public void a(edf $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public je<dkd> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(edf.f)) {
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

   public static iu a(short $$0, int $$1, dih $$2) {
      int $$3 = jx.a($$2.h, $$0 & 15);
      int $$4 = jx.a($$1, $$0 >>> 4 & 15);
      int $$5 = jx.a($$2.i, $$0 >>> 8 & 15);
      return new iu($$3, $$4, $$5);
   }

   @Override
   public void e(iu $$0) {
      if (!this.t($$0)) {
         ece.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      ece.a(this.b, $$1).addAll($$0);
   }

   public Map<iu, tz> J() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public tz a(iu $$0, jg.a $$1) {
      dxf $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(iu $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public ecd E() {
      return this.q;
   }

   public ecd F() {
      if (this.q == null) {
         this.q = new ecd(this.H_(), this.G_());
      }

      return this.q;
   }

   public void a(ecd $$0) {
      this.q = $$0;
   }

   public void a(ewd $$0) {
      this.n = $$0;
   }

   public void a(@Nullable efu $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public efu z() {
      return this.r;
   }

   private static <T> fgd<T> a(fgg<T> $$0) {
      return new fgd<>($$0.b());
   }

   public fgd<dmf> K() {
      return a(this.s);
   }

   public fgd<ewn> L() {
      return a(this.t);
   }

   @Override
   public djc B() {
      return (djc)(this.A() ? efu.b : this);
   }
}
