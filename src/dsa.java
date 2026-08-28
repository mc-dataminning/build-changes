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

public abstract class dsa implements cph {
   protected static final je[] aF = new je[]{je.e, je.f, je.c, je.d, je.a, je.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dml aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cpk aO;
   protected final dsa.d aP;
   @Nullable
   protected ald<eqm> aQ;

   public dsa(dsa.d $$0) {
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

   public dsa.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dey> a();

   protected static <B extends dey> RecordCodecBuilder<B, dsa.d> u() {
      return dsa.d.a.fieldOf("properties").forGetter(dsa::t);
   }

   public static <B extends dey> MapCodec<B> b(Function<dsa.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dsb $$0, dby $$1, iz $$2, int $$3, int $$4) {
   }

   protected boolean a(dsb $$0, eoj $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(dbm.a, iz.c);
         case b:
            return $$0.u().a(awu.a);
         case c:
            return !$$0.r(dbm.a, iz.c);
         default:
            return false;
      }
   }

   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$0;
   }

   protected boolean a(dsb $$0, dsb $$1, je $$2) {
      return false;
   }

   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      ags.a($$1, $$2);
   }

   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
   }

   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dsb $$0, dbx $$1, iz $$2, dbp $$3, BiConsumer<cuo, iz> $$4) {
      if (!$$0.i() && $$3.j() != dbp.a.d) {
         dey $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cmw;
         if ($$5.a($$3) && $$1 instanceof are $$7) {
            dpg $$8 = $$0.t() ? $$1.c_($$2) : null;
            eqk.a $$9 = new eqk.a($$7).a(etd.f, evq.b($$2)).a(etd.i, cuo.l).b(etd.h, $$8).b(etd.a, $$3.g());
            if ($$3.j() == dbp.a.c) {
               $$9.a(etd.j, $$3.a());
            }

            $$0.a($$7, $$2, cuo.l, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dfa.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      return bqt.e;
   }

   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      return bqv.d;
   }

   protected boolean a(dsb $$0, dbx $$1, iz $$2, int $$3, int $$4) {
      return false;
   }

   protected dle a_(dsb $$0) {
      return dle.c;
   }

   protected boolean f_(dsb $$0) {
      return false;
   }

   protected boolean e_(dsb $$0) {
      return false;
   }

   protected enu b_(dsb $$0) {
      return env.a.g();
   }

   protected boolean c_(dsb $$0) {
      return false;
   }

   protected float aq_() {
      return 0.25F;
   }

   protected float as_() {
      return 0.2F;
   }

   @Override
   public cpk i() {
      return this.aO;
   }

   protected dsb a(dsb $$0, dll $$1) {
      return $$0;
   }

   protected dsb a(dsb $$0, djv $$1) {
      return $$0;
   }

   protected boolean a(dsb $$0, cxz $$1) {
      return $$0.r() && ($$1.n().e() || !$$1.n().a(this.r()));
   }

   protected boolean a(dsb $$0, ent $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cuo> a(dsb $$0, eqk.a $$1) {
      ald<eqm> $$2 = this.v();
      if ($$2 == eqd.a) {
         return Collections.emptyList();
      } else {
         eqk $$3 = $$1.a(etd.g, $$0).a(etc.r);
         are $$4 = $$3.a();
         eqm $$5 = $$4.o().be().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dsb $$0, iz $$1) {
      return ayy.a($$1);
   }

   protected ewj f(dsb $$0, dbd $$1, iz $$2) {
      return $$0.j($$1, $$2);
   }

   protected ewj b_(dsb $$0, dbd $$1, iz $$2) {
      return this.b($$0, $$1, $$2, evv.a());
   }

   protected ewj a(dsb $$0, dbd $$1, iz $$2) {
      return ewg.a();
   }

   protected int g(dsb $$0, dbd $$1, iz $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.Q();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bqx b(dsb $$0, dbx $$1, iz $$2) {
      return null;
   }

   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return true;
   }

   protected float d(dsb $$0, dbd $$1, iz $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return 0;
   }

   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return ewg.b();
   }

   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return this.aG ? $$0.j($$1, $$2) : ewg.a();
   }

   protected boolean c(dsb $$0, dbd $$1, iz $$2) {
      return dey.a($$0.k($$1, $$2));
   }

   protected boolean h(dsb $$0, dbd $$1, iz $$2) {
      return dey.a($$0.c($$1, $$2));
   }

   protected ewj c(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
   }

   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
   }

   protected float a(dsb $$0, cmw $$1, dbd $$2, iz $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dsb $$0, are $$1, iz $$2, cuo $$3, boolean $$4) {
   }

   protected void a(dsb $$0, dbx $$1, iz $$2, cmw $$3) {
   }

   protected int a(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return 0;
   }

   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
   }

   protected int b(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return 0;
   }

   public final ald<eqm> v() {
      if (this.aQ == null) {
         ale $$0 = lp.e.b(this.q());
         this.aQ = ald.a(lq.aU, $$0.d("blocks/"));
      }

      return this.aQ;
   }

   protected void a(dbx $$0, dsb $$1, evm $$2, cno $$3) {
   }

   protected boolean a_(dsb $$0, dbd $$1, iz $$2) {
      return !dey.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean d_(dsb $$0) {
      return this.aI;
   }

   protected dml g_(dsb $$0) {
      return this.aJ;
   }

   public abstract cuj r();

   protected abstract dey q();

   public eny w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dsd<dey, dsb> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final enz l;
      private final eny m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dsa.f q;
      private final dsa.f r;
      private final dsa.f s;
      private final dsa.f t;
      private final dsa.f u;
      private final Optional<dsa.b> v;
      private final boolean w;
      private final dtc x;
      private final boolean y;
      @Nullable
      protected dsa.a.a a;
      private enu z = env.a.g();
      private boolean A;

      protected a(dey $$0, Reference2ObjectArrayMap<dte<?>, Comparable<?>> $$1, MapCodec<dsb> $$2) {
         super($$0, $$1, $$2);
         dsa.d $$3 = $$0.aP;
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
            ewj $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               evl $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.b_(this.x());
         this.A = this.e.d_(this.x());
         if (!this.b().p()) {
            this.a = new dsa.a.a(this.x());
         }

         this.k = this.D();
      }

      public dey b() {
         return this.e;
      }

      public ji<dey> c() {
         return this.e.s();
      }

      @Deprecated
      public boolean d() {
         dey $$0 = this.b();
         return $$0 != dfa.bs && $$0 != dfa.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(dbd $$0, iz $$1, bsz<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(dbd $$0, iz $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(dbd $$0, iz $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public ewj a(dbd $$0, iz $$1, je $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ewg.a(this.c($$0, $$1), $$2);
      }

      public ewj c(dbd $$0, iz $$1) {
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

      public eny d(dbd $$0, iz $$1) {
         return this.m;
      }

      public dsb a(dll $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dsb a(djv $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dle l() {
         return this.b().a_(this.x());
      }

      public boolean e(dbd $$0, iz $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(dbd $$0, iz $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(dbd $$0, iz $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().e_(this.x());
      }

      public int b(dbd $$0, iz $$1, je $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().c_(this.x());
      }

      public int a(dbx $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(dbd $$0, iz $$1) {
         return this.n;
      }

      public float a(cmw $$0, dbd $$1, iz $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(dbd $$0, iz $$1, je $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public enz o() {
         return this.l;
      }

      public boolean i(dbd $$0, iz $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dsb $$2 = this.x();
            return $$2.p() ? dey.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dsb $$0, je $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public ewj j(dbd $$0, iz $$1) {
         return this.a($$0, $$1, evv.a());
      }

      public ewj a(dbd $$0, iz $$1, evv $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public ewj k(dbd $$0, iz $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, evv.a());
      }

      public ewj b(dbd $$0, iz $$1, evv $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ewj l(dbd $$0, iz $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public ewj c(dbd $$0, iz $$1, evv $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public ewj m(dbd $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(dbd $$0, iz $$1, bst $$2) {
         return this.a($$0, $$1, $$2, je.b);
      }

      public final boolean a(dbd $$0, iz $$1, bst $$2, je $$3) {
         return dey.a(this.b($$0, $$1, evv.a($$2)), $$3);
      }

      public evq n(dbd $$0, iz $$1) {
         return this.v.<evq>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(evq.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(dbx $$0, iz $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dbx $$0, iz $$1, dey $$2, iz $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dby $$0, iz $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dby $$0, iz $$1, int $$2, int $$3) {
         iz.a $$4 = new iz.a();

         for (je $$5 : dsa.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(dby $$0, iz $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dby $$0, iz $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dbx $$0, iz $$1, dsb $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(dbx $$0, iz $$1, dsb $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dbx $$0, iz $$1, dbp $$2, BiConsumer<cuo, iz> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(are $$0, iz $$1, azg $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(are $$0, iz $$1, azg $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(dbx $$0, iz $$1, bst $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(are $$0, iz $$1, cuo $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cuo> a(eqk.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bqv a(cuo $$0, dbx $$1, cmw $$2, bqs $$3, evm $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bqt a(dbx $$0, cmw $$1, evm $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(dbx $$0, iz $$1, cmw $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(dbd $$0, iz $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(dbd $$0, iz $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dsb a(je $$0, dsb $$1, dby $$2, iz $$3, iz $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(eoj $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cxz $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(ent $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(dca $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(dbd $$0, iz $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bqx b(dbx $$0, iz $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(axe<dey> $$0) {
         return this.b().s().a($$0);
      }

      public boolean a(axe<dey> $$0, Predicate<dsa.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jm<dey> $$0) {
         return $$0.a(this.b().s());
      }

      public boolean a(ji<dey> $$0) {
         return this.a($$0.a());
      }

      public Stream<axe<dey>> s() {
         return this.b().s().c();
      }

      public boolean t() {
         return this.b() instanceof dhq;
      }

      @Nullable
      public <T extends dpg> dph<T> a(dbx $$0, dpi<T> $$1) {
         return this.b() instanceof dhq ? ((dhq)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dey $$0) {
         return this.b() == $$0;
      }

      public boolean a(ald<dey> $$0) {
         return this.b().s().a($$0);
      }

      public enu u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(iz $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dml w() {
         return this.b().g_(this.x());
      }

      public void a(dbx $$0, dsb $$1, evm $$2, cno $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(dbd $$0, iz $$1, je $$2) {
         return this.a($$0, $$1, $$2, dmz.a);
      }

      public boolean a(dbd $$0, iz $$1, je $$2, dmz $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(dbd $$0, iz $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dsb x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dtc A() {
         return this.x;
      }

      static final class a {
         private static final je[] e = je.values();
         private static final int f = dmz.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final ewj[] i;
         protected final ewj b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dsb $$0) {
            dey $$1 = $$0.b();
            this.a = $$0.i(dbm.a, iz.c);
            this.g = $$1.a_($$0, dbm.a, iz.c);
            this.h = $$1.g($$0, dbm.a, iz.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new ewj[e.length];
               ewj $$2 = $$1.f($$0, dbm.a, iz.c);

               for (je $$3 : e) {
                  this.i[$$3.ordinal()] = ewg.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, dbm.a, iz.c, evv.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lp.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(je.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (je $$4 : e) {
                  for (dmz $$5 : dmz.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, dbm.a, iz.c, $$4);
                  }
               }

               this.d = dey.a($$0.k(dbm.a, iz.c));
            }
         }

         public boolean a(je $$0, dmz $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(je $$0, dmz $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      evq evaluate(dsb var1, dbd var2, iz var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dsa.d> a = Codec.unit(() -> a());
      Function<dsb, eny> b = $$0 -> eny.a;
      boolean c = true;
      dml d = dml.f;
      ToIntFunction<dsb> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      ald<eqm> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      enz t = enz.a;
      boolean u = true;
      dtc v = dtc.a;
      boolean w;
      dsa.e<bsz<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, je.b) && $$0.h() < 14;
      dsa.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dsa.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dsa.f A = this.z;
      dsa.f B = ($$0, $$1, $$2) -> false;
      dsa.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cpk E = cpm.g;
      Optional<dsa.b> F = Optional.empty();

      private d() {
      }

      public static dsa.d a() {
         return new dsa.d();
      }

      public static dsa.d a(dsa $$0) {
         dsa.d $$1 = b($$0);
         dsa.d $$2 = $$0.aP;
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
      public static dsa.d b(dsa $$0) {
         dsa.d $$1 = new dsa.d();
         dsa.d $$2 = $$0.aP;
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

      public dsa.d a(cth $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dsa.d a(eny $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dsa.d a(Function<dsb, eny> $$0) {
         this.b = $$0;
         return this;
      }

      public dsa.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dsa.d c() {
         this.n = false;
         return this;
      }

      public dsa.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dsa.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dsa.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dsa.d a(dml $$0) {
         this.d = $$0;
         return this;
      }

      public dsa.d a(ToIntFunction<dsb> $$0) {
         this.e = $$0;
         return this;
      }

      public dsa.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dsa.d d() {
         return this.d(0.0F);
      }

      public dsa.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dsa.d e() {
         this.i = true;
         return this;
      }

      public dsa.d f() {
         this.D = true;
         return this;
      }

      public dsa.d g() {
         this.m = eqd.a;
         return this;
      }

      public dsa.d a(dey $$0) {
         this.m = $$0.v();
         return this;
      }

      public dsa.d h() {
         this.p = true;
         return this;
      }

      public dsa.d i() {
         this.q = true;
         return this;
      }

      public dsa.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dsa.d k() {
         this.r = true;
         return this;
      }

      public dsa.d a(enz $$0) {
         this.t = $$0;
         return this;
      }

      public dsa.d l() {
         this.o = true;
         return this;
      }

      public dsa.d a(dsa.e<bsz<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dsa.d a(dsa.f $$0) {
         this.y = $$0;
         return this;
      }

      public dsa.d b(dsa.f $$0) {
         this.z = $$0;
         return this;
      }

      public dsa.d c(dsa.f $$0) {
         this.A = $$0;
         return this;
      }

      public dsa.d d(dsa.f $$0) {
         this.B = $$0;
         return this;
      }

      public dsa.d e(dsa.f $$0) {
         this.C = $$0;
         return this;
      }

      public dsa.d m() {
         this.h = true;
         return this;
      }

      public dsa.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dsa.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dsa.d a(dsa.c $$0) {
         switch ($$0) {
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dey $$3 = $$0x.b();
                  long $$4 = ayy.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.aq_();
                  double $$6 = ayy.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = ayy.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new evq($$6, 0.0, $$7);
               });
               break;
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dey $$3 = $$0x.b();
                  long $$4 = ayy.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.as_();
                  float $$6 = $$3.aq_();
                  double $$7 = ayy.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = ayy.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new evq($$7, $$5, $$8);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dsa.d n() {
         this.u = false;
         return this;
      }

      public dsa.d a(cpi... $$0) {
         this.E = cpm.e.a($$0);
         return this;
      }

      public dsa.d a(dtc $$0) {
         this.v = $$0;
         return this;
      }

      public dsa.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dsb var1, dbd var2, iz var3, A var4);
   }

   public interface f {
      boolean test(dsb var1, dbd var2, iz var3);
   }
}
