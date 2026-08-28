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

public abstract class dxp implements csk {
   protected static final jn[] D = new jn[]{jn.e, jn.f, jn.c, jn.d, jn.a, jn.b};
   protected final boolean E;
   protected final float F;
   protected final boolean G;
   protected final drx H;
   protected final float I;
   protected final float J;
   protected final float K;
   protected final boolean L;
   protected final csn M;
   protected final dxp.d N;
   protected final Optional<akt<ewt>> O;
   protected final String P;

   public dxp(dxp.d $$0) {
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

   public dxp.d s() {
      return this.N;
   }

   protected abstract MapCodec<? extends dke> a();

   protected static <B extends dke> RecordCodecBuilder<B, dxp.d> t() {
      return dxp.d.a.fieldOf("properties").forGetter(dxp::s);
   }

   public static <B extends dke> MapCodec<B> b(Function<dxp.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dxq $$0, dha $$1, ji $$2, int $$3, int $$4) {
   }

   protected boolean a(dxq $$0, eul $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(dgp.a, ji.c);
         case b:
            return $$0.y().a(awv.a);
         case c:
            return !$$0.m(dgp.a, ji.c);
         default:
            return false;
      }
   }

   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$0;
   }

   protected boolean b(dxq $$0, dxq $$1, jn $$2) {
      return false;
   }

   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
   }

   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
   }

   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
   }

   protected void a(dxq $$0, ard $$1, ji $$2, dgs $$3, BiConsumer<cxh, ji> $$4) {
      if (!$$0.l() && $$3.b() != dgs.a.d) {
         dke $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof cpr;
         if ($$5.a($$3)) {
            dus $$7 = $$0.x() ? $$1.c_($$2) : null;
            ewr.a $$8 = new ewr.a($$1).a(ezi.f, fbx.b($$2)).a(ezi.i, cxh.k).b(ezi.h, $$7).b(ezi.a, $$3.d());
            if ($$3.b() == dgs.a.c) {
               $$8.a(ezi.j, $$3.e());
            }

            $$0.a($$1, $$2, cxh.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dkg.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      return bsy.e;
   }

   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      return bsy.f;
   }

   protected boolean a(dxq $$0, dgz $$1, ji $$2, int $$3, int $$4) {
      return false;
   }

   protected dqp a_(dxq $$0) {
      return dqp.b;
   }

   protected boolean g_(dxq $$0) {
      return false;
   }

   protected boolean f_(dxq $$0) {
      return false;
   }

   protected etw b_(dxq $$0) {
      return etx.a.g();
   }

   protected boolean c_(dxq $$0) {
      return false;
   }

   protected float ar_() {
      return 0.25F;
   }

   protected float at_() {
      return 0.2F;
   }

   @Override
   public csn k() {
      return this.M;
   }

   protected dxq a(dxq $$0, dqw $$1) {
      return $$0;
   }

   protected dxq a(dxq $$0, dpf $$1) {
      return $$0;
   }

   protected boolean a(dxq $$0, dax $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.i()));
   }

   protected boolean a(dxq $$0, etv $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cxh> a(dxq $$0, ewr.a $$1) {
      if (this.O.isEmpty()) {
         return Collections.emptyList();
      } else {
         ewr $$2 = $$1.a(ezi.g, $$0).a(ezh.r);
         ard $$3 = $$2.a();
         ewt $$4 = $$3.p().bc().b(this.O.get());
         return $$4.a($$2);
      }
   }

   protected long a(dxq $$0, ji $$1) {
      return ayz.a($$1);
   }

   protected fcr d_(dxq $$0) {
      return $$0.f(dgp.a, ji.c);
   }

   protected fcr b_(dxq $$0, dgf $$1, ji $$2) {
      return this.b($$0, $$1, $$2, fcc.a());
   }

   protected fcr a(dxq $$0, dgf $$1, ji $$2) {
      return fco.a();
   }

   protected int i_(dxq $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bta b(dxq $$0, dgz $$1, ji $$2) {
      return null;
   }

   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return true;
   }

   protected float c(dxq $$0, dgf $$1, ji $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return 0;
   }

   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return fco.b();
   }

   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.E ? $$0.f($$1, $$2) : fco.a();
   }

   protected boolean a_(dxq $$0, dgf $$1, ji $$2) {
      return dke.a($$0.g($$1, $$2));
   }

   protected fcr c(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
   }

   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
   }

   protected float a(dxq $$0, cpr $$1, dgf $$2, ji $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dxq $$0, ard $$1, ji $$2, cxh $$3, boolean $$4) {
   }

   protected void a_(dxq $$0, dgz $$1, ji $$2, cpr $$3) {
   }

   protected int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return 0;
   }

   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
   }

   protected fcr a_(dxq $$0, dgz $$1, ji $$2) {
      return fco.b();
   }

   protected int b(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return 0;
   }

   public final Optional<akt<ewt>> u() {
      return this.O;
   }

   public final String v() {
      return this.P;
   }

   protected void a(dgz $$0, dxq $$1, fbt $$2, cqk $$3) {
   }

   protected boolean e_(dxq $$0) {
      return !dke.a($$0.f(dgp.a, ji.c)) && $$0.y().c();
   }

   protected boolean f(dxq $$0) {
      return this.G;
   }

   protected drx h_(dxq $$0) {
      return this.H;
   }

   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return new cxh(this.i());
   }

   public abstract cxd i();

   protected abstract dke o();

   public eua w() {
      return this.N.b.apply(this.o().m());
   }

   public float x() {
      return this.N.g;
   }

   public abstract static class a extends dxs<dke, dxq> {
      private static final jn[] a = jn.values();
      private static final fcr[] f = af.a(new fcr[a.length], $$0 -> Arrays.fill($$0, fco.a()));
      private static final fcr[] g = af.a(new fcr[a.length], $$0 -> Arrays.fill($$0, fco.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final eub n;
      private final eua o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dxp.f s;
      private final dxp.f t;
      private final dxp.f u;
      private final dxp.f v;
      private final dxp.f w;
      @Nullable
      private final dxp.b x;
      private final boolean y;
      private final dyr z;
      private final boolean A;
      @Nullable
      private dxp.a.a B;
      private etw C = etx.a.g();
      private boolean D;
      private boolean E;
      private fcr F;
      private fcr[] G;
      private boolean H;
      private int I;

      protected a(dke $$0, Reference2ObjectArrayMap<dyt<?>, Comparable<?>> $$1, MapCodec<dxq> $$2) {
         super($$0, $$1, $$2);
         dxp.d $$3 = $$0.N;
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
            fcr $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               fbs $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new dxp.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fco.a();
         this.E = dke.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fcr[a.length];

            for (jn $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dke b() {
         return this.d;
      }

      public jr<dke> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dke $$0 = this.b();
         return $$0 != dkg.bz && $$0 != dkg.nA && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dgf $$0, ji $$1, bvi<?> $$2) {
         return this.b().N.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fcr a(jn $$0) {
         return this.G[$$0.ordinal()];
      }

      public fcr h() {
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

      public eua a(dgf $$0, ji $$1) {
         return this.o;
      }

      public dxq a(dqw $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dxq a(dpf $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dqp o() {
         return this.b().a_(this.B());
      }

      public boolean b(dgf $$0, ji $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dgf $$0, ji $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dgf $$0, ji $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dgf $$0, ji $$1, jn $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dgz $$0, ji $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dgf $$0, ji $$1) {
         return this.p;
      }

      public float a(cpr $$0, dgf $$1, ji $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dgf $$0, ji $$1, jn $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public eub r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dxq $$0, jn $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fcr f(dgf $$0, ji $$1) {
         return this.a($$0, $$1, fcc.a());
      }

      public fcr a(dgf $$0, ji $$1, fcc $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fcr g(dgf $$0, ji $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, fcc.a());
      }

      public fcr b(dgf $$0, ji $$1, fcc $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fcr h(dgf $$0, ji $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fcr c(dgf $$0, ji $$1, fcc $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fcr i(dgf $$0, ji $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(dgf $$0, ji $$1, bva $$2) {
         return this.a($$0, $$1, $$2, jn.b);
      }

      public final boolean a(dgf $$0, ji $$1, bva $$2, jn $$3) {
         return dke.a(this.b($$0, $$1, fcc.a($$2)), $$3);
      }

      public fbx a(ji $$0) {
         dxp.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : fbx.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dgz $$0, ji $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dgz $$0, ji $$1, dke $$2, @Nullable eve $$3, boolean $$4) {
         agc.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dha $$0, ji $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dha $$0, ji $$1, int $$2, int $$3) {
         ji.a $$4 = new ji.a();

         for (jn $$5 : dxp.D) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dha $$0, ji $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dha $$0, ji $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dgz $$0, ji $$1, dxq $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(ard $$0, ji $$1, boolean $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(ard $$0, ji $$1, dgs $$2, BiConsumer<cxh, ji> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(ard $$0, ji $$1, azh $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(ard $$0, ji $$1, azh $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dgz $$0, ji $$1, bva $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fcr b(dgz $$0, ji $$1) {
         return this.b().a_(this.B(), $$0, $$1);
      }

      public void a(ard $$0, ji $$1, cxh $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cxh> a(ewr.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bsy a(cxh $$0, dgz $$1, cpr $$2, bsx $$3, fbt $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bsy a(dgz $$0, cpr $$1, fbt $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dgz $$0, ji $$1, cpr $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dgf $$0, ji $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dgf $$0, ji $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dxq a(dhc $$0, dho $$1, ji $$2, jn $$3, ji $$4, dxq $$5, azh $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(eul $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(dax $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(etv $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dhc $$0, ji $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dgf $$0, ji $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bta c(dgz $$0, ji $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axf<dke> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axf<dke> $$0, Predicate<dxp.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jv<dke> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jr<dke> $$0) {
         return this.a($$0.a());
      }

      public Stream<axf<dke>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dmx;
      }

      @Nullable
      public <T extends dus> dut<T> a(dgz $$0, duu<T> $$1) {
         return this.b() instanceof dmx ? ((dmx)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dke $$0) {
         return this.b() == $$0;
      }

      public boolean a(akt<dke> $$0) {
         return this.b().p().a($$0);
      }

      public etw y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(ji $$0) {
         return this.b().a(this.B(), $$0);
      }

      public drx A() {
         return this.b().h_(this.B());
      }

      public void a(dgz $$0, dxq $$1, fbt $$2, cqk $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dgf $$0, ji $$1, jn $$2) {
         return this.a($$0, $$1, $$2, dsl.a);
      }

      public boolean a(dgf $$0, ji $$1, jn $$2, dsl $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dgf $$0, ji $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      public cxh a(dhc $$0, ji $$1, boolean $$2) {
         return this.b().a($$0, $$1, this.B(), $$2);
      }

      protected abstract dxq B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dyr E() {
         return this.z;
      }

      static final class a {
         private static final jn[] d = jn.values();
         private static final int e = dsl.values().length;
         protected final fcr a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dxq $$0) {
            dke $$1 = $$0.b();
            this.a = $$1.b($$0, dgp.a, ji.c, fcc.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", mb.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jn.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jn $$2 : d) {
                  for (dsl $$3 : dsl.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, dgp.a, ji.c, $$2);
                  }
               }

               this.c = dke.a($$0.g(dgp.a, ji.c));
            }
         }

         public boolean a(jn $$0, dsl $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jn $$0, dsl $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      fbx evaluate(dxq var1, ji var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dxp.d> a = Codec.unit(() -> a());
      Function<dxq, eua> b = $$0 -> eua.a;
      boolean c = true;
      drx d = drx.f;
      ToIntFunction<dxq> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private akt<dke> m;
      private akm<dke, Optional<akt<ewt>>> n = $$0 -> Optional.of(akt.a(mc.bi, $$0.a().f("blocks/")));
      private akm<dke, String> o = $$0 -> af.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      eub v = eub.a;
      boolean w = true;
      dyr x = dyr.a;
      boolean y;
      dxp.e<bvi<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jn.b) && $$0.k() < 14;
      dxp.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dxp.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dxp.f C = this.B;
      dxp.f D = ($$0, $$1, $$2) -> false;
      dxp.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      csn G = csp.g;
      @Nullable
      dxp.b H;

      private d() {
      }

      public static dxp.d a() {
         return new dxp.d();
      }

      public static dxp.d a(dxp $$0) {
         dxp.d $$1 = b($$0);
         dxp.d $$2 = $$0.N;
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
      public static dxp.d b(dxp $$0) {
         dxp.d $$1 = new dxp.d();
         dxp.d $$2 = $$0.N;
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

      public dxp.d a(cwe $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dxp.d a(eua $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dxp.d a(Function<dxq, eua> $$0) {
         this.b = $$0;
         return this;
      }

      public dxp.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dxp.d c() {
         this.p = false;
         return this;
      }

      public dxp.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dxp.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dxp.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dxp.d a(drx $$0) {
         this.d = $$0;
         return this;
      }

      public dxp.d a(ToIntFunction<dxq> $$0) {
         this.e = $$0;
         return this;
      }

      public dxp.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dxp.d d() {
         return this.d(0.0F);
      }

      public dxp.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dxp.d e() {
         this.i = true;
         return this;
      }

      public dxp.d f() {
         this.F = true;
         return this;
      }

      public dxp.d g() {
         this.n = akm.fixed(Optional.empty());
         return this;
      }

      public dxp.d a(Optional<akt<ewt>> $$0) {
         this.n = akm.fixed($$0);
         return this;
      }

      protected Optional<akt<ewt>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dxp.d i() {
         this.r = true;
         return this;
      }

      public dxp.d j() {
         this.s = true;
         return this;
      }

      public dxp.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dxp.d l() {
         this.t = true;
         return this;
      }

      public dxp.d a(eub $$0) {
         this.v = $$0;
         return this;
      }

      public dxp.d m() {
         this.q = true;
         return this;
      }

      public dxp.d a(dxp.e<bvi<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dxp.d a(dxp.f $$0) {
         this.A = $$0;
         return this;
      }

      public dxp.d b(dxp.f $$0) {
         this.B = $$0;
         return this;
      }

      public dxp.d c(dxp.f $$0) {
         this.C = $$0;
         return this;
      }

      public dxp.d d(dxp.f $$0) {
         this.D = $$0;
         return this;
      }

      public dxp.d e(dxp.f $$0) {
         this.E = $$0;
         return this;
      }

      public dxp.d n() {
         this.h = true;
         return this;
      }

      public dxp.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dxp.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dxp.d a(dxp.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dke $$2 = $$0x.b();
            long $$3 = ayz.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.ar_();
            double $$5 = ayz.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = ayz.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new fbx($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dke $$2 = $$0x.b();
            long $$3 = ayz.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.at_();
            float $$5 = $$2.ar_();
            double $$6 = ayz.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = ayz.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new fbx($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dxp.d o() {
         this.w = false;
         return this;
      }

      public dxp.d a(csl... $$0) {
         this.G = csp.e.a($$0);
         return this;
      }

      public dxp.d a(dyr $$0) {
         this.x = $$0;
         return this;
      }

      public dxp.d p() {
         this.y = true;
         return this;
      }

      public dxp.d a(akt<dke> $$0) {
         this.m = $$0;
         return this;
      }

      public dxp.d a(String $$0) {
         this.o = akm.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dxq var1, dgf var2, ji var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dxq var1, dgf var2, ji var3);
   }
}
