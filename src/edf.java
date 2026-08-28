import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class edf extends ecl {
   @Nullable
   private volatile ewk n;
   private volatile edm o = edm.c;
   private final List<tz> p = Lists.newArrayList();
   @Nullable
   private eck q;
   @Nullable
   private egb r;
   private final fgn<dmm> s;
   private final fgn<ewu> t;

   public edf(dio $$0, edi $$1, djj $$2, js<dkk> $$3, @Nullable ehq $$4) {
      this($$0, $$1, null, new fgn<>(), new fgn<>(), $$2, $$3, $$4);
   }

   public edf(dio $$0, edi $$1, @Nullable ecw[] $$2, fgn<dmm> $$3, fgn<ewu> $$4, djj $$5, js<dkk> $$6, @Nullable ehq $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fgs<dmm> q() {
      return this.s;
   }

   @Override
   public fgs<ewu> r() {
      return this.t;
   }

   @Override
   public ecl.a a(long $$0) {
      return new ecl.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public eao a_(iv $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dmo.nH.m();
      } else {
         ecw $$2 = this.b(this.f($$1));
         return $$2.c() ? dmo.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public ewv b_(iv $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return eww.a.g();
      } else {
         ecw $$2 = this.b(this.f($$1));
         return $$2.c() ? eww.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public eao a(iv $$0, eao $$1, int $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dmo.nH.m();
      } else {
         int $$6 = this.f($$4);
         ecw $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dmo.a)) {
            return $$1;
         } else {
            int $$9 = jy.b($$3);
            int $$10 = jy.b($$4);
            int $$11 = jy.b($$5);
            eao $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(edm.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (ewm.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<egn.a> $$14 = this.n().e();
            EnumSet<egn.a> $$15 = null;

            for (egn.a $$16 : $$14) {
               egn $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(egn.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               egn.a(this, $$15);
            }

            for (egn.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dxm $$0) {
      this.j.remove($$0.ax_());
      this.k.put($$0.ax_(), $$0);
   }

   @Nullable
   @Override
   public dxm c_(iv $$0) {
      return this.k.get($$0);
   }

   public Map<iv, dxm> H() {
      return this.k;
   }

   public void b(tz $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bwi $$0) {
      if (!$$0.bX()) {
         tz $$1 = new tz();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eri $$0, erq $$1) {
      egb $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         era $$3 = $$1.a();
         djj $$4 = this.B();
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
   public edm n() {
      return this.o;
   }

   public void a(edm $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public jf<dkk> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(edm.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(iv $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static iv a(short $$0, int $$1, dio $$2) {
      int $$3 = jy.a($$2.h, $$0 & 15);
      int $$4 = jy.a($$1, $$0 >>> 4 & 15);
      int $$5 = jy.a($$2.i, $$0 >>> 8 & 15);
      return new iv($$3, $$4, $$5);
   }

   @Override
   public void e(iv $$0) {
      if (!this.t($$0)) {
         ecl.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      ecl.a(this.b, $$1).addAll($$0);
   }

   public Map<iv, tz> J() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public tz a(iv $$0, jh.a $$1) {
      dxm $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(iv $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public eck E() {
      return this.q;
   }

   public eck F() {
      if (this.q == null) {
         this.q = new eck(this.H_(), this.G_());
      }

      return this.q;
   }

   public void a(eck $$0) {
      this.q = $$0;
   }

   public void a(ewk $$0) {
      this.n = $$0;
   }

   public void a(@Nullable egb $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public egb z() {
      return this.r;
   }

   private static <T> fgk<T> a(fgn<T> $$0) {
      return new fgk<>($$0.b());
   }

   public fgk<dmm> K() {
      return a(this.s);
   }

   public fgk<ewu> L() {
      return a(this.t);
   }

   @Override
   public djj B() {
      return (djj)(this.A() ? egb.b : this);
   }
}
