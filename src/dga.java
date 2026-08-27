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

public abstract class dga implements cfd {
   protected static final hx[] aF = new hx[]{hx.e, hx.f, hx.c, hx.d, hx.a, hx.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dbl aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cfg aO;
   protected final dga.d aP;
   @Nullable
   protected afw aQ;

   public dga(dga.d $$0) {
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

   public dga.d s() {
      return this.aP;
   }

   protected abstract MapCodec<? extends cua> a();

   protected static <B extends cua> RecordCodecBuilder<B, dga.d> t() {
      return dga.d.a.fieldOf("properties").forGetter(dga::s);
   }

   public static <B extends cua> MapCodec<B> b(Function<dga.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   @Deprecated
   public void a(dgb $$0, cra $$1, ht $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(aqx.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   @Deprecated
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(dgb $$0, dgb $$1, hx $$2) {
      return false;
   }

   @Deprecated
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      abz.a($$1, $$2);
   }

   @Deprecated
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.n($$2);
      }
   }

   @Deprecated
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      return bib.d;
   }

   @Deprecated
   public boolean a(dgb $$0, cqz $$1, ht $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Deprecated
   public boolean g_(dgb $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(dgb $$0) {
      return false;
   }

   @Deprecated
   public ebe c_(dgb $$0) {
      return ebf.a.g();
   }

   @Deprecated
   public boolean d_(dgb $$0) {
      return false;
   }

   public float as_() {
      return 0.25F;
   }

   public float au_() {
      return 0.2F;
   }

   @Override
   public cfg m() {
      return this.aO;
   }

   @Deprecated
   public dgb a(dgb $$0, dal $$1) {
      return $$0;
   }

   @Deprecated
   public dgb a(dgb $$0, cyv $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(dgb $$0, cmr $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.k()));
   }

   @Deprecated
   public boolean a(dgb $$0, ebd $$1) {
      return $$0.r() || !$$0.e();
   }

   @Deprecated
   public List<ckj> a(dgb $$0, edo.a $$1) {
      afw $$2 = this.u();
      if ($$2 == edg.a) {
         return Collections.emptyList();
      } else {
         edo $$3 = $$1.a(eft.g, $$0).a(efs.o);
         alq $$4 = $$3.a();
         edq $$5 = $$4.n().aH().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(dgb $$0, ht $$1) {
      return asy.a($$1);
   }

   @Deprecated
   public eiy f(dgb $$0, cqf $$1, ht $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public eiy b_(dgb $$0, cqf $$1, ht $$2) {
      return this.c($$0, $$1, $$2, eik.a());
   }

   @Deprecated
   public eiy a(dgb $$0, cqf $$1, ht $$2) {
      return eiv.a();
   }

   @Deprecated
   public int g(dgb $$0, cqf $$1, ht $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.M();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bie b(dgb $$0, cqz $$1, ht $$2) {
      return null;
   }

   @Deprecated
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return true;
   }

   @Deprecated
   public float b(dgb $$0, cqf $$1, ht $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(dgb $$0, cqz $$1, ht $$2) {
      return 0;
   }

   @Deprecated
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return eiv.b();
   }

   @Deprecated
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return this.aG ? $$0.j($$1, $$2) : eiv.a();
   }

   @Deprecated
   public boolean a_(dgb $$0, cqf $$1, ht $$2) {
      return cua.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(dgb $$0, cqf $$1, ht $$2) {
      return cua.a($$0.c($$1, $$2));
   }

   @Deprecated
   public eiy b(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return this.c($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
   }

   @Deprecated
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
   }

   @Deprecated
   public float a(dgb $$0, ccx $$1, cqf $$2, ht $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(dgb $$0, alq $$1, ht $$2, ckj $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dgb $$0, cqz $$1, ht $$2, ccx $$3) {
   }

   @Deprecated
   public int a(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return 0;
   }

   @Deprecated
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
   }

   @Deprecated
   public int b(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return 0;
   }

   public final afw u() {
      if (this.aQ == null) {
         afw $$0 = jy.f.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   @Deprecated
   public void a(cqz $$0, dgb $$1, eib $$2, cdp $$3) {
   }

   public abstract cke k();

   protected abstract cua q();

   public ebi v() {
      return this.aP.b.apply(this.q().o());
   }

   public float w() {
      return this.aP.g;
   }

   public abstract static class a extends dgd<cua, dgb> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final ebj l;
      private final ebi m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dga.f q;
      private final dga.f r;
      private final dga.f s;
      private final dga.f t;
      private final dga.f u;
      private final Optional<dga.b> v;
      private final boolean w;
      private final dhc x;
      private final boolean y;
      @Nullable
      protected dga.a.a a;
      private ebe z = ebf.a.g();
      private boolean A;

      protected a(cua $$0, ImmutableMap<dhe<?>, Comparable<?>> $$1, MapCodec<dgb> $$2) {
         super($$0, $$1, $$2);
         dga.d $$3 = $$0.aP;
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
            eiy $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               eia $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().p()) {
            this.a = new dga.a.a(this.x());
         }

         this.k = this.D();
      }

      public cua b() {
         return this.e;
      }

      public ib<cua> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         cua $$0 = this.b();
         return $$0 != cuc.bs && $$0 != cuc.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cqf $$0, ht $$1, bjx<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cqf $$0, ht $$1) {
         return this.a != null ? this.a.g : this.b().c(this.x(), $$0, $$1);
      }

      public int b(cqf $$0, ht $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public eiy a(cqf $$0, ht $$1, hx $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : eiv.a(this.c($$0, $$1), $$2);
      }

      public eiy c(cqf $$0, ht $$1) {
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

      public ebi d(cqf $$0, ht $$1) {
         return this.m;
      }

      public dgb a(dal $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dgb a(cyv $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dae l() {
         return this.b().b_(this.x());
      }

      public boolean e(cqf $$0, ht $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cqf $$0, ht $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean g(cqf $$0, ht $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cqf $$0, ht $$1, hx $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(cqz $$0, ht $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cqf $$0, ht $$1) {
         return this.n;
      }

      public float a(ccx $$0, cqf $$1, ht $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cqf $$0, ht $$1, hx $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ebj o() {
         return this.l;
      }

      public boolean i(cqf $$0, ht $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dgb $$2 = this.x();
            return $$2.p() ? cua.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dgb $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public eiy j(cqf $$0, ht $$1) {
         return this.a($$0, $$1, eik.a());
      }

      public eiy a(cqf $$0, ht $$1, eik $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public eiy k(cqf $$0, ht $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, eik.a());
      }

      public eiy b(cqf $$0, ht $$1, eik $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public eiy l(cqf $$0, ht $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public eiy c(cqf $$0, ht $$1, eik $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eiy m(cqf $$0, ht $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cqf $$0, ht $$1, bjt $$2) {
         return this.a($$0, $$1, $$2, hx.b);
      }

      public final boolean a(cqf $$0, ht $$1, bjt $$2, hx $$3) {
         return cua.a(this.b($$0, $$1, eik.a($$2)), $$3);
      }

      public eif n(cqf $$0, ht $$1) {
         return this.v.<eif>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(eif.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(cqz $$0, ht $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(cqz $$0, ht $$1, cua $$2, ht $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(cra $$0, ht $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(cra $$0, ht $$1, int $$2, int $$3) {
         ht.a $$4 = new ht.a();

         for (hx $$5 : dga.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(cra $$0, ht $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(cra $$0, ht $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cqz $$0, ht $$1, dgb $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(cqz $$0, ht $$1, dgb $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(alq $$0, ht $$1, ate $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(alq $$0, ht $$1, ate $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(cqz $$0, ht $$1, bjt $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(alq $$0, ht $$1, ckj $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<ckj> a(edo.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bib a(cqz $$0, ccx $$1, bia $$2, eib $$3) {
         return this.b().a(this.x(), $$0, $$3.a(), $$1, $$2, $$3);
      }

      public void a(cqz $$0, ht $$1, ccx $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cqf $$0, ht $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cqf $$0, ht $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dgb a(hx $$0, dgb $$1, cra $$2, ht $$3, ht $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(cqf $$0, ht $$1, ebu $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cmr $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(ebd $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(crc $$0, ht $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cqf $$0, ht $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bie b(cqz $$0, ht $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(arh<cua> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(arh<cua> $$0, Predicate<dga.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ig<cua> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(ib<cua> $$0) {
         return this.a($$0.a());
      }

      public Stream<arh<cua>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof cwq;
      }

      @Nullable
      public <T extends ddx> ddy<T> a(cqz $$0, ddz<T> $$1) {
         return this.b() instanceof cwq ? ((cwq)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(cua $$0) {
         return this.b() == $$0;
      }

      public boolean a(afv<cua> $$0) {
         return this.b().r().a($$0);
      }

      public ebe u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(ht $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dbl w() {
         return this.b().m(this.x());
      }

      public void a(cqz $$0, dgb $$1, eib $$2, cdp $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cqf $$0, ht $$1, hx $$2) {
         return this.a($$0, $$1, $$2, dbz.a);
      }

      public boolean a(cqf $$0, ht $$1, hx $$2, dbz $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cqf $$0, ht $$1) {
         return this.a != null ? this.a.d : this.b().a_(this.x(), $$0, $$1);
      }

      protected abstract dgb x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dhc A() {
         return this.x;
      }

      static final class a {
         private static final hx[] e = hx.values();
         private static final int f = dbz.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final eiy[] i;
         protected final eiy b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dgb $$0) {
            cua $$1 = $$0.b();
            this.a = $$0.i(cqo.a, ht.b);
            this.g = $$1.c($$0, cqo.a, ht.b);
            this.h = $$1.g($$0, cqo.a, ht.b);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new eiy[e.length];
               eiy $$2 = $$1.f($$0, cqo.a, ht.b);

               for (hx $$3 : e) {
                  this.i[$$3.ordinal()] = eiv.a($$2, $$3);
               }
            }

            this.b = $$1.c($$0, cqo.a, ht.b, eik.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", jy.f.b($$1))
               );
            } else {
               this.c = Arrays.stream(hx.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (hx $$4 : e) {
                  for (dbz $$5 : dbz.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cqo.a, ht.b, $$4);
                  }
               }

               this.d = cua.a($$0.k(cqo.a, ht.b));
            }
         }

         public boolean a(hx $$0, dbz $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(hx $$0, dbz $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      eif evaluate(dgb var1, cqf var2, ht var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dga.d> a = Codec.unit(() -> a());
      Function<dgb, ebi> b = $$0 -> ebi.a;
      boolean c = true;
      dbl d = dbl.f;
      ToIntFunction<dgb> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      afw m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      ebj t = ebj.a;
      boolean u = true;
      dhc v = dhc.a;
      boolean w;
      dga.e<bjx<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, hx.b) && $$0.h() < 14;
      dga.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dga.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dga.f A = this.z;
      dga.f B = ($$0, $$1, $$2) -> false;
      dga.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cfg E = cfi.f;
      Optional<dga.b> F = Optional.empty();

      private d() {
      }

      public static dga.d a() {
         return new dga.d();
      }

      public static dga.d a(dga $$0) {
         dga.d $$1 = new dga.d();
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

      public dga.d a(cix $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dga.d a(ebi $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dga.d a(Function<dgb, ebi> $$0) {
         this.b = $$0;
         return this;
      }

      public dga.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dga.d c() {
         this.n = false;
         return this;
      }

      public dga.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dga.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dga.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dga.d a(dbl $$0) {
         this.d = $$0;
         return this;
      }

      public dga.d a(ToIntFunction<dgb> $$0) {
         this.e = $$0;
         return this;
      }

      public dga.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dga.d d() {
         return this.d(0.0F);
      }

      public dga.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dga.d e() {
         this.i = true;
         return this;
      }

      public dga.d f() {
         this.D = true;
         return this;
      }

      public dga.d g() {
         this.m = edg.a;
         return this;
      }

      public dga.d a(cua $$0) {
         this.m = $$0.u();
         return this;
      }

      public dga.d h() {
         this.p = true;
         return this;
      }

      public dga.d i() {
         this.q = true;
         return this;
      }

      public dga.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dga.d k() {
         this.r = true;
         return this;
      }

      public dga.d a(ebj $$0) {
         this.t = $$0;
         return this;
      }

      public dga.d l() {
         this.o = true;
         return this;
      }

      public dga.d a(dga.e<bjx<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dga.d a(dga.f $$0) {
         this.y = $$0;
         return this;
      }

      public dga.d b(dga.f $$0) {
         this.z = $$0;
         return this;
      }

      public dga.d c(dga.f $$0) {
         this.A = $$0;
         return this;
      }

      public dga.d d(dga.f $$0) {
         this.B = $$0;
         return this;
      }

      public dga.d e(dga.f $$0) {
         this.C = $$0;
         return this;
      }

      public dga.d m() {
         this.h = true;
         return this;
      }

      public dga.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dga.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dga.d a(dga.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cua $$3 = $$0x.b();
                  long $$4 = asy.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.au_();
                  float $$6 = $$3.as_();
                  double $$7 = asy.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = asy.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new eif($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cua $$3 = $$0x.b();
                  long $$4 = asy.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.as_();
                  double $$6 = asy.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = asy.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new eif($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dga.d n() {
         this.u = false;
         return this;
      }

      public dga.d a(cfe... $$0) {
         this.E = cfi.d.a($$0);
         return this;
      }

      public dga.d a(dhc $$0) {
         this.v = $$0;
         return this;
      }

      public dga.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dgb var1, cqf var2, ht var3, A var4);
   }

   public interface f {
      boolean test(dgb var1, cqf var2, ht var3);
   }
}
