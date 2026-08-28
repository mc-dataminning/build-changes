import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class edx extends edd {
   @Nullable
   private volatile exf n;
   private volatile eee o = eee.c;
   private final List<ua> p = Lists.newArrayList();
   @Nullable
   private edc q;
   @Nullable
   private egt r;
   private final fhi<dne> s;
   private final fhi<exp> t;

   public edx(dje $$0, eea $$1, dkb $$2, jt<dlc> $$3, @Nullable eii $$4) {
      this($$0, $$1, null, new fhi<>(), new fhi<>(), $$2, $$3, $$4);
   }

   public edx(dje $$0, eea $$1, @Nullable edo[] $$2, fhi<dne> $$3, fhi<exp> $$4, dkb $$5, jt<dlc> $$6, @Nullable eii $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fhn<dne> q() {
      return this.s;
   }

   @Override
   public fhn<exp> r() {
      return this.t;
   }

   @Override
   public edd.a a(long $$0) {
      return new edd.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public ebg a_(iw $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dng.nH.m();
      } else {
         edo $$2 = this.b(this.f($$1));
         return $$2.c() ? dng.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public exq b_(iw $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return exr.a.g();
      } else {
         edo $$2 = this.b(this.f($$1));
         return $$2.c() ? exr.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public ebg a(iw $$0, ebg $$1, int $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dng.nH.m();
      } else {
         int $$6 = this.f($$4);
         edo $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dng.a)) {
            return $$1;
         } else {
            int $$9 = jz.b($$3);
            int $$10 = jz.b($$4);
            int $$11 = jz.b($$5);
            ebg $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(eee.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (exh.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<ehf.a> $$14 = this.n().e();
            EnumSet<ehf.a> $$15 = null;

            for (ehf.a $$16 : $$14) {
               ehf $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(ehf.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               ehf.a(this, $$15);
            }

            for (ehf.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dye $$0) {
      this.j.remove($$0.aB_());
      this.k.put($$0.aB_(), $$0);
   }

   @Nullable
   @Override
   public dye c_(iw $$0) {
      return this.k.get($$0);
   }

   public Map<iw, dye> H() {
      return this.k;
   }

   public void b(ua $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bwv $$0) {
      if (!$$0.bY()) {
         ua $$1 = new ua();
         $$0.g($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(esd $$0, esl $$1) {
      egt $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         erv $$3 = $$1.a();
         dkb $$4 = this.B();
         if ($$3.i() < $$4.K_() || $$3.l() > $$4.ao()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<ua> I() {
      return this.p;
   }

   @Override
   public eee n() {
      return this.o;
   }

   public void a(eee $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public jg<dlc> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(eee.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(iw $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static iw a(short $$0, int $$1, dje $$2) {
      int $$3 = jz.a($$2.h, $$0 & 15);
      int $$4 = jz.a($$1, $$0 >>> 4 & 15);
      int $$5 = jz.a($$2.i, $$0 >>> 8 & 15);
      return new iw($$3, $$4, $$5);
   }

   @Override
   public void e(iw $$0) {
      if (!this.t($$0)) {
         edd.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      edd.a(this.b, $$1).addAll($$0);
   }

   public Map<iw, ua> J() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ua a(iw $$0, ji.a $$1) {
      dye $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(iw $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public edc E() {
      return this.q;
   }

   public edc F() {
      if (this.q == null) {
         this.q = new edc(this.L_(), this.K_());
      }

      return this.q;
   }

   public void a(edc $$0) {
      this.q = $$0;
   }

   public void a(exf $$0) {
      this.n = $$0;
   }

   public void a(@Nullable egt $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public egt z() {
      return this.r;
   }

   private static <T> fhf<T> a(fhi<T> $$0) {
      return new fhf<>($$0.b());
   }

   public fhf<dne> K() {
      return a(this.s);
   }

   public fhf<exp> L() {
      return a(this.t);
   }

   @Override
   public dkb B() {
      return (dkb)(this.A() ? egt.b : this);
   }
}
