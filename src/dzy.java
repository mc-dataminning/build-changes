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

public abstract class dzy implements cue {
   protected static final ja[] D = new ja[]{ja.e, ja.f, ja.c, ja.d, ja.a, ja.b};
   protected final boolean E;
   protected final float F;
   protected final boolean G;
   protected final dtv H;
   protected final float I;
   protected final float J;
   protected final float K;
   protected final boolean L;
   protected final cuh M;
   protected final dzy.d N;
   protected final Optional<alf<eze>> O;
   protected final String P;

   public dzy(dzy.d $$0) {
      this.E = $$0.c;
      this.O = $$0.h();
      this.P = $$0.q();
      this.F = $$0.f;
      this.G = $$0.i;
      this.H = $$0.d;
      this.I = $$0.j;
      this.J = $$0.k;
      this.K = $$0.l;
      this.L = $$0.F;
      this.M = $$0.G;
      this.N = $$0;
   }

   public dzy.d s() {
      return this.N;
   }

   protected abstract MapCodec<? extends dma> a();

   protected static <B extends dma> RecordCodecBuilder<B, dzy.d> t() {
      return dzy.d.a.fieldOf("properties").forGetter(dzy::s);
   }

   public static <B extends dma> MapCodec<B> b(Function<dzy.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dzz $$0, diw $$1, iu $$2, int $$3, int $$4) {
   }

   protected boolean a(dzz $$0, ewv $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(dil.a, iu.c);
         case b:
            return $$0.y().a(axh.a);
         case c:
            return !$$0.m(dil.a, iu.c);
         default:
            return false;
      }
   }

   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$0;
   }

   protected boolean b(dzz $$0, dzz $$1, ja $$2) {
      return false;
   }

   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
   }

   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
   }

   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
   }

   protected void a(dzz $$0, arq $$1, iu $$2, dio $$3, BiConsumer<cyy, iu> $$4) {
      if (!$$0.l() && $$3.b() != dio.a.d) {
         dma $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof cqy;
         if ($$5.a($$3)) {
            dwx $$7 = $$0.x() ? $$1.c_($$2) : null;
            ezc.a $$8 = new ezc.a($$1).a(fbt.f, fei.b($$2)).a(fbt.i, cyy.k).b(fbt.h, $$7).b(fbt.a, $$3.d());
            if ($$3.b() == dio.a.c) {
               $$8.a(fbt.j, $$3.e());
            }

            $$0.a($$1, $$2, cyy.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dmc.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      return bub.e;
   }

   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      return bub.f;
   }

   protected boolean a(dzz $$0, div $$1, iu $$2, int $$3, int $$4) {
      return false;
   }

   protected dsm a_(dzz $$0) {
      return dsm.b;
   }

   protected boolean g_(dzz $$0) {
      return false;
   }

   protected boolean f_(dzz $$0) {
      return false;
   }

   protected ewg b_(dzz $$0) {
      return ewh.a.g();
   }

   protected boolean c_(dzz $$0) {
      return false;
   }

   protected float an_() {
      return 0.25F;
   }

   protected float ap_() {
      return 0.2F;
   }

   @Override
   public cuh k() {
      return this.M;
   }

   protected dzz a(dzz $$0, dst $$1) {
      return $$0;
   }

   protected dzz a(dzz $$0, drc $$1) {
      return $$0;
   }

   protected boolean a(dzz $$0, dcr $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.h()));
   }

   protected boolean a(dzz $$0, ewf $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cyy> a(dzz $$0, ezc.a $$1) {
      if (this.O.isEmpty()) {
         return Collections.emptyList();
      } else {
         ezc $$2 = $$1.a(fbt.g, $$0).a(fbs.r);
         arq $$3 = $$2.a();
         eze $$4 = $$3.p().bc().b(this.O.get());
         return $$4.a($$2);
      }
   }

   protected long a(dzz $$0, iu $$1) {
      return azm.a($$1);
   }

   protected ffc d_(dzz $$0) {
      return $$0.f(dil.a, iu.c);
   }

   protected ffc b_(dzz $$0, dib $$1, iu $$2) {
      return this.b($$0, $$1, $$2, fen.a());
   }

   protected ffc a(dzz $$0, dib $$1, iu $$2) {
      return fez.a();
   }

   protected int i_(dzz $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bud b(dzz $$0, div $$1, iu $$2) {
      return null;
   }

   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return true;
   }

   protected float c(dzz $$0, dib $$1, iu $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dzz $$0, div $$1, iu $$2) {
      return 0;
   }

   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return fez.b();
   }

   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.E ? $$0.f($$1, $$2) : fez.a();
   }

   protected ffc a(dzz $$0, dib $$1, iu $$2, bwd $$3) {
      return fez.b();
   }

   protected boolean a_(dzz $$0, dib $$1, iu $$2) {
      return dma.a($$0.g($$1, $$2));
   }

   protected ffc c(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
   }

   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
   }

   protected float a(dzz $$0, cqy $$1, dib $$2, iu $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dzz $$0, arq $$1, iu $$2, cyy $$3, boolean $$4) {
   }

   protected void a_(dzz $$0, div $$1, iu $$2, cqy $$3) {
   }

   protected int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return 0;
   }

   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
   }

   protected int b(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return 0;
   }

   public final Optional<alf<eze>> u() {
      return this.O;
   }

   public final String v() {
      return this.P;
   }

   protected void a(div $$0, dzz $$1, fee $$2, crs $$3) {
   }

   protected boolean e_(dzz $$0) {
      return !dma.a($$0.f(dil.a, iu.c)) && $$0.y().c();
   }

   protected boolean f(dzz $$0) {
      return this.G;
   }

   protected dtv h_(dzz $$0) {
      return this.H;
   }

   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return new cyy(this.h());
   }

   public abstract cyu h();

   protected abstract dma o();

   public ewk w() {
      return this.N.b.apply(this.o().m());
   }

   public float x() {
      return this.N.g;
   }

   public abstract static class a extends eab<dma, dzz> {
      private static final ja[] a = ja.values();
      private static final ffc[] f = af.a(new ffc[a.length], $$0 -> Arrays.fill($$0, fez.a()));
      private static final ffc[] g = af.a(new ffc[a.length], $$0 -> Arrays.fill($$0, fez.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final ewl n;
      private final ewk o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dzy.f s;
      private final dzy.f t;
      private final dzy.f u;
      private final dzy.f v;
      private final dzy.f w;
      @Nullable
      private final dzy.b x;
      private final boolean y;
      private final eba z;
      private final boolean A;
      @Nullable
      private dzy.a.a B;
      private ewg C = ewh.a.g();
      private boolean D;
      private boolean E;
      private ffc F;
      private ffc[] G;
      private boolean H;
      private int I;

      protected a(dma $$0, Reference2ObjectArrayMap<ebc<?>, Comparable<?>> $$1, MapCodec<dzz> $$2) {
         super($$0, $$1, $$2);
         dzy.d $$3 = $$0.N;
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
         if (this.d.N.u) {
            return true;
         } else if (this.d.N.t) {
            return false;
         } else if (this.B == null) {
            return false;
         } else {
            ffc $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               fed $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new dzy.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fez.a();
         this.E = dma.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new ffc[a.length];

            for (ja $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dma b() {
         return this.d;
      }

      public je<dma> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dma $$0 = this.b();
         return $$0 != dmc.bz && $$0 != dmc.nB && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dib $$0, iu $$1, bwm<?> $$2) {
         return this.b().N.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public ffc a(ja $$0) {
         return this.G[$$0.ordinal()];
      }

      public ffc h() {
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

      public ewk a(dib $$0, iu $$1) {
         return this.o;
      }

      public dzz a(dst $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dzz a(drc $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dsm o() {
         return this.b().a_(this.B());
      }

      public boolean b(dib $$0, iu $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dib $$0, iu $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dib $$0, iu $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dib $$0, iu $$1, ja $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(div $$0, iu $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dib $$0, iu $$1) {
         return this.p;
      }

      public float a(cqy $$0, dib $$1, iu $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dib $$0, iu $$1, ja $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public ewl r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dzz $$0, ja $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public ffc f(dib $$0, iu $$1) {
         return this.a($$0, $$1, fen.a());
      }

      public ffc a(dib $$0, iu $$1, fen $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public ffc g(dib $$0, iu $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, fen.a());
      }

      public ffc b(dib $$0, iu $$1, fen $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public ffc a(dib $$0, iu $$1, bwd $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public ffc h(dib $$0, iu $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public ffc c(dib $$0, iu $$1, fen $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public ffc i(dib $$0, iu $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean b(dib $$0, iu $$1, bwd $$2) {
         return this.a($$0, $$1, $$2, ja.b);
      }

      public final boolean a(dib $$0, iu $$1, bwd $$2, ja $$3) {
         return dma.a(this.b($$0, $$1, fen.a($$2)), $$3);
      }

      public fei a(iu $$0) {
         dzy.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : fei.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(div $$0, iu $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(div $$0, iu $$1, dma $$2, @Nullable exo $$3, boolean $$4) {
         agm.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(diw $$0, iu $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(diw $$0, iu $$1, int $$2, int $$3) {
         iu.a $$4 = new iu.a();

         for (ja $$5 : dzy.D) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(diw $$0, iu $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(diw $$0, iu $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(div $$0, iu $$1, dzz $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arq $$0, iu $$1, boolean $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(arq $$0, iu $$1, dio $$2, BiConsumer<cyy, iu> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arq $$0, iu $$1, azv $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(arq $$0, iu $$1, azv $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(div $$0, iu $$1, bwd $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(arq $$0, iu $$1, cyy $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cyy> a(ezc.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bub a(cyy $$0, div $$1, cqy $$2, bua $$3, fee $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bub a(div $$0, cqy $$1, fee $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(div $$0, iu $$1, cqy $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dib $$0, iu $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dib $$0, iu $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dzz a(diy $$0, djk $$1, iu $$2, ja $$3, iu $$4, dzz $$5, azv $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(ewv $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(dcr $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(ewf $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(diy $$0, iu $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dib $$0, iu $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bud b(div $$0, iu $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axr<dma> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axr<dma> $$0, Predicate<dzy.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ji<dma> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(je<dma> $$0) {
         return this.a($$0.a());
      }

      public Stream<axr<dma>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dot;
      }

      @Nullable
      public <T extends dwx> dwy<T> a(div $$0, dwz<T> $$1) {
         return this.b() instanceof dot ? ((dot)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dma $$0) {
         return this.b() == $$0;
      }

      public boolean a(alf<dma> $$0) {
         return this.b().p().a($$0);
      }

      public ewg y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(iu $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dtv A() {
         return this.b().h_(this.B());
      }

      public void a(div $$0, dzz $$1, fee $$2, crs $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dib $$0, iu $$1, ja $$2) {
         return this.a($$0, $$1, $$2, duj.a);
      }

      public boolean a(dib $$0, iu $$1, ja $$2, duj $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dib $$0, iu $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      public cyy a(diy $$0, iu $$1, boolean $$2) {
         return this.b().a($$0, $$1, this.B(), $$2);
      }

      protected abstract dzz B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public eba E() {
         return this.z;
      }

      static final class a {
         private static final ja[] d = ja.values();
         private static final int e = duj.values().length;
         protected final ffc a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dzz $$0) {
            dma $$1 = $$0.b();
            this.a = $$1.b($$0, dil.a, iu.c, fen.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", mf.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(ja.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (ja $$2 : d) {
                  for (duj $$3 : duj.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, dil.a, iu.c, $$2);
                  }
               }

               this.c = dma.a($$0.g(dil.a, iu.c));
            }
         }

         public boolean a(ja $$0, duj $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(ja $$0, duj $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      fei evaluate(dzz var1, iu var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dzy.d> a = Codec.unit(() -> a());
      Function<dzz, ewk> b = $$0 -> ewk.a;
      boolean c = true;
      dtv d = dtv.f;
      ToIntFunction<dzz> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private alf<dma> m;
      private aky<dma, Optional<alf<eze>>> n = $$0 -> Optional.of(alf.a(mg.bp, $$0.a().f("blocks/")));
      private aky<dma, String> o = $$0 -> af.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      ewl v = ewl.a;
      boolean w = true;
      eba x = eba.a;
      boolean y;
      dzy.e<bwm<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, ja.b) && $$0.k() < 14;
      dzy.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dzy.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dzy.f C = this.B;
      dzy.f D = ($$0, $$1, $$2) -> false;
      dzy.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      cuh G = cuj.g;
      @Nullable
      dzy.b H;

      private d() {
      }

      public static dzy.d a() {
         return new dzy.d();
      }

      public static dzy.d a(dzy $$0) {
         dzy.d $$1 = b($$0);
         dzy.d $$2 = $$0.N;
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
      public static dzy.d b(dzy $$0) {
         dzy.d $$1 = new dzy.d();
         dzy.d $$2 = $$0.N;
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

      public dzy.d a(cxw $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dzy.d a(ewk $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dzy.d a(Function<dzz, ewk> $$0) {
         this.b = $$0;
         return this;
      }

      public dzy.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dzy.d c() {
         this.p = false;
         return this;
      }

      public dzy.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dzy.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dzy.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dzy.d a(dtv $$0) {
         this.d = $$0;
         return this;
      }

      public dzy.d a(ToIntFunction<dzz> $$0) {
         this.e = $$0;
         return this;
      }

      public dzy.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dzy.d d() {
         return this.d(0.0F);
      }

      public dzy.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dzy.d e() {
         this.i = true;
         return this;
      }

      public dzy.d f() {
         this.F = true;
         return this;
      }

      public dzy.d g() {
         this.n = aky.fixed(Optional.empty());
         return this;
      }

      public dzy.d a(Optional<alf<eze>> $$0) {
         this.n = aky.fixed($$0);
         return this;
      }

      protected Optional<alf<eze>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dzy.d i() {
         this.r = true;
         return this;
      }

      public dzy.d j() {
         this.s = true;
         return this;
      }

      public dzy.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dzy.d l() {
         this.t = true;
         return this;
      }

      public dzy.d a(ewl $$0) {
         this.v = $$0;
         return this;
      }

      public dzy.d m() {
         this.q = true;
         return this;
      }

      public dzy.d a(dzy.e<bwm<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dzy.d a(dzy.f $$0) {
         this.A = $$0;
         return this;
      }

      public dzy.d b(dzy.f $$0) {
         this.B = $$0;
         return this;
      }

      public dzy.d c(dzy.f $$0) {
         this.C = $$0;
         return this;
      }

      public dzy.d d(dzy.f $$0) {
         this.D = $$0;
         return this;
      }

      public dzy.d e(dzy.f $$0) {
         this.E = $$0;
         return this;
      }

      public dzy.d n() {
         this.h = true;
         return this;
      }

      public dzy.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dzy.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dzy.d a(dzy.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dma $$2 = $$0x.b();
            long $$3 = azm.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.an_();
            double $$5 = azm.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azm.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new fei($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dma $$2 = $$0x.b();
            long $$3 = azm.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.ap_();
            float $$5 = $$2.an_();
            double $$6 = azm.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azm.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new fei($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dzy.d o() {
         this.w = false;
         return this;
      }

      public dzy.d a(cuf... $$0) {
         this.G = cuj.e.a($$0);
         return this;
      }

      public dzy.d a(eba $$0) {
         this.x = $$0;
         return this;
      }

      public dzy.d p() {
         this.y = true;
         return this;
      }

      public dzy.d a(alf<dma> $$0) {
         this.m = $$0;
         return this;
      }

      public dzy.d a(String $$0) {
         this.o = aky.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dzz var1, dib var2, iu var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dzz var1, dib var2, iu var3);
   }
}
