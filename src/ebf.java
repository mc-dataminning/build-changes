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

public abstract class ebf implements cvg {
   protected static final jc[] E = new jc[]{jc.e, jc.f, jc.c, jc.d, jc.a, jc.b};
   protected final boolean F;
   protected final float G;
   protected final boolean H;
   protected final dvb I;
   protected final float J;
   protected final float K;
   protected final float L;
   protected final boolean M;
   protected final cvj N;
   protected final ebf.d O;
   protected final Optional<alj<fao>> P;
   protected final String Q;

   public ebf(ebf.d $$0) {
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

   public ebf.d s() {
      return this.O;
   }

   protected abstract MapCodec<? extends dne> a();

   protected static <B extends dne> RecordCodecBuilder<B, ebf.d> t() {
      return ebf.d.a.fieldOf("properties").forGetter(ebf::s);
   }

   public static <B extends dne> MapCodec<B> b(Function<ebf.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(ebg $$0, dka $$1, iw $$2, int $$3, int $$4) {
   }

   protected boolean a(ebg $$0, eyf $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(djp.a, iw.c);
         case b:
            return $$0.y().a(axl.a);
         case c:
            return !$$0.m(djp.a, iw.c);
         default:
            return false;
      }
   }

   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$0;
   }

   protected boolean b(ebg $$0, ebg $$1, jc $$2) {
      return false;
   }

   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
   }

   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
   }

   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
   }

   protected void a(ebg $$0, aru $$1, iw $$2, djs $$3, BiConsumer<daa, iw> $$4) {
      if (!$$0.l() && $$3.b() != djs.a.d) {
         dne $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof crz;
         if ($$5.a($$3)) {
            dye $$7 = $$0.x() ? $$1.c_($$2) : null;
            fam.a $$8 = new fam.a($$1).a(fdd.f, ffs.b($$2)).a(fdd.i, daa.k).b(fdd.h, $$7).b(fdd.a, $$3.d());
            if ($$3.b() == djs.a.c) {
               $$8.a(fdd.j, $$3.e());
            }

            $$0.a($$1, $$2, daa.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dng.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      return but.e;
   }

   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      return but.f;
   }

   protected boolean a(ebg $$0, djz $$1, iw $$2, int $$3, int $$4) {
      return false;
   }

   protected dtr a_(ebg $$0) {
      return dtr.b;
   }

   protected boolean g_(ebg $$0) {
      return false;
   }

   protected boolean f_(ebg $$0) {
      return false;
   }

   protected exq b_(ebg $$0) {
      return exr.a.g();
   }

   protected boolean c_(ebg $$0) {
      return false;
   }

   protected float as_() {
      return 0.25F;
   }

   protected float au_() {
      return 0.2F;
   }

   @Override
   public cvj k() {
      return this.N;
   }

   protected ebg a(ebg $$0, dty $$1) {
      return $$0;
   }

   protected ebg a(ebg $$0, dsh $$1) {
      return $$0;
   }

   protected boolean a(ebg $$0, ddt $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.h()));
   }

   protected boolean a(ebg $$0, exp $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<daa> a(ebg $$0, fam.a $$1) {
      if (this.P.isEmpty()) {
         return Collections.emptyList();
      } else {
         fam $$2 = $$1.a(fdd.g, $$0).a(fdc.r);
         aru $$3 = $$2.a();
         fao $$4 = $$3.p().bc().b(this.P.get());
         return $$4.a($$2);
      }
   }

   protected long a(ebg $$0, iw $$1) {
      return azq.a($$1);
   }

   protected fgm d_(ebg $$0) {
      return $$0.f(djp.a, iw.c);
   }

   protected fgm b_(ebg $$0, djd $$1, iw $$2) {
      return this.b($$0, $$1, $$2, ffx.a());
   }

   protected fgm a(ebg $$0, djd $$1, iw $$2) {
      return fgj.a();
   }

   protected int i_(ebg $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected buv b(ebg $$0, djz $$1, iw $$2) {
      return null;
   }

   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return true;
   }

   protected float c(ebg $$0, djd $$1, iw $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(ebg $$0, djz $$1, iw $$2) {
      return 0;
   }

   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return fgj.b();
   }

   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.F ? $$0.f($$1, $$2) : fgj.a();
   }

   protected fgm a(ebg $$0, djd $$1, iw $$2, bwv $$3) {
      return fgj.b();
   }

   protected boolean a_(ebg $$0, djd $$1, iw $$2) {
      return dne.a($$0.g($$1, $$2));
   }

   protected fgm c(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
   }

   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
   }

   protected float a(ebg $$0, crz $$1, djd $$2, iw $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(ebg $$0, aru $$1, iw $$2, daa $$3, boolean $$4) {
   }

   protected void a_(ebg $$0, djz $$1, iw $$2, crz $$3) {
   }

   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return 0;
   }

   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
   }

   protected int b(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return 0;
   }

   public final Optional<alj<fao>> u() {
      return this.P;
   }

   public final String v() {
      return this.Q;
   }

   protected void a(djz $$0, ebg $$1, ffo $$2, csu $$3) {
   }

   protected boolean e_(ebg $$0) {
      return !dne.a($$0.f(djp.a, iw.c)) && $$0.y().c();
   }

   protected boolean f(ebg $$0) {
      return this.H;
   }

   protected dvb h_(ebg $$0) {
      return this.I;
   }

   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return new daa(this.h());
   }

   public abstract czw h();

   protected abstract dne o();

   public exu w() {
      return this.O.b.apply(this.o().m());
   }

   public float x() {
      return this.O.g;
   }

   public abstract static class a extends ebi<dne, ebg> {
      private static final jc[] a = jc.values();
      private static final fgm[] f = ag.a(new fgm[a.length], $$0 -> Arrays.fill($$0, fgj.a()));
      private static final fgm[] g = ag.a(new fgm[a.length], $$0 -> Arrays.fill($$0, fgj.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final exv n;
      private final exu o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final ebf.f s;
      private final ebf.f t;
      private final ebf.f u;
      private final ebf.f v;
      private final ebf.f w;
      @Nullable
      private final ebf.b x;
      private final boolean y;
      private final ech z;
      private final boolean A;
      @Nullable
      private ebf.a.a B;
      private exq C = exr.a.g();
      private boolean D;
      private boolean E;
      private fgm F;
      private fgm[] G;
      private boolean H;
      private int I;

      protected a(dne $$0, Reference2ObjectArrayMap<ecj<?>, Comparable<?>> $$1, MapCodec<ebg> $$2) {
         super($$0, $$1, $$2);
         ebf.d $$3 = $$0.O;
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
            fgm $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               ffn $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new ebf.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fgj.a();
         this.E = dne.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fgm[a.length];

            for (jc $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dne b() {
         return this.d;
      }

      public jg<dne> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dne $$0 = this.b();
         return $$0 != dng.bz && $$0 != dng.nE && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(djd $$0, iw $$1, bxe<?> $$2) {
         return this.b().O.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fgm a(jc $$0) {
         return this.G[$$0.ordinal()];
      }

      public fgm h() {
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

      public exu a(djd $$0, iw $$1) {
         return this.o;
      }

      public ebg a(dty $$0) {
         return this.b().a(this.B(), $$0);
      }

      public ebg a(dsh $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dtr o() {
         return this.b().a_(this.B());
      }

      public boolean b(djd $$0, iw $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(djd $$0, iw $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(djd $$0, iw $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(djd $$0, iw $$1, jc $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(djz $$0, iw $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(djd $$0, iw $$1) {
         return this.p;
      }

      public float a(crz $$0, djd $$1, iw $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(djd $$0, iw $$1, jc $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public exv r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(ebg $$0, jc $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fgm f(djd $$0, iw $$1) {
         return this.a($$0, $$1, ffx.a());
      }

      public fgm a(djd $$0, iw $$1, ffx $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fgm g(djd $$0, iw $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, ffx.a());
      }

      public fgm b(djd $$0, iw $$1, ffx $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fgm a(djd $$0, iw $$1, bwv $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fgm h(djd $$0, iw $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fgm c(djd $$0, iw $$1, ffx $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fgm i(djd $$0, iw $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean b(djd $$0, iw $$1, bwv $$2) {
         return this.a($$0, $$1, $$2, jc.b);
      }

      public final boolean a(djd $$0, iw $$1, bwv $$2, jc $$3) {
         return dne.a(this.b($$0, $$1, ffx.a($$2)), $$3);
      }

      public ffs a(iw $$0) {
         ebf.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : ffs.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(djz $$0, iw $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(djz $$0, iw $$1, dne $$2, @Nullable eyy $$3, boolean $$4) {
         agq.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dka $$0, iw $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dka $$0, iw $$1, int $$2, int $$3) {
         iw.a $$4 = new iw.a();

         for (jc $$5 : ebf.E) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dka $$0, iw $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dka $$0, iw $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(djz $$0, iw $$1, ebg $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(aru $$0, iw $$1, boolean $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(aru $$0, iw $$1, djs $$2, BiConsumer<daa, iw> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(aru $$0, iw $$1, azz $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(aru $$0, iw $$1, azz $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(djz $$0, iw $$1, bwv $$2, bxo $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(aru $$0, iw $$1, daa $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<daa> a(fam.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public but a(daa $$0, djz $$1, crz $$2, bus $$3, ffo $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public but a(djz $$0, crz $$1, ffo $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(djz $$0, iw $$1, crz $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(djd $$0, iw $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(djd $$0, iw $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public ebg a(dkc $$0, dko $$1, iw $$2, jc $$3, iw $$4, ebg $$5, azz $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(eyf $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(ddt $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(exp $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dkc $$0, iw $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(djd $$0, iw $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public buv b(djz $$0, iw $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axv<dne> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axv<dne> $$0, Predicate<ebf.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jk<dne> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jg<dne> $$0) {
         return this.a($$0.a());
      }

      public Stream<axv<dne>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dpy;
      }

      @Nullable
      public <T extends dye> dyf<T> a(djz $$0, dyg<T> $$1) {
         return this.b() instanceof dpy ? ((dpy)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dne $$0) {
         return this.b() == $$0;
      }

      public boolean a(alj<dne> $$0) {
         return this.b().p().a($$0);
      }

      public exq y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(iw $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dvb A() {
         return this.b().h_(this.B());
      }

      public void a(djz $$0, ebg $$1, ffo $$2, csu $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(djd $$0, iw $$1, jc $$2) {
         return this.a($$0, $$1, $$2, dvp.a);
      }

      public boolean a(djd $$0, iw $$1, jc $$2, dvp $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(djd $$0, iw $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      public daa a(dkc $$0, iw $$1, boolean $$2) {
         return this.b().a($$0, $$1, this.B(), $$2);
      }

      protected abstract ebg B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public ech E() {
         return this.z;
      }

      static final class a {
         private static final jc[] d = jc.values();
         private static final int e = dvp.values().length;
         protected final fgm a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(ebg $$0) {
            dne $$1 = $$0.b();
            this.a = $$1.b($$0, djp.a, iw.c, ffx.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", mh.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jc.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jc $$2 : d) {
                  for (dvp $$3 : dvp.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, djp.a, iw.c, $$2);
                  }
               }

               this.c = dne.a($$0.g(djp.a, iw.c));
            }
         }

         public boolean a(jc $$0, dvp $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jc $$0, dvp $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      ffs evaluate(ebg var1, iw var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<ebf.d> a = Codec.unit(() -> a());
      Function<ebg, exu> b = $$0 -> exu.a;
      boolean c = true;
      dvb d = dvb.f;
      ToIntFunction<ebg> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private alj<dne> m;
      private alc<dne, Optional<alj<fao>>> n = $$0 -> Optional.of(alj.a(mi.br, $$0.a().f("blocks/")));
      private alc<dne, String> o = $$0 -> ag.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      exv v = exv.a;
      boolean w = true;
      ech x = ech.a;
      boolean y;
      ebf.e<bxe<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jc.b) && $$0.k() < 14;
      ebf.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      ebf.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      ebf.f C = this.B;
      ebf.f D = ($$0, $$1, $$2) -> false;
      ebf.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      cvj G = cvl.g;
      @Nullable
      ebf.b H;

      private d() {
      }

      public static ebf.d a() {
         return new ebf.d();
      }

      public static ebf.d a(ebf $$0) {
         ebf.d $$1 = b($$0);
         ebf.d $$2 = $$0.O;
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
      public static ebf.d b(ebf $$0) {
         ebf.d $$1 = new ebf.d();
         ebf.d $$2 = $$0.O;
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

      public ebf.d a(cyy $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public ebf.d a(exu $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public ebf.d a(Function<ebg, exu> $$0) {
         this.b = $$0;
         return this;
      }

      public ebf.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public ebf.d c() {
         this.p = false;
         return this;
      }

      public ebf.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public ebf.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public ebf.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public ebf.d a(dvb $$0) {
         this.d = $$0;
         return this;
      }

      public ebf.d a(ToIntFunction<ebg> $$0) {
         this.e = $$0;
         return this;
      }

      public ebf.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public ebf.d d() {
         return this.d(0.0F);
      }

      public ebf.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public ebf.d e() {
         this.i = true;
         return this;
      }

      public ebf.d f() {
         this.F = true;
         return this;
      }

      public ebf.d g() {
         this.n = alc.fixed(Optional.empty());
         return this;
      }

      public ebf.d a(Optional<alj<fao>> $$0) {
         this.n = alc.fixed($$0);
         return this;
      }

      protected Optional<alj<fao>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public ebf.d i() {
         this.r = true;
         return this;
      }

      public ebf.d j() {
         this.s = true;
         return this;
      }

      public ebf.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public ebf.d l() {
         this.t = true;
         return this;
      }

      public ebf.d a(exv $$0) {
         this.v = $$0;
         return this;
      }

      public ebf.d m() {
         this.q = true;
         return this;
      }

      public ebf.d a(ebf.e<bxe<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public ebf.d a(ebf.f $$0) {
         this.A = $$0;
         return this;
      }

      public ebf.d b(ebf.f $$0) {
         this.B = $$0;
         return this;
      }

      public ebf.d c(ebf.f $$0) {
         this.C = $$0;
         return this;
      }

      public ebf.d d(ebf.f $$0) {
         this.D = $$0;
         return this;
      }

      public ebf.d e(ebf.f $$0) {
         this.E = $$0;
         return this;
      }

      public ebf.d n() {
         this.h = true;
         return this;
      }

      public ebf.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public ebf.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public ebf.d a(ebf.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dne $$2 = $$0x.b();
            long $$3 = azq.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.as_();
            double $$5 = azq.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azq.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new ffs($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dne $$2 = $$0x.b();
            long $$3 = azq.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.au_();
            float $$5 = $$2.as_();
            double $$6 = azq.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azq.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new ffs($$6, $$4, $$7);
         };
         };
         return this;
      }

      public ebf.d o() {
         this.w = false;
         return this;
      }

      public ebf.d a(cvh... $$0) {
         this.G = cvl.e.a($$0);
         return this;
      }

      public ebf.d a(ech $$0) {
         this.x = $$0;
         return this;
      }

      public ebf.d p() {
         this.y = true;
         return this;
      }

      public ebf.d a(alj<dne> $$0) {
         this.m = $$0;
         return this;
      }

      public ebf.d a(String $$0) {
         this.o = alc.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(ebg var1, djd var2, iw var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(ebg var1, djd var2, iw var3);
   }
}
