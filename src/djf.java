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

public abstract class djf implements cho {
   protected static final ic[] aF = new ic[]{ic.e, ic.f, ic.c, ic.d, ic.a, ic.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final deb aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final chr aO;
   protected final djf.d aP;
   @Nullable
   protected ahg aQ;

   public djf(djf.d $$0) {
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

   public djf.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends cwp> a();

   protected static <B extends cwp> RecordCodecBuilder<B, djf.d> u() {
      return djf.d.a.fieldOf("properties").forGetter(djf::t);
   }

   public static <B extends cwp> MapCodec<B> b(Function<djf.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   @Deprecated
   public void a(djg $$0, ctp $$1, hx $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(asl.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   @Deprecated
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(djg $$0, djg $$1, ic $$2) {
      return false;
   }

   @Deprecated
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      adi.a($$1, $$2);
   }

   @Deprecated
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
   }

   @Deprecated
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   @Deprecated
   public void a(djg $$0, cto $$1, hx $$2, ctg $$3, BiConsumer<cmx, hx> $$4) {
      if (!$$0.i() && $$3.j() != ctg.a.d) {
         cwp $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cfh;
         if ($$5.a($$3) && $$1 instanceof and $$7) {
            dgu $$8 = $$0.t() ? $$1.c_($$2) : null;
            ehb.a $$9 = new ehb.a($$7).a(ejg.f, els.b($$2)).a(ejg.i, cmx.f).b(ejg.h, $$8).b(ejg.a, $$3.g());
            if ($$3.j() == ctg.a.c) {
               $$9.a(ejg.j, $$3.a());
            }

            $$0.a($$7, $$2, cmx.f, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, cwr.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   @Deprecated
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      return bka.d;
   }

   @Deprecated
   public boolean a(djg $$0, cto $$1, hx $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Deprecated
   public boolean g_(djg $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(djg $$0) {
      return false;
   }

   @Deprecated
   public eeq c_(djg $$0) {
      return eer.a.g();
   }

   @Deprecated
   public boolean d_(djg $$0) {
      return false;
   }

   public float at_() {
      return 0.25F;
   }

   public float av_() {
      return 0.2F;
   }

   @Override
   public chr m() {
      return this.aO;
   }

   @Deprecated
   public djg a(djg $$0, ddb $$1) {
      return $$0;
   }

   @Deprecated
   public djg a(djg $$0, dbl $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(djg $$0, cpg $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.k()));
   }

   @Deprecated
   public boolean a(djg $$0, eep $$1) {
      return $$0.r() || !$$0.e();
   }

   @Deprecated
   public List<cmx> a(djg $$0, ehb.a $$1) {
      ahg $$2 = this.v();
      if ($$2 == egt.a) {
         return Collections.emptyList();
      } else {
         ehb $$3 = $$1.a(ejg.g, $$0).a(ejf.o);
         and $$4 = $$3.a();
         ehd $$5 = $$4.o().aJ().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(djg $$0, hx $$1) {
      return aun.a($$1);
   }

   @Deprecated
   public eml f(djg $$0, csu $$1, hx $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public eml b_(djg $$0, csu $$1, hx $$2) {
      return this.b($$0, $$1, $$2, elx.a());
   }

   @Deprecated
   public eml a(djg $$0, csu $$1, hx $$2) {
      return emi.a();
   }

   @Deprecated
   public int g(djg $$0, csu $$1, hx $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.O();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bkd b(djg $$0, cto $$1, hx $$2) {
      return null;
   }

   @Deprecated
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return true;
   }

   @Deprecated
   public float d(djg $$0, csu $$1, hx $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(djg $$0, cto $$1, hx $$2) {
      return 0;
   }

   @Deprecated
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return emi.b();
   }

   @Deprecated
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      return this.aG ? $$0.j($$1, $$2) : emi.a();
   }

   @Deprecated
   public boolean c(djg $$0, csu $$1, hx $$2) {
      return cwp.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(djg $$0, csu $$1, hx $$2) {
      return cwp.a($$0.c($$1, $$2));
   }

   @Deprecated
   public eml c(djg $$0, csu $$1, hx $$2, elx $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
   }

   @Deprecated
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
   }

   @Deprecated
   public float a(djg $$0, cfh $$1, csu $$2, hx $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(djg $$0, and $$1, hx $$2, cmx $$3, boolean $$4) {
   }

   @Deprecated
   public void a(djg $$0, cto $$1, hx $$2, cfh $$3) {
   }

   @Deprecated
   public int a(djg $$0, csu $$1, hx $$2, ic $$3) {
      return 0;
   }

   @Deprecated
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
   }

   @Deprecated
   public int b(djg $$0, csu $$1, hx $$2, ic $$3) {
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
   public void a(cto $$0, djg $$1, elo $$2, cfz $$3) {
   }

   public abstract cms k();

   protected abstract cwp q();

   public eeu w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dji<cwp, djg> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eev l;
      private final eeu m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final djf.f q;
      private final djf.f r;
      private final djf.f s;
      private final djf.f t;
      private final djf.f u;
      private final Optional<djf.b> v;
      private final boolean w;
      private final dkh x;
      private final boolean y;
      @Nullable
      protected djf.a.a a;
      private eeq z = eer.a.g();
      private boolean A;

      protected a(cwp $$0, ImmutableMap<dkj<?>, Comparable<?>> $$1, MapCodec<djg> $$2) {
         super($$0, $$1, $$2);
         djf.d $$3 = $$0.aP;
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
            eml $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               eln $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().p()) {
            this.a = new djf.a.a(this.x());
         }

         this.k = this.D();
      }

      public cwp b() {
         return this.e;
      }

      public ih<cwp> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         cwp $$0 = this.b();
         return $$0 != cwr.bs && $$0 != cwr.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(csu $$0, hx $$1, bly<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(csu $$0, hx $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(csu $$0, hx $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public eml a(csu $$0, hx $$1, ic $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : emi.a(this.c($$0, $$1), $$2);
      }

      public eml c(csu $$0, hx $$1) {
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

      public eeu d(csu $$0, hx $$1) {
         return this.m;
      }

      public djg a(ddb $$0) {
         return this.b().a(this.x(), $$0);
      }

      public djg a(dbl $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dcu l() {
         return this.b().b_(this.x());
      }

      public boolean e(csu $$0, hx $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(csu $$0, hx $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(csu $$0, hx $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(csu $$0, hx $$1, ic $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(cto $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(csu $$0, hx $$1) {
         return this.n;
      }

      public float a(cfh $$0, csu $$1, hx $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(csu $$0, hx $$1, ic $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eev o() {
         return this.l;
      }

      public boolean i(csu $$0, hx $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            djg $$2 = this.x();
            return $$2.p() ? cwp.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(djg $$0, ic $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public eml j(csu $$0, hx $$1) {
         return this.a($$0, $$1, elx.a());
      }

      public eml a(csu $$0, hx $$1, elx $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public eml k(csu $$0, hx $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, elx.a());
      }

      public eml b(csu $$0, hx $$1, elx $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eml l(csu $$0, hx $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public eml c(csu $$0, hx $$1, elx $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public eml m(csu $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(csu $$0, hx $$1, blu $$2) {
         return this.a($$0, $$1, $$2, ic.b);
      }

      public final boolean a(csu $$0, hx $$1, blu $$2, ic $$3) {
         return cwp.a(this.b($$0, $$1, elx.a($$2)), $$3);
      }

      public els n(csu $$0, hx $$1) {
         return this.v.<els>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(els.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(cto $$0, hx $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(cto $$0, hx $$1, cwp $$2, hx $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(ctp $$0, hx $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(ctp $$0, hx $$1, int $$2, int $$3) {
         hx.a $$4 = new hx.a();

         for (ic $$5 : djf.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(ctp $$0, hx $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(ctp $$0, hx $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cto $$0, hx $$1, djg $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(cto $$0, hx $$1, djg $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cto $$0, hx $$1, ctg $$2, BiConsumer<cmx, hx> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(and $$0, hx $$1, auu $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(and $$0, hx $$1, auu $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(cto $$0, hx $$1, blu $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(and $$0, hx $$1, cmx $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cmx> a(ehb.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bka a(cto $$0, cfh $$1, bjz $$2, elo $$3) {
         return this.b().a(this.x(), $$0, $$3.a(), $$1, $$2, $$3);
      }

      public void a(cto $$0, hx $$1, cfh $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(csu $$0, hx $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(csu $$0, hx $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public djg a(ic $$0, djg $$1, ctp $$2, hx $$3, hx $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(csu $$0, hx $$1, efg $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cpg $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(eep $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(ctr $$0, hx $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(csu $$0, hx $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bkd b(cto $$0, hx $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(asv<cwp> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(asv<cwp> $$0, Predicate<djf.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(il<cwp> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(ih<cwp> $$0) {
         return this.a($$0.a());
      }

      public Stream<asv<cwp>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof czh;
      }

      @Nullable
      public <T extends dgu> dgv<T> a(cto $$0, dgw<T> $$1) {
         return this.b() instanceof czh ? ((czh)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(cwp $$0) {
         return this.b() == $$0;
      }

      public boolean a(ahf<cwp> $$0) {
         return this.b().r().a($$0);
      }

      public eeq u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(hx $$0) {
         return this.b().a(this.x(), $$0);
      }

      public deb w() {
         return this.b().m(this.x());
      }

      public void a(cto $$0, djg $$1, elo $$2, cfz $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(csu $$0, hx $$1, ic $$2) {
         return this.a($$0, $$1, $$2, dep.a);
      }

      public boolean a(csu $$0, hx $$1, ic $$2, dep $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(csu $$0, hx $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract djg x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dkh A() {
         return this.x;
      }

      static final class a {
         private static final ic[] e = ic.values();
         private static final int f = dep.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final eml[] i;
         protected final eml b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(djg $$0) {
            cwp $$1 = $$0.b();
            this.a = $$0.i(ctd.a, hx.b);
            this.g = $$1.a_($$0, ctd.a, hx.b);
            this.h = $$1.g($$0, ctd.a, hx.b);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new eml[e.length];
               eml $$2 = $$1.f($$0, ctd.a, hx.b);

               for (ic $$3 : e) {
                  this.i[$$3.ordinal()] = emi.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, ctd.a, hx.b, elx.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", kd.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(ic.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ic $$4 : e) {
                  for (dep $$5 : dep.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, ctd.a, hx.b, $$4);
                  }
               }

               this.d = cwp.a($$0.k(ctd.a, hx.b));
            }
         }

         public boolean a(ic $$0, dep $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ic $$0, dep $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      els evaluate(djg var1, csu var2, hx var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<djf.d> a = Codec.unit(() -> a());
      Function<djg, eeu> b = $$0 -> eeu.a;
      boolean c = true;
      deb d = deb.f;
      ToIntFunction<djg> e = $$0 -> 0;
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
      eev t = eev.a;
      boolean u = true;
      dkh v = dkh.a;
      boolean w;
      djf.e<bly<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ic.b) && $$0.h() < 14;
      djf.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      djf.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      djf.f A = this.z;
      djf.f B = ($$0, $$1, $$2) -> false;
      djf.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      chr E = cht.g;
      Optional<djf.b> F = Optional.empty();

      private d() {
      }

      public static djf.d a() {
         return new djf.d();
      }

      public static djf.d a(djf $$0) {
         djf.d $$1 = b($$0);
         djf.d $$2 = $$0.aP;
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
      public static djf.d b(djf $$0) {
         djf.d $$1 = new djf.d();
         djf.d $$2 = $$0.aP;
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

      public djf.d a(cll $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public djf.d a(eeu $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public djf.d a(Function<djg, eeu> $$0) {
         this.b = $$0;
         return this;
      }

      public djf.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public djf.d c() {
         this.n = false;
         return this;
      }

      public djf.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public djf.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public djf.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public djf.d a(deb $$0) {
         this.d = $$0;
         return this;
      }

      public djf.d a(ToIntFunction<djg> $$0) {
         this.e = $$0;
         return this;
      }

      public djf.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public djf.d d() {
         return this.d(0.0F);
      }

      public djf.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public djf.d e() {
         this.i = true;
         return this;
      }

      public djf.d f() {
         this.D = true;
         return this;
      }

      public djf.d g() {
         this.m = egt.a;
         return this;
      }

      public djf.d a(cwp $$0) {
         this.m = $$0.v();
         return this;
      }

      public djf.d h() {
         this.p = true;
         return this;
      }

      public djf.d i() {
         this.q = true;
         return this;
      }

      public djf.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public djf.d k() {
         this.r = true;
         return this;
      }

      public djf.d a(eev $$0) {
         this.t = $$0;
         return this;
      }

      public djf.d l() {
         this.o = true;
         return this;
      }

      public djf.d a(djf.e<bly<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public djf.d a(djf.f $$0) {
         this.y = $$0;
         return this;
      }

      public djf.d b(djf.f $$0) {
         this.z = $$0;
         return this;
      }

      public djf.d c(djf.f $$0) {
         this.A = $$0;
         return this;
      }

      public djf.d d(djf.f $$0) {
         this.B = $$0;
         return this;
      }

      public djf.d e(djf.f $$0) {
         this.C = $$0;
         return this;
      }

      public djf.d m() {
         this.h = true;
         return this;
      }

      public djf.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public djf.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public djf.d a(djf.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cwp $$3 = $$0x.b();
                  long $$4 = aun.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.av_();
                  float $$6 = $$3.at_();
                  double $$7 = aun.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = aun.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new els($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cwp $$3 = $$0x.b();
                  long $$4 = aun.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.at_();
                  double $$6 = aun.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = aun.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new els($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public djf.d n() {
         this.u = false;
         return this;
      }

      public djf.d a(chp... $$0) {
         this.E = cht.e.a($$0);
         return this;
      }

      public djf.d a(dkh $$0) {
         this.v = $$0;
         return this;
      }

      public djf.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(djg var1, csu var2, hx var3, A var4);
   }

   public interface f {
      boolean test(djg var1, csu var2, hx var3);
   }
}
