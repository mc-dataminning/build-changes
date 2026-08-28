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

public abstract class dxn implements csh {
   protected static final jm[] aG = new jm[]{jm.e, jm.f, jm.c, jm.d, jm.a, jm.b};
   protected final boolean aH;
   protected final float aI;
   protected final boolean aJ;
   protected final drv aK;
   protected final float aL;
   protected final float aM;
   protected final float aN;
   protected final boolean aO;
   protected final csk aP;
   protected final dxn.d aQ;
   protected final Optional<alo<ewn>> aR;
   protected final String aS;

   public dxn(dxn.d $$0) {
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

   public dxn.d s() {
      return this.aQ;
   }

   protected abstract MapCodec<? extends dkd> a();

   protected static <B extends dkd> RecordCodecBuilder<B, dxn.d> t() {
      return dxn.d.a.fieldOf("properties").forGetter(dxn::s);
   }

   public static <B extends dkd> MapCodec<B> b(Function<dxn.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dxo $$0, dha $$1, jh $$2, int $$3, int $$4) {
   }

   protected boolean a(dxo $$0, euf $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(dgo.a, jh.c);
         case b:
            return $$0.y().a(axq.a);
         case c:
            return !$$0.m(dgo.a, jh.c);
         default:
            return false;
      }
   }

   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$0;
   }

   protected boolean b(dxo $$0, dxo $$1, jm $$2) {
      return false;
   }

   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
   }

   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
   }

   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if ($$0.x() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dxo $$0, arx $$1, jh $$2, dgr $$3, BiConsumer<cxg, jh> $$4) {
      if (!$$0.l() && $$3.b() != dgr.a.d) {
         dkd $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof cpo;
         if ($$5.a($$3)) {
            duq $$7 = $$0.x() ? $$1.c_($$2) : null;
            ewl.a $$8 = new ewl.a($$1).a(ezc.f, fbr.b($$2)).a(ezc.i, cxg.j).b(ezc.h, $$7).b(ezc.a, $$3.d());
            if ($$3.b() == dgr.a.c) {
               $$8.a(ezc.j, $$3.e());
            }

            $$0.a($$1, $$2, cxg.j, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dkf.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      return bta.e;
   }

   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      return bta.f;
   }

   protected boolean a(dxo $$0, dgz $$1, jh $$2, int $$3, int $$4) {
      return false;
   }

   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   protected boolean g_(dxo $$0) {
      return false;
   }

   protected boolean f_(dxo $$0) {
      return false;
   }

   protected etq b_(dxo $$0) {
      return etr.a.g();
   }

   protected boolean c_(dxo $$0) {
      return false;
   }

   protected float as_() {
      return 0.25F;
   }

   protected float au_() {
      return 0.2F;
   }

   @Override
   public csk i() {
      return this.aP;
   }

   protected dxo a(dxo $$0, dqv $$1) {
      return $$0;
   }

   protected dxo a(dxo $$0, dpc $$1) {
      return $$0;
   }

   protected boolean a(dxo $$0, dax $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.j()));
   }

   protected boolean a(dxo $$0, etp $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cxg> a(dxo $$0, ewl.a $$1) {
      if (this.aR.isEmpty()) {
         return Collections.emptyList();
      } else {
         ewl $$2 = $$1.a(ezc.g, $$0).a(ezb.r);
         arx $$3 = $$2.a();
         ewn $$4 = $$3.p().bc().b(this.aR.get());
         return $$4.a($$2);
      }
   }

   protected long a(dxo $$0, jh $$1) {
      return azu.a($$1);
   }

   protected fcl d_(dxo $$0) {
      return $$0.f(dgo.a, jh.c);
   }

   protected fcl b_(dxo $$0, dge $$1, jh $$2) {
      return this.b($$0, $$1, $$2, fbw.a());
   }

   protected fcl a(dxo $$0, dge $$1, jh $$2) {
      return fci.a();
   }

   protected int i_(dxo $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected btc b(dxo $$0, dgz $$1, jh $$2) {
      return null;
   }

   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return true;
   }

   protected float c(dxo $$0, dge $$1, jh $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return 0;
   }

   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return fci.b();
   }

   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return this.aH ? $$0.f($$1, $$2) : fci.a();
   }

   protected boolean a_(dxo $$0, dge $$1, jh $$2) {
      return dkd.a($$0.g($$1, $$2));
   }

   protected fcl c(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
   }

   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
   }

   protected float a(dxo $$0, cpo $$1, dge $$2, jh $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dxo $$0, arx $$1, jh $$2, cxg $$3, boolean $$4) {
   }

   protected void a_(dxo $$0, dgz $$1, jh $$2, cpo $$3) {
   }

   protected int a(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return 0;
   }

   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
   }

   protected fcl a_(dxo $$0, dgz $$1, jh $$2) {
      return fci.b();
   }

   protected int b(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return 0;
   }

   public final Optional<alo<ewn>> u() {
      return this.aR;
   }

   public final String v() {
      return this.aS;
   }

   protected void a(dgz $$0, dxo $$1, fbn $$2, cqh $$3) {
   }

   protected boolean e_(dxo $$0) {
      return !dkd.a($$0.f(dgo.a, jh.c)) && $$0.y().c();
   }

   protected boolean f(dxo $$0) {
      return this.aJ;
   }

   protected drv h_(dxo $$0) {
      return this.aK;
   }

   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return new cxg(this.j());
   }

   public abstract cxc j();

   protected abstract dkd o();

   public etu w() {
      return this.aQ.b.apply(this.o().m());
   }

   public float x() {
      return this.aQ.g;
   }

   public abstract static class a extends dxq<dkd, dxo> {
      private static final jm[] a = jm.values();
      private static final fcl[] f = ae.a(new fcl[a.length], $$0 -> Arrays.fill($$0, fci.a()));
      private static final fcl[] g = ae.a(new fcl[a.length], $$0 -> Arrays.fill($$0, fci.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final etv n;
      private final etu o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dxn.f s;
      private final dxn.f t;
      private final dxn.f u;
      private final dxn.f v;
      private final dxn.f w;
      @Nullable
      private final dxn.b x;
      private final boolean y;
      private final dyo z;
      private final boolean A;
      @Nullable
      private dxn.a.a B;
      private etq C = etr.a.g();
      private boolean D;
      private boolean E;
      private fcl F;
      private fcl[] G;
      private boolean H;
      private int I;

      protected a(dkd $$0, Reference2ObjectArrayMap<dyq<?>, Comparable<?>> $$1, MapCodec<dxo> $$2) {
         super($$0, $$1, $$2);
         dxn.d $$3 = $$0.aQ;
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
            fcl $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               fbm $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new dxn.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fci.a();
         this.E = dkd.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fcl[a.length];

            for (jm $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dkd b() {
         return this.d;
      }

      public jq<dkd> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dkd $$0 = this.b();
         return $$0 != dkf.bz && $$0 != dkf.nA && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dge $$0, jh $$1, bvi<?> $$2) {
         return this.b().aQ.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fcl a(jm $$0) {
         return this.G[$$0.ordinal()];
      }

      public fcl h() {
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

      public etu a(dge $$0, jh $$1) {
         return this.o;
      }

      public dxo a(dqv $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dxo a(dpc $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dqo o() {
         return this.b().a_(this.B());
      }

      public boolean b(dge $$0, jh $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dge $$0, jh $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dge $$0, jh $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dge $$0, jh $$1, jm $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dgz $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dge $$0, jh $$1) {
         return this.p;
      }

      public float a(cpo $$0, dge $$1, jh $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dge $$0, jh $$1, jm $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public etv r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dxo $$0, jm $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fcl f(dge $$0, jh $$1) {
         return this.a($$0, $$1, fbw.a());
      }

      public fcl a(dge $$0, jh $$1, fbw $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fcl g(dge $$0, jh $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, fbw.a());
      }

      public fcl b(dge $$0, jh $$1, fbw $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fcl h(dge $$0, jh $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fcl c(dge $$0, jh $$1, fbw $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fcl i(dge $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(dge $$0, jh $$1, bvb $$2) {
         return this.a($$0, $$1, $$2, jm.b);
      }

      public final boolean a(dge $$0, jh $$1, bvb $$2, jm $$3) {
         return dkd.a(this.b($$0, $$1, fbw.a($$2)), $$3);
      }

      public fbr a(jh $$0) {
         dxn.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : fbr.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dgz $$0, jh $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dgz $$0, jh $$1, dkd $$2, @Nullable euy $$3, boolean $$4) {
         agy.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dha $$0, jh $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dha $$0, jh $$1, int $$2, int $$3) {
         jh.a $$4 = new jh.a();

         for (jm $$5 : dxn.aG) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dha $$0, jh $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dha $$0, jh $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dgz $$0, jh $$1, dxo $$2, boolean $$3) {
         this.b().b(this.B(), $$0, $$1, $$2, $$3);
      }

      public void b(dgz $$0, jh $$1, dxo $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arx $$0, jh $$1, dgr $$2, BiConsumer<cxg, jh> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arx $$0, jh $$1, bac $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(arx $$0, jh $$1, bac $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dgz $$0, jh $$1, bvb $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fcl b(dgz $$0, jh $$1) {
         return this.b().a_(this.B(), $$0, $$1);
      }

      public void a(arx $$0, jh $$1, cxg $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cxg> a(ewl.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bta a(cxg $$0, dgz $$1, cpo $$2, bsz $$3, fbn $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bta a(dgz $$0, cpo $$1, fbn $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dgz $$0, jh $$1, cpo $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dge $$0, jh $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dge $$0, jh $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dxo a(dhc $$0, dho $$1, jh $$2, jm $$3, jh $$4, dxo $$5, bac $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(euf $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(dax $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(etp $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dhc $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dge $$0, jh $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public btc c(dgz $$0, jh $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(aya<dkd> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(aya<dkd> $$0, Predicate<dxn.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ju<dkd> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jq<dkd> $$0) {
         return this.a($$0.a());
      }

      public Stream<aya<dkd>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dmw;
      }

      @Nullable
      public <T extends duq> dur<T> a(dgz $$0, dus<T> $$1) {
         return this.b() instanceof dmw ? ((dmw)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dkd $$0) {
         return this.b() == $$0;
      }

      public boolean a(alo<dkd> $$0) {
         return this.b().p().a($$0);
      }

      public etq y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(jh $$0) {
         return this.b().a(this.B(), $$0);
      }

      public drv A() {
         return this.b().h_(this.B());
      }

      public void a(dgz $$0, dxo $$1, fbn $$2, cqh $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dge $$0, jh $$1, jm $$2) {
         return this.a($$0, $$1, $$2, dsj.a);
      }

      public boolean a(dge $$0, jh $$1, jm $$2, dsj $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dge $$0, jh $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      public cxg b(dhc $$0, jh $$1) {
         return this.b().a($$0, $$1, this.B());
      }

      protected abstract dxo B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dyo E() {
         return this.z;
      }

      static final class a {
         private static final jm[] d = jm.values();
         private static final int e = dsj.values().length;
         protected final fcl a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dxo $$0) {
            dkd $$1 = $$0.b();
            this.a = $$1.b($$0, dgo.a, jh.c, fbw.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", ma.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jm.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jm $$2 : d) {
                  for (dsj $$3 : dsj.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, dgo.a, jh.c, $$2);
                  }
               }

               this.c = dkd.a($$0.g(dgo.a, jh.c));
            }
         }

         public boolean a(jm $$0, dsj $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jm $$0, dsj $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      fbr evaluate(dxo var1, jh var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dxn.d> a = Codec.unit(() -> a());
      Function<dxo, etu> b = $$0 -> etu.a;
      boolean c = true;
      drv d = drv.f;
      ToIntFunction<dxo> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private alo<dkd> m;
      private alh<dkd, Optional<alo<ewn>>> n = $$0 -> Optional.of(alo.a(mb.bg, $$0.a().f("blocks/")));
      private alh<dkd, String> o = $$0 -> ae.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      etv v = etv.a;
      boolean w = true;
      dyo x = dyo.a;
      boolean y;
      dxn.e<bvi<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jm.b) && $$0.k() < 14;
      dxn.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dxn.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dxn.f C = this.B;
      dxn.f D = ($$0, $$1, $$2) -> false;
      dxn.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      csk G = csm.g;
      @Nullable
      dxn.b H;

      private d() {
      }

      public static dxn.d a() {
         return new dxn.d();
      }

      public static dxn.d a(dxn $$0) {
         dxn.d $$1 = b($$0);
         dxn.d $$2 = $$0.aQ;
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
      public static dxn.d b(dxn $$0) {
         dxn.d $$1 = new dxn.d();
         dxn.d $$2 = $$0.aQ;
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

      public dxn.d a(cwd $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dxn.d a(etu $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dxn.d a(Function<dxo, etu> $$0) {
         this.b = $$0;
         return this;
      }

      public dxn.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dxn.d c() {
         this.p = false;
         return this;
      }

      public dxn.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dxn.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dxn.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dxn.d a(drv $$0) {
         this.d = $$0;
         return this;
      }

      public dxn.d a(ToIntFunction<dxo> $$0) {
         this.e = $$0;
         return this;
      }

      public dxn.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dxn.d d() {
         return this.d(0.0F);
      }

      public dxn.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dxn.d e() {
         this.i = true;
         return this;
      }

      public dxn.d f() {
         this.F = true;
         return this;
      }

      public dxn.d g() {
         this.n = alh.fixed(Optional.empty());
         return this;
      }

      public dxn.d a(Optional<alo<ewn>> $$0) {
         this.n = alh.fixed($$0);
         return this;
      }

      protected Optional<alo<ewn>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dxn.d i() {
         this.r = true;
         return this;
      }

      public dxn.d j() {
         this.s = true;
         return this;
      }

      public dxn.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dxn.d l() {
         this.t = true;
         return this;
      }

      public dxn.d a(etv $$0) {
         this.v = $$0;
         return this;
      }

      public dxn.d m() {
         this.q = true;
         return this;
      }

      public dxn.d a(dxn.e<bvi<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dxn.d a(dxn.f $$0) {
         this.A = $$0;
         return this;
      }

      public dxn.d b(dxn.f $$0) {
         this.B = $$0;
         return this;
      }

      public dxn.d c(dxn.f $$0) {
         this.C = $$0;
         return this;
      }

      public dxn.d d(dxn.f $$0) {
         this.D = $$0;
         return this;
      }

      public dxn.d e(dxn.f $$0) {
         this.E = $$0;
         return this;
      }

      public dxn.d n() {
         this.h = true;
         return this;
      }

      public dxn.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dxn.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dxn.d a(dxn.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dkd $$2 = $$0x.b();
            long $$3 = azu.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.as_();
            double $$5 = azu.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azu.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new fbr($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dkd $$2 = $$0x.b();
            long $$3 = azu.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.au_();
            float $$5 = $$2.as_();
            double $$6 = azu.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azu.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new fbr($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dxn.d o() {
         this.w = false;
         return this;
      }

      public dxn.d a(csi... $$0) {
         this.G = csm.e.a($$0);
         return this;
      }

      public dxn.d a(dyo $$0) {
         this.x = $$0;
         return this;
      }

      public dxn.d p() {
         this.y = true;
         return this;
      }

      public dxn.d a(alo<dkd> $$0) {
         this.m = $$0;
         return this;
      }

      public dxn.d a(String $$0) {
         this.o = alh.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dxo var1, dge var2, jh var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dxo var1, dge var2, jh var3);
   }
}
