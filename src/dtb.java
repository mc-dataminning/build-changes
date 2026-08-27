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

public abstract class dtb implements col {
   protected static final iw[] aF = new iw[]{iw.e, iw.f, iw.c, iw.d, iw.a, iw.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dnd aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cop aO;
   protected final dtb.d aP;
   @Nullable
   protected aks<eru> aQ;

   public dtb(dtb.d $$0) {
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

   public dtb.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dfc> a();

   protected static <B extends dfc> RecordCodecBuilder<B, dtb.d> u() {
      return dtb.d.a.fieldOf("properties").forGetter(dtb::t);
   }

   public static <B extends dfc> MapCodec<B> b(Function<dtb.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dtc $$0, dcb $$1, ir $$2, int $$3, int $$4) {
   }

   protected boolean a(dtc $$0, ept $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(dbp.a, ir.c);
         case b:
            return $$0.u().a(awj.a);
         case c:
            return !$$0.r(dbp.a, ir.c);
         default:
            return false;
      }
   }

   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$0;
   }

   protected boolean a(dtc $$0, dtc $$1, iw $$2) {
      return false;
   }

   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      agi.a($$1, $$2);
   }

   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
   }

   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dtc $$0, dca $$1, ir $$2, dbs $$3, BiConsumer<cuh, ir> $$4) {
      if (!$$0.i() && $$3.j() != dbs.a.d) {
         dfc $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cly;
         if ($$5.a($$3) && $$1 instanceof aqt $$7) {
            dqc $$8 = $$0.t() ? $$1.c_($$2) : null;
            ers.a $$9 = new ers.a($$7).a(eug.f, ewu.b($$2)).a(eug.i, cuh.i).b(eug.h, $$8).b(eug.a, $$3.g());
            if ($$3.j() == dbs.a.c) {
               $$9.a(eug.j, $$3.a());
            }

            $$0.a($$7, $$2, cuh.i, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dfe.a.n(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      return bqa.d;
   }

   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      return bqc.d;
   }

   protected boolean a(dtc $$0, dca $$1, ir $$2, int $$3, int $$4) {
      return false;
   }

   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   protected boolean f_(dtc $$0) {
      return false;
   }

   protected boolean e_(dtc $$0) {
      return false;
   }

   protected epe b_(dtc $$0) {
      return epf.a.g();
   }

   protected boolean c_(dtc $$0) {
      return false;
   }

   protected float at_() {
      return 0.25F;
   }

   protected float ar_() {
      return 0.2F;
   }

   @Override
   public cop m() {
      return this.aO;
   }

   protected dtc a(dtc $$0, dmd $$1) {
      return $$0;
   }

   protected dtc a(dtc $$0, dke $$1) {
      return $$0;
   }

   protected boolean a(dtc $$0, cyd $$1) {
      return $$0.r() && ($$1.n().d() || !$$1.n().a(this.q()));
   }

   protected boolean a(dtc $$0, epd $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cuh> a(dtc $$0, ers.a $$1) {
      aks<eru> $$2 = this.v();
      if ($$2 == ern.a) {
         return Collections.emptyList();
      } else {
         ers $$3 = $$1.a(eug.g, $$0).a(euf.q);
         aqt $$4 = $$3.a();
         eru $$5 = $$4.o().be().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dtc $$0, ir $$1) {
      return aym.a($$1);
   }

   protected exn g(dtc $$0, dbg $$1, ir $$2) {
      return $$0.j($$1, $$2);
   }

   protected exn b_(dtc $$0, dbg $$1, ir $$2) {
      return this.b($$0, $$1, $$2, ewz.a());
   }

   protected exn a(dtc $$0, dbg $$1, ir $$2) {
      return exk.a();
   }

   protected int f(dtc $$0, dbg $$1, ir $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.Q();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bqe b(dtc $$0, dca $$1, ir $$2) {
      return null;
   }

   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return true;
   }

   protected float d(dtc $$0, dbg $$1, ir $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dtc $$0, dca $$1, ir $$2) {
      return 0;
   }

   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return exk.b();
   }

   protected exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return this.aG ? $$0.j($$1, $$2) : exk.a();
   }

   protected boolean c(dtc $$0, dbg $$1, ir $$2) {
      return dfc.a($$0.k($$1, $$2));
   }

   protected boolean h(dtc $$0, dbg $$1, ir $$2) {
      return dfc.a($$0.c($$1, $$2));
   }

   protected exn c(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
   }

   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
   }

   protected float a(dtc $$0, cly $$1, dbg $$2, ir $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dtc $$0, aqt $$1, ir $$2, cuh $$3, boolean $$4) {
   }

   protected void a(dtc $$0, dca $$1, ir $$2, cly $$3) {
   }

   protected int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return 0;
   }

   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
   }

   protected int b(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return 0;
   }

   public final aks<eru> v() {
      if (this.aQ == null) {
         akt $$0 = lh.e.b(this.p());
         this.aQ = aks.a(li.aU, $$0.d("blocks/"));
      }

      return this.aQ;
   }

   protected void a(dca $$0, dtc $$1, ewq $$2, cms $$3) {
   }

   protected boolean a_(dtc $$0, dbg $$1, ir $$2) {
      return !dfc.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean d_(dtc $$0) {
      return this.aI;
   }

   protected dnd g_(dtc $$0) {
      return this.aJ;
   }

   public abstract cuc q();

   protected abstract dfc p();

   public epi w() {
      return this.aP.b.apply(this.p().n());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dte<dfc, dtc> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final epj l;
      private final epi m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dtb.f q;
      private final dtb.f r;
      private final dtb.f s;
      private final dtb.f t;
      private final dtb.f u;
      private final Optional<dtb.b> v;
      private final boolean w;
      private final dud x;
      private final boolean y;
      @Nullable
      protected dtb.a.a a;
      private epe z = epf.a.g();
      private boolean A;

      protected a(dfc $$0, Reference2ObjectArrayMap<duf<?>, Comparable<?>> $$1, MapCodec<dtc> $$2) {
         super($$0, $$1, $$2);
         dtb.d $$3 = $$0.aP;
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
            exn $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               ewp $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.b_(this.x());
         this.A = this.e.d_(this.x());
         if (!this.b().o()) {
            this.a = new dtb.a.a(this.x());
         }

         this.k = this.D();
      }

      public dfc b() {
         return this.e;
      }

      public ja<dfc> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         dfc $$0 = this.b();
         return $$0 != dfe.cc && $$0 != dfe.nW && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(dbg $$0, ir $$1, bsb<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(dbg $$0, ir $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(dbg $$0, ir $$1) {
         return this.a != null ? this.a.h : this.b().f(this.x(), $$0, $$1);
      }

      public exn a(dbg $$0, ir $$1, iw $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : exk.a(this.c($$0, $$1), $$2);
      }

      public exn c(dbg $$0, ir $$1) {
         return this.b().g(this.x(), $$0, $$1);
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

      public epi d(dbg $$0, ir $$1) {
         return this.m;
      }

      public dtc a(dmd $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dtc a(dke $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dlw l() {
         return this.b().a_(this.x());
      }

      public boolean e(dbg $$0, ir $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(dbg $$0, ir $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(dbg $$0, ir $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().e_(this.x());
      }

      public int b(dbg $$0, ir $$1, iw $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().c_(this.x());
      }

      public int a(dca $$0, ir $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(dbg $$0, ir $$1) {
         return this.n;
      }

      public float a(cly $$0, dbg $$1, ir $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(dbg $$0, ir $$1, iw $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public epj o() {
         return this.l;
      }

      public boolean i(dbg $$0, ir $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dtc $$2 = this.x();
            return $$2.p() ? dfc.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dtc $$0, iw $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public exn j(dbg $$0, ir $$1) {
         return this.a($$0, $$1, ewz.a());
      }

      public exn a(dbg $$0, ir $$1, ewz $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public exn k(dbg $$0, ir $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, ewz.a());
      }

      public exn b(dbg $$0, ir $$1, ewz $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public exn l(dbg $$0, ir $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public exn c(dbg $$0, ir $$1, ewz $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public exn m(dbg $$0, ir $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(dbg $$0, ir $$1, brv $$2) {
         return this.a($$0, $$1, $$2, iw.b);
      }

      public final boolean a(dbg $$0, ir $$1, brv $$2, iw $$3) {
         return dfc.a(this.b($$0, $$1, ewz.a($$2)), $$3);
      }

      public ewu n(dbg $$0, ir $$1) {
         return this.v.<ewu>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(ewu.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(dca $$0, ir $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dca $$0, ir $$1, dfc $$2, ir $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dcb $$0, ir $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dcb $$0, ir $$1, int $$2, int $$3) {
         ir.a $$4 = new ir.a();

         for (iw $$5 : dtb.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(dcb $$0, ir $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dcb $$0, ir $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dca $$0, ir $$1, dtc $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(dca $$0, ir $$1, dtc $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dca $$0, ir $$1, dbs $$2, BiConsumer<cuh, ir> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(aqt $$0, ir $$1, ayt $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(aqt $$0, ir $$1, ayt $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(dca $$0, ir $$1, brv $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(aqt $$0, ir $$1, cuh $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cuh> a(ers.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bqc a(cuh $$0, dca $$1, cly $$2, bpz $$3, ewq $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bqa a(dca $$0, cly $$1, ewq $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(dca $$0, ir $$1, cly $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(dbg $$0, ir $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(dbg $$0, ir $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dtc a(iw $$0, dtc $$1, dcb $$2, ir $$3, ir $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(ept $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cyd $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(epd $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(dcd $$0, ir $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(dbg $$0, ir $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bqe b(dca $$0, ir $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(awt<dfc> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(awt<dfc> $$0, Predicate<dtb.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(je<dfc> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(ja<dfc> $$0) {
         return this.a($$0.a());
      }

      public Stream<awt<dfc>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof dhw;
      }

      @Nullable
      public <T extends dqc> dqd<T> a(dca $$0, dqe<T> $$1) {
         return this.b() instanceof dhw ? ((dhw)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dfc $$0) {
         return this.b() == $$0;
      }

      public boolean a(aks<dfc> $$0) {
         return this.b().r().a($$0);
      }

      public epe u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(ir $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dnd w() {
         return this.b().g_(this.x());
      }

      public void a(dca $$0, dtc $$1, ewq $$2, cms $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(dbg $$0, ir $$1, iw $$2) {
         return this.a($$0, $$1, $$2, dns.a);
      }

      public boolean a(dbg $$0, ir $$1, iw $$2, dns $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(dbg $$0, ir $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dtc x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dud A() {
         return this.x;
      }

      static final class a {
         private static final iw[] e = iw.values();
         private static final int f = dns.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final exn[] i;
         protected final exn b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dtc $$0) {
            dfc $$1 = $$0.b();
            this.a = $$0.i(dbp.a, ir.c);
            this.g = $$1.a_($$0, dbp.a, ir.c);
            this.h = $$1.f($$0, dbp.a, ir.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new exn[e.length];
               exn $$2 = $$1.g($$0, dbp.a, ir.c);

               for (iw $$3 : e) {
                  this.i[$$3.ordinal()] = exk.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, dbp.a, ir.c, ewz.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lh.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(iw.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (iw $$4 : e) {
                  for (dns $$5 : dns.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, dbp.a, ir.c, $$4);
                  }
               }

               this.d = dfc.a($$0.k(dbp.a, ir.c));
            }
         }

         public boolean a(iw $$0, dns $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(iw $$0, dns $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      ewu evaluate(dtc var1, dbg var2, ir var3);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }

   public static class d {
      public static final Codec<dtb.d> a = Codec.unit(() -> a());
      Function<dtc, epi> b = $$0 -> epi.a;
      boolean c = true;
      dnd d = dnd.f;
      ToIntFunction<dtc> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      aks<eru> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      epj t = epj.a;
      boolean u = true;
      dud v = dud.a;
      boolean w;
      dtb.e<bsb<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, iw.b) && $$0.h() < 14;
      dtb.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dtb.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dtb.f A = this.z;
      dtb.f B = ($$0, $$1, $$2) -> false;
      dtb.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cop E = cor.g;
      Optional<dtb.b> F = Optional.empty();

      private d() {
      }

      public static dtb.d a() {
         return new dtb.d();
      }

      public static dtb.d a(dtb $$0) {
         dtb.d $$1 = b($$0);
         dtb.d $$2 = $$0.aP;
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
      public static dtb.d b(dtb $$0) {
         dtb.d $$1 = new dtb.d();
         dtb.d $$2 = $$0.aP;
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

      public dtb.d a(csy $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dtb.d a(epi $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dtb.d a(Function<dtc, epi> $$0) {
         this.b = $$0;
         return this;
      }

      public dtb.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dtb.d c() {
         this.n = false;
         return this;
      }

      public dtb.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dtb.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dtb.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dtb.d a(dnd $$0) {
         this.d = $$0;
         return this;
      }

      public dtb.d a(ToIntFunction<dtc> $$0) {
         this.e = $$0;
         return this;
      }

      public dtb.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dtb.d d() {
         return this.d(0.0F);
      }

      public dtb.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dtb.d e() {
         this.i = true;
         return this;
      }

      public dtb.d f() {
         this.D = true;
         return this;
      }

      public dtb.d g() {
         this.m = ern.a;
         return this;
      }

      public dtb.d a(dfc $$0) {
         this.m = $$0.v();
         return this;
      }

      public dtb.d h() {
         this.p = true;
         return this;
      }

      public dtb.d i() {
         this.q = true;
         return this;
      }

      public dtb.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dtb.d k() {
         this.r = true;
         return this;
      }

      public dtb.d a(epj $$0) {
         this.t = $$0;
         return this;
      }

      public dtb.d l() {
         this.o = true;
         return this;
      }

      public dtb.d a(dtb.e<bsb<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dtb.d a(dtb.f $$0) {
         this.y = $$0;
         return this;
      }

      public dtb.d b(dtb.f $$0) {
         this.z = $$0;
         return this;
      }

      public dtb.d c(dtb.f $$0) {
         this.A = $$0;
         return this;
      }

      public dtb.d d(dtb.f $$0) {
         this.B = $$0;
         return this;
      }

      public dtb.d e(dtb.f $$0) {
         this.C = $$0;
         return this;
      }

      public dtb.d m() {
         this.h = true;
         return this;
      }

      public dtb.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dtb.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dtb.d a(dtb.c $$0) {
         switch ($$0) {
            case d:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  ir $$3 = $$2.d();
                  return $$1.a_($$3).r($$1, $$3) ? new ewu(0.0, 0.0625, 0.0) : ewu.b;
               });
               break;
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dfc $$3 = $$0x.b();
                  long $$4 = aym.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.ar_();
                  float $$6 = $$3.at_();
                  double $$7 = aym.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = aym.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new ewu($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dfc $$3 = $$0x.b();
                  long $$4 = aym.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.at_();
                  double $$6 = aym.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = aym.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new ewu($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dtb.d n() {
         this.u = false;
         return this;
      }

      public dtb.d a(com... $$0) {
         this.E = cor.e.a($$0);
         return this;
      }

      public dtb.d a(dud $$0) {
         this.v = $$0;
         return this;
      }

      public dtb.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dtc var1, dbg var2, ir var3, A var4);
   }

   public interface f {
      boolean test(dtc var1, dbg var2, ir var3);
   }
}
