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

public abstract class dgv implements cfs {
   protected static final hx[] aF = new hx[]{hx.e, hx.f, hx.c, hx.d, hx.a, hx.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dcf aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cfv aO;
   protected final dgv.d aP;
   @Nullable
   protected agg aQ;

   public dgv(dgv.d $$0) {
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

   public dgv.d s() {
      return this.aP;
   }

   protected abstract MapCodec<? extends cut> a();

   protected static <B extends cut> RecordCodecBuilder<B, dgv.d> t() {
      return dgv.d.a.fieldOf("properties").forGetter(dgv::s);
   }

   public static <B extends cut> MapCodec<B> b(Function<dgv.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   @Deprecated
   public void a(dgw $$0, crt $$1, ht $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(arh.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   @Deprecated
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(dgw $$0, dgw $$1, hx $$2) {
      return false;
   }

   @Deprecated
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      aci.a($$1, $$2);
   }

   @Deprecated
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.n($$2);
      }
   }

   @Deprecated
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      return biq.d;
   }

   @Deprecated
   public boolean a(dgw $$0, crs $$1, ht $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public day b_(dgw $$0) {
      return day.c;
   }

   @Deprecated
   public boolean g_(dgw $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(dgw $$0) {
      return false;
   }

   @Deprecated
   public ecg c_(dgw $$0) {
      return ech.a.g();
   }

   @Deprecated
   public boolean d_(dgw $$0) {
      return false;
   }

   public float as_() {
      return 0.25F;
   }

   public float au_() {
      return 0.2F;
   }

   @Override
   public cfv m() {
      return this.aO;
   }

   @Deprecated
   public dgw a(dgw $$0, dbf $$1) {
      return $$0;
   }

   @Deprecated
   public dgw a(dgw $$0, czp $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(dgw $$0, cnj $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.k()));
   }

   @Deprecated
   public boolean a(dgw $$0, ecf $$1) {
      return $$0.r() || !$$0.e();
   }

   @Deprecated
   public List<clb> a(dgw $$0, eer.a $$1) {
      agg $$2 = this.u();
      if ($$2 == eej.a) {
         return Collections.emptyList();
      } else {
         eer $$3 = $$1.a(egw.g, $$0).a(egv.o);
         ama $$4 = $$3.a();
         eet $$5 = $$4.n().aH().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(dgw $$0, ht $$1) {
      return ati.a($$1);
   }

   @Deprecated
   public ekb f(dgw $$0, cqy $$1, ht $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public ekb b_(dgw $$0, cqy $$1, ht $$2) {
      return this.c($$0, $$1, $$2, ejn.a());
   }

   @Deprecated
   public ekb a(dgw $$0, cqy $$1, ht $$2) {
      return ejy.a();
   }

   @Deprecated
   public int g(dgw $$0, cqy $$1, ht $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.M();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bit b(dgw $$0, crs $$1, ht $$2) {
      return null;
   }

   @Deprecated
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return true;
   }

   @Deprecated
   public float b(dgw $$0, cqy $$1, ht $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(dgw $$0, crs $$1, ht $$2) {
      return 0;
   }

   @Deprecated
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return ejy.b();
   }

   @Deprecated
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return this.aG ? $$0.j($$1, $$2) : ejy.a();
   }

   @Deprecated
   public boolean a_(dgw $$0, cqy $$1, ht $$2) {
      return cut.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(dgw $$0, cqy $$1, ht $$2) {
      return cut.a($$0.c($$1, $$2));
   }

   @Deprecated
   public ekb b(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return this.c($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
   }

   @Deprecated
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
   }

   @Deprecated
   public float a(dgw $$0, cdm $$1, cqy $$2, ht $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(dgw $$0, ama $$1, ht $$2, clb $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dgw $$0, crs $$1, ht $$2, cdm $$3) {
   }

   @Deprecated
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return 0;
   }

   @Deprecated
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
   }

   @Deprecated
   public int b(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return 0;
   }

   public final agg u() {
      if (this.aQ == null) {
         agg $$0 = jy.f.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   @Deprecated
   public void a(crs $$0, dgw $$1, eje $$2, cee $$3) {
   }

   public abstract ckw k();

   protected abstract cut q();

   public eck v() {
      return this.aP.b.apply(this.q().o());
   }

   public float w() {
      return this.aP.g;
   }

   public abstract static class a extends dgy<cut, dgw> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final ecl l;
      private final eck m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dgv.f q;
      private final dgv.f r;
      private final dgv.f s;
      private final dgv.f t;
      private final dgv.f u;
      private final Optional<dgv.b> v;
      private final boolean w;
      private final dhx x;
      private final boolean y;
      @Nullable
      protected dgv.a.a a;
      private ecg z = ech.a.g();
      private boolean A;

      protected a(cut $$0, ImmutableMap<dhz<?>, Comparable<?>> $$1, MapCodec<dgw> $$2) {
         super($$0, $$1, $$2);
         dgv.d $$3 = $$0.aP;
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
            ekb $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               ejd $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().p()) {
            this.a = new dgv.a.a(this.x());
         }

         this.k = this.D();
      }

      public cut b() {
         return this.e;
      }

      public ib<cut> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         cut $$0 = this.b();
         return $$0 != cuv.bs && $$0 != cuv.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cqy $$0, ht $$1, bkm<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cqy $$0, ht $$1) {
         return this.a != null ? this.a.g : this.b().c(this.x(), $$0, $$1);
      }

      public int b(cqy $$0, ht $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public ekb a(cqy $$0, ht $$1, hx $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ejy.a(this.c($$0, $$1), $$2);
      }

      public ekb c(cqy $$0, ht $$1) {
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

      public eck d(cqy $$0, ht $$1) {
         return this.m;
      }

      public dgw a(dbf $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dgw a(czp $$0) {
         return this.b().a(this.x(), $$0);
      }

      public day l() {
         return this.b().b_(this.x());
      }

      public boolean e(cqy $$0, ht $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cqy $$0, ht $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean g(cqy $$0, ht $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cqy $$0, ht $$1, hx $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(crs $$0, ht $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cqy $$0, ht $$1) {
         return this.n;
      }

      public float a(cdm $$0, cqy $$1, ht $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cqy $$0, ht $$1, hx $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ecl o() {
         return this.l;
      }

      public boolean i(cqy $$0, ht $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dgw $$2 = this.x();
            return $$2.p() ? cut.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dgw $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public ekb j(cqy $$0, ht $$1) {
         return this.a($$0, $$1, ejn.a());
      }

      public ekb a(cqy $$0, ht $$1, ejn $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public ekb k(cqy $$0, ht $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, ejn.a());
      }

      public ekb b(cqy $$0, ht $$1, ejn $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public ekb l(cqy $$0, ht $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public ekb c(cqy $$0, ht $$1, ejn $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ekb m(cqy $$0, ht $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cqy $$0, ht $$1, bki $$2) {
         return this.a($$0, $$1, $$2, hx.b);
      }

      public final boolean a(cqy $$0, ht $$1, bki $$2, hx $$3) {
         return cut.a(this.b($$0, $$1, ejn.a($$2)), $$3);
      }

      public eji n(cqy $$0, ht $$1) {
         return this.v.<eji>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(eji.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(crs $$0, ht $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(crs $$0, ht $$1, cut $$2, ht $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(crt $$0, ht $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(crt $$0, ht $$1, int $$2, int $$3) {
         ht.a $$4 = new ht.a();

         for (hx $$5 : dgv.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(crt $$0, ht $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(crt $$0, ht $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(crs $$0, ht $$1, dgw $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(crs $$0, ht $$1, dgw $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(ama $$0, ht $$1, ato $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(ama $$0, ht $$1, ato $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(crs $$0, ht $$1, bki $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(ama $$0, ht $$1, clb $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<clb> a(eer.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public biq a(crs $$0, cdm $$1, bip $$2, eje $$3) {
         return this.b().a(this.x(), $$0, $$3.a(), $$1, $$2, $$3);
      }

      public void a(crs $$0, ht $$1, cdm $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cqy $$0, ht $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cqy $$0, ht $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dgw a(hx $$0, dgw $$1, crt $$2, ht $$3, ht $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(cqy $$0, ht $$1, ecw $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cnj $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(ecf $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(crv $$0, ht $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cqy $$0, ht $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bit b(crs $$0, ht $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(arr<cut> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(arr<cut> $$0, Predicate<dgv.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ig<cut> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(ib<cut> $$0) {
         return this.a($$0.a());
      }

      public Stream<arr<cut>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof cxk;
      }

      @Nullable
      public <T extends der> des<T> a(crs $$0, det<T> $$1) {
         return this.b() instanceof cxk ? ((cxk)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(cut $$0) {
         return this.b() == $$0;
      }

      public boolean a(agf<cut> $$0) {
         return this.b().r().a($$0);
      }

      public ecg u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(ht $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dcf w() {
         return this.b().m(this.x());
      }

      public void a(crs $$0, dgw $$1, eje $$2, cee $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cqy $$0, ht $$1, hx $$2) {
         return this.a($$0, $$1, $$2, dct.a);
      }

      public boolean a(cqy $$0, ht $$1, hx $$2, dct $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cqy $$0, ht $$1) {
         return this.a != null ? this.a.d : this.b().a_(this.x(), $$0, $$1);
      }

      protected abstract dgw x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dhx A() {
         return this.x;
      }

      static final class a {
         private static final hx[] e = hx.values();
         private static final int f = dct.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final ekb[] i;
         protected final ekb b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dgw $$0) {
            cut $$1 = $$0.b();
            this.a = $$0.i(crh.a, ht.b);
            this.g = $$1.c($$0, crh.a, ht.b);
            this.h = $$1.g($$0, crh.a, ht.b);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new ekb[e.length];
               ekb $$2 = $$1.f($$0, crh.a, ht.b);

               for (hx $$3 : e) {
                  this.i[$$3.ordinal()] = ejy.a($$2, $$3);
               }
            }

            this.b = $$1.c($$0, crh.a, ht.b, ejn.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", jy.f.b($$1))
               );
            } else {
               this.c = Arrays.stream(hx.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (hx $$4 : e) {
                  for (dct $$5 : dct.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, crh.a, ht.b, $$4);
                  }
               }

               this.d = cut.a($$0.k(crh.a, ht.b));
            }
         }

         public boolean a(hx $$0, dct $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(hx $$0, dct $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      eji evaluate(dgw var1, cqy var2, ht var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dgv.d> a = Codec.unit(() -> a());
      Function<dgw, eck> b = $$0 -> eck.a;
      boolean c = true;
      dcf d = dcf.f;
      ToIntFunction<dgw> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      agg m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      ecl t = ecl.a;
      boolean u = true;
      dhx v = dhx.a;
      boolean w;
      dgv.e<bkm<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, hx.b) && $$0.h() < 14;
      dgv.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dgv.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dgv.f A = this.z;
      dgv.f B = ($$0, $$1, $$2) -> false;
      dgv.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cfv E = cfx.g;
      Optional<dgv.b> F = Optional.empty();

      private d() {
      }

      public static dgv.d a() {
         return new dgv.d();
      }

      public static dgv.d a(dgv $$0) {
         dgv.d $$1 = new dgv.d();
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

      public dgv.d a(cjp $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dgv.d a(eck $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dgv.d a(Function<dgw, eck> $$0) {
         this.b = $$0;
         return this;
      }

      public dgv.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dgv.d c() {
         this.n = false;
         return this;
      }

      public dgv.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dgv.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dgv.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dgv.d a(dcf $$0) {
         this.d = $$0;
         return this;
      }

      public dgv.d a(ToIntFunction<dgw> $$0) {
         this.e = $$0;
         return this;
      }

      public dgv.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dgv.d d() {
         return this.d(0.0F);
      }

      public dgv.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dgv.d e() {
         this.i = true;
         return this;
      }

      public dgv.d f() {
         this.D = true;
         return this;
      }

      public dgv.d g() {
         this.m = eej.a;
         return this;
      }

      public dgv.d a(cut $$0) {
         this.m = $$0.u();
         return this;
      }

      public dgv.d h() {
         this.p = true;
         return this;
      }

      public dgv.d i() {
         this.q = true;
         return this;
      }

      public dgv.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dgv.d k() {
         this.r = true;
         return this;
      }

      public dgv.d a(ecl $$0) {
         this.t = $$0;
         return this;
      }

      public dgv.d l() {
         this.o = true;
         return this;
      }

      public dgv.d a(dgv.e<bkm<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dgv.d a(dgv.f $$0) {
         this.y = $$0;
         return this;
      }

      public dgv.d b(dgv.f $$0) {
         this.z = $$0;
         return this;
      }

      public dgv.d c(dgv.f $$0) {
         this.A = $$0;
         return this;
      }

      public dgv.d d(dgv.f $$0) {
         this.B = $$0;
         return this;
      }

      public dgv.d e(dgv.f $$0) {
         this.C = $$0;
         return this;
      }

      public dgv.d m() {
         this.h = true;
         return this;
      }

      public dgv.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dgv.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dgv.d a(dgv.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cut $$3 = $$0x.b();
                  long $$4 = ati.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.au_();
                  float $$6 = $$3.as_();
                  double $$7 = ati.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = ati.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new eji($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cut $$3 = $$0x.b();
                  long $$4 = ati.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.as_();
                  double $$6 = ati.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = ati.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new eji($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dgv.d n() {
         this.u = false;
         return this;
      }

      public dgv.d a(cft... $$0) {
         this.E = cfx.e.a($$0);
         return this;
      }

      public dgv.d a(dhx $$0) {
         this.v = $$0;
         return this;
      }

      public dgv.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dgw var1, cqy var2, ht var3, A var4);
   }

   public interface f {
      boolean test(dgw var1, cqy var2, ht var3);
   }
}
