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

public abstract class dvn implements crg {
   protected static final jm[] aG = new jm[]{jm.e, jm.f, jm.c, jm.d, jm.a, jm.b};
   protected final boolean aH;
   protected final float aI;
   protected final boolean aJ;
   protected final dpw aK;
   protected final float aL;
   protected final float aM;
   protected final float aN;
   protected final boolean aO;
   protected final crj aP;
   protected final dvn.d aQ;
   protected final Optional<alk<eul>> aR;
   protected final String aS;

   public dvn(dvn.d $$0) {
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

   public dvn.d s() {
      return this.aQ;
   }

   protected abstract MapCodec<? extends dij> a();

   protected static <B extends dij> RecordCodecBuilder<B, dvn.d> t() {
      return dvn.d.a.fieldOf("properties").forGetter(dvn::s);
   }

   public static <B extends dij> MapCodec<B> b(Function<dvn.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dvo $$0, dfg $$1, jh $$2, int $$3, int $$4) {
   }

   protected boolean a(dvo $$0, esd $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(deu.a, jh.c);
         case b:
            return $$0.y().a(axj.a);
         case c:
            return !$$0.m(deu.a, jh.c);
         default:
            return false;
      }
   }

   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$0;
   }

   protected boolean b(dvo $$0, dvo $$1, jm $$2) {
      return false;
   }

   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
   }

   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
   }

   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if ($$0.x() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dvo $$0, arq $$1, jh $$2, dex $$3, BiConsumer<cwf, jh> $$4) {
      if (!$$0.l() && $$3.a() != dex.a.d) {
         dij $$5 = $$0.b();
         boolean $$6 = $$3.b() instanceof cor;
         if ($$5.a($$3)) {
            dsr $$7 = $$0.x() ? $$1.c_($$2) : null;
            euj.a $$8 = new euj.a($$1).a(exc.f, ezr.b($$2)).a(exc.i, cwf.k).b(exc.h, $$7).b(exc.a, $$3.c());
            if ($$3.a() == dex.a.c) {
               $$8.a(exc.j, $$3.d());
            }

            $$0.a($$1, $$2, cwf.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dil.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      return bsh.e;
   }

   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      return bsh.f;
   }

   protected boolean a(dvo $$0, dff $$1, jh $$2, int $$3, int $$4) {
      return false;
   }

   protected dop a_(dvo $$0) {
      return dop.c;
   }

   protected boolean g_(dvo $$0) {
      return false;
   }

   protected boolean f_(dvo $$0) {
      return false;
   }

   protected ero b_(dvo $$0) {
      return erp.a.g();
   }

   protected boolean c_(dvo $$0) {
      return false;
   }

   protected float as_() {
      return 0.25F;
   }

   protected float au_() {
      return 0.2F;
   }

   @Override
   public crj i() {
      return this.aP;
   }

   protected dvo a(dvo $$0, dow $$1) {
      return $$0;
   }

   protected dvo a(dvo $$0, dnf $$1) {
      return $$0;
   }

   protected boolean a(dvo $$0, czw $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.j()));
   }

   protected boolean a(dvo $$0, ern $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cwf> a(dvo $$0, euj.a $$1) {
      if (this.aR.isEmpty()) {
         return Collections.emptyList();
      } else {
         euj $$2 = $$1.a(exc.g, $$0).a(exb.r);
         arq $$3 = $$2.a();
         eul $$4 = $$3.o().bc().b(this.aR.get());
         return $$4.a($$2);
      }
   }

   protected long a(dvo $$0, jh $$1) {
      return azn.a($$1);
   }

   protected fal d_(dvo $$0) {
      return $$0.f(deu.a, jh.c);
   }

   protected fal b_(dvo $$0, dek $$1, jh $$2) {
      return this.b($$0, $$1, $$2, ezw.a());
   }

   protected fal a(dvo $$0, dek $$1, jh $$2) {
      return fai.a();
   }

   protected int i_(dvo $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bsj b(dvo $$0, dff $$1, jh $$2) {
      return null;
   }

   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return true;
   }

   protected float c(dvo $$0, dek $$1, jh $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dvo $$0, dff $$1, jh $$2) {
      return 0;
   }

   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return fai.b();
   }

   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return this.aH ? $$0.f($$1, $$2) : fai.a();
   }

   protected boolean a_(dvo $$0, dek $$1, jh $$2) {
      return dij.a($$0.g($$1, $$2));
   }

   protected fal c(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
   }

   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
   }

   protected float a(dvo $$0, cor $$1, dek $$2, jh $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dvo $$0, arq $$1, jh $$2, cwf $$3, boolean $$4) {
   }

   protected void a_(dvo $$0, dff $$1, jh $$2, cor $$3) {
   }

   protected int a(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return 0;
   }

   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
   }

   protected fal a_(dvo $$0, dff $$1, jh $$2) {
      return fai.b();
   }

   protected int b(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return 0;
   }

   public final Optional<alk<eul>> u() {
      return this.aR;
   }

   public final String v() {
      return this.aS;
   }

   protected void a(dff $$0, dvo $$1, ezn $$2, cpk $$3) {
   }

   protected boolean e_(dvo $$0) {
      return !dij.a($$0.f(deu.a, jh.c)) && $$0.y().c();
   }

   protected boolean f(dvo $$0) {
      return this.aJ;
   }

   protected dpw h_(dvo $$0) {
      return this.aK;
   }

   public abstract cwb j();

   protected abstract dij o();

   public ers w() {
      return this.aQ.b.apply(this.o().m());
   }

   public float x() {
      return this.aQ.g;
   }

   public abstract static class a extends dvq<dij, dvo> {
      private static final jm[] a = jm.values();
      private static final fal[] f = ae.a(new fal[a.length], $$0 -> Arrays.fill($$0, fai.a()));
      private static final fal[] g = ae.a(new fal[a.length], $$0 -> Arrays.fill($$0, fai.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final ert n;
      private final ers o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dvn.f s;
      private final dvn.f t;
      private final dvn.f u;
      private final dvn.f v;
      private final dvn.f w;
      @Nullable
      private final dvn.b x;
      private final boolean y;
      private final dwo z;
      private final boolean A;
      @Nullable
      private dvn.a.a B;
      private ero C = erp.a.g();
      private boolean D;
      private boolean E;
      private fal F;
      private fal[] G;
      private boolean H;
      private int I;

      protected a(dij $$0, Reference2ObjectArrayMap<dwq<?>, Comparable<?>> $$1, MapCodec<dvo> $$2) {
         super($$0, $$1, $$2);
         dvn.d $$3 = $$0.aQ;
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
            fal $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               ezm $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new dvn.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fai.a();
         this.E = dij.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fal[a.length];

            for (jm $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dij b() {
         return this.d;
      }

      public jq<dij> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dij $$0 = this.b();
         return $$0 != dil.bs && $$0 != dil.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dek $$0, jh $$1, bup<?> $$2) {
         return this.b().aQ.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fal a(jm $$0) {
         return this.G[$$0.ordinal()];
      }

      public fal h() {
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

      public ers a(dek $$0, jh $$1) {
         return this.o;
      }

      public dvo a(dow $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dvo a(dnf $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dop o() {
         return this.b().a_(this.B());
      }

      public boolean b(dek $$0, jh $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dek $$0, jh $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dek $$0, jh $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dek $$0, jh $$1, jm $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dff $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dek $$0, jh $$1) {
         return this.p;
      }

      public float a(cor $$0, dek $$1, jh $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dek $$0, jh $$1, jm $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public ert r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dvo $$0, jm $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fal f(dek $$0, jh $$1) {
         return this.a($$0, $$1, ezw.a());
      }

      public fal a(dek $$0, jh $$1, ezw $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fal g(dek $$0, jh $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, ezw.a());
      }

      public fal b(dek $$0, jh $$1, ezw $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fal h(dek $$0, jh $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fal c(dek $$0, jh $$1, ezw $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fal i(dek $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(dek $$0, jh $$1, bui $$2) {
         return this.a($$0, $$1, $$2, jm.b);
      }

      public final boolean a(dek $$0, jh $$1, bui $$2, jm $$3) {
         return dij.a(this.b($$0, $$1, ezw.a($$2)), $$3);
      }

      public ezr a(jh $$0) {
         dvn.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : ezr.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dff $$0, jh $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dff $$0, jh $$1, dij $$2, @Nullable esw $$3, boolean $$4) {
         agv.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dfg $$0, jh $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dfg $$0, jh $$1, int $$2, int $$3) {
         jh.a $$4 = new jh.a();

         for (jm $$5 : dvn.aG) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dfg $$0, jh $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dfg $$0, jh $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dff $$0, jh $$1, dvo $$2, boolean $$3) {
         this.b().b(this.B(), $$0, $$1, $$2, $$3);
      }

      public void b(dff $$0, jh $$1, dvo $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arq $$0, jh $$1, dex $$2, BiConsumer<cwf, jh> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arq $$0, jh $$1, azv $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(arq $$0, jh $$1, azv $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dff $$0, jh $$1, bui $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fal b(dff $$0, jh $$1) {
         return this.b().a_(this.B(), $$0, $$1);
      }

      public void a(arq $$0, jh $$1, cwf $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cwf> a(euj.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bsh a(cwf $$0, dff $$1, cor $$2, bsg $$3, ezn $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bsh a(dff $$0, cor $$1, ezn $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dff $$0, jh $$1, cor $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dek $$0, jh $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dek $$0, jh $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dvo a(dfi $$0, dfu $$1, jh $$2, jm $$3, jh $$4, dvo $$5, azv $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(esd $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(czw $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(ern $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dfi $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dek $$0, jh $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bsj c(dff $$0, jh $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axt<dij> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axt<dij> $$0, Predicate<dvn.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ju<dij> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jq<dij> $$0) {
         return this.a($$0.a());
      }

      public Stream<axt<dij>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dlb;
      }

      @Nullable
      public <T extends dsr> dss<T> a(dff $$0, dst<T> $$1) {
         return this.b() instanceof dlb ? ((dlb)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dij $$0) {
         return this.b() == $$0;
      }

      public boolean a(alk<dij> $$0) {
         return this.b().p().a($$0);
      }

      public ero y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(jh $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dpw A() {
         return this.b().h_(this.B());
      }

      public void a(dff $$0, dvo $$1, ezn $$2, cpk $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dek $$0, jh $$1, jm $$2) {
         return this.a($$0, $$1, $$2, dqk.a);
      }

      public boolean a(dek $$0, jh $$1, jm $$2, dqk $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dek $$0, jh $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      protected abstract dvo B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dwo E() {
         return this.z;
      }

      static final class a {
         private static final jm[] d = jm.values();
         private static final int e = dqk.values().length;
         protected final fal a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dvo $$0) {
            dij $$1 = $$0.b();
            this.a = $$1.b($$0, deu.a, jh.c, ezw.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lz.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jm.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jm $$2 : d) {
                  for (dqk $$3 : dqk.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, deu.a, jh.c, $$2);
                  }
               }

               this.c = dij.a($$0.g(deu.a, jh.c));
            }
         }

         public boolean a(jm $$0, dqk $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jm $$0, dqk $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      ezr evaluate(dvo var1, jh var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dvn.d> a = Codec.unit(() -> a());
      Function<dvo, ers> b = $$0 -> ers.a;
      boolean c = true;
      dpw d = dpw.f;
      ToIntFunction<dvo> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private alk<dij> m;
      private ald<dij, Optional<alk<eul>>> n = $$0 -> Optional.of(alk.a(ma.bd, $$0.a().f("blocks/")));
      private ald<dij, String> o = $$0 -> ae.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      ert v = ert.a;
      boolean w = true;
      dwo x = dwo.a;
      boolean y;
      dvn.e<bup<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jm.b) && $$0.k() < 14;
      dvn.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dvn.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dvn.f C = this.B;
      dvn.f D = ($$0, $$1, $$2) -> false;
      dvn.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      crj G = crl.h;
      @Nullable
      dvn.b H;

      private d() {
      }

      public static dvn.d a() {
         return new dvn.d();
      }

      public static dvn.d a(dvn $$0) {
         dvn.d $$1 = b($$0);
         dvn.d $$2 = $$0.aQ;
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
      public static dvn.d b(dvn $$0) {
         dvn.d $$1 = new dvn.d();
         dvn.d $$2 = $$0.aQ;
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

      public dvn.d a(cvc $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dvn.d a(ers $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dvn.d a(Function<dvo, ers> $$0) {
         this.b = $$0;
         return this;
      }

      public dvn.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dvn.d c() {
         this.p = false;
         return this;
      }

      public dvn.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dvn.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dvn.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dvn.d a(dpw $$0) {
         this.d = $$0;
         return this;
      }

      public dvn.d a(ToIntFunction<dvo> $$0) {
         this.e = $$0;
         return this;
      }

      public dvn.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dvn.d d() {
         return this.d(0.0F);
      }

      public dvn.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dvn.d e() {
         this.i = true;
         return this;
      }

      public dvn.d f() {
         this.F = true;
         return this;
      }

      public dvn.d g() {
         this.n = ald.fixed(Optional.empty());
         return this;
      }

      public dvn.d a(Optional<alk<eul>> $$0) {
         this.n = ald.fixed($$0);
         return this;
      }

      protected Optional<alk<eul>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dvn.d i() {
         this.r = true;
         return this;
      }

      public dvn.d j() {
         this.s = true;
         return this;
      }

      public dvn.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dvn.d l() {
         this.t = true;
         return this;
      }

      public dvn.d a(ert $$0) {
         this.v = $$0;
         return this;
      }

      public dvn.d m() {
         this.q = true;
         return this;
      }

      public dvn.d a(dvn.e<bup<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dvn.d a(dvn.f $$0) {
         this.A = $$0;
         return this;
      }

      public dvn.d b(dvn.f $$0) {
         this.B = $$0;
         return this;
      }

      public dvn.d c(dvn.f $$0) {
         this.C = $$0;
         return this;
      }

      public dvn.d d(dvn.f $$0) {
         this.D = $$0;
         return this;
      }

      public dvn.d e(dvn.f $$0) {
         this.E = $$0;
         return this;
      }

      public dvn.d n() {
         this.h = true;
         return this;
      }

      public dvn.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dvn.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dvn.d a(dvn.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dij $$2 = $$0x.b();
            long $$3 = azn.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.as_();
            double $$5 = azn.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azn.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new ezr($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dij $$2 = $$0x.b();
            long $$3 = azn.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.au_();
            float $$5 = $$2.as_();
            double $$6 = azn.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azn.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new ezr($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dvn.d o() {
         this.w = false;
         return this;
      }

      public dvn.d a(crh... $$0) {
         this.G = crl.f.a($$0);
         return this;
      }

      public dvn.d a(dwo $$0) {
         this.x = $$0;
         return this;
      }

      public dvn.d p() {
         this.y = true;
         return this;
      }

      public dvn.d a(alk<dij> $$0) {
         this.m = $$0;
         return this;
      }

      public dvn.d a(String $$0) {
         this.o = ald.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dvo var1, dek var2, jh var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dvo var1, dek var2, jh var3);
   }
}
