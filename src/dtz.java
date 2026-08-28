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

public abstract class dtz implements cqe {
   protected static final jj[] aF = new jj[]{jj.e, jj.f, jj.c, jj.d, jj.a, jj.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final doj aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cqh aO;
   protected final dtz.d aP;
   @Nullable
   protected ala<esy> aQ;

   public dtz(dtz.d $$0) {
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

   public dtz.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dgv> a();

   protected static <B extends dgv> RecordCodecBuilder<B, dtz.d> u() {
      return dtz.d.a.fieldOf("properties").forGetter(dtz::t);
   }

   public static <B extends dgv> MapCodec<B> b(Function<dtz.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dua $$0, ddt $$1, je $$2, int $$3, int $$4) {
   }

   protected boolean a(dua $$0, eqq $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(ddh.a, je.c);
         case b:
            return $$0.y().a(awy.a);
         case c:
            return !$$0.m(ddh.a, je.c);
         default:
            return false;
      }
   }

   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$0;
   }

   protected boolean b(dua $$0, dua $$1, jj $$2) {
      return false;
   }

   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
   }

   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
   }

   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if ($$0.x() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dua $$0, arg $$1, je $$2, ddk $$3, BiConsumer<cvl, je> $$4) {
      if (!$$0.l() && $$3.a() != ddk.a.d) {
         dgv $$5 = $$0.b();
         boolean $$6 = $$3.b() instanceof cnp;
         if ($$5.a($$3)) {
            dre $$7 = $$0.x() ? $$1.c_($$2) : null;
            esw.a $$8 = new esw.a($$1).a(evp.f, eye.b($$2)).a(evp.i, cvl.k).b(evp.h, $$7).b(evp.a, $$3.c());
            if ($$3.a() == ddk.a.c) {
               $$8.a(evp.j, $$3.d());
            }

            $$0.a($$1, $$2, cvl.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dgx.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      return brk.e;
   }

   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      return brk.f;
   }

   protected boolean a(dua $$0, dds $$1, je $$2, int $$3, int $$4) {
      return false;
   }

   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   protected boolean g_(dua $$0) {
      return false;
   }

   protected boolean f_(dua $$0) {
      return false;
   }

   protected eqb b_(dua $$0) {
      return eqc.a.g();
   }

   protected boolean c_(dua $$0) {
      return false;
   }

   protected float au_() {
      return 0.25F;
   }

   protected float aw_() {
      return 0.2F;
   }

   @Override
   public cqh i() {
      return this.aO;
   }

   protected dua a(dua $$0, dnj $$1) {
      return $$0;
   }

   protected dua a(dua $$0, dls $$1) {
      return $$0;
   }

   protected boolean a(dua $$0, cyw $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.r()));
   }

   protected boolean a(dua $$0, eqa $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cvl> a(dua $$0, esw.a $$1) {
      ala<esy> $$2 = this.v();
      if ($$2 == esp.a) {
         return Collections.emptyList();
      } else {
         esw $$3 = $$1.a(evp.g, $$0).a(evo.r);
         arg $$4 = $$3.a();
         esy $$5 = $$4.o().bd().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dua $$0, je $$1) {
      return azc.a($$1);
   }

   protected eyx d_(dua $$0) {
      return $$0.f(ddh.a, je.c);
   }

   protected eyx b_(dua $$0, dcx $$1, je $$2) {
      return this.b($$0, $$1, $$2, eyj.a());
   }

   protected eyx a(dua $$0, dcx $$1, je $$2) {
      return eyu.a();
   }

   protected int i_(dua $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected brm b(dua $$0, dds $$1, je $$2) {
      return null;
   }

   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return true;
   }

   protected float c(dua $$0, dcx $$1, je $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dua $$0, dds $$1, je $$2) {
      return 0;
   }

   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return eyu.b();
   }

   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return this.aG ? $$0.f($$1, $$2) : eyu.a();
   }

   protected boolean a_(dua $$0, dcx $$1, je $$2) {
      return dgv.a($$0.g($$1, $$2));
   }

   protected eyx c(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
   }

   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
   }

   protected float a(dua $$0, cnp $$1, dcx $$2, je $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dua $$0, arg $$1, je $$2, cvl $$3, boolean $$4) {
   }

   protected void a_(dua $$0, dds $$1, je $$2, cnp $$3) {
   }

   protected int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      return 0;
   }

   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
   }

   protected int b(dua $$0, dcx $$1, je $$2, jj $$3) {
      return 0;
   }

   public final ala<esy> v() {
      if (this.aQ == null) {
         alb $$0 = lu.e.b(this.q());
         this.aQ = ala.a(lv.bc, $$0.f("blocks/"));
      }

      return this.aQ;
   }

   protected void a(dds $$0, dua $$1, eya $$2, coi $$3) {
   }

   protected boolean e_(dua $$0) {
      return !dgv.a($$0.f(ddh.a, je.c)) && $$0.y().c();
   }

   protected boolean f(dua $$0) {
      return this.aI;
   }

   protected doj h_(dua $$0) {
      return this.aJ;
   }

   public abstract cvg r();

   protected abstract dgv q();

   public eqf w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends duc<dgv, dua> {
      private static final jj[] a = jj.values();
      private static final eyx[] f = ad.a(new eyx[a.length], $$0 -> Arrays.fill($$0, eyu.a()));
      private static final eyx[] g = ad.a(new eyx[a.length], $$0 -> Arrays.fill($$0, eyu.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final eqg n;
      private final eqf o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dtz.f s;
      private final dtz.f t;
      private final dtz.f u;
      private final dtz.f v;
      private final dtz.f w;
      @Nullable
      private final dtz.b x;
      private final boolean y;
      private final dvb z;
      private final boolean A;
      @Nullable
      private dtz.a.a B;
      private eqb C = eqc.a.g();
      private boolean D;
      private boolean E;
      private eyx F;
      private eyx[] G;
      private boolean H;
      private int I;

      protected a(dgv $$0, Reference2ObjectArrayMap<dvd<?>, Comparable<?>> $$1, MapCodec<dua> $$2) {
         super($$0, $$1, $$2);
         dtz.d $$3 = $$0.aP;
         this.h = $$3.e.applyAsInt(this.B());
         this.i = $$0.g_(this.B());
         this.j = $$3.o;
         this.k = $$3.p;
         this.l = $$3.q;
         this.n = $$3.t;
         this.o = $$3.b.apply(this.B());
         this.p = $$3.g;
         this.q = $$3.h;
         this.r = $$3.n;
         this.s = $$3.y;
         this.t = $$3.z;
         this.u = $$3.A;
         this.v = $$3.B;
         this.w = $$3.C;
         this.x = $$3.F;
         this.y = $$3.u;
         this.z = $$3.v;
         this.A = $$3.w;
      }

      private boolean H() {
         if (this.d.aP.s) {
            return true;
         } else if (this.d.aP.r) {
            return false;
         } else if (this.B == null) {
            return false;
         } else {
            eyx $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               exz $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().p()) {
            this.B = new dtz.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : eyu.a();
         this.E = dgv.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new eyx[a.length];

            for (jj $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dgv b() {
         return this.d;
      }

      public jn<dgv> c() {
         return this.d.s();
      }

      @Deprecated
      public boolean d() {
         dgv $$0 = this.b();
         return $$0 != dgx.bs && $$0 != dgx.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dcx $$0, je $$1, btq<?> $$2) {
         return this.b().aP.x.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public eyx a(jj $$0) {
         return this.G[$$0.ordinal()];
      }

      public eyx h() {
         return this.F;
      }

      public boolean i() {
         return this.B == null || this.B.b;
      }

      public boolean j() {
         return this.i;
      }

      public int k() {
         return this.h;
      }

      public boolean l() {
         return this.j;
      }

      public boolean m() {
         return this.k;
      }

      @Deprecated
      public boolean n() {
         return this.l;
      }

      public eqf a(dcx $$0, je $$1) {
         return this.o;
      }

      public dua a(dnj $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dua a(dls $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dnc o() {
         return this.b().a_(this.B());
      }

      public boolean b(dcx $$0, je $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dcx $$0, je $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dcx $$0, je $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dcx $$0, je $$1, jj $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dds $$0, je $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dcx $$0, je $$1) {
         return this.p;
      }

      public float a(cnp $$0, dcx $$1, je $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dcx $$0, je $$1, jj $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public eqg r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dua $$0, jj $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public eyx f(dcx $$0, je $$1) {
         return this.a($$0, $$1, eyj.a());
      }

      public eyx a(dcx $$0, je $$1, eyj $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public eyx g(dcx $$0, je $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, eyj.a());
      }

      public eyx b(dcx $$0, je $$1, eyj $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public eyx h(dcx $$0, je $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public eyx c(dcx $$0, je $$1, eyj $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public eyx i(dcx $$0, je $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(dcx $$0, je $$1, btj $$2) {
         return this.a($$0, $$1, $$2, jj.b);
      }

      public final boolean a(dcx $$0, je $$1, btj $$2, jj $$3) {
         return dgv.a(this.b($$0, $$1, eyj.a($$2)), $$3);
      }

      public eye a(je $$0) {
         dtz.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : eye.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dds $$0, je $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dds $$0, je $$1, dgv $$2, @Nullable erj $$3, boolean $$4) {
         agn.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(ddt $$0, je $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(ddt $$0, je $$1, int $$2, int $$3) {
         je.a $$4 = new je.a();

         for (jj $$5 : dtz.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.B(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(ddt $$0, je $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(ddt $$0, je $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dds $$0, je $$1, dua $$2, boolean $$3) {
         this.b().b(this.B(), $$0, $$1, $$2, $$3);
      }

      public void b(dds $$0, je $$1, dua $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arg $$0, je $$1, ddk $$2, BiConsumer<cvl, je> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arg $$0, je $$1, azk $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(arg $$0, je $$1, azk $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dds $$0, je $$1, btj $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(arg $$0, je $$1, cvl $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cvl> a(esw.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public brk a(cvl $$0, dds $$1, cnp $$2, brj $$3, eya $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public brk a(dds $$0, cnp $$1, eya $$2) {
         return this.b().a(this.B(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(dds $$0, je $$1, cnp $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dcx $$0, je $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dcx $$0, je $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dua a(jj $$0, dua $$1, ddt $$2, je $$3, je $$4) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(eqq $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(cyw $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(eqa $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(ddv $$0, je $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dcx $$0, je $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public brm b(dds $$0, je $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axi<dgv> $$0) {
         return this.b().s().a($$0);
      }

      public boolean a(axi<dgv> $$0, Predicate<dtz.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jr<dgv> $$0) {
         return $$0.a(this.b().s());
      }

      public boolean a(jn<dgv> $$0) {
         return this.a($$0.a());
      }

      public Stream<axi<dgv>> w() {
         return this.b().s().c();
      }

      public boolean x() {
         return this.b() instanceof djn;
      }

      @Nullable
      public <T extends dre> drf<T> a(dds $$0, drg<T> $$1) {
         return this.b() instanceof djn ? ((djn)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dgv $$0) {
         return this.b() == $$0;
      }

      public boolean a(ala<dgv> $$0) {
         return this.b().s().a($$0);
      }

      public eqb y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(je $$0) {
         return this.b().a(this.B(), $$0);
      }

      public doj A() {
         return this.b().h_(this.B());
      }

      public void a(dds $$0, dua $$1, eya $$2, coi $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dcx $$0, je $$1, jj $$2) {
         return this.a($$0, $$1, $$2, dox.a);
      }

      public boolean a(dcx $$0, je $$1, jj $$2, dox $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dcx $$0, je $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      protected abstract dua B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dvb E() {
         return this.z;
      }

      static final class a {
         private static final jj[] d = jj.values();
         private static final int e = dox.values().length;
         protected final eyx a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dua $$0) {
            dgv $$1 = $$0.b();
            this.a = $$1.b($$0, ddh.a, je.c, eyj.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lu.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jj.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jj $$2 : d) {
                  for (dox $$3 : dox.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, ddh.a, je.c, $$2);
                  }
               }

               this.c = dgv.a($$0.g(ddh.a, je.c));
            }
         }

         public boolean a(jj $$0, dox $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jj $$0, dox $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   public interface b {
      eye evaluate(dua var1, je var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dtz.d> a = Codec.unit(() -> a());
      Function<dua, eqf> b = $$0 -> eqf.a;
      boolean c = true;
      doj d = doj.f;
      ToIntFunction<dua> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      ala<esy> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      eqg t = eqg.a;
      boolean u = true;
      dvb v = dvb.a;
      boolean w;
      dtz.e<btq<?>> x = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jj.b) && $$0.k() < 14;
      dtz.f y = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dtz.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dtz.f A = this.z;
      dtz.f B = ($$0, $$1, $$2) -> false;
      dtz.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cqh E = cqj.h;
      @Nullable
      dtz.b F;

      private d() {
      }

      public static dtz.d a() {
         return new dtz.d();
      }

      public static dtz.d a(dtz $$0) {
         dtz.d $$1 = b($$0);
         dtz.d $$2 = $$0.aP;
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
      public static dtz.d b(dtz $$0) {
         dtz.d $$1 = new dtz.d();
         dtz.d $$2 = $$0.aP;
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

      public dtz.d a(cue $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dtz.d a(eqf $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dtz.d a(Function<dua, eqf> $$0) {
         this.b = $$0;
         return this;
      }

      public dtz.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dtz.d c() {
         this.n = false;
         return this;
      }

      public dtz.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dtz.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dtz.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dtz.d a(doj $$0) {
         this.d = $$0;
         return this;
      }

      public dtz.d a(ToIntFunction<dua> $$0) {
         this.e = $$0;
         return this;
      }

      public dtz.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dtz.d d() {
         return this.d(0.0F);
      }

      public dtz.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dtz.d e() {
         this.i = true;
         return this;
      }

      public dtz.d f() {
         this.D = true;
         return this;
      }

      public dtz.d g() {
         this.m = esp.a;
         return this;
      }

      public dtz.d a(dgv $$0) {
         this.m = $$0.v();
         return this;
      }

      public dtz.d h() {
         this.p = true;
         return this;
      }

      public dtz.d i() {
         this.q = true;
         return this;
      }

      public dtz.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dtz.d k() {
         this.r = true;
         return this;
      }

      public dtz.d a(eqg $$0) {
         this.t = $$0;
         return this;
      }

      public dtz.d l() {
         this.o = true;
         return this;
      }

      public dtz.d a(dtz.e<btq<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dtz.d a(dtz.f $$0) {
         this.y = $$0;
         return this;
      }

      public dtz.d b(dtz.f $$0) {
         this.z = $$0;
         return this;
      }

      public dtz.d c(dtz.f $$0) {
         this.A = $$0;
         return this;
      }

      public dtz.d d(dtz.f $$0) {
         this.B = $$0;
         return this;
      }

      public dtz.d e(dtz.f $$0) {
         this.C = $$0;
         return this;
      }

      public dtz.d m() {
         this.h = true;
         return this;
      }

      public dtz.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dtz.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dtz.d a(dtz.c $$0) {
         this.F = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dgv $$2 = $$0x.b();
            long $$3 = azc.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.au_();
            double $$5 = azc.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azc.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new eye($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dgv $$2 = $$0x.b();
            long $$3 = azc.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.aw_();
            float $$5 = $$2.au_();
            double $$6 = azc.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azc.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new eye($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dtz.d n() {
         this.u = false;
         return this;
      }

      public dtz.d a(cqf... $$0) {
         this.E = cqj.f.a($$0);
         return this;
      }

      public dtz.d a(dvb $$0) {
         this.v = $$0;
         return this;
      }

      public dtz.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dua var1, dcx var2, je var3, A var4);
   }

   public interface f {
      boolean test(dua var1, dcx var2, je var3);
   }
}
