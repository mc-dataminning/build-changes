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

public abstract class dwv implements crp {
   protected static final jn[] aG = new jn[]{jn.e, jn.f, jn.c, jn.d, jn.a, jn.b};
   protected final boolean aH;
   protected final float aI;
   protected final boolean aJ;
   protected final drd aK;
   protected final float aL;
   protected final float aM;
   protected final float aN;
   protected final boolean aO;
   protected final crs aP;
   protected final dwv.d aQ;
   protected final Optional<aku<evv>> aR;
   protected final String aS;

   public dwv(dwv.d $$0) {
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

   public dwv.d s() {
      return this.aQ;
   }

   protected abstract MapCodec<? extends djl> a();

   protected static <B extends djl> RecordCodecBuilder<B, dwv.d> t() {
      return dwv.d.a.fieldOf("properties").forGetter(dwv::s);
   }

   public static <B extends djl> MapCodec<B> b(Function<dwv.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dww $$0, dgi $$1, ji $$2, int $$3, int $$4) {
   }

   protected boolean a(dww $$0, etn $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(dfw.a, ji.c);
         case b:
            return $$0.y().a(awv.a);
         case c:
            return !$$0.m(dfw.a, ji.c);
         default:
            return false;
      }
   }

   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$0;
   }

   protected boolean b(dww $$0, dww $$1, jn $$2) {
      return false;
   }

   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
   }

   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
   }

   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if ($$0.x() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dww $$0, ard $$1, ji $$2, dfz $$3, BiConsumer<cwo, ji> $$4) {
      if (!$$0.l() && $$3.b() != dfz.a.d) {
         djl $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof cow;
         if ($$5.a($$3)) {
            dty $$7 = $$0.x() ? $$1.c_($$2) : null;
            evt.a $$8 = new evt.a($$1).a(eyk.f, faz.b($$2)).a(eyk.i, cwo.j).b(eyk.h, $$7).b(eyk.a, $$3.d());
            if ($$3.b() == dfz.a.c) {
               $$8.a(eyk.j, $$3.e());
            }

            $$0.a($$1, $$2, cwo.j, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, djn.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      return bsj.e;
   }

   protected bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      return bsj.f;
   }

   protected boolean a(dww $$0, dgh $$1, ji $$2, int $$3, int $$4) {
      return false;
   }

   protected dpw a_(dww $$0) {
      return dpw.b;
   }

   protected boolean g_(dww $$0) {
      return false;
   }

   protected boolean f_(dww $$0) {
      return false;
   }

   protected esy b_(dww $$0) {
      return esz.a.g();
   }

   protected boolean c_(dww $$0) {
      return false;
   }

   protected float ar_() {
      return 0.25F;
   }

   protected float at_() {
      return 0.2F;
   }

   @Override
   public crs i() {
      return this.aP;
   }

   protected dww a(dww $$0, dqd $$1) {
      return $$0;
   }

   protected dww a(dww $$0, dok $$1) {
      return $$0;
   }

   protected boolean a(dww $$0, daf $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.j()));
   }

   protected boolean a(dww $$0, esx $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cwo> a(dww $$0, evt.a $$1) {
      if (this.aR.isEmpty()) {
         return Collections.emptyList();
      } else {
         evt $$2 = $$1.a(eyk.g, $$0).a(eyj.r);
         ard $$3 = $$2.a();
         evv $$4 = $$3.p().bc().b(this.aR.get());
         return $$4.a($$2);
      }
   }

   protected long a(dww $$0, ji $$1) {
      return ayz.a($$1);
   }

   protected fbt d_(dww $$0) {
      return $$0.f(dfw.a, ji.c);
   }

   protected fbt b_(dww $$0, dfm $$1, ji $$2) {
      return this.b($$0, $$1, $$2, fbe.a());
   }

   protected fbt a(dww $$0, dfm $$1, ji $$2) {
      return fbq.a();
   }

   protected int i_(dww $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bsl b(dww $$0, dgh $$1, ji $$2) {
      return null;
   }

   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return true;
   }

   protected float c(dww $$0, dfm $$1, ji $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dww $$0, dgh $$1, ji $$2) {
      return 0;
   }

   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return fbq.b();
   }

   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return this.aH ? $$0.f($$1, $$2) : fbq.a();
   }

   protected boolean a_(dww $$0, dfm $$1, ji $$2) {
      return djl.a($$0.g($$1, $$2));
   }

   protected fbt c(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
   }

   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
   }

   protected float a(dww $$0, cow $$1, dfm $$2, ji $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dww $$0, ard $$1, ji $$2, cwo $$3, boolean $$4) {
   }

   protected void a_(dww $$0, dgh $$1, ji $$2, cow $$3) {
   }

   protected int a(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return 0;
   }

   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
   }

   protected fbt a_(dww $$0, dgh $$1, ji $$2) {
      return fbq.b();
   }

   protected int b(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return 0;
   }

   public final Optional<aku<evv>> u() {
      return this.aR;
   }

   public final String v() {
      return this.aS;
   }

   protected void a(dgh $$0, dww $$1, fav $$2, cpp $$3) {
   }

   protected boolean e_(dww $$0) {
      return !djl.a($$0.f(dfw.a, ji.c)) && $$0.y().c();
   }

   protected boolean f(dww $$0) {
      return this.aJ;
   }

   protected drd h_(dww $$0) {
      return this.aK;
   }

   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return new cwo(this.j());
   }

   public abstract cwk j();

   protected abstract djl o();

   public etc w() {
      return this.aQ.b.apply(this.o().m());
   }

   public float x() {
      return this.aQ.g;
   }

   public abstract static class a extends dwy<djl, dww> {
      private static final jn[] a = jn.values();
      private static final fbt[] f = af.a(new fbt[a.length], $$0 -> Arrays.fill($$0, fbq.a()));
      private static final fbt[] g = af.a(new fbt[a.length], $$0 -> Arrays.fill($$0, fbq.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final etd n;
      private final etc o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dwv.f s;
      private final dwv.f t;
      private final dwv.f u;
      private final dwv.f v;
      private final dwv.f w;
      @Nullable
      private final dwv.b x;
      private final boolean y;
      private final dxw z;
      private final boolean A;
      @Nullable
      private dwv.a.a B;
      private esy C = esz.a.g();
      private boolean D;
      private boolean E;
      private fbt F;
      private fbt[] G;
      private boolean H;
      private int I;

      protected a(djl $$0, Reference2ObjectArrayMap<dxy<?>, Comparable<?>> $$1, MapCodec<dww> $$2) {
         super($$0, $$1, $$2);
         dwv.d $$3 = $$0.aQ;
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
            fbt $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               fau $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new dwv.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fbq.a();
         this.E = djl.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fbt[a.length];

            for (jn $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public djl b() {
         return this.d;
      }

      public jr<djl> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         djl $$0 = this.b();
         return $$0 != djn.bz && $$0 != djn.nA && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dfm $$0, ji $$1, bur<?> $$2) {
         return this.b().aQ.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fbt a(jn $$0) {
         return this.G[$$0.ordinal()];
      }

      public fbt h() {
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

      public etc a(dfm $$0, ji $$1) {
         return this.o;
      }

      public dww a(dqd $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dww a(dok $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dpw o() {
         return this.b().a_(this.B());
      }

      public boolean b(dfm $$0, ji $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dfm $$0, ji $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dfm $$0, ji $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dfm $$0, ji $$1, jn $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dgh $$0, ji $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dfm $$0, ji $$1) {
         return this.p;
      }

      public float a(cow $$0, dfm $$1, ji $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dfm $$0, ji $$1, jn $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public etd r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dww $$0, jn $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fbt f(dfm $$0, ji $$1) {
         return this.a($$0, $$1, fbe.a());
      }

      public fbt a(dfm $$0, ji $$1, fbe $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fbt g(dfm $$0, ji $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, fbe.a());
      }

      public fbt b(dfm $$0, ji $$1, fbe $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fbt h(dfm $$0, ji $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fbt c(dfm $$0, ji $$1, fbe $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fbt i(dfm $$0, ji $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(dfm $$0, ji $$1, buk $$2) {
         return this.a($$0, $$1, $$2, jn.b);
      }

      public final boolean a(dfm $$0, ji $$1, buk $$2, jn $$3) {
         return djl.a(this.b($$0, $$1, fbe.a($$2)), $$3);
      }

      public faz a(ji $$0) {
         dwv.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : faz.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dgh $$0, ji $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dgh $$0, ji $$1, djl $$2, @Nullable eug $$3, boolean $$4) {
         agd.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dgi $$0, ji $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dgi $$0, ji $$1, int $$2, int $$3) {
         ji.a $$4 = new ji.a();

         for (jn $$5 : dwv.aG) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dgi $$0, ji $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dgi $$0, ji $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dgh $$0, ji $$1, dww $$2, boolean $$3) {
         this.b().b(this.B(), $$0, $$1, $$2, $$3);
      }

      public void b(dgh $$0, ji $$1, dww $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(ard $$0, ji $$1, dfz $$2, BiConsumer<cwo, ji> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(ard $$0, ji $$1, azh $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(ard $$0, ji $$1, azh $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dgh $$0, ji $$1, buk $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fbt b(dgh $$0, ji $$1) {
         return this.b().a_(this.B(), $$0, $$1);
      }

      public void a(ard $$0, ji $$1, cwo $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cwo> a(evt.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bsj a(cwo $$0, dgh $$1, cow $$2, bsi $$3, fav $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bsj a(dgh $$0, cow $$1, fav $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dgh $$0, ji $$1, cow $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dfm $$0, ji $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dfm $$0, ji $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dww a(dgk $$0, dgw $$1, ji $$2, jn $$3, ji $$4, dww $$5, azh $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(etn $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(daf $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(esx $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dgk $$0, ji $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dfm $$0, ji $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bsl c(dgh $$0, ji $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axf<djl> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axf<djl> $$0, Predicate<dwv.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jv<djl> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jr<djl> $$0) {
         return this.a($$0.a());
      }

      public Stream<axf<djl>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dme;
      }

      @Nullable
      public <T extends dty> dtz<T> a(dgh $$0, dua<T> $$1) {
         return this.b() instanceof dme ? ((dme)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(djl $$0) {
         return this.b() == $$0;
      }

      public boolean a(aku<djl> $$0) {
         return this.b().p().a($$0);
      }

      public esy y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(ji $$0) {
         return this.b().a(this.B(), $$0);
      }

      public drd A() {
         return this.b().h_(this.B());
      }

      public void a(dgh $$0, dww $$1, fav $$2, cpp $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dfm $$0, ji $$1, jn $$2) {
         return this.a($$0, $$1, $$2, drr.a);
      }

      public boolean a(dfm $$0, ji $$1, jn $$2, drr $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dfm $$0, ji $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      public cwo a(dgk $$0, ji $$1, boolean $$2) {
         return this.b().a($$0, $$1, this.B(), $$2);
      }

      protected abstract dww B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dxw E() {
         return this.z;
      }

      static final class a {
         private static final jn[] d = jn.values();
         private static final int e = drr.values().length;
         protected final fbt a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dww $$0) {
            djl $$1 = $$0.b();
            this.a = $$1.b($$0, dfw.a, ji.c, fbe.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", mb.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jn.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jn $$2 : d) {
                  for (drr $$3 : drr.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, dfw.a, ji.c, $$2);
                  }
               }

               this.c = djl.a($$0.g(dfw.a, ji.c));
            }
         }

         public boolean a(jn $$0, drr $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jn $$0, drr $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      faz evaluate(dww var1, ji var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dwv.d> a = Codec.unit(() -> a());
      Function<dww, etc> b = $$0 -> etc.a;
      boolean c = true;
      drd d = drd.f;
      ToIntFunction<dww> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private aku<djl> m;
      private akn<djl, Optional<aku<evv>>> n = $$0 -> Optional.of(aku.a(mc.bg, $$0.a().f("blocks/")));
      private akn<djl, String> o = $$0 -> af.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      etd v = etd.a;
      boolean w = true;
      dxw x = dxw.a;
      boolean y;
      dwv.e<bur<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jn.b) && $$0.k() < 14;
      dwv.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dwv.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dwv.f C = this.B;
      dwv.f D = ($$0, $$1, $$2) -> false;
      dwv.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      crs G = cru.g;
      @Nullable
      dwv.b H;

      private d() {
      }

      public static dwv.d a() {
         return new dwv.d();
      }

      public static dwv.d a(dwv $$0) {
         dwv.d $$1 = b($$0);
         dwv.d $$2 = $$0.aQ;
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
      public static dwv.d b(dwv $$0) {
         dwv.d $$1 = new dwv.d();
         dwv.d $$2 = $$0.aQ;
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

      public dwv.d a(cvl $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dwv.d a(etc $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dwv.d a(Function<dww, etc> $$0) {
         this.b = $$0;
         return this;
      }

      public dwv.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dwv.d c() {
         this.p = false;
         return this;
      }

      public dwv.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dwv.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dwv.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dwv.d a(drd $$0) {
         this.d = $$0;
         return this;
      }

      public dwv.d a(ToIntFunction<dww> $$0) {
         this.e = $$0;
         return this;
      }

      public dwv.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dwv.d d() {
         return this.d(0.0F);
      }

      public dwv.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dwv.d e() {
         this.i = true;
         return this;
      }

      public dwv.d f() {
         this.F = true;
         return this;
      }

      public dwv.d g() {
         this.n = akn.fixed(Optional.empty());
         return this;
      }

      public dwv.d a(Optional<aku<evv>> $$0) {
         this.n = akn.fixed($$0);
         return this;
      }

      protected Optional<aku<evv>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dwv.d i() {
         this.r = true;
         return this;
      }

      public dwv.d j() {
         this.s = true;
         return this;
      }

      public dwv.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dwv.d l() {
         this.t = true;
         return this;
      }

      public dwv.d a(etd $$0) {
         this.v = $$0;
         return this;
      }

      public dwv.d m() {
         this.q = true;
         return this;
      }

      public dwv.d a(dwv.e<bur<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dwv.d a(dwv.f $$0) {
         this.A = $$0;
         return this;
      }

      public dwv.d b(dwv.f $$0) {
         this.B = $$0;
         return this;
      }

      public dwv.d c(dwv.f $$0) {
         this.C = $$0;
         return this;
      }

      public dwv.d d(dwv.f $$0) {
         this.D = $$0;
         return this;
      }

      public dwv.d e(dwv.f $$0) {
         this.E = $$0;
         return this;
      }

      public dwv.d n() {
         this.h = true;
         return this;
      }

      public dwv.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dwv.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dwv.d a(dwv.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            djl $$2 = $$0x.b();
            long $$3 = ayz.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.ar_();
            double $$5 = ayz.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = ayz.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new faz($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            djl $$2 = $$0x.b();
            long $$3 = ayz.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.at_();
            float $$5 = $$2.ar_();
            double $$6 = ayz.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = ayz.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new faz($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dwv.d o() {
         this.w = false;
         return this;
      }

      public dwv.d a(crq... $$0) {
         this.G = cru.e.a($$0);
         return this;
      }

      public dwv.d a(dxw $$0) {
         this.x = $$0;
         return this;
      }

      public dwv.d p() {
         this.y = true;
         return this;
      }

      public dwv.d a(aku<djl> $$0) {
         this.m = $$0;
         return this;
      }

      public dwv.d a(String $$0) {
         this.o = akn.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dww var1, dfm var2, ji var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dww var1, dfm var2, ji var3);
   }
}
