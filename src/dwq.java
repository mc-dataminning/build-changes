import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dwq extends dvw {
   @Nullable
   private volatile epq n;
   private volatile dwx o = dwx.c;
   private final List<uf> p = Lists.newArrayList();
   @Nullable
   private dvv q;
   @Nullable
   private dzk r;
   private final ezt<dgv> s;
   private final ezt<eqa> t;

   public dwq(dcy $$0, dwt $$1, ddu $$2, ka<det> $$3, @Nullable eaz $$4) {
      this($$0, $$1, null, new ezt<>(), new ezt<>(), $$2, $$3, $$4);
   }

   public dwq(dcy $$0, dwt $$1, @Nullable dwh[] $$2, ezt<dgv> $$3, ezt<eqa> $$4, ddu $$5, ka<det> $$6, @Nullable eaz $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public ezy<dgv> o() {
      return this.s;
   }

   @Override
   public ezy<eqa> p() {
      return this.t;
   }

   @Override
   public dvw.a a(long $$0) {
      return new dvw.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public dua a_(je $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dgx.nb.o();
      } else {
         dwh $$2 = this.b(this.e($$1));
         return $$2.c() ? dgx.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eqb b_(je $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return eqc.a.g();
      } else {
         dwh $$2 = this.b(this.e($$1));
         return $$2.c() ? eqc.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dua a(je $$0, dua $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.G_() && $$4 < this.an()) {
         int $$6 = this.e($$4);
         dwh $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dgx.a)) {
            return $$1;
         } else {
            int $$9 = kg.b($$3);
            int $$10 = kg.b($$4);
            int $$11 = kg.b($$5);
            dua $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(dwx.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eps.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dzw.a> $$14 = this.j().e();
            EnumSet<dzw.a> $$15 = null;

            for (dzw.a $$16 : $$14) {
               dzw $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dzw.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dzw.a(this, $$15);
            }

            for (dzw.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dgx.nb.o();
      }
   }

   @Override
   public void a(dre $$0) {
      this.k.put($$0.aD_(), $$0);
   }

   @Nullable
   @Override
   public dre c_(je $$0) {
      return this.k.get($$0);
   }

   public Map<je, dre> E() {
      return this.k;
   }

   public void b(uf $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(btj $$0) {
      if (!$$0.bW()) {
         uf $$1 = new uf();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eko $$0, ekw $$1) {
      dzk $$2 = this.w();
      if ($$2 != null && $$1.b()) {
         ekg $$3 = $$1.a();
         ddu $$4 = this.y();
         if ($$3.i() < $$4.G_() || $$3.l() >= $$4.an()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<uf> F() {
      return this.p;
   }

   @Override
   public dwx j() {
      return this.o;
   }

   public void a(dwx $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public jn<det> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.m().a(dwx.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(je $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static je a(short $$0, int $$1, dcy $$2) {
      int $$3 = kg.a($$2.e, $$0 & 15);
      int $$4 = kg.a($$1, $$0 >>> 4 & 15);
      int $$5 = kg.a($$2.f, $$0 >>> 8 & 15);
      return new je($$3, $$4, $$5);
   }

   @Override
   public void e(je $$0) {
      if (!this.s($$0)) {
         dvw.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      dvw.a(this.b, $$1).addAll($$0);
   }

   public Map<je, uf> G() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public uf a(je $$0, jp.a $$1) {
      dre $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(je $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dvv B() {
      return this.q;
   }

   public dvv C() {
      if (this.q == null) {
         this.q = new dvv(this.H_(), this.G_());
      }

      return this.q;
   }

   public void a(dvv $$0) {
      this.q = $$0;
   }

   public void a(epq $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dzk $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dzk w() {
      return this.r;
   }

   private static <T> ezq<T> a(ezt<T> $$0) {
      return new ezq<>($$0.b());
   }

   public ezq<dgv> H() {
      return a(this.s);
   }

   public ezq<eqa> I() {
      return a(this.t);
   }

   @Override
   public ddu y() {
      return (ddu)(this.x() ? dzk.b : this);
   }
}
