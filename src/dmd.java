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

public abstract class dmd implements cki {
   protected static final ih[] aF = new ih[]{ih.e, ih.f, ih.c, ih.d, ih.a, ih.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dgr aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final ckl aO;
   protected final dmd.d aP;
   @Nullable
   protected ajc aQ;

   public dmd(dmd.d $$0) {
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

   public dmd.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends czf> a();

   protected static <B extends czf> RecordCodecBuilder<B, dmd.d> u() {
      return dmd.d.a.fieldOf("properties").forGetter(dmd::t);
   }

   public static <B extends czf> MapCodec<B> b(Function<dmd.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dme $$0, cwf $$1, ib $$2, int $$3, int $$4) {
   }

   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(auj.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$0;
   }

   protected boolean a(dme $$0, dme $$1, ih $$2) {
      return false;
   }

   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      aes.a($$1, $$2);
   }

   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
   }

   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dme $$0, cwe $$1, ib $$2, cvw $$3, BiConsumer<cpq, ib> $$4) {
      if (!$$0.i() && $$3.j() != cvw.a.d) {
         czf $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cia;
         if ($$5.a($$3) && $$1 instanceof apa $$7) {
            djl $$8 = $$0.t() ? $$1.c_($$2) : null;
            eke.a $$9 = new eke.a($$7).a(emj.f, eov.b($$2)).a(emj.i, cpq.h).b(emj.h, $$8).b(emj.a, $$3.g());
            if ($$3.j() == cvw.a.c) {
               $$9.a(emj.j, $$3.a());
            }

            $$0.a($$7, $$2, cpq.h, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, czh.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      return bml.d;
   }

   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      return bmn.d;
   }

   protected boolean a(dme $$0, cwe $$1, ib $$2, int $$3, int $$4) {
      return false;
   }

   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   protected boolean g_(dme $$0) {
      return false;
   }

   protected boolean f_(dme $$0) {
      return false;
   }

   protected ehr c_(dme $$0) {
      return ehs.a.g();
   }

   protected boolean d_(dme $$0) {
      return false;
   }

   protected float av_() {
      return 0.25F;
   }

   protected float ax_() {
      return 0.2F;
   }

   @Override
   public ckl m() {
      return this.aO;
   }

   protected dme a(dme $$0, dfr $$1) {
      return $$0;
   }

   protected dme a(dme $$0, deb $$1) {
      return $$0;
   }

   protected boolean a(dme $$0, crx $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.l()));
   }

   protected boolean a(dme $$0, ehq $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cpq> a(dme $$0, eke.a $$1) {
      ajc $$2 = this.v();
      if ($$2 == ejw.a) {
         return Collections.emptyList();
      } else {
         eke $$3 = $$1.a(emj.g, $$0).a(emi.q);
         apa $$4 = $$3.a();
         ekg $$5 = $$4.o().aM().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dme $$0, ib $$1) {
      return awm.a($$1);
   }

   protected epo f(dme $$0, cvk $$1, ib $$2) {
      return $$0.j($$1, $$2);
   }

   protected epo b_(dme $$0, cvk $$1, ib $$2) {
      return this.b($$0, $$1, $$2, epa.a());
   }

   protected epo a(dme $$0, cvk $$1, ib $$2) {
      return epl.a();
   }

   protected int g(dme $$0, cvk $$1, ib $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.O();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bmp b(dme $$0, cwe $$1, ib $$2) {
      return null;
   }

   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return true;
   }

   protected float d(dme $$0, cvk $$1, ib $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dme $$0, cwe $$1, ib $$2) {
      return 0;
   }

   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return epl.b();
   }

   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return this.aG ? $$0.j($$1, $$2) : epl.a();
   }

   protected boolean c(dme $$0, cvk $$1, ib $$2) {
      return czf.a($$0.k($$1, $$2));
   }

   protected boolean h(dme $$0, cvk $$1, ib $$2) {
      return czf.a($$0.c($$1, $$2));
   }

   protected epo c(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
   }

   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
   }

   protected float a(dme $$0, cia $$1, cvk $$2, ib $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dme $$0, apa $$1, ib $$2, cpq $$3, boolean $$4) {
   }

   protected void a(dme $$0, cwe $$1, ib $$2, cia $$3) {
   }

   protected int a(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return 0;
   }

   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
   }

   protected int b(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return 0;
   }

   public final ajc v() {
      if (this.aQ == null) {
         ajc $$0 = kh.e.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   protected void a(cwe $$0, dme $$1, eor $$2, cis $$3) {
   }

   protected boolean a_(dme $$0, cvk $$1, ib $$2) {
      return !czf.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean e_(dme $$0) {
      return this.aI;
   }

   protected dgr h_(dme $$0) {
      return this.aJ;
   }

   public abstract cpl l();

   protected abstract czf q();

   public ehv w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dmg<czf, dme> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final ehw l;
      private final ehv m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dmd.f q;
      private final dmd.f r;
      private final dmd.f s;
      private final dmd.f t;
      private final dmd.f u;
      private final Optional<dmd.b> v;
      private final boolean w;
      private final dnf x;
      private final boolean y;
      @Nullable
      protected dmd.a.a a;
      private ehr z = ehs.a.g();
      private boolean A;

      protected a(czf $$0, ImmutableMap<dnh<?>, Comparable<?>> $$1, MapCodec<dme> $$2) {
         super($$0, $$1, $$2);
         dmd.d $$3 = $$0.aP;
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
            epo $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               eoq $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().p()) {
            this.a = new dmd.a.a(this.x());
         }

         this.k = this.D();
      }

      public czf b() {
         return this.e;
      }

      public il<czf> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         czf $$0 = this.b();
         return $$0 != czh.bs && $$0 != czh.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cvk $$0, ib $$1, bol<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cvk $$0, ib $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(cvk $$0, ib $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public epo a(cvk $$0, ib $$1, ih $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : epl.a(this.c($$0, $$1), $$2);
      }

      public epo c(cvk $$0, ib $$1) {
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

      public ehv d(cvk $$0, ib $$1) {
         return this.m;
      }

      public dme a(dfr $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dme a(deb $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dfk l() {
         return this.b().b_(this.x());
      }

      public boolean e(cvk $$0, ib $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cvk $$0, ib $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(cvk $$0, ib $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cvk $$0, ib $$1, ih $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(cwe $$0, ib $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cvk $$0, ib $$1) {
         return this.n;
      }

      public float a(cia $$0, cvk $$1, ib $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cvk $$0, ib $$1, ih $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ehw o() {
         return this.l;
      }

      public boolean i(cvk $$0, ib $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dme $$2 = this.x();
            return $$2.p() ? czf.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dme $$0, ih $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public epo j(cvk $$0, ib $$1) {
         return this.a($$0, $$1, epa.a());
      }

      public epo a(cvk $$0, ib $$1, epa $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public epo k(cvk $$0, ib $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, epa.a());
      }

      public epo b(cvk $$0, ib $$1, epa $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public epo l(cvk $$0, ib $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public epo c(cvk $$0, ib $$1, epa $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public epo m(cvk $$0, ib $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cvk $$0, ib $$1, bof $$2) {
         return this.a($$0, $$1, $$2, ih.b);
      }

      public final boolean a(cvk $$0, ib $$1, bof $$2, ih $$3) {
         return czf.a(this.b($$0, $$1, epa.a($$2)), $$3);
      }

      public eov n(cvk $$0, ib $$1) {
         return this.v.<eov>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(eov.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(cwe $$0, ib $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cwe $$0, ib $$1, czf $$2, ib $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(cwf $$0, ib $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(cwf $$0, ib $$1, int $$2, int $$3) {
         ib.a $$4 = new ib.a();

         for (ih $$5 : dmd.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(cwf $$0, ib $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(cwf $$0, ib $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cwe $$0, ib $$1, dme $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(cwe $$0, ib $$1, dme $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cwe $$0, ib $$1, cvw $$2, BiConsumer<cpq, ib> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(apa $$0, ib $$1, awt $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(apa $$0, ib $$1, awt $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(cwe $$0, ib $$1, bof $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(apa $$0, ib $$1, cpq $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cpq> a(eke.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bmn a(cpq $$0, cwe $$1, cia $$2, bmk $$3, eor $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bml a(cwe $$0, cia $$1, eor $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(cwe $$0, ib $$1, cia $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cvk $$0, ib $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cvk $$0, ib $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dme a(ih $$0, dme $$1, cwf $$2, ib $$3, ib $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(cvk $$0, ib $$1, eih $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(crx $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(ehq $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(cwh $$0, ib $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cvk $$0, ib $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bmp b(cwe $$0, ib $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(aut<czf> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(aut<czf> $$0, Predicate<dmd.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ip<czf> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(il<czf> $$0) {
         return this.a($$0.a());
      }

      public Stream<aut<czf>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof dbx;
      }

      @Nullable
      public <T extends djl> djm<T> a(cwe $$0, djn<T> $$1) {
         return this.b() instanceof dbx ? ((dbx)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(czf $$0) {
         return this.b() == $$0;
      }

      public boolean a(ajb<czf> $$0) {
         return this.b().r().a($$0);
      }

      public ehr u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(ib $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dgr w() {
         return this.b().h_(this.x());
      }

      public void a(cwe $$0, dme $$1, eor $$2, cis $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cvk $$0, ib $$1, ih $$2) {
         return this.a($$0, $$1, $$2, dhf.a);
      }

      public boolean a(cvk $$0, ib $$1, ih $$2, dhf $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cvk $$0, ib $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dme x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dnf A() {
         return this.x;
      }

      static final class a {
         private static final ih[] e = ih.values();
         private static final int f = dhf.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final epo[] i;
         protected final epo b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dme $$0) {
            czf $$1 = $$0.b();
            this.a = $$0.i(cvt.a, ib.c);
            this.g = $$1.a_($$0, cvt.a, ib.c);
            this.h = $$1.g($$0, cvt.a, ib.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new epo[e.length];
               epo $$2 = $$1.f($$0, cvt.a, ib.c);

               for (ih $$3 : e) {
                  this.i[$$3.ordinal()] = epl.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, cvt.a, ib.c, epa.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", kh.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(ih.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ih $$4 : e) {
                  for (dhf $$5 : dhf.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cvt.a, ib.c, $$4);
                  }
               }

               this.d = czf.a($$0.k(cvt.a, ib.c));
            }
         }

         public boolean a(ih $$0, dhf $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ih $$0, dhf $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      eov evaluate(dme var1, cvk var2, ib var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dmd.d> a = Codec.unit(() -> a());
      Function<dme, ehv> b = $$0 -> ehv.a;
      boolean c = true;
      dgr d = dgr.f;
      ToIntFunction<dme> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      ajc m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      ehw t = ehw.a;
      boolean u = true;
      dnf v = dnf.a;
      boolean w;
      dmd.e<bol<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ih.b) && $$0.h() < 14;
      dmd.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dmd.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dmd.f A = this.z;
      dmd.f B = ($$0, $$1, $$2) -> false;
      dmd.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      ckl E = ckn.g;
      Optional<dmd.b> F = Optional.empty();

      private d() {
      }

      public static dmd.d a() {
         return new dmd.d();
      }

      public static dmd.d a(dmd $$0) {
         dmd.d $$1 = b($$0);
         dmd.d $$2 = $$0.aP;
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
      public static dmd.d b(dmd $$0) {
         dmd.d $$1 = new dmd.d();
         dmd.d $$2 = $$0.aP;
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

      public dmd.d a(cog $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dmd.d a(ehv $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dmd.d a(Function<dme, ehv> $$0) {
         this.b = $$0;
         return this;
      }

      public dmd.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dmd.d c() {
         this.n = false;
         return this;
      }

      public dmd.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dmd.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dmd.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dmd.d a(dgr $$0) {
         this.d = $$0;
         return this;
      }

      public dmd.d a(ToIntFunction<dme> $$0) {
         this.e = $$0;
         return this;
      }

      public dmd.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dmd.d d() {
         return this.d(0.0F);
      }

      public dmd.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dmd.d e() {
         this.i = true;
         return this;
      }

      public dmd.d f() {
         this.D = true;
         return this;
      }

      public dmd.d g() {
         this.m = ejw.a;
         return this;
      }

      public dmd.d a(czf $$0) {
         this.m = $$0.v();
         return this;
      }

      public dmd.d h() {
         this.p = true;
         return this;
      }

      public dmd.d i() {
         this.q = true;
         return this;
      }

      public dmd.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dmd.d k() {
         this.r = true;
         return this;
      }

      public dmd.d a(ehw $$0) {
         this.t = $$0;
         return this;
      }

      public dmd.d l() {
         this.o = true;
         return this;
      }

      public dmd.d a(dmd.e<bol<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dmd.d a(dmd.f $$0) {
         this.y = $$0;
         return this;
      }

      public dmd.d b(dmd.f $$0) {
         this.z = $$0;
         return this;
      }

      public dmd.d c(dmd.f $$0) {
         this.A = $$0;
         return this;
      }

      public dmd.d d(dmd.f $$0) {
         this.B = $$0;
         return this;
      }

      public dmd.d e(dmd.f $$0) {
         this.C = $$0;
         return this;
      }

      public dmd.d m() {
         this.h = true;
         return this;
      }

      public dmd.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dmd.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dmd.d a(dmd.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  czf $$3 = $$0x.b();
                  long $$4 = awm.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.ax_();
                  float $$6 = $$3.av_();
                  double $$7 = awm.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = awm.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new eov($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  czf $$3 = $$0x.b();
                  long $$4 = awm.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.av_();
                  double $$6 = awm.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = awm.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new eov($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dmd.d n() {
         this.u = false;
         return this;
      }

      public dmd.d a(ckj... $$0) {
         this.E = ckn.e.a($$0);
         return this;
      }

      public dmd.d a(dnf $$0) {
         this.v = $$0;
         return this;
      }

      public dmd.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dme var1, cvk var2, ib var3, A var4);
   }

   public interface f {
      boolean test(dme var1, cvk var2, ib var3);
   }
}
