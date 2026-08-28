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

public abstract class dsc implements cpj {
   protected static final je[] aF = new je[]{je.e, je.f, je.c, je.d, je.a, je.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dmn aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cpm aO;
   protected final dsc.d aP;
   @Nullable
   protected ale<eqo> aQ;

   public dsc(dsc.d $$0) {
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

   public dsc.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dfa> a();

   protected static <B extends dfa> RecordCodecBuilder<B, dsc.d> u() {
      return dsc.d.a.fieldOf("properties").forGetter(dsc::t);
   }

   public static <B extends dfa> MapCodec<B> b(Function<dsc.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dsd $$0, dca $$1, iz $$2, int $$3, int $$4) {
   }

   protected boolean a(dsd $$0, eol $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(dbo.a, iz.c);
         case b:
            return $$0.u().a(awv.a);
         case c:
            return !$$0.r(dbo.a, iz.c);
         default:
            return false;
      }
   }

   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$0;
   }

   protected boolean a(dsd $$0, dsd $$1, je $$2) {
      return false;
   }

   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      agt.a($$1, $$2);
   }

   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
   }

   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dsd $$0, dbz $$1, iz $$2, dbr $$3, BiConsumer<cuq, iz> $$4) {
      if (!$$0.i() && $$3.j() != dbr.a.d) {
         dfa $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cmy;
         if ($$5.a($$3) && $$1 instanceof arf $$7) {
            dpi $$8 = $$0.t() ? $$1.c_($$2) : null;
            eqm.a $$9 = new eqm.a($$7).a(etf.f, evs.b($$2)).a(etf.i, cuq.l).b(etf.h, $$8).b(etf.a, $$3.g());
            if ($$3.j() == dbr.a.c) {
               $$9.a(etf.j, $$3.a());
            }

            $$0.a($$7, $$2, cuq.l, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dfc.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      return bqv.e;
   }

   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      return bqx.d;
   }

   protected boolean a(dsd $$0, dbz $$1, iz $$2, int $$3, int $$4) {
      return false;
   }

   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   protected boolean f_(dsd $$0) {
      return false;
   }

   protected boolean e_(dsd $$0) {
      return false;
   }

   protected enw b_(dsd $$0) {
      return enx.a.g();
   }

   protected boolean c_(dsd $$0) {
      return false;
   }

   protected float aq_() {
      return 0.25F;
   }

   protected float as_() {
      return 0.2F;
   }

   @Override
   public cpm i() {
      return this.aO;
   }

   protected dsd a(dsd $$0, dln $$1) {
      return $$0;
   }

   protected dsd a(dsd $$0, djx $$1) {
      return $$0;
   }

   protected boolean a(dsd $$0, cyb $$1) {
      return $$0.r() && ($$1.n().e() || !$$1.n().a(this.r()));
   }

   protected boolean a(dsd $$0, env $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cuq> a(dsd $$0, eqm.a $$1) {
      ale<eqo> $$2 = this.v();
      if ($$2 == eqf.a) {
         return Collections.emptyList();
      } else {
         eqm $$3 = $$1.a(etf.g, $$0).a(ete.r);
         arf $$4 = $$3.a();
         eqo $$5 = $$4.o().be().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dsd $$0, iz $$1) {
      return ayz.a($$1);
   }

   protected ewl f(dsd $$0, dbf $$1, iz $$2) {
      return $$0.j($$1, $$2);
   }

   protected ewl b_(dsd $$0, dbf $$1, iz $$2) {
      return this.b($$0, $$1, $$2, evx.a());
   }

   protected ewl a(dsd $$0, dbf $$1, iz $$2) {
      return ewi.a();
   }

   protected int g(dsd $$0, dbf $$1, iz $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.Q();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bqz b(dsd $$0, dbz $$1, iz $$2) {
      return null;
   }

   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return true;
   }

   protected float d(dsd $$0, dbf $$1, iz $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return 0;
   }

   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return ewi.b();
   }

   protected ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return this.aG ? $$0.j($$1, $$2) : ewi.a();
   }

   protected boolean c(dsd $$0, dbf $$1, iz $$2) {
      return dfa.a($$0.k($$1, $$2));
   }

   protected boolean h(dsd $$0, dbf $$1, iz $$2) {
      return dfa.a($$0.c($$1, $$2));
   }

   protected ewl c(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
   }

   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
   }

   protected float a(dsd $$0, cmy $$1, dbf $$2, iz $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dsd $$0, arf $$1, iz $$2, cuq $$3, boolean $$4) {
   }

   protected void a(dsd $$0, dbz $$1, iz $$2, cmy $$3) {
   }

   protected int a(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return 0;
   }

   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
   }

   protected int b(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return 0;
   }

   public final ale<eqo> v() {
      if (this.aQ == null) {
         alf $$0 = lp.e.b(this.q());
         this.aQ = ale.a(lq.aU, $$0.d("blocks/"));
      }

      return this.aQ;
   }

   protected void a(dbz $$0, dsd $$1, evo $$2, cnq $$3) {
   }

   protected boolean a_(dsd $$0, dbf $$1, iz $$2) {
      return !dfa.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean d_(dsd $$0) {
      return this.aI;
   }

   protected dmn g_(dsd $$0) {
      return this.aJ;
   }

   public abstract cul r();

   protected abstract dfa q();

   public eoa w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dsf<dfa, dsd> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eob l;
      private final eoa m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dsc.f q;
      private final dsc.f r;
      private final dsc.f s;
      private final dsc.f t;
      private final dsc.f u;
      private final Optional<dsc.b> v;
      private final boolean w;
      private final dte x;
      private final boolean y;
      @Nullable
      protected dsc.a.a a;
      private enw z = enx.a.g();
      private boolean A;

      protected a(dfa $$0, Reference2ObjectArrayMap<dtg<?>, Comparable<?>> $$1, MapCodec<dsd> $$2) {
         super($$0, $$1, $$2);
         dsc.d $$3 = $$0.aP;
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
            ewl $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               evn $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.b_(this.x());
         this.A = this.e.d_(this.x());
         if (!this.b().p()) {
            this.a = new dsc.a.a(this.x());
         }

         this.k = this.D();
      }

      public dfa b() {
         return this.e;
      }

      public ji<dfa> c() {
         return this.e.s();
      }

      @Deprecated
      public boolean d() {
         dfa $$0 = this.b();
         return $$0 != dfc.bs && $$0 != dfc.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(dbf $$0, iz $$1, btb<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(dbf $$0, iz $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(dbf $$0, iz $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public ewl a(dbf $$0, iz $$1, je $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ewi.a(this.c($$0, $$1), $$2);
      }

      public ewl c(dbf $$0, iz $$1) {
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

      public eoa d(dbf $$0, iz $$1) {
         return this.m;
      }

      public dsd a(dln $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dsd a(djx $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dlg l() {
         return this.b().a_(this.x());
      }

      public boolean e(dbf $$0, iz $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(dbf $$0, iz $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(dbf $$0, iz $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().e_(this.x());
      }

      public int b(dbf $$0, iz $$1, je $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().c_(this.x());
      }

      public int a(dbz $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(dbf $$0, iz $$1) {
         return this.n;
      }

      public float a(cmy $$0, dbf $$1, iz $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(dbf $$0, iz $$1, je $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eob o() {
         return this.l;
      }

      public boolean i(dbf $$0, iz $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dsd $$2 = this.x();
            return $$2.p() ? dfa.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dsd $$0, je $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public ewl j(dbf $$0, iz $$1) {
         return this.a($$0, $$1, evx.a());
      }

      public ewl a(dbf $$0, iz $$1, evx $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public ewl k(dbf $$0, iz $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, evx.a());
      }

      public ewl b(dbf $$0, iz $$1, evx $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ewl l(dbf $$0, iz $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public ewl c(dbf $$0, iz $$1, evx $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public ewl m(dbf $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(dbf $$0, iz $$1, bsv $$2) {
         return this.a($$0, $$1, $$2, je.b);
      }

      public final boolean a(dbf $$0, iz $$1, bsv $$2, je $$3) {
         return dfa.a(this.b($$0, $$1, evx.a($$2)), $$3);
      }

      public evs n(dbf $$0, iz $$1) {
         return this.v.<evs>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(evs.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(dbz $$0, iz $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dbz $$0, iz $$1, dfa $$2, iz $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dca $$0, iz $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dca $$0, iz $$1, int $$2, int $$3) {
         iz.a $$4 = new iz.a();

         for (je $$5 : dsc.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(dca $$0, iz $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dca $$0, iz $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dbz $$0, iz $$1, dsd $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(dbz $$0, iz $$1, dsd $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dbz $$0, iz $$1, dbr $$2, BiConsumer<cuq, iz> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(arf $$0, iz $$1, azh $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(arf $$0, iz $$1, azh $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(dbz $$0, iz $$1, bsv $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(arf $$0, iz $$1, cuq $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cuq> a(eqm.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bqx a(cuq $$0, dbz $$1, cmy $$2, bqu $$3, evo $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bqv a(dbz $$0, cmy $$1, evo $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(dbz $$0, iz $$1, cmy $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(dbf $$0, iz $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(dbf $$0, iz $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dsd a(je $$0, dsd $$1, dca $$2, iz $$3, iz $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(eol $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cyb $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(env $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(dcc $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(dbf $$0, iz $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bqz b(dbz $$0, iz $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(axf<dfa> $$0) {
         return this.b().s().a($$0);
      }

      public boolean a(axf<dfa> $$0, Predicate<dsc.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jm<dfa> $$0) {
         return $$0.a(this.b().s());
      }

      public boolean a(ji<dfa> $$0) {
         return this.a($$0.a());
      }

      public Stream<axf<dfa>> s() {
         return this.b().s().c();
      }

      public boolean t() {
         return this.b() instanceof dhs;
      }

      @Nullable
      public <T extends dpi> dpj<T> a(dbz $$0, dpk<T> $$1) {
         return this.b() instanceof dhs ? ((dhs)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dfa $$0) {
         return this.b() == $$0;
      }

      public boolean a(ale<dfa> $$0) {
         return this.b().s().a($$0);
      }

      public enw u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(iz $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dmn w() {
         return this.b().g_(this.x());
      }

      public void a(dbz $$0, dsd $$1, evo $$2, cnq $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(dbf $$0, iz $$1, je $$2) {
         return this.a($$0, $$1, $$2, dnb.a);
      }

      public boolean a(dbf $$0, iz $$1, je $$2, dnb $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(dbf $$0, iz $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dsd x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dte A() {
         return this.x;
      }

      static final class a {
         private static final je[] e = je.values();
         private static final int f = dnb.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final ewl[] i;
         protected final ewl b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dsd $$0) {
            dfa $$1 = $$0.b();
            this.a = $$0.i(dbo.a, iz.c);
            this.g = $$1.a_($$0, dbo.a, iz.c);
            this.h = $$1.g($$0, dbo.a, iz.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new ewl[e.length];
               ewl $$2 = $$1.f($$0, dbo.a, iz.c);

               for (je $$3 : e) {
                  this.i[$$3.ordinal()] = ewi.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, dbo.a, iz.c, evx.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lp.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(je.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (je $$4 : e) {
                  for (dnb $$5 : dnb.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, dbo.a, iz.c, $$4);
                  }
               }

               this.d = dfa.a($$0.k(dbo.a, iz.c));
            }
         }

         public boolean a(je $$0, dnb $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(je $$0, dnb $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      evs evaluate(dsd var1, dbf var2, iz var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dsc.d> a = Codec.unit(() -> a());
      Function<dsd, eoa> b = $$0 -> eoa.a;
      boolean c = true;
      dmn d = dmn.f;
      ToIntFunction<dsd> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      ale<eqo> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      eob t = eob.a;
      boolean u = true;
      dte v = dte.a;
      boolean w;
      dsc.e<btb<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, je.b) && $$0.h() < 14;
      dsc.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dsc.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dsc.f A = this.z;
      dsc.f B = ($$0, $$1, $$2) -> false;
      dsc.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cpm E = cpo.g;
      Optional<dsc.b> F = Optional.empty();

      private d() {
      }

      public static dsc.d a() {
         return new dsc.d();
      }

      public static dsc.d a(dsc $$0) {
         dsc.d $$1 = b($$0);
         dsc.d $$2 = $$0.aP;
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
      public static dsc.d b(dsc $$0) {
         dsc.d $$1 = new dsc.d();
         dsc.d $$2 = $$0.aP;
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

      public dsc.d a(ctj $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dsc.d a(eoa $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dsc.d a(Function<dsd, eoa> $$0) {
         this.b = $$0;
         return this;
      }

      public dsc.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dsc.d c() {
         this.n = false;
         return this;
      }

      public dsc.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dsc.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dsc.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dsc.d a(dmn $$0) {
         this.d = $$0;
         return this;
      }

      public dsc.d a(ToIntFunction<dsd> $$0) {
         this.e = $$0;
         return this;
      }

      public dsc.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dsc.d d() {
         return this.d(0.0F);
      }

      public dsc.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dsc.d e() {
         this.i = true;
         return this;
      }

      public dsc.d f() {
         this.D = true;
         return this;
      }

      public dsc.d g() {
         this.m = eqf.a;
         return this;
      }

      public dsc.d a(dfa $$0) {
         this.m = $$0.v();
         return this;
      }

      public dsc.d h() {
         this.p = true;
         return this;
      }

      public dsc.d i() {
         this.q = true;
         return this;
      }

      public dsc.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dsc.d k() {
         this.r = true;
         return this;
      }

      public dsc.d a(eob $$0) {
         this.t = $$0;
         return this;
      }

      public dsc.d l() {
         this.o = true;
         return this;
      }

      public dsc.d a(dsc.e<btb<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dsc.d a(dsc.f $$0) {
         this.y = $$0;
         return this;
      }

      public dsc.d b(dsc.f $$0) {
         this.z = $$0;
         return this;
      }

      public dsc.d c(dsc.f $$0) {
         this.A = $$0;
         return this;
      }

      public dsc.d d(dsc.f $$0) {
         this.B = $$0;
         return this;
      }

      public dsc.d e(dsc.f $$0) {
         this.C = $$0;
         return this;
      }

      public dsc.d m() {
         this.h = true;
         return this;
      }

      public dsc.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dsc.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dsc.d a(dsc.c $$0) {
         switch ($$0) {
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dfa $$3 = $$0x.b();
                  long $$4 = ayz.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.aq_();
                  double $$6 = ayz.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = ayz.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new evs($$6, 0.0, $$7);
               });
               break;
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dfa $$3 = $$0x.b();
                  long $$4 = ayz.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.as_();
                  float $$6 = $$3.aq_();
                  double $$7 = ayz.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = ayz.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new evs($$7, $$5, $$8);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dsc.d n() {
         this.u = false;
         return this;
      }

      public dsc.d a(cpk... $$0) {
         this.E = cpo.e.a($$0);
         return this;
      }

      public dsc.d a(dte $$0) {
         this.v = $$0;
         return this;
      }

      public dsc.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dsd var1, dbf var2, iz var3, A var4);
   }

   public interface f {
      boolean test(dsd var1, dbf var2, iz var3);
   }
}
