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

public abstract class djg implements chp {
   protected static final ic[] aF = new ic[]{ic.e, ic.f, ic.c, ic.d, ic.a, ic.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dec aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final chs aO;
   protected final djg.d aP;
   @Nullable
   protected ahg aQ;

   public djg(djg.d $$0) {
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

   public djg.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends cwq> a();

   protected static <B extends cwq> RecordCodecBuilder<B, djg.d> u() {
      return djg.d.a.fieldOf("properties").forGetter(djg::t);
   }

   public static <B extends cwq> MapCodec<B> b(Function<djg.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   @Deprecated
   public void a(djh $$0, ctq $$1, hx $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(asm.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   @Deprecated
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(djh $$0, djh $$1, ic $$2) {
      return false;
   }

   @Deprecated
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      adi.a($$1, $$2);
   }

   @Deprecated
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
   }

   @Deprecated
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   @Deprecated
   public void a(djh $$0, ctp $$1, hx $$2, cth $$3, BiConsumer<cmy, hx> $$4) {
      if (!$$0.i() && $$3.j() != cth.a.d) {
         cwq $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cfi;
         if ($$5.a($$3) && $$1 instanceof and $$7) {
            dgv $$8 = $$0.t() ? $$1.c_($$2) : null;
            ehc.a $$9 = new ehc.a($$7).a(ejh.f, elt.b($$2)).a(ejh.i, cmy.f).b(ejh.h, $$8).b(ejh.a, $$3.g());
            if ($$3.j() == cth.a.c) {
               $$9.a(ejh.j, $$3.a());
            }

            $$0.a($$7, $$2, cmy.f, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, cws.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   @Deprecated
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      return bkb.d;
   }

   @Deprecated
   public boolean a(djh $$0, ctp $$1, hx $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Deprecated
   public boolean g_(djh $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(djh $$0) {
      return false;
   }

   @Deprecated
   public eer c_(djh $$0) {
      return ees.a.g();
   }

   @Deprecated
   public boolean d_(djh $$0) {
      return false;
   }

   public float at_() {
      return 0.25F;
   }

   public float av_() {
      return 0.2F;
   }

   @Override
   public chs m() {
      return this.aO;
   }

   @Deprecated
   public djh a(djh $$0, ddc $$1) {
      return $$0;
   }

   @Deprecated
   public djh a(djh $$0, dbm $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(djh $$0, cph $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.k()));
   }

   @Deprecated
   public boolean a(djh $$0, eeq $$1) {
      return $$0.r() || !$$0.e();
   }

   @Deprecated
   public List<cmy> a(djh $$0, ehc.a $$1) {
      ahg $$2 = this.v();
      if ($$2 == egu.a) {
         return Collections.emptyList();
      } else {
         ehc $$3 = $$1.a(ejh.g, $$0).a(ejg.o);
         and $$4 = $$3.a();
         ehe $$5 = $$4.o().aJ().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(djh $$0, hx $$1) {
      return auo.a($$1);
   }

   @Deprecated
   public emm f(djh $$0, csv $$1, hx $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public emm b_(djh $$0, csv $$1, hx $$2) {
      return this.b($$0, $$1, $$2, ely.a());
   }

   @Deprecated
   public emm a(djh $$0, csv $$1, hx $$2) {
      return emj.a();
   }

   @Deprecated
   public int g(djh $$0, csv $$1, hx $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.O();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bke b(djh $$0, ctp $$1, hx $$2) {
      return null;
   }

   @Deprecated
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return true;
   }

   @Deprecated
   public float d(djh $$0, csv $$1, hx $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(djh $$0, ctp $$1, hx $$2) {
      return 0;
   }

   @Deprecated
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return emj.b();
   }

   @Deprecated
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      return this.aG ? $$0.j($$1, $$2) : emj.a();
   }

   @Deprecated
   public boolean c(djh $$0, csv $$1, hx $$2) {
      return cwq.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(djh $$0, csv $$1, hx $$2) {
      return cwq.a($$0.c($$1, $$2));
   }

   @Deprecated
   public emm c(djh $$0, csv $$1, hx $$2, ely $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
   }

   @Deprecated
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
   }

   @Deprecated
   public float a(djh $$0, cfi $$1, csv $$2, hx $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(djh $$0, and $$1, hx $$2, cmy $$3, boolean $$4) {
   }

   @Deprecated
   public void a(djh $$0, ctp $$1, hx $$2, cfi $$3) {
   }

   @Deprecated
   public int a(djh $$0, csv $$1, hx $$2, ic $$3) {
      return 0;
   }

   @Deprecated
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
   }

   @Deprecated
   public int b(djh $$0, csv $$1, hx $$2, ic $$3) {
      return 0;
   }

   public final ahg v() {
      if (this.aQ == null) {
         ahg $$0 = kd.e.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   @Deprecated
   public void a(ctp $$0, djh $$1, elp $$2, cga $$3) {
   }

   public abstract cmt k();

   protected abstract cwq q();

   public eev w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends djj<cwq, djh> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eew l;
      private final eev m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final djg.f q;
      private final djg.f r;
      private final djg.f s;
      private final djg.f t;
      private final djg.f u;
      private final Optional<djg.b> v;
      private final boolean w;
      private final dki x;
      private final boolean y;
      @Nullable
      protected djg.a.a a;
      private eer z = ees.a.g();
      private boolean A;

      protected a(cwq $$0, ImmutableMap<dkk<?>, Comparable<?>> $$1, MapCodec<djh> $$2) {
         super($$0, $$1, $$2);
         djg.d $$3 = $$0.aP;
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
            emm $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               elo $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().p()) {
            this.a = new djg.a.a(this.x());
         }

         this.k = this.D();
      }

      public cwq b() {
         return this.e;
      }

      public ih<cwq> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         cwq $$0 = this.b();
         return $$0 != cws.bs && $$0 != cws.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(csv $$0, hx $$1, blz<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(csv $$0, hx $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(csv $$0, hx $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public emm a(csv $$0, hx $$1, ic $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : emj.a(this.c($$0, $$1), $$2);
      }

      public emm c(csv $$0, hx $$1) {
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

      public eev d(csv $$0, hx $$1) {
         return this.m;
      }

      public djh a(ddc $$0) {
         return this.b().a(this.x(), $$0);
      }

      public djh a(dbm $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dcv l() {
         return this.b().b_(this.x());
      }

      public boolean e(csv $$0, hx $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(csv $$0, hx $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(csv $$0, hx $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(csv $$0, hx $$1, ic $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(ctp $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(csv $$0, hx $$1) {
         return this.n;
      }

      public float a(cfi $$0, csv $$1, hx $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(csv $$0, hx $$1, ic $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eew o() {
         return this.l;
      }

      public boolean i(csv $$0, hx $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            djh $$2 = this.x();
            return $$2.p() ? cwq.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(djh $$0, ic $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public emm j(csv $$0, hx $$1) {
         return this.a($$0, $$1, ely.a());
      }

      public emm a(csv $$0, hx $$1, ely $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public emm k(csv $$0, hx $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, ely.a());
      }

      public emm b(csv $$0, hx $$1, ely $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public emm l(csv $$0, hx $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public emm c(csv $$0, hx $$1, ely $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public emm m(csv $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(csv $$0, hx $$1, blv $$2) {
         return this.a($$0, $$1, $$2, ic.b);
      }

      public final boolean a(csv $$0, hx $$1, blv $$2, ic $$3) {
         return cwq.a(this.b($$0, $$1, ely.a($$2)), $$3);
      }

      public elt n(csv $$0, hx $$1) {
         return this.v.<elt>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(elt.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(ctp $$0, hx $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(ctp $$0, hx $$1, cwq $$2, hx $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(ctq $$0, hx $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(ctq $$0, hx $$1, int $$2, int $$3) {
         hx.a $$4 = new hx.a();

         for (ic $$5 : djg.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(ctq $$0, hx $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(ctq $$0, hx $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(ctp $$0, hx $$1, djh $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(ctp $$0, hx $$1, djh $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(ctp $$0, hx $$1, cth $$2, BiConsumer<cmy, hx> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(and $$0, hx $$1, auv $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(and $$0, hx $$1, auv $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(ctp $$0, hx $$1, blv $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(and $$0, hx $$1, cmy $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cmy> a(ehc.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bkb a(ctp $$0, cfi $$1, bka $$2, elp $$3) {
         return this.b().a(this.x(), $$0, $$3.a(), $$1, $$2, $$3);
      }

      public void a(ctp $$0, hx $$1, cfi $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(csv $$0, hx $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(csv $$0, hx $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public djh a(ic $$0, djh $$1, ctq $$2, hx $$3, hx $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(csv $$0, hx $$1, efh $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cph $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(eeq $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(cts $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(csv $$0, hx $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bke b(ctp $$0, hx $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(asw<cwq> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(asw<cwq> $$0, Predicate<djg.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(il<cwq> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(ih<cwq> $$0) {
         return this.a($$0.a());
      }

      public Stream<asw<cwq>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof czi;
      }

      @Nullable
      public <T extends dgv> dgw<T> a(ctp $$0, dgx<T> $$1) {
         return this.b() instanceof czi ? ((czi)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(cwq $$0) {
         return this.b() == $$0;
      }

      public boolean a(ahf<cwq> $$0) {
         return this.b().r().a($$0);
      }

      public eer u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(hx $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dec w() {
         return this.b().m(this.x());
      }

      public void a(ctp $$0, djh $$1, elp $$2, cga $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(csv $$0, hx $$1, ic $$2) {
         return this.a($$0, $$1, $$2, deq.a);
      }

      public boolean a(csv $$0, hx $$1, ic $$2, deq $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(csv $$0, hx $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract djh x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dki A() {
         return this.x;
      }

      static final class a {
         private static final ic[] e = ic.values();
         private static final int f = deq.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final emm[] i;
         protected final emm b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(djh $$0) {
            cwq $$1 = $$0.b();
            this.a = $$0.i(cte.a, hx.b);
            this.g = $$1.a_($$0, cte.a, hx.b);
            this.h = $$1.g($$0, cte.a, hx.b);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new emm[e.length];
               emm $$2 = $$1.f($$0, cte.a, hx.b);

               for (ic $$3 : e) {
                  this.i[$$3.ordinal()] = emj.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, cte.a, hx.b, ely.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", kd.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(ic.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ic $$4 : e) {
                  for (deq $$5 : deq.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cte.a, hx.b, $$4);
                  }
               }

               this.d = cwq.a($$0.k(cte.a, hx.b));
            }
         }

         public boolean a(ic $$0, deq $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ic $$0, deq $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      elt evaluate(djh var1, csv var2, hx var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<djg.d> a = Codec.unit(() -> a());
      Function<djh, eev> b = $$0 -> eev.a;
      boolean c = true;
      dec d = dec.f;
      ToIntFunction<djh> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      ahg m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      eew t = eew.a;
      boolean u = true;
      dki v = dki.a;
      boolean w;
      djg.e<blz<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ic.b) && $$0.h() < 14;
      djg.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      djg.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      djg.f A = this.z;
      djg.f B = ($$0, $$1, $$2) -> false;
      djg.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      chs E = chu.g;
      Optional<djg.b> F = Optional.empty();

      private d() {
      }

      public static djg.d a() {
         return new djg.d();
      }

      public static djg.d a(djg $$0) {
         djg.d $$1 = b($$0);
         djg.d $$2 = $$0.aP;
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
      public static djg.d b(djg $$0) {
         djg.d $$1 = new djg.d();
         djg.d $$2 = $$0.aP;
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

      public djg.d a(clm $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public djg.d a(eev $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public djg.d a(Function<djh, eev> $$0) {
         this.b = $$0;
         return this;
      }

      public djg.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public djg.d c() {
         this.n = false;
         return this;
      }

      public djg.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public djg.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public djg.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public djg.d a(dec $$0) {
         this.d = $$0;
         return this;
      }

      public djg.d a(ToIntFunction<djh> $$0) {
         this.e = $$0;
         return this;
      }

      public djg.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public djg.d d() {
         return this.d(0.0F);
      }

      public djg.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public djg.d e() {
         this.i = true;
         return this;
      }

      public djg.d f() {
         this.D = true;
         return this;
      }

      public djg.d g() {
         this.m = egu.a;
         return this;
      }

      public djg.d a(cwq $$0) {
         this.m = $$0.v();
         return this;
      }

      public djg.d h() {
         this.p = true;
         return this;
      }

      public djg.d i() {
         this.q = true;
         return this;
      }

      public djg.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public djg.d k() {
         this.r = true;
         return this;
      }

      public djg.d a(eew $$0) {
         this.t = $$0;
         return this;
      }

      public djg.d l() {
         this.o = true;
         return this;
      }

      public djg.d a(djg.e<blz<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public djg.d a(djg.f $$0) {
         this.y = $$0;
         return this;
      }

      public djg.d b(djg.f $$0) {
         this.z = $$0;
         return this;
      }

      public djg.d c(djg.f $$0) {
         this.A = $$0;
         return this;
      }

      public djg.d d(djg.f $$0) {
         this.B = $$0;
         return this;
      }

      public djg.d e(djg.f $$0) {
         this.C = $$0;
         return this;
      }

      public djg.d m() {
         this.h = true;
         return this;
      }

      public djg.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public djg.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public djg.d a(djg.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cwq $$3 = $$0x.b();
                  long $$4 = auo.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.av_();
                  float $$6 = $$3.at_();
                  double $$7 = auo.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = auo.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new elt($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cwq $$3 = $$0x.b();
                  long $$4 = auo.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.at_();
                  double $$6 = auo.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = auo.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new elt($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public djg.d n() {
         this.u = false;
         return this;
      }

      public djg.d a(chq... $$0) {
         this.E = chu.e.a($$0);
         return this;
      }

      public djg.d a(dki $$0) {
         this.v = $$0;
         return this;
      }

      public djg.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(djh var1, csv var2, hx var3, A var4);
   }

   public interface f {
      boolean test(djh var1, csv var2, hx var3);
   }
}
