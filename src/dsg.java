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

public abstract class dsg implements cos {
   protected static final jf[] aF = new jf[]{jf.e, jf.f, jf.c, jf.d, jf.a, jf.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dms aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cov aO;
   protected final dsg.d aP;
   @Nullable
   protected akj<eqt> aQ;

   public dsg(dsg.d $$0) {
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

   public dsg.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dff> a();

   protected static <B extends dff> RecordCodecBuilder<B, dsg.d> u() {
      return dsg.d.a.fieldOf("properties").forGetter(dsg::t);
   }

   public static <B extends dff> MapCodec<B> b(Function<dsg.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dsh $$0, dce $$1, ja $$2, int $$3, int $$4) {
   }

   protected boolean a(dsh $$0, eoq $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(dbs.a, ja.c);
         case b:
            return $$0.u().a(awa.a);
         case c:
            return !$$0.r(dbs.a, ja.c);
         default:
            return false;
      }
   }

   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$0;
   }

   protected boolean a(dsh $$0, dsh $$1, jf $$2) {
      return false;
   }

   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      afy.a($$1, $$2);
   }

   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
   }

   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dsh $$0, dcd $$1, ja $$2, dbv $$3, BiConsumer<cua, ja> $$4) {
      if (!$$0.i() && $$3.j() != dbv.a.d) {
         dff $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cmh;
         if ($$5.a($$3) && $$1 instanceof aqk $$7) {
            dpn $$8 = $$0.t() ? $$1.c_($$2) : null;
            eqr.a $$9 = new eqr.a($$7).a(etk.f, evz.b($$2)).a(etk.i, cua.l).b(etk.h, $$8).b(etk.a, $$3.g());
            if ($$3.j() == dbv.a.c) {
               $$9.a(etk.j, $$3.a());
            }

            $$0.a($$7, $$2, cua.l, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dfh.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      return bqd.e;
   }

   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      return bqf.d;
   }

   protected boolean a(dsh $$0, dcd $$1, ja $$2, int $$3, int $$4) {
      return false;
   }

   protected dll a_(dsh $$0) {
      return dll.c;
   }

   protected boolean f_(dsh $$0) {
      return false;
   }

   protected boolean e_(dsh $$0) {
      return false;
   }

   protected eob b_(dsh $$0) {
      return eoc.a.g();
   }

   protected boolean c_(dsh $$0) {
      return false;
   }

   protected float ar_() {
      return 0.25F;
   }

   protected float at_() {
      return 0.2F;
   }

   @Override
   public cov i() {
      return this.aO;
   }

   protected dsh a(dsh $$0, dls $$1) {
      return $$0;
   }

   protected dsh a(dsh $$0, dkc $$1) {
      return $$0;
   }

   protected boolean a(dsh $$0, cxk $$1) {
      return $$0.r() && ($$1.n().e() || !$$1.n().a(this.r()));
   }

   protected boolean a(dsh $$0, eoa $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cua> a(dsh $$0, eqr.a $$1) {
      akj<eqt> $$2 = this.v();
      if ($$2 == eqk.a) {
         return Collections.emptyList();
      } else {
         eqr $$3 = $$1.a(etk.g, $$0).a(etj.r);
         aqk $$4 = $$3.a();
         eqt $$5 = $$4.o().be().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dsh $$0, ja $$1) {
      return aye.a($$1);
   }

   protected ews f(dsh $$0, dbj $$1, ja $$2) {
      return $$0.j($$1, $$2);
   }

   protected ews b_(dsh $$0, dbj $$1, ja $$2) {
      return this.b($$0, $$1, $$2, ewe.a());
   }

   protected ews a(dsh $$0, dbj $$1, ja $$2) {
      return ewp.a();
   }

   protected int g(dsh $$0, dbj $$1, ja $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.Q();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bqh b(dsh $$0, dcd $$1, ja $$2) {
      return null;
   }

   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return true;
   }

   protected float d(dsh $$0, dbj $$1, ja $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return 0;
   }

   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return ewp.b();
   }

   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return this.aG ? $$0.j($$1, $$2) : ewp.a();
   }

   protected boolean c(dsh $$0, dbj $$1, ja $$2) {
      return dff.a($$0.k($$1, $$2));
   }

   protected boolean h(dsh $$0, dbj $$1, ja $$2) {
      return dff.a($$0.c($$1, $$2));
   }

   protected ews c(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
   }

   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
   }

   protected float a(dsh $$0, cmh $$1, dbj $$2, ja $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dsh $$0, aqk $$1, ja $$2, cua $$3, boolean $$4) {
   }

   protected void a_(dsh $$0, dcd $$1, ja $$2, cmh $$3) {
   }

   protected int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return 0;
   }

   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
   }

   protected int b(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return 0;
   }

   public final akj<eqt> v() {
      if (this.aQ == null) {
         akk $$0 = lq.e.b(this.q());
         this.aQ = akj.a(lr.bb, $$0.d("blocks/"));
      }

      return this.aQ;
   }

   protected void a(dcd $$0, dsh $$1, evv $$2, cmz $$3) {
   }

   protected boolean a_(dsh $$0, dbj $$1, ja $$2) {
      return !dff.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean d_(dsh $$0) {
      return this.aI;
   }

   protected dms g_(dsh $$0) {
      return this.aJ;
   }

   public abstract ctv r();

   protected abstract dff q();

   public eof w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dsj<dff, dsh> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eog l;
      private final eof m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dsg.f q;
      private final dsg.f r;
      private final dsg.f s;
      private final dsg.f t;
      private final dsg.f u;
      private final Optional<dsg.b> v;
      private final boolean w;
      private final dti x;
      private final boolean y;
      @Nullable
      protected dsg.a.a a;
      private eob z = eoc.a.g();
      private boolean A;

      protected a(dff $$0, Reference2ObjectArrayMap<dtk<?>, Comparable<?>> $$1, MapCodec<dsh> $$2) {
         super($$0, $$1, $$2);
         dsg.d $$3 = $$0.aP;
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
            ews $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               evu $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.b_(this.x());
         this.A = this.e.d_(this.x());
         if (!this.b().p()) {
            this.a = new dsg.a.a(this.x());
         }

         this.k = this.D();
      }

      public dff b() {
         return this.e;
      }

      public jj<dff> c() {
         return this.e.s();
      }

      @Deprecated
      public boolean d() {
         dff $$0 = this.b();
         return $$0 != dfh.bs && $$0 != dfh.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(dbj $$0, ja $$1, bsj<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(dbj $$0, ja $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(dbj $$0, ja $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public ews a(dbj $$0, ja $$1, jf $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ewp.a(this.c($$0, $$1), $$2);
      }

      public ews c(dbj $$0, ja $$1) {
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

      public eof d(dbj $$0, ja $$1) {
         return this.m;
      }

      public dsh a(dls $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dsh a(dkc $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dll l() {
         return this.b().a_(this.x());
      }

      public boolean e(dbj $$0, ja $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(dbj $$0, ja $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(dbj $$0, ja $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().e_(this.x());
      }

      public int b(dbj $$0, ja $$1, jf $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().c_(this.x());
      }

      public int a(dcd $$0, ja $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(dbj $$0, ja $$1) {
         return this.n;
      }

      public float a(cmh $$0, dbj $$1, ja $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(dbj $$0, ja $$1, jf $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eog o() {
         return this.l;
      }

      public boolean i(dbj $$0, ja $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dsh $$2 = this.x();
            return $$2.p() ? dff.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dsh $$0, jf $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public ews j(dbj $$0, ja $$1) {
         return this.a($$0, $$1, ewe.a());
      }

      public ews a(dbj $$0, ja $$1, ewe $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public ews k(dbj $$0, ja $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, ewe.a());
      }

      public ews b(dbj $$0, ja $$1, ewe $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ews l(dbj $$0, ja $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public ews c(dbj $$0, ja $$1, ewe $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public ews m(dbj $$0, ja $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(dbj $$0, ja $$1, bsd $$2) {
         return this.a($$0, $$1, $$2, jf.b);
      }

      public final boolean a(dbj $$0, ja $$1, bsd $$2, jf $$3) {
         return dff.a(this.b($$0, $$1, ewe.a($$2)), $$3);
      }

      public evz n(dbj $$0, ja $$1) {
         return this.v.<evz>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(evz.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(dcd $$0, ja $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dcd $$0, ja $$1, dff $$2, ja $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dce $$0, ja $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dce $$0, ja $$1, int $$2, int $$3) {
         ja.a $$4 = new ja.a();

         for (jf $$5 : dsg.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(dce $$0, ja $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dce $$0, ja $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dcd $$0, ja $$1, dsh $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(dcd $$0, ja $$1, dsh $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dcd $$0, ja $$1, dbv $$2, BiConsumer<cua, ja> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(aqk $$0, ja $$1, aym $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(aqk $$0, ja $$1, aym $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(dcd $$0, ja $$1, bsd $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(aqk $$0, ja $$1, cua $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cua> a(eqr.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bqf a(cua $$0, dcd $$1, cmh $$2, bqc $$3, evv $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bqd a(dcd $$0, cmh $$1, evv $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(dcd $$0, ja $$1, cmh $$2) {
         this.b().a_(this.x(), $$0, $$1, $$2);
      }

      public boolean o(dbj $$0, ja $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(dbj $$0, ja $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dsh a(jf $$0, dsh $$1, dce $$2, ja $$3, ja $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(eoq $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cxk $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(eoa $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(dcg $$0, ja $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(dbj $$0, ja $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bqh b(dcd $$0, ja $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(awk<dff> $$0) {
         return this.b().s().a($$0);
      }

      public boolean a(awk<dff> $$0, Predicate<dsg.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jn<dff> $$0) {
         return $$0.a(this.b().s());
      }

      public boolean a(jj<dff> $$0) {
         return this.a($$0.a());
      }

      public Stream<awk<dff>> s() {
         return this.b().s().c();
      }

      public boolean t() {
         return this.b() instanceof dhx;
      }

      @Nullable
      public <T extends dpn> dpo<T> a(dcd $$0, dpp<T> $$1) {
         return this.b() instanceof dhx ? ((dhx)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dff $$0) {
         return this.b() == $$0;
      }

      public boolean a(akj<dff> $$0) {
         return this.b().s().a($$0);
      }

      public eob u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(ja $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dms w() {
         return this.b().g_(this.x());
      }

      public void a(dcd $$0, dsh $$1, evv $$2, cmz $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(dbj $$0, ja $$1, jf $$2) {
         return this.a($$0, $$1, $$2, dng.a);
      }

      public boolean a(dbj $$0, ja $$1, jf $$2, dng $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(dbj $$0, ja $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dsh x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dti A() {
         return this.x;
      }

      static final class a {
         private static final jf[] e = jf.values();
         private static final int f = dng.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final ews[] i;
         protected final ews b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dsh $$0) {
            dff $$1 = $$0.b();
            this.a = $$0.i(dbs.a, ja.c);
            this.g = $$1.a_($$0, dbs.a, ja.c);
            this.h = $$1.g($$0, dbs.a, ja.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new ews[e.length];
               ews $$2 = $$1.f($$0, dbs.a, ja.c);

               for (jf $$3 : e) {
                  this.i[$$3.ordinal()] = ewp.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, dbs.a, ja.c, ewe.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lq.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(jf.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (jf $$4 : e) {
                  for (dng $$5 : dng.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, dbs.a, ja.c, $$4);
                  }
               }

               this.d = dff.a($$0.k(dbs.a, ja.c));
            }
         }

         public boolean a(jf $$0, dng $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(jf $$0, dng $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      evz evaluate(dsh var1, dbj var2, ja var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dsg.d> a = Codec.unit(() -> a());
      Function<dsh, eof> b = $$0 -> eof.a;
      boolean c = true;
      dms d = dms.f;
      ToIntFunction<dsh> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      akj<eqt> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      eog t = eog.a;
      boolean u = true;
      dti v = dti.a;
      boolean w;
      dsg.e<bsj<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, jf.b) && $$0.h() < 14;
      dsg.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dsg.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dsg.f A = this.z;
      dsg.f B = ($$0, $$1, $$2) -> false;
      dsg.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cov E = cox.f;
      Optional<dsg.b> F = Optional.empty();

      private d() {
      }

      public static dsg.d a() {
         return new dsg.d();
      }

      public static dsg.d a(dsg $$0) {
         dsg.d $$1 = b($$0);
         dsg.d $$2 = $$0.aP;
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
      public static dsg.d b(dsg $$0) {
         dsg.d $$1 = new dsg.d();
         dsg.d $$2 = $$0.aP;
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

      public dsg.d a(cst $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dsg.d a(eof $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dsg.d a(Function<dsh, eof> $$0) {
         this.b = $$0;
         return this;
      }

      public dsg.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dsg.d c() {
         this.n = false;
         return this;
      }

      public dsg.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dsg.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dsg.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dsg.d a(dms $$0) {
         this.d = $$0;
         return this;
      }

      public dsg.d a(ToIntFunction<dsh> $$0) {
         this.e = $$0;
         return this;
      }

      public dsg.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dsg.d d() {
         return this.d(0.0F);
      }

      public dsg.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dsg.d e() {
         this.i = true;
         return this;
      }

      public dsg.d f() {
         this.D = true;
         return this;
      }

      public dsg.d g() {
         this.m = eqk.a;
         return this;
      }

      public dsg.d a(dff $$0) {
         this.m = $$0.v();
         return this;
      }

      public dsg.d h() {
         this.p = true;
         return this;
      }

      public dsg.d i() {
         this.q = true;
         return this;
      }

      public dsg.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dsg.d k() {
         this.r = true;
         return this;
      }

      public dsg.d a(eog $$0) {
         this.t = $$0;
         return this;
      }

      public dsg.d l() {
         this.o = true;
         return this;
      }

      public dsg.d a(dsg.e<bsj<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dsg.d a(dsg.f $$0) {
         this.y = $$0;
         return this;
      }

      public dsg.d b(dsg.f $$0) {
         this.z = $$0;
         return this;
      }

      public dsg.d c(dsg.f $$0) {
         this.A = $$0;
         return this;
      }

      public dsg.d d(dsg.f $$0) {
         this.B = $$0;
         return this;
      }

      public dsg.d e(dsg.f $$0) {
         this.C = $$0;
         return this;
      }

      public dsg.d m() {
         this.h = true;
         return this;
      }

      public dsg.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dsg.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dsg.d a(dsg.c $$0) {
         switch ($$0) {
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dff $$3 = $$0x.b();
                  long $$4 = aye.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.ar_();
                  double $$6 = aye.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = aye.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new evz($$6, 0.0, $$7);
               });
               break;
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dff $$3 = $$0x.b();
                  long $$4 = aye.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.at_();
                  float $$6 = $$3.ar_();
                  double $$7 = aye.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = aye.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new evz($$7, $$5, $$8);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dsg.d n() {
         this.u = false;
         return this;
      }

      public dsg.d a(cot... $$0) {
         this.E = cox.d.a($$0);
         return this;
      }

      public dsg.d a(dti $$0) {
         this.v = $$0;
         return this;
      }

      public dsg.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dsh var1, dbj var2, ja var3, A var4);
   }

   public interface f {
      boolean test(dsh var1, dbj var2, ja var3);
   }
}
