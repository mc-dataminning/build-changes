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

public abstract class dmy implements clc {
   protected static final ih[] aF = new ih[]{ih.e, ih.f, ih.c, ih.d, ih.a, ih.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dhm aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final clf aO;
   protected final dmy.d aP;
   @Nullable
   protected ajh aQ;

   public dmy(dmy.d $$0) {
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

   public dmy.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends daa> a();

   protected static <B extends daa> RecordCodecBuilder<B, dmy.d> u() {
      return dmy.d.a.fieldOf("properties").forGetter(dmy::t);
   }

   public static <B extends daa> MapCodec<B> b(Function<dmy.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dmz $$0, cxa $$1, ib $$2, int $$3, int $$4) {
   }

   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(aus.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$0;
   }

   protected boolean a(dmz $$0, dmz $$1, ih $$2) {
      return false;
   }

   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      aew.a($$1, $$2);
   }

   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
   }

   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dmz $$0, cwz $$1, ib $$2, cwr $$3, BiConsumer<cqk, ib> $$4) {
      if (!$$0.i() && $$3.j() != cwr.a.d) {
         daa $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cis;
         if ($$5.a($$3) && $$1 instanceof apf $$7) {
            dkg $$8 = $$0.t() ? $$1.c_($$2) : null;
            ela.a $$9 = new ela.a($$7).a(enf.f, epr.b($$2)).a(enf.i, cqk.h).b(enf.h, $$8).b(enf.a, $$3.g());
            if ($$3.j() == cwr.a.c) {
               $$9.a(enf.j, $$3.a());
            }

            $$0.a($$7, $$2, cqk.h, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dac.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      return bnc.d;
   }

   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      return bne.d;
   }

   protected boolean a(dmz $$0, cwz $$1, ib $$2, int $$3, int $$4) {
      return false;
   }

   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   protected boolean g_(dmz $$0) {
      return false;
   }

   protected boolean f_(dmz $$0) {
      return false;
   }

   protected ein c_(dmz $$0) {
      return eio.a.g();
   }

   protected boolean d_(dmz $$0) {
      return false;
   }

   protected float au_() {
      return 0.25F;
   }

   protected float aw_() {
      return 0.2F;
   }

   @Override
   public clf m() {
      return this.aO;
   }

   protected dmz a(dmz $$0, dgm $$1) {
      return $$0;
   }

   protected dmz a(dmz $$0, dew $$1) {
      return $$0;
   }

   protected boolean a(dmz $$0, css $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.l()));
   }

   protected boolean a(dmz $$0, eim $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cqk> a(dmz $$0, ela.a $$1) {
      ajh $$2 = this.v();
      if ($$2 == eks.a) {
         return Collections.emptyList();
      } else {
         ela $$3 = $$1.a(enf.g, $$0).a(ene.q);
         apf $$4 = $$3.a();
         elc $$5 = $$4.o().aM().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dmz $$0, ib $$1) {
      return aww.a($$1);
   }

   protected eqk f(dmz $$0, cwf $$1, ib $$2) {
      return $$0.j($$1, $$2);
   }

   protected eqk b_(dmz $$0, cwf $$1, ib $$2) {
      return this.b($$0, $$1, $$2, epw.a());
   }

   protected eqk a(dmz $$0, cwf $$1, ib $$2) {
      return eqh.a();
   }

   protected int g(dmz $$0, cwf $$1, ib $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.O();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bng b(dmz $$0, cwz $$1, ib $$2) {
      return null;
   }

   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return true;
   }

   protected float d(dmz $$0, cwf $$1, ib $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return 0;
   }

   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return eqh.b();
   }

   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return this.aG ? $$0.j($$1, $$2) : eqh.a();
   }

   protected boolean c(dmz $$0, cwf $$1, ib $$2) {
      return daa.a($$0.k($$1, $$2));
   }

   protected boolean h(dmz $$0, cwf $$1, ib $$2) {
      return daa.a($$0.c($$1, $$2));
   }

   protected eqk c(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
   }

   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
   }

   protected float a(dmz $$0, cis $$1, cwf $$2, ib $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dmz $$0, apf $$1, ib $$2, cqk $$3, boolean $$4) {
   }

   protected void a(dmz $$0, cwz $$1, ib $$2, cis $$3) {
   }

   protected int a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return 0;
   }

   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
   }

   protected int b(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return 0;
   }

   public final ajh v() {
      if (this.aQ == null) {
         ajh $$0 = ki.e.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   protected void a(cwz $$0, dmz $$1, epn $$2, cjk $$3) {
   }

   protected boolean a_(dmz $$0, cwf $$1, ib $$2) {
      return !daa.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean e_(dmz $$0) {
      return this.aI;
   }

   protected dhm h_(dmz $$0) {
      return this.aJ;
   }

   public abstract cqf l();

   protected abstract daa q();

   public eir w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dnb<daa, dmz> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eis l;
      private final eir m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dmy.f q;
      private final dmy.f r;
      private final dmy.f s;
      private final dmy.f t;
      private final dmy.f u;
      private final Optional<dmy.b> v;
      private final boolean w;
      private final doa x;
      private final boolean y;
      @Nullable
      protected dmy.a.a a;
      private ein z = eio.a.g();
      private boolean A;

      protected a(daa $$0, Reference2ObjectArrayMap<doc<?>, Comparable<?>> $$1, MapCodec<dmz> $$2) {
         super($$0, $$1, $$2);
         dmy.d $$3 = $$0.aP;
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
            eqk $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               epm $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().p()) {
            this.a = new dmy.a.a(this.x());
         }

         this.k = this.D();
      }

      public daa b() {
         return this.e;
      }

      public il<daa> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         daa $$0 = this.b();
         return $$0 != dac.bs && $$0 != dac.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cwf $$0, ib $$1, bpc<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cwf $$0, ib $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(cwf $$0, ib $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public eqk a(cwf $$0, ib $$1, ih $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : eqh.a(this.c($$0, $$1), $$2);
      }

      public eqk c(cwf $$0, ib $$1) {
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

      public eir d(cwf $$0, ib $$1) {
         return this.m;
      }

      public dmz a(dgm $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dmz a(dew $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dgf l() {
         return this.b().b_(this.x());
      }

      public boolean e(cwf $$0, ib $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cwf $$0, ib $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(cwf $$0, ib $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cwf $$0, ib $$1, ih $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(cwz $$0, ib $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cwf $$0, ib $$1) {
         return this.n;
      }

      public float a(cis $$0, cwf $$1, ib $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cwf $$0, ib $$1, ih $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eis o() {
         return this.l;
      }

      public boolean i(cwf $$0, ib $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dmz $$2 = this.x();
            return $$2.p() ? daa.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dmz $$0, ih $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public eqk j(cwf $$0, ib $$1) {
         return this.a($$0, $$1, epw.a());
      }

      public eqk a(cwf $$0, ib $$1, epw $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public eqk k(cwf $$0, ib $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, epw.a());
      }

      public eqk b(cwf $$0, ib $$1, epw $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eqk l(cwf $$0, ib $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public eqk c(cwf $$0, ib $$1, epw $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public eqk m(cwf $$0, ib $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cwf $$0, ib $$1, bow $$2) {
         return this.a($$0, $$1, $$2, ih.b);
      }

      public final boolean a(cwf $$0, ib $$1, bow $$2, ih $$3) {
         return daa.a(this.b($$0, $$1, epw.a($$2)), $$3);
      }

      public epr n(cwf $$0, ib $$1) {
         return this.v.<epr>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(epr.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(cwz $$0, ib $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cwz $$0, ib $$1, daa $$2, ib $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(cxa $$0, ib $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(cxa $$0, ib $$1, int $$2, int $$3) {
         ib.a $$4 = new ib.a();

         for (ih $$5 : dmy.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(cxa $$0, ib $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(cxa $$0, ib $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cwz $$0, ib $$1, dmz $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(cwz $$0, ib $$1, dmz $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cwz $$0, ib $$1, cwr $$2, BiConsumer<cqk, ib> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(apf $$0, ib $$1, axd $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(apf $$0, ib $$1, axd $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(cwz $$0, ib $$1, bow $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(apf $$0, ib $$1, cqk $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cqk> a(ela.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bne a(cqk $$0, cwz $$1, cis $$2, bnb $$3, epn $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bnc a(cwz $$0, cis $$1, epn $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(cwz $$0, ib $$1, cis $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cwf $$0, ib $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cwf $$0, ib $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dmz a(ih $$0, dmz $$1, cxa $$2, ib $$3, ib $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(cwf $$0, ib $$1, ejd $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(css $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(eim $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(cxc $$0, ib $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cwf $$0, ib $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bng b(cwz $$0, ib $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(avd<daa> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(avd<daa> $$0, Predicate<dmy.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ip<daa> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(il<daa> $$0) {
         return this.a($$0.a());
      }

      public Stream<avd<daa>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof dcs;
      }

      @Nullable
      public <T extends dkg> dkh<T> a(cwz $$0, dki<T> $$1) {
         return this.b() instanceof dcs ? ((dcs)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(daa $$0) {
         return this.b() == $$0;
      }

      public boolean a(ajg<daa> $$0) {
         return this.b().r().a($$0);
      }

      public ein u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(ib $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dhm w() {
         return this.b().h_(this.x());
      }

      public void a(cwz $$0, dmz $$1, epn $$2, cjk $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cwf $$0, ib $$1, ih $$2) {
         return this.a($$0, $$1, $$2, dia.a);
      }

      public boolean a(cwf $$0, ib $$1, ih $$2, dia $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cwf $$0, ib $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dmz x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public doa A() {
         return this.x;
      }

      static final class a {
         private static final ih[] e = ih.values();
         private static final int f = dia.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final eqk[] i;
         protected final eqk b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dmz $$0) {
            daa $$1 = $$0.b();
            this.a = $$0.i(cwo.a, ib.c);
            this.g = $$1.a_($$0, cwo.a, ib.c);
            this.h = $$1.g($$0, cwo.a, ib.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new eqk[e.length];
               eqk $$2 = $$1.f($$0, cwo.a, ib.c);

               for (ih $$3 : e) {
                  this.i[$$3.ordinal()] = eqh.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, cwo.a, ib.c, epw.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", ki.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(ih.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ih $$4 : e) {
                  for (dia $$5 : dia.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cwo.a, ib.c, $$4);
                  }
               }

               this.d = daa.a($$0.k(cwo.a, ib.c));
            }
         }

         public boolean a(ih $$0, dia $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ih $$0, dia $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      epr evaluate(dmz var1, cwf var2, ib var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dmy.d> a = Codec.unit(() -> a());
      Function<dmz, eir> b = $$0 -> eir.a;
      boolean c = true;
      dhm d = dhm.f;
      ToIntFunction<dmz> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      ajh m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      eis t = eis.a;
      boolean u = true;
      doa v = doa.a;
      boolean w;
      dmy.e<bpc<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ih.b) && $$0.h() < 14;
      dmy.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dmy.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dmy.f A = this.z;
      dmy.f B = ($$0, $$1, $$2) -> false;
      dmy.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      clf E = clh.g;
      Optional<dmy.b> F = Optional.empty();

      private d() {
      }

      public static dmy.d a() {
         return new dmy.d();
      }

      public static dmy.d a(dmy $$0) {
         dmy.d $$1 = b($$0);
         dmy.d $$2 = $$0.aP;
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
      public static dmy.d b(dmy $$0) {
         dmy.d $$1 = new dmy.d();
         dmy.d $$2 = $$0.aP;
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

      public dmy.d a(cpb $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dmy.d a(eir $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dmy.d a(Function<dmz, eir> $$0) {
         this.b = $$0;
         return this;
      }

      public dmy.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dmy.d c() {
         this.n = false;
         return this;
      }

      public dmy.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dmy.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dmy.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dmy.d a(dhm $$0) {
         this.d = $$0;
         return this;
      }

      public dmy.d a(ToIntFunction<dmz> $$0) {
         this.e = $$0;
         return this;
      }

      public dmy.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dmy.d d() {
         return this.d(0.0F);
      }

      public dmy.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dmy.d e() {
         this.i = true;
         return this;
      }

      public dmy.d f() {
         this.D = true;
         return this;
      }

      public dmy.d g() {
         this.m = eks.a;
         return this;
      }

      public dmy.d a(daa $$0) {
         this.m = $$0.v();
         return this;
      }

      public dmy.d h() {
         this.p = true;
         return this;
      }

      public dmy.d i() {
         this.q = true;
         return this;
      }

      public dmy.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dmy.d k() {
         this.r = true;
         return this;
      }

      public dmy.d a(eis $$0) {
         this.t = $$0;
         return this;
      }

      public dmy.d l() {
         this.o = true;
         return this;
      }

      public dmy.d a(dmy.e<bpc<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dmy.d a(dmy.f $$0) {
         this.y = $$0;
         return this;
      }

      public dmy.d b(dmy.f $$0) {
         this.z = $$0;
         return this;
      }

      public dmy.d c(dmy.f $$0) {
         this.A = $$0;
         return this;
      }

      public dmy.d d(dmy.f $$0) {
         this.B = $$0;
         return this;
      }

      public dmy.d e(dmy.f $$0) {
         this.C = $$0;
         return this;
      }

      public dmy.d m() {
         this.h = true;
         return this;
      }

      public dmy.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dmy.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dmy.d a(dmy.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  daa $$3 = $$0x.b();
                  long $$4 = aww.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.aw_();
                  float $$6 = $$3.au_();
                  double $$7 = aww.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = aww.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new epr($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  daa $$3 = $$0x.b();
                  long $$4 = aww.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.au_();
                  double $$6 = aww.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = aww.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new epr($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dmy.d n() {
         this.u = false;
         return this;
      }

      public dmy.d a(cld... $$0) {
         this.E = clh.e.a($$0);
         return this;
      }

      public dmy.d a(doa $$0) {
         this.v = $$0;
         return this;
      }

      public dmy.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dmz var1, cwf var2, ib var3, A var4);
   }

   public interface f {
      boolean test(dmz var1, cwf var2, ib var3);
   }
}
