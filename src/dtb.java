import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class dtb implements cpi {
   protected static final ji[] aF = new ji[]{ji.e, ji.f, ji.c, ji.d, ji.a, ji.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dnm aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cpl aO;
   protected final dtb.d aP;
   @Nullable
   protected akq<eru> aQ;

   public dtb(dtb.d $$0) {
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

   public dtb.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dfy> a();

   protected static <B extends dfy> RecordCodecBuilder<B, dtb.d> u() {
      return dtb.d.a.fieldOf("properties").forGetter(dtb::t);
   }

   public static <B extends dfy> MapCodec<B> b(Function<dtb.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dtc $$0, dcx $$1, jd $$2, int $$3, int $$4) {
   }

   protected boolean a(dtc $$0, epr $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(dcl.a, jd.c);
         case b:
            return $$0.u().a(awk.a);
         case c:
            return !$$0.r(dcl.a, jd.c);
         default:
            return false;
      }
   }

   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$0;
   }

   protected boolean a(dtc $$0, dtc $$1, ji $$2) {
      return false;
   }

   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      agf.a($$1, $$2);
   }

   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
   }

   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dtc $$0, dcw $$1, jd $$2, dco $$3, BiConsumer<cuq, jd> $$4) {
      if (!$$0.i() && $$3.j() != dco.a.d) {
         dfy $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cmx;
         if ($$5.a($$3) && $$1 instanceof aqu $$7) {
            dqh $$8 = $$0.t() ? $$1.c_($$2) : null;
            ers.a $$9 = new ers.a($$7).a(eul.f, exa.b($$2)).a(eul.i, cuq.l).b(eul.h, $$8).b(eul.a, $$3.g());
            if ($$3.j() == dco.a.c) {
               $$9.a(eul.j, $$3.a());
            }

            $$0.a($$7, $$2, cuq.l, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dga.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      return bqr.e;
   }

   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, eww $$6) {
      return bqt.d;
   }

   protected boolean a(dtc $$0, dcw $$1, jd $$2, int $$3, int $$4) {
      return false;
   }

   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   protected boolean f_(dtc $$0) {
      return false;
   }

   protected boolean e_(dtc $$0) {
      return false;
   }

   protected epc b_(dtc $$0) {
      return epd.a.g();
   }

   protected boolean c_(dtc $$0) {
      return false;
   }

   protected float av_() {
      return 0.25F;
   }

   protected float ax_() {
      return 0.2F;
   }

   @Override
   public cpl i() {
      return this.aO;
   }

   protected dtc a(dtc $$0, dmm $$1) {
      return $$0;
   }

   protected dtc a(dtc $$0, dkv $$1) {
      return $$0;
   }

   protected boolean a(dtc $$0, cyd $$1) {
      return $$0.r() && ($$1.n().e() || !$$1.n().a(this.r()));
   }

   protected boolean a(dtc $$0, epb $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cuq> a(dtc $$0, ers.a $$1) {
      akq<eru> $$2 = this.v();
      if ($$2 == erl.a) {
         return Collections.emptyList();
      } else {
         ers $$3 = $$1.a(eul.g, $$0).a(euk.r);
         aqu $$4 = $$3.a();
         eru $$5 = $$4.o().be().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dtc $$0, jd $$1) {
      return ayo.a($$1);
   }

   protected ext f(dtc $$0, dcc $$1, jd $$2) {
      return $$0.j($$1, $$2);
   }

   protected ext b_(dtc $$0, dcc $$1, jd $$2) {
      return this.b($$0, $$1, $$2, exf.a());
   }

   protected ext a(dtc $$0, dcc $$1, jd $$2) {
      return exq.a();
   }

   protected int g(dtc $$0, dcc $$1, jd $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.Q();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bqv b(dtc $$0, dcw $$1, jd $$2) {
      return null;
   }

   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return true;
   }

   protected float d(dtc $$0, dcc $$1, jd $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return 0;
   }

   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return exq.b();
   }

   protected ext b(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return this.aG ? $$0.j($$1, $$2) : exq.a();
   }

   protected boolean c(dtc $$0, dcc $$1, jd $$2) {
      return dfy.a($$0.k($$1, $$2));
   }

   protected boolean h(dtc $$0, dcc $$1, jd $$2) {
      return dfy.a($$0.c($$1, $$2));
   }

   protected ext c(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
   }

   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
   }

   protected float a(dtc $$0, cmx $$1, dcc $$2, jd $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dtc $$0, aqu $$1, jd $$2, cuq $$3, boolean $$4) {
   }

   protected void a_(dtc $$0, dcw $$1, jd $$2, cmx $$3) {
   }

   protected int a(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return 0;
   }

   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
   }

   protected int b(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return 0;
   }

   public final akq<eru> v() {
      if (this.aQ == null) {
         akr $$0 = lt.e.b(this.q());
         this.aQ = akq.a(lu.bc, $$0.f("blocks/"));
      }

      return this.aQ;
   }

   protected void a(dcw $$0, dtc $$1, eww $$2, cnp $$3) {
   }

   protected boolean a_(dtc $$0, dcc $$1, jd $$2) {
      return !dfy.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean d_(dtc $$0) {
      return this.aI;
   }

   protected dnm g_(dtc $$0) {
      return this.aJ;
   }

   public abstract cul r();

   protected abstract dfy q();

   public epg w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dte<dfy, dtc> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eph l;
      private final epg m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dtb.f q;
      private final dtb.f r;
      private final dtb.f s;
      private final dtb.f t;
      private final dtb.f u;
      @Nullable
      private final dtb.b v;
      private final boolean w;
      private final dud x;
      private final boolean y;
      @Nullable
      protected dtb.a.a a;
      private epc z = epd.a.g();
      private boolean A;

      protected a(dfy $$0, Reference2ObjectArrayMap<duf<?>, Comparable<?>> $$1, MapCodec<dtc> $$2) {
         super($$0, $$1, $$2);
         dtb.d $$3 = $$0.aP;
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
            ext $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               ewv $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.b_(this.x());
         this.A = this.e.d_(this.x());
         if (!this.b().p()) {
            this.a = new dtb.a.a(this.x());
         }

         this.k = this.D();
      }

      public dfy b() {
         return this.e;
      }

      public jm<dfy> c() {
         return this.e.s();
      }

      @Deprecated
      public boolean d() {
         dfy $$0 = this.b();
         return $$0 != dga.bs && $$0 != dga.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(dcc $$0, jd $$1, bsx<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(dcc $$0, jd $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(dcc $$0, jd $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public ext a(dcc $$0, jd $$1, ji $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : exq.a(this.c($$0, $$1), $$2);
      }

      public ext c(dcc $$0, jd $$1) {
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

      public epg d(dcc $$0, jd $$1) {
         return this.m;
      }

      public dtc a(dmm $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dtc a(dkv $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dmf l() {
         return this.b().a_(this.x());
      }

      public boolean e(dcc $$0, jd $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(dcc $$0, jd $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(dcc $$0, jd $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().e_(this.x());
      }

      public int b(dcc $$0, jd $$1, ji $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().c_(this.x());
      }

      public int a(dcw $$0, jd $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(dcc $$0, jd $$1) {
         return this.n;
      }

      public float a(cmx $$0, dcc $$1, jd $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(dcc $$0, jd $$1, ji $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eph o() {
         return this.l;
      }

      public boolean i(dcc $$0, jd $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dtc $$2 = this.x();
            return $$2.p() ? dfy.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dtc $$0, ji $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public ext j(dcc $$0, jd $$1) {
         return this.a($$0, $$1, exf.a());
      }

      public ext a(dcc $$0, jd $$1, exf $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public ext k(dcc $$0, jd $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, exf.a());
      }

      public ext b(dcc $$0, jd $$1, exf $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ext l(dcc $$0, jd $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public ext c(dcc $$0, jd $$1, exf $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public ext m(dcc $$0, jd $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(dcc $$0, jd $$1, bsr $$2) {
         return this.a($$0, $$1, $$2, ji.b);
      }

      public final boolean a(dcc $$0, jd $$1, bsr $$2, ji $$3) {
         return dfy.a(this.b($$0, $$1, exf.a($$2)), $$3);
      }

      public exa n(dcc $$0, jd $$1) {
         dtb.b $$2 = this.v;
         return $$2 != null ? $$2.evaluate(this.x(), $$0, $$1) : exa.b;
      }

      public boolean q() {
         return this.v != null;
      }

      public boolean a(dcw $$0, jd $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dcw $$0, jd $$1, dfy $$2, jd $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dcx $$0, jd $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dcx $$0, jd $$1, int $$2, int $$3) {
         jd.a $$4 = new jd.a();

         for (ji $$5 : dtb.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(dcx $$0, jd $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dcx $$0, jd $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dcw $$0, jd $$1, dtc $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(dcw $$0, jd $$1, dtc $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dcw $$0, jd $$1, dco $$2, BiConsumer<cuq, jd> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(aqu $$0, jd $$1, ayw $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(aqu $$0, jd $$1, ayw $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(dcw $$0, jd $$1, bsr $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(aqu $$0, jd $$1, cuq $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cuq> a(ers.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bqt a(cuq $$0, dcw $$1, cmx $$2, bqq $$3, eww $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bqr a(dcw $$0, cmx $$1, eww $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(dcw $$0, jd $$1, cmx $$2) {
         this.b().a_(this.x(), $$0, $$1, $$2);
      }

      public boolean o(dcc $$0, jd $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(dcc $$0, jd $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dtc a(ji $$0, dtc $$1, dcx $$2, jd $$3, jd $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(epr $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cyd $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(epb $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(dcz $$0, jd $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(dcc $$0, jd $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bqv b(dcw $$0, jd $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(awu<dfy> $$0) {
         return this.b().s().a($$0);
      }

      public boolean a(awu<dfy> $$0, Predicate<dtb.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jq<dfy> $$0) {
         return $$0.a(this.b().s());
      }

      public boolean a(jm<dfy> $$0) {
         return this.a($$0.a());
      }

      public Stream<awu<dfy>> s() {
         return this.b().s().c();
      }

      public boolean t() {
         return this.b() instanceof diq;
      }

      @Nullable
      public <T extends dqh> dqi<T> a(dcw $$0, dqj<T> $$1) {
         return this.b() instanceof diq ? ((diq)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dfy $$0) {
         return this.b() == $$0;
      }

      public boolean a(akq<dfy> $$0) {
         return this.b().s().a($$0);
      }

      public epc u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(jd $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dnm w() {
         return this.b().g_(this.x());
      }

      public void a(dcw $$0, dtc $$1, eww $$2, cnp $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(dcc $$0, jd $$1, ji $$2) {
         return this.a($$0, $$1, $$2, doa.a);
      }

      public boolean a(dcc $$0, jd $$1, ji $$2, doa $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(dcc $$0, jd $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dtc x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dud A() {
         return this.x;
      }

      static final class a {
         private static final ji[] e = ji.values();
         private static final int f = doa.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final ext[] i;
         protected final ext b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dtc $$0) {
            dfy $$1 = $$0.b();
            this.a = $$0.i(dcl.a, jd.c);
            this.g = $$1.a_($$0, dcl.a, jd.c);
            this.h = $$1.g($$0, dcl.a, jd.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new ext[e.length];
               ext $$2 = $$1.f($$0, dcl.a, jd.c);

               for (ji $$3 : e) {
                  this.i[$$3.ordinal()] = exq.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, dcl.a, jd.c, exf.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lt.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(ji.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ji $$4 : e) {
                  for (doa $$5 : doa.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, dcl.a, jd.c, $$4);
                  }
               }

               this.d = dfy.a($$0.k(dcl.a, jd.c));
            }
         }

         public boolean a(ji $$0, doa $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ji $$0, doa $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      exa evaluate(dtc var1, dcc var2, jd var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dtb.d> a = Codec.unit(() -> a());
      Function<dtc, epg> b = $$0 -> epg.a;
      boolean c = true;
      dnm d = dnm.f;
      ToIntFunction<dtc> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      akq<eru> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      eph t = eph.a;
      boolean u = true;
      dud v = dud.a;
      boolean w;
      dtb.e<bsx<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ji.b) && $$0.h() < 14;
      dtb.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dtb.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dtb.f A = this.z;
      dtb.f B = ($$0, $$1, $$2) -> false;
      dtb.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cpl E = cpn.f;
      @Nullable
      dtb.b F;

      private d() {
      }

      public static dtb.d a() {
         return new dtb.d();
      }

      public static dtb.d a(dtb $$0) {
         dtb.d $$1 = b($$0);
         dtb.d $$2 = $$0.aP;
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
      public static dtb.d b(dtb $$0) {
         dtb.d $$1 = new dtb.d();
         dtb.d $$2 = $$0.aP;
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

      public dtb.d a(cti $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dtb.d a(epg $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dtb.d a(Function<dtc, epg> $$0) {
         this.b = $$0;
         return this;
      }

      public dtb.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dtb.d c() {
         this.n = false;
         return this;
      }

      public dtb.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dtb.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dtb.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dtb.d a(dnm $$0) {
         this.d = $$0;
         return this;
      }

      public dtb.d a(ToIntFunction<dtc> $$0) {
         this.e = $$0;
         return this;
      }

      public dtb.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dtb.d d() {
         return this.d(0.0F);
      }

      public dtb.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dtb.d e() {
         this.i = true;
         return this;
      }

      public dtb.d f() {
         this.D = true;
         return this;
      }

      public dtb.d g() {
         this.m = erl.a;
         return this;
      }

      public dtb.d a(dfy $$0) {
         this.m = $$0.v();
         return this;
      }

      public dtb.d h() {
         this.p = true;
         return this;
      }

      public dtb.d i() {
         this.q = true;
         return this;
      }

      public dtb.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dtb.d k() {
         this.r = true;
         return this;
      }

      public dtb.d a(eph $$0) {
         this.t = $$0;
         return this;
      }

      public dtb.d l() {
         this.o = true;
         return this;
      }

      public dtb.d a(dtb.e<bsx<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dtb.d a(dtb.f $$0) {
         this.y = $$0;
         return this;
      }

      public dtb.d b(dtb.f $$0) {
         this.z = $$0;
         return this;
      }

      public dtb.d c(dtb.f $$0) {
         this.A = $$0;
         return this;
      }

      public dtb.d d(dtb.f $$0) {
         this.B = $$0;
         return this;
      }

      public dtb.d e(dtb.f $$0) {
         this.C = $$0;
         return this;
      }

      public dtb.d m() {
         this.h = true;
         return this;
      }

      public dtb.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dtb.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dtb.d a(dtb.c $$0) {
         this.F = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1, $$2) -> {
            dfy $$3 = $$0x.b();
            long $$4 = ayo.b($$2.u(), 0, $$2.w());
            float $$5 = $$3.av_();
            double $$6 = ayo.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = ayo.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new exa($$6, 0.0, $$7);
         };
            case c -> ($$0x, $$1, $$2) -> {
            dfy $$3 = $$0x.b();
            long $$4 = ayo.b($$2.u(), 0, $$2.w());
            double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.ax_();
            float $$6 = $$3.av_();
            double $$7 = ayo.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
            double $$8 = ayo.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
            return new exa($$7, $$5, $$8);
         };
         };
         return this;
      }

      public dtb.d n() {
         this.u = false;
         return this;
      }

      public dtb.d a(cpj... $$0) {
         this.E = cpn.d.a($$0);
         return this;
      }

      public dtb.d a(dud $$0) {
         this.v = $$0;
         return this;
      }

      public dtb.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dtc var1, dcc var2, jd var3, A var4);
   }

   public interface f {
      boolean test(dtc var1, dcc var2, jd var3);
   }
}
