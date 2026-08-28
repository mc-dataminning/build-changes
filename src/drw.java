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

public abstract class drw implements cpd {
   protected static final je[] aF = new je[]{je.e, je.f, je.c, je.d, je.a, je.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dmh aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cpg aO;
   protected final drw.d aP;
   @Nullable
   protected ala<eqi> aQ;

   public drw(drw.d $$0) {
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

   public drw.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends deu> a();

   protected static <B extends deu> RecordCodecBuilder<B, drw.d> u() {
      return drw.d.a.fieldOf("properties").forGetter(drw::t);
   }

   public static <B extends deu> MapCodec<B> b(Function<drw.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(drx $$0, dbu $$1, iz $$2, int $$3, int $$4) {
   }

   protected boolean a(drx $$0, eof $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(dbi.a, iz.c);
         case b:
            return $$0.u().a(awr.a);
         case c:
            return !$$0.r(dbi.a, iz.c);
         default:
            return false;
      }
   }

   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$0;
   }

   protected boolean a(drx $$0, drx $$1, je $$2) {
      return false;
   }

   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      agp.a($$1, $$2);
   }

   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
   }

   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(drx $$0, dbt $$1, iz $$2, dbl $$3, BiConsumer<cuk, iz> $$4) {
      if (!$$0.i() && $$3.j() != dbl.a.d) {
         deu $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cms;
         if ($$5.a($$3) && $$1 instanceof arb $$7) {
            dpc $$8 = $$0.t() ? $$1.c_($$2) : null;
            eqg.a $$9 = new eqg.a($$7).a(esz.f, evm.b($$2)).a(esz.i, cuk.l).b(esz.h, $$8).b(esz.a, $$3.g());
            if ($$3.j() == dbl.a.c) {
               $$9.a(esz.j, $$3.a());
            }

            $$0.a($$7, $$2, cuk.l, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dew.a.n(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      return bqp.e;
   }

   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      return bqr.d;
   }

   protected boolean a(drx $$0, dbt $$1, iz $$2, int $$3, int $$4) {
      return false;
   }

   protected dla a_(drx $$0) {
      return dla.c;
   }

   protected boolean f_(drx $$0) {
      return false;
   }

   protected boolean e_(drx $$0) {
      return false;
   }

   protected enq b_(drx $$0) {
      return enr.a.g();
   }

   protected boolean c_(drx $$0) {
      return false;
   }

   protected float as_() {
      return 0.25F;
   }

   protected float au_() {
      return 0.2F;
   }

   @Override
   public cpg i() {
      return this.aO;
   }

   protected drx a(drx $$0, dlh $$1) {
      return $$0;
   }

   protected drx a(drx $$0, djr $$1) {
      return $$0;
   }

   protected boolean a(drx $$0, cxv $$1) {
      return $$0.r() && ($$1.n().e() || !$$1.n().a(this.r()));
   }

   protected boolean a(drx $$0, enp $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cuk> a(drx $$0, eqg.a $$1) {
      ala<eqi> $$2 = this.v();
      if ($$2 == epz.a) {
         return Collections.emptyList();
      } else {
         eqg $$3 = $$1.a(esz.g, $$0).a(esy.r);
         arb $$4 = $$3.a();
         eqi $$5 = $$4.o().be().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(drx $$0, iz $$1) {
      return ayu.a($$1);
   }

   protected ewf f(drx $$0, daz $$1, iz $$2) {
      return $$0.j($$1, $$2);
   }

   protected ewf b_(drx $$0, daz $$1, iz $$2) {
      return this.b($$0, $$1, $$2, evr.a());
   }

   protected ewf a(drx $$0, daz $$1, iz $$2) {
      return ewc.a();
   }

   protected int g(drx $$0, daz $$1, iz $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.Q();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bqt b(drx $$0, dbt $$1, iz $$2) {
      return null;
   }

   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return true;
   }

   protected float d(drx $$0, daz $$1, iz $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(drx $$0, dbt $$1, iz $$2) {
      return 0;
   }

   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return ewc.b();
   }

   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      return this.aG ? $$0.j($$1, $$2) : ewc.a();
   }

   protected boolean c(drx $$0, daz $$1, iz $$2) {
      return deu.a($$0.k($$1, $$2));
   }

   protected boolean h(drx $$0, daz $$1, iz $$2) {
      return deu.a($$0.c($$1, $$2));
   }

   protected ewf c(drx $$0, daz $$1, iz $$2, evr $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
   }

   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
   }

   protected float a(drx $$0, cms $$1, daz $$2, iz $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(drx $$0, arb $$1, iz $$2, cuk $$3, boolean $$4) {
   }

   protected void a(drx $$0, dbt $$1, iz $$2, cms $$3) {
   }

   protected int a(drx $$0, daz $$1, iz $$2, je $$3) {
      return 0;
   }

   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
   }

   protected int b(drx $$0, daz $$1, iz $$2, je $$3) {
      return 0;
   }

   public final ala<eqi> v() {
      if (this.aQ == null) {
         alb $$0 = lp.e.b(this.p());
         this.aQ = ala.a(lq.aU, $$0.d("blocks/"));
      }

      return this.aQ;
   }

   protected void a(dbt $$0, drx $$1, evi $$2, cnk $$3) {
   }

   protected boolean a_(drx $$0, daz $$1, iz $$2) {
      return !deu.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean d_(drx $$0) {
      return this.aI;
   }

   protected dmh g_(drx $$0) {
      return this.aJ;
   }

   public abstract cuf r();

   protected abstract deu p();

   public enu w() {
      return this.aP.b.apply(this.p().n());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends drz<deu, drx> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final env l;
      private final enu m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final drw.f q;
      private final drw.f r;
      private final drw.f s;
      private final drw.f t;
      private final drw.f u;
      private final Optional<drw.b> v;
      private final boolean w;
      private final dsy x;
      private final boolean y;
      @Nullable
      protected drw.a.a a;
      private enq z = enr.a.g();
      private boolean A;

      protected a(deu $$0, Reference2ObjectArrayMap<dta<?>, Comparable<?>> $$1, MapCodec<drx> $$2) {
         super($$0, $$1, $$2);
         drw.d $$3 = $$0.aP;
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
            ewf $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               evh $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.b_(this.x());
         this.A = this.e.d_(this.x());
         if (!this.b().o()) {
            this.a = new drw.a.a(this.x());
         }

         this.k = this.D();
      }

      public deu b() {
         return this.e;
      }

      public ji<deu> c() {
         return this.e.q();
      }

      @Deprecated
      public boolean d() {
         deu $$0 = this.b();
         return $$0 != dew.bs && $$0 != dew.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(daz $$0, iz $$1, bsv<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(daz $$0, iz $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(daz $$0, iz $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public ewf a(daz $$0, iz $$1, je $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ewc.a(this.c($$0, $$1), $$2);
      }

      public ewf c(daz $$0, iz $$1) {
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

      public enu d(daz $$0, iz $$1) {
         return this.m;
      }

      public drx a(dlh $$0) {
         return this.b().a(this.x(), $$0);
      }

      public drx a(djr $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dla l() {
         return this.b().a_(this.x());
      }

      public boolean e(daz $$0, iz $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(daz $$0, iz $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(daz $$0, iz $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().e_(this.x());
      }

      public int b(daz $$0, iz $$1, je $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().c_(this.x());
      }

      public int a(dbt $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(daz $$0, iz $$1) {
         return this.n;
      }

      public float a(cms $$0, daz $$1, iz $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(daz $$0, iz $$1, je $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public env o() {
         return this.l;
      }

      public boolean i(daz $$0, iz $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            drx $$2 = this.x();
            return $$2.p() ? deu.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(drx $$0, je $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public ewf j(daz $$0, iz $$1) {
         return this.a($$0, $$1, evr.a());
      }

      public ewf a(daz $$0, iz $$1, evr $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public ewf k(daz $$0, iz $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, evr.a());
      }

      public ewf b(daz $$0, iz $$1, evr $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ewf l(daz $$0, iz $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public ewf c(daz $$0, iz $$1, evr $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public ewf m(daz $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(daz $$0, iz $$1, bsp $$2) {
         return this.a($$0, $$1, $$2, je.b);
      }

      public final boolean a(daz $$0, iz $$1, bsp $$2, je $$3) {
         return deu.a(this.b($$0, $$1, evr.a($$2)), $$3);
      }

      public evm n(daz $$0, iz $$1) {
         return this.v.<evm>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(evm.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(dbt $$0, iz $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dbt $$0, iz $$1, deu $$2, iz $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dbu $$0, iz $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dbu $$0, iz $$1, int $$2, int $$3) {
         iz.a $$4 = new iz.a();

         for (je $$5 : drw.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(dbu $$0, iz $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dbu $$0, iz $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dbt $$0, iz $$1, drx $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(dbt $$0, iz $$1, drx $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dbt $$0, iz $$1, dbl $$2, BiConsumer<cuk, iz> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(arb $$0, iz $$1, azc $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(arb $$0, iz $$1, azc $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(dbt $$0, iz $$1, bsp $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(arb $$0, iz $$1, cuk $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cuk> a(eqg.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bqr a(cuk $$0, dbt $$1, cms $$2, bqo $$3, evi $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bqp a(dbt $$0, cms $$1, evi $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(dbt $$0, iz $$1, cms $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(daz $$0, iz $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(daz $$0, iz $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public drx a(je $$0, drx $$1, dbu $$2, iz $$3, iz $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(eof $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cxv $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(enp $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(dbw $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(daz $$0, iz $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bqt b(dbt $$0, iz $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(axb<deu> $$0) {
         return this.b().q().a($$0);
      }

      public boolean a(axb<deu> $$0, Predicate<drw.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jm<deu> $$0) {
         return $$0.a(this.b().q());
      }

      public boolean a(ji<deu> $$0) {
         return this.a($$0.a());
      }

      public Stream<axb<deu>> s() {
         return this.b().q().c();
      }

      public boolean t() {
         return this.b() instanceof dhm;
      }

      @Nullable
      public <T extends dpc> dpd<T> a(dbt $$0, dpe<T> $$1) {
         return this.b() instanceof dhm ? ((dhm)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(deu $$0) {
         return this.b() == $$0;
      }

      public boolean a(ala<deu> $$0) {
         return this.b().q().a($$0);
      }

      public enq u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(iz $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dmh w() {
         return this.b().g_(this.x());
      }

      public void a(dbt $$0, drx $$1, evi $$2, cnk $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(daz $$0, iz $$1, je $$2) {
         return this.a($$0, $$1, $$2, dmv.a);
      }

      public boolean a(daz $$0, iz $$1, je $$2, dmv $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(daz $$0, iz $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract drx x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dsy A() {
         return this.x;
      }

      static final class a {
         private static final je[] e = je.values();
         private static final int f = dmv.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final ewf[] i;
         protected final ewf b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(drx $$0) {
            deu $$1 = $$0.b();
            this.a = $$0.i(dbi.a, iz.c);
            this.g = $$1.a_($$0, dbi.a, iz.c);
            this.h = $$1.g($$0, dbi.a, iz.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new ewf[e.length];
               ewf $$2 = $$1.f($$0, dbi.a, iz.c);

               for (je $$3 : e) {
                  this.i[$$3.ordinal()] = ewc.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, dbi.a, iz.c, evr.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lp.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(je.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (je $$4 : e) {
                  for (dmv $$5 : dmv.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, dbi.a, iz.c, $$4);
                  }
               }

               this.d = deu.a($$0.k(dbi.a, iz.c));
            }
         }

         public boolean a(je $$0, dmv $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(je $$0, dmv $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      evm evaluate(drx var1, daz var2, iz var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<drw.d> a = Codec.unit(() -> a());
      Function<drx, enu> b = $$0 -> enu.a;
      boolean c = true;
      dmh d = dmh.f;
      ToIntFunction<drx> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      ala<eqi> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      env t = env.a;
      boolean u = true;
      dsy v = dsy.a;
      boolean w;
      drw.e<bsv<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, je.b) && $$0.h() < 14;
      drw.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      drw.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      drw.f A = this.z;
      drw.f B = ($$0, $$1, $$2) -> false;
      drw.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cpg E = cpi.g;
      Optional<drw.b> F = Optional.empty();

      private d() {
      }

      public static drw.d a() {
         return new drw.d();
      }

      public static drw.d a(drw $$0) {
         drw.d $$1 = b($$0);
         drw.d $$2 = $$0.aP;
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
      public static drw.d b(drw $$0) {
         drw.d $$1 = new drw.d();
         drw.d $$2 = $$0.aP;
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

      public drw.d a(ctd $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public drw.d a(enu $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public drw.d a(Function<drx, enu> $$0) {
         this.b = $$0;
         return this;
      }

      public drw.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public drw.d c() {
         this.n = false;
         return this;
      }

      public drw.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public drw.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public drw.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public drw.d a(dmh $$0) {
         this.d = $$0;
         return this;
      }

      public drw.d a(ToIntFunction<drx> $$0) {
         this.e = $$0;
         return this;
      }

      public drw.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public drw.d d() {
         return this.d(0.0F);
      }

      public drw.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public drw.d e() {
         this.i = true;
         return this;
      }

      public drw.d f() {
         this.D = true;
         return this;
      }

      public drw.d g() {
         this.m = epz.a;
         return this;
      }

      public drw.d a(deu $$0) {
         this.m = $$0.v();
         return this;
      }

      public drw.d h() {
         this.p = true;
         return this;
      }

      public drw.d i() {
         this.q = true;
         return this;
      }

      public drw.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public drw.d k() {
         this.r = true;
         return this;
      }

      public drw.d a(env $$0) {
         this.t = $$0;
         return this;
      }

      public drw.d l() {
         this.o = true;
         return this;
      }

      public drw.d a(drw.e<bsv<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public drw.d a(drw.f $$0) {
         this.y = $$0;
         return this;
      }

      public drw.d b(drw.f $$0) {
         this.z = $$0;
         return this;
      }

      public drw.d c(drw.f $$0) {
         this.A = $$0;
         return this;
      }

      public drw.d d(drw.f $$0) {
         this.B = $$0;
         return this;
      }

      public drw.d e(drw.f $$0) {
         this.C = $$0;
         return this;
      }

      public drw.d m() {
         this.h = true;
         return this;
      }

      public drw.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public drw.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public drw.d a(drw.c $$0) {
         switch ($$0) {
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  deu $$3 = $$0x.b();
                  long $$4 = ayu.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.as_();
                  double $$6 = ayu.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = ayu.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new evm($$6, 0.0, $$7);
               });
               break;
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  deu $$3 = $$0x.b();
                  long $$4 = ayu.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.au_();
                  float $$6 = $$3.as_();
                  double $$7 = ayu.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = ayu.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new evm($$7, $$5, $$8);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public drw.d n() {
         this.u = false;
         return this;
      }

      public drw.d a(cpe... $$0) {
         this.E = cpi.e.a($$0);
         return this;
      }

      public drw.d a(dsy $$0) {
         this.v = $$0;
         return this;
      }

      public drw.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(drx var1, daz var2, iz var3, A var4);
   }

   public interface f {
      boolean test(drx var1, daz var2, iz var3);
   }
}
