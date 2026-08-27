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

public abstract class dhm implements cgf {
   protected static final ib[] aF = new ib[]{ib.e, ib.f, ib.c, ib.d, ib.a, ib.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dcr aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cgi aO;
   protected final dhm.d aP;
   @Nullable
   protected agm aQ;

   public dhm(dhm.d $$0) {
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

   public dhm.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends cvf> a();

   protected static <B extends cvf> RecordCodecBuilder<B, dhm.d> u() {
      return dhm.d.a.fieldOf("properties").forGetter(dhm::t);
   }

   public static <B extends cvf> MapCodec<B> b(Function<dhm.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   @Deprecated
   public void a(dhn $$0, csg $$1, hx $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(arp.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   @Deprecated
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(dhn $$0, dhn $$1, ib $$2) {
      return false;
   }

   @Deprecated
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      aco.a($$1, $$2);
   }

   @Deprecated
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.n($$2);
      }
   }

   @Deprecated
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      return bjb.d;
   }

   @Deprecated
   public boolean a(dhn $$0, csf $$1, hx $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Deprecated
   public boolean g_(dhn $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(dhn $$0) {
      return false;
   }

   @Deprecated
   public ecx c_(dhn $$0) {
      return ecy.a.g();
   }

   @Deprecated
   public boolean d_(dhn $$0) {
      return false;
   }

   public float au_() {
      return 0.25F;
   }

   public float aw_() {
      return 0.2F;
   }

   @Override
   public cgi m() {
      return this.aO;
   }

   @Deprecated
   public dhn a(dhn $$0, dbr $$1) {
      return $$0;
   }

   @Deprecated
   public dhn a(dhn $$0, dab $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(dhn $$0, cnw $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.k()));
   }

   @Deprecated
   public boolean a(dhn $$0, ecw $$1) {
      return $$0.r() || !$$0.e();
   }

   @Deprecated
   public List<clo> a(dhn $$0, efi.a $$1) {
      agm $$2 = this.v();
      if ($$2 == efa.a) {
         return Collections.emptyList();
      } else {
         efi $$3 = $$1.a(ehn.g, $$0).a(ehm.o);
         ami $$4 = $$3.a();
         efk $$5 = $$4.n().aJ().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(dhn $$0, hx $$1) {
      return atq.a($$1);
   }

   @Deprecated
   public eks f(dhn $$0, crl $$1, hx $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public eks b_(dhn $$0, crl $$1, hx $$2) {
      return this.b($$0, $$1, $$2, eke.a());
   }

   @Deprecated
   public eks a(dhn $$0, crl $$1, hx $$2) {
      return ekp.a();
   }

   @Deprecated
   public int g(dhn $$0, crl $$1, hx $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.N();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bje b(dhn $$0, csf $$1, hx $$2) {
      return null;
   }

   @Deprecated
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return true;
   }

   @Deprecated
   public float d(dhn $$0, crl $$1, hx $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(dhn $$0, csf $$1, hx $$2) {
      return 0;
   }

   @Deprecated
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return ekp.b();
   }

   @Deprecated
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return this.aG ? $$0.j($$1, $$2) : ekp.a();
   }

   @Deprecated
   public boolean c(dhn $$0, crl $$1, hx $$2) {
      return cvf.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(dhn $$0, crl $$1, hx $$2) {
      return cvf.a($$0.c($$1, $$2));
   }

   @Deprecated
   public eks c(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
   }

   @Deprecated
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
   }

   @Deprecated
   public float a(dhn $$0, cdz $$1, crl $$2, hx $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(dhn $$0, ami $$1, hx $$2, clo $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dhn $$0, csf $$1, hx $$2, cdz $$3) {
   }

   @Deprecated
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return 0;
   }

   @Deprecated
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
   }

   @Deprecated
   public int b(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return 0;
   }

   public final agm v() {
      if (this.aQ == null) {
         agm $$0 = kc.f.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   @Deprecated
   public void a(csf $$0, dhn $$1, ejv $$2, cer $$3) {
   }

   public abstract clj k();

   protected abstract cvf q();

   public edb w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dhp<cvf, dhn> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final edc l;
      private final edb m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dhm.f q;
      private final dhm.f r;
      private final dhm.f s;
      private final dhm.f t;
      private final dhm.f u;
      private final Optional<dhm.b> v;
      private final boolean w;
      private final dio x;
      private final boolean y;
      @Nullable
      protected dhm.a.a a;
      private ecx z = ecy.a.g();
      private boolean A;

      protected a(cvf $$0, ImmutableMap<diq<?>, Comparable<?>> $$1, MapCodec<dhn> $$2) {
         super($$0, $$1, $$2);
         dhm.d $$3 = $$0.aP;
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
            eks $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               eju $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().p()) {
            this.a = new dhm.a.a(this.x());
         }

         this.k = this.D();
      }

      public cvf b() {
         return this.e;
      }

      public ig<cvf> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         cvf $$0 = this.b();
         return $$0 != cvh.bs && $$0 != cvh.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(crl $$0, hx $$1, bkz<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(crl $$0, hx $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(crl $$0, hx $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public eks a(crl $$0, hx $$1, ib $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ekp.a(this.c($$0, $$1), $$2);
      }

      public eks c(crl $$0, hx $$1) {
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

      public edb d(crl $$0, hx $$1) {
         return this.m;
      }

      public dhn a(dbr $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dhn a(dab $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dbk l() {
         return this.b().b_(this.x());
      }

      public boolean e(crl $$0, hx $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(crl $$0, hx $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(crl $$0, hx $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(crl $$0, hx $$1, ib $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(csf $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(crl $$0, hx $$1) {
         return this.n;
      }

      public float a(cdz $$0, crl $$1, hx $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(crl $$0, hx $$1, ib $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public edc o() {
         return this.l;
      }

      public boolean i(crl $$0, hx $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dhn $$2 = this.x();
            return $$2.p() ? cvf.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dhn $$0, ib $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public eks j(crl $$0, hx $$1) {
         return this.a($$0, $$1, eke.a());
      }

      public eks a(crl $$0, hx $$1, eke $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public eks k(crl $$0, hx $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, eke.a());
      }

      public eks b(crl $$0, hx $$1, eke $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eks l(crl $$0, hx $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public eks c(crl $$0, hx $$1, eke $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public eks m(crl $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(crl $$0, hx $$1, bkv $$2) {
         return this.a($$0, $$1, $$2, ib.b);
      }

      public final boolean a(crl $$0, hx $$1, bkv $$2, ib $$3) {
         return cvf.a(this.b($$0, $$1, eke.a($$2)), $$3);
      }

      public ejz n(crl $$0, hx $$1) {
         return this.v.<ejz>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(ejz.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(csf $$0, hx $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(csf $$0, hx $$1, cvf $$2, hx $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(csg $$0, hx $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(csg $$0, hx $$1, int $$2, int $$3) {
         hx.a $$4 = new hx.a();

         for (ib $$5 : dhm.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(csg $$0, hx $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(csg $$0, hx $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(csf $$0, hx $$1, dhn $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(csf $$0, hx $$1, dhn $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(ami $$0, hx $$1, atw $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(ami $$0, hx $$1, atw $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(csf $$0, hx $$1, bkv $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(ami $$0, hx $$1, clo $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<clo> a(efi.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bjb a(csf $$0, cdz $$1, bja $$2, ejv $$3) {
         return this.b().a(this.x(), $$0, $$3.a(), $$1, $$2, $$3);
      }

      public void a(csf $$0, hx $$1, cdz $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(crl $$0, hx $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(crl $$0, hx $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dhn a(ib $$0, dhn $$1, csg $$2, hx $$3, hx $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(crl $$0, hx $$1, edn $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cnw $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(ecw $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(csi $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(crl $$0, hx $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bje b(csf $$0, hx $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(arz<cvf> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(arz<cvf> $$0, Predicate<dhm.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ik<cvf> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(ig<cvf> $$0) {
         return this.a($$0.a());
      }

      public Stream<arz<cvf>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof cxx;
      }

      @Nullable
      public <T extends dfi> dfj<T> a(csf $$0, dfk<T> $$1) {
         return this.b() instanceof cxx ? ((cxx)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(cvf $$0) {
         return this.b() == $$0;
      }

      public boolean a(agl<cvf> $$0) {
         return this.b().r().a($$0);
      }

      public ecx u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(hx $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dcr w() {
         return this.b().m(this.x());
      }

      public void a(csf $$0, dhn $$1, ejv $$2, cer $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(crl $$0, hx $$1, ib $$2) {
         return this.a($$0, $$1, $$2, ddf.a);
      }

      public boolean a(crl $$0, hx $$1, ib $$2, ddf $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(crl $$0, hx $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dhn x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dio A() {
         return this.x;
      }

      static final class a {
         private static final ib[] e = ib.values();
         private static final int f = ddf.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final eks[] i;
         protected final eks b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dhn $$0) {
            cvf $$1 = $$0.b();
            this.a = $$0.i(cru.a, hx.b);
            this.g = $$1.a_($$0, cru.a, hx.b);
            this.h = $$1.g($$0, cru.a, hx.b);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new eks[e.length];
               eks $$2 = $$1.f($$0, cru.a, hx.b);

               for (ib $$3 : e) {
                  this.i[$$3.ordinal()] = ekp.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, cru.a, hx.b, eke.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", kc.f.b($$1))
               );
            } else {
               this.c = Arrays.stream(ib.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ib $$4 : e) {
                  for (ddf $$5 : ddf.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cru.a, hx.b, $$4);
                  }
               }

               this.d = cvf.a($$0.k(cru.a, hx.b));
            }
         }

         public boolean a(ib $$0, ddf $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ib $$0, ddf $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      ejz evaluate(dhn var1, crl var2, hx var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dhm.d> a = Codec.unit(() -> a());
      Function<dhn, edb> b = $$0 -> edb.a;
      boolean c = true;
      dcr d = dcr.f;
      ToIntFunction<dhn> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      agm m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      edc t = edc.a;
      boolean u = true;
      dio v = dio.a;
      boolean w;
      dhm.e<bkz<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ib.b) && $$0.h() < 14;
      dhm.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dhm.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dhm.f A = this.z;
      dhm.f B = ($$0, $$1, $$2) -> false;
      dhm.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cgi E = cgk.g;
      Optional<dhm.b> F = Optional.empty();

      private d() {
      }

      public static dhm.d a() {
         return new dhm.d();
      }

      public static dhm.d a(dhm $$0) {
         dhm.d $$1 = new dhm.d();
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

      public dhm.d a(ckc $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dhm.d a(edb $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dhm.d a(Function<dhn, edb> $$0) {
         this.b = $$0;
         return this;
      }

      public dhm.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dhm.d c() {
         this.n = false;
         return this;
      }

      public dhm.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dhm.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dhm.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dhm.d a(dcr $$0) {
         this.d = $$0;
         return this;
      }

      public dhm.d a(ToIntFunction<dhn> $$0) {
         this.e = $$0;
         return this;
      }

      public dhm.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dhm.d d() {
         return this.d(0.0F);
      }

      public dhm.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dhm.d e() {
         this.i = true;
         return this;
      }

      public dhm.d f() {
         this.D = true;
         return this;
      }

      public dhm.d g() {
         this.m = efa.a;
         return this;
      }

      public dhm.d a(cvf $$0) {
         this.m = $$0.v();
         return this;
      }

      public dhm.d h() {
         this.p = true;
         return this;
      }

      public dhm.d i() {
         this.q = true;
         return this;
      }

      public dhm.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dhm.d k() {
         this.r = true;
         return this;
      }

      public dhm.d a(edc $$0) {
         this.t = $$0;
         return this;
      }

      public dhm.d l() {
         this.o = true;
         return this;
      }

      public dhm.d a(dhm.e<bkz<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dhm.d a(dhm.f $$0) {
         this.y = $$0;
         return this;
      }

      public dhm.d b(dhm.f $$0) {
         this.z = $$0;
         return this;
      }

      public dhm.d c(dhm.f $$0) {
         this.A = $$0;
         return this;
      }

      public dhm.d d(dhm.f $$0) {
         this.B = $$0;
         return this;
      }

      public dhm.d e(dhm.f $$0) {
         this.C = $$0;
         return this;
      }

      public dhm.d m() {
         this.h = true;
         return this;
      }

      public dhm.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dhm.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dhm.d a(dhm.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cvf $$3 = $$0x.b();
                  long $$4 = atq.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.aw_();
                  float $$6 = $$3.au_();
                  double $$7 = atq.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = atq.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new ejz($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cvf $$3 = $$0x.b();
                  long $$4 = atq.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.au_();
                  double $$6 = atq.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = atq.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new ejz($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dhm.d n() {
         this.u = false;
         return this;
      }

      public dhm.d a(cgg... $$0) {
         this.E = cgk.e.a($$0);
         return this;
      }

      public dhm.d a(dio $$0) {
         this.v = $$0;
         return this;
      }

      public dhm.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dhn var1, crl var2, hx var3, A var4);
   }

   public interface f {
      boolean test(dhn var1, crl var2, hx var3);
   }
}
