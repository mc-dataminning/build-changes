import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class dqg implements cnr {
   protected static final is[] aF = new is[]{is.e, is.f, is.c, is.d, is.a, is.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dkr aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cnu aO;
   protected final dqg.d aP;
   @Nullable
   protected akg<eoq> aQ;

   public dqg(dqg.d $$0) {
      this.aG = $$0.c;
      this.aQ = $$0.m;
      this.aH = $$0.f;
      this.aI = $$0.i;
      this.aJ = $$0.d;
      this.aK = $$0.j;
      this.aL = $$0.k;
      this.aM = $$0.l;
      this.aN = $$0.D;
      this.aO = $$0.E;
      this.aP = $$0;
   }

   public dqg.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dde> a();

   protected static <B extends dde> RecordCodecBuilder<B, dqg.d> u() {
      return dqg.d.a.fieldOf("properties").forGetter(dqg::t);
   }

   public static <B extends dde> MapCodec<B> b(Function<dqg.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dqh $$0, dae $$1, in $$2, int $$3, int $$4) {
   }

   protected boolean a(dqh $$0, emp $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(czs.a, in.c);
         case b:
            return $$0.u().a(avw.a);
         case c:
            return !$$0.r(czs.a, in.c);
         default:
            return false;
      }
   }

   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$0;
   }

   protected boolean a(dqh $$0, dqh $$1, is $$2) {
      return false;
   }

   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      afw.a($$1, $$2);
   }

   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
   }

   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dqh $$0, dad $$1, in $$2, czv $$3, BiConsumer<csz, in> $$4) {
      if (!$$0.i() && $$3.j() != czv.a.d) {
         dde $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof clh;
         if ($$5.a($$3) && $$1 instanceof aqh $$7) {
            dnm $$8 = $$0.t() ? $$1.c_($$2) : null;
            eoo.a $$9 = new eoo.a($$7).a(erc.f, etp.b($$2)).a(erc.i, csz.i).b(erc.h, $$8).b(erc.a, $$3.g());
            if ($$3.j() == czv.a.c) {
               $$9.a(erc.j, $$3.a());
            }

            $$0.a($$7, $$2, csz.i, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, ddg.a.n(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      return bpm.d;
   }

   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      return bpo.d;
   }

   protected boolean a(dqh $$0, dad $$1, in $$2, int $$3, int $$4) {
      return false;
   }

   protected djk a_(dqh $$0) {
      return djk.c;
   }

   protected boolean f_(dqh $$0) {
      return false;
   }

   protected boolean e_(dqh $$0) {
      return false;
   }

   protected ema b_(dqh $$0) {
      return emb.a.g();
   }

   protected boolean c_(dqh $$0) {
      return false;
   }

   protected float ar_() {
      return 0.25F;
   }

   protected float at_() {
      return 0.2F;
   }

   @Override
   public cnu m() {
      return this.aO;
   }

   protected dqh a(dqh $$0, djr $$1) {
      return $$0;
   }

   protected dqh a(dqh $$0, dib $$1) {
      return $$0;
   }

   protected boolean a(dqh $$0, cwi $$1) {
      return $$0.r() && ($$1.n().d() || !$$1.n().a(this.q()));
   }

   protected boolean a(dqh $$0, elz $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<csz> a(dqh $$0, eoo.a $$1) {
      akg<eoq> $$2 = this.v();
      if ($$2 == eoj.a) {
         return Collections.emptyList();
      } else {
         eoo $$3 = $$1.a(erc.g, $$0).a(erb.q);
         aqh $$4 = $$3.a();
         eoq $$5 = $$4.o().be().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dqh $$0, in $$1) {
      return axz.a($$1);
   }

   protected eui f(dqh $$0, czj $$1, in $$2) {
      return $$0.j($$1, $$2);
   }

   protected eui b_(dqh $$0, czj $$1, in $$2) {
      return this.b($$0, $$1, $$2, etu.a());
   }

   protected eui a(dqh $$0, czj $$1, in $$2) {
      return euf.a();
   }

   protected int g(dqh $$0, czj $$1, in $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.P();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bpq b(dqh $$0, dad $$1, in $$2) {
      return null;
   }

   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return true;
   }

   protected float d(dqh $$0, czj $$1, in $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dqh $$0, dad $$1, in $$2) {
      return 0;
   }

   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return euf.b();
   }

   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      return this.aG ? $$0.j($$1, $$2) : euf.a();
   }

   protected boolean c(dqh $$0, czj $$1, in $$2) {
      return dde.a($$0.k($$1, $$2));
   }

   protected boolean h(dqh $$0, czj $$1, in $$2) {
      return dde.a($$0.c($$1, $$2));
   }

   protected eui c(dqh $$0, czj $$1, in $$2, etu $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
   }

   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
   }

   protected float a(dqh $$0, clh $$1, czj $$2, in $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dqh $$0, aqh $$1, in $$2, csz $$3, boolean $$4) {
   }

   protected void a(dqh $$0, dad $$1, in $$2, clh $$3) {
   }

   protected int a(dqh $$0, czj $$1, in $$2, is $$3) {
      return 0;
   }

   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
   }

   protected int b(dqh $$0, czj $$1, in $$2, is $$3) {
      return 0;
   }

   public final akg<eoq> v() {
      if (this.aQ == null) {
         akh $$0 = ld.e.b(this.p());
         this.aQ = akg.a(le.aU, $$0.d("blocks/"));
      }

      return this.aQ;
   }

   protected void a(dad $$0, dqh $$1, etl $$2, clz $$3) {
   }

   protected boolean a_(dqh $$0, czj $$1, in $$2) {
      return !dde.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean d_(dqh $$0) {
      return this.aI;
   }

   protected dkr g_(dqh $$0) {
      return this.aJ;
   }

   public abstract csu q();

   protected abstract dde p();

   public eme w() {
      return this.aP.b.apply(this.p().n());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dqj<dde, dqh> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final emf l;
      private final eme m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dqg.f q;
      private final dqg.f r;
      private final dqg.f s;
      private final dqg.f t;
      private final dqg.f u;
      private final Optional<dqg.b> v;
      private final boolean w;
      private final dri x;
      private final boolean y;
      @Nullable
      protected dqg.a.a a;
      private ema z = emb.a.g();
      private boolean A;

      protected a(dde $$0, Reference2ObjectArrayMap<drk<?>, Comparable<?>> $$1, MapCodec<dqh> $$2) {
         super($$0, $$1, $$2);
         dqg.d $$3 = $$0.aP;
         this.b = $$3.e.applyAsInt(this.x());
         this.g = $$0.f_(this.x());
         this.h = $$3.o;
         this.i = $$3.p;
         this.j = $$3.q;
         this.l = $$3.t;
         this.m = $$3.b.apply(this.x());
         this.n = $$3.g;
         this.o = $$3.h;
         this.p = $$3.n;
         this.q = $$3.y;
         this.r = $$3.z;
         this.s = $$3.A;
         this.t = $$3.B;
         this.u = $$3.C;
         this.v = $$3.F;
         this.w = $$3.u;
         this.x = $$3.v;
         this.y = $$3.w;
      }

      private boolean D() {
         if (this.e.aP.s) {
            return true;
         } else if (this.e.aP.r) {
            return false;
         } else if (this.a == null) {
            return false;
         } else {
            eui $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               etk $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.b_(this.x());
         this.A = this.e.d_(this.x());
         if (!this.b().o()) {
            this.a = new dqg.a.a(this.x());
         }

         this.k = this.D();
      }

      public dde b() {
         return this.e;
      }

      public iw<dde> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         dde $$0 = this.b();
         return $$0 != ddg.bs && $$0 != ddg.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(czj $$0, in $$1, brn<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(czj $$0, in $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(czj $$0, in $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public eui a(czj $$0, in $$1, is $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : euf.a(this.c($$0, $$1), $$2);
      }

      public eui c(czj $$0, in $$1) {
         return this.b().f(this.x(), $$0, $$1);
      }

      public boolean f() {
         return this.a == null || this.a.c;
      }

      public boolean g() {
         return this.g;
      }

      public int h() {
         return this.b;
      }

      public boolean i() {
         return this.h;
      }

      public boolean j() {
         return this.i;
      }

      @Deprecated
      public boolean k() {
         return this.j;
      }

      public eme d(czj $$0, in $$1) {
         return this.m;
      }

      public dqh a(djr $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dqh a(dib $$0) {
         return this.b().a(this.x(), $$0);
      }

      public djk l() {
         return this.b().a_(this.x());
      }

      public boolean e(czj $$0, in $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(czj $$0, in $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(czj $$0, in $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().e_(this.x());
      }

      public int b(czj $$0, in $$1, is $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().c_(this.x());
      }

      public int a(dad $$0, in $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(czj $$0, in $$1) {
         return this.n;
      }

      public float a(clh $$0, czj $$1, in $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(czj $$0, in $$1, is $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public emf o() {
         return this.l;
      }

      public boolean i(czj $$0, in $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dqh $$2 = this.x();
            return $$2.p() ? dde.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dqh $$0, is $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public eui j(czj $$0, in $$1) {
         return this.a($$0, $$1, etu.a());
      }

      public eui a(czj $$0, in $$1, etu $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public eui k(czj $$0, in $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, etu.a());
      }

      public eui b(czj $$0, in $$1, etu $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eui l(czj $$0, in $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public eui c(czj $$0, in $$1, etu $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public eui m(czj $$0, in $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(czj $$0, in $$1, brh $$2) {
         return this.a($$0, $$1, $$2, is.b);
      }

      public final boolean a(czj $$0, in $$1, brh $$2, is $$3) {
         return dde.a(this.b($$0, $$1, etu.a($$2)), $$3);
      }

      public etp n(czj $$0, in $$1) {
         return this.v.<etp>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(etp.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(dad $$0, in $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dad $$0, in $$1, dde $$2, in $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dae $$0, in $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dae $$0, in $$1, int $$2, int $$3) {
         in.a $$4 = new in.a();

         for (is $$5 : dqg.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(dae $$0, in $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dae $$0, in $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dad $$0, in $$1, dqh $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(dad $$0, in $$1, dqh $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dad $$0, in $$1, czv $$2, BiConsumer<csz, in> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(aqh $$0, in $$1, ayg $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(aqh $$0, in $$1, ayg $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(dad $$0, in $$1, brh $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(aqh $$0, in $$1, csz $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<csz> a(eoo.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bpo a(csz $$0, dad $$1, clh $$2, bpl $$3, etl $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bpm a(dad $$0, clh $$1, etl $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(dad $$0, in $$1, clh $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(czj $$0, in $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(czj $$0, in $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dqh a(is $$0, dqh $$1, dae $$2, in $$3, in $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(emp $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cwi $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(elz $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(dag $$0, in $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(czj $$0, in $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bpq b(dad $$0, in $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(awg<dde> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(awg<dde> $$0, Predicate<dqg.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ja<dde> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(iw<dde> $$0) {
         return this.a($$0.a());
      }

      public Stream<awg<dde>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof dfw;
      }

      @Nullable
      public <T extends dnm> dnn<T> a(dad $$0, dno<T> $$1) {
         return this.b() instanceof dfw ? ((dfw)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dde $$0) {
         return this.b() == $$0;
      }

      public boolean a(akg<dde> $$0) {
         return this.b().r().a($$0);
      }

      public ema u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(in $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dkr w() {
         return this.b().g_(this.x());
      }

      public void a(dad $$0, dqh $$1, etl $$2, clz $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(czj $$0, in $$1, is $$2) {
         return this.a($$0, $$1, $$2, dlf.a);
      }

      public boolean a(czj $$0, in $$1, is $$2, dlf $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(czj $$0, in $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dqh x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dri A() {
         return this.x;
      }

      static final class a {
         private static final is[] e = is.values();
         private static final int f = dlf.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final eui[] i;
         protected final eui b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dqh $$0) {
            dde $$1 = $$0.b();
            this.a = $$0.i(czs.a, in.c);
            this.g = $$1.a_($$0, czs.a, in.c);
            this.h = $$1.g($$0, czs.a, in.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new eui[e.length];
               eui $$2 = $$1.f($$0, czs.a, in.c);

               for (is $$3 : e) {
                  this.i[$$3.ordinal()] = euf.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, czs.a, in.c, etu.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", ld.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(is.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (is $$4 : e) {
                  for (dlf $$5 : dlf.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, czs.a, in.c, $$4);
                  }
               }

               this.d = dde.a($$0.k(czs.a, in.c));
            }
         }

         public boolean a(is $$0, dlf $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(is $$0, dlf $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      etp evaluate(dqh var1, czj var2, in var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dqg.d> a = Codec.unit(() -> a());
      Function<dqh, eme> b = $$0 -> eme.a;
      boolean c = true;
      dkr d = dkr.f;
      ToIntFunction<dqh> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      akg<eoq> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      emf t = emf.a;
      boolean u = true;
      dri v = dri.a;
      boolean w;
      dqg.e<brn<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, is.b) && $$0.h() < 14;
      dqg.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dqg.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dqg.f A = this.z;
      dqg.f B = ($$0, $$1, $$2) -> false;
      dqg.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cnu E = cnw.g;
      Optional<dqg.b> F = Optional.empty();

      private d() {
      }

      public static dqg.d a() {
         return new dqg.d();
      }

      public static dqg.d a(dqg $$0) {
         dqg.d $$1 = b($$0);
         dqg.d $$2 = $$0.aP;
         $$1.l = $$2.l;
         $$1.y = $$2.y;
         $$1.x = $$2.x;
         $$1.B = $$2.B;
         $$1.z = $$2.z;
         $$1.A = $$2.A;
         $$1.m = $$2.m;
         return $$1;
      }

      @Deprecated
      public static dqg.d b(dqg $$0) {
         dqg.d $$1 = new dqg.d();
         dqg.d $$2 = $$0.aP;
         $$1.g = $$2.g;
         $$1.f = $$2.f;
         $$1.c = $$2.c;
         $$1.i = $$2.i;
         $$1.e = $$2.e;
         $$1.b = $$2.b;
         $$1.d = $$2.d;
         $$1.j = $$2.j;
         $$1.k = $$2.k;
         $$1.D = $$2.D;
         $$1.n = $$2.n;
         $$1.o = $$2.o;
         $$1.p = $$2.p;
         $$1.q = $$2.q;
         $$1.r = $$2.r;
         $$1.s = $$2.s;
         $$1.t = $$2.t;
         $$1.h = $$2.h;
         $$1.F = $$2.F;
         $$1.u = $$2.u;
         $$1.E = $$2.E;
         $$1.C = $$2.C;
         $$1.v = $$2.v;
         $$1.w = $$2.w;
         return $$1;
      }

      public dqg.d a(crs $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dqg.d a(eme $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dqg.d a(Function<dqh, eme> $$0) {
         this.b = $$0;
         return this;
      }

      public dqg.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dqg.d c() {
         this.n = false;
         return this;
      }

      public dqg.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dqg.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dqg.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dqg.d a(dkr $$0) {
         this.d = $$0;
         return this;
      }

      public dqg.d a(ToIntFunction<dqh> $$0) {
         this.e = $$0;
         return this;
      }

      public dqg.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dqg.d d() {
         return this.d(0.0F);
      }

      public dqg.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dqg.d e() {
         this.i = true;
         return this;
      }

      public dqg.d f() {
         this.D = true;
         return this;
      }

      public dqg.d g() {
         this.m = eoj.a;
         return this;
      }

      public dqg.d a(dde $$0) {
         this.m = $$0.v();
         return this;
      }

      public dqg.d h() {
         this.p = true;
         return this;
      }

      public dqg.d i() {
         this.q = true;
         return this;
      }

      public dqg.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dqg.d k() {
         this.r = true;
         return this;
      }

      public dqg.d a(emf $$0) {
         this.t = $$0;
         return this;
      }

      public dqg.d l() {
         this.o = true;
         return this;
      }

      public dqg.d a(dqg.e<brn<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dqg.d a(dqg.f $$0) {
         this.y = $$0;
         return this;
      }

      public dqg.d b(dqg.f $$0) {
         this.z = $$0;
         return this;
      }

      public dqg.d c(dqg.f $$0) {
         this.A = $$0;
         return this;
      }

      public dqg.d d(dqg.f $$0) {
         this.B = $$0;
         return this;
      }

      public dqg.d e(dqg.f $$0) {
         this.C = $$0;
         return this;
      }

      public dqg.d m() {
         this.h = true;
         return this;
      }

      public dqg.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dqg.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dqg.d a(dqg.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dde $$3 = $$0x.b();
                  long $$4 = axz.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.at_();
                  float $$6 = $$3.ar_();
                  double $$7 = axz.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = axz.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new etp($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dde $$3 = $$0x.b();
                  long $$4 = axz.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.ar_();
                  double $$6 = axz.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = axz.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new etp($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dqg.d n() {
         this.u = false;
         return this;
      }

      public dqg.d a(cns... $$0) {
         this.E = cnw.e.a($$0);
         return this;
      }

      public dqg.d a(dri $$0) {
         this.v = $$0;
         return this;
      }

      public dqg.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dqh var1, czj var2, in var3, A var4);
   }

   public interface f {
      boolean test(dqh var1, czj var2, in var3);
   }
}
