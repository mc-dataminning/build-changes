import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class dfc implements cef {
   protected static final ha[] aF = new ha[]{ha.e, ha.f, ha.c, ha.d, ha.a, ha.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dan aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cei aO;
   protected final dfc.d aP;
   @Nullable
   protected aez aQ;

   public dfc(dfc.d $$0) {
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

   public dfc.d s() {
      return this.aP;
   }

   protected abstract MapCodec<? extends ctc> a();

   protected static <B extends ctc> RecordCodecBuilder<B, dfc.d> t() {
      return dfc.d.a.fieldOf("properties").forGetter(dfc::s);
   }

   public static <B extends ctc> MapCodec<B> b(Function<dfc.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   @Deprecated
   public void a(dfd $$0, cqc $$1, gw $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(aqa.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   @Deprecated
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(dfd $$0, dfd $$1, ha $$2) {
      return false;
   }

   @Deprecated
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      abc.a($$1, $$2);
   }

   @Deprecated
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.n($$2);
      }
   }

   @Deprecated
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      return bhe.d;
   }

   @Deprecated
   public boolean a(dfd $$0, cqb $$1, gw $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Deprecated
   public boolean g_(dfd $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(dfd $$0) {
      return false;
   }

   @Deprecated
   public eag c_(dfd $$0) {
      return eah.a.g();
   }

   @Deprecated
   public boolean d_(dfd $$0) {
      return false;
   }

   public float ap_() {
      return 0.25F;
   }

   public float ar_() {
      return 0.2F;
   }

   @Override
   public cei m() {
      return this.aO;
   }

   @Deprecated
   public dfd a(dfd $$0, czn $$1) {
      return $$0;
   }

   @Deprecated
   public dfd a(dfd $$0, cxx $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(dfd $$0, clt $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.k()));
   }

   @Deprecated
   public boolean a(dfd $$0, eaf $$1) {
      return $$0.r() || !$$0.e();
   }

   @Deprecated
   public List<cjl> a(dfd $$0, ecq.a $$1) {
      aez $$2 = this.u();
      if ($$2 == eci.a) {
         return Collections.emptyList();
      } else {
         ecq $$3 = $$1.a(eev.g, $$0).a(eeu.o);
         akt $$4 = $$3.a();
         ecs $$5 = $$4.n().aH().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(dfd $$0, gw $$1) {
      return asb.a($$1);
   }

   @Deprecated
   public eia f(dfd $$0, cph $$1, gw $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public eia b_(dfd $$0, cph $$1, gw $$2) {
      return this.c($$0, $$1, $$2, ehm.a());
   }

   @Deprecated
   public eia a(dfd $$0, cph $$1, gw $$2) {
      return ehx.a();
   }

   @Deprecated
   public int g(dfd $$0, cph $$1, gw $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.M();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bhh b(dfd $$0, cqb $$1, gw $$2) {
      return null;
   }

   @Deprecated
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return true;
   }

   @Deprecated
   public float b(dfd $$0, cph $$1, gw $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(dfd $$0, cqb $$1, gw $$2) {
      return 0;
   }

   @Deprecated
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return ehx.b();
   }

   @Deprecated
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return this.aG ? $$0.j($$1, $$2) : ehx.a();
   }

   @Deprecated
   public boolean a_(dfd $$0, cph $$1, gw $$2) {
      return ctc.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(dfd $$0, cph $$1, gw $$2) {
      return ctc.a($$0.c($$1, $$2));
   }

   @Deprecated
   public eia b(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return this.c($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
   }

   @Deprecated
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
   }

   @Deprecated
   public float a(dfd $$0, cca $$1, cph $$2, gw $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(dfd $$0, akt $$1, gw $$2, cjl $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dfd $$0, cqb $$1, gw $$2, cca $$3) {
   }

   @Deprecated
   public int a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return 0;
   }

   @Deprecated
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
   }

   @Deprecated
   public int b(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return 0;
   }

   public final aez u() {
      if (this.aQ == null) {
         aez $$0 = jb.f.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   @Deprecated
   public void a(cqb $$0, dfd $$1, ehd $$2, ccs $$3) {
   }

   public abstract cjg k();

   protected abstract ctc q();

   public eak v() {
      return this.aP.b.apply(this.q().o());
   }

   public float w() {
      return this.aP.g;
   }

   public abstract static class a extends dff<ctc, dfd> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eal l;
      private final eak m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dfc.f q;
      private final dfc.f r;
      private final dfc.f s;
      private final dfc.f t;
      private final dfc.f u;
      private final Optional<dfc.b> v;
      private final boolean w;
      private final dge x;
      private final boolean y;
      @Nullable
      protected dfc.a.a a;
      private eag z = eah.a.g();
      private boolean A;

      protected a(ctc $$0, ImmutableMap<dgg<?>, Comparable<?>> $$1, MapCodec<dfd> $$2) {
         super($$0, $$1, $$2);
         dfc.d $$3 = $$0.aP;
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
            eia $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               ehc $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().p()) {
            this.a = new dfc.a.a(this.x());
         }

         this.k = this.D();
      }

      public ctc b() {
         return this.e;
      }

      public he<ctc> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         ctc $$0 = this.b();
         return $$0 != cte.bs && $$0 != cte.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cph $$0, gw $$1, bja<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cph $$0, gw $$1) {
         return this.a != null ? this.a.g : this.b().c(this.x(), $$0, $$1);
      }

      public int b(cph $$0, gw $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public eia a(cph $$0, gw $$1, ha $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ehx.a(this.c($$0, $$1), $$2);
      }

      public eia c(cph $$0, gw $$1) {
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

      public eak d(cph $$0, gw $$1) {
         return this.m;
      }

      public dfd a(czn $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dfd a(cxx $$0) {
         return this.b().a(this.x(), $$0);
      }

      public czg l() {
         return this.b().b_(this.x());
      }

      public boolean e(cph $$0, gw $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cph $$0, gw $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean g(cph $$0, gw $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cph $$0, gw $$1, ha $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(cqb $$0, gw $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cph $$0, gw $$1) {
         return this.n;
      }

      public float a(cca $$0, cph $$1, gw $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cph $$0, gw $$1, ha $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eal o() {
         return this.l;
      }

      public boolean i(cph $$0, gw $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dfd $$2 = this.x();
            return $$2.p() ? ctc.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dfd $$0, ha $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public eia j(cph $$0, gw $$1) {
         return this.a($$0, $$1, ehm.a());
      }

      public eia a(cph $$0, gw $$1, ehm $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public eia k(cph $$0, gw $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, ehm.a());
      }

      public eia b(cph $$0, gw $$1, ehm $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public eia l(cph $$0, gw $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public eia c(cph $$0, gw $$1, ehm $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eia m(cph $$0, gw $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cph $$0, gw $$1, biw $$2) {
         return this.a($$0, $$1, $$2, ha.b);
      }

      public final boolean a(cph $$0, gw $$1, biw $$2, ha $$3) {
         return ctc.a(this.b($$0, $$1, ehm.a($$2)), $$3);
      }

      public ehh n(cph $$0, gw $$1) {
         return this.v.<ehh>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(ehh.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(cqb $$0, gw $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(cqb $$0, gw $$1, ctc $$2, gw $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(cqc $$0, gw $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(cqc $$0, gw $$1, int $$2, int $$3) {
         gw.a $$4 = new gw.a();

         for (ha $$5 : dfc.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(cqc $$0, gw $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(cqc $$0, gw $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cqb $$0, gw $$1, dfd $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(cqb $$0, gw $$1, dfd $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(akt $$0, gw $$1, ash $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(akt $$0, gw $$1, ash $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(cqb $$0, gw $$1, biw $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(akt $$0, gw $$1, cjl $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cjl> a(ecq.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bhe a(cqb $$0, cca $$1, bhd $$2, ehd $$3) {
         return this.b().a(this.x(), $$0, $$3.a(), $$1, $$2, $$3);
      }

      public void a(cqb $$0, gw $$1, cca $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cph $$0, gw $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cph $$0, gw $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dfd a(ha $$0, dfd $$1, cqc $$2, gw $$3, gw $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(cph $$0, gw $$1, eaw $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(clt $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(eaf $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(cqe $$0, gw $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cph $$0, gw $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bhh b(cqb $$0, gw $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(aqk<ctc> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(aqk<ctc> $$0, Predicate<dfc.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(hi<ctc> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(he<ctc> $$0) {
         return this.a($$0.a());
      }

      public Stream<aqk<ctc>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof cvs;
      }

      @Nullable
      public <T extends dcz> dda<T> a(cqb $$0, ddb<T> $$1) {
         return this.b() instanceof cvs ? ((cvs)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(ctc $$0) {
         return this.b() == $$0;
      }

      public boolean a(aey<ctc> $$0) {
         return this.b().r().a($$0);
      }

      public eag u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(gw $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dan w() {
         return this.b().m(this.x());
      }

      public void a(cqb $$0, dfd $$1, ehd $$2, ccs $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cph $$0, gw $$1, ha $$2) {
         return this.a($$0, $$1, $$2, dbb.a);
      }

      public boolean a(cph $$0, gw $$1, ha $$2, dbb $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cph $$0, gw $$1) {
         return this.a != null ? this.a.d : this.b().a_(this.x(), $$0, $$1);
      }

      protected abstract dfd x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dge A() {
         return this.x;
      }

      static final class a {
         private static final ha[] e = ha.values();
         private static final int f = dbb.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final eia[] i;
         protected final eia b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dfd $$0) {
            ctc $$1 = $$0.b();
            this.a = $$0.i(cpq.a, gw.b);
            this.g = $$1.c($$0, cpq.a, gw.b);
            this.h = $$1.g($$0, cpq.a, gw.b);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new eia[e.length];
               eia $$2 = $$1.f($$0, cpq.a, gw.b);

               for (ha $$3 : e) {
                  this.i[$$3.ordinal()] = ehx.a($$2, $$3);
               }
            }

            this.b = $$1.c($$0, cpq.a, gw.b, ehm.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", jb.f.b($$1))
               );
            } else {
               this.c = Arrays.stream(ha.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ha $$4 : e) {
                  for (dbb $$5 : dbb.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cpq.a, gw.b, $$4);
                  }
               }

               this.d = ctc.a($$0.k(cpq.a, gw.b));
            }
         }

         public boolean a(ha $$0, dbb $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ha $$0, dbb $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      ehh evaluate(dfd var1, cph var2, gw var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dfc.d> a = Codec.unit(() -> a());
      Function<dfd, eak> b = $$0 -> eak.a;
      boolean c = true;
      dan d = dan.f;
      ToIntFunction<dfd> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      aez m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      eal t = eal.a;
      boolean u = true;
      dge v = dge.a;
      boolean w;
      dfc.e<bja<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ha.b) && $$0.h() < 14;
      dfc.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dfc.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dfc.f A = this.z;
      dfc.f B = ($$0, $$1, $$2) -> false;
      dfc.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cei E = cek.f;
      Optional<dfc.b> F = Optional.empty();

      private d() {
      }

      public static dfc.d a() {
         return new dfc.d();
      }

      public static dfc.d a(dfc $$0) {
         dfc.d $$1 = new dfc.d();
         $$1.g = $$0.aP.g;
         $$1.f = $$0.aP.f;
         $$1.c = $$0.aP.c;
         $$1.i = $$0.aP.i;
         $$1.e = $$0.aP.e;
         $$1.b = $$0.aP.b;
         $$1.d = $$0.aP.d;
         $$1.j = $$0.aP.j;
         $$1.k = $$0.aP.k;
         $$1.D = $$0.aP.D;
         $$1.n = $$0.aP.n;
         $$1.o = $$0.aP.o;
         $$1.p = $$0.aP.p;
         $$1.q = $$0.aP.q;
         $$1.r = $$0.aP.r;
         $$1.s = $$0.aP.s;
         $$1.t = $$0.aP.t;
         $$1.h = $$0.aP.h;
         $$1.F = $$0.aP.F;
         $$1.u = $$0.aP.u;
         $$1.E = $$0.aP.E;
         $$1.C = $$0.aP.C;
         $$1.v = $$0.aP.v;
         $$1.w = $$0.aP.w;
         return $$1;
      }

      public dfc.d a(chz $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dfc.d a(eak $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dfc.d a(Function<dfd, eak> $$0) {
         this.b = $$0;
         return this;
      }

      public dfc.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dfc.d c() {
         this.n = false;
         return this;
      }

      public dfc.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dfc.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dfc.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dfc.d a(dan $$0) {
         this.d = $$0;
         return this;
      }

      public dfc.d a(ToIntFunction<dfd> $$0) {
         this.e = $$0;
         return this;
      }

      public dfc.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dfc.d d() {
         return this.d(0.0F);
      }

      public dfc.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dfc.d e() {
         this.i = true;
         return this;
      }

      public dfc.d f() {
         this.D = true;
         return this;
      }

      public dfc.d g() {
         this.m = eci.a;
         return this;
      }

      public dfc.d a(ctc $$0) {
         this.m = $$0.u();
         return this;
      }

      public dfc.d h() {
         this.p = true;
         return this;
      }

      public dfc.d i() {
         this.q = true;
         return this;
      }

      public dfc.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dfc.d k() {
         this.r = true;
         return this;
      }

      public dfc.d a(eal $$0) {
         this.t = $$0;
         return this;
      }

      public dfc.d l() {
         this.o = true;
         return this;
      }

      public dfc.d a(dfc.e<bja<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dfc.d a(dfc.f $$0) {
         this.y = $$0;
         return this;
      }

      public dfc.d b(dfc.f $$0) {
         this.z = $$0;
         return this;
      }

      public dfc.d c(dfc.f $$0) {
         this.A = $$0;
         return this;
      }

      public dfc.d d(dfc.f $$0) {
         this.B = $$0;
         return this;
      }

      public dfc.d e(dfc.f $$0) {
         this.C = $$0;
         return this;
      }

      public dfc.d m() {
         this.h = true;
         return this;
      }

      public dfc.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dfc.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dfc.d a(dfc.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  ctc $$3 = $$0x.b();
                  long $$4 = asb.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.ar_();
                  float $$6 = $$3.ap_();
                  double $$7 = asb.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = asb.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new ehh($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  ctc $$3 = $$0x.b();
                  long $$4 = asb.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.ap_();
                  double $$6 = asb.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = asb.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new ehh($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dfc.d n() {
         this.u = false;
         return this;
      }

      public dfc.d a(ceg... $$0) {
         this.E = cek.d.a($$0);
         return this;
      }

      public dfc.d a(dge $$0) {
         this.v = $$0;
         return this;
      }

      public dfc.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dfd var1, cph var2, gw var3, A var4);
   }

   public interface f {
      boolean test(dfd var1, cph var2, gw var3);
   }
}
