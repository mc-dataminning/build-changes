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

public abstract class doy implements cmd {
   protected static final ih[] aF = new ih[]{ih.e, ih.f, ih.c, ih.d, ih.a, ih.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final djk aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cmg aO;
   protected final doy.d aP;
   @Nullable
   protected ajt aQ;

   public doy(doy.d $$0) {
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

   public doy.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dby> a();

   protected static <B extends dby> RecordCodecBuilder<B, doy.d> u() {
      return doy.d.a.fieldOf("properties").forGetter(doy::t);
   }

   public static <B extends dby> MapCodec<B> b(Function<doy.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(doz $$0, cyy $$1, ib $$2, int $$3, int $$4) {
   }

   protected boolean a(doz $$0, elh $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(cym.a, ib.c);
         case b:
            return $$0.u().a(avh.a);
         case c:
            return !$$0.r(cym.a, ib.c);
         default:
            return false;
      }
   }

   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$0;
   }

   protected boolean a(doz $$0, doz $$1, ih $$2) {
      return false;
   }

   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      afi.a($$1, $$2);
   }

   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
   }

   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(doz $$0, cyx $$1, ib $$2, cyp $$3, BiConsumer<crj, ib> $$4) {
      if (!$$0.i() && $$3.j() != cyp.a.d) {
         dby $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cjt;
         if ($$5.a($$3) && $$1 instanceof aps $$7) {
            dmf $$8 = $$0.t() ? $$1.c_($$2) : null;
            enh.a $$9 = new enh.a($$7).a(epo.f, esa.b($$2)).a(epo.i, crj.i).b(epo.h, $$8).b(epo.a, $$3.g());
            if ($$3.j() == cyp.a.c) {
               $$9.a(epo.j, $$3.a());
            }

            $$0.a($$7, $$2, crj.i, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dca.a.n(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      return boa.d;
   }

   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      return boc.d;
   }

   protected boolean a(doz $$0, cyx $$1, ib $$2, int $$3, int $$4) {
      return false;
   }

   protected did b_(doz $$0) {
      return did.c;
   }

   protected boolean g_(doz $$0) {
      return false;
   }

   protected boolean f_(doz $$0) {
      return false;
   }

   protected eks c_(doz $$0) {
      return ekt.a.g();
   }

   protected boolean d_(doz $$0) {
      return false;
   }

   protected float as_() {
      return 0.25F;
   }

   protected float au_() {
      return 0.2F;
   }

   @Override
   public cmg m() {
      return this.aO;
   }

   protected doz a(doz $$0, dik $$1) {
      return $$0;
   }

   protected doz a(doz $$0, dgu $$1) {
      return $$0;
   }

   protected boolean a(doz $$0, cuo $$1) {
      return $$0.r() && ($$1.n().d() || !$$1.n().a(this.p()));
   }

   protected boolean a(doz $$0, ekr $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<crj> a(doz $$0, enh.a $$1) {
      ajt $$2 = this.v();
      if ($$2 == emz.a) {
         return Collections.emptyList();
      } else {
         enh $$3 = $$1.a(epo.g, $$0).a(epn.q);
         aps $$4 = $$3.a();
         enj $$5 = $$4.o().aM().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   protected long a(doz $$0, ib $$1) {
      return axk.a($$1);
   }

   protected est f(doz $$0, cyd $$1, ib $$2) {
      return $$0.j($$1, $$2);
   }

   protected est b_(doz $$0, cyd $$1, ib $$2) {
      return this.b($$0, $$1, $$2, esf.a());
   }

   protected est a(doz $$0, cyd $$1, ib $$2) {
      return esq.a();
   }

   protected int g(doz $$0, cyd $$1, ib $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.P();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected boe b(doz $$0, cyx $$1, ib $$2) {
      return null;
   }

   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return true;
   }

   protected float d(doz $$0, cyd $$1, ib $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(doz $$0, cyx $$1, ib $$2) {
      return 0;
   }

   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return esq.b();
   }

   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return this.aG ? $$0.j($$1, $$2) : esq.a();
   }

   protected boolean c(doz $$0, cyd $$1, ib $$2) {
      return dby.a($$0.k($$1, $$2));
   }

   protected boolean h(doz $$0, cyd $$1, ib $$2) {
      return dby.a($$0.c($$1, $$2));
   }

   protected est c(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
   }

   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
   }

   protected float a(doz $$0, cjt $$1, cyd $$2, ib $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(doz $$0, aps $$1, ib $$2, crj $$3, boolean $$4) {
   }

   protected void a(doz $$0, cyx $$1, ib $$2, cjt $$3) {
   }

   protected int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return 0;
   }

   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
   }

   protected int b(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return 0;
   }

   public final ajt v() {
      if (this.aQ == null) {
         ajt $$0 = kr.e.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   protected void a(cyx $$0, doz $$1, erw $$2, ckl $$3) {
   }

   protected boolean a_(doz $$0, cyd $$1, ib $$2) {
      return !dby.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean e_(doz $$0) {
      return this.aI;
   }

   protected djk h_(doz $$0) {
      return this.aJ;
   }

   public abstract cre p();

   protected abstract dby q();

   public ekw w() {
      return this.aP.b.apply(this.q().n());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dpb<dby, doz> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final ekx l;
      private final ekw m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final doy.f q;
      private final doy.f r;
      private final doy.f s;
      private final doy.f t;
      private final doy.f u;
      private final Optional<doy.b> v;
      private final boolean w;
      private final dqa x;
      private final boolean y;
      @Nullable
      protected doy.a.a a;
      private eks z = ekt.a.g();
      private boolean A;

      protected a(dby $$0, Reference2ObjectArrayMap<dqc<?>, Comparable<?>> $$1, MapCodec<doz> $$2) {
         super($$0, $$1, $$2);
         doy.d $$3 = $$0.aP;
         this.b = $$3.e.applyAsInt(this.x());
         this.g = $$0.g_(this.x());
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
            est $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               erv $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().o()) {
            this.a = new doy.a.a(this.x());
         }

         this.k = this.D();
      }

      public dby b() {
         return this.e;
      }

      public il<dby> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         dby $$0 = this.b();
         return $$0 != dca.bs && $$0 != dca.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cyd $$0, ib $$1, bqb<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cyd $$0, ib $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(cyd $$0, ib $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public est a(cyd $$0, ib $$1, ih $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : esq.a(this.c($$0, $$1), $$2);
      }

      public est c(cyd $$0, ib $$1) {
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

      public ekw d(cyd $$0, ib $$1) {
         return this.m;
      }

      public doz a(dik $$0) {
         return this.b().a(this.x(), $$0);
      }

      public doz a(dgu $$0) {
         return this.b().a(this.x(), $$0);
      }

      public did l() {
         return this.b().b_(this.x());
      }

      public boolean e(cyd $$0, ib $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cyd $$0, ib $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(cyd $$0, ib $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cyd $$0, ib $$1, ih $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(cyx $$0, ib $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cyd $$0, ib $$1) {
         return this.n;
      }

      public float a(cjt $$0, cyd $$1, ib $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cyd $$0, ib $$1, ih $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ekx o() {
         return this.l;
      }

      public boolean i(cyd $$0, ib $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            doz $$2 = this.x();
            return $$2.p() ? dby.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(doz $$0, ih $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public est j(cyd $$0, ib $$1) {
         return this.a($$0, $$1, esf.a());
      }

      public est a(cyd $$0, ib $$1, esf $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public est k(cyd $$0, ib $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, esf.a());
      }

      public est b(cyd $$0, ib $$1, esf $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public est l(cyd $$0, ib $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public est c(cyd $$0, ib $$1, esf $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public est m(cyd $$0, ib $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cyd $$0, ib $$1, bpv $$2) {
         return this.a($$0, $$1, $$2, ih.b);
      }

      public final boolean a(cyd $$0, ib $$1, bpv $$2, ih $$3) {
         return dby.a(this.b($$0, $$1, esf.a($$2)), $$3);
      }

      public esa n(cyd $$0, ib $$1) {
         return this.v.<esa>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(esa.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(cyx $$0, ib $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cyx $$0, ib $$1, dby $$2, ib $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(cyy $$0, ib $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(cyy $$0, ib $$1, int $$2, int $$3) {
         ib.a $$4 = new ib.a();

         for (ih $$5 : doy.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(cyy $$0, ib $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(cyy $$0, ib $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cyx $$0, ib $$1, doz $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(cyx $$0, ib $$1, doz $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cyx $$0, ib $$1, cyp $$2, BiConsumer<crj, ib> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(aps $$0, ib $$1, axr $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(aps $$0, ib $$1, axr $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(cyx $$0, ib $$1, bpv $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(aps $$0, ib $$1, crj $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<crj> a(enh.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boc a(crj $$0, cyx $$1, cjt $$2, bnz $$3, erw $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public boa a(cyx $$0, cjt $$1, erw $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(cyx $$0, ib $$1, cjt $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cyd $$0, ib $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cyd $$0, ib $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public doz a(ih $$0, doz $$1, cyy $$2, ib $$3, ib $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(elh $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cuo $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(ekr $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(cza $$0, ib $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cyd $$0, ib $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public boe b(cyx $$0, ib $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(avr<dby> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(avr<dby> $$0, Predicate<doy.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ip<dby> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(il<dby> $$0) {
         return this.a($$0.a());
      }

      public Stream<avr<dby>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof deq;
      }

      @Nullable
      public <T extends dmf> dmg<T> a(cyx $$0, dmh<T> $$1) {
         return this.b() instanceof deq ? ((deq)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dby $$0) {
         return this.b() == $$0;
      }

      public boolean a(ajs<dby> $$0) {
         return this.b().r().a($$0);
      }

      public eks u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(ib $$0) {
         return this.b().a(this.x(), $$0);
      }

      public djk w() {
         return this.b().h_(this.x());
      }

      public void a(cyx $$0, doz $$1, erw $$2, ckl $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cyd $$0, ib $$1, ih $$2) {
         return this.a($$0, $$1, $$2, djy.a);
      }

      public boolean a(cyd $$0, ib $$1, ih $$2, djy $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cyd $$0, ib $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract doz x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dqa A() {
         return this.x;
      }

      static final class a {
         private static final ih[] e = ih.values();
         private static final int f = djy.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final est[] i;
         protected final est b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(doz $$0) {
            dby $$1 = $$0.b();
            this.a = $$0.i(cym.a, ib.c);
            this.g = $$1.a_($$0, cym.a, ib.c);
            this.h = $$1.g($$0, cym.a, ib.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new est[e.length];
               est $$2 = $$1.f($$0, cym.a, ib.c);

               for (ih $$3 : e) {
                  this.i[$$3.ordinal()] = esq.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, cym.a, ib.c, esf.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", kr.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(ih.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ih $$4 : e) {
                  for (djy $$5 : djy.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cym.a, ib.c, $$4);
                  }
               }

               this.d = dby.a($$0.k(cym.a, ib.c));
            }
         }

         public boolean a(ih $$0, djy $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ih $$0, djy $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      esa evaluate(doz var1, cyd var2, ib var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<doy.d> a = Codec.unit(() -> a());
      Function<doz, ekw> b = $$0 -> ekw.a;
      boolean c = true;
      djk d = djk.f;
      ToIntFunction<doz> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      ajt m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      ekx t = ekx.a;
      boolean u = true;
      dqa v = dqa.a;
      boolean w;
      doy.e<bqb<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ih.b) && $$0.h() < 14;
      doy.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      doy.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      doy.f A = this.z;
      doy.f B = ($$0, $$1, $$2) -> false;
      doy.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cmg E = cmi.g;
      Optional<doy.b> F = Optional.empty();

      private d() {
      }

      public static doy.d a() {
         return new doy.d();
      }

      public static doy.d a(doy $$0) {
         doy.d $$1 = b($$0);
         doy.d $$2 = $$0.aP;
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
      public static doy.d b(doy $$0) {
         doy.d $$1 = new doy.d();
         doy.d $$2 = $$0.aP;
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

      public doy.d a(cqc $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public doy.d a(ekw $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public doy.d a(Function<doz, ekw> $$0) {
         this.b = $$0;
         return this;
      }

      public doy.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public doy.d c() {
         this.n = false;
         return this;
      }

      public doy.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public doy.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public doy.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public doy.d a(djk $$0) {
         this.d = $$0;
         return this;
      }

      public doy.d a(ToIntFunction<doz> $$0) {
         this.e = $$0;
         return this;
      }

      public doy.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public doy.d d() {
         return this.d(0.0F);
      }

      public doy.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public doy.d e() {
         this.i = true;
         return this;
      }

      public doy.d f() {
         this.D = true;
         return this;
      }

      public doy.d g() {
         this.m = emz.a;
         return this;
      }

      public doy.d a(dby $$0) {
         this.m = $$0.v();
         return this;
      }

      public doy.d h() {
         this.p = true;
         return this;
      }

      public doy.d i() {
         this.q = true;
         return this;
      }

      public doy.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public doy.d k() {
         this.r = true;
         return this;
      }

      public doy.d a(ekx $$0) {
         this.t = $$0;
         return this;
      }

      public doy.d l() {
         this.o = true;
         return this;
      }

      public doy.d a(doy.e<bqb<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public doy.d a(doy.f $$0) {
         this.y = $$0;
         return this;
      }

      public doy.d b(doy.f $$0) {
         this.z = $$0;
         return this;
      }

      public doy.d c(doy.f $$0) {
         this.A = $$0;
         return this;
      }

      public doy.d d(doy.f $$0) {
         this.B = $$0;
         return this;
      }

      public doy.d e(doy.f $$0) {
         this.C = $$0;
         return this;
      }

      public doy.d m() {
         this.h = true;
         return this;
      }

      public doy.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public doy.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public doy.d a(doy.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dby $$3 = $$0x.b();
                  long $$4 = axk.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.au_();
                  float $$6 = $$3.as_();
                  double $$7 = axk.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = axk.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new esa($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dby $$3 = $$0x.b();
                  long $$4 = axk.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.as_();
                  double $$6 = axk.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = axk.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new esa($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public doy.d n() {
         this.u = false;
         return this;
      }

      public doy.d a(cme... $$0) {
         this.E = cmi.e.a($$0);
         return this;
      }

      public doy.d a(dqa $$0) {
         this.v = $$0;
         return this;
      }

      public doy.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(doz var1, cyd var2, ib var3, A var4);
   }

   public interface f {
      boolean test(doz var1, cyd var2, ib var3);
   }
}
