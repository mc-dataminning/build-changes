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

public abstract class dww implements crq {
   protected static final jn[] aG = new jn[]{jn.e, jn.f, jn.c, jn.d, jn.a, jn.b};
   protected final boolean aH;
   protected final float aI;
   protected final boolean aJ;
   protected final dre aK;
   protected final float aL;
   protected final float aM;
   protected final float aN;
   protected final boolean aO;
   protected final crt aP;
   protected final dww.d aQ;
   protected final Optional<akt<evw>> aR;
   protected final String aS;

   public dww(dww.d $$0) {
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

   public dww.d s() {
      return this.aQ;
   }

   protected abstract MapCodec<? extends djm> a();

   protected static <B extends djm> RecordCodecBuilder<B, dww.d> t() {
      return dww.d.a.fieldOf("properties").forGetter(dww::s);
   }

   public static <B extends djm> MapCodec<B> b(Function<dww.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dwx $$0, dgj $$1, ji $$2, int $$3, int $$4) {
   }

   protected boolean a(dwx $$0, eto $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(dfx.a, ji.c);
         case b:
            return $$0.y().a(awv.a);
         case c:
            return !$$0.m(dfx.a, ji.c);
         default:
            return false;
      }
   }

   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$0;
   }

   protected boolean b(dwx $$0, dwx $$1, jn $$2) {
      return false;
   }

   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
   }

   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
   }

   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if ($$0.x() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dwx $$0, arc $$1, ji $$2, dga $$3, BiConsumer<cwp, ji> $$4) {
      if (!$$0.l() && $$3.b() != dga.a.d) {
         djm $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof cox;
         if ($$5.a($$3)) {
            dtz $$7 = $$0.x() ? $$1.c_($$2) : null;
            evu.a $$8 = new evu.a($$1).a(eyl.f, fba.b($$2)).a(eyl.i, cwp.j).b(eyl.h, $$7).b(eyl.a, $$3.d());
            if ($$3.b() == dga.a.c) {
               $$8.a(eyl.j, $$3.e());
            }

            $$0.a($$1, $$2, cwp.j, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, djo.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      return bsj.e;
   }

   protected bsj a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsi $$5, faw $$6) {
      return bsj.f;
   }

   protected boolean a(dwx $$0, dgi $$1, ji $$2, int $$3, int $$4) {
      return false;
   }

   protected dpx a_(dwx $$0) {
      return dpx.c;
   }

   protected boolean g_(dwx $$0) {
      return false;
   }

   protected boolean f_(dwx $$0) {
      return false;
   }

   protected esz b_(dwx $$0) {
      return eta.a.g();
   }

   protected boolean c_(dwx $$0) {
      return false;
   }

   protected float ar_() {
      return 0.25F;
   }

   protected float at_() {
      return 0.2F;
   }

   @Override
   public crt i() {
      return this.aP;
   }

   protected dwx a(dwx $$0, dqe $$1) {
      return $$0;
   }

   protected dwx a(dwx $$0, dol $$1) {
      return $$0;
   }

   protected boolean a(dwx $$0, dag $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.j()));
   }

   protected boolean a(dwx $$0, esy $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cwp> a(dwx $$0, evu.a $$1) {
      if (this.aR.isEmpty()) {
         return Collections.emptyList();
      } else {
         evu $$2 = $$1.a(eyl.g, $$0).a(eyk.r);
         arc $$3 = $$2.a();
         evw $$4 = $$3.p().bc().b(this.aR.get());
         return $$4.a($$2);
      }
   }

   protected long a(dwx $$0, ji $$1) {
      return ayz.a($$1);
   }

   protected fbu d_(dwx $$0) {
      return $$0.f(dfx.a, ji.c);
   }

   protected fbu b_(dwx $$0, dfn $$1, ji $$2) {
      return this.b($$0, $$1, $$2, fbf.a());
   }

   protected fbu a(dwx $$0, dfn $$1, ji $$2) {
      return fbr.a();
   }

   protected int i_(dwx $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bsl b(dwx $$0, dgi $$1, ji $$2) {
      return null;
   }

   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return true;
   }

   protected float c(dwx $$0, dfn $$1, ji $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return 0;
   }

   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return fbr.b();
   }

   protected fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return this.aH ? $$0.f($$1, $$2) : fbr.a();
   }

   protected boolean a_(dwx $$0, dfn $$1, ji $$2) {
      return djm.a($$0.g($$1, $$2));
   }

   protected fbu c(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
   }

   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
   }

   protected float a(dwx $$0, cox $$1, dfn $$2, ji $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dwx $$0, arc $$1, ji $$2, cwp $$3, boolean $$4) {
   }

   protected void a_(dwx $$0, dgi $$1, ji $$2, cox $$3) {
   }

   protected int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return 0;
   }

   protected void a(dwx $$0, dgi $$1, ji $$2, buk $$3) {
   }

   protected fbu a_(dwx $$0, dgi $$1, ji $$2) {
      return fbr.b();
   }

   protected int b(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return 0;
   }

   public final Optional<akt<evw>> u() {
      return this.aR;
   }

   public final String v() {
      return this.aS;
   }

   protected void a(dgi $$0, dwx $$1, faw $$2, cpq $$3) {
   }

   protected boolean e_(dwx $$0) {
      return !djm.a($$0.f(dfx.a, ji.c)) && $$0.y().c();
   }

   protected boolean f(dwx $$0) {
      return this.aJ;
   }

   protected dre h_(dwx $$0) {
      return this.aK;
   }

   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return new cwp(this.j());
   }

   public abstract cwl j();

   protected abstract djm o();

   public etd w() {
      return this.aQ.b.apply(this.o().m());
   }

   public float x() {
      return this.aQ.g;
   }

   public abstract static class a extends dwz<djm, dwx> {
      private static final jn[] a = jn.values();
      private static final fbu[] f = af.a(new fbu[a.length], $$0 -> Arrays.fill($$0, fbr.a()));
      private static final fbu[] g = af.a(new fbu[a.length], $$0 -> Arrays.fill($$0, fbr.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final ete n;
      private final etd o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dww.f s;
      private final dww.f t;
      private final dww.f u;
      private final dww.f v;
      private final dww.f w;
      @Nullable
      private final dww.b x;
      private final boolean y;
      private final dxx z;
      private final boolean A;
      @Nullable
      private dww.a.a B;
      private esz C = eta.a.g();
      private boolean D;
      private boolean E;
      private fbu F;
      private fbu[] G;
      private boolean H;
      private int I;

      protected a(djm $$0, Reference2ObjectArrayMap<dxz<?>, Comparable<?>> $$1, MapCodec<dwx> $$2) {
         super($$0, $$1, $$2);
         dww.d $$3 = $$0.aQ;
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
            fbu $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               fav $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new dww.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fbr.a();
         this.E = djm.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fbu[a.length];

            for (jn $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public djm b() {
         return this.d;
      }

      public jr<djm> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         djm $$0 = this.b();
         return $$0 != djo.bz && $$0 != djo.nA && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dfn $$0, ji $$1, bur<?> $$2) {
         return this.b().aQ.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fbu a(jn $$0) {
         return this.G[$$0.ordinal()];
      }

      public fbu h() {
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

      public etd a(dfn $$0, ji $$1) {
         return this.o;
      }

      public dwx a(dqe $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dwx a(dol $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dpx o() {
         return this.b().a_(this.B());
      }

      public boolean b(dfn $$0, ji $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dfn $$0, ji $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dfn $$0, ji $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dfn $$0, ji $$1, jn $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dgi $$0, ji $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dfn $$0, ji $$1) {
         return this.p;
      }

      public float a(cox $$0, dfn $$1, ji $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dfn $$0, ji $$1, jn $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public ete r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dwx $$0, jn $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fbu f(dfn $$0, ji $$1) {
         return this.a($$0, $$1, fbf.a());
      }

      public fbu a(dfn $$0, ji $$1, fbf $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fbu g(dfn $$0, ji $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, fbf.a());
      }

      public fbu b(dfn $$0, ji $$1, fbf $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fbu h(dfn $$0, ji $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fbu c(dfn $$0, ji $$1, fbf $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fbu i(dfn $$0, ji $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(dfn $$0, ji $$1, buk $$2) {
         return this.a($$0, $$1, $$2, jn.b);
      }

      public final boolean a(dfn $$0, ji $$1, buk $$2, jn $$3) {
         return djm.a(this.b($$0, $$1, fbf.a($$2)), $$3);
      }

      public fba a(ji $$0) {
         dww.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : fba.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dgi $$0, ji $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dgi $$0, ji $$1, djm $$2, @Nullable euh $$3, boolean $$4) {
         agc.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dgj $$0, ji $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dgj $$0, ji $$1, int $$2, int $$3) {
         ji.a $$4 = new ji.a();

         for (jn $$5 : dww.aG) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dgj $$0, ji $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dgj $$0, ji $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dgi $$0, ji $$1, dwx $$2, boolean $$3) {
         this.b().b(this.B(), $$0, $$1, $$2, $$3);
      }

      public void b(dgi $$0, ji $$1, dwx $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arc $$0, ji $$1, dga $$2, BiConsumer<cwp, ji> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arc $$0, ji $$1, azh $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(arc $$0, ji $$1, azh $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dgi $$0, ji $$1, buk $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fbu b(dgi $$0, ji $$1) {
         return this.b().a_(this.B(), $$0, $$1);
      }

      public void a(arc $$0, ji $$1, cwp $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cwp> a(evu.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bsj a(cwp $$0, dgi $$1, cox $$2, bsi $$3, faw $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bsj a(dgi $$0, cox $$1, faw $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dgi $$0, ji $$1, cox $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dfn $$0, ji $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dfn $$0, ji $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dwx a(dgl $$0, dgx $$1, ji $$2, jn $$3, ji $$4, dwx $$5, azh $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(eto $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(dag $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(esy $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dgl $$0, ji $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dfn $$0, ji $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bsl c(dgi $$0, ji $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axf<djm> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axf<djm> $$0, Predicate<dww.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jv<djm> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jr<djm> $$0) {
         return this.a($$0.a());
      }

      public Stream<axf<djm>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dmf;
      }

      @Nullable
      public <T extends dtz> dua<T> a(dgi $$0, dub<T> $$1) {
         return this.b() instanceof dmf ? ((dmf)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(djm $$0) {
         return this.b() == $$0;
      }

      public boolean a(akt<djm> $$0) {
         return this.b().p().a($$0);
      }

      public esz y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(ji $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dre A() {
         return this.b().h_(this.B());
      }

      public void a(dgi $$0, dwx $$1, faw $$2, cpq $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dfn $$0, ji $$1, jn $$2) {
         return this.a($$0, $$1, $$2, drs.a);
      }

      public boolean a(dfn $$0, ji $$1, jn $$2, drs $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dfn $$0, ji $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      public cwp a(dgl $$0, ji $$1, boolean $$2) {
         return this.b().a($$0, $$1, this.B(), $$2);
      }

      protected abstract dwx B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dxx E() {
         return this.z;
      }

      static final class a {
         private static final jn[] d = jn.values();
         private static final int e = drs.values().length;
         protected final fbu a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dwx $$0) {
            djm $$1 = $$0.b();
            this.a = $$1.b($$0, dfx.a, ji.c, fbf.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", mb.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jn.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jn $$2 : d) {
                  for (drs $$3 : drs.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, dfx.a, ji.c, $$2);
                  }
               }

               this.c = djm.a($$0.g(dfx.a, ji.c));
            }
         }

         public boolean a(jn $$0, drs $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jn $$0, drs $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      fba evaluate(dwx var1, ji var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dww.d> a = Codec.unit(() -> a());
      Function<dwx, etd> b = $$0 -> etd.a;
      boolean c = true;
      dre d = dre.f;
      ToIntFunction<dwx> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private akt<djm> m;
      private akm<djm, Optional<akt<evw>>> n = $$0 -> Optional.of(akt.a(mc.bg, $$0.a().f("blocks/")));
      private akm<djm, String> o = $$0 -> af.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      ete v = ete.a;
      boolean w = true;
      dxx x = dxx.a;
      boolean y;
      dww.e<bur<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jn.b) && $$0.k() < 14;
      dww.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dww.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dww.f C = this.B;
      dww.f D = ($$0, $$1, $$2) -> false;
      dww.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      crt G = crv.g;
      @Nullable
      dww.b H;

      private d() {
      }

      public static dww.d a() {
         return new dww.d();
      }

      public static dww.d a(dww $$0) {
         dww.d $$1 = b($$0);
         dww.d $$2 = $$0.aQ;
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
      public static dww.d b(dww $$0) {
         dww.d $$1 = new dww.d();
         dww.d $$2 = $$0.aQ;
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

      public dww.d a(cvm $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dww.d a(etd $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dww.d a(Function<dwx, etd> $$0) {
         this.b = $$0;
         return this;
      }

      public dww.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dww.d c() {
         this.p = false;
         return this;
      }

      public dww.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dww.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dww.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dww.d a(dre $$0) {
         this.d = $$0;
         return this;
      }

      public dww.d a(ToIntFunction<dwx> $$0) {
         this.e = $$0;
         return this;
      }

      public dww.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dww.d d() {
         return this.d(0.0F);
      }

      public dww.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dww.d e() {
         this.i = true;
         return this;
      }

      public dww.d f() {
         this.F = true;
         return this;
      }

      public dww.d g() {
         this.n = akm.fixed(Optional.empty());
         return this;
      }

      public dww.d a(Optional<akt<evw>> $$0) {
         this.n = akm.fixed($$0);
         return this;
      }

      protected Optional<akt<evw>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dww.d i() {
         this.r = true;
         return this;
      }

      public dww.d j() {
         this.s = true;
         return this;
      }

      public dww.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dww.d l() {
         this.t = true;
         return this;
      }

      public dww.d a(ete $$0) {
         this.v = $$0;
         return this;
      }

      public dww.d m() {
         this.q = true;
         return this;
      }

      public dww.d a(dww.e<bur<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dww.d a(dww.f $$0) {
         this.A = $$0;
         return this;
      }

      public dww.d b(dww.f $$0) {
         this.B = $$0;
         return this;
      }

      public dww.d c(dww.f $$0) {
         this.C = $$0;
         return this;
      }

      public dww.d d(dww.f $$0) {
         this.D = $$0;
         return this;
      }

      public dww.d e(dww.f $$0) {
         this.E = $$0;
         return this;
      }

      public dww.d n() {
         this.h = true;
         return this;
      }

      public dww.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dww.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dww.d a(dww.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            djm $$2 = $$0x.b();
            long $$3 = ayz.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.ar_();
            double $$5 = ayz.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = ayz.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new fba($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            djm $$2 = $$0x.b();
            long $$3 = ayz.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.at_();
            float $$5 = $$2.ar_();
            double $$6 = ayz.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = ayz.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new fba($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dww.d o() {
         this.w = false;
         return this;
      }

      public dww.d a(crr... $$0) {
         this.G = crv.e.a($$0);
         return this;
      }

      public dww.d a(dxx $$0) {
         this.x = $$0;
         return this;
      }

      public dww.d p() {
         this.y = true;
         return this;
      }

      public dww.d a(akt<djm> $$0) {
         this.m = $$0;
         return this;
      }

      public dww.d a(String $$0) {
         this.o = akm.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dwx var1, dfn var2, ji var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dwx var1, dfn var2, ji var3);
   }
}
