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

public abstract class dna implements cle {
   protected static final ih[] aF = new ih[]{ih.e, ih.f, ih.c, ih.d, ih.a, ih.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dho aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final clh aO;
   protected final dna.d aP;
   @Nullable
   protected ajh aQ;

   public dna(dna.d $$0) {
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

   public dna.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dac> a();

   protected static <B extends dac> RecordCodecBuilder<B, dna.d> u() {
      return dna.d.a.fieldOf("properties").forGetter(dna::t);
   }

   public static <B extends dac> MapCodec<B> b(Function<dna.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dnb $$0, cxc $$1, ib $$2, int $$3, int $$4) {
   }

   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
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

   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$0;
   }

   protected boolean a(dnb $$0, dnb $$1, ih $$2) {
      return false;
   }

   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      aew.a($$1, $$2);
   }

   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
   }

   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dnb $$0, cxb $$1, ib $$2, cwt $$3, BiConsumer<cqm, ib> $$4) {
      if (!$$0.i() && $$3.j() != cwt.a.d) {
         dac $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof ciu;
         if ($$5.a($$3) && $$1 instanceof apf $$7) {
            dki $$8 = $$0.t() ? $$1.c_($$2) : null;
            elc.a $$9 = new elc.a($$7).a(enh.f, ept.b($$2)).a(enh.i, cqm.h).b(enh.h, $$8).b(enh.a, $$3.g());
            if ($$3.j() == cwt.a.c) {
               $$9.a(enh.j, $$3.a());
            }

            $$0.a($$7, $$2, cqm.h, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dae.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      return bnd.d;
   }

   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      return bnf.d;
   }

   protected boolean a(dnb $$0, cxb $$1, ib $$2, int $$3, int $$4) {
      return false;
   }

   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   protected boolean g_(dnb $$0) {
      return false;
   }

   protected boolean f_(dnb $$0) {
      return false;
   }

   protected eip c_(dnb $$0) {
      return eiq.a.g();
   }

   protected boolean d_(dnb $$0) {
      return false;
   }

   protected float au_() {
      return 0.25F;
   }

   protected float aw_() {
      return 0.2F;
   }

   @Override
   public clh m() {
      return this.aO;
   }

   protected dnb a(dnb $$0, dgo $$1) {
      return $$0;
   }

   protected dnb a(dnb $$0, dey $$1) {
      return $$0;
   }

   protected boolean a(dnb $$0, csu $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.l()));
   }

   protected boolean a(dnb $$0, eio $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cqm> a(dnb $$0, elc.a $$1) {
      ajh $$2 = this.v();
      if ($$2 == eku.a) {
         return Collections.emptyList();
      } else {
         elc $$3 = $$1.a(enh.g, $$0).a(eng.q);
         apf $$4 = $$3.a();
         ele $$5 = $$4.o().aM().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dnb $$0, ib $$1) {
      return aww.a($$1);
   }

   protected eqm f(dnb $$0, cwh $$1, ib $$2) {
      return $$0.j($$1, $$2);
   }

   protected eqm b_(dnb $$0, cwh $$1, ib $$2) {
      return this.b($$0, $$1, $$2, epy.a());
   }

   protected eqm a(dnb $$0, cwh $$1, ib $$2) {
      return eqj.a();
   }

   protected int g(dnb $$0, cwh $$1, ib $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.O();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bnh b(dnb $$0, cxb $$1, ib $$2) {
      return null;
   }

   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return true;
   }

   protected float d(dnb $$0, cwh $$1, ib $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return 0;
   }

   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return eqj.b();
   }

   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return this.aG ? $$0.j($$1, $$2) : eqj.a();
   }

   protected boolean c(dnb $$0, cwh $$1, ib $$2) {
      return dac.a($$0.k($$1, $$2));
   }

   protected boolean h(dnb $$0, cwh $$1, ib $$2) {
      return dac.a($$0.c($$1, $$2));
   }

   protected eqm c(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
   }

   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
   }

   protected float a(dnb $$0, ciu $$1, cwh $$2, ib $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dnb $$0, apf $$1, ib $$2, cqm $$3, boolean $$4) {
   }

   protected void a(dnb $$0, cxb $$1, ib $$2, ciu $$3) {
   }

   protected int a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return 0;
   }

   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
   }

   protected int b(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return 0;
   }

   public final ajh v() {
      if (this.aQ == null) {
         ajh $$0 = ki.e.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   protected void a(cxb $$0, dnb $$1, epp $$2, cjm $$3) {
   }

   protected boolean a_(dnb $$0, cwh $$1, ib $$2) {
      return !dac.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean e_(dnb $$0) {
      return this.aI;
   }

   protected dho h_(dnb $$0) {
      return this.aJ;
   }

   public abstract cqh l();

   protected abstract dac q();

   public eit w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dnd<dac, dnb> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eiu l;
      private final eit m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dna.f q;
      private final dna.f r;
      private final dna.f s;
      private final dna.f t;
      private final dna.f u;
      private final Optional<dna.b> v;
      private final boolean w;
      private final doc x;
      private final boolean y;
      @Nullable
      protected dna.a.a a;
      private eip z = eiq.a.g();
      private boolean A;

      protected a(dac $$0, Reference2ObjectArrayMap<doe<?>, Comparable<?>> $$1, MapCodec<dnb> $$2) {
         super($$0, $$1, $$2);
         dna.d $$3 = $$0.aP;
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
            eqm $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               epo $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().p()) {
            this.a = new dna.a.a(this.x());
         }

         this.k = this.D();
      }

      public dac b() {
         return this.e;
      }

      public il<dac> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         dac $$0 = this.b();
         return $$0 != dae.bs && $$0 != dae.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cwh $$0, ib $$1, bpd<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cwh $$0, ib $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(cwh $$0, ib $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public eqm a(cwh $$0, ib $$1, ih $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : eqj.a(this.c($$0, $$1), $$2);
      }

      public eqm c(cwh $$0, ib $$1) {
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

      public eit d(cwh $$0, ib $$1) {
         return this.m;
      }

      public dnb a(dgo $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dnb a(dey $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dgh l() {
         return this.b().b_(this.x());
      }

      public boolean e(cwh $$0, ib $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cwh $$0, ib $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(cwh $$0, ib $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cwh $$0, ib $$1, ih $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(cxb $$0, ib $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cwh $$0, ib $$1) {
         return this.n;
      }

      public float a(ciu $$0, cwh $$1, ib $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cwh $$0, ib $$1, ih $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eiu o() {
         return this.l;
      }

      public boolean i(cwh $$0, ib $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dnb $$2 = this.x();
            return $$2.p() ? dac.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dnb $$0, ih $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public eqm j(cwh $$0, ib $$1) {
         return this.a($$0, $$1, epy.a());
      }

      public eqm a(cwh $$0, ib $$1, epy $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public eqm k(cwh $$0, ib $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, epy.a());
      }

      public eqm b(cwh $$0, ib $$1, epy $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eqm l(cwh $$0, ib $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public eqm c(cwh $$0, ib $$1, epy $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public eqm m(cwh $$0, ib $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cwh $$0, ib $$1, box $$2) {
         return this.a($$0, $$1, $$2, ih.b);
      }

      public final boolean a(cwh $$0, ib $$1, box $$2, ih $$3) {
         return dac.a(this.b($$0, $$1, epy.a($$2)), $$3);
      }

      public ept n(cwh $$0, ib $$1) {
         return this.v.<ept>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(ept.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(cxb $$0, ib $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cxb $$0, ib $$1, dac $$2, ib $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(cxc $$0, ib $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(cxc $$0, ib $$1, int $$2, int $$3) {
         ib.a $$4 = new ib.a();

         for (ih $$5 : dna.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(cxc $$0, ib $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(cxc $$0, ib $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cxb $$0, ib $$1, dnb $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(cxb $$0, ib $$1, dnb $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cxb $$0, ib $$1, cwt $$2, BiConsumer<cqm, ib> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(apf $$0, ib $$1, axd $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(apf $$0, ib $$1, axd $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(cxb $$0, ib $$1, box $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(apf $$0, ib $$1, cqm $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cqm> a(elc.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bnf a(cqm $$0, cxb $$1, ciu $$2, bnc $$3, epp $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bnd a(cxb $$0, ciu $$1, epp $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(cxb $$0, ib $$1, ciu $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cwh $$0, ib $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cwh $$0, ib $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dnb a(ih $$0, dnb $$1, cxc $$2, ib $$3, ib $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(cwh $$0, ib $$1, eje $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(csu $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(eio $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(cxe $$0, ib $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cwh $$0, ib $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bnh b(cxb $$0, ib $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(avd<dac> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(avd<dac> $$0, Predicate<dna.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ip<dac> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(il<dac> $$0) {
         return this.a($$0.a());
      }

      public Stream<avd<dac>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof dcu;
      }

      @Nullable
      public <T extends dki> dkj<T> a(cxb $$0, dkk<T> $$1) {
         return this.b() instanceof dcu ? ((dcu)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dac $$0) {
         return this.b() == $$0;
      }

      public boolean a(ajg<dac> $$0) {
         return this.b().r().a($$0);
      }

      public eip u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(ib $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dho w() {
         return this.b().h_(this.x());
      }

      public void a(cxb $$0, dnb $$1, epp $$2, cjm $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cwh $$0, ib $$1, ih $$2) {
         return this.a($$0, $$1, $$2, dic.a);
      }

      public boolean a(cwh $$0, ib $$1, ih $$2, dic $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cwh $$0, ib $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dnb x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public doc A() {
         return this.x;
      }

      static final class a {
         private static final ih[] e = ih.values();
         private static final int f = dic.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final eqm[] i;
         protected final eqm b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dnb $$0) {
            dac $$1 = $$0.b();
            this.a = $$0.i(cwq.a, ib.c);
            this.g = $$1.a_($$0, cwq.a, ib.c);
            this.h = $$1.g($$0, cwq.a, ib.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new eqm[e.length];
               eqm $$2 = $$1.f($$0, cwq.a, ib.c);

               for (ih $$3 : e) {
                  this.i[$$3.ordinal()] = eqj.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, cwq.a, ib.c, epy.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", ki.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(ih.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ih $$4 : e) {
                  for (dic $$5 : dic.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cwq.a, ib.c, $$4);
                  }
               }

               this.d = dac.a($$0.k(cwq.a, ib.c));
            }
         }

         public boolean a(ih $$0, dic $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ih $$0, dic $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      ept evaluate(dnb var1, cwh var2, ib var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dna.d> a = Codec.unit(() -> a());
      Function<dnb, eit> b = $$0 -> eit.a;
      boolean c = true;
      dho d = dho.f;
      ToIntFunction<dnb> e = $$0 -> 0;
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
      eiu t = eiu.a;
      boolean u = true;
      doc v = doc.a;
      boolean w;
      dna.e<bpd<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ih.b) && $$0.h() < 14;
      dna.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dna.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dna.f A = this.z;
      dna.f B = ($$0, $$1, $$2) -> false;
      dna.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      clh E = clj.g;
      Optional<dna.b> F = Optional.empty();

      private d() {
      }

      public static dna.d a() {
         return new dna.d();
      }

      public static dna.d a(dna $$0) {
         dna.d $$1 = b($$0);
         dna.d $$2 = $$0.aP;
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
      public static dna.d b(dna $$0) {
         dna.d $$1 = new dna.d();
         dna.d $$2 = $$0.aP;
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

      public dna.d a(cpd $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dna.d a(eit $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dna.d a(Function<dnb, eit> $$0) {
         this.b = $$0;
         return this;
      }

      public dna.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dna.d c() {
         this.n = false;
         return this;
      }

      public dna.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dna.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dna.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dna.d a(dho $$0) {
         this.d = $$0;
         return this;
      }

      public dna.d a(ToIntFunction<dnb> $$0) {
         this.e = $$0;
         return this;
      }

      public dna.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dna.d d() {
         return this.d(0.0F);
      }

      public dna.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dna.d e() {
         this.i = true;
         return this;
      }

      public dna.d f() {
         this.D = true;
         return this;
      }

      public dna.d g() {
         this.m = eku.a;
         return this;
      }

      public dna.d a(dac $$0) {
         this.m = $$0.v();
         return this;
      }

      public dna.d h() {
         this.p = true;
         return this;
      }

      public dna.d i() {
         this.q = true;
         return this;
      }

      public dna.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dna.d k() {
         this.r = true;
         return this;
      }

      public dna.d a(eiu $$0) {
         this.t = $$0;
         return this;
      }

      public dna.d l() {
         this.o = true;
         return this;
      }

      public dna.d a(dna.e<bpd<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dna.d a(dna.f $$0) {
         this.y = $$0;
         return this;
      }

      public dna.d b(dna.f $$0) {
         this.z = $$0;
         return this;
      }

      public dna.d c(dna.f $$0) {
         this.A = $$0;
         return this;
      }

      public dna.d d(dna.f $$0) {
         this.B = $$0;
         return this;
      }

      public dna.d e(dna.f $$0) {
         this.C = $$0;
         return this;
      }

      public dna.d m() {
         this.h = true;
         return this;
      }

      public dna.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dna.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dna.d a(dna.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dac $$3 = $$0x.b();
                  long $$4 = aww.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.aw_();
                  float $$6 = $$3.au_();
                  double $$7 = aww.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = aww.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new ept($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dac $$3 = $$0x.b();
                  long $$4 = aww.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.au_();
                  double $$6 = aww.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = aww.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new ept($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dna.d n() {
         this.u = false;
         return this;
      }

      public dna.d a(clf... $$0) {
         this.E = clj.e.a($$0);
         return this;
      }

      public dna.d a(doc $$0) {
         this.v = $$0;
         return this;
      }

      public dna.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dnb var1, cwh var2, ib var3, A var4);
   }

   public interface f {
      boolean test(dnb var1, cwh var2, ib var3);
   }
}
