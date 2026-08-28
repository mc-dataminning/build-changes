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

public abstract class dsd implements cpk {
   protected static final je[] aF = new je[]{je.e, je.f, je.c, je.d, je.a, je.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dmo aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cpn aO;
   protected final dsd.d aP;
   @Nullable
   protected ale<eqp> aQ;

   public dsd(dsd.d $$0) {
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

   public dsd.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dfb> a();

   protected static <B extends dfb> RecordCodecBuilder<B, dsd.d> u() {
      return dsd.d.a.fieldOf("properties").forGetter(dsd::t);
   }

   public static <B extends dfb> MapCodec<B> b(Function<dsd.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dse $$0, dcb $$1, iz $$2, int $$3, int $$4) {
   }

   protected boolean a(dse $$0, eom $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(dbp.a, iz.c);
         case b:
            return $$0.u().a(awv.a);
         case c:
            return !$$0.r(dbp.a, iz.c);
         default:
            return false;
      }
   }

   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return $$0;
   }

   protected boolean a(dse $$0, dse $$1, je $$2) {
      return false;
   }

   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      agt.a($$1, $$2);
   }

   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
   }

   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dse $$0, dca $$1, iz $$2, dbs $$3, BiConsumer<cur, iz> $$4) {
      if (!$$0.i() && $$3.j() != dbs.a.d) {
         dfb $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cmz;
         if ($$5.a($$3) && $$1 instanceof arf $$7) {
            dpj $$8 = $$0.t() ? $$1.c_($$2) : null;
            eqn.a $$9 = new eqn.a($$7).a(etg.f, evt.b($$2)).a(etg.i, cur.l).b(etg.h, $$8).b(etg.a, $$3.g());
            if ($$3.j() == dbs.a.c) {
               $$9.a(etg.j, $$3.a());
            }

            $$0.a($$7, $$2, cur.l, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dfd.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      return bqw.e;
   }

   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      return bqy.d;
   }

   protected boolean a(dse $$0, dca $$1, iz $$2, int $$3, int $$4) {
      return false;
   }

   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   protected boolean f_(dse $$0) {
      return false;
   }

   protected boolean e_(dse $$0) {
      return false;
   }

   protected enx b_(dse $$0) {
      return eny.a.g();
   }

   protected boolean c_(dse $$0) {
      return false;
   }

   protected float aq_() {
      return 0.25F;
   }

   protected float as_() {
      return 0.2F;
   }

   @Override
   public cpn i() {
      return this.aO;
   }

   protected dse a(dse $$0, dlo $$1) {
      return $$0;
   }

   protected dse a(dse $$0, djy $$1) {
      return $$0;
   }

   protected boolean a(dse $$0, cyc $$1) {
      return $$0.r() && ($$1.n().e() || !$$1.n().a(this.r()));
   }

   protected boolean a(dse $$0, enw $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cur> a(dse $$0, eqn.a $$1) {
      ale<eqp> $$2 = this.v();
      if ($$2 == eqg.a) {
         return Collections.emptyList();
      } else {
         eqn $$3 = $$1.a(etg.g, $$0).a(etf.r);
         arf $$4 = $$3.a();
         eqp $$5 = $$4.o().be().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dse $$0, iz $$1) {
      return ayz.a($$1);
   }

   protected ewm f(dse $$0, dbg $$1, iz $$2) {
      return $$0.j($$1, $$2);
   }

   protected ewm b_(dse $$0, dbg $$1, iz $$2) {
      return this.b($$0, $$1, $$2, evy.a());
   }

   protected ewm a(dse $$0, dbg $$1, iz $$2) {
      return ewj.a();
   }

   protected int g(dse $$0, dbg $$1, iz $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.Q();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bra b(dse $$0, dca $$1, iz $$2) {
      return null;
   }

   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return true;
   }

   protected float d(dse $$0, dbg $$1, iz $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dse $$0, dca $$1, iz $$2) {
      return 0;
   }

   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return ewj.b();
   }

   protected ewm b(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return this.aG ? $$0.j($$1, $$2) : ewj.a();
   }

   protected boolean c(dse $$0, dbg $$1, iz $$2) {
      return dfb.a($$0.k($$1, $$2));
   }

   protected boolean h(dse $$0, dbg $$1, iz $$2) {
      return dfb.a($$0.c($$1, $$2));
   }

   protected ewm c(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
   }

   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
   }

   protected float a(dse $$0, cmz $$1, dbg $$2, iz $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dse $$0, arf $$1, iz $$2, cur $$3, boolean $$4) {
   }

   protected void a(dse $$0, dca $$1, iz $$2, cmz $$3) {
   }

   protected int a(dse $$0, dbg $$1, iz $$2, je $$3) {
      return 0;
   }

   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
   }

   protected int b(dse $$0, dbg $$1, iz $$2, je $$3) {
      return 0;
   }

   public final ale<eqp> v() {
      if (this.aQ == null) {
         alf $$0 = lp.e.b(this.q());
         this.aQ = ale.a(lq.aU, $$0.d("blocks/"));
      }

      return this.aQ;
   }

   protected void a(dca $$0, dse $$1, evp $$2, cnr $$3) {
   }

   protected boolean a_(dse $$0, dbg $$1, iz $$2) {
      return !dfb.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean d_(dse $$0) {
      return this.aI;
   }

   protected dmo g_(dse $$0) {
      return this.aJ;
   }

   public abstract cum r();

   protected abstract dfb q();

   public eob w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dsg<dfb, dse> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eoc l;
      private final eob m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dsd.f q;
      private final dsd.f r;
      private final dsd.f s;
      private final dsd.f t;
      private final dsd.f u;
      private final Optional<dsd.b> v;
      private final boolean w;
      private final dtf x;
      private final boolean y;
      @Nullable
      protected dsd.a.a a;
      private enx z = eny.a.g();
      private boolean A;

      protected a(dfb $$0, Reference2ObjectArrayMap<dth<?>, Comparable<?>> $$1, MapCodec<dse> $$2) {
         super($$0, $$1, $$2);
         dsd.d $$3 = $$0.aP;
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
            ewm $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               evo $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.b_(this.x());
         this.A = this.e.d_(this.x());
         if (!this.b().p()) {
            this.a = new dsd.a.a(this.x());
         }

         this.k = this.D();
      }

      public dfb b() {
         return this.e;
      }

      public ji<dfb> c() {
         return this.e.s();
      }

      @Deprecated
      public boolean d() {
         dfb $$0 = this.b();
         return $$0 != dfd.bs && $$0 != dfd.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(dbg $$0, iz $$1, btc<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(dbg $$0, iz $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(dbg $$0, iz $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public ewm a(dbg $$0, iz $$1, je $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ewj.a(this.c($$0, $$1), $$2);
      }

      public ewm c(dbg $$0, iz $$1) {
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

      public eob d(dbg $$0, iz $$1) {
         return this.m;
      }

      public dse a(dlo $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dse a(djy $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dlh l() {
         return this.b().a_(this.x());
      }

      public boolean e(dbg $$0, iz $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(dbg $$0, iz $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(dbg $$0, iz $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().e_(this.x());
      }

      public int b(dbg $$0, iz $$1, je $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().c_(this.x());
      }

      public int a(dca $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(dbg $$0, iz $$1) {
         return this.n;
      }

      public float a(cmz $$0, dbg $$1, iz $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(dbg $$0, iz $$1, je $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eoc o() {
         return this.l;
      }

      public boolean i(dbg $$0, iz $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dse $$2 = this.x();
            return $$2.p() ? dfb.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dse $$0, je $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public ewm j(dbg $$0, iz $$1) {
         return this.a($$0, $$1, evy.a());
      }

      public ewm a(dbg $$0, iz $$1, evy $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public ewm k(dbg $$0, iz $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, evy.a());
      }

      public ewm b(dbg $$0, iz $$1, evy $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ewm l(dbg $$0, iz $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public ewm c(dbg $$0, iz $$1, evy $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public ewm m(dbg $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(dbg $$0, iz $$1, bsw $$2) {
         return this.a($$0, $$1, $$2, je.b);
      }

      public final boolean a(dbg $$0, iz $$1, bsw $$2, je $$3) {
         return dfb.a(this.b($$0, $$1, evy.a($$2)), $$3);
      }

      public evt n(dbg $$0, iz $$1) {
         return this.v.<evt>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(evt.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(dca $$0, iz $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dca $$0, iz $$1, dfb $$2, iz $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dcb $$0, iz $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dcb $$0, iz $$1, int $$2, int $$3) {
         iz.a $$4 = new iz.a();

         for (je $$5 : dsd.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(dcb $$0, iz $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dcb $$0, iz $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dca $$0, iz $$1, dse $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(dca $$0, iz $$1, dse $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dca $$0, iz $$1, dbs $$2, BiConsumer<cur, iz> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(arf $$0, iz $$1, azh $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(arf $$0, iz $$1, azh $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(dca $$0, iz $$1, bsw $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(arf $$0, iz $$1, cur $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cur> a(eqn.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bqy a(cur $$0, dca $$1, cmz $$2, bqv $$3, evp $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bqw a(dca $$0, cmz $$1, evp $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(dca $$0, iz $$1, cmz $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(dbg $$0, iz $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(dbg $$0, iz $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dse a(je $$0, dse $$1, dcb $$2, iz $$3, iz $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(eom $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cyc $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(enw $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(dcd $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(dbg $$0, iz $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bra b(dca $$0, iz $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(axf<dfb> $$0) {
         return this.b().s().a($$0);
      }

      public boolean a(axf<dfb> $$0, Predicate<dsd.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jm<dfb> $$0) {
         return $$0.a(this.b().s());
      }

      public boolean a(ji<dfb> $$0) {
         return this.a($$0.a());
      }

      public Stream<axf<dfb>> s() {
         return this.b().s().c();
      }

      public boolean t() {
         return this.b() instanceof dht;
      }

      @Nullable
      public <T extends dpj> dpk<T> a(dca $$0, dpl<T> $$1) {
         return this.b() instanceof dht ? ((dht)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dfb $$0) {
         return this.b() == $$0;
      }

      public boolean a(ale<dfb> $$0) {
         return this.b().s().a($$0);
      }

      public enx u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(iz $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dmo w() {
         return this.b().g_(this.x());
      }

      public void a(dca $$0, dse $$1, evp $$2, cnr $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(dbg $$0, iz $$1, je $$2) {
         return this.a($$0, $$1, $$2, dnc.a);
      }

      public boolean a(dbg $$0, iz $$1, je $$2, dnc $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(dbg $$0, iz $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dse x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dtf A() {
         return this.x;
      }

      static final class a {
         private static final je[] e = je.values();
         private static final int f = dnc.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final ewm[] i;
         protected final ewm b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dse $$0) {
            dfb $$1 = $$0.b();
            this.a = $$0.i(dbp.a, iz.c);
            this.g = $$1.a_($$0, dbp.a, iz.c);
            this.h = $$1.g($$0, dbp.a, iz.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new ewm[e.length];
               ewm $$2 = $$1.f($$0, dbp.a, iz.c);

               for (je $$3 : e) {
                  this.i[$$3.ordinal()] = ewj.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, dbp.a, iz.c, evy.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lp.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(je.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (je $$4 : e) {
                  for (dnc $$5 : dnc.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, dbp.a, iz.c, $$4);
                  }
               }

               this.d = dfb.a($$0.k(dbp.a, iz.c));
            }
         }

         public boolean a(je $$0, dnc $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(je $$0, dnc $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      evt evaluate(dse var1, dbg var2, iz var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dsd.d> a = Codec.unit(() -> a());
      Function<dse, eob> b = $$0 -> eob.a;
      boolean c = true;
      dmo d = dmo.f;
      ToIntFunction<dse> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      ale<eqp> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      eoc t = eoc.a;
      boolean u = true;
      dtf v = dtf.a;
      boolean w;
      dsd.e<btc<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, je.b) && $$0.h() < 14;
      dsd.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dsd.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dsd.f A = this.z;
      dsd.f B = ($$0, $$1, $$2) -> false;
      dsd.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cpn E = cpp.g;
      Optional<dsd.b> F = Optional.empty();

      private d() {
      }

      public static dsd.d a() {
         return new dsd.d();
      }

      public static dsd.d a(dsd $$0) {
         dsd.d $$1 = b($$0);
         dsd.d $$2 = $$0.aP;
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
      public static dsd.d b(dsd $$0) {
         dsd.d $$1 = new dsd.d();
         dsd.d $$2 = $$0.aP;
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

      public dsd.d a(ctk $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dsd.d a(eob $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dsd.d a(Function<dse, eob> $$0) {
         this.b = $$0;
         return this;
      }

      public dsd.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dsd.d c() {
         this.n = false;
         return this;
      }

      public dsd.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dsd.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dsd.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dsd.d a(dmo $$0) {
         this.d = $$0;
         return this;
      }

      public dsd.d a(ToIntFunction<dse> $$0) {
         this.e = $$0;
         return this;
      }

      public dsd.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dsd.d d() {
         return this.d(0.0F);
      }

      public dsd.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dsd.d e() {
         this.i = true;
         return this;
      }

      public dsd.d f() {
         this.D = true;
         return this;
      }

      public dsd.d g() {
         this.m = eqg.a;
         return this;
      }

      public dsd.d a(dfb $$0) {
         this.m = $$0.v();
         return this;
      }

      public dsd.d h() {
         this.p = true;
         return this;
      }

      public dsd.d i() {
         this.q = true;
         return this;
      }

      public dsd.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dsd.d k() {
         this.r = true;
         return this;
      }

      public dsd.d a(eoc $$0) {
         this.t = $$0;
         return this;
      }

      public dsd.d l() {
         this.o = true;
         return this;
      }

      public dsd.d a(dsd.e<btc<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dsd.d a(dsd.f $$0) {
         this.y = $$0;
         return this;
      }

      public dsd.d b(dsd.f $$0) {
         this.z = $$0;
         return this;
      }

      public dsd.d c(dsd.f $$0) {
         this.A = $$0;
         return this;
      }

      public dsd.d d(dsd.f $$0) {
         this.B = $$0;
         return this;
      }

      public dsd.d e(dsd.f $$0) {
         this.C = $$0;
         return this;
      }

      public dsd.d m() {
         this.h = true;
         return this;
      }

      public dsd.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dsd.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dsd.d a(dsd.c $$0) {
         switch ($$0) {
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dfb $$3 = $$0x.b();
                  long $$4 = ayz.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.aq_();
                  double $$6 = ayz.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = ayz.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new evt($$6, 0.0, $$7);
               });
               break;
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dfb $$3 = $$0x.b();
                  long $$4 = ayz.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.as_();
                  float $$6 = $$3.aq_();
                  double $$7 = ayz.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = ayz.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new evt($$7, $$5, $$8);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dsd.d n() {
         this.u = false;
         return this;
      }

      public dsd.d a(cpl... $$0) {
         this.E = cpp.e.a($$0);
         return this;
      }

      public dsd.d a(dtf $$0) {
         this.v = $$0;
         return this;
      }

      public dsd.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dse var1, dbg var2, iz var3, A var4);
   }

   public interface f {
      boolean test(dse var1, dbg var2, iz var3);
   }
}
