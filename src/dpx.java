import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
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

public abstract class dpx implements cmv {
   protected static final ir[] aF = new ir[]{ir.e, ir.f, ir.c, ir.d, ir.a, ir.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dki aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cmy aO;
   protected final dpx.d aP;
   @Nullable
   protected akf aQ;

   public dpx(dpx.d $$0) {
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

   public dpx.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dcv> a();

   protected static <B extends dcv> RecordCodecBuilder<B, dpx.d> u() {
      return dpx.d.a.fieldOf("properties").forGetter(dpx::t);
   }

   public static <B extends dcv> MapCodec<B> b(Function<dpx.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dpy $$0, czv $$1, im $$2, int $$3, int $$4) {
   }

   protected boolean a(dpy $$0, emg $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(czj.a, im.c);
         case b:
            return $$0.u().a(avt.a);
         case c:
            return !$$0.r(czj.a, im.c);
         default:
            return false;
      }
   }

   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$0;
   }

   protected boolean a(dpy $$0, dpy $$1, ir $$2) {
      return false;
   }

   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      afu.a($$1, $$2);
   }

   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
   }

   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dpy $$0, czu $$1, im $$2, czm $$3, BiConsumer<csd, im> $$4) {
      if (!$$0.i() && $$3.j() != czm.a.d) {
         dcv $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof ckl;
         if ($$5.a($$3) && $$1 instanceof aqe $$7) {
            dnd $$8 = $$0.t() ? $$1.c_($$2) : null;
            eog.a $$9 = new eog.a($$7).a(eqt.f, etf.b($$2)).a(eqt.i, csd.i).b(eqt.h, $$8).b(eqt.a, $$3.g());
            if ($$3.j() == czm.a.c) {
               $$9.a(eqt.j, $$3.a());
            }

            $$0.a($$7, $$2, csd.i, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dcx.a.n(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      return boq.d;
   }

   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      return bos.d;
   }

   protected boolean a(dpy $$0, czu $$1, im $$2, int $$3, int $$4) {
      return false;
   }

   protected djb b_(dpy $$0) {
      return djb.c;
   }

   protected boolean g_(dpy $$0) {
      return false;
   }

   protected boolean f_(dpy $$0) {
      return false;
   }

   protected elr c_(dpy $$0) {
      return els.a.g();
   }

   protected boolean d_(dpy $$0) {
      return false;
   }

   protected float ar_() {
      return 0.25F;
   }

   protected float at_() {
      return 0.2F;
   }

   @Override
   public cmy m() {
      return this.aO;
   }

   protected dpy a(dpy $$0, dji $$1) {
      return $$0;
   }

   protected dpy a(dpy $$0, dhs $$1) {
      return $$0;
   }

   protected boolean a(dpy $$0, cvl $$1) {
      return $$0.r() && ($$1.n().d() || !$$1.n().a(this.p()));
   }

   protected boolean a(dpy $$0, elq $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<csd> a(dpy $$0, eog.a $$1) {
      akf $$2 = this.v();
      if ($$2 == eny.a) {
         return Collections.emptyList();
      } else {
         eog $$3 = $$1.a(eqt.g, $$0).a(eqs.q);
         aqe $$4 = $$3.a();
         eoi $$5 = $$4.o().aM().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dpy $$0, im $$1) {
      return axw.a($$1);
   }

   protected ety f(dpy $$0, cza $$1, im $$2) {
      return $$0.j($$1, $$2);
   }

   protected ety b_(dpy $$0, cza $$1, im $$2) {
      return this.b($$0, $$1, $$2, etk.a());
   }

   protected ety a(dpy $$0, cza $$1, im $$2) {
      return etv.a();
   }

   protected int g(dpy $$0, cza $$1, im $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.P();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bou b(dpy $$0, czu $$1, im $$2) {
      return null;
   }

   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return true;
   }

   protected float d(dpy $$0, cza $$1, im $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dpy $$0, czu $$1, im $$2) {
      return 0;
   }

   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return etv.b();
   }

   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      return this.aG ? $$0.j($$1, $$2) : etv.a();
   }

   protected boolean c(dpy $$0, cza $$1, im $$2) {
      return dcv.a($$0.k($$1, $$2));
   }

   protected boolean h(dpy $$0, cza $$1, im $$2) {
      return dcv.a($$0.c($$1, $$2));
   }

   protected ety c(dpy $$0, cza $$1, im $$2, etk $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
   }

   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
   }

   protected float a(dpy $$0, ckl $$1, cza $$2, im $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dpy $$0, aqe $$1, im $$2, csd $$3, boolean $$4) {
   }

   protected void a(dpy $$0, czu $$1, im $$2, ckl $$3) {
   }

   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return 0;
   }

   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
   }

   protected int b(dpy $$0, cza $$1, im $$2, ir $$3) {
      return 0;
   }

   public final akf v() {
      if (this.aQ == null) {
         akf $$0 = lc.e.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   protected void a(czu $$0, dpy $$1, etb $$2, cld $$3) {
   }

   protected boolean a_(dpy $$0, cza $$1, im $$2) {
      return !dcv.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean e_(dpy $$0) {
      return this.aI;
   }

   protected dki h_(dpy $$0) {
      return this.aJ;
   }

   public abstract cry p();

   protected abstract dcv q();

   public elv w() {
      return this.aP.b.apply(this.q().n());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dqa<dcv, dpy> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final elw l;
      private final elv m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dpx.f q;
      private final dpx.f r;
      private final dpx.f s;
      private final dpx.f t;
      private final dpx.f u;
      private final Optional<dpx.b> v;
      private final boolean w;
      private final dqz x;
      private final boolean y;
      @Nullable
      protected dpx.a.a a;
      private elr z = els.a.g();
      private boolean A;

      protected a(dcv $$0, Reference2ObjectArrayMap<drb<?>, Comparable<?>> $$1, MapCodec<dpy> $$2) {
         super($$0, $$1, $$2);
         dpx.d $$3 = $$0.aP;
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
            ety $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               eta $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().o()) {
            this.a = new dpx.a.a(this.x());
         }

         this.k = this.D();
      }

      public dcv b() {
         return this.e;
      }

      public iv<dcv> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         dcv $$0 = this.b();
         return $$0 != dcx.bs && $$0 != dcx.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cza $$0, im $$1, bqr<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cza $$0, im $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(cza $$0, im $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public ety a(cza $$0, im $$1, ir $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : etv.a(this.c($$0, $$1), $$2);
      }

      public ety c(cza $$0, im $$1) {
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

      public elv d(cza $$0, im $$1) {
         return this.m;
      }

      public dpy a(dji $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dpy a(dhs $$0) {
         return this.b().a(this.x(), $$0);
      }

      public djb l() {
         return this.b().b_(this.x());
      }

      public boolean e(cza $$0, im $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cza $$0, im $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(cza $$0, im $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cza $$0, im $$1, ir $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(czu $$0, im $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cza $$0, im $$1) {
         return this.n;
      }

      public float a(ckl $$0, cza $$1, im $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cza $$0, im $$1, ir $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public elw o() {
         return this.l;
      }

      public boolean i(cza $$0, im $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dpy $$2 = this.x();
            return $$2.p() ? dcv.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dpy $$0, ir $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public ety j(cza $$0, im $$1) {
         return this.a($$0, $$1, etk.a());
      }

      public ety a(cza $$0, im $$1, etk $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public ety k(cza $$0, im $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, etk.a());
      }

      public ety b(cza $$0, im $$1, etk $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ety l(cza $$0, im $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public ety c(cza $$0, im $$1, etk $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public ety m(cza $$0, im $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cza $$0, im $$1, bql $$2) {
         return this.a($$0, $$1, $$2, ir.b);
      }

      public final boolean a(cza $$0, im $$1, bql $$2, ir $$3) {
         return dcv.a(this.b($$0, $$1, etk.a($$2)), $$3);
      }

      public etf n(cza $$0, im $$1) {
         return this.v.<etf>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(etf.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(czu $$0, im $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(czu $$0, im $$1, dcv $$2, im $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(czv $$0, im $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(czv $$0, im $$1, int $$2, int $$3) {
         im.a $$4 = new im.a();

         for (ir $$5 : dpx.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(czv $$0, im $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(czv $$0, im $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(czu $$0, im $$1, dpy $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(czu $$0, im $$1, dpy $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(czu $$0, im $$1, czm $$2, BiConsumer<csd, im> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(aqe $$0, im $$1, ayd $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(aqe $$0, im $$1, ayd $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(czu $$0, im $$1, bql $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(aqe $$0, im $$1, csd $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<csd> a(eog.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bos a(csd $$0, czu $$1, ckl $$2, bop $$3, etb $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public boq a(czu $$0, ckl $$1, etb $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(czu $$0, im $$1, ckl $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cza $$0, im $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cza $$0, im $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dpy a(ir $$0, dpy $$1, czv $$2, im $$3, im $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(emg $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cvl $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(elq $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(czx $$0, im $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cza $$0, im $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bou b(czu $$0, im $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(awd<dcv> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(awd<dcv> $$0, Predicate<dpx.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(iz<dcv> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(iv<dcv> $$0) {
         return this.a($$0.a());
      }

      public Stream<awd<dcv>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof dfn;
      }

      @Nullable
      public <T extends dnd> dne<T> a(czu $$0, dnf<T> $$1) {
         return this.b() instanceof dfn ? ((dfn)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dcv $$0) {
         return this.b() == $$0;
      }

      public boolean a(ake<dcv> $$0) {
         return this.b().r().a($$0);
      }

      public elr u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(im $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dki w() {
         return this.b().h_(this.x());
      }

      public void a(czu $$0, dpy $$1, etb $$2, cld $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cza $$0, im $$1, ir $$2) {
         return this.a($$0, $$1, $$2, dkw.a);
      }

      public boolean a(cza $$0, im $$1, ir $$2, dkw $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cza $$0, im $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dpy x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dqz A() {
         return this.x;
      }

      static final class a {
         private static final ir[] e = ir.values();
         private static final int f = dkw.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final ety[] i;
         protected final ety b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dpy $$0) {
            dcv $$1 = $$0.b();
            this.a = $$0.i(czj.a, im.c);
            this.g = $$1.a_($$0, czj.a, im.c);
            this.h = $$1.g($$0, czj.a, im.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new ety[e.length];
               ety $$2 = $$1.f($$0, czj.a, im.c);

               for (ir $$3 : e) {
                  this.i[$$3.ordinal()] = etv.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, czj.a, im.c, etk.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lc.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(ir.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ir $$4 : e) {
                  for (dkw $$5 : dkw.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, czj.a, im.c, $$4);
                  }
               }

               this.d = dcv.a($$0.k(czj.a, im.c));
            }
         }

         public boolean a(ir $$0, dkw $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ir $$0, dkw $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      etf evaluate(dpy var1, cza var2, im var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dpx.d> a = Codec.unit(() -> a());
      Function<dpy, elv> b = $$0 -> elv.a;
      boolean c = true;
      dki d = dki.f;
      ToIntFunction<dpy> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      akf m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      elw t = elw.a;
      boolean u = true;
      dqz v = dqz.a;
      boolean w;
      dpx.e<bqr<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ir.b) && $$0.h() < 14;
      dpx.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dpx.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dpx.f A = this.z;
      dpx.f B = ($$0, $$1, $$2) -> false;
      dpx.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cmy E = cna.g;
      Optional<dpx.b> F = Optional.empty();

      private d() {
      }

      public static dpx.d a() {
         return new dpx.d();
      }

      public static dpx.d a(dpx $$0) {
         dpx.d $$1 = b($$0);
         dpx.d $$2 = $$0.aP;
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
      public static dpx.d b(dpx $$0) {
         dpx.d $$1 = new dpx.d();
         dpx.d $$2 = $$0.aP;
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

      public dpx.d a(cqw $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dpx.d a(elv $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dpx.d a(Function<dpy, elv> $$0) {
         this.b = $$0;
         return this;
      }

      public dpx.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dpx.d c() {
         this.n = false;
         return this;
      }

      public dpx.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dpx.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dpx.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dpx.d a(dki $$0) {
         this.d = $$0;
         return this;
      }

      public dpx.d a(ToIntFunction<dpy> $$0) {
         this.e = $$0;
         return this;
      }

      public dpx.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dpx.d d() {
         return this.d(0.0F);
      }

      public dpx.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dpx.d e() {
         this.i = true;
         return this;
      }

      public dpx.d f() {
         this.D = true;
         return this;
      }

      public dpx.d g() {
         this.m = eny.a;
         return this;
      }

      public dpx.d a(dcv $$0) {
         this.m = $$0.v();
         return this;
      }

      public dpx.d h() {
         this.p = true;
         return this;
      }

      public dpx.d i() {
         this.q = true;
         return this;
      }

      public dpx.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dpx.d k() {
         this.r = true;
         return this;
      }

      public dpx.d a(elw $$0) {
         this.t = $$0;
         return this;
      }

      public dpx.d l() {
         this.o = true;
         return this;
      }

      public dpx.d a(dpx.e<bqr<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dpx.d a(dpx.f $$0) {
         this.y = $$0;
         return this;
      }

      public dpx.d b(dpx.f $$0) {
         this.z = $$0;
         return this;
      }

      public dpx.d c(dpx.f $$0) {
         this.A = $$0;
         return this;
      }

      public dpx.d d(dpx.f $$0) {
         this.B = $$0;
         return this;
      }

      public dpx.d e(dpx.f $$0) {
         this.C = $$0;
         return this;
      }

      public dpx.d m() {
         this.h = true;
         return this;
      }

      public dpx.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dpx.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dpx.d a(dpx.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dcv $$3 = $$0x.b();
                  long $$4 = axw.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.at_();
                  float $$6 = $$3.ar_();
                  double $$7 = axw.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = axw.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new etf($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dcv $$3 = $$0x.b();
                  long $$4 = axw.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.ar_();
                  double $$6 = axw.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = axw.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new etf($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dpx.d n() {
         this.u = false;
         return this;
      }

      public dpx.d a(cmw... $$0) {
         this.E = cna.e.a($$0);
         return this;
      }

      public dpx.d a(dqz $$0) {
         this.v = $$0;
         return this;
      }

      public dpx.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dpy var1, cza var2, im var3, A var4);
   }

   public interface f {
      boolean test(dpy var1, cza var2, im var3);
   }
}
