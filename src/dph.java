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

public abstract class dph implements cmk {
   protected static final ij[] aF = new ij[]{ij.e, ij.f, ij.c, ij.d, ij.a, ij.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final djt aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cmn aO;
   protected final dph.d aP;
   @Nullable
   protected ajv aQ;

   public dph(dph.d $$0) {
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

   public dph.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dch> a();

   protected static <B extends dch> RecordCodecBuilder<B, dph.d> u() {
      return dph.d.a.fieldOf("properties").forGetter(dph::t);
   }

   public static <B extends dch> MapCodec<B> b(Function<dph.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dpi $$0, czh $$1, id $$2, int $$3, int $$4) {
   }

   protected boolean a(dpi $$0, elq $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(cyv.a, id.c);
         case b:
            return $$0.u().a(avj.a);
         case c:
            return !$$0.r(cyv.a, id.c);
         default:
            return false;
      }
   }

   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$0;
   }

   protected boolean a(dpi $$0, dpi $$1, ij $$2) {
      return false;
   }

   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      afk.a($$1, $$2);
   }

   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
   }

   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dpi $$0, czg $$1, id $$2, cyy $$3, BiConsumer<crs, id> $$4) {
      if (!$$0.i() && $$3.j() != cyy.a.d) {
         dch $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cka;
         if ($$5.a($$3) && $$1 instanceof apu $$7) {
            dmo $$8 = $$0.t() ? $$1.c_($$2) : null;
            enq.a $$9 = new enq.a($$7).a(epx.f, esj.b($$2)).a(epx.i, crs.i).b(epx.h, $$8).b(epx.a, $$3.g());
            if ($$3.j() == cyy.a.c) {
               $$9.a(epx.j, $$3.a());
            }

            $$0.a($$7, $$2, crs.i, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dcj.a.n(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      return bof.d;
   }

   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      return boh.d;
   }

   protected boolean a(dpi $$0, czg $$1, id $$2, int $$3, int $$4) {
      return false;
   }

   protected dim b_(dpi $$0) {
      return dim.c;
   }

   protected boolean g_(dpi $$0) {
      return false;
   }

   protected boolean f_(dpi $$0) {
      return false;
   }

   protected elb c_(dpi $$0) {
      return elc.a.g();
   }

   protected boolean d_(dpi $$0) {
      return false;
   }

   protected float ar_() {
      return 0.25F;
   }

   protected float at_() {
      return 0.2F;
   }

   @Override
   public cmn m() {
      return this.aO;
   }

   protected dpi a(dpi $$0, dit $$1) {
      return $$0;
   }

   protected dpi a(dpi $$0, dhd $$1) {
      return $$0;
   }

   protected boolean a(dpi $$0, cux $$1) {
      return $$0.r() && ($$1.n().d() || !$$1.n().a(this.p()));
   }

   protected boolean a(dpi $$0, ela $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<crs> a(dpi $$0, enq.a $$1) {
      ajv $$2 = this.v();
      if ($$2 == eni.a) {
         return Collections.emptyList();
      } else {
         enq $$3 = $$1.a(epx.g, $$0).a(epw.q);
         apu $$4 = $$3.a();
         ens $$5 = $$4.o().aM().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dpi $$0, id $$1) {
      return axm.a($$1);
   }

   protected etc f(dpi $$0, cym $$1, id $$2) {
      return $$0.j($$1, $$2);
   }

   protected etc b_(dpi $$0, cym $$1, id $$2) {
      return this.b($$0, $$1, $$2, eso.a());
   }

   protected etc a(dpi $$0, cym $$1, id $$2) {
      return esz.a();
   }

   protected int g(dpi $$0, cym $$1, id $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.P();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected boj b(dpi $$0, czg $$1, id $$2) {
      return null;
   }

   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return true;
   }

   protected float d(dpi $$0, cym $$1, id $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dpi $$0, czg $$1, id $$2) {
      return 0;
   }

   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return esz.b();
   }

   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      return this.aG ? $$0.j($$1, $$2) : esz.a();
   }

   protected boolean c(dpi $$0, cym $$1, id $$2) {
      return dch.a($$0.k($$1, $$2));
   }

   protected boolean h(dpi $$0, cym $$1, id $$2) {
      return dch.a($$0.c($$1, $$2));
   }

   protected etc c(dpi $$0, cym $$1, id $$2, eso $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
   }

   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
   }

   protected float a(dpi $$0, cka $$1, cym $$2, id $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dpi $$0, apu $$1, id $$2, crs $$3, boolean $$4) {
   }

   protected void a(dpi $$0, czg $$1, id $$2, cka $$3) {
   }

   protected int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return 0;
   }

   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
   }

   protected int b(dpi $$0, cym $$1, id $$2, ij $$3) {
      return 0;
   }

   public final ajv v() {
      if (this.aQ == null) {
         ajv $$0 = kt.e.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   protected void a(czg $$0, dpi $$1, esf $$2, cks $$3) {
   }

   protected boolean a_(dpi $$0, cym $$1, id $$2) {
      return !dch.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean e_(dpi $$0) {
      return this.aI;
   }

   protected djt h_(dpi $$0) {
      return this.aJ;
   }

   public abstract crn p();

   protected abstract dch q();

   public elf w() {
      return this.aP.b.apply(this.q().n());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dpk<dch, dpi> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final elg l;
      private final elf m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dph.f q;
      private final dph.f r;
      private final dph.f s;
      private final dph.f t;
      private final dph.f u;
      private final Optional<dph.b> v;
      private final boolean w;
      private final dqj x;
      private final boolean y;
      @Nullable
      protected dph.a.a a;
      private elb z = elc.a.g();
      private boolean A;

      protected a(dch $$0, Reference2ObjectArrayMap<dql<?>, Comparable<?>> $$1, MapCodec<dpi> $$2) {
         super($$0, $$1, $$2);
         dph.d $$3 = $$0.aP;
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
            etc $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               ese $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().o()) {
            this.a = new dph.a.a(this.x());
         }

         this.k = this.D();
      }

      public dch b() {
         return this.e;
      }

      public in<dch> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         dch $$0 = this.b();
         return $$0 != dcj.bs && $$0 != dcj.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cym $$0, id $$1, bqg<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cym $$0, id $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(cym $$0, id $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public etc a(cym $$0, id $$1, ij $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : esz.a(this.c($$0, $$1), $$2);
      }

      public etc c(cym $$0, id $$1) {
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

      public elf d(cym $$0, id $$1) {
         return this.m;
      }

      public dpi a(dit $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dpi a(dhd $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dim l() {
         return this.b().b_(this.x());
      }

      public boolean e(cym $$0, id $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cym $$0, id $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(cym $$0, id $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cym $$0, id $$1, ij $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(czg $$0, id $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cym $$0, id $$1) {
         return this.n;
      }

      public float a(cka $$0, cym $$1, id $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cym $$0, id $$1, ij $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public elg o() {
         return this.l;
      }

      public boolean i(cym $$0, id $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dpi $$2 = this.x();
            return $$2.p() ? dch.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dpi $$0, ij $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public etc j(cym $$0, id $$1) {
         return this.a($$0, $$1, eso.a());
      }

      public etc a(cym $$0, id $$1, eso $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public etc k(cym $$0, id $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, eso.a());
      }

      public etc b(cym $$0, id $$1, eso $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public etc l(cym $$0, id $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public etc c(cym $$0, id $$1, eso $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public etc m(cym $$0, id $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cym $$0, id $$1, bqa $$2) {
         return this.a($$0, $$1, $$2, ij.b);
      }

      public final boolean a(cym $$0, id $$1, bqa $$2, ij $$3) {
         return dch.a(this.b($$0, $$1, eso.a($$2)), $$3);
      }

      public esj n(cym $$0, id $$1) {
         return this.v.<esj>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(esj.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(czg $$0, id $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(czg $$0, id $$1, dch $$2, id $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(czh $$0, id $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(czh $$0, id $$1, int $$2, int $$3) {
         id.a $$4 = new id.a();

         for (ij $$5 : dph.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(czh $$0, id $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(czh $$0, id $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(czg $$0, id $$1, dpi $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(czg $$0, id $$1, dpi $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(czg $$0, id $$1, cyy $$2, BiConsumer<crs, id> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(apu $$0, id $$1, axt $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(apu $$0, id $$1, axt $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(czg $$0, id $$1, bqa $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(apu $$0, id $$1, crs $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<crs> a(enq.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boh a(crs $$0, czg $$1, cka $$2, boe $$3, esf $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bof a(czg $$0, cka $$1, esf $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(czg $$0, id $$1, cka $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cym $$0, id $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cym $$0, id $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dpi a(ij $$0, dpi $$1, czh $$2, id $$3, id $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(elq $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cux $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(ela $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(czj $$0, id $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cym $$0, id $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public boj b(czg $$0, id $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(avt<dch> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(avt<dch> $$0, Predicate<dph.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ir<dch> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(in<dch> $$0) {
         return this.a($$0.a());
      }

      public Stream<avt<dch>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof dez;
      }

      @Nullable
      public <T extends dmo> dmp<T> a(czg $$0, dmq<T> $$1) {
         return this.b() instanceof dez ? ((dez)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dch $$0) {
         return this.b() == $$0;
      }

      public boolean a(aju<dch> $$0) {
         return this.b().r().a($$0);
      }

      public elb u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(id $$0) {
         return this.b().a(this.x(), $$0);
      }

      public djt w() {
         return this.b().h_(this.x());
      }

      public void a(czg $$0, dpi $$1, esf $$2, cks $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cym $$0, id $$1, ij $$2) {
         return this.a($$0, $$1, $$2, dkh.a);
      }

      public boolean a(cym $$0, id $$1, ij $$2, dkh $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cym $$0, id $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dpi x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dqj A() {
         return this.x;
      }

      static final class a {
         private static final ij[] e = ij.values();
         private static final int f = dkh.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final etc[] i;
         protected final etc b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dpi $$0) {
            dch $$1 = $$0.b();
            this.a = $$0.i(cyv.a, id.c);
            this.g = $$1.a_($$0, cyv.a, id.c);
            this.h = $$1.g($$0, cyv.a, id.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new etc[e.length];
               etc $$2 = $$1.f($$0, cyv.a, id.c);

               for (ij $$3 : e) {
                  this.i[$$3.ordinal()] = esz.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, cyv.a, id.c, eso.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", kt.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(ij.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ij $$4 : e) {
                  for (dkh $$5 : dkh.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cyv.a, id.c, $$4);
                  }
               }

               this.d = dch.a($$0.k(cyv.a, id.c));
            }
         }

         public boolean a(ij $$0, dkh $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ij $$0, dkh $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      esj evaluate(dpi var1, cym var2, id var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dph.d> a = Codec.unit(() -> a());
      Function<dpi, elf> b = $$0 -> elf.a;
      boolean c = true;
      djt d = djt.f;
      ToIntFunction<dpi> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      ajv m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      elg t = elg.a;
      boolean u = true;
      dqj v = dqj.a;
      boolean w;
      dph.e<bqg<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ij.b) && $$0.h() < 14;
      dph.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dph.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dph.f A = this.z;
      dph.f B = ($$0, $$1, $$2) -> false;
      dph.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cmn E = cmp.g;
      Optional<dph.b> F = Optional.empty();

      private d() {
      }

      public static dph.d a() {
         return new dph.d();
      }

      public static dph.d a(dph $$0) {
         dph.d $$1 = b($$0);
         dph.d $$2 = $$0.aP;
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
      public static dph.d b(dph $$0) {
         dph.d $$1 = new dph.d();
         dph.d $$2 = $$0.aP;
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

      public dph.d a(cql $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dph.d a(elf $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dph.d a(Function<dpi, elf> $$0) {
         this.b = $$0;
         return this;
      }

      public dph.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dph.d c() {
         this.n = false;
         return this;
      }

      public dph.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dph.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dph.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dph.d a(djt $$0) {
         this.d = $$0;
         return this;
      }

      public dph.d a(ToIntFunction<dpi> $$0) {
         this.e = $$0;
         return this;
      }

      public dph.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dph.d d() {
         return this.d(0.0F);
      }

      public dph.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dph.d e() {
         this.i = true;
         return this;
      }

      public dph.d f() {
         this.D = true;
         return this;
      }

      public dph.d g() {
         this.m = eni.a;
         return this;
      }

      public dph.d a(dch $$0) {
         this.m = $$0.v();
         return this;
      }

      public dph.d h() {
         this.p = true;
         return this;
      }

      public dph.d i() {
         this.q = true;
         return this;
      }

      public dph.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dph.d k() {
         this.r = true;
         return this;
      }

      public dph.d a(elg $$0) {
         this.t = $$0;
         return this;
      }

      public dph.d l() {
         this.o = true;
         return this;
      }

      public dph.d a(dph.e<bqg<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dph.d a(dph.f $$0) {
         this.y = $$0;
         return this;
      }

      public dph.d b(dph.f $$0) {
         this.z = $$0;
         return this;
      }

      public dph.d c(dph.f $$0) {
         this.A = $$0;
         return this;
      }

      public dph.d d(dph.f $$0) {
         this.B = $$0;
         return this;
      }

      public dph.d e(dph.f $$0) {
         this.C = $$0;
         return this;
      }

      public dph.d m() {
         this.h = true;
         return this;
      }

      public dph.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dph.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dph.d a(dph.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dch $$3 = $$0x.b();
                  long $$4 = axm.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.at_();
                  float $$6 = $$3.ar_();
                  double $$7 = axm.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = axm.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new esj($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dch $$3 = $$0x.b();
                  long $$4 = axm.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.ar_();
                  double $$6 = axm.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = axm.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new esj($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dph.d n() {
         this.u = false;
         return this;
      }

      public dph.d a(cml... $$0) {
         this.E = cmp.e.a($$0);
         return this;
      }

      public dph.d a(dqj $$0) {
         this.v = $$0;
         return this;
      }

      public dph.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dpi var1, cym var2, id var3, A var4);
   }

   public interface f {
      boolean test(dpi var1, cym var2, id var3);
   }
}
