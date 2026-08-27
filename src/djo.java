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

public abstract class djo implements chx {
   protected static final ic[] aF = new ic[]{ic.e, ic.f, ic.c, ic.d, ic.a, ic.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dek aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cia aO;
   protected final djo.d aP;
   @Nullable
   protected ahh aQ;

   public djo(djo.d $$0) {
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

   public djo.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends cwy> a();

   protected static <B extends cwy> RecordCodecBuilder<B, djo.d> u() {
      return djo.d.a.fieldOf("properties").forGetter(djo::t);
   }

   public static <B extends cwy> MapCodec<B> b(Function<djo.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   @Deprecated
   public void a(djp $$0, cty $$1, hx $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(asn.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   @Deprecated
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(djp $$0, djp $$1, ic $$2) {
      return false;
   }

   @Deprecated
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      adj.a($$1, $$2);
   }

   @Deprecated
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
   }

   @Deprecated
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   @Deprecated
   public void a(djp $$0, ctx $$1, hx $$2, ctp $$3, BiConsumer<cng, hx> $$4) {
      if (!$$0.i() && $$3.j() != ctp.a.d) {
         cwy $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cfq;
         if ($$5.a($$3) && $$1 instanceof ane $$7) {
            dhd $$8 = $$0.t() ? $$1.c_($$2) : null;
            ehl.a $$9 = new ehl.a($$7).a(ejq.f, emc.b($$2)).a(ejq.i, cng.f).b(ejq.h, $$8).b(ejq.a, $$3.g());
            if ($$3.j() == ctp.a.c) {
               $$9.a(ejq.j, $$3.a());
            }

            $$0.a($$7, $$2, cng.f, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, cxa.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   @Deprecated
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      return bkc.d;
   }

   @Deprecated
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      return bke.d;
   }

   @Deprecated
   public boolean a(djp $$0, ctx $$1, hx $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Deprecated
   public boolean g_(djp $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(djp $$0) {
      return false;
   }

   @Deprecated
   public eez c_(djp $$0) {
      return efa.a.g();
   }

   @Deprecated
   public boolean d_(djp $$0) {
      return false;
   }

   public float aw_() {
      return 0.25F;
   }

   public float ay_() {
      return 0.2F;
   }

   @Override
   public cia m() {
      return this.aO;
   }

   @Deprecated
   public djp a(djp $$0, ddk $$1) {
      return $$0;
   }

   @Deprecated
   public djp a(djp $$0, dbu $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(djp $$0, cpp $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.j()));
   }

   @Deprecated
   public boolean a(djp $$0, eey $$1) {
      return $$0.r() || !$$0.e();
   }

   @Deprecated
   public List<cng> a(djp $$0, ehl.a $$1) {
      ahh $$2 = this.v();
      if ($$2 == ehd.a) {
         return Collections.emptyList();
      } else {
         ehl $$3 = $$1.a(ejq.g, $$0).a(ejp.o);
         ane $$4 = $$3.a();
         ehn $$5 = $$4.o().aJ().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(djp $$0, hx $$1) {
      return aup.a($$1);
   }

   @Deprecated
   public emv f(djp $$0, ctd $$1, hx $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public emv b_(djp $$0, ctd $$1, hx $$2) {
      return this.b($$0, $$1, $$2, emh.a());
   }

   @Deprecated
   public emv a(djp $$0, ctd $$1, hx $$2) {
      return ems.a();
   }

   @Deprecated
   public int g(djp $$0, ctd $$1, hx $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.O();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bkg b(djp $$0, ctx $$1, hx $$2) {
      return null;
   }

   @Deprecated
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return true;
   }

   @Deprecated
   public float d(djp $$0, ctd $$1, hx $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(djp $$0, ctx $$1, hx $$2) {
      return 0;
   }

   @Deprecated
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return ems.b();
   }

   @Deprecated
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return this.aG ? $$0.j($$1, $$2) : ems.a();
   }

   @Deprecated
   public boolean c(djp $$0, ctd $$1, hx $$2) {
      return cwy.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(djp $$0, ctd $$1, hx $$2) {
      return cwy.a($$0.c($$1, $$2));
   }

   @Deprecated
   public emv c(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
   }

   @Deprecated
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
   }

   @Deprecated
   public float a(djp $$0, cfq $$1, ctd $$2, hx $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(djp $$0, ane $$1, hx $$2, cng $$3, boolean $$4) {
   }

   @Deprecated
   public void a(djp $$0, ctx $$1, hx $$2, cfq $$3) {
   }

   @Deprecated
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return 0;
   }

   @Deprecated
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
   }

   @Deprecated
   public int b(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return 0;
   }

   public final ahh v() {
      if (this.aQ == null) {
         ahh $$0 = kd.e.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   @Deprecated
   public void a(ctx $$0, djp $$1, ely $$2, cgi $$3) {
   }

   public abstract cnb j();

   protected abstract cwy q();

   public efd w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends djr<cwy, djp> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final efe l;
      private final efd m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final djo.f q;
      private final djo.f r;
      private final djo.f s;
      private final djo.f t;
      private final djo.f u;
      private final Optional<djo.b> v;
      private final boolean w;
      private final dkq x;
      private final boolean y;
      @Nullable
      protected djo.a.a a;
      private eez z = efa.a.g();
      private boolean A;

      protected a(cwy $$0, ImmutableMap<dks<?>, Comparable<?>> $$1, MapCodec<djp> $$2) {
         super($$0, $$1, $$2);
         djo.d $$3 = $$0.aP;
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
            emv $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               elx $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().p()) {
            this.a = new djo.a.a(this.x());
         }

         this.k = this.D();
      }

      public cwy b() {
         return this.e;
      }

      public ih<cwy> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         cwy $$0 = this.b();
         return $$0 != cxa.bs && $$0 != cxa.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(ctd $$0, hx $$1, bmc<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(ctd $$0, hx $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(ctd $$0, hx $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public emv a(ctd $$0, hx $$1, ic $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ems.a(this.c($$0, $$1), $$2);
      }

      public emv c(ctd $$0, hx $$1) {
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

      public efd d(ctd $$0, hx $$1) {
         return this.m;
      }

      public djp a(ddk $$0) {
         return this.b().a(this.x(), $$0);
      }

      public djp a(dbu $$0) {
         return this.b().a(this.x(), $$0);
      }

      public ddd l() {
         return this.b().b_(this.x());
      }

      public boolean e(ctd $$0, hx $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(ctd $$0, hx $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(ctd $$0, hx $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(ctd $$0, hx $$1, ic $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(ctx $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(ctd $$0, hx $$1) {
         return this.n;
      }

      public float a(cfq $$0, ctd $$1, hx $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(ctd $$0, hx $$1, ic $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public efe o() {
         return this.l;
      }

      public boolean i(ctd $$0, hx $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            djp $$2 = this.x();
            return $$2.p() ? cwy.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(djp $$0, ic $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public emv j(ctd $$0, hx $$1) {
         return this.a($$0, $$1, emh.a());
      }

      public emv a(ctd $$0, hx $$1, emh $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public emv k(ctd $$0, hx $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, emh.a());
      }

      public emv b(ctd $$0, hx $$1, emh $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public emv l(ctd $$0, hx $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public emv c(ctd $$0, hx $$1, emh $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public emv m(ctd $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(ctd $$0, hx $$1, blw $$2) {
         return this.a($$0, $$1, $$2, ic.b);
      }

      public final boolean a(ctd $$0, hx $$1, blw $$2, ic $$3) {
         return cwy.a(this.b($$0, $$1, emh.a($$2)), $$3);
      }

      public emc n(ctd $$0, hx $$1) {
         return this.v.<emc>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(emc.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(ctx $$0, hx $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(ctx $$0, hx $$1, cwy $$2, hx $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(cty $$0, hx $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(cty $$0, hx $$1, int $$2, int $$3) {
         hx.a $$4 = new hx.a();

         for (ic $$5 : djo.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(cty $$0, hx $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(cty $$0, hx $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(ctx $$0, hx $$1, djp $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(ctx $$0, hx $$1, djp $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(ctx $$0, hx $$1, ctp $$2, BiConsumer<cng, hx> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(ane $$0, hx $$1, auw $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(ane $$0, hx $$1, auw $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(ctx $$0, hx $$1, blw $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(ane $$0, hx $$1, cng $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cng> a(ehl.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bke a(cng $$0, ctx $$1, cfq $$2, bkb $$3, ely $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bkc a(ctx $$0, cfq $$1, ely $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(ctx $$0, hx $$1, cfq $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(ctd $$0, hx $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(ctd $$0, hx $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public djp a(ic $$0, djp $$1, cty $$2, hx $$3, hx $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(ctd $$0, hx $$1, efp $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cpp $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(eey $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(cua $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(ctd $$0, hx $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bkg b(ctx $$0, hx $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(asx<cwy> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(asx<cwy> $$0, Predicate<djo.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(il<cwy> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(ih<cwy> $$0) {
         return this.a($$0.a());
      }

      public Stream<asx<cwy>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof czq;
      }

      @Nullable
      public <T extends dhd> dhe<T> a(ctx $$0, dhf<T> $$1) {
         return this.b() instanceof czq ? ((czq)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(cwy $$0) {
         return this.b() == $$0;
      }

      public boolean a(ahg<cwy> $$0) {
         return this.b().r().a($$0);
      }

      public eez u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(hx $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dek w() {
         return this.b().m(this.x());
      }

      public void a(ctx $$0, djp $$1, ely $$2, cgi $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(ctd $$0, hx $$1, ic $$2) {
         return this.a($$0, $$1, $$2, dey.a);
      }

      public boolean a(ctd $$0, hx $$1, ic $$2, dey $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(ctd $$0, hx $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract djp x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dkq A() {
         return this.x;
      }

      static final class a {
         private static final ic[] e = ic.values();
         private static final int f = dey.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final emv[] i;
         protected final emv b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(djp $$0) {
            cwy $$1 = $$0.b();
            this.a = $$0.i(ctm.a, hx.b);
            this.g = $$1.a_($$0, ctm.a, hx.b);
            this.h = $$1.g($$0, ctm.a, hx.b);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new emv[e.length];
               emv $$2 = $$1.f($$0, ctm.a, hx.b);

               for (ic $$3 : e) {
                  this.i[$$3.ordinal()] = ems.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, ctm.a, hx.b, emh.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", kd.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(ic.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ic $$4 : e) {
                  for (dey $$5 : dey.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, ctm.a, hx.b, $$4);
                  }
               }

               this.d = cwy.a($$0.k(ctm.a, hx.b));
            }
         }

         public boolean a(ic $$0, dey $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ic $$0, dey $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      emc evaluate(djp var1, ctd var2, hx var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<djo.d> a = Codec.unit(() -> a());
      Function<djp, efd> b = $$0 -> efd.a;
      boolean c = true;
      dek d = dek.f;
      ToIntFunction<djp> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      ahh m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      efe t = efe.a;
      boolean u = true;
      dkq v = dkq.a;
      boolean w;
      djo.e<bmc<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ic.b) && $$0.h() < 14;
      djo.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      djo.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      djo.f A = this.z;
      djo.f B = ($$0, $$1, $$2) -> false;
      djo.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cia E = cic.g;
      Optional<djo.b> F = Optional.empty();

      private d() {
      }

      public static djo.d a() {
         return new djo.d();
      }

      public static djo.d a(djo $$0) {
         djo.d $$1 = b($$0);
         djo.d $$2 = $$0.aP;
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
      public static djo.d b(djo $$0) {
         djo.d $$1 = new djo.d();
         djo.d $$2 = $$0.aP;
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

      public djo.d a(clv $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public djo.d a(efd $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public djo.d a(Function<djp, efd> $$0) {
         this.b = $$0;
         return this;
      }

      public djo.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public djo.d c() {
         this.n = false;
         return this;
      }

      public djo.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public djo.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public djo.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public djo.d a(dek $$0) {
         this.d = $$0;
         return this;
      }

      public djo.d a(ToIntFunction<djp> $$0) {
         this.e = $$0;
         return this;
      }

      public djo.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public djo.d d() {
         return this.d(0.0F);
      }

      public djo.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public djo.d e() {
         this.i = true;
         return this;
      }

      public djo.d f() {
         this.D = true;
         return this;
      }

      public djo.d g() {
         this.m = ehd.a;
         return this;
      }

      public djo.d a(cwy $$0) {
         this.m = $$0.v();
         return this;
      }

      public djo.d h() {
         this.p = true;
         return this;
      }

      public djo.d i() {
         this.q = true;
         return this;
      }

      public djo.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public djo.d k() {
         this.r = true;
         return this;
      }

      public djo.d a(efe $$0) {
         this.t = $$0;
         return this;
      }

      public djo.d l() {
         this.o = true;
         return this;
      }

      public djo.d a(djo.e<bmc<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public djo.d a(djo.f $$0) {
         this.y = $$0;
         return this;
      }

      public djo.d b(djo.f $$0) {
         this.z = $$0;
         return this;
      }

      public djo.d c(djo.f $$0) {
         this.A = $$0;
         return this;
      }

      public djo.d d(djo.f $$0) {
         this.B = $$0;
         return this;
      }

      public djo.d e(djo.f $$0) {
         this.C = $$0;
         return this;
      }

      public djo.d m() {
         this.h = true;
         return this;
      }

      public djo.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public djo.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public djo.d a(djo.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cwy $$3 = $$0x.b();
                  long $$4 = aup.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.ay_();
                  float $$6 = $$3.aw_();
                  double $$7 = aup.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = aup.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new emc($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cwy $$3 = $$0x.b();
                  long $$4 = aup.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.aw_();
                  double $$6 = aup.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = aup.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new emc($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public djo.d n() {
         this.u = false;
         return this;
      }

      public djo.d a(chy... $$0) {
         this.E = cic.e.a($$0);
         return this;
      }

      public djo.d a(dkq $$0) {
         this.v = $$0;
         return this;
      }

      public djo.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(djp var1, ctd var2, hx var3, A var4);
   }

   public interface f {
      boolean test(djp var1, ctd var2, hx var3);
   }
}
