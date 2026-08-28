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

public abstract class eag implements cuj {
   protected static final ja[] E = new ja[]{ja.e, ja.f, ja.c, ja.d, ja.a, ja.b};
   protected final boolean F;
   protected final float G;
   protected final boolean H;
   protected final duc I;
   protected final float J;
   protected final float K;
   protected final float L;
   protected final boolean M;
   protected final cum N;
   protected final eag.d O;
   protected final Optional<alf<ezm>> P;
   protected final String Q;

   public eag(eag.d $$0) {
      this.F = $$0.c;
      this.P = $$0.h();
      this.Q = $$0.q();
      this.G = $$0.f;
      this.H = $$0.i;
      this.I = $$0.d;
      this.J = $$0.j;
      this.K = $$0.k;
      this.L = $$0.l;
      this.M = $$0.F;
      this.N = $$0.G;
      this.O = $$0;
   }

   public eag.d s() {
      return this.O;
   }

   protected abstract MapCodec<? extends dmf> a();

   protected static <B extends dmf> RecordCodecBuilder<B, eag.d> t() {
      return eag.d.a.fieldOf("properties").forGetter(eag::s);
   }

   public static <B extends dmf> MapCodec<B> b(Function<eag.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(eah $$0, djb $$1, iu $$2, int $$3, int $$4) {
   }

   protected boolean a(eah $$0, exd $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(diq.a, iu.c);
         case b:
            return $$0.y().a(axh.a);
         case c:
            return !$$0.m(diq.a, iu.c);
         default:
            return false;
      }
   }

   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$0;
   }

   protected boolean b(eah $$0, eah $$1, ja $$2) {
      return false;
   }

   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
   }

   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
   }

   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
   }

   protected void a(eah $$0, arq $$1, iu $$2, dit $$3, BiConsumer<czd, iu> $$4) {
      if (!$$0.l() && $$3.b() != dit.a.d) {
         dmf $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof crc;
         if ($$5.a($$3)) {
            dxf $$7 = $$0.x() ? $$1.c_($$2) : null;
            ezk.a $$8 = new ezk.a($$1).a(fcb.f, feq.b($$2)).a(fcb.i, czd.k).b(fcb.h, $$7).b(fcb.a, $$3.d());
            if ($$3.b() == dit.a.c) {
               $$8.a(fcb.j, $$3.e());
            }

            $$0.a($$1, $$2, czd.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dmh.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      return bud.e;
   }

   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      return bud.f;
   }

   protected boolean a(eah $$0, dja $$1, iu $$2, int $$3, int $$4) {
      return false;
   }

   protected dss a_(eah $$0) {
      return dss.b;
   }

   protected boolean g_(eah $$0) {
      return false;
   }

   protected boolean f_(eah $$0) {
      return false;
   }

   protected ewo b_(eah $$0) {
      return ewp.a.g();
   }

   protected boolean c_(eah $$0) {
      return false;
   }

   protected float ao_() {
      return 0.25F;
   }

   protected float aq_() {
      return 0.2F;
   }

   @Override
   public cum k() {
      return this.N;
   }

   protected eah a(eah $$0, dsz $$1) {
      return $$0;
   }

   protected eah a(eah $$0, dri $$1) {
      return $$0;
   }

   protected boolean a(eah $$0, dcw $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.h()));
   }

   protected boolean a(eah $$0, ewn $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<czd> a(eah $$0, ezk.a $$1) {
      if (this.P.isEmpty()) {
         return Collections.emptyList();
      } else {
         ezk $$2 = $$1.a(fcb.g, $$0).a(fca.r);
         arq $$3 = $$2.a();
         ezm $$4 = $$3.p().bc().b(this.P.get());
         return $$4.a($$2);
      }
   }

   protected long a(eah $$0, iu $$1) {
      return azm.a($$1);
   }

   protected ffk d_(eah $$0) {
      return $$0.f(diq.a, iu.c);
   }

   protected ffk b_(eah $$0, dig $$1, iu $$2) {
      return this.b($$0, $$1, $$2, fev.a());
   }

   protected ffk a(eah $$0, dig $$1, iu $$2) {
      return ffh.a();
   }

   protected int i_(eah $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected buf b(eah $$0, dja $$1, iu $$2) {
      return null;
   }

   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return true;
   }

   protected float c(eah $$0, dig $$1, iu $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(eah $$0, dja $$1, iu $$2) {
      return 0;
   }

   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return ffh.b();
   }

   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.F ? $$0.f($$1, $$2) : ffh.a();
   }

   protected ffk a(eah $$0, dig $$1, iu $$2, bwf $$3) {
      return ffh.b();
   }

   protected boolean a_(eah $$0, dig $$1, iu $$2) {
      return dmf.a($$0.g($$1, $$2));
   }

   protected ffk c(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
   }

   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
   }

   protected float a(eah $$0, crc $$1, dig $$2, iu $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(eah $$0, arq $$1, iu $$2, czd $$3, boolean $$4) {
   }

   protected void a_(eah $$0, dja $$1, iu $$2, crc $$3) {
   }

   protected int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      return 0;
   }

   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
   }

   protected int b(eah $$0, dig $$1, iu $$2, ja $$3) {
      return 0;
   }

   public final Optional<alf<ezm>> u() {
      return this.P;
   }

   public final String v() {
      return this.Q;
   }

   protected void a(dja $$0, eah $$1, fem $$2, crx $$3) {
   }

   protected boolean e_(eah $$0) {
      return !dmf.a($$0.f(diq.a, iu.c)) && $$0.y().c();
   }

   protected boolean f(eah $$0) {
      return this.H;
   }

   protected duc h_(eah $$0) {
      return this.I;
   }

   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return new czd(this.h());
   }

   public abstract cyz h();

   protected abstract dmf o();

   public ews w() {
      return this.O.b.apply(this.o().m());
   }

   public float x() {
      return this.O.g;
   }

   public abstract static class a extends eaj<dmf, eah> {
      private static final ja[] a = ja.values();
      private static final ffk[] f = af.a(new ffk[a.length], $$0 -> Arrays.fill($$0, ffh.a()));
      private static final ffk[] g = af.a(new ffk[a.length], $$0 -> Arrays.fill($$0, ffh.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final ewt n;
      private final ews o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final eag.f s;
      private final eag.f t;
      private final eag.f u;
      private final eag.f v;
      private final eag.f w;
      @Nullable
      private final eag.b x;
      private final boolean y;
      private final ebi z;
      private final boolean A;
      @Nullable
      private eag.a.a B;
      private ewo C = ewp.a.g();
      private boolean D;
      private boolean E;
      private ffk F;
      private ffk[] G;
      private boolean H;
      private int I;

      protected a(dmf $$0, Reference2ObjectArrayMap<ebk<?>, Comparable<?>> $$1, MapCodec<eah> $$2) {
         super($$0, $$1, $$2);
         eag.d $$3 = $$0.O;
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
         if (this.d.O.u) {
            return true;
         } else if (this.d.O.t) {
            return false;
         } else if (this.B == null) {
            return false;
         } else {
            ffk $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               fel $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new eag.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : ffh.a();
         this.E = dmf.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new ffk[a.length];

            for (ja $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dmf b() {
         return this.d;
      }

      public je<dmf> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dmf $$0 = this.b();
         return $$0 != dmh.bz && $$0 != dmh.nE && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dig $$0, iu $$1, bwo<?> $$2) {
         return this.b().O.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public ffk a(ja $$0) {
         return this.G[$$0.ordinal()];
      }

      public ffk h() {
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

      public ews a(dig $$0, iu $$1) {
         return this.o;
      }

      public eah a(dsz $$0) {
         return this.b().a(this.B(), $$0);
      }

      public eah a(dri $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dss o() {
         return this.b().a_(this.B());
      }

      public boolean b(dig $$0, iu $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dig $$0, iu $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dig $$0, iu $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dig $$0, iu $$1, ja $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dja $$0, iu $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dig $$0, iu $$1) {
         return this.p;
      }

      public float a(crc $$0, dig $$1, iu $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dig $$0, iu $$1, ja $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public ewt r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(eah $$0, ja $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public ffk f(dig $$0, iu $$1) {
         return this.a($$0, $$1, fev.a());
      }

      public ffk a(dig $$0, iu $$1, fev $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public ffk g(dig $$0, iu $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, fev.a());
      }

      public ffk b(dig $$0, iu $$1, fev $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public ffk a(dig $$0, iu $$1, bwf $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public ffk h(dig $$0, iu $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public ffk c(dig $$0, iu $$1, fev $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public ffk i(dig $$0, iu $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean b(dig $$0, iu $$1, bwf $$2) {
         return this.a($$0, $$1, $$2, ja.b);
      }

      public final boolean a(dig $$0, iu $$1, bwf $$2, ja $$3) {
         return dmf.a(this.b($$0, $$1, fev.a($$2)), $$3);
      }

      public feq a(iu $$0) {
         eag.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : feq.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dja $$0, iu $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dja $$0, iu $$1, dmf $$2, @Nullable exw $$3, boolean $$4) {
         agm.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(djb $$0, iu $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(djb $$0, iu $$1, int $$2, int $$3) {
         iu.a $$4 = new iu.a();

         for (ja $$5 : eag.E) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(djb $$0, iu $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(djb $$0, iu $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dja $$0, iu $$1, eah $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arq $$0, iu $$1, boolean $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(arq $$0, iu $$1, dit $$2, BiConsumer<czd, iu> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arq $$0, iu $$1, azv $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(arq $$0, iu $$1, azv $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dja $$0, iu $$1, bwf $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(arq $$0, iu $$1, czd $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<czd> a(ezk.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bud a(czd $$0, dja $$1, crc $$2, buc $$3, fem $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bud a(dja $$0, crc $$1, fem $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dja $$0, iu $$1, crc $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dig $$0, iu $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dig $$0, iu $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public eah a(djd $$0, djp $$1, iu $$2, ja $$3, iu $$4, eah $$5, azv $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(exd $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(dcw $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(ewn $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(djd $$0, iu $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dig $$0, iu $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public buf b(dja $$0, iu $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axr<dmf> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axr<dmf> $$0, Predicate<eag.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ji<dmf> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(je<dmf> $$0) {
         return this.a($$0.a());
      }

      public Stream<axr<dmf>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof doz;
      }

      @Nullable
      public <T extends dxf> dxg<T> a(dja $$0, dxh<T> $$1) {
         return this.b() instanceof doz ? ((doz)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dmf $$0) {
         return this.b() == $$0;
      }

      public boolean a(alf<dmf> $$0) {
         return this.b().p().a($$0);
      }

      public ewo y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(iu $$0) {
         return this.b().a(this.B(), $$0);
      }

      public duc A() {
         return this.b().h_(this.B());
      }

      public void a(dja $$0, eah $$1, fem $$2, crx $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dig $$0, iu $$1, ja $$2) {
         return this.a($$0, $$1, $$2, duq.a);
      }

      public boolean a(dig $$0, iu $$1, ja $$2, duq $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dig $$0, iu $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      public czd a(djd $$0, iu $$1, boolean $$2) {
         return this.b().a($$0, $$1, this.B(), $$2);
      }

      protected abstract eah B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public ebi E() {
         return this.z;
      }

      static final class a {
         private static final ja[] d = ja.values();
         private static final int e = duq.values().length;
         protected final ffk a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(eah $$0) {
            dmf $$1 = $$0.b();
            this.a = $$1.b($$0, diq.a, iu.c, fev.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", mf.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(ja.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (ja $$2 : d) {
                  for (duq $$3 : duq.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, diq.a, iu.c, $$2);
                  }
               }

               this.c = dmf.a($$0.g(diq.a, iu.c));
            }
         }

         public boolean a(ja $$0, duq $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(ja $$0, duq $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      feq evaluate(eah var1, iu var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<eag.d> a = Codec.unit(() -> a());
      Function<eah, ews> b = $$0 -> ews.a;
      boolean c = true;
      duc d = duc.f;
      ToIntFunction<eah> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private alf<dmf> m;
      private aky<dmf, Optional<alf<ezm>>> n = $$0 -> Optional.of(alf.a(mg.bq, $$0.a().f("blocks/")));
      private aky<dmf, String> o = $$0 -> af.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      ewt v = ewt.a;
      boolean w = true;
      ebi x = ebi.a;
      boolean y;
      eag.e<bwo<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, ja.b) && $$0.k() < 14;
      eag.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      eag.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      eag.f C = this.B;
      eag.f D = ($$0, $$1, $$2) -> false;
      eag.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      cum G = cuo.g;
      @Nullable
      eag.b H;

      private d() {
      }

      public static eag.d a() {
         return new eag.d();
      }

      public static eag.d a(eag $$0) {
         eag.d $$1 = b($$0);
         eag.d $$2 = $$0.O;
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
      public static eag.d b(eag $$0) {
         eag.d $$1 = new eag.d();
         eag.d $$2 = $$0.O;
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

      public eag.d a(cyb $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public eag.d a(ews $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public eag.d a(Function<eah, ews> $$0) {
         this.b = $$0;
         return this;
      }

      public eag.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public eag.d c() {
         this.p = false;
         return this;
      }

      public eag.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public eag.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public eag.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public eag.d a(duc $$0) {
         this.d = $$0;
         return this;
      }

      public eag.d a(ToIntFunction<eah> $$0) {
         this.e = $$0;
         return this;
      }

      public eag.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public eag.d d() {
         return this.d(0.0F);
      }

      public eag.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public eag.d e() {
         this.i = true;
         return this;
      }

      public eag.d f() {
         this.F = true;
         return this;
      }

      public eag.d g() {
         this.n = aky.fixed(Optional.empty());
         return this;
      }

      public eag.d a(Optional<alf<ezm>> $$0) {
         this.n = aky.fixed($$0);
         return this;
      }

      protected Optional<alf<ezm>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public eag.d i() {
         this.r = true;
         return this;
      }

      public eag.d j() {
         this.s = true;
         return this;
      }

      public eag.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public eag.d l() {
         this.t = true;
         return this;
      }

      public eag.d a(ewt $$0) {
         this.v = $$0;
         return this;
      }

      public eag.d m() {
         this.q = true;
         return this;
      }

      public eag.d a(eag.e<bwo<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public eag.d a(eag.f $$0) {
         this.A = $$0;
         return this;
      }

      public eag.d b(eag.f $$0) {
         this.B = $$0;
         return this;
      }

      public eag.d c(eag.f $$0) {
         this.C = $$0;
         return this;
      }

      public eag.d d(eag.f $$0) {
         this.D = $$0;
         return this;
      }

      public eag.d e(eag.f $$0) {
         this.E = $$0;
         return this;
      }

      public eag.d n() {
         this.h = true;
         return this;
      }

      public eag.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public eag.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public eag.d a(eag.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dmf $$2 = $$0x.b();
            long $$3 = azm.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.ao_();
            double $$5 = azm.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azm.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new feq($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dmf $$2 = $$0x.b();
            long $$3 = azm.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.aq_();
            float $$5 = $$2.ao_();
            double $$6 = azm.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azm.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new feq($$6, $$4, $$7);
         };
         };
         return this;
      }

      public eag.d o() {
         this.w = false;
         return this;
      }

      public eag.d a(cuk... $$0) {
         this.G = cuo.e.a($$0);
         return this;
      }

      public eag.d a(ebi $$0) {
         this.x = $$0;
         return this;
      }

      public eag.d p() {
         this.y = true;
         return this;
      }

      public eag.d a(alf<dmf> $$0) {
         this.m = $$0;
         return this;
      }

      public eag.d a(String $$0) {
         this.o = aky.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(eah var1, dig var2, iu var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(eah var1, dig var2, iu var3);
   }
}
