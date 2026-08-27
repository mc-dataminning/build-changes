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

public abstract class dhh implements cga {
   protected static final hx[] aF = new hx[]{hx.e, hx.f, hx.c, hx.d, hx.a, hx.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dcm aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cgd aO;
   protected final dhh.d aP;
   @Nullable
   protected agi aQ;

   public dhh(dhh.d $$0) {
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

   public dhh.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends cva> a();

   protected static <B extends cva> RecordCodecBuilder<B, dhh.d> u() {
      return dhh.d.a.fieldOf("properties").forGetter(dhh::t);
   }

   public static <B extends cva> MapCodec<B> b(Function<dhh.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   @Deprecated
   public void a(dhi $$0, csb $$1, ht $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(arl.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   @Deprecated
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(dhi $$0, dhi $$1, hx $$2) {
      return false;
   }

   @Deprecated
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      ack.a($$1, $$2);
   }

   @Deprecated
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.n($$2);
      }
   }

   @Deprecated
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      return bix.d;
   }

   @Deprecated
   public boolean a(dhi $$0, csa $$1, ht $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Deprecated
   public boolean g_(dhi $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(dhi $$0) {
      return false;
   }

   @Deprecated
   public ecs c_(dhi $$0) {
      return ect.a.g();
   }

   @Deprecated
   public boolean d_(dhi $$0) {
      return false;
   }

   public float as_() {
      return 0.25F;
   }

   public float au_() {
      return 0.2F;
   }

   @Override
   public cgd m() {
      return this.aO;
   }

   @Deprecated
   public dhi a(dhi $$0, dbm $$1) {
      return $$0;
   }

   @Deprecated
   public dhi a(dhi $$0, czw $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(dhi $$0, cnr $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.k()));
   }

   @Deprecated
   public boolean a(dhi $$0, ecr $$1) {
      return $$0.r() || !$$0.e();
   }

   @Deprecated
   public List<clj> a(dhi $$0, efd.a $$1) {
      agi $$2 = this.v();
      if ($$2 == eev.a) {
         return Collections.emptyList();
      } else {
         efd $$3 = $$1.a(ehi.g, $$0).a(ehh.o);
         ame $$4 = $$3.a();
         eff $$5 = $$4.n().aJ().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(dhi $$0, ht $$1) {
      return atm.a($$1);
   }

   @Deprecated
   public ekn f(dhi $$0, crg $$1, ht $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public ekn b_(dhi $$0, crg $$1, ht $$2) {
      return this.b($$0, $$1, $$2, ejz.a());
   }

   @Deprecated
   public ekn a(dhi $$0, crg $$1, ht $$2) {
      return ekk.a();
   }

   @Deprecated
   public int g(dhi $$0, crg $$1, ht $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.N();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bja b(dhi $$0, csa $$1, ht $$2) {
      return null;
   }

   @Deprecated
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return true;
   }

   @Deprecated
   public float d(dhi $$0, crg $$1, ht $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(dhi $$0, csa $$1, ht $$2) {
      return 0;
   }

   @Deprecated
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return ekk.b();
   }

   @Deprecated
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return this.aG ? $$0.j($$1, $$2) : ekk.a();
   }

   @Deprecated
   public boolean c(dhi $$0, crg $$1, ht $$2) {
      return cva.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(dhi $$0, crg $$1, ht $$2) {
      return cva.a($$0.c($$1, $$2));
   }

   @Deprecated
   public ekn c(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
   }

   @Deprecated
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
   }

   @Deprecated
   public float a(dhi $$0, cdu $$1, crg $$2, ht $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(dhi $$0, ame $$1, ht $$2, clj $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dhi $$0, csa $$1, ht $$2, cdu $$3) {
   }

   @Deprecated
   public int a(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return 0;
   }

   @Deprecated
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
   }

   @Deprecated
   public int b(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return 0;
   }

   public final agi v() {
      if (this.aQ == null) {
         agi $$0 = jy.f.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   @Deprecated
   public void a(csa $$0, dhi $$1, ejq $$2, cem $$3) {
   }

   public abstract cle k();

   protected abstract cva q();

   public ecw w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dhk<cva, dhi> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final ecx l;
      private final ecw m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dhh.f q;
      private final dhh.f r;
      private final dhh.f s;
      private final dhh.f t;
      private final dhh.f u;
      private final Optional<dhh.b> v;
      private final boolean w;
      private final dij x;
      private final boolean y;
      @Nullable
      protected dhh.a.a a;
      private ecs z = ect.a.g();
      private boolean A;

      protected a(cva $$0, ImmutableMap<dil<?>, Comparable<?>> $$1, MapCodec<dhi> $$2) {
         super($$0, $$1, $$2);
         dhh.d $$3 = $$0.aP;
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
            ekn $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               ejp $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().p()) {
            this.a = new dhh.a.a(this.x());
         }

         this.k = this.D();
      }

      public cva b() {
         return this.e;
      }

      public ib<cva> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         cva $$0 = this.b();
         return $$0 != cvc.bs && $$0 != cvc.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(crg $$0, ht $$1, bku<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(crg $$0, ht $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(crg $$0, ht $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public ekn a(crg $$0, ht $$1, hx $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ekk.a(this.c($$0, $$1), $$2);
      }

      public ekn c(crg $$0, ht $$1) {
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

      public ecw d(crg $$0, ht $$1) {
         return this.m;
      }

      public dhi a(dbm $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dhi a(czw $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dbf l() {
         return this.b().b_(this.x());
      }

      public boolean e(crg $$0, ht $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(crg $$0, ht $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(crg $$0, ht $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(crg $$0, ht $$1, hx $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(csa $$0, ht $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(crg $$0, ht $$1) {
         return this.n;
      }

      public float a(cdu $$0, crg $$1, ht $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(crg $$0, ht $$1, hx $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ecx o() {
         return this.l;
      }

      public boolean i(crg $$0, ht $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dhi $$2 = this.x();
            return $$2.p() ? cva.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dhi $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public ekn j(crg $$0, ht $$1) {
         return this.a($$0, $$1, ejz.a());
      }

      public ekn a(crg $$0, ht $$1, ejz $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public ekn k(crg $$0, ht $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, ejz.a());
      }

      public ekn b(crg $$0, ht $$1, ejz $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ekn l(crg $$0, ht $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public ekn c(crg $$0, ht $$1, ejz $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public ekn m(crg $$0, ht $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(crg $$0, ht $$1, bkq $$2) {
         return this.a($$0, $$1, $$2, hx.b);
      }

      public final boolean a(crg $$0, ht $$1, bkq $$2, hx $$3) {
         return cva.a(this.b($$0, $$1, ejz.a($$2)), $$3);
      }

      public eju n(crg $$0, ht $$1) {
         return this.v.<eju>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(eju.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(csa $$0, ht $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(csa $$0, ht $$1, cva $$2, ht $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(csb $$0, ht $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(csb $$0, ht $$1, int $$2, int $$3) {
         ht.a $$4 = new ht.a();

         for (hx $$5 : dhh.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(csb $$0, ht $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(csb $$0, ht $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(csa $$0, ht $$1, dhi $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(csa $$0, ht $$1, dhi $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(ame $$0, ht $$1, ats $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(ame $$0, ht $$1, ats $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(csa $$0, ht $$1, bkq $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(ame $$0, ht $$1, clj $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<clj> a(efd.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bix a(csa $$0, cdu $$1, biw $$2, ejq $$3) {
         return this.b().a(this.x(), $$0, $$3.a(), $$1, $$2, $$3);
      }

      public void a(csa $$0, ht $$1, cdu $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(crg $$0, ht $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(crg $$0, ht $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dhi a(hx $$0, dhi $$1, csb $$2, ht $$3, ht $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(crg $$0, ht $$1, edi $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cnr $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(ecr $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(csd $$0, ht $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(crg $$0, ht $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bja b(csa $$0, ht $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(arv<cva> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(arv<cva> $$0, Predicate<dhh.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ig<cva> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(ib<cva> $$0) {
         return this.a($$0.a());
      }

      public Stream<arv<cva>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof cxs;
      }

      @Nullable
      public <T extends dfd> dfe<T> a(csa $$0, dff<T> $$1) {
         return this.b() instanceof cxs ? ((cxs)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(cva $$0) {
         return this.b() == $$0;
      }

      public boolean a(agh<cva> $$0) {
         return this.b().r().a($$0);
      }

      public ecs u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(ht $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dcm w() {
         return this.b().m(this.x());
      }

      public void a(csa $$0, dhi $$1, ejq $$2, cem $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(crg $$0, ht $$1, hx $$2) {
         return this.a($$0, $$1, $$2, dda.a);
      }

      public boolean a(crg $$0, ht $$1, hx $$2, dda $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(crg $$0, ht $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dhi x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dij A() {
         return this.x;
      }

      static final class a {
         private static final hx[] e = hx.values();
         private static final int f = dda.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final ekn[] i;
         protected final ekn b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dhi $$0) {
            cva $$1 = $$0.b();
            this.a = $$0.i(crp.a, ht.b);
            this.g = $$1.a_($$0, crp.a, ht.b);
            this.h = $$1.g($$0, crp.a, ht.b);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new ekn[e.length];
               ekn $$2 = $$1.f($$0, crp.a, ht.b);

               for (hx $$3 : e) {
                  this.i[$$3.ordinal()] = ekk.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, crp.a, ht.b, ejz.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", jy.f.b($$1))
               );
            } else {
               this.c = Arrays.stream(hx.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (hx $$4 : e) {
                  for (dda $$5 : dda.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, crp.a, ht.b, $$4);
                  }
               }

               this.d = cva.a($$0.k(crp.a, ht.b));
            }
         }

         public boolean a(hx $$0, dda $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(hx $$0, dda $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      eju evaluate(dhi var1, crg var2, ht var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dhh.d> a = Codec.unit(() -> a());
      Function<dhi, ecw> b = $$0 -> ecw.a;
      boolean c = true;
      dcm d = dcm.f;
      ToIntFunction<dhi> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      agi m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      ecx t = ecx.a;
      boolean u = true;
      dij v = dij.a;
      boolean w;
      dhh.e<bku<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, hx.b) && $$0.h() < 14;
      dhh.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dhh.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dhh.f A = this.z;
      dhh.f B = ($$0, $$1, $$2) -> false;
      dhh.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cgd E = cgf.g;
      Optional<dhh.b> F = Optional.empty();

      private d() {
      }

      public static dhh.d a() {
         return new dhh.d();
      }

      public static dhh.d a(dhh $$0) {
         dhh.d $$1 = new dhh.d();
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

      public dhh.d a(cjx $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dhh.d a(ecw $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dhh.d a(Function<dhi, ecw> $$0) {
         this.b = $$0;
         return this;
      }

      public dhh.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dhh.d c() {
         this.n = false;
         return this;
      }

      public dhh.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dhh.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dhh.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dhh.d a(dcm $$0) {
         this.d = $$0;
         return this;
      }

      public dhh.d a(ToIntFunction<dhi> $$0) {
         this.e = $$0;
         return this;
      }

      public dhh.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dhh.d d() {
         return this.d(0.0F);
      }

      public dhh.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dhh.d e() {
         this.i = true;
         return this;
      }

      public dhh.d f() {
         this.D = true;
         return this;
      }

      public dhh.d g() {
         this.m = eev.a;
         return this;
      }

      public dhh.d a(cva $$0) {
         this.m = $$0.v();
         return this;
      }

      public dhh.d h() {
         this.p = true;
         return this;
      }

      public dhh.d i() {
         this.q = true;
         return this;
      }

      public dhh.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dhh.d k() {
         this.r = true;
         return this;
      }

      public dhh.d a(ecx $$0) {
         this.t = $$0;
         return this;
      }

      public dhh.d l() {
         this.o = true;
         return this;
      }

      public dhh.d a(dhh.e<bku<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dhh.d a(dhh.f $$0) {
         this.y = $$0;
         return this;
      }

      public dhh.d b(dhh.f $$0) {
         this.z = $$0;
         return this;
      }

      public dhh.d c(dhh.f $$0) {
         this.A = $$0;
         return this;
      }

      public dhh.d d(dhh.f $$0) {
         this.B = $$0;
         return this;
      }

      public dhh.d e(dhh.f $$0) {
         this.C = $$0;
         return this;
      }

      public dhh.d m() {
         this.h = true;
         return this;
      }

      public dhh.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dhh.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dhh.d a(dhh.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cva $$3 = $$0x.b();
                  long $$4 = atm.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.au_();
                  float $$6 = $$3.as_();
                  double $$7 = atm.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = atm.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new eju($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cva $$3 = $$0x.b();
                  long $$4 = atm.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.as_();
                  double $$6 = atm.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = atm.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new eju($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dhh.d n() {
         this.u = false;
         return this;
      }

      public dhh.d a(cgb... $$0) {
         this.E = cgf.e.a($$0);
         return this;
      }

      public dhh.d a(dij $$0) {
         this.v = $$0;
         return this;
      }

      public dhh.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dhi var1, crg var2, ht var3, A var4);
   }

   public interface f {
      boolean test(dhi var1, crg var2, ht var3);
   }
}
