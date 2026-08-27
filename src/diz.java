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

public abstract class diz implements chi {
   protected static final ic[] aF = new ic[]{ic.e, ic.f, ic.c, ic.d, ic.a, ic.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final ddv aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final chl aO;
   protected final diz.d aP;
   @Nullable
   protected ahd aQ;

   public diz(diz.d $$0) {
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

   public diz.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends cwj> a();

   protected static <B extends cwj> RecordCodecBuilder<B, diz.d> u() {
      return diz.d.a.fieldOf("properties").forGetter(diz::t);
   }

   public static <B extends cwj> MapCodec<B> b(Function<diz.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   @Deprecated
   public void a(dja $$0, ctj $$1, hx $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(asg.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   @Deprecated
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(dja $$0, dja $$1, ic $$2) {
      return false;
   }

   @Deprecated
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      adf.a($$1, $$2);
   }

   @Deprecated
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   @Deprecated
   public void a(dja $$0, cti $$1, hx $$2, cta $$3, BiConsumer<cmr, hx> $$4) {
      if (!$$0.i() && $$3.j() != cta.a.d) {
         cwj $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cfb;
         if ($$5.a($$3) && $$1 instanceof amz $$7) {
            dgo $$8 = $$0.t() ? $$1.c_($$2) : null;
            egv.a $$9 = new egv.a($$7).a(eja.f, elm.b($$2)).a(eja.i, cmr.f).b(eja.h, $$8).b(eja.a, $$3.g());
            if ($$3.j() == cta.a.c) {
               $$9.a(eja.j, $$3.a());
            }

            $$0.a($$7, $$2, cmr.f, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, cwl.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   @Deprecated
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      return bjv.d;
   }

   @Deprecated
   public boolean a(dja $$0, cti $$1, hx $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Deprecated
   public boolean g_(dja $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(dja $$0) {
      return false;
   }

   @Deprecated
   public eek c_(dja $$0) {
      return eel.a.g();
   }

   @Deprecated
   public boolean d_(dja $$0) {
      return false;
   }

   public float at_() {
      return 0.25F;
   }

   public float av_() {
      return 0.2F;
   }

   @Override
   public chl m() {
      return this.aO;
   }

   @Deprecated
   public dja a(dja $$0, dcv $$1) {
      return $$0;
   }

   @Deprecated
   public dja a(dja $$0, dbf $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(dja $$0, cpa $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.k()));
   }

   @Deprecated
   public boolean a(dja $$0, eej $$1) {
      return $$0.r() || !$$0.e();
   }

   @Deprecated
   public List<cmr> a(dja $$0, egv.a $$1) {
      ahd $$2 = this.v();
      if ($$2 == egn.a) {
         return Collections.emptyList();
      } else {
         egv $$3 = $$1.a(eja.g, $$0).a(eiz.o);
         amz $$4 = $$3.a();
         egx $$5 = $$4.o().aJ().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(dja $$0, hx $$1) {
      return aui.a($$1);
   }

   @Deprecated
   public emf f(dja $$0, cso $$1, hx $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public emf b_(dja $$0, cso $$1, hx $$2) {
      return this.b($$0, $$1, $$2, elr.a());
   }

   @Deprecated
   public emf a(dja $$0, cso $$1, hx $$2) {
      return emc.a();
   }

   @Deprecated
   public int g(dja $$0, cso $$1, hx $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.O();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bjy b(dja $$0, cti $$1, hx $$2) {
      return null;
   }

   @Deprecated
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return true;
   }

   @Deprecated
   public float d(dja $$0, cso $$1, hx $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(dja $$0, cti $$1, hx $$2) {
      return 0;
   }

   @Deprecated
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return emc.b();
   }

   @Deprecated
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      return this.aG ? $$0.j($$1, $$2) : emc.a();
   }

   @Deprecated
   public boolean c(dja $$0, cso $$1, hx $$2) {
      return cwj.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(dja $$0, cso $$1, hx $$2) {
      return cwj.a($$0.c($$1, $$2));
   }

   @Deprecated
   public emf c(dja $$0, cso $$1, hx $$2, elr $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
   }

   @Deprecated
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
   }

   @Deprecated
   public float a(dja $$0, cfb $$1, cso $$2, hx $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(dja $$0, amz $$1, hx $$2, cmr $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dja $$0, cti $$1, hx $$2, cfb $$3) {
   }

   @Deprecated
   public int a(dja $$0, cso $$1, hx $$2, ic $$3) {
      return 0;
   }

   @Deprecated
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
   }

   @Deprecated
   public int b(dja $$0, cso $$1, hx $$2, ic $$3) {
      return 0;
   }

   public final ahd v() {
      if (this.aQ == null) {
         ahd $$0 = kd.e.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   @Deprecated
   public void a(cti $$0, dja $$1, eli $$2, cft $$3) {
   }

   public abstract cmm k();

   protected abstract cwj q();

   public eeo w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends djc<cwj, dja> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eep l;
      private final eeo m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final diz.f q;
      private final diz.f r;
      private final diz.f s;
      private final diz.f t;
      private final diz.f u;
      private final Optional<diz.b> v;
      private final boolean w;
      private final dkb x;
      private final boolean y;
      @Nullable
      protected diz.a.a a;
      private eek z = eel.a.g();
      private boolean A;

      protected a(cwj $$0, ImmutableMap<dkd<?>, Comparable<?>> $$1, MapCodec<dja> $$2) {
         super($$0, $$1, $$2);
         diz.d $$3 = $$0.aP;
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
            emf $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               elh $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().p()) {
            this.a = new diz.a.a(this.x());
         }

         this.k = this.D();
      }

      public cwj b() {
         return this.e;
      }

      public ih<cwj> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         cwj $$0 = this.b();
         return $$0 != cwl.bs && $$0 != cwl.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cso $$0, hx $$1, blt<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cso $$0, hx $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(cso $$0, hx $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public emf a(cso $$0, hx $$1, ic $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : emc.a(this.c($$0, $$1), $$2);
      }

      public emf c(cso $$0, hx $$1) {
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

      public eeo d(cso $$0, hx $$1) {
         return this.m;
      }

      public dja a(dcv $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dja a(dbf $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dco l() {
         return this.b().b_(this.x());
      }

      public boolean e(cso $$0, hx $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cso $$0, hx $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(cso $$0, hx $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cso $$0, hx $$1, ic $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(cti $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cso $$0, hx $$1) {
         return this.n;
      }

      public float a(cfb $$0, cso $$1, hx $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cso $$0, hx $$1, ic $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eep o() {
         return this.l;
      }

      public boolean i(cso $$0, hx $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dja $$2 = this.x();
            return $$2.p() ? cwj.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dja $$0, ic $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public emf j(cso $$0, hx $$1) {
         return this.a($$0, $$1, elr.a());
      }

      public emf a(cso $$0, hx $$1, elr $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public emf k(cso $$0, hx $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, elr.a());
      }

      public emf b(cso $$0, hx $$1, elr $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public emf l(cso $$0, hx $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public emf c(cso $$0, hx $$1, elr $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public emf m(cso $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cso $$0, hx $$1, blp $$2) {
         return this.a($$0, $$1, $$2, ic.b);
      }

      public final boolean a(cso $$0, hx $$1, blp $$2, ic $$3) {
         return cwj.a(this.b($$0, $$1, elr.a($$2)), $$3);
      }

      public elm n(cso $$0, hx $$1) {
         return this.v.<elm>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(elm.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(cti $$0, hx $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(cti $$0, hx $$1, cwj $$2, hx $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(ctj $$0, hx $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(ctj $$0, hx $$1, int $$2, int $$3) {
         hx.a $$4 = new hx.a();

         for (ic $$5 : diz.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(ctj $$0, hx $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(ctj $$0, hx $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cti $$0, hx $$1, dja $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(cti $$0, hx $$1, dja $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cti $$0, hx $$1, cta $$2, BiConsumer<cmr, hx> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(amz $$0, hx $$1, aup $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(amz $$0, hx $$1, aup $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(cti $$0, hx $$1, blp $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(amz $$0, hx $$1, cmr $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cmr> a(egv.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bjv a(cti $$0, cfb $$1, bju $$2, eli $$3) {
         return this.b().a(this.x(), $$0, $$3.a(), $$1, $$2, $$3);
      }

      public void a(cti $$0, hx $$1, cfb $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cso $$0, hx $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cso $$0, hx $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dja a(ic $$0, dja $$1, ctj $$2, hx $$3, hx $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(cso $$0, hx $$1, efa $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cpa $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(eej $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(ctl $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cso $$0, hx $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bjy b(cti $$0, hx $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(asq<cwj> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(asq<cwj> $$0, Predicate<diz.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(il<cwj> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(ih<cwj> $$0) {
         return this.a($$0.a());
      }

      public Stream<asq<cwj>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof czb;
      }

      @Nullable
      public <T extends dgo> dgp<T> a(cti $$0, dgq<T> $$1) {
         return this.b() instanceof czb ? ((czb)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(cwj $$0) {
         return this.b() == $$0;
      }

      public boolean a(ahc<cwj> $$0) {
         return this.b().r().a($$0);
      }

      public eek u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(hx $$0) {
         return this.b().a(this.x(), $$0);
      }

      public ddv w() {
         return this.b().m(this.x());
      }

      public void a(cti $$0, dja $$1, eli $$2, cft $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cso $$0, hx $$1, ic $$2) {
         return this.a($$0, $$1, $$2, dej.a);
      }

      public boolean a(cso $$0, hx $$1, ic $$2, dej $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cso $$0, hx $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dja x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dkb A() {
         return this.x;
      }

      static final class a {
         private static final ic[] e = ic.values();
         private static final int f = dej.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final emf[] i;
         protected final emf b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dja $$0) {
            cwj $$1 = $$0.b();
            this.a = $$0.i(csx.a, hx.b);
            this.g = $$1.a_($$0, csx.a, hx.b);
            this.h = $$1.g($$0, csx.a, hx.b);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new emf[e.length];
               emf $$2 = $$1.f($$0, csx.a, hx.b);

               for (ic $$3 : e) {
                  this.i[$$3.ordinal()] = emc.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, csx.a, hx.b, elr.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", kd.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(ic.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ic $$4 : e) {
                  for (dej $$5 : dej.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, csx.a, hx.b, $$4);
                  }
               }

               this.d = cwj.a($$0.k(csx.a, hx.b));
            }
         }

         public boolean a(ic $$0, dej $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ic $$0, dej $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      elm evaluate(dja var1, cso var2, hx var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<diz.d> a = Codec.unit(() -> a());
      Function<dja, eeo> b = $$0 -> eeo.a;
      boolean c = true;
      ddv d = ddv.f;
      ToIntFunction<dja> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      ahd m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      eep t = eep.a;
      boolean u = true;
      dkb v = dkb.a;
      boolean w;
      diz.e<blt<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ic.b) && $$0.h() < 14;
      diz.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      diz.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      diz.f A = this.z;
      diz.f B = ($$0, $$1, $$2) -> false;
      diz.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      chl E = chn.g;
      Optional<diz.b> F = Optional.empty();

      private d() {
      }

      public static diz.d a() {
         return new diz.d();
      }

      public static diz.d a(diz $$0) {
         diz.d $$1 = b($$0);
         diz.d $$2 = $$0.aP;
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
      public static diz.d b(diz $$0) {
         diz.d $$1 = new diz.d();
         diz.d $$2 = $$0.aP;
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

      public diz.d a(clf $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public diz.d a(eeo $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public diz.d a(Function<dja, eeo> $$0) {
         this.b = $$0;
         return this;
      }

      public diz.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public diz.d c() {
         this.n = false;
         return this;
      }

      public diz.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public diz.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public diz.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public diz.d a(ddv $$0) {
         this.d = $$0;
         return this;
      }

      public diz.d a(ToIntFunction<dja> $$0) {
         this.e = $$0;
         return this;
      }

      public diz.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public diz.d d() {
         return this.d(0.0F);
      }

      public diz.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public diz.d e() {
         this.i = true;
         return this;
      }

      public diz.d f() {
         this.D = true;
         return this;
      }

      public diz.d g() {
         this.m = egn.a;
         return this;
      }

      public diz.d a(cwj $$0) {
         this.m = $$0.v();
         return this;
      }

      public diz.d h() {
         this.p = true;
         return this;
      }

      public diz.d i() {
         this.q = true;
         return this;
      }

      public diz.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public diz.d k() {
         this.r = true;
         return this;
      }

      public diz.d a(eep $$0) {
         this.t = $$0;
         return this;
      }

      public diz.d l() {
         this.o = true;
         return this;
      }

      public diz.d a(diz.e<blt<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public diz.d a(diz.f $$0) {
         this.y = $$0;
         return this;
      }

      public diz.d b(diz.f $$0) {
         this.z = $$0;
         return this;
      }

      public diz.d c(diz.f $$0) {
         this.A = $$0;
         return this;
      }

      public diz.d d(diz.f $$0) {
         this.B = $$0;
         return this;
      }

      public diz.d e(diz.f $$0) {
         this.C = $$0;
         return this;
      }

      public diz.d m() {
         this.h = true;
         return this;
      }

      public diz.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public diz.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public diz.d a(diz.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cwj $$3 = $$0x.b();
                  long $$4 = aui.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.av_();
                  float $$6 = $$3.at_();
                  double $$7 = aui.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = aui.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new elm($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cwj $$3 = $$0x.b();
                  long $$4 = aui.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.at_();
                  double $$6 = aui.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = aui.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new elm($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public diz.d n() {
         this.u = false;
         return this;
      }

      public diz.d a(chj... $$0) {
         this.E = chn.e.a($$0);
         return this;
      }

      public diz.d a(dkb $$0) {
         this.v = $$0;
         return this;
      }

      public diz.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dja var1, cso var2, hx var3, A var4);
   }

   public interface f {
      boolean test(dja var1, cso var2, hx var3);
   }
}
