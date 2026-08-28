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

public abstract class dsk implements cow {
   protected static final jf[] aF = new jf[]{jf.e, jf.f, jf.c, jf.d, jf.a, jf.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dmv aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final coz aO;
   protected final dsk.d aP;
   @Nullable
   protected akj<erb> aQ;

   public dsk(dsk.d $$0) {
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

   public dsk.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dfi> a();

   protected static <B extends dfi> RecordCodecBuilder<B, dsk.d> u() {
      return dsk.d.a.fieldOf("properties").forGetter(dsk::t);
   }

   public static <B extends dfi> MapCodec<B> b(Function<dsk.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dsl $$0, dch $$1, ja $$2, int $$3, int $$4) {
   }

   protected boolean a(dsl $$0, eoy $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(dbv.a, ja.c);
         case b:
            return $$0.u().a(awc.a);
         case c:
            return !$$0.r(dbv.a, ja.c);
         default:
            return false;
      }
   }

   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$0;
   }

   protected boolean a(dsl $$0, dsl $$1, jf $$2) {
      return false;
   }

   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      afy.a($$1, $$2);
   }

   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
   }

   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dsl $$0, dcg $$1, ja $$2, dby $$3, BiConsumer<cud, ja> $$4) {
      if (!$$0.i() && $$3.j() != dby.a.d) {
         dfi $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cml;
         if ($$5.a($$3) && $$1 instanceof aqm $$7) {
            dpq $$8 = $$0.t() ? $$1.c_($$2) : null;
            eqz.a $$9 = new eqz.a($$7).a(ets.f, ewh.b($$2)).a(ets.i, cud.l).b(ets.h, $$8).b(ets.a, $$3.g());
            if ($$3.j() == dby.a.c) {
               $$9.a(ets.j, $$3.a());
            }

            $$0.a($$7, $$2, cud.l, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dfk.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      return bqh.e;
   }

   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      return bqj.d;
   }

   protected boolean a(dsl $$0, dcg $$1, ja $$2, int $$3, int $$4) {
      return false;
   }

   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   protected boolean f_(dsl $$0) {
      return false;
   }

   protected boolean e_(dsl $$0) {
      return false;
   }

   protected eoj b_(dsl $$0) {
      return eok.a.g();
   }

   protected boolean c_(dsl $$0) {
      return false;
   }

   protected float ar_() {
      return 0.25F;
   }

   protected float at_() {
      return 0.2F;
   }

   @Override
   public coz i() {
      return this.aO;
   }

   protected dsl a(dsl $$0, dlv $$1) {
      return $$0;
   }

   protected dsl a(dsl $$0, dkf $$1) {
      return $$0;
   }

   protected boolean a(dsl $$0, cxn $$1) {
      return $$0.r() && ($$1.n().e() || !$$1.n().a(this.r()));
   }

   protected boolean a(dsl $$0, eoi $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cud> a(dsl $$0, eqz.a $$1) {
      akj<erb> $$2 = this.v();
      if ($$2 == eqs.a) {
         return Collections.emptyList();
      } else {
         eqz $$3 = $$1.a(ets.g, $$0).a(etr.r);
         aqm $$4 = $$3.a();
         erb $$5 = $$4.o().bf().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dsl $$0, ja $$1) {
      return ayg.a($$1);
   }

   protected exa f(dsl $$0, dbm $$1, ja $$2) {
      return $$0.j($$1, $$2);
   }

   protected exa b_(dsl $$0, dbm $$1, ja $$2) {
      return this.b($$0, $$1, $$2, ewm.a());
   }

   protected exa a(dsl $$0, dbm $$1, ja $$2) {
      return ewx.a();
   }

   protected int g(dsl $$0, dbm $$1, ja $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.Q();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bql b(dsl $$0, dcg $$1, ja $$2) {
      return null;
   }

   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return true;
   }

   protected float d(dsl $$0, dbm $$1, ja $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return 0;
   }

   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return ewx.b();
   }

   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return this.aG ? $$0.j($$1, $$2) : ewx.a();
   }

   protected boolean c(dsl $$0, dbm $$1, ja $$2) {
      return dfi.a($$0.k($$1, $$2));
   }

   protected boolean h(dsl $$0, dbm $$1, ja $$2) {
      return dfi.a($$0.c($$1, $$2));
   }

   protected exa c(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
   }

   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
   }

   protected float a(dsl $$0, cml $$1, dbm $$2, ja $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dsl $$0, aqm $$1, ja $$2, cud $$3, boolean $$4) {
   }

   protected void a_(dsl $$0, dcg $$1, ja $$2, cml $$3) {
   }

   protected int a(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return 0;
   }

   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
   }

   protected int b(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return 0;
   }

   public final akj<erb> v() {
      if (this.aQ == null) {
         akk $$0 = lq.e.b(this.q());
         this.aQ = akj.a(lr.bb, $$0.d("blocks/"));
      }

      return this.aQ;
   }

   protected void a(dcg $$0, dsl $$1, ewd $$2, cnd $$3) {
   }

   protected boolean a_(dsl $$0, dbm $$1, ja $$2) {
      return !dfi.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean d_(dsl $$0) {
      return this.aI;
   }

   protected dmv g_(dsl $$0) {
      return this.aJ;
   }

   public abstract cty r();

   protected abstract dfi q();

   public eon w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dsn<dfi, dsl> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eoo l;
      private final eon m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dsk.f q;
      private final dsk.f r;
      private final dsk.f s;
      private final dsk.f t;
      private final dsk.f u;
      private final Optional<dsk.b> v;
      private final boolean w;
      private final dtm x;
      private final boolean y;
      @Nullable
      protected dsk.a.a a;
      private eoj z = eok.a.g();
      private boolean A;

      protected a(dfi $$0, Reference2ObjectArrayMap<dto<?>, Comparable<?>> $$1, MapCodec<dsl> $$2) {
         super($$0, $$1, $$2);
         dsk.d $$3 = $$0.aP;
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
            exa $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               ewc $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.b_(this.x());
         this.A = this.e.d_(this.x());
         if (!this.b().p()) {
            this.a = new dsk.a.a(this.x());
         }

         this.k = this.D();
      }

      public dfi b() {
         return this.e;
      }

      public jj<dfi> c() {
         return this.e.s();
      }

      @Deprecated
      public boolean d() {
         dfi $$0 = this.b();
         return $$0 != dfk.bs && $$0 != dfk.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(dbm $$0, ja $$1, bsn<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(dbm $$0, ja $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(dbm $$0, ja $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public exa a(dbm $$0, ja $$1, jf $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ewx.a(this.c($$0, $$1), $$2);
      }

      public exa c(dbm $$0, ja $$1) {
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

      public eon d(dbm $$0, ja $$1) {
         return this.m;
      }

      public dsl a(dlv $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dsl a(dkf $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dlo l() {
         return this.b().a_(this.x());
      }

      public boolean e(dbm $$0, ja $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(dbm $$0, ja $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(dbm $$0, ja $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().e_(this.x());
      }

      public int b(dbm $$0, ja $$1, jf $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().c_(this.x());
      }

      public int a(dcg $$0, ja $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(dbm $$0, ja $$1) {
         return this.n;
      }

      public float a(cml $$0, dbm $$1, ja $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(dbm $$0, ja $$1, jf $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eoo o() {
         return this.l;
      }

      public boolean i(dbm $$0, ja $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dsl $$2 = this.x();
            return $$2.p() ? dfi.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dsl $$0, jf $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public exa j(dbm $$0, ja $$1) {
         return this.a($$0, $$1, ewm.a());
      }

      public exa a(dbm $$0, ja $$1, ewm $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public exa k(dbm $$0, ja $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, ewm.a());
      }

      public exa b(dbm $$0, ja $$1, ewm $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public exa l(dbm $$0, ja $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public exa c(dbm $$0, ja $$1, ewm $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public exa m(dbm $$0, ja $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(dbm $$0, ja $$1, bsh $$2) {
         return this.a($$0, $$1, $$2, jf.b);
      }

      public final boolean a(dbm $$0, ja $$1, bsh $$2, jf $$3) {
         return dfi.a(this.b($$0, $$1, ewm.a($$2)), $$3);
      }

      public ewh n(dbm $$0, ja $$1) {
         return this.v.<ewh>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(ewh.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(dcg $$0, ja $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dcg $$0, ja $$1, dfi $$2, ja $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dch $$0, ja $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dch $$0, ja $$1, int $$2, int $$3) {
         ja.a $$4 = new ja.a();

         for (jf $$5 : dsk.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(dch $$0, ja $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dch $$0, ja $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dcg $$0, ja $$1, dsl $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(dcg $$0, ja $$1, dsl $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dcg $$0, ja $$1, dby $$2, BiConsumer<cud, ja> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(aqm $$0, ja $$1, ayo $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(aqm $$0, ja $$1, ayo $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(dcg $$0, ja $$1, bsh $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(aqm $$0, ja $$1, cud $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cud> a(eqz.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bqj a(cud $$0, dcg $$1, cml $$2, bqg $$3, ewd $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bqh a(dcg $$0, cml $$1, ewd $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(dcg $$0, ja $$1, cml $$2) {
         this.b().a_(this.x(), $$0, $$1, $$2);
      }

      public boolean o(dbm $$0, ja $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(dbm $$0, ja $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dsl a(jf $$0, dsl $$1, dch $$2, ja $$3, ja $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(eoy $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cxn $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(eoi $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(dcj $$0, ja $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(dbm $$0, ja $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bql b(dcg $$0, ja $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(awm<dfi> $$0) {
         return this.b().s().a($$0);
      }

      public boolean a(awm<dfi> $$0, Predicate<dsk.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jn<dfi> $$0) {
         return $$0.a(this.b().s());
      }

      public boolean a(jj<dfi> $$0) {
         return this.a($$0.a());
      }

      public Stream<awm<dfi>> s() {
         return this.b().s().c();
      }

      public boolean t() {
         return this.b() instanceof dia;
      }

      @Nullable
      public <T extends dpq> dpr<T> a(dcg $$0, dps<T> $$1) {
         return this.b() instanceof dia ? ((dia)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dfi $$0) {
         return this.b() == $$0;
      }

      public boolean a(akj<dfi> $$0) {
         return this.b().s().a($$0);
      }

      public eoj u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(ja $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dmv w() {
         return this.b().g_(this.x());
      }

      public void a(dcg $$0, dsl $$1, ewd $$2, cnd $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(dbm $$0, ja $$1, jf $$2) {
         return this.a($$0, $$1, $$2, dnj.a);
      }

      public boolean a(dbm $$0, ja $$1, jf $$2, dnj $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(dbm $$0, ja $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dsl x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dtm A() {
         return this.x;
      }

      static final class a {
         private static final jf[] e = jf.values();
         private static final int f = dnj.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final exa[] i;
         protected final exa b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dsl $$0) {
            dfi $$1 = $$0.b();
            this.a = $$0.i(dbv.a, ja.c);
            this.g = $$1.a_($$0, dbv.a, ja.c);
            this.h = $$1.g($$0, dbv.a, ja.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new exa[e.length];
               exa $$2 = $$1.f($$0, dbv.a, ja.c);

               for (jf $$3 : e) {
                  this.i[$$3.ordinal()] = ewx.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, dbv.a, ja.c, ewm.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lq.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(jf.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (jf $$4 : e) {
                  for (dnj $$5 : dnj.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, dbv.a, ja.c, $$4);
                  }
               }

               this.d = dfi.a($$0.k(dbv.a, ja.c));
            }
         }

         public boolean a(jf $$0, dnj $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(jf $$0, dnj $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      ewh evaluate(dsl var1, dbm var2, ja var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dsk.d> a = Codec.unit(() -> a());
      Function<dsl, eon> b = $$0 -> eon.a;
      boolean c = true;
      dmv d = dmv.f;
      ToIntFunction<dsl> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      akj<erb> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      eoo t = eoo.a;
      boolean u = true;
      dtm v = dtm.a;
      boolean w;
      dsk.e<bsn<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, jf.b) && $$0.h() < 14;
      dsk.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dsk.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dsk.f A = this.z;
      dsk.f B = ($$0, $$1, $$2) -> false;
      dsk.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      coz E = cpb.f;
      Optional<dsk.b> F = Optional.empty();

      private d() {
      }

      public static dsk.d a() {
         return new dsk.d();
      }

      public static dsk.d a(dsk $$0) {
         dsk.d $$1 = b($$0);
         dsk.d $$2 = $$0.aP;
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
      public static dsk.d b(dsk $$0) {
         dsk.d $$1 = new dsk.d();
         dsk.d $$2 = $$0.aP;
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

      public dsk.d a(csw $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dsk.d a(eon $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dsk.d a(Function<dsl, eon> $$0) {
         this.b = $$0;
         return this;
      }

      public dsk.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dsk.d c() {
         this.n = false;
         return this;
      }

      public dsk.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dsk.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dsk.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dsk.d a(dmv $$0) {
         this.d = $$0;
         return this;
      }

      public dsk.d a(ToIntFunction<dsl> $$0) {
         this.e = $$0;
         return this;
      }

      public dsk.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dsk.d d() {
         return this.d(0.0F);
      }

      public dsk.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dsk.d e() {
         this.i = true;
         return this;
      }

      public dsk.d f() {
         this.D = true;
         return this;
      }

      public dsk.d g() {
         this.m = eqs.a;
         return this;
      }

      public dsk.d a(dfi $$0) {
         this.m = $$0.v();
         return this;
      }

      public dsk.d h() {
         this.p = true;
         return this;
      }

      public dsk.d i() {
         this.q = true;
         return this;
      }

      public dsk.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dsk.d k() {
         this.r = true;
         return this;
      }

      public dsk.d a(eoo $$0) {
         this.t = $$0;
         return this;
      }

      public dsk.d l() {
         this.o = true;
         return this;
      }

      public dsk.d a(dsk.e<bsn<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dsk.d a(dsk.f $$0) {
         this.y = $$0;
         return this;
      }

      public dsk.d b(dsk.f $$0) {
         this.z = $$0;
         return this;
      }

      public dsk.d c(dsk.f $$0) {
         this.A = $$0;
         return this;
      }

      public dsk.d d(dsk.f $$0) {
         this.B = $$0;
         return this;
      }

      public dsk.d e(dsk.f $$0) {
         this.C = $$0;
         return this;
      }

      public dsk.d m() {
         this.h = true;
         return this;
      }

      public dsk.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dsk.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dsk.d a(dsk.c $$0) {
         switch ($$0) {
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dfi $$3 = $$0x.b();
                  long $$4 = ayg.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.ar_();
                  double $$6 = ayg.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = ayg.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new ewh($$6, 0.0, $$7);
               });
               break;
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dfi $$3 = $$0x.b();
                  long $$4 = ayg.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.at_();
                  float $$6 = $$3.ar_();
                  double $$7 = ayg.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = ayg.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new ewh($$7, $$5, $$8);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dsk.d n() {
         this.u = false;
         return this;
      }

      public dsk.d a(cox... $$0) {
         this.E = cpb.d.a($$0);
         return this;
      }

      public dsk.d a(dtm $$0) {
         this.v = $$0;
         return this;
      }

      public dsk.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dsl var1, dbm var2, ja var3, A var4);
   }

   public interface f {
      boolean test(dsl var1, dbm var2, ja var3);
   }
}
