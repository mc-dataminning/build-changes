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

public abstract class dle implements cjp {
   protected static final ie[] aF = new ie[]{ie.e, ie.f, ie.c, ie.d, ie.a, ie.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dga aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cjs aO;
   protected final dle.d aP;
   @Nullable
   protected aiy aQ;

   public dle(dle.d $$0) {
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

   public dle.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends cyo> a();

   protected static <B extends cyo> RecordCodecBuilder<B, dle.d> u() {
      return dle.d.a.fieldOf("properties").forGetter(dle::t);
   }

   public static <B extends cyo> MapCodec<B> b(Function<dle.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dlf $$0, cvo $$1, hz $$2, int $$3, int $$4) {
   }

   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(aue.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$0;
   }

   protected boolean a(dlf $$0, dlf $$1, ie $$2) {
      return false;
   }

   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      aep.a($$1, $$2);
   }

   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
   }

   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dlf $$0, cvn $$1, hz $$2, cvf $$3, BiConsumer<coz, hz> $$4) {
      if (!$$0.i() && $$3.j() != cvf.a.d) {
         cyo $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof chh;
         if ($$5.a($$3) && $$1 instanceof aov $$7) {
            dit $$8 = $$0.t() ? $$1.c_($$2) : null;
            ejb.a $$9 = new ejb.a($$7).a(elg.f, ens.b($$2)).a(elg.i, coz.h).b(elg.h, $$8).b(elg.a, $$3.g());
            if ($$3.j() == cvf.a.c) {
               $$9.a(elg.j, $$3.a());
            }

            $$0.a($$7, $$2, coz.h, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, cyq.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      return blu.d;
   }

   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      return blw.d;
   }

   protected boolean a(dlf $$0, cvn $$1, hz $$2, int $$3, int $$4) {
      return false;
   }

   protected det b_(dlf $$0) {
      return det.c;
   }

   protected boolean g_(dlf $$0) {
      return false;
   }

   protected boolean f_(dlf $$0) {
      return false;
   }

   protected egp c_(dlf $$0) {
      return egq.a.g();
   }

   protected boolean d_(dlf $$0) {
      return false;
   }

   protected float aw_() {
      return 0.25F;
   }

   protected float ay_() {
      return 0.2F;
   }

   @Override
   public cjs m() {
      return this.aO;
   }

   protected dlf a(dlf $$0, dfa $$1) {
      return $$0;
   }

   protected dlf a(dlf $$0, ddk $$1) {
      return $$0;
   }

   protected boolean a(dlf $$0, crg $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.j()));
   }

   protected boolean a(dlf $$0, ego $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<coz> a(dlf $$0, ejb.a $$1) {
      aiy $$2 = this.v();
      if ($$2 == eit.a) {
         return Collections.emptyList();
      } else {
         ejb $$3 = $$1.a(elg.g, $$0).a(elf.p);
         aov $$4 = $$3.a();
         ejd $$5 = $$4.o().aJ().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dlf $$0, hz $$1) {
      return awh.a($$1);
   }

   protected eol f(dlf $$0, cut $$1, hz $$2) {
      return $$0.j($$1, $$2);
   }

   protected eol b_(dlf $$0, cut $$1, hz $$2) {
      return this.b($$0, $$1, $$2, enx.a());
   }

   protected eol a(dlf $$0, cut $$1, hz $$2) {
      return eoi.a();
   }

   protected int g(dlf $$0, cut $$1, hz $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.O();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bly b(dlf $$0, cvn $$1, hz $$2) {
      return null;
   }

   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return true;
   }

   protected float d(dlf $$0, cut $$1, hz $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return 0;
   }

   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return eoi.b();
   }

   protected eol b(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return this.aG ? $$0.j($$1, $$2) : eoi.a();
   }

   protected boolean c(dlf $$0, cut $$1, hz $$2) {
      return cyo.a($$0.k($$1, $$2));
   }

   protected boolean h(dlf $$0, cut $$1, hz $$2) {
      return cyo.a($$0.c($$1, $$2));
   }

   protected eol c(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
   }

   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
   }

   protected float a(dlf $$0, chh $$1, cut $$2, hz $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dlf $$0, aov $$1, hz $$2, coz $$3, boolean $$4) {
   }

   protected void a(dlf $$0, cvn $$1, hz $$2, chh $$3) {
   }

   protected int a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return 0;
   }

   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
   }

   protected int b(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return 0;
   }

   public final aiy v() {
      if (this.aQ == null) {
         aiy $$0 = kf.e.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   protected void a(cvn $$0, dlf $$1, eno $$2, chz $$3) {
   }

   protected boolean a_(dlf $$0, cut $$1, hz $$2) {
      return !cyo.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean e_(dlf $$0) {
      return this.aI;
   }

   protected dga h_(dlf $$0) {
      return this.aJ;
   }

   public abstract cou j();

   protected abstract cyo q();

   public egt w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dlh<cyo, dlf> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final egu l;
      private final egt m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dle.f q;
      private final dle.f r;
      private final dle.f s;
      private final dle.f t;
      private final dle.f u;
      private final Optional<dle.b> v;
      private final boolean w;
      private final dmg x;
      private final boolean y;
      @Nullable
      protected dle.a.a a;
      private egp z = egq.a.g();
      private boolean A;

      protected a(cyo $$0, ImmutableMap<dmi<?>, Comparable<?>> $$1, MapCodec<dlf> $$2) {
         super($$0, $$1, $$2);
         dle.d $$3 = $$0.aP;
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
            eol $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               enn $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().p()) {
            this.a = new dle.a.a(this.x());
         }

         this.k = this.D();
      }

      public cyo b() {
         return this.e;
      }

      public ij<cyo> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         cyo $$0 = this.b();
         return $$0 != cyq.bs && $$0 != cyq.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cut $$0, hz $$1, bnu<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cut $$0, hz $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(cut $$0, hz $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public eol a(cut $$0, hz $$1, ie $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : eoi.a(this.c($$0, $$1), $$2);
      }

      public eol c(cut $$0, hz $$1) {
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

      public egt d(cut $$0, hz $$1) {
         return this.m;
      }

      public dlf a(dfa $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dlf a(ddk $$0) {
         return this.b().a(this.x(), $$0);
      }

      public det l() {
         return this.b().b_(this.x());
      }

      public boolean e(cut $$0, hz $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cut $$0, hz $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(cut $$0, hz $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cut $$0, hz $$1, ie $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(cvn $$0, hz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cut $$0, hz $$1) {
         return this.n;
      }

      public float a(chh $$0, cut $$1, hz $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cut $$0, hz $$1, ie $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public egu o() {
         return this.l;
      }

      public boolean i(cut $$0, hz $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dlf $$2 = this.x();
            return $$2.p() ? cyo.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dlf $$0, ie $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public eol j(cut $$0, hz $$1) {
         return this.a($$0, $$1, enx.a());
      }

      public eol a(cut $$0, hz $$1, enx $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public eol k(cut $$0, hz $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, enx.a());
      }

      public eol b(cut $$0, hz $$1, enx $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eol l(cut $$0, hz $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public eol c(cut $$0, hz $$1, enx $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public eol m(cut $$0, hz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cut $$0, hz $$1, bno $$2) {
         return this.a($$0, $$1, $$2, ie.b);
      }

      public final boolean a(cut $$0, hz $$1, bno $$2, ie $$3) {
         return cyo.a(this.b($$0, $$1, enx.a($$2)), $$3);
      }

      public ens n(cut $$0, hz $$1) {
         return this.v.<ens>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(ens.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(cvn $$0, hz $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cvn $$0, hz $$1, cyo $$2, hz $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(cvo $$0, hz $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(cvo $$0, hz $$1, int $$2, int $$3) {
         hz.a $$4 = new hz.a();

         for (ie $$5 : dle.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(cvo $$0, hz $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(cvo $$0, hz $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cvn $$0, hz $$1, dlf $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(cvn $$0, hz $$1, dlf $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cvn $$0, hz $$1, cvf $$2, BiConsumer<coz, hz> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(aov $$0, hz $$1, awo $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(aov $$0, hz $$1, awo $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(cvn $$0, hz $$1, bno $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(aov $$0, hz $$1, coz $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<coz> a(ejb.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public blw a(coz $$0, cvn $$1, chh $$2, blt $$3, eno $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public blu a(cvn $$0, chh $$1, eno $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(cvn $$0, hz $$1, chh $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cut $$0, hz $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cut $$0, hz $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dlf a(ie $$0, dlf $$1, cvo $$2, hz $$3, hz $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(cut $$0, hz $$1, ehf $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(crg $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(ego $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(cvq $$0, hz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cut $$0, hz $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bly b(cvn $$0, hz $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(auo<cyo> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(auo<cyo> $$0, Predicate<dle.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(in<cyo> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(ij<cyo> $$0) {
         return this.a($$0.a());
      }

      public Stream<auo<cyo>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof dbg;
      }

      @Nullable
      public <T extends dit> diu<T> a(cvn $$0, div<T> $$1) {
         return this.b() instanceof dbg ? ((dbg)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(cyo $$0) {
         return this.b() == $$0;
      }

      public boolean a(aix<cyo> $$0) {
         return this.b().r().a($$0);
      }

      public egp u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(hz $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dga w() {
         return this.b().h_(this.x());
      }

      public void a(cvn $$0, dlf $$1, eno $$2, chz $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cut $$0, hz $$1, ie $$2) {
         return this.a($$0, $$1, $$2, dgo.a);
      }

      public boolean a(cut $$0, hz $$1, ie $$2, dgo $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cut $$0, hz $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dlf x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dmg A() {
         return this.x;
      }

      static final class a {
         private static final ie[] e = ie.values();
         private static final int f = dgo.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final eol[] i;
         protected final eol b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dlf $$0) {
            cyo $$1 = $$0.b();
            this.a = $$0.i(cvc.a, hz.c);
            this.g = $$1.a_($$0, cvc.a, hz.c);
            this.h = $$1.g($$0, cvc.a, hz.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new eol[e.length];
               eol $$2 = $$1.f($$0, cvc.a, hz.c);

               for (ie $$3 : e) {
                  this.i[$$3.ordinal()] = eoi.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, cvc.a, hz.c, enx.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", kf.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(ie.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ie $$4 : e) {
                  for (dgo $$5 : dgo.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cvc.a, hz.c, $$4);
                  }
               }

               this.d = cyo.a($$0.k(cvc.a, hz.c));
            }
         }

         public boolean a(ie $$0, dgo $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ie $$0, dgo $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      ens evaluate(dlf var1, cut var2, hz var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dle.d> a = Codec.unit(() -> a());
      Function<dlf, egt> b = $$0 -> egt.a;
      boolean c = true;
      dga d = dga.f;
      ToIntFunction<dlf> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      aiy m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      egu t = egu.a;
      boolean u = true;
      dmg v = dmg.a;
      boolean w;
      dle.e<bnu<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ie.b) && $$0.h() < 14;
      dle.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dle.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dle.f A = this.z;
      dle.f B = ($$0, $$1, $$2) -> false;
      dle.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cjs E = cju.g;
      Optional<dle.b> F = Optional.empty();

      private d() {
      }

      public static dle.d a() {
         return new dle.d();
      }

      public static dle.d a(dle $$0) {
         dle.d $$1 = b($$0);
         dle.d $$2 = $$0.aP;
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
      public static dle.d b(dle $$0) {
         dle.d $$1 = new dle.d();
         dle.d $$2 = $$0.aP;
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

      public dle.d a(cnn $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dle.d a(egt $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dle.d a(Function<dlf, egt> $$0) {
         this.b = $$0;
         return this;
      }

      public dle.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dle.d c() {
         this.n = false;
         return this;
      }

      public dle.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dle.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dle.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dle.d a(dga $$0) {
         this.d = $$0;
         return this;
      }

      public dle.d a(ToIntFunction<dlf> $$0) {
         this.e = $$0;
         return this;
      }

      public dle.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dle.d d() {
         return this.d(0.0F);
      }

      public dle.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dle.d e() {
         this.i = true;
         return this;
      }

      public dle.d f() {
         this.D = true;
         return this;
      }

      public dle.d g() {
         this.m = eit.a;
         return this;
      }

      public dle.d a(cyo $$0) {
         this.m = $$0.v();
         return this;
      }

      public dle.d h() {
         this.p = true;
         return this;
      }

      public dle.d i() {
         this.q = true;
         return this;
      }

      public dle.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dle.d k() {
         this.r = true;
         return this;
      }

      public dle.d a(egu $$0) {
         this.t = $$0;
         return this;
      }

      public dle.d l() {
         this.o = true;
         return this;
      }

      public dle.d a(dle.e<bnu<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dle.d a(dle.f $$0) {
         this.y = $$0;
         return this;
      }

      public dle.d b(dle.f $$0) {
         this.z = $$0;
         return this;
      }

      public dle.d c(dle.f $$0) {
         this.A = $$0;
         return this;
      }

      public dle.d d(dle.f $$0) {
         this.B = $$0;
         return this;
      }

      public dle.d e(dle.f $$0) {
         this.C = $$0;
         return this;
      }

      public dle.d m() {
         this.h = true;
         return this;
      }

      public dle.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dle.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dle.d a(dle.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cyo $$3 = $$0x.b();
                  long $$4 = awh.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.ay_();
                  float $$6 = $$3.aw_();
                  double $$7 = awh.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = awh.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new ens($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cyo $$3 = $$0x.b();
                  long $$4 = awh.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.aw_();
                  double $$6 = awh.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = awh.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new ens($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dle.d n() {
         this.u = false;
         return this;
      }

      public dle.d a(cjq... $$0) {
         this.E = cju.e.a($$0);
         return this;
      }

      public dle.d a(dmg $$0) {
         this.v = $$0;
         return this;
      }

      public dle.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dlf var1, cut var2, hz var3, A var4);
   }

   public interface f {
      boolean test(dlf var1, cut var2, hz var3);
   }
}
