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

public abstract class dsb implements cpi {
   protected static final je[] aF = new je[]{je.e, je.f, je.c, je.d, je.a, je.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dmm aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cpl aO;
   protected final dsb.d aP;
   @Nullable
   protected ale<eqn> aQ;

   public dsb(dsb.d $$0) {
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

   public dsb.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dez> a();

   protected static <B extends dez> RecordCodecBuilder<B, dsb.d> u() {
      return dsb.d.a.fieldOf("properties").forGetter(dsb::t);
   }

   public static <B extends dez> MapCodec<B> b(Function<dsb.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dsc $$0, dbz $$1, iz $$2, int $$3, int $$4) {
   }

   protected boolean a(dsc $$0, eok $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(dbn.a, iz.c);
         case b:
            return $$0.u().a(awv.a);
         case c:
            return !$$0.r(dbn.a, iz.c);
         default:
            return false;
      }
   }

   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return $$0;
   }

   protected boolean a(dsc $$0, dsc $$1, je $$2) {
      return false;
   }

   protected void a(dsc $$0, dby $$1, iz $$2, dez $$3, iz $$4, boolean $$5) {
      agt.a($$1, $$2);
   }

   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
   }

   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dsc $$0, dby $$1, iz $$2, dbq $$3, BiConsumer<cup, iz> $$4) {
      if (!$$0.i() && $$3.j() != dbq.a.d) {
         dez $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cmx;
         if ($$5.a($$3) && $$1 instanceof arf $$7) {
            dph $$8 = $$0.t() ? $$1.c_($$2) : null;
            eql.a $$9 = new eql.a($$7).a(ete.f, evr.b($$2)).a(ete.i, cup.l).b(ete.h, $$8).b(ete.a, $$3.g());
            if ($$3.j() == dbq.a.c) {
               $$9.a(ete.j, $$3.a());
            }

            $$0.a($$7, $$2, cup.l, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dfb.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      return bqu.e;
   }

   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      return bqw.d;
   }

   protected boolean a(dsc $$0, dby $$1, iz $$2, int $$3, int $$4) {
      return false;
   }

   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   protected boolean f_(dsc $$0) {
      return false;
   }

   protected boolean e_(dsc $$0) {
      return false;
   }

   protected env b_(dsc $$0) {
      return enw.a.g();
   }

   protected boolean c_(dsc $$0) {
      return false;
   }

   protected float aq_() {
      return 0.25F;
   }

   protected float as_() {
      return 0.2F;
   }

   @Override
   public cpl i() {
      return this.aO;
   }

   protected dsc a(dsc $$0, dlm $$1) {
      return $$0;
   }

   protected dsc a(dsc $$0, djw $$1) {
      return $$0;
   }

   protected boolean a(dsc $$0, cya $$1) {
      return $$0.r() && ($$1.n().e() || !$$1.n().a(this.r()));
   }

   protected boolean a(dsc $$0, enu $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cup> a(dsc $$0, eql.a $$1) {
      ale<eqn> $$2 = this.v();
      if ($$2 == eqe.a) {
         return Collections.emptyList();
      } else {
         eql $$3 = $$1.a(ete.g, $$0).a(etd.r);
         arf $$4 = $$3.a();
         eqn $$5 = $$4.o().be().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dsc $$0, iz $$1) {
      return ayz.a($$1);
   }

   protected ewk f(dsc $$0, dbe $$1, iz $$2) {
      return $$0.j($$1, $$2);
   }

   protected ewk b_(dsc $$0, dbe $$1, iz $$2) {
      return this.b($$0, $$1, $$2, evw.a());
   }

   protected ewk a(dsc $$0, dbe $$1, iz $$2) {
      return ewh.a();
   }

   protected int g(dsc $$0, dbe $$1, iz $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.Q();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bqy b(dsc $$0, dby $$1, iz $$2) {
      return null;
   }

   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return true;
   }

   protected float d(dsc $$0, dbe $$1, iz $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dsc $$0, dby $$1, iz $$2) {
      return 0;
   }

   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return ewh.b();
   }

   protected ewk b(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return this.aG ? $$0.j($$1, $$2) : ewh.a();
   }

   protected boolean c(dsc $$0, dbe $$1, iz $$2) {
      return dez.a($$0.k($$1, $$2));
   }

   protected boolean h(dsc $$0, dbe $$1, iz $$2) {
      return dez.a($$0.c($$1, $$2));
   }

   protected ewk c(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
   }

   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
   }

   protected float a(dsc $$0, cmx $$1, dbe $$2, iz $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dsc $$0, arf $$1, iz $$2, cup $$3, boolean $$4) {
   }

   protected void a(dsc $$0, dby $$1, iz $$2, cmx $$3) {
   }

   protected int a(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return 0;
   }

   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
   }

   protected int b(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return 0;
   }

   public final ale<eqn> v() {
      if (this.aQ == null) {
         alf $$0 = lp.e.b(this.q());
         this.aQ = ale.a(lq.aU, $$0.d("blocks/"));
      }

      return this.aQ;
   }

   protected void a(dby $$0, dsc $$1, evn $$2, cnp $$3) {
   }

   protected boolean a_(dsc $$0, dbe $$1, iz $$2) {
      return !dez.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean d_(dsc $$0) {
      return this.aI;
   }

   protected dmm g_(dsc $$0) {
      return this.aJ;
   }

   public abstract cuk r();

   protected abstract dez q();

   public enz w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dse<dez, dsc> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eoa l;
      private final enz m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dsb.f q;
      private final dsb.f r;
      private final dsb.f s;
      private final dsb.f t;
      private final dsb.f u;
      private final Optional<dsb.b> v;
      private final boolean w;
      private final dtd x;
      private final boolean y;
      @Nullable
      protected dsb.a.a a;
      private env z = enw.a.g();
      private boolean A;

      protected a(dez $$0, Reference2ObjectArrayMap<dtf<?>, Comparable<?>> $$1, MapCodec<dsc> $$2) {
         super($$0, $$1, $$2);
         dsb.d $$3 = $$0.aP;
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
            ewk $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               evm $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.b_(this.x());
         this.A = this.e.d_(this.x());
         if (!this.b().p()) {
            this.a = new dsb.a.a(this.x());
         }

         this.k = this.D();
      }

      public dez b() {
         return this.e;
      }

      public ji<dez> c() {
         return this.e.s();
      }

      @Deprecated
      public boolean d() {
         dez $$0 = this.b();
         return $$0 != dfb.bs && $$0 != dfb.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(dbe $$0, iz $$1, bta<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(dbe $$0, iz $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(dbe $$0, iz $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public ewk a(dbe $$0, iz $$1, je $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ewh.a(this.c($$0, $$1), $$2);
      }

      public ewk c(dbe $$0, iz $$1) {
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

      public enz d(dbe $$0, iz $$1) {
         return this.m;
      }

      public dsc a(dlm $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dsc a(djw $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dlf l() {
         return this.b().a_(this.x());
      }

      public boolean e(dbe $$0, iz $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(dbe $$0, iz $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(dbe $$0, iz $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().e_(this.x());
      }

      public int b(dbe $$0, iz $$1, je $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().c_(this.x());
      }

      public int a(dby $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(dbe $$0, iz $$1) {
         return this.n;
      }

      public float a(cmx $$0, dbe $$1, iz $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(dbe $$0, iz $$1, je $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eoa o() {
         return this.l;
      }

      public boolean i(dbe $$0, iz $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dsc $$2 = this.x();
            return $$2.p() ? dez.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dsc $$0, je $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public ewk j(dbe $$0, iz $$1) {
         return this.a($$0, $$1, evw.a());
      }

      public ewk a(dbe $$0, iz $$1, evw $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public ewk k(dbe $$0, iz $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, evw.a());
      }

      public ewk b(dbe $$0, iz $$1, evw $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ewk l(dbe $$0, iz $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public ewk c(dbe $$0, iz $$1, evw $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public ewk m(dbe $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(dbe $$0, iz $$1, bsu $$2) {
         return this.a($$0, $$1, $$2, je.b);
      }

      public final boolean a(dbe $$0, iz $$1, bsu $$2, je $$3) {
         return dez.a(this.b($$0, $$1, evw.a($$2)), $$3);
      }

      public evr n(dbe $$0, iz $$1) {
         return this.v.<evr>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(evr.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(dby $$0, iz $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dby $$0, iz $$1, dez $$2, iz $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dbz $$0, iz $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dbz $$0, iz $$1, int $$2, int $$3) {
         iz.a $$4 = new iz.a();

         for (je $$5 : dsb.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(dbz $$0, iz $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dbz $$0, iz $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dby $$0, iz $$1, dsc $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(dby $$0, iz $$1, dsc $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dby $$0, iz $$1, dbq $$2, BiConsumer<cup, iz> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(arf $$0, iz $$1, azh $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(arf $$0, iz $$1, azh $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(dby $$0, iz $$1, bsu $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(arf $$0, iz $$1, cup $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cup> a(eql.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bqw a(cup $$0, dby $$1, cmx $$2, bqt $$3, evn $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bqu a(dby $$0, cmx $$1, evn $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(dby $$0, iz $$1, cmx $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(dbe $$0, iz $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(dbe $$0, iz $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dsc a(je $$0, dsc $$1, dbz $$2, iz $$3, iz $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(eok $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cya $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(enu $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(dcb $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(dbe $$0, iz $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bqy b(dby $$0, iz $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(axf<dez> $$0) {
         return this.b().s().a($$0);
      }

      public boolean a(axf<dez> $$0, Predicate<dsb.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jm<dez> $$0) {
         return $$0.a(this.b().s());
      }

      public boolean a(ji<dez> $$0) {
         return this.a($$0.a());
      }

      public Stream<axf<dez>> s() {
         return this.b().s().c();
      }

      public boolean t() {
         return this.b() instanceof dhr;
      }

      @Nullable
      public <T extends dph> dpi<T> a(dby $$0, dpj<T> $$1) {
         return this.b() instanceof dhr ? ((dhr)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dez $$0) {
         return this.b() == $$0;
      }

      public boolean a(ale<dez> $$0) {
         return this.b().s().a($$0);
      }

      public env u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(iz $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dmm w() {
         return this.b().g_(this.x());
      }

      public void a(dby $$0, dsc $$1, evn $$2, cnp $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(dbe $$0, iz $$1, je $$2) {
         return this.a($$0, $$1, $$2, dna.a);
      }

      public boolean a(dbe $$0, iz $$1, je $$2, dna $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(dbe $$0, iz $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dsc x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dtd A() {
         return this.x;
      }

      static final class a {
         private static final je[] e = je.values();
         private static final int f = dna.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final ewk[] i;
         protected final ewk b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dsc $$0) {
            dez $$1 = $$0.b();
            this.a = $$0.i(dbn.a, iz.c);
            this.g = $$1.a_($$0, dbn.a, iz.c);
            this.h = $$1.g($$0, dbn.a, iz.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new ewk[e.length];
               ewk $$2 = $$1.f($$0, dbn.a, iz.c);

               for (je $$3 : e) {
                  this.i[$$3.ordinal()] = ewh.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, dbn.a, iz.c, evw.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lp.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(je.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (je $$4 : e) {
                  for (dna $$5 : dna.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, dbn.a, iz.c, $$4);
                  }
               }

               this.d = dez.a($$0.k(dbn.a, iz.c));
            }
         }

         public boolean a(je $$0, dna $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(je $$0, dna $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      evr evaluate(dsc var1, dbe var2, iz var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dsb.d> a = Codec.unit(() -> a());
      Function<dsc, enz> b = $$0 -> enz.a;
      boolean c = true;
      dmm d = dmm.f;
      ToIntFunction<dsc> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      ale<eqn> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      eoa t = eoa.a;
      boolean u = true;
      dtd v = dtd.a;
      boolean w;
      dsb.e<bta<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, je.b) && $$0.h() < 14;
      dsb.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dsb.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dsb.f A = this.z;
      dsb.f B = ($$0, $$1, $$2) -> false;
      dsb.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cpl E = cpn.g;
      Optional<dsb.b> F = Optional.empty();

      private d() {
      }

      public static dsb.d a() {
         return new dsb.d();
      }

      public static dsb.d a(dsb $$0) {
         dsb.d $$1 = b($$0);
         dsb.d $$2 = $$0.aP;
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
      public static dsb.d b(dsb $$0) {
         dsb.d $$1 = new dsb.d();
         dsb.d $$2 = $$0.aP;
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

      public dsb.d a(cti $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dsb.d a(enz $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dsb.d a(Function<dsc, enz> $$0) {
         this.b = $$0;
         return this;
      }

      public dsb.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dsb.d c() {
         this.n = false;
         return this;
      }

      public dsb.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dsb.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dsb.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dsb.d a(dmm $$0) {
         this.d = $$0;
         return this;
      }

      public dsb.d a(ToIntFunction<dsc> $$0) {
         this.e = $$0;
         return this;
      }

      public dsb.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dsb.d d() {
         return this.d(0.0F);
      }

      public dsb.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dsb.d e() {
         this.i = true;
         return this;
      }

      public dsb.d f() {
         this.D = true;
         return this;
      }

      public dsb.d g() {
         this.m = eqe.a;
         return this;
      }

      public dsb.d a(dez $$0) {
         this.m = $$0.v();
         return this;
      }

      public dsb.d h() {
         this.p = true;
         return this;
      }

      public dsb.d i() {
         this.q = true;
         return this;
      }

      public dsb.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dsb.d k() {
         this.r = true;
         return this;
      }

      public dsb.d a(eoa $$0) {
         this.t = $$0;
         return this;
      }

      public dsb.d l() {
         this.o = true;
         return this;
      }

      public dsb.d a(dsb.e<bta<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dsb.d a(dsb.f $$0) {
         this.y = $$0;
         return this;
      }

      public dsb.d b(dsb.f $$0) {
         this.z = $$0;
         return this;
      }

      public dsb.d c(dsb.f $$0) {
         this.A = $$0;
         return this;
      }

      public dsb.d d(dsb.f $$0) {
         this.B = $$0;
         return this;
      }

      public dsb.d e(dsb.f $$0) {
         this.C = $$0;
         return this;
      }

      public dsb.d m() {
         this.h = true;
         return this;
      }

      public dsb.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dsb.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dsb.d a(dsb.c $$0) {
         switch ($$0) {
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dez $$3 = $$0x.b();
                  long $$4 = ayz.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.aq_();
                  double $$6 = ayz.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = ayz.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new evr($$6, 0.0, $$7);
               });
               break;
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dez $$3 = $$0x.b();
                  long $$4 = ayz.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.as_();
                  float $$6 = $$3.aq_();
                  double $$7 = ayz.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = ayz.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new evr($$7, $$5, $$8);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dsb.d n() {
         this.u = false;
         return this;
      }

      public dsb.d a(cpj... $$0) {
         this.E = cpn.e.a($$0);
         return this;
      }

      public dsb.d a(dtd $$0) {
         this.v = $$0;
         return this;
      }

      public dsb.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dsc var1, dbe var2, iz var3, A var4);
   }

   public interface f {
      boolean test(dsc var1, dbe var2, iz var3);
   }
}
