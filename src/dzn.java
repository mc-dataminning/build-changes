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

public abstract class dzn implements cty {
   protected static final ja[] D = new ja[]{ja.e, ja.f, ja.c, ja.d, ja.a, ja.b};
   protected final boolean E;
   protected final float F;
   protected final boolean G;
   protected final dtn H;
   protected final float I;
   protected final float J;
   protected final float K;
   protected final boolean L;
   protected final cub M;
   protected final dzn.d N;
   protected final Optional<ald<eys>> O;
   protected final String P;

   public dzn(dzn.d $$0) {
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

   public dzn.d s() {
      return this.N;
   }

   protected abstract MapCodec<? extends dlu> a();

   protected static <B extends dlu> RecordCodecBuilder<B, dzn.d> t() {
      return dzn.d.a.fieldOf("properties").forGetter(dzn::s);
   }

   public static <B extends dlu> MapCodec<B> b(Function<dzn.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dzo $$0, diq $$1, iu $$2, int $$3, int $$4) {
   }

   protected boolean a(dzo $$0, ewk $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(dif.a, iu.c);
         case b:
            return $$0.y().a(axf.a);
         case c:
            return !$$0.m(dif.a, iu.c);
         default:
            return false;
      }
   }

   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$0;
   }

   protected boolean b(dzo $$0, dzo $$1, ja $$2) {
      return false;
   }

   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
   }

   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
   }

   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
   }

   protected void a(dzo $$0, aro $$1, iu $$2, dii $$3, BiConsumer<cys, iu> $$4) {
      if (!$$0.l() && $$3.b() != dii.a.d) {
         dlu $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof cqs;
         if ($$5.a($$3)) {
            dwn $$7 = $$0.x() ? $$1.c_($$2) : null;
            eyq.a $$8 = new eyq.a($$1).a(fbh.f, fdw.b($$2)).a(fbh.i, cys.k).b(fbh.h, $$7).b(fbh.a, $$3.d());
            if ($$3.b() == dii.a.c) {
               $$8.a(fbh.j, $$3.e());
            }

            $$0.a($$1, $$2, cys.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dlw.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      return bty.e;
   }

   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      return bty.f;
   }

   protected boolean a(dzo $$0, dip $$1, iu $$2, int $$3, int $$4) {
      return false;
   }

   protected dsf a_(dzo $$0) {
      return dsf.b;
   }

   protected boolean g_(dzo $$0) {
      return false;
   }

   protected boolean f_(dzo $$0) {
      return false;
   }

   protected evv b_(dzo $$0) {
      return evw.a.g();
   }

   protected boolean c_(dzo $$0) {
      return false;
   }

   protected float an_() {
      return 0.25F;
   }

   protected float ap_() {
      return 0.2F;
   }

   @Override
   public cub k() {
      return this.M;
   }

   protected dzo a(dzo $$0, dsm $$1) {
      return $$0;
   }

   protected dzo a(dzo $$0, dqv $$1) {
      return $$0;
   }

   protected boolean a(dzo $$0, dcl $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.h()));
   }

   protected boolean a(dzo $$0, evu $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cys> a(dzo $$0, eyq.a $$1) {
      if (this.O.isEmpty()) {
         return Collections.emptyList();
      } else {
         eyq $$2 = $$1.a(fbh.g, $$0).a(fbg.r);
         aro $$3 = $$2.a();
         eys $$4 = $$3.p().bc().b(this.O.get());
         return $$4.a($$2);
      }
   }

   protected long a(dzo $$0, iu $$1) {
      return azk.a($$1);
   }

   protected feq d_(dzo $$0) {
      return $$0.f(dif.a, iu.c);
   }

   protected feq b_(dzo $$0, dhv $$1, iu $$2) {
      return this.b($$0, $$1, $$2, feb.a());
   }

   protected feq a(dzo $$0, dhv $$1, iu $$2) {
      return fen.a();
   }

   protected int i_(dzo $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bua b(dzo $$0, dip $$1, iu $$2) {
      return null;
   }

   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return true;
   }

   protected float c(dzo $$0, dhv $$1, iu $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dzo $$0, dip $$1, iu $$2) {
      return 0;
   }

   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return fen.b();
   }

   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.E ? $$0.f($$1, $$2) : fen.a();
   }

   protected feq a(dzo $$0, dhv $$1, iu $$2, bwa $$3) {
      return fen.b();
   }

   protected boolean a_(dzo $$0, dhv $$1, iu $$2) {
      return dlu.a($$0.g($$1, $$2));
   }

   protected feq c(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
   }

   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
   }

   protected float a(dzo $$0, cqs $$1, dhv $$2, iu $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dzo $$0, aro $$1, iu $$2, cys $$3, boolean $$4) {
   }

   protected void a_(dzo $$0, dip $$1, iu $$2, cqs $$3) {
   }

   protected int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return 0;
   }

   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
   }

   protected int b(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return 0;
   }

   public final Optional<ald<eys>> u() {
      return this.O;
   }

   public final String v() {
      return this.P;
   }

   protected void a(dip $$0, dzo $$1, fds $$2, crm $$3) {
   }

   protected boolean e_(dzo $$0) {
      return !dlu.a($$0.f(dif.a, iu.c)) && $$0.y().c();
   }

   protected boolean f(dzo $$0) {
      return this.G;
   }

   protected dtn h_(dzo $$0) {
      return this.H;
   }

   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return new cys(this.h());
   }

   public abstract cyo h();

   protected abstract dlu o();

   public evz w() {
      return this.N.b.apply(this.o().m());
   }

   public float x() {
      return this.N.g;
   }

   public abstract static class a extends dzq<dlu, dzo> {
      private static final ja[] a = ja.values();
      private static final feq[] f = af.a(new feq[a.length], $$0 -> Arrays.fill($$0, fen.a()));
      private static final feq[] g = af.a(new feq[a.length], $$0 -> Arrays.fill($$0, fen.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final ewa n;
      private final evz o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dzn.f s;
      private final dzn.f t;
      private final dzn.f u;
      private final dzn.f v;
      private final dzn.f w;
      @Nullable
      private final dzn.b x;
      private final boolean y;
      private final eap z;
      private final boolean A;
      @Nullable
      private dzn.a.a B;
      private evv C = evw.a.g();
      private boolean D;
      private boolean E;
      private feq F;
      private feq[] G;
      private boolean H;
      private int I;

      protected a(dlu $$0, Reference2ObjectArrayMap<ear<?>, Comparable<?>> $$1, MapCodec<dzo> $$2) {
         super($$0, $$1, $$2);
         dzn.d $$3 = $$0.N;
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
            feq $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               fdr $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new dzn.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fen.a();
         this.E = dlu.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new feq[a.length];

            for (ja $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dlu b() {
         return this.d;
      }

      public je<dlu> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dlu $$0 = this.b();
         return $$0 != dlw.bz && $$0 != dlw.nA && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dhv $$0, iu $$1, bwj<?> $$2) {
         return this.b().N.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public feq a(ja $$0) {
         return this.G[$$0.ordinal()];
      }

      public feq h() {
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

      public evz a(dhv $$0, iu $$1) {
         return this.o;
      }

      public dzo a(dsm $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dzo a(dqv $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dsf o() {
         return this.b().a_(this.B());
      }

      public boolean b(dhv $$0, iu $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dhv $$0, iu $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dhv $$0, iu $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dhv $$0, iu $$1, ja $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dip $$0, iu $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dhv $$0, iu $$1) {
         return this.p;
      }

      public float a(cqs $$0, dhv $$1, iu $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dhv $$0, iu $$1, ja $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public ewa r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dzo $$0, ja $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public feq f(dhv $$0, iu $$1) {
         return this.a($$0, $$1, feb.a());
      }

      public feq a(dhv $$0, iu $$1, feb $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public feq g(dhv $$0, iu $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, feb.a());
      }

      public feq b(dhv $$0, iu $$1, feb $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public feq a(dhv $$0, iu $$1, bwa $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public feq h(dhv $$0, iu $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public feq c(dhv $$0, iu $$1, feb $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public feq i(dhv $$0, iu $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean b(dhv $$0, iu $$1, bwa $$2) {
         return this.a($$0, $$1, $$2, ja.b);
      }

      public final boolean a(dhv $$0, iu $$1, bwa $$2, ja $$3) {
         return dlu.a(this.b($$0, $$1, feb.a($$2)), $$3);
      }

      public fdw a(iu $$0) {
         dzn.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : fdw.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dip $$0, iu $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dip $$0, iu $$1, dlu $$2, @Nullable exd $$3, boolean $$4) {
         agk.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(diq $$0, iu $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(diq $$0, iu $$1, int $$2, int $$3) {
         iu.a $$4 = new iu.a();

         for (ja $$5 : dzn.D) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(diq $$0, iu $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(diq $$0, iu $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dip $$0, iu $$1, dzo $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(aro $$0, iu $$1, boolean $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(aro $$0, iu $$1, dii $$2, BiConsumer<cys, iu> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(aro $$0, iu $$1, azt $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(aro $$0, iu $$1, azt $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dip $$0, iu $$1, bwa $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(aro $$0, iu $$1, cys $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cys> a(eyq.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bty a(cys $$0, dip $$1, cqs $$2, btx $$3, fds $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bty a(dip $$0, cqs $$1, fds $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dip $$0, iu $$1, cqs $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dhv $$0, iu $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dhv $$0, iu $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dzo a(dis $$0, dje $$1, iu $$2, ja $$3, iu $$4, dzo $$5, azt $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(ewk $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(dcl $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(evu $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dis $$0, iu $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dhv $$0, iu $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bua b(dip $$0, iu $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axp<dlu> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axp<dlu> $$0, Predicate<dzn.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ji<dlu> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(je<dlu> $$0) {
         return this.a($$0.a());
      }

      public Stream<axp<dlu>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof don;
      }

      @Nullable
      public <T extends dwn> dwo<T> a(dip $$0, dwp<T> $$1) {
         return this.b() instanceof don ? ((don)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dlu $$0) {
         return this.b() == $$0;
      }

      public boolean a(ald<dlu> $$0) {
         return this.b().p().a($$0);
      }

      public evv y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(iu $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dtn A() {
         return this.b().h_(this.B());
      }

      public void a(dip $$0, dzo $$1, fds $$2, crm $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dhv $$0, iu $$1, ja $$2) {
         return this.a($$0, $$1, $$2, dub.a);
      }

      public boolean a(dhv $$0, iu $$1, ja $$2, dub $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dhv $$0, iu $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      public cys a(dis $$0, iu $$1, boolean $$2) {
         return this.b().a($$0, $$1, this.B(), $$2);
      }

      protected abstract dzo B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public eap E() {
         return this.z;
      }

      static final class a {
         private static final ja[] d = ja.values();
         private static final int e = dub.values().length;
         protected final feq a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dzo $$0) {
            dlu $$1 = $$0.b();
            this.a = $$1.b($$0, dif.a, iu.c, feb.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", mf.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(ja.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (ja $$2 : d) {
                  for (dub $$3 : dub.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, dif.a, iu.c, $$2);
                  }
               }

               this.c = dlu.a($$0.g(dif.a, iu.c));
            }
         }

         public boolean a(ja $$0, dub $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(ja $$0, dub $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      fdw evaluate(dzo var1, iu var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dzn.d> a = Codec.unit(() -> a());
      Function<dzo, evz> b = $$0 -> evz.a;
      boolean c = true;
      dtn d = dtn.f;
      ToIntFunction<dzo> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private ald<dlu> m;
      private akw<dlu, Optional<ald<eys>>> n = $$0 -> Optional.of(ald.a(mg.bo, $$0.a().f("blocks/")));
      private akw<dlu, String> o = $$0 -> af.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      ewa v = ewa.a;
      boolean w = true;
      eap x = eap.a;
      boolean y;
      dzn.e<bwj<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, ja.b) && $$0.k() < 14;
      dzn.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dzn.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dzn.f C = this.B;
      dzn.f D = ($$0, $$1, $$2) -> false;
      dzn.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      cub G = cud.g;
      @Nullable
      dzn.b H;

      private d() {
      }

      public static dzn.d a() {
         return new dzn.d();
      }

      public static dzn.d a(dzn $$0) {
         dzn.d $$1 = b($$0);
         dzn.d $$2 = $$0.N;
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
      public static dzn.d b(dzn $$0) {
         dzn.d $$1 = new dzn.d();
         dzn.d $$2 = $$0.N;
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

      public dzn.d a(cxq $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dzn.d a(evz $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dzn.d a(Function<dzo, evz> $$0) {
         this.b = $$0;
         return this;
      }

      public dzn.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dzn.d c() {
         this.p = false;
         return this;
      }

      public dzn.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dzn.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dzn.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dzn.d a(dtn $$0) {
         this.d = $$0;
         return this;
      }

      public dzn.d a(ToIntFunction<dzo> $$0) {
         this.e = $$0;
         return this;
      }

      public dzn.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dzn.d d() {
         return this.d(0.0F);
      }

      public dzn.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dzn.d e() {
         this.i = true;
         return this;
      }

      public dzn.d f() {
         this.F = true;
         return this;
      }

      public dzn.d g() {
         this.n = akw.fixed(Optional.empty());
         return this;
      }

      public dzn.d a(Optional<ald<eys>> $$0) {
         this.n = akw.fixed($$0);
         return this;
      }

      protected Optional<ald<eys>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dzn.d i() {
         this.r = true;
         return this;
      }

      public dzn.d j() {
         this.s = true;
         return this;
      }

      public dzn.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dzn.d l() {
         this.t = true;
         return this;
      }

      public dzn.d a(ewa $$0) {
         this.v = $$0;
         return this;
      }

      public dzn.d m() {
         this.q = true;
         return this;
      }

      public dzn.d a(dzn.e<bwj<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dzn.d a(dzn.f $$0) {
         this.A = $$0;
         return this;
      }

      public dzn.d b(dzn.f $$0) {
         this.B = $$0;
         return this;
      }

      public dzn.d c(dzn.f $$0) {
         this.C = $$0;
         return this;
      }

      public dzn.d d(dzn.f $$0) {
         this.D = $$0;
         return this;
      }

      public dzn.d e(dzn.f $$0) {
         this.E = $$0;
         return this;
      }

      public dzn.d n() {
         this.h = true;
         return this;
      }

      public dzn.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dzn.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dzn.d a(dzn.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dlu $$2 = $$0x.b();
            long $$3 = azk.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.an_();
            double $$5 = azk.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azk.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new fdw($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dlu $$2 = $$0x.b();
            long $$3 = azk.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.ap_();
            float $$5 = $$2.an_();
            double $$6 = azk.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azk.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new fdw($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dzn.d o() {
         this.w = false;
         return this;
      }

      public dzn.d a(ctz... $$0) {
         this.G = cud.e.a($$0);
         return this;
      }

      public dzn.d a(eap $$0) {
         this.x = $$0;
         return this;
      }

      public dzn.d p() {
         this.y = true;
         return this;
      }

      public dzn.d a(ald<dlu> $$0) {
         this.m = $$0;
         return this;
      }

      public dzn.d a(String $$0) {
         this.o = akw.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dzo var1, dhv var2, iu var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dzo var1, dhv var2, iu var3);
   }
}
