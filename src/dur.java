import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class dur implements cqn {
   protected static final jk[] aG = new jk[]{jk.e, jk.f, jk.c, jk.d, jk.a, jk.b};
   protected final boolean aH;
   protected final float aI;
   protected final boolean aJ;
   protected final dpa aK;
   protected final float aL;
   protected final float aM;
   protected final float aN;
   protected final boolean aO;
   protected final cqq aP;
   protected final dur.d aQ;
   protected final Optional<ald<etq>> aR;
   protected final String aS;

   public dur(dur.d $$0) {
      this.aH = $$0.c;
      this.aR = $$0.h();
      this.aS = $$0.q();
      this.aI = $$0.f;
      this.aJ = $$0.i;
      this.aK = $$0.d;
      this.aL = $$0.j;
      this.aM = $$0.k;
      this.aN = $$0.l;
      this.aO = $$0.F;
      this.aP = $$0.G;
      this.aQ = $$0;
   }

   public dur.d s() {
      return this.aQ;
   }

   protected abstract MapCodec<? extends dhm> a();

   protected static <B extends dhm> RecordCodecBuilder<B, dur.d> t() {
      return dur.d.a.fieldOf("properties").forGetter(dur::s);
   }

   public static <B extends dhm> MapCodec<B> b(Function<dur.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dus $$0, dek $$1, jf $$2, int $$3, int $$4) {
   }

   protected boolean a(dus $$0, eri $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(ddy.a, jf.c);
         case b:
            return $$0.y().a(axb.a);
         case c:
            return !$$0.m(ddy.a, jf.c);
         default:
            return false;
      }
   }

   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$0;
   }

   protected boolean b(dus $$0, dus $$1, jk $$2) {
      return false;
   }

   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
   }

   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
   }

   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if ($$0.x() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dus $$0, arj $$1, jf $$2, deb $$3, BiConsumer<cvs, jf> $$4) {
      if (!$$0.l() && $$3.a() != deb.a.d) {
         dhm $$5 = $$0.b();
         boolean $$6 = $$3.b() instanceof cnx;
         if ($$5.a($$3)) {
            drv $$7 = $$0.x() ? $$1.c_($$2) : null;
            eto.a $$8 = new eto.a($$1).a(ewh.f, eyw.b($$2)).a(ewh.i, cvs.k).b(ewh.h, $$7).b(ewh.a, $$3.c());
            if ($$3.a() == deb.a.c) {
               $$8.a(ewh.j, $$3.d());
            }

            $$0.a($$1, $$2, cvs.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dho.a.n(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      return brs.e;
   }

   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      return brs.f;
   }

   protected boolean a(dus $$0, dej $$1, jf $$2, int $$3, int $$4) {
      return false;
   }

   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   protected boolean g_(dus $$0) {
      return false;
   }

   protected boolean f_(dus $$0) {
      return false;
   }

   protected eqt b_(dus $$0) {
      return equ.a.g();
   }

   protected boolean c_(dus $$0) {
      return false;
   }

   protected float at_() {
      return 0.25F;
   }

   protected float av_() {
      return 0.2F;
   }

   @Override
   public cqq i() {
      return this.aP;
   }

   protected dus a(dus $$0, doa $$1) {
      return $$0;
   }

   protected dus a(dus $$0, dmj $$1) {
      return $$0;
   }

   protected boolean a(dus $$0, czn $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.q()));
   }

   protected boolean a(dus $$0, eqs $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cvs> a(dus $$0, eto.a $$1) {
      if (this.aR.isEmpty()) {
         return Collections.emptyList();
      } else {
         eto $$2 = $$1.a(ewh.g, $$0).a(ewg.r);
         arj $$3 = $$2.a();
         etq $$4 = $$3.o().bd().b(this.aR.get());
         return $$4.a($$2);
      }
   }

   protected long a(dus $$0, jf $$1) {
      return azf.a($$1);
   }

   protected ezq d_(dus $$0) {
      return $$0.f(ddy.a, jf.c);
   }

   protected ezq b_(dus $$0, ddo $$1, jf $$2) {
      return this.b($$0, $$1, $$2, ezb.a());
   }

   protected ezq a(dus $$0, ddo $$1, jf $$2) {
      return ezn.a();
   }

   protected int i_(dus $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bru b(dus $$0, dej $$1, jf $$2) {
      return null;
   }

   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return true;
   }

   protected float c(dus $$0, ddo $$1, jf $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dus $$0, dej $$1, jf $$2) {
      return 0;
   }

   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return ezn.b();
   }

   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return this.aH ? $$0.f($$1, $$2) : ezn.a();
   }

   protected boolean a_(dus $$0, ddo $$1, jf $$2) {
      return dhm.a($$0.g($$1, $$2));
   }

   protected ezq c(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
   }

   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
   }

   protected float a(dus $$0, cnx $$1, ddo $$2, jf $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dus $$0, arj $$1, jf $$2, cvs $$3, boolean $$4) {
   }

   protected void a_(dus $$0, dej $$1, jf $$2, cnx $$3) {
   }

   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return 0;
   }

   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
   }

   protected int b(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return 0;
   }

   public final Optional<ald<etq>> u() {
      return this.aR;
   }

   public final String v() {
      return this.aS;
   }

   protected void a(dej $$0, dus $$1, eys $$2, cor $$3) {
   }

   protected boolean e_(dus $$0) {
      return !dhm.a($$0.f(ddy.a, jf.c)) && $$0.y().c();
   }

   protected boolean f(dus $$0) {
      return this.aJ;
   }

   protected dpa h_(dus $$0) {
      return this.aK;
   }

   public abstract cvn q();

   protected abstract dhm p();

   public eqx w() {
      return this.aQ.b.apply(this.p().n());
   }

   public float x() {
      return this.aQ.g;
   }

   public abstract static class a extends duu<dhm, dus> {
      private static final jk[] a = jk.values();
      private static final ezq[] f = ad.a(new ezq[a.length], $$0 -> Arrays.fill($$0, ezn.a()));
      private static final ezq[] g = ad.a(new ezq[a.length], $$0 -> Arrays.fill($$0, ezn.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final eqy n;
      private final eqx o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dur.f s;
      private final dur.f t;
      private final dur.f u;
      private final dur.f v;
      private final dur.f w;
      @Nullable
      private final dur.b x;
      private final boolean y;
      private final dvt z;
      private final boolean A;
      @Nullable
      private dur.a.a B;
      private eqt C = equ.a.g();
      private boolean D;
      private boolean E;
      private ezq F;
      private ezq[] G;
      private boolean H;
      private int I;

      protected a(dhm $$0, Reference2ObjectArrayMap<dvv<?>, Comparable<?>> $$1, MapCodec<dus> $$2) {
         super($$0, $$1, $$2);
         dur.d $$3 = $$0.aQ;
         this.h = $$3.e.applyAsInt(this.B());
         this.i = $$0.g_(this.B());
         this.j = $$3.q;
         this.k = $$3.r;
         this.l = $$3.s;
         this.n = $$3.v;
         this.o = $$3.b.apply(this.B());
         this.p = $$3.g;
         this.q = $$3.h;
         this.r = $$3.p;
         this.s = $$3.A;
         this.t = $$3.B;
         this.u = $$3.C;
         this.v = $$3.D;
         this.w = $$3.E;
         this.x = $$3.H;
         this.y = $$3.w;
         this.z = $$3.x;
         this.A = $$3.y;
      }

      private boolean H() {
         if (this.d.aQ.u) {
            return true;
         } else if (this.d.aQ.t) {
            return false;
         } else if (this.B == null) {
            return false;
         } else {
            ezq $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               eyr $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().o()) {
            this.B = new dur.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : ezn.a();
         this.E = dhm.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new ezq[a.length];

            for (jk $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dhm b() {
         return this.d;
      }

      public jo<dhm> c() {
         return this.d.r();
      }

      @Deprecated
      public boolean d() {
         dhm $$0 = this.b();
         return $$0 != dho.bs && $$0 != dho.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(ddo $$0, jf $$1, bty<?> $$2) {
         return this.b().aQ.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public ezq a(jk $$0) {
         return this.G[$$0.ordinal()];
      }

      public ezq h() {
         return this.F;
      }

      public boolean i() {
         return this.B == null || this.B.b;
      }

      public boolean j() {
         return this.i;
      }

      public int k() {
         return this.h;
      }

      public boolean l() {
         return this.j;
      }

      public boolean m() {
         return this.k;
      }

      @Deprecated
      public boolean n() {
         return this.l;
      }

      public eqx a(ddo $$0, jf $$1) {
         return this.o;
      }

      public dus a(doa $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dus a(dmj $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dnt o() {
         return this.b().a_(this.B());
      }

      public boolean b(ddo $$0, jf $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(ddo $$0, jf $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(ddo $$0, jf $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(ddo $$0, jf $$1, jk $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dej $$0, jf $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(ddo $$0, jf $$1) {
         return this.p;
      }

      public float a(cnx $$0, ddo $$1, jf $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(ddo $$0, jf $$1, jk $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public eqy r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dus $$0, jk $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public ezq f(ddo $$0, jf $$1) {
         return this.a($$0, $$1, ezb.a());
      }

      public ezq a(ddo $$0, jf $$1, ezb $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public ezq g(ddo $$0, jf $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, ezb.a());
      }

      public ezq b(ddo $$0, jf $$1, ezb $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public ezq h(ddo $$0, jf $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public ezq c(ddo $$0, jf $$1, ezb $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public ezq i(ddo $$0, jf $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(ddo $$0, jf $$1, btr $$2) {
         return this.a($$0, $$1, $$2, jk.b);
      }

      public final boolean a(ddo $$0, jf $$1, btr $$2, jk $$3) {
         return dhm.a(this.b($$0, $$1, ezb.a($$2)), $$3);
      }

      public eyw a(jf $$0) {
         dur.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : eyw.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dej $$0, jf $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dej $$0, jf $$1, dhm $$2, @Nullable esb $$3, boolean $$4) {
         ago.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dek $$0, jf $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dek $$0, jf $$1, int $$2, int $$3) {
         jf.a $$4 = new jf.a();

         for (jk $$5 : dur.aG) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dek $$0, jf $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dek $$0, jf $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dej $$0, jf $$1, dus $$2, boolean $$3) {
         this.b().b(this.B(), $$0, $$1, $$2, $$3);
      }

      public void b(dej $$0, jf $$1, dus $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arj $$0, jf $$1, deb $$2, BiConsumer<cvs, jf> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arj $$0, jf $$1, azn $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(arj $$0, jf $$1, azn $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dej $$0, jf $$1, btr $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(arj $$0, jf $$1, cvs $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cvs> a(eto.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public brs a(cvs $$0, dej $$1, cnx $$2, brr $$3, eys $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public brs a(dej $$0, cnx $$1, eys $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dej $$0, jf $$1, cnx $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(ddo $$0, jf $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(ddo $$0, jf $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dus a(jk $$0, dus $$1, dek $$2, jf $$3, jf $$4) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(eri $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(czn $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(eqs $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dem $$0, jf $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(ddo $$0, jf $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bru b(dej $$0, jf $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axl<dhm> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(axl<dhm> $$0, Predicate<dur.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(js<dhm> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(jo<dhm> $$0) {
         return this.a($$0.a());
      }

      public Stream<axl<dhm>> w() {
         return this.b().r().c();
      }

      public boolean x() {
         return this.b() instanceof dke;
      }

      @Nullable
      public <T extends drv> drw<T> a(dej $$0, drx<T> $$1) {
         return this.b() instanceof dke ? ((dke)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dhm $$0) {
         return this.b() == $$0;
      }

      public boolean a(ald<dhm> $$0) {
         return this.b().r().a($$0);
      }

      public eqt y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(jf $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dpa A() {
         return this.b().h_(this.B());
      }

      public void a(dej $$0, dus $$1, eys $$2, cor $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(ddo $$0, jf $$1, jk $$2) {
         return this.a($$0, $$1, $$2, dpo.a);
      }

      public boolean a(ddo $$0, jf $$1, jk $$2, dpo $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(ddo $$0, jf $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      protected abstract dus B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dvt E() {
         return this.z;
      }

      static final class a {
         private static final jk[] d = jk.values();
         private static final int e = dpo.values().length;
         protected final ezq a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dus $$0) {
            dhm $$1 = $$0.b();
            this.a = $$1.b($$0, ddy.a, jf.c, ezb.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lv.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jk.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jk $$2 : d) {
                  for (dpo $$3 : dpo.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, ddy.a, jf.c, $$2);
                  }
               }

               this.c = dhm.a($$0.g(ddy.a, jf.c));
            }
         }

         public boolean a(jk $$0, dpo $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jk $$0, dpo $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      eyw evaluate(dus var1, jf var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dur.d> a = Codec.unit(() -> a());
      Function<dus, eqx> b = $$0 -> eqx.a;
      boolean c = true;
      dpa d = dpa.f;
      ToIntFunction<dus> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private ald<dhm> m;
      private akw<dhm, Optional<ald<etq>>> n = $$0 -> Optional.of(ald.a(lw.be, $$0.a().f("blocks/")));
      private akw<dhm, String> o = $$0 -> ad.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      eqy v = eqy.a;
      boolean w = true;
      dvt x = dvt.a;
      boolean y;
      dur.e<bty<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jk.b) && $$0.k() < 14;
      dur.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dur.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dur.f C = this.B;
      dur.f D = ($$0, $$1, $$2) -> false;
      dur.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      cqq G = cqs.h;
      @Nullable
      dur.b H;

      private d() {
      }

      public static dur.d a() {
         return new dur.d();
      }

      public static dur.d a(dur $$0) {
         dur.d $$1 = b($$0);
         dur.d $$2 = $$0.aQ;
         $$1.l = $$2.l;
         $$1.A = $$2.A;
         $$1.z = $$2.z;
         $$1.D = $$2.D;
         $$1.B = $$2.B;
         $$1.C = $$2.C;
         $$1.n = $$2.n;
         $$1.o = $$2.o;
         return $$1;
      }

      @Deprecated
      public static dur.d b(dur $$0) {
         dur.d $$1 = new dur.d();
         dur.d $$2 = $$0.aQ;
         $$1.g = $$2.g;
         $$1.f = $$2.f;
         $$1.c = $$2.c;
         $$1.i = $$2.i;
         $$1.e = $$2.e;
         $$1.b = $$2.b;
         $$1.d = $$2.d;
         $$1.j = $$2.j;
         $$1.k = $$2.k;
         $$1.F = $$2.F;
         $$1.p = $$2.p;
         $$1.q = $$2.q;
         $$1.r = $$2.r;
         $$1.s = $$2.s;
         $$1.t = $$2.t;
         $$1.u = $$2.u;
         $$1.v = $$2.v;
         $$1.h = $$2.h;
         $$1.H = $$2.H;
         $$1.w = $$2.w;
         $$1.G = $$2.G;
         $$1.E = $$2.E;
         $$1.x = $$2.x;
         $$1.y = $$2.y;
         return $$1;
      }

      public dur.d a(cum $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dur.d a(eqx $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dur.d a(Function<dus, eqx> $$0) {
         this.b = $$0;
         return this;
      }

      public dur.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dur.d c() {
         this.p = false;
         return this;
      }

      public dur.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dur.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dur.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dur.d a(dpa $$0) {
         this.d = $$0;
         return this;
      }

      public dur.d a(ToIntFunction<dus> $$0) {
         this.e = $$0;
         return this;
      }

      public dur.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dur.d d() {
         return this.d(0.0F);
      }

      public dur.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dur.d e() {
         this.i = true;
         return this;
      }

      public dur.d f() {
         this.F = true;
         return this;
      }

      public dur.d g() {
         this.n = akw.fixed(Optional.empty());
         return this;
      }

      public dur.d a(Optional<ald<etq>> $$0) {
         this.n = akw.fixed($$0);
         return this;
      }

      protected Optional<ald<etq>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dur.d i() {
         this.r = true;
         return this;
      }

      public dur.d j() {
         this.s = true;
         return this;
      }

      public dur.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dur.d l() {
         this.t = true;
         return this;
      }

      public dur.d a(eqy $$0) {
         this.v = $$0;
         return this;
      }

      public dur.d m() {
         this.q = true;
         return this;
      }

      public dur.d a(dur.e<bty<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dur.d a(dur.f $$0) {
         this.A = $$0;
         return this;
      }

      public dur.d b(dur.f $$0) {
         this.B = $$0;
         return this;
      }

      public dur.d c(dur.f $$0) {
         this.C = $$0;
         return this;
      }

      public dur.d d(dur.f $$0) {
         this.D = $$0;
         return this;
      }

      public dur.d e(dur.f $$0) {
         this.E = $$0;
         return this;
      }

      public dur.d n() {
         this.h = true;
         return this;
      }

      public dur.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dur.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dur.d a(dur.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dhm $$2 = $$0x.b();
            long $$3 = azf.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.at_();
            double $$5 = azf.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azf.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new eyw($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dhm $$2 = $$0x.b();
            long $$3 = azf.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.av_();
            float $$5 = $$2.at_();
            double $$6 = azf.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azf.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new eyw($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dur.d o() {
         this.w = false;
         return this;
      }

      public dur.d a(cqo... $$0) {
         this.G = cqs.f.a($$0);
         return this;
      }

      public dur.d a(dvt $$0) {
         this.x = $$0;
         return this;
      }

      public dur.d p() {
         this.y = true;
         return this;
      }

      public dur.d a(ald<dhm> $$0) {
         this.m = $$0;
         return this;
      }

      public dur.d a(String $$0) {
         this.o = akw.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dus var1, ddo var2, jf var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dus var1, ddo var2, jf var3);
   }
}
