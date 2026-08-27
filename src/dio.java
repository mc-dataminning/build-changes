import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
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

public abstract class dio implements cgy {
   protected static final ia[] aF = new ia[]{ia.e, ia.f, ia.c, ia.d, ia.a, ia.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final ddl aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final chb aO;
   protected final dio.d aP;
   @Nullable
   protected agt aQ;

   public dio(dio.d $$0) {
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

   public dio.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends cvz> a();

   protected static <B extends cvz> RecordCodecBuilder<B, dio.d> u() {
      return dio.d.a.fieldOf("properties").forGetter(dio::t);
   }

   public static <B extends cvz> MapCodec<B> b(Function<dio.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   @Deprecated
   public void a(dip $$0, csz $$1, hv $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(arw.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   @Deprecated
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(dip $$0, dip $$1, ia $$2) {
      return false;
   }

   @Deprecated
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      acv.a($$1, $$2);
   }

   @Deprecated
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.n($$2);
      }
   }

   @Deprecated
   public void a(dip $$0, csy $$1, hv $$2, csq $$3, BiConsumer<cmh, hv> $$4) {
      if (!$$0.i() && $$3.j() != csq.a.d) {
         cvz $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cer;
         if ($$5.a($$3) && $$1 instanceof amp $$7) {
            dgd $$8 = $$0.t() ? $$1.c_($$2) : null;
            egk.a $$9 = new egk.a($$7).a(eip.f, elb.b($$2)).a(eip.i, cmh.f).b(eip.h, $$8).b(eip.a, $$3.g());
            if ($$3.j() == csq.a.c) {
               $$9.a(eip.j, $$3.a());
            }

            $$0.a($$7, $$2, cmh.f, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, cwb.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   @Deprecated
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      return bjl.d;
   }

   @Deprecated
   public boolean a(dip $$0, csy $$1, hv $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Deprecated
   public boolean g_(dip $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(dip $$0) {
      return false;
   }

   @Deprecated
   public edz c_(dip $$0) {
      return eea.a.g();
   }

   @Deprecated
   public boolean d_(dip $$0) {
      return false;
   }

   public float at_() {
      return 0.25F;
   }

   public float av_() {
      return 0.2F;
   }

   @Override
   public chb m() {
      return this.aO;
   }

   @Deprecated
   public dip a(dip $$0, dcl $$1) {
      return $$0;
   }

   @Deprecated
   public dip a(dip $$0, dav $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(dip $$0, coq $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.k()));
   }

   @Deprecated
   public boolean a(dip $$0, edy $$1) {
      return $$0.r() || !$$0.e();
   }

   @Deprecated
   public List<cmh> a(dip $$0, egk.a $$1) {
      agt $$2 = this.v();
      if ($$2 == egc.a) {
         return Collections.emptyList();
      } else {
         egk $$3 = $$1.a(eip.g, $$0).a(eio.o);
         amp $$4 = $$3.a();
         egm $$5 = $$4.n().aJ().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(dip $$0, hv $$1) {
      return aty.a($$1);
   }

   @Deprecated
   public elu f(dip $$0, cse $$1, hv $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public elu b_(dip $$0, cse $$1, hv $$2) {
      return this.b($$0, $$1, $$2, elg.a());
   }

   @Deprecated
   public elu a(dip $$0, cse $$1, hv $$2) {
      return elr.a();
   }

   @Deprecated
   public int g(dip $$0, cse $$1, hv $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.N();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bjo b(dip $$0, csy $$1, hv $$2) {
      return null;
   }

   @Deprecated
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return true;
   }

   @Deprecated
   public float d(dip $$0, cse $$1, hv $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(dip $$0, csy $$1, hv $$2) {
      return 0;
   }

   @Deprecated
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return elr.b();
   }

   @Deprecated
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      return this.aG ? $$0.j($$1, $$2) : elr.a();
   }

   @Deprecated
   public boolean c(dip $$0, cse $$1, hv $$2) {
      return cvz.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(dip $$0, cse $$1, hv $$2) {
      return cvz.a($$0.c($$1, $$2));
   }

   @Deprecated
   public elu c(dip $$0, cse $$1, hv $$2, elg $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
   }

   @Deprecated
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
   }

   @Deprecated
   public float a(dip $$0, cer $$1, cse $$2, hv $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(dip $$0, amp $$1, hv $$2, cmh $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dip $$0, csy $$1, hv $$2, cer $$3) {
   }

   @Deprecated
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return 0;
   }

   @Deprecated
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
   }

   @Deprecated
   public int b(dip $$0, cse $$1, hv $$2, ia $$3) {
      return 0;
   }

   public final agt v() {
      if (this.aQ == null) {
         agt $$0 = kb.e.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   @Deprecated
   public void a(csy $$0, dip $$1, ekx $$2, cfj $$3) {
   }

   public abstract cmc k();

   protected abstract cvz q();

   public eed w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dir<cvz, dip> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eee l;
      private final eed m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dio.f q;
      private final dio.f r;
      private final dio.f s;
      private final dio.f t;
      private final dio.f u;
      private final Optional<dio.b> v;
      private final boolean w;
      private final djq x;
      private final boolean y;
      @Nullable
      protected dio.a.a a;
      private edz z = eea.a.g();
      private boolean A;

      protected a(cvz $$0, ImmutableMap<djs<?>, Comparable<?>> $$1, MapCodec<dip> $$2) {
         super($$0, $$1, $$2);
         dio.d $$3 = $$0.aP;
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
            elu $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               ekw $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().p()) {
            this.a = new dio.a.a(this.x());
         }

         this.k = this.D();
      }

      public cvz b() {
         return this.e;
      }

      public ie<cvz> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         cvz $$0 = this.b();
         return $$0 != cwb.bs && $$0 != cwb.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cse $$0, hv $$1, blj<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cse $$0, hv $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(cse $$0, hv $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public elu a(cse $$0, hv $$1, ia $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : elr.a(this.c($$0, $$1), $$2);
      }

      public elu c(cse $$0, hv $$1) {
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

      public eed d(cse $$0, hv $$1) {
         return this.m;
      }

      public dip a(dcl $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dip a(dav $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dce l() {
         return this.b().b_(this.x());
      }

      public boolean e(cse $$0, hv $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cse $$0, hv $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(cse $$0, hv $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cse $$0, hv $$1, ia $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(csy $$0, hv $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cse $$0, hv $$1) {
         return this.n;
      }

      public float a(cer $$0, cse $$1, hv $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cse $$0, hv $$1, ia $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eee o() {
         return this.l;
      }

      public boolean i(cse $$0, hv $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dip $$2 = this.x();
            return $$2.p() ? cvz.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dip $$0, ia $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public elu j(cse $$0, hv $$1) {
         return this.a($$0, $$1, elg.a());
      }

      public elu a(cse $$0, hv $$1, elg $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public elu k(cse $$0, hv $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, elg.a());
      }

      public elu b(cse $$0, hv $$1, elg $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public elu l(cse $$0, hv $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public elu c(cse $$0, hv $$1, elg $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public elu m(cse $$0, hv $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cse $$0, hv $$1, blf $$2) {
         return this.a($$0, $$1, $$2, ia.b);
      }

      public final boolean a(cse $$0, hv $$1, blf $$2, ia $$3) {
         return cvz.a(this.b($$0, $$1, elg.a($$2)), $$3);
      }

      public elb n(cse $$0, hv $$1) {
         return this.v.<elb>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(elb.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(csy $$0, hv $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(csy $$0, hv $$1, cvz $$2, hv $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(csz $$0, hv $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(csz $$0, hv $$1, int $$2, int $$3) {
         hv.a $$4 = new hv.a();

         for (ia $$5 : dio.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(csz $$0, hv $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(csz $$0, hv $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(csy $$0, hv $$1, dip $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(csy $$0, hv $$1, dip $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(csy $$0, hv $$1, csq $$2, BiConsumer<cmh, hv> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(amp $$0, hv $$1, auf $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(amp $$0, hv $$1, auf $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(csy $$0, hv $$1, blf $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(amp $$0, hv $$1, cmh $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cmh> a(egk.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bjl a(csy $$0, cer $$1, bjk $$2, ekx $$3) {
         return this.b().a(this.x(), $$0, $$3.a(), $$1, $$2, $$3);
      }

      public void a(csy $$0, hv $$1, cer $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cse $$0, hv $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cse $$0, hv $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dip a(ia $$0, dip $$1, csz $$2, hv $$3, hv $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(cse $$0, hv $$1, eep $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(coq $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(edy $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(ctb $$0, hv $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cse $$0, hv $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bjo b(csy $$0, hv $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(asg<cvz> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(asg<cvz> $$0, Predicate<dio.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ij<cvz> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(ie<cvz> $$0) {
         return this.a($$0.a());
      }

      public Stream<asg<cvz>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof cyr;
      }

      @Nullable
      public <T extends dgd> dge<T> a(csy $$0, dgf<T> $$1) {
         return this.b() instanceof cyr ? ((cyr)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(cvz $$0) {
         return this.b() == $$0;
      }

      public boolean a(ags<cvz> $$0) {
         return this.b().r().a($$0);
      }

      public edz u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(hv $$0) {
         return this.b().a(this.x(), $$0);
      }

      public ddl w() {
         return this.b().m(this.x());
      }

      public void a(csy $$0, dip $$1, ekx $$2, cfj $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cse $$0, hv $$1, ia $$2) {
         return this.a($$0, $$1, $$2, ddz.a);
      }

      public boolean a(cse $$0, hv $$1, ia $$2, ddz $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cse $$0, hv $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dip x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public djq A() {
         return this.x;
      }

      static final class a {
         private static final ia[] e = ia.values();
         private static final int f = ddz.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final elu[] i;
         protected final elu b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dip $$0) {
            cvz $$1 = $$0.b();
            this.a = $$0.i(csn.a, hv.b);
            this.g = $$1.a_($$0, csn.a, hv.b);
            this.h = $$1.g($$0, csn.a, hv.b);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new elu[e.length];
               elu $$2 = $$1.f($$0, csn.a, hv.b);

               for (ia $$3 : e) {
                  this.i[$$3.ordinal()] = elr.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, csn.a, hv.b, elg.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", kb.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(ia.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ia $$4 : e) {
                  for (ddz $$5 : ddz.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, csn.a, hv.b, $$4);
                  }
               }

               this.d = cvz.a($$0.k(csn.a, hv.b));
            }
         }

         public boolean a(ia $$0, ddz $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ia $$0, ddz $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      elb evaluate(dip var1, cse var2, hv var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dio.d> a = Codec.unit(() -> a());
      Function<dip, eed> b = $$0 -> eed.a;
      boolean c = true;
      ddl d = ddl.f;
      ToIntFunction<dip> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      agt m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      eee t = eee.a;
      boolean u = true;
      djq v = djq.a;
      boolean w;
      dio.e<blj<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ia.b) && $$0.h() < 14;
      dio.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dio.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dio.f A = this.z;
      dio.f B = ($$0, $$1, $$2) -> false;
      dio.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      chb E = chd.g;
      Optional<dio.b> F = Optional.empty();

      private d() {
      }

      public static dio.d a() {
         return new dio.d();
      }

      public static dio.d a(dio $$0) {
         dio.d $$1 = b($$0);
         dio.d $$2 = $$0.aP;
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
      public static dio.d b(dio $$0) {
         dio.d $$1 = new dio.d();
         dio.d $$2 = $$0.aP;
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

      public dio.d a(ckv $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dio.d a(eed $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dio.d a(Function<dip, eed> $$0) {
         this.b = $$0;
         return this;
      }

      public dio.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dio.d c() {
         this.n = false;
         return this;
      }

      public dio.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dio.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dio.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dio.d a(ddl $$0) {
         this.d = $$0;
         return this;
      }

      public dio.d a(ToIntFunction<dip> $$0) {
         this.e = $$0;
         return this;
      }

      public dio.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dio.d d() {
         return this.d(0.0F);
      }

      public dio.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dio.d e() {
         this.i = true;
         return this;
      }

      public dio.d f() {
         this.D = true;
         return this;
      }

      public dio.d g() {
         this.m = egc.a;
         return this;
      }

      public dio.d a(cvz $$0) {
         this.m = $$0.v();
         return this;
      }

      public dio.d h() {
         this.p = true;
         return this;
      }

      public dio.d i() {
         this.q = true;
         return this;
      }

      public dio.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dio.d k() {
         this.r = true;
         return this;
      }

      public dio.d a(eee $$0) {
         this.t = $$0;
         return this;
      }

      public dio.d l() {
         this.o = true;
         return this;
      }

      public dio.d a(dio.e<blj<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dio.d a(dio.f $$0) {
         this.y = $$0;
         return this;
      }

      public dio.d b(dio.f $$0) {
         this.z = $$0;
         return this;
      }

      public dio.d c(dio.f $$0) {
         this.A = $$0;
         return this;
      }

      public dio.d d(dio.f $$0) {
         this.B = $$0;
         return this;
      }

      public dio.d e(dio.f $$0) {
         this.C = $$0;
         return this;
      }

      public dio.d m() {
         this.h = true;
         return this;
      }

      public dio.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dio.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dio.d a(dio.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cvz $$3 = $$0x.b();
                  long $$4 = aty.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.av_();
                  float $$6 = $$3.at_();
                  double $$7 = aty.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = aty.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new elb($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cvz $$3 = $$0x.b();
                  long $$4 = aty.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.at_();
                  double $$6 = aty.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = aty.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new elb($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dio.d n() {
         this.u = false;
         return this;
      }

      public dio.d a(cgz... $$0) {
         this.E = chd.e.a($$0);
         return this;
      }

      public dio.d a(djq $$0) {
         this.v = $$0;
         return this;
      }

      public dio.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dip var1, cse var2, hv var3, A var4);
   }

   public interface f {
      boolean test(dip var1, cse var2, hv var3);
   }
}
