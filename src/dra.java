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

public abstract class dra implements cog {
   protected static final it[] aF = new it[]{it.e, it.f, it.c, it.d, it.a, it.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dll aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final coj aO;
   protected final dra.d aP;
   @Nullable
   protected akl<epk> aQ;

   public dra(dra.d $$0) {
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

   public dra.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends ddy> a();

   protected static <B extends ddy> RecordCodecBuilder<B, dra.d> u() {
      return dra.d.a.fieldOf("properties").forGetter(dra::t);
   }

   public static <B extends ddy> MapCodec<B> b(Function<dra.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(drb $$0, day $$1, io $$2, int $$3, int $$4) {
   }

   protected boolean a(drb $$0, enj $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(dam.a, io.c);
         case b:
            return $$0.u().a(awb.a);
         case c:
            return !$$0.r(dam.a, io.c);
         default:
            return false;
      }
   }

   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$0;
   }

   protected boolean a(drb $$0, drb $$1, it $$2) {
      return false;
   }

   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      aga.a($$1, $$2);
   }

   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
   }

   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(drb $$0, dax $$1, io $$2, dap $$3, BiConsumer<cto, io> $$4) {
      if (!$$0.i() && $$3.j() != dap.a.d) {
         ddy $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof clw;
         if ($$5.a($$3) && $$1 instanceof aqm $$7) {
            dog $$8 = $$0.t() ? $$1.c_($$2) : null;
            epi.a $$9 = new epi.a($$7).a(erx.f, euk.b($$2)).a(erx.i, cto.i).b(erx.h, $$8).b(erx.a, $$3.g());
            if ($$3.j() == dap.a.c) {
               $$9.a(erx.j, $$3.a());
            }

            $$0.a($$7, $$2, cto.i, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dea.a.n(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      return bpu.d;
   }

   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      return bpw.d;
   }

   protected boolean a(drb $$0, dax $$1, io $$2, int $$3, int $$4) {
      return false;
   }

   protected dke a_(drb $$0) {
      return dke.c;
   }

   protected boolean f_(drb $$0) {
      return false;
   }

   protected boolean e_(drb $$0) {
      return false;
   }

   protected emu b_(drb $$0) {
      return emv.a.g();
   }

   protected boolean c_(drb $$0) {
      return false;
   }

   protected float ar_() {
      return 0.25F;
   }

   protected float at_() {
      return 0.2F;
   }

   @Override
   public coj i() {
      return this.aO;
   }

   protected drb a(drb $$0, dkl $$1) {
      return $$0;
   }

   protected drb a(drb $$0, div $$1) {
      return $$0;
   }

   protected boolean a(drb $$0, cwz $$1) {
      return $$0.r() && ($$1.n().e() || !$$1.n().a(this.q()));
   }

   protected boolean a(drb $$0, emt $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cto> a(drb $$0, epi.a $$1) {
      akl<epk> $$2 = this.v();
      if ($$2 == epd.a) {
         return Collections.emptyList();
      } else {
         epi $$3 = $$1.a(erx.g, $$0).a(erw.r);
         aqm $$4 = $$3.a();
         epk $$5 = $$4.o().be().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(drb $$0, io $$1) {
      return ayd.a($$1);
   }

   protected evd f(drb $$0, dad $$1, io $$2) {
      return $$0.j($$1, $$2);
   }

   protected evd b_(drb $$0, dad $$1, io $$2) {
      return this.b($$0, $$1, $$2, eup.a());
   }

   protected evd a(drb $$0, dad $$1, io $$2) {
      return eva.a();
   }

   protected int g(drb $$0, dad $$1, io $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.P();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bpy b(drb $$0, dax $$1, io $$2) {
      return null;
   }

   protected boolean a(drb $$0, dba $$1, io $$2) {
      return true;
   }

   protected float d(drb $$0, dad $$1, io $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(drb $$0, dax $$1, io $$2) {
      return 0;
   }

   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return eva.b();
   }

   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      return this.aG ? $$0.j($$1, $$2) : eva.a();
   }

   protected boolean c(drb $$0, dad $$1, io $$2) {
      return ddy.a($$0.k($$1, $$2));
   }

   protected boolean h(drb $$0, dad $$1, io $$2) {
      return ddy.a($$0.c($$1, $$2));
   }

   protected evd c(drb $$0, dad $$1, io $$2, eup $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
   }

   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
   }

   protected float a(drb $$0, clw $$1, dad $$2, io $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(drb $$0, aqm $$1, io $$2, cto $$3, boolean $$4) {
   }

   protected void a(drb $$0, dax $$1, io $$2, clw $$3) {
   }

   protected int a(drb $$0, dad $$1, io $$2, it $$3) {
      return 0;
   }

   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
   }

   protected int b(drb $$0, dad $$1, io $$2, it $$3) {
      return 0;
   }

   public final akl<epk> v() {
      if (this.aQ == null) {
         akm $$0 = le.e.b(this.p());
         this.aQ = akl.a(lf.aU, $$0.d("blocks/"));
      }

      return this.aQ;
   }

   protected void a(dax $$0, drb $$1, eug $$2, cmo $$3) {
   }

   protected boolean a_(drb $$0, dad $$1, io $$2) {
      return !ddy.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean d_(drb $$0) {
      return this.aI;
   }

   protected dll g_(drb $$0) {
      return this.aJ;
   }

   public abstract ctj q();

   protected abstract ddy p();

   public emy w() {
      return this.aP.b.apply(this.p().n());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends drd<ddy, drb> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final emz l;
      private final emy m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dra.f q;
      private final dra.f r;
      private final dra.f s;
      private final dra.f t;
      private final dra.f u;
      private final Optional<dra.b> v;
      private final boolean w;
      private final dsc x;
      private final boolean y;
      @Nullable
      protected dra.a.a a;
      private emu z = emv.a.g();
      private boolean A;

      protected a(ddy $$0, Reference2ObjectArrayMap<dse<?>, Comparable<?>> $$1, MapCodec<drb> $$2) {
         super($$0, $$1, $$2);
         dra.d $$3 = $$0.aP;
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
            evd $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               euf $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.b_(this.x());
         this.A = this.e.d_(this.x());
         if (!this.b().o()) {
            this.a = new dra.a.a(this.x());
         }

         this.k = this.D();
      }

      public ddy b() {
         return this.e;
      }

      public ix<ddy> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         ddy $$0 = this.b();
         return $$0 != dea.bs && $$0 != dea.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(dad $$0, io $$1, bsa<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(dad $$0, io $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(dad $$0, io $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public evd a(dad $$0, io $$1, it $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : eva.a(this.c($$0, $$1), $$2);
      }

      public evd c(dad $$0, io $$1) {
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

      public emy d(dad $$0, io $$1) {
         return this.m;
      }

      public drb a(dkl $$0) {
         return this.b().a(this.x(), $$0);
      }

      public drb a(div $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dke l() {
         return this.b().a_(this.x());
      }

      public boolean e(dad $$0, io $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(dad $$0, io $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(dad $$0, io $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().e_(this.x());
      }

      public int b(dad $$0, io $$1, it $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().c_(this.x());
      }

      public int a(dax $$0, io $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(dad $$0, io $$1) {
         return this.n;
      }

      public float a(clw $$0, dad $$1, io $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(dad $$0, io $$1, it $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public emz o() {
         return this.l;
      }

      public boolean i(dad $$0, io $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            drb $$2 = this.x();
            return $$2.p() ? ddy.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(drb $$0, it $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public evd j(dad $$0, io $$1) {
         return this.a($$0, $$1, eup.a());
      }

      public evd a(dad $$0, io $$1, eup $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public evd k(dad $$0, io $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, eup.a());
      }

      public evd b(dad $$0, io $$1, eup $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public evd l(dad $$0, io $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public evd c(dad $$0, io $$1, eup $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public evd m(dad $$0, io $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(dad $$0, io $$1, bru $$2) {
         return this.a($$0, $$1, $$2, it.b);
      }

      public final boolean a(dad $$0, io $$1, bru $$2, it $$3) {
         return ddy.a(this.b($$0, $$1, eup.a($$2)), $$3);
      }

      public euk n(dad $$0, io $$1) {
         return this.v.<euk>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(euk.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(dax $$0, io $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dax $$0, io $$1, ddy $$2, io $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(day $$0, io $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(day $$0, io $$1, int $$2, int $$3) {
         io.a $$4 = new io.a();

         for (it $$5 : dra.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(day $$0, io $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(day $$0, io $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dax $$0, io $$1, drb $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(dax $$0, io $$1, drb $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dax $$0, io $$1, dap $$2, BiConsumer<cto, io> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(aqm $$0, io $$1, ayk $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(aqm $$0, io $$1, ayk $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(dax $$0, io $$1, bru $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(aqm $$0, io $$1, cto $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cto> a(epi.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bpw a(cto $$0, dax $$1, clw $$2, bpt $$3, eug $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bpu a(dax $$0, clw $$1, eug $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(dax $$0, io $$1, clw $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(dad $$0, io $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(dad $$0, io $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public drb a(it $$0, drb $$1, day $$2, io $$3, io $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(enj $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cwz $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(emt $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(dba $$0, io $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(dad $$0, io $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bpy b(dax $$0, io $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(awl<ddy> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(awl<ddy> $$0, Predicate<dra.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jb<ddy> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(ix<ddy> $$0) {
         return this.a($$0.a());
      }

      public Stream<awl<ddy>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof dgq;
      }

      @Nullable
      public <T extends dog> doh<T> a(dax $$0, doi<T> $$1) {
         return this.b() instanceof dgq ? ((dgq)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(ddy $$0) {
         return this.b() == $$0;
      }

      public boolean a(akl<ddy> $$0) {
         return this.b().r().a($$0);
      }

      public emu u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(io $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dll w() {
         return this.b().g_(this.x());
      }

      public void a(dax $$0, drb $$1, eug $$2, cmo $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(dad $$0, io $$1, it $$2) {
         return this.a($$0, $$1, $$2, dlz.a);
      }

      public boolean a(dad $$0, io $$1, it $$2, dlz $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(dad $$0, io $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract drb x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dsc A() {
         return this.x;
      }

      static final class a {
         private static final it[] e = it.values();
         private static final int f = dlz.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final evd[] i;
         protected final evd b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(drb $$0) {
            ddy $$1 = $$0.b();
            this.a = $$0.i(dam.a, io.c);
            this.g = $$1.a_($$0, dam.a, io.c);
            this.h = $$1.g($$0, dam.a, io.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new evd[e.length];
               evd $$2 = $$1.f($$0, dam.a, io.c);

               for (it $$3 : e) {
                  this.i[$$3.ordinal()] = eva.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, dam.a, io.c, eup.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", le.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(it.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (it $$4 : e) {
                  for (dlz $$5 : dlz.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, dam.a, io.c, $$4);
                  }
               }

               this.d = ddy.a($$0.k(dam.a, io.c));
            }
         }

         public boolean a(it $$0, dlz $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(it $$0, dlz $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      euk evaluate(drb var1, dad var2, io var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dra.d> a = Codec.unit(() -> a());
      Function<drb, emy> b = $$0 -> emy.a;
      boolean c = true;
      dll d = dll.f;
      ToIntFunction<drb> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      akl<epk> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      emz t = emz.a;
      boolean u = true;
      dsc v = dsc.a;
      boolean w;
      dra.e<bsa<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, it.b) && $$0.h() < 14;
      dra.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dra.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dra.f A = this.z;
      dra.f B = ($$0, $$1, $$2) -> false;
      dra.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      coj E = col.g;
      Optional<dra.b> F = Optional.empty();

      private d() {
      }

      public static dra.d a() {
         return new dra.d();
      }

      public static dra.d a(dra $$0) {
         dra.d $$1 = b($$0);
         dra.d $$2 = $$0.aP;
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
      public static dra.d b(dra $$0) {
         dra.d $$1 = new dra.d();
         dra.d $$2 = $$0.aP;
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

      public dra.d a(csh $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dra.d a(emy $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dra.d a(Function<drb, emy> $$0) {
         this.b = $$0;
         return this;
      }

      public dra.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dra.d c() {
         this.n = false;
         return this;
      }

      public dra.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dra.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dra.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dra.d a(dll $$0) {
         this.d = $$0;
         return this;
      }

      public dra.d a(ToIntFunction<drb> $$0) {
         this.e = $$0;
         return this;
      }

      public dra.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dra.d d() {
         return this.d(0.0F);
      }

      public dra.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dra.d e() {
         this.i = true;
         return this;
      }

      public dra.d f() {
         this.D = true;
         return this;
      }

      public dra.d g() {
         this.m = epd.a;
         return this;
      }

      public dra.d a(ddy $$0) {
         this.m = $$0.v();
         return this;
      }

      public dra.d h() {
         this.p = true;
         return this;
      }

      public dra.d i() {
         this.q = true;
         return this;
      }

      public dra.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dra.d k() {
         this.r = true;
         return this;
      }

      public dra.d a(emz $$0) {
         this.t = $$0;
         return this;
      }

      public dra.d l() {
         this.o = true;
         return this;
      }

      public dra.d a(dra.e<bsa<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dra.d a(dra.f $$0) {
         this.y = $$0;
         return this;
      }

      public dra.d b(dra.f $$0) {
         this.z = $$0;
         return this;
      }

      public dra.d c(dra.f $$0) {
         this.A = $$0;
         return this;
      }

      public dra.d d(dra.f $$0) {
         this.B = $$0;
         return this;
      }

      public dra.d e(dra.f $$0) {
         this.C = $$0;
         return this;
      }

      public dra.d m() {
         this.h = true;
         return this;
      }

      public dra.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dra.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dra.d a(dra.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  ddy $$3 = $$0x.b();
                  long $$4 = ayd.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.at_();
                  float $$6 = $$3.ar_();
                  double $$7 = ayd.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = ayd.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new euk($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  ddy $$3 = $$0x.b();
                  long $$4 = ayd.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.ar_();
                  double $$6 = ayd.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = ayd.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new euk($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dra.d n() {
         this.u = false;
         return this;
      }

      public dra.d a(coh... $$0) {
         this.E = col.e.a($$0);
         return this;
      }

      public dra.d a(dsc $$0) {
         this.v = $$0;
         return this;
      }

      public dra.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(drb var1, dad var2, io var3, A var4);
   }

   public interface f {
      boolean test(drb var1, dad var2, io var3);
   }
}
