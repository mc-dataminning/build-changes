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

public abstract class ebp implements cvp {
   protected static final jc[] E = new jc[]{jc.e, jc.f, jc.c, jc.d, jc.a, jc.b};
   protected final boolean F;
   protected final float G;
   protected final boolean H;
   protected final dvl I;
   protected final float J;
   protected final float K;
   protected final float L;
   protected final boolean M;
   protected final cvs N;
   protected final ebp.d O;
   protected final Optional<alq<fay>> P;
   protected final String Q;

   public ebp(ebp.d $$0) {
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

   public ebp.d s() {
      return this.O;
   }

   protected abstract MapCodec<? extends dno> a();

   protected static <B extends dno> RecordCodecBuilder<B, ebp.d> t() {
      return ebp.d.a.fieldOf("properties").forGetter(ebp::s);
   }

   public static <B extends dno> MapCodec<B> b(Function<ebp.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(ebq $$0, dkk $$1, iw $$2, int $$3, int $$4) {
   }

   protected boolean a(ebq $$0, eyp $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(djz.a, iw.c);
         case b:
            return $$0.y().a(axs.a);
         case c:
            return !$$0.m(djz.a, iw.c);
         default:
            return false;
      }
   }

   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$0;
   }

   protected boolean b(ebq $$0, ebq $$1, jc $$2) {
      return false;
   }

   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
   }

   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
   }

   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
   }

   protected void a(ebq $$0, asb $$1, iw $$2, dkc $$3, BiConsumer<dak, iw> $$4) {
      if (!$$0.l() && $$3.b() != dkc.a.d) {
         dno $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof csi;
         if ($$5.a($$3)) {
            dyo $$7 = $$0.x() ? $$1.c_($$2) : null;
            faw.a $$8 = new faw.a($$1).a(fdn.f, fgc.b($$2)).a(fdn.i, dak.l).b(fdn.h, $$7).b(fdn.a, $$3.d());
            if ($$3.b() == dkc.a.c) {
               $$8.a(fdn.j, $$3.e());
            }

            $$0.a($$1, $$2, dak.l, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dnq.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      return bvc.e;
   }

   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      return bvc.f;
   }

   protected boolean a(ebq $$0, dkj $$1, iw $$2, int $$3, int $$4) {
      return false;
   }

   protected dub a_(ebq $$0) {
      return dub.b;
   }

   protected boolean g_(ebq $$0) {
      return false;
   }

   protected boolean f_(ebq $$0) {
      return false;
   }

   protected eya b_(ebq $$0) {
      return eyb.a.g();
   }

   protected boolean c_(ebq $$0) {
      return false;
   }

   protected float ao_() {
      return 0.25F;
   }

   protected float aq_() {
      return 0.2F;
   }

   @Override
   public cvs k() {
      return this.N;
   }

   protected ebq a(ebq $$0, dui $$1) {
      return $$0;
   }

   protected ebq a(ebq $$0, dsr $$1) {
      return $$0;
   }

   protected boolean a(ebq $$0, ded $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.h()));
   }

   protected boolean a(ebq $$0, exz $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<dak> a(ebq $$0, faw.a $$1) {
      if (this.P.isEmpty()) {
         return Collections.emptyList();
      } else {
         faw $$2 = $$1.a(fdn.g, $$0).a(fdm.r);
         asb $$3 = $$2.a();
         fay $$4 = $$3.p().bc().b(this.P.get());
         return $$4.a($$2);
      }
   }

   protected long a(ebq $$0, iw $$1) {
      return azz.a($$1);
   }

   protected fgw d_(ebq $$0) {
      return $$0.f(djz.a, iw.c);
   }

   protected fgw b_(ebq $$0, djn $$1, iw $$2) {
      return this.b($$0, $$1, $$2, fgh.a());
   }

   protected fgw a(ebq $$0, djn $$1, iw $$2) {
      return fgt.a();
   }

   protected int i_(ebq $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bve b(ebq $$0, dkj $$1, iw $$2) {
      return null;
   }

   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return true;
   }

   protected float c(ebq $$0, djn $$1, iw $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return 0;
   }

   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return fgt.b();
   }

   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.F ? $$0.f($$1, $$2) : fgt.a();
   }

   protected fgw a(ebq $$0, djn $$1, iw $$2, bxe $$3) {
      return fgt.b();
   }

   protected boolean a_(ebq $$0, djn $$1, iw $$2) {
      return dno.a($$0.g($$1, $$2));
   }

   protected fgw c(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
   }

   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
   }

   protected float a(ebq $$0, csi $$1, djn $$2, iw $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(ebq $$0, asb $$1, iw $$2, dak $$3, boolean $$4) {
   }

   protected void a_(ebq $$0, dkj $$1, iw $$2, csi $$3) {
   }

   protected int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return 0;
   }

   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
   }

   protected int b(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return 0;
   }

   public final Optional<alq<fay>> u() {
      return this.P;
   }

   public final String v() {
      return this.Q;
   }

   protected void a(dkj $$0, ebq $$1, ffy $$2, ctd $$3) {
   }

   protected boolean e_(ebq $$0) {
      return !dno.a($$0.f(djz.a, iw.c)) && $$0.y().c();
   }

   protected boolean f(ebq $$0) {
      return this.H;
   }

   protected dvl h_(ebq $$0) {
      return this.I;
   }

   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return new dak(this.h());
   }

   public abstract dag h();

   protected abstract dno o();

   public eye w() {
      return this.O.b.apply(this.o().m());
   }

   public float x() {
      return this.O.g;
   }

   public abstract static class a extends ebs<dno, ebq> {
      private static final jc[] a = jc.values();
      private static final fgw[] f = ag.a(new fgw[a.length], $$0 -> Arrays.fill($$0, fgt.a()));
      private static final fgw[] g = ag.a(new fgw[a.length], $$0 -> Arrays.fill($$0, fgt.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final eyf n;
      private final eye o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final ebp.f s;
      private final ebp.f t;
      private final ebp.f u;
      private final ebp.f v;
      private final ebp.f w;
      @Nullable
      private final ebp.b x;
      private final boolean y;
      private final ecr z;
      private final boolean A;
      @Nullable
      private ebp.a.a B;
      private eya C = eyb.a.g();
      private boolean D;
      private boolean E;
      private fgw F;
      private fgw[] G;
      private boolean H;
      private int I;

      protected a(dno $$0, Reference2ObjectArrayMap<ect<?>, Comparable<?>> $$1, MapCodec<ebq> $$2) {
         super($$0, $$1, $$2);
         ebp.d $$3 = $$0.O;
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
            fgw $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               ffx $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new ebp.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fgt.a();
         this.E = dno.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fgw[a.length];

            for (jc $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dno b() {
         return this.d;
      }

      public jg<dno> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dno $$0 = this.b();
         return $$0 != dnq.bz && $$0 != dnq.nE && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(djn $$0, iw $$1, bxn<?> $$2) {
         return this.b().O.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fgw a(jc $$0) {
         return this.G[$$0.ordinal()];
      }

      public fgw h() {
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

      public eye a(djn $$0, iw $$1) {
         return this.o;
      }

      public ebq a(dui $$0) {
         return this.b().a(this.B(), $$0);
      }

      public ebq a(dsr $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dub o() {
         return this.b().a_(this.B());
      }

      public boolean b(djn $$0, iw $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(djn $$0, iw $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(djn $$0, iw $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(djn $$0, iw $$1, jc $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dkj $$0, iw $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(djn $$0, iw $$1) {
         return this.p;
      }

      public float a(csi $$0, djn $$1, iw $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(djn $$0, iw $$1, jc $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public eyf r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(ebq $$0, jc $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fgw f(djn $$0, iw $$1) {
         return this.a($$0, $$1, fgh.a());
      }

      public fgw a(djn $$0, iw $$1, fgh $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fgw g(djn $$0, iw $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, fgh.a());
      }

      public fgw b(djn $$0, iw $$1, fgh $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fgw a(djn $$0, iw $$1, bxe $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fgw h(djn $$0, iw $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fgw c(djn $$0, iw $$1, fgh $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fgw i(djn $$0, iw $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean b(djn $$0, iw $$1, bxe $$2) {
         return this.a($$0, $$1, $$2, jc.b);
      }

      public final boolean a(djn $$0, iw $$1, bxe $$2, jc $$3) {
         return dno.a(this.b($$0, $$1, fgh.a($$2)), $$3);
      }

      public fgc a(iw $$0) {
         ebp.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : fgc.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dkj $$0, iw $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dkj $$0, iw $$1, dno $$2, @Nullable ezi $$3, boolean $$4) {
         agx.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dkk $$0, iw $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dkk $$0, iw $$1, int $$2, int $$3) {
         iw.a $$4 = new iw.a();

         for (jc $$5 : ebp.E) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dkk $$0, iw $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dkk $$0, iw $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dkj $$0, iw $$1, ebq $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(asb $$0, iw $$1, boolean $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(asb $$0, iw $$1, dkc $$2, BiConsumer<dak, iw> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(asb $$0, iw $$1, bai $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(asb $$0, iw $$1, bai $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dkj $$0, iw $$1, bxe $$2, bxx $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(asb $$0, iw $$1, dak $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<dak> a(faw.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bvc a(dak $$0, dkj $$1, csi $$2, bvb $$3, ffy $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bvc a(dkj $$0, csi $$1, ffy $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dkj $$0, iw $$1, csi $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(djn $$0, iw $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(djn $$0, iw $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public ebq a(dkm $$0, dky $$1, iw $$2, jc $$3, iw $$4, ebq $$5, bai $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(eyp $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(ded $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(exz $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dkm $$0, iw $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(djn $$0, iw $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bve b(dkj $$0, iw $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(ayc<dno> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(ayc<dno> $$0, Predicate<ebp.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jk<dno> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jg<dno> $$0) {
         return this.a($$0.a());
      }

      public Stream<ayc<dno>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dqi;
      }

      @Nullable
      public <T extends dyo> dyp<T> a(dkj $$0, dyq<T> $$1) {
         return this.b() instanceof dqi ? ((dqi)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dno $$0) {
         return this.b() == $$0;
      }

      public boolean a(alq<dno> $$0) {
         return this.b().p().a($$0);
      }

      public eya y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(iw $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dvl A() {
         return this.b().h_(this.B());
      }

      public void a(dkj $$0, ebq $$1, ffy $$2, ctd $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(djn $$0, iw $$1, jc $$2) {
         return this.a($$0, $$1, $$2, dvz.a);
      }

      public boolean a(djn $$0, iw $$1, jc $$2, dvz $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(djn $$0, iw $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      public dak a(dkm $$0, iw $$1, boolean $$2) {
         return this.b().a($$0, $$1, this.B(), $$2);
      }

      protected abstract ebq B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public ecr E() {
         return this.z;
      }

      static final class a {
         private static final jc[] d = jc.values();
         private static final int e = dvz.values().length;
         protected final fgw a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(ebq $$0) {
            dno $$1 = $$0.b();
            this.a = $$1.b($$0, djz.a, iw.c, fgh.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", mh.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jc.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jc $$2 : d) {
                  for (dvz $$3 : dvz.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, djz.a, iw.c, $$2);
                  }
               }

               this.c = dno.a($$0.g(djz.a, iw.c));
            }
         }

         public boolean a(jc $$0, dvz $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jc $$0, dvz $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      fgc evaluate(ebq var1, iw var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<ebp.d> a = Codec.unit(() -> a());
      Function<ebq, eye> b = $$0 -> eye.a;
      boolean c = true;
      dvl d = dvl.f;
      ToIntFunction<ebq> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private alq<dno> m;
      private alj<dno, Optional<alq<fay>>> n = $$0 -> Optional.of(alq.a(mi.br, $$0.a().f("blocks/")));
      private alj<dno, String> o = $$0 -> ag.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      eyf v = eyf.a;
      boolean w = true;
      ecr x = ecr.a;
      boolean y;
      ebp.e<bxn<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jc.b) && $$0.k() < 14;
      ebp.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      ebp.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      ebp.f C = this.B;
      ebp.f D = ($$0, $$1, $$2) -> false;
      ebp.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      cvs G = cvu.g;
      @Nullable
      ebp.b H;

      private d() {
      }

      public static ebp.d a() {
         return new ebp.d();
      }

      public static ebp.d a(ebp $$0) {
         ebp.d $$1 = b($$0);
         ebp.d $$2 = $$0.O;
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
      public static ebp.d b(ebp $$0) {
         ebp.d $$1 = new ebp.d();
         ebp.d $$2 = $$0.O;
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

      public ebp.d a(czi $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public ebp.d a(eye $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public ebp.d a(Function<ebq, eye> $$0) {
         this.b = $$0;
         return this;
      }

      public ebp.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public ebp.d c() {
         this.p = false;
         return this;
      }

      public ebp.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public ebp.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public ebp.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public ebp.d a(dvl $$0) {
         this.d = $$0;
         return this;
      }

      public ebp.d a(ToIntFunction<ebq> $$0) {
         this.e = $$0;
         return this;
      }

      public ebp.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public ebp.d d() {
         return this.d(0.0F);
      }

      public ebp.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public ebp.d e() {
         this.i = true;
         return this;
      }

      public ebp.d f() {
         this.F = true;
         return this;
      }

      public ebp.d g() {
         this.n = alj.fixed(Optional.empty());
         return this;
      }

      public ebp.d a(Optional<alq<fay>> $$0) {
         this.n = alj.fixed($$0);
         return this;
      }

      protected Optional<alq<fay>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public ebp.d i() {
         this.r = true;
         return this;
      }

      public ebp.d j() {
         this.s = true;
         return this;
      }

      public ebp.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public ebp.d l() {
         this.t = true;
         return this;
      }

      public ebp.d a(eyf $$0) {
         this.v = $$0;
         return this;
      }

      public ebp.d m() {
         this.q = true;
         return this;
      }

      public ebp.d a(ebp.e<bxn<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public ebp.d a(ebp.f $$0) {
         this.A = $$0;
         return this;
      }

      public ebp.d b(ebp.f $$0) {
         this.B = $$0;
         return this;
      }

      public ebp.d c(ebp.f $$0) {
         this.C = $$0;
         return this;
      }

      public ebp.d d(ebp.f $$0) {
         this.D = $$0;
         return this;
      }

      public ebp.d e(ebp.f $$0) {
         this.E = $$0;
         return this;
      }

      public ebp.d n() {
         this.h = true;
         return this;
      }

      public ebp.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public ebp.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public ebp.d a(ebp.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dno $$2 = $$0x.b();
            long $$3 = azz.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.ao_();
            double $$5 = azz.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azz.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new fgc($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dno $$2 = $$0x.b();
            long $$3 = azz.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.aq_();
            float $$5 = $$2.ao_();
            double $$6 = azz.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azz.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new fgc($$6, $$4, $$7);
         };
         };
         return this;
      }

      public ebp.d o() {
         this.w = false;
         return this;
      }

      public ebp.d a(cvq... $$0) {
         this.G = cvu.e.a($$0);
         return this;
      }

      public ebp.d a(ecr $$0) {
         this.x = $$0;
         return this;
      }

      public ebp.d p() {
         this.y = true;
         return this;
      }

      public ebp.d a(alq<dno> $$0) {
         this.m = $$0;
         return this;
      }

      public ebp.d a(String $$0) {
         this.o = alj.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(ebq var1, djn var2, iw var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(ebq var1, djn var2, iw var3);
   }
}
