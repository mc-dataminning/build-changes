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

public abstract class drz implements cpg {
   protected static final je[] aF = new je[]{je.e, je.f, je.c, je.d, je.a, je.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dmk aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cpj aO;
   protected final drz.d aP;
   @Nullable
   protected ald<eql> aQ;

   public drz(drz.d $$0) {
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

   public drz.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dex> a();

   protected static <B extends dex> RecordCodecBuilder<B, drz.d> u() {
      return drz.d.a.fieldOf("properties").forGetter(drz::t);
   }

   public static <B extends dex> MapCodec<B> b(Function<drz.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dsa $$0, dbx $$1, iz $$2, int $$3, int $$4) {
   }

   protected boolean a(dsa $$0, eoi $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(dbl.a, iz.c);
         case b:
            return $$0.u().a(awu.a);
         case c:
            return !$$0.r(dbl.a, iz.c);
         default:
            return false;
      }
   }

   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$0;
   }

   protected boolean a(dsa $$0, dsa $$1, je $$2) {
      return false;
   }

   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      ags.a($$1, $$2);
   }

   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
   }

   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dsa $$0, dbw $$1, iz $$2, dbo $$3, BiConsumer<cun, iz> $$4) {
      if (!$$0.i() && $$3.j() != dbo.a.d) {
         dex $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cmv;
         if ($$5.a($$3) && $$1 instanceof are $$7) {
            dpf $$8 = $$0.t() ? $$1.c_($$2) : null;
            eqj.a $$9 = new eqj.a($$7).a(etc.f, evp.b($$2)).a(etc.i, cun.l).b(etc.h, $$8).b(etc.a, $$3.g());
            if ($$3.j() == dbo.a.c) {
               $$9.a(etc.j, $$3.a());
            }

            $$0.a($$7, $$2, cun.l, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dez.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      return bqs.e;
   }

   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      return bqu.d;
   }

   protected boolean a(dsa $$0, dbw $$1, iz $$2, int $$3, int $$4) {
      return false;
   }

   protected dld a_(dsa $$0) {
      return dld.c;
   }

   protected boolean f_(dsa $$0) {
      return false;
   }

   protected boolean e_(dsa $$0) {
      return false;
   }

   protected ent b_(dsa $$0) {
      return enu.a.g();
   }

   protected boolean c_(dsa $$0) {
      return false;
   }

   protected float ar_() {
      return 0.25F;
   }

   protected float at_() {
      return 0.2F;
   }

   @Override
   public cpj i() {
      return this.aO;
   }

   protected dsa a(dsa $$0, dlk $$1) {
      return $$0;
   }

   protected dsa a(dsa $$0, dju $$1) {
      return $$0;
   }

   protected boolean a(dsa $$0, cxy $$1) {
      return $$0.r() && ($$1.n().e() || !$$1.n().a(this.r()));
   }

   protected boolean a(dsa $$0, ens $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cun> a(dsa $$0, eqj.a $$1) {
      ald<eql> $$2 = this.v();
      if ($$2 == eqc.a) {
         return Collections.emptyList();
      } else {
         eqj $$3 = $$1.a(etc.g, $$0).a(etb.r);
         are $$4 = $$3.a();
         eql $$5 = $$4.o().be().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dsa $$0, iz $$1) {
      return ayx.a($$1);
   }

   protected ewi f(dsa $$0, dbc $$1, iz $$2) {
      return $$0.j($$1, $$2);
   }

   protected ewi b_(dsa $$0, dbc $$1, iz $$2) {
      return this.b($$0, $$1, $$2, evu.a());
   }

   protected ewi a(dsa $$0, dbc $$1, iz $$2) {
      return ewf.a();
   }

   protected int g(dsa $$0, dbc $$1, iz $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.Q();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bqw b(dsa $$0, dbw $$1, iz $$2) {
      return null;
   }

   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return true;
   }

   protected float d(dsa $$0, dbc $$1, iz $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dsa $$0, dbw $$1, iz $$2) {
      return 0;
   }

   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return ewf.b();
   }

   protected ewi b(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return this.aG ? $$0.j($$1, $$2) : ewf.a();
   }

   protected boolean c(dsa $$0, dbc $$1, iz $$2) {
      return dex.a($$0.k($$1, $$2));
   }

   protected boolean h(dsa $$0, dbc $$1, iz $$2) {
      return dex.a($$0.c($$1, $$2));
   }

   protected ewi c(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
   }

   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
   }

   protected float a(dsa $$0, cmv $$1, dbc $$2, iz $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dsa $$0, are $$1, iz $$2, cun $$3, boolean $$4) {
   }

   protected void a(dsa $$0, dbw $$1, iz $$2, cmv $$3) {
   }

   protected int a(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return 0;
   }

   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
   }

   protected int b(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return 0;
   }

   public final ald<eql> v() {
      if (this.aQ == null) {
         ale $$0 = lp.e.b(this.q());
         this.aQ = ald.a(lq.aU, $$0.d("blocks/"));
      }

      return this.aQ;
   }

   protected void a(dbw $$0, dsa $$1, evl $$2, cnn $$3) {
   }

   protected boolean a_(dsa $$0, dbc $$1, iz $$2) {
      return !dex.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean d_(dsa $$0) {
      return this.aI;
   }

   protected dmk g_(dsa $$0) {
      return this.aJ;
   }

   public abstract cui r();

   protected abstract dex q();

   public enx w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dsc<dex, dsa> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eny l;
      private final enx m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final drz.f q;
      private final drz.f r;
      private final drz.f s;
      private final drz.f t;
      private final drz.f u;
      private final Optional<drz.b> v;
      private final boolean w;
      private final dtb x;
      private final boolean y;
      @Nullable
      protected drz.a.a a;
      private ent z = enu.a.g();
      private boolean A;

      protected a(dex $$0, Reference2ObjectArrayMap<dtd<?>, Comparable<?>> $$1, MapCodec<dsa> $$2) {
         super($$0, $$1, $$2);
         drz.d $$3 = $$0.aP;
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
            ewi $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               evk $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.b_(this.x());
         this.A = this.e.d_(this.x());
         if (!this.b().p()) {
            this.a = new drz.a.a(this.x());
         }

         this.k = this.D();
      }

      public dex b() {
         return this.e;
      }

      public ji<dex> c() {
         return this.e.s();
      }

      @Deprecated
      public boolean d() {
         dex $$0 = this.b();
         return $$0 != dez.bs && $$0 != dez.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(dbc $$0, iz $$1, bsy<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(dbc $$0, iz $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(dbc $$0, iz $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public ewi a(dbc $$0, iz $$1, je $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ewf.a(this.c($$0, $$1), $$2);
      }

      public ewi c(dbc $$0, iz $$1) {
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

      public enx d(dbc $$0, iz $$1) {
         return this.m;
      }

      public dsa a(dlk $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dsa a(dju $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dld l() {
         return this.b().a_(this.x());
      }

      public boolean e(dbc $$0, iz $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(dbc $$0, iz $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(dbc $$0, iz $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().e_(this.x());
      }

      public int b(dbc $$0, iz $$1, je $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().c_(this.x());
      }

      public int a(dbw $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(dbc $$0, iz $$1) {
         return this.n;
      }

      public float a(cmv $$0, dbc $$1, iz $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(dbc $$0, iz $$1, je $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eny o() {
         return this.l;
      }

      public boolean i(dbc $$0, iz $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dsa $$2 = this.x();
            return $$2.p() ? dex.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dsa $$0, je $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public ewi j(dbc $$0, iz $$1) {
         return this.a($$0, $$1, evu.a());
      }

      public ewi a(dbc $$0, iz $$1, evu $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public ewi k(dbc $$0, iz $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, evu.a());
      }

      public ewi b(dbc $$0, iz $$1, evu $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ewi l(dbc $$0, iz $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public ewi c(dbc $$0, iz $$1, evu $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public ewi m(dbc $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(dbc $$0, iz $$1, bss $$2) {
         return this.a($$0, $$1, $$2, je.b);
      }

      public final boolean a(dbc $$0, iz $$1, bss $$2, je $$3) {
         return dex.a(this.b($$0, $$1, evu.a($$2)), $$3);
      }

      public evp n(dbc $$0, iz $$1) {
         return this.v.<evp>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(evp.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(dbw $$0, iz $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dbw $$0, iz $$1, dex $$2, iz $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dbx $$0, iz $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dbx $$0, iz $$1, int $$2, int $$3) {
         iz.a $$4 = new iz.a();

         for (je $$5 : drz.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(dbx $$0, iz $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dbx $$0, iz $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dbw $$0, iz $$1, dsa $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(dbw $$0, iz $$1, dsa $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dbw $$0, iz $$1, dbo $$2, BiConsumer<cun, iz> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(are $$0, iz $$1, azf $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(are $$0, iz $$1, azf $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(dbw $$0, iz $$1, bss $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(are $$0, iz $$1, cun $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cun> a(eqj.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bqu a(cun $$0, dbw $$1, cmv $$2, bqr $$3, evl $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bqs a(dbw $$0, cmv $$1, evl $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(dbw $$0, iz $$1, cmv $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(dbc $$0, iz $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(dbc $$0, iz $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dsa a(je $$0, dsa $$1, dbx $$2, iz $$3, iz $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(eoi $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cxy $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(ens $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(dbz $$0, iz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(dbc $$0, iz $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bqw b(dbw $$0, iz $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(axe<dex> $$0) {
         return this.b().s().a($$0);
      }

      public boolean a(axe<dex> $$0, Predicate<drz.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jm<dex> $$0) {
         return $$0.a(this.b().s());
      }

      public boolean a(ji<dex> $$0) {
         return this.a($$0.a());
      }

      public Stream<axe<dex>> s() {
         return this.b().s().c();
      }

      public boolean t() {
         return this.b() instanceof dhp;
      }

      @Nullable
      public <T extends dpf> dpg<T> a(dbw $$0, dph<T> $$1) {
         return this.b() instanceof dhp ? ((dhp)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dex $$0) {
         return this.b() == $$0;
      }

      public boolean a(ald<dex> $$0) {
         return this.b().s().a($$0);
      }

      public ent u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(iz $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dmk w() {
         return this.b().g_(this.x());
      }

      public void a(dbw $$0, dsa $$1, evl $$2, cnn $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(dbc $$0, iz $$1, je $$2) {
         return this.a($$0, $$1, $$2, dmy.a);
      }

      public boolean a(dbc $$0, iz $$1, je $$2, dmy $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(dbc $$0, iz $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dsa x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dtb A() {
         return this.x;
      }

      static final class a {
         private static final je[] e = je.values();
         private static final int f = dmy.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final ewi[] i;
         protected final ewi b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dsa $$0) {
            dex $$1 = $$0.b();
            this.a = $$0.i(dbl.a, iz.c);
            this.g = $$1.a_($$0, dbl.a, iz.c);
            this.h = $$1.g($$0, dbl.a, iz.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new ewi[e.length];
               ewi $$2 = $$1.f($$0, dbl.a, iz.c);

               for (je $$3 : e) {
                  this.i[$$3.ordinal()] = ewf.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, dbl.a, iz.c, evu.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lp.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(je.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (je $$4 : e) {
                  for (dmy $$5 : dmy.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, dbl.a, iz.c, $$4);
                  }
               }

               this.d = dex.a($$0.k(dbl.a, iz.c));
            }
         }

         public boolean a(je $$0, dmy $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(je $$0, dmy $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      evp evaluate(dsa var1, dbc var2, iz var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<drz.d> a = Codec.unit(() -> a());
      Function<dsa, enx> b = $$0 -> enx.a;
      boolean c = true;
      dmk d = dmk.f;
      ToIntFunction<dsa> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      ald<eql> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      eny t = eny.a;
      boolean u = true;
      dtb v = dtb.a;
      boolean w;
      drz.e<bsy<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, je.b) && $$0.h() < 14;
      drz.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      drz.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      drz.f A = this.z;
      drz.f B = ($$0, $$1, $$2) -> false;
      drz.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cpj E = cpl.g;
      Optional<drz.b> F = Optional.empty();

      private d() {
      }

      public static drz.d a() {
         return new drz.d();
      }

      public static drz.d a(drz $$0) {
         drz.d $$1 = b($$0);
         drz.d $$2 = $$0.aP;
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
      public static drz.d b(drz $$0) {
         drz.d $$1 = new drz.d();
         drz.d $$2 = $$0.aP;
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

      public drz.d a(ctg $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public drz.d a(enx $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public drz.d a(Function<dsa, enx> $$0) {
         this.b = $$0;
         return this;
      }

      public drz.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public drz.d c() {
         this.n = false;
         return this;
      }

      public drz.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public drz.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public drz.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public drz.d a(dmk $$0) {
         this.d = $$0;
         return this;
      }

      public drz.d a(ToIntFunction<dsa> $$0) {
         this.e = $$0;
         return this;
      }

      public drz.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public drz.d d() {
         return this.d(0.0F);
      }

      public drz.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public drz.d e() {
         this.i = true;
         return this;
      }

      public drz.d f() {
         this.D = true;
         return this;
      }

      public drz.d g() {
         this.m = eqc.a;
         return this;
      }

      public drz.d a(dex $$0) {
         this.m = $$0.v();
         return this;
      }

      public drz.d h() {
         this.p = true;
         return this;
      }

      public drz.d i() {
         this.q = true;
         return this;
      }

      public drz.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public drz.d k() {
         this.r = true;
         return this;
      }

      public drz.d a(eny $$0) {
         this.t = $$0;
         return this;
      }

      public drz.d l() {
         this.o = true;
         return this;
      }

      public drz.d a(drz.e<bsy<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public drz.d a(drz.f $$0) {
         this.y = $$0;
         return this;
      }

      public drz.d b(drz.f $$0) {
         this.z = $$0;
         return this;
      }

      public drz.d c(drz.f $$0) {
         this.A = $$0;
         return this;
      }

      public drz.d d(drz.f $$0) {
         this.B = $$0;
         return this;
      }

      public drz.d e(drz.f $$0) {
         this.C = $$0;
         return this;
      }

      public drz.d m() {
         this.h = true;
         return this;
      }

      public drz.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public drz.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public drz.d a(drz.c $$0) {
         switch ($$0) {
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dex $$3 = $$0x.b();
                  long $$4 = ayx.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.ar_();
                  double $$6 = ayx.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = ayx.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new evp($$6, 0.0, $$7);
               });
               break;
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dex $$3 = $$0x.b();
                  long $$4 = ayx.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.at_();
                  float $$6 = $$3.ar_();
                  double $$7 = ayx.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = ayx.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new evp($$7, $$5, $$8);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public drz.d n() {
         this.u = false;
         return this;
      }

      public drz.d a(cph... $$0) {
         this.E = cpl.e.a($$0);
         return this;
      }

      public drz.d a(dtb $$0) {
         this.v = $$0;
         return this;
      }

      public drz.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dsa var1, dbc var2, iz var3, A var4);
   }

   public interface f {
      boolean test(dsa var1, dbc var2, iz var3);
   }
}
