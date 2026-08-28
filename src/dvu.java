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

public abstract class dvu implements crn {
   protected static final jm[] aG = new jm[]{jm.e, jm.f, jm.c, jm.d, jm.a, jm.b};
   protected final boolean aH;
   protected final float aI;
   protected final boolean aJ;
   protected final dqd aK;
   protected final float aL;
   protected final float aM;
   protected final float aN;
   protected final boolean aO;
   protected final crq aP;
   protected final dvu.d aQ;
   protected final Optional<ali<eus>> aR;
   protected final String aS;

   public dvu(dvu.d $$0) {
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

   public dvu.d s() {
      return this.aQ;
   }

   protected abstract MapCodec<? extends diq> a();

   protected static <B extends diq> RecordCodecBuilder<B, dvu.d> t() {
      return dvu.d.a.fieldOf("properties").forGetter(dvu::s);
   }

   public static <B extends diq> MapCodec<B> b(Function<dvu.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dvv $$0, dfn $$1, jh $$2, int $$3, int $$4) {
   }

   protected boolean a(dvv $$0, esk $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(dfb.a, jh.c);
         case b:
            return $$0.y().a(axi.a);
         case c:
            return !$$0.m(dfb.a, jh.c);
         default:
            return false;
      }
   }

   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$0;
   }

   protected boolean b(dvv $$0, dvv $$1, jm $$2) {
      return false;
   }

   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
   }

   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
   }

   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if ($$0.x() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dvv $$0, arp $$1, jh $$2, dfe $$3, BiConsumer<cwm, jh> $$4) {
      if (!$$0.l() && $$3.b() != dfe.a.d) {
         diq $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof cou;
         if ($$5.a($$3)) {
            dsy $$7 = $$0.x() ? $$1.c_($$2) : null;
            euq.a $$8 = new euq.a($$1).a(exj.f, ezy.b($$2)).a(exj.i, cwm.k).b(exj.h, $$7).b(exj.a, $$3.d());
            if ($$3.b() == dfe.a.c) {
               $$8.a(exj.j, $$3.e());
            }

            $$0.a($$1, $$2, cwm.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dis.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      return bsk.e;
   }

   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      return bsk.f;
   }

   protected boolean a(dvv $$0, dfm $$1, jh $$2, int $$3, int $$4) {
      return false;
   }

   protected dow a_(dvv $$0) {
      return dow.c;
   }

   protected boolean g_(dvv $$0) {
      return false;
   }

   protected boolean f_(dvv $$0) {
      return false;
   }

   protected erv b_(dvv $$0) {
      return erw.a.g();
   }

   protected boolean c_(dvv $$0) {
      return false;
   }

   protected float ar_() {
      return 0.25F;
   }

   protected float at_() {
      return 0.2F;
   }

   @Override
   public crq i() {
      return this.aP;
   }

   protected dvv a(dvv $$0, dpd $$1) {
      return $$0;
   }

   protected dvv a(dvv $$0, dnm $$1) {
      return $$0;
   }

   protected boolean a(dvv $$0, dad $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.j()));
   }

   protected boolean a(dvv $$0, eru $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cwm> a(dvv $$0, euq.a $$1) {
      if (this.aR.isEmpty()) {
         return Collections.emptyList();
      } else {
         euq $$2 = $$1.a(exj.g, $$0).a(exi.r);
         arp $$3 = $$2.a();
         eus $$4 = $$3.p().bc().b(this.aR.get());
         return $$4.a($$2);
      }
   }

   protected long a(dvv $$0, jh $$1) {
      return azm.a($$1);
   }

   protected fas d_(dvv $$0) {
      return $$0.f(dfb.a, jh.c);
   }

   protected fas b_(dvv $$0, der $$1, jh $$2) {
      return this.b($$0, $$1, $$2, fad.a());
   }

   protected fas a(dvv $$0, der $$1, jh $$2) {
      return fap.a();
   }

   protected int i_(dvv $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bsm b(dvv $$0, dfm $$1, jh $$2) {
      return null;
   }

   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return true;
   }

   protected float c(dvv $$0, der $$1, jh $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return 0;
   }

   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return fap.b();
   }

   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      return this.aH ? $$0.f($$1, $$2) : fap.a();
   }

   protected boolean a_(dvv $$0, der $$1, jh $$2) {
      return diq.a($$0.g($$1, $$2));
   }

   protected fas c(dvv $$0, der $$1, jh $$2, fad $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
   }

   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
   }

   protected float a(dvv $$0, cou $$1, der $$2, jh $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dvv $$0, arp $$1, jh $$2, cwm $$3, boolean $$4) {
   }

   protected void a_(dvv $$0, dfm $$1, jh $$2, cou $$3) {
   }

   protected int a(dvv $$0, der $$1, jh $$2, jm $$3) {
      return 0;
   }

   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
   }

   protected fas a_(dvv $$0, dfm $$1, jh $$2) {
      return fap.b();
   }

   protected int b(dvv $$0, der $$1, jh $$2, jm $$3) {
      return 0;
   }

   public final Optional<ali<eus>> u() {
      return this.aR;
   }

   public final String v() {
      return this.aS;
   }

   protected void a(dfm $$0, dvv $$1, ezu $$2, cpn $$3) {
   }

   protected boolean e_(dvv $$0) {
      return !diq.a($$0.f(dfb.a, jh.c)) && $$0.y().c();
   }

   protected boolean f(dvv $$0) {
      return this.aJ;
   }

   protected dqd h_(dvv $$0) {
      return this.aK;
   }

   public abstract cwi j();

   protected abstract diq o();

   public erz w() {
      return this.aQ.b.apply(this.o().m());
   }

   public float x() {
      return this.aQ.g;
   }

   public abstract static class a extends dvx<diq, dvv> {
      private static final jm[] a = jm.values();
      private static final fas[] f = ae.a(new fas[a.length], $$0 -> Arrays.fill($$0, fap.a()));
      private static final fas[] g = ae.a(new fas[a.length], $$0 -> Arrays.fill($$0, fap.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final esa n;
      private final erz o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dvu.f s;
      private final dvu.f t;
      private final dvu.f u;
      private final dvu.f v;
      private final dvu.f w;
      @Nullable
      private final dvu.b x;
      private final boolean y;
      private final dwv z;
      private final boolean A;
      @Nullable
      private dvu.a.a B;
      private erv C = erw.a.g();
      private boolean D;
      private boolean E;
      private fas F;
      private fas[] G;
      private boolean H;
      private int I;

      protected a(diq $$0, Reference2ObjectArrayMap<dwx<?>, Comparable<?>> $$1, MapCodec<dvv> $$2) {
         super($$0, $$1, $$2);
         dvu.d $$3 = $$0.aQ;
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
            fas $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               ezt $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new dvu.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fap.a();
         this.E = diq.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fas[a.length];

            for (jm $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public diq b() {
         return this.d;
      }

      public jq<diq> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         diq $$0 = this.b();
         return $$0 != dis.bs && $$0 != dis.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(der $$0, jh $$1, bus<?> $$2) {
         return this.b().aQ.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fas a(jm $$0) {
         return this.G[$$0.ordinal()];
      }

      public fas h() {
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

      public erz a(der $$0, jh $$1) {
         return this.o;
      }

      public dvv a(dpd $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dvv a(dnm $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dow o() {
         return this.b().a_(this.B());
      }

      public boolean b(der $$0, jh $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(der $$0, jh $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(der $$0, jh $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(der $$0, jh $$1, jm $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dfm $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(der $$0, jh $$1) {
         return this.p;
      }

      public float a(cou $$0, der $$1, jh $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(der $$0, jh $$1, jm $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public esa r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dvv $$0, jm $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fas f(der $$0, jh $$1) {
         return this.a($$0, $$1, fad.a());
      }

      public fas a(der $$0, jh $$1, fad $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fas g(der $$0, jh $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, fad.a());
      }

      public fas b(der $$0, jh $$1, fad $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fas h(der $$0, jh $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fas c(der $$0, jh $$1, fad $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fas i(der $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(der $$0, jh $$1, bul $$2) {
         return this.a($$0, $$1, $$2, jm.b);
      }

      public final boolean a(der $$0, jh $$1, bul $$2, jm $$3) {
         return diq.a(this.b($$0, $$1, fad.a($$2)), $$3);
      }

      public ezy a(jh $$0) {
         dvu.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : ezy.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dfm $$0, jh $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dfm $$0, jh $$1, diq $$2, @Nullable etd $$3, boolean $$4) {
         agt.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dfn $$0, jh $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dfn $$0, jh $$1, int $$2, int $$3) {
         jh.a $$4 = new jh.a();

         for (jm $$5 : dvu.aG) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dfn $$0, jh $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dfn $$0, jh $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dfm $$0, jh $$1, dvv $$2, boolean $$3) {
         this.b().b(this.B(), $$0, $$1, $$2, $$3);
      }

      public void b(dfm $$0, jh $$1, dvv $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arp $$0, jh $$1, dfe $$2, BiConsumer<cwm, jh> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arp $$0, jh $$1, azu $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(arp $$0, jh $$1, azu $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dfm $$0, jh $$1, bul $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fas b(dfm $$0, jh $$1) {
         return this.b().a_(this.B(), $$0, $$1);
      }

      public void a(arp $$0, jh $$1, cwm $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cwm> a(euq.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bsk a(cwm $$0, dfm $$1, cou $$2, bsj $$3, ezu $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bsk a(dfm $$0, cou $$1, ezu $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dfm $$0, jh $$1, cou $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(der $$0, jh $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(der $$0, jh $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dvv a(dfp $$0, dgb $$1, jh $$2, jm $$3, jh $$4, dvv $$5, azu $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(esk $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(dad $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(eru $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dfp $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(der $$0, jh $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bsm c(dfm $$0, jh $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axs<diq> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axs<diq> $$0, Predicate<dvu.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ju<diq> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jq<diq> $$0) {
         return this.a($$0.a());
      }

      public Stream<axs<diq>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dli;
      }

      @Nullable
      public <T extends dsy> dsz<T> a(dfm $$0, dta<T> $$1) {
         return this.b() instanceof dli ? ((dli)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(diq $$0) {
         return this.b() == $$0;
      }

      public boolean a(ali<diq> $$0) {
         return this.b().p().a($$0);
      }

      public erv y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(jh $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dqd A() {
         return this.b().h_(this.B());
      }

      public void a(dfm $$0, dvv $$1, ezu $$2, cpn $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(der $$0, jh $$1, jm $$2) {
         return this.a($$0, $$1, $$2, dqr.a);
      }

      public boolean a(der $$0, jh $$1, jm $$2, dqr $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(der $$0, jh $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      protected abstract dvv B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dwv E() {
         return this.z;
      }

      static final class a {
         private static final jm[] d = jm.values();
         private static final int e = dqr.values().length;
         protected final fas a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dvv $$0) {
            diq $$1 = $$0.b();
            this.a = $$1.b($$0, dfb.a, jh.c, fad.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lz.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jm.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jm $$2 : d) {
                  for (dqr $$3 : dqr.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, dfb.a, jh.c, $$2);
                  }
               }

               this.c = diq.a($$0.g(dfb.a, jh.c));
            }
         }

         public boolean a(jm $$0, dqr $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jm $$0, dqr $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      ezy evaluate(dvv var1, jh var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dvu.d> a = Codec.unit(() -> a());
      Function<dvv, erz> b = $$0 -> erz.a;
      boolean c = true;
      dqd d = dqd.f;
      ToIntFunction<dvv> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private ali<diq> m;
      private alb<diq, Optional<ali<eus>>> n = $$0 -> Optional.of(ali.a(ma.bd, $$0.a().f("blocks/")));
      private alb<diq, String> o = $$0 -> ae.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      esa v = esa.a;
      boolean w = true;
      dwv x = dwv.a;
      boolean y;
      dvu.e<bus<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jm.b) && $$0.k() < 14;
      dvu.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dvu.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dvu.f C = this.B;
      dvu.f D = ($$0, $$1, $$2) -> false;
      dvu.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      crq G = crs.g;
      @Nullable
      dvu.b H;

      private d() {
      }

      public static dvu.d a() {
         return new dvu.d();
      }

      public static dvu.d a(dvu $$0) {
         dvu.d $$1 = b($$0);
         dvu.d $$2 = $$0.aQ;
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
      public static dvu.d b(dvu $$0) {
         dvu.d $$1 = new dvu.d();
         dvu.d $$2 = $$0.aQ;
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

      public dvu.d a(cvj $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dvu.d a(erz $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dvu.d a(Function<dvv, erz> $$0) {
         this.b = $$0;
         return this;
      }

      public dvu.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dvu.d c() {
         this.p = false;
         return this;
      }

      public dvu.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dvu.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dvu.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dvu.d a(dqd $$0) {
         this.d = $$0;
         return this;
      }

      public dvu.d a(ToIntFunction<dvv> $$0) {
         this.e = $$0;
         return this;
      }

      public dvu.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dvu.d d() {
         return this.d(0.0F);
      }

      public dvu.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dvu.d e() {
         this.i = true;
         return this;
      }

      public dvu.d f() {
         this.F = true;
         return this;
      }

      public dvu.d g() {
         this.n = alb.fixed(Optional.empty());
         return this;
      }

      public dvu.d a(Optional<ali<eus>> $$0) {
         this.n = alb.fixed($$0);
         return this;
      }

      protected Optional<ali<eus>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dvu.d i() {
         this.r = true;
         return this;
      }

      public dvu.d j() {
         this.s = true;
         return this;
      }

      public dvu.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dvu.d l() {
         this.t = true;
         return this;
      }

      public dvu.d a(esa $$0) {
         this.v = $$0;
         return this;
      }

      public dvu.d m() {
         this.q = true;
         return this;
      }

      public dvu.d a(dvu.e<bus<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dvu.d a(dvu.f $$0) {
         this.A = $$0;
         return this;
      }

      public dvu.d b(dvu.f $$0) {
         this.B = $$0;
         return this;
      }

      public dvu.d c(dvu.f $$0) {
         this.C = $$0;
         return this;
      }

      public dvu.d d(dvu.f $$0) {
         this.D = $$0;
         return this;
      }

      public dvu.d e(dvu.f $$0) {
         this.E = $$0;
         return this;
      }

      public dvu.d n() {
         this.h = true;
         return this;
      }

      public dvu.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dvu.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dvu.d a(dvu.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            diq $$2 = $$0x.b();
            long $$3 = azm.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.ar_();
            double $$5 = azm.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azm.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new ezy($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            diq $$2 = $$0x.b();
            long $$3 = azm.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.at_();
            float $$5 = $$2.ar_();
            double $$6 = azm.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azm.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new ezy($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dvu.d o() {
         this.w = false;
         return this;
      }

      public dvu.d a(cro... $$0) {
         this.G = crs.e.a($$0);
         return this;
      }

      public dvu.d a(dwv $$0) {
         this.x = $$0;
         return this;
      }

      public dvu.d p() {
         this.y = true;
         return this;
      }

      public dvu.d a(ali<diq> $$0) {
         this.m = $$0;
         return this;
      }

      public dvu.d a(String $$0) {
         this.o = alb.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dvv var1, der var2, jh var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dvv var1, der var2, jh var3);
   }
}
