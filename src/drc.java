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

public abstract class drc implements coi {
   protected static final it[] aF = new it[]{it.e, it.f, it.c, it.d, it.a, it.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dln aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final col aO;
   protected final drc.d aP;
   @Nullable
   protected akm<epm> aQ;

   public drc(drc.d $$0) {
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

   public drc.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dea> a();

   protected static <B extends dea> RecordCodecBuilder<B, drc.d> u() {
      return drc.d.a.fieldOf("properties").forGetter(drc::t);
   }

   public static <B extends dea> MapCodec<B> b(Function<drc.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(drd $$0, dba $$1, io $$2, int $$3, int $$4) {
   }

   protected boolean a(drd $$0, enl $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(dao.a, io.c);
         case b:
            return $$0.u().a(awc.a);
         case c:
            return !$$0.r(dao.a, io.c);
         default:
            return false;
      }
   }

   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$0;
   }

   protected boolean a(drd $$0, drd $$1, it $$2) {
      return false;
   }

   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      agb.a($$1, $$2);
   }

   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
   }

   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(drd $$0, daz $$1, io $$2, dar $$3, BiConsumer<ctq, io> $$4) {
      if (!$$0.i() && $$3.j() != dar.a.d) {
         dea $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cly;
         if ($$5.a($$3) && $$1 instanceof aqn $$7) {
            doi $$8 = $$0.t() ? $$1.c_($$2) : null;
            epk.a $$9 = new epk.a($$7).a(erz.f, eum.b($$2)).a(erz.i, ctq.i).b(erz.h, $$8).b(erz.a, $$3.g());
            if ($$3.j() == dar.a.c) {
               $$9.a(erz.j, $$3.a());
            }

            $$0.a($$7, $$2, ctq.i, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dec.a.n(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      return bpw.d;
   }

   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      return bpy.d;
   }

   protected boolean a(drd $$0, daz $$1, io $$2, int $$3, int $$4) {
      return false;
   }

   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   protected boolean f_(drd $$0) {
      return false;
   }

   protected boolean e_(drd $$0) {
      return false;
   }

   protected emw b_(drd $$0) {
      return emx.a.g();
   }

   protected boolean c_(drd $$0) {
      return false;
   }

   protected float as_() {
      return 0.25F;
   }

   protected float au_() {
      return 0.2F;
   }

   @Override
   public col i() {
      return this.aO;
   }

   protected drd a(drd $$0, dkn $$1) {
      return $$0;
   }

   protected drd a(drd $$0, dix $$1) {
      return $$0;
   }

   protected boolean a(drd $$0, cxb $$1) {
      return $$0.r() && ($$1.n().e() || !$$1.n().a(this.r()));
   }

   protected boolean a(drd $$0, emv $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<ctq> a(drd $$0, epk.a $$1) {
      akm<epm> $$2 = this.v();
      if ($$2 == epf.a) {
         return Collections.emptyList();
      } else {
         epk $$3 = $$1.a(erz.g, $$0).a(ery.r);
         aqn $$4 = $$3.a();
         epm $$5 = $$4.o().be().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(drd $$0, io $$1) {
      return ayf.a($$1);
   }

   protected evf f(drd $$0, daf $$1, io $$2) {
      return $$0.j($$1, $$2);
   }

   protected evf b_(drd $$0, daf $$1, io $$2) {
      return this.b($$0, $$1, $$2, eur.a());
   }

   protected evf a(drd $$0, daf $$1, io $$2) {
      return evc.a();
   }

   protected int g(drd $$0, daf $$1, io $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.P();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bqa b(drd $$0, daz $$1, io $$2) {
      return null;
   }

   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return true;
   }

   protected float d(drd $$0, daf $$1, io $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(drd $$0, daz $$1, io $$2) {
      return 0;
   }

   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return evc.b();
   }

   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      return this.aG ? $$0.j($$1, $$2) : evc.a();
   }

   protected boolean c(drd $$0, daf $$1, io $$2) {
      return dea.a($$0.k($$1, $$2));
   }

   protected boolean h(drd $$0, daf $$1, io $$2) {
      return dea.a($$0.c($$1, $$2));
   }

   protected evf c(drd $$0, daf $$1, io $$2, eur $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
   }

   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
   }

   protected float a(drd $$0, cly $$1, daf $$2, io $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(drd $$0, aqn $$1, io $$2, ctq $$3, boolean $$4) {
   }

   protected void a(drd $$0, daz $$1, io $$2, cly $$3) {
   }

   protected int a(drd $$0, daf $$1, io $$2, it $$3) {
      return 0;
   }

   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
   }

   protected int b(drd $$0, daf $$1, io $$2, it $$3) {
      return 0;
   }

   public final akm<epm> v() {
      if (this.aQ == null) {
         akn $$0 = le.e.b(this.p());
         this.aQ = akm.a(lf.aU, $$0.d("blocks/"));
      }

      return this.aQ;
   }

   protected void a(daz $$0, drd $$1, eui $$2, cmq $$3) {
   }

   protected boolean a_(drd $$0, daf $$1, io $$2) {
      return !dea.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean d_(drd $$0) {
      return this.aI;
   }

   protected dln g_(drd $$0) {
      return this.aJ;
   }

   public abstract ctl r();

   protected abstract dea p();

   public ena w() {
      return this.aP.b.apply(this.p().n());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends drf<dea, drd> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final enb l;
      private final ena m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final drc.f q;
      private final drc.f r;
      private final drc.f s;
      private final drc.f t;
      private final drc.f u;
      private final Optional<drc.b> v;
      private final boolean w;
      private final dse x;
      private final boolean y;
      @Nullable
      protected drc.a.a a;
      private emw z = emx.a.g();
      private boolean A;

      protected a(dea $$0, Reference2ObjectArrayMap<dsg<?>, Comparable<?>> $$1, MapCodec<drd> $$2) {
         super($$0, $$1, $$2);
         drc.d $$3 = $$0.aP;
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
            evf $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               euh $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.b_(this.x());
         this.A = this.e.d_(this.x());
         if (!this.b().o()) {
            this.a = new drc.a.a(this.x());
         }

         this.k = this.D();
      }

      public dea b() {
         return this.e;
      }

      public ix<dea> c() {
         return this.e.q();
      }

      @Deprecated
      public boolean d() {
         dea $$0 = this.b();
         return $$0 != dec.bs && $$0 != dec.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(daf $$0, io $$1, bsc<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(daf $$0, io $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(daf $$0, io $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public evf a(daf $$0, io $$1, it $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : evc.a(this.c($$0, $$1), $$2);
      }

      public evf c(daf $$0, io $$1) {
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

      public ena d(daf $$0, io $$1) {
         return this.m;
      }

      public drd a(dkn $$0) {
         return this.b().a(this.x(), $$0);
      }

      public drd a(dix $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dkg l() {
         return this.b().a_(this.x());
      }

      public boolean e(daf $$0, io $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(daf $$0, io $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(daf $$0, io $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().e_(this.x());
      }

      public int b(daf $$0, io $$1, it $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().c_(this.x());
      }

      public int a(daz $$0, io $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(daf $$0, io $$1) {
         return this.n;
      }

      public float a(cly $$0, daf $$1, io $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(daf $$0, io $$1, it $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public enb o() {
         return this.l;
      }

      public boolean i(daf $$0, io $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            drd $$2 = this.x();
            return $$2.p() ? dea.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(drd $$0, it $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public evf j(daf $$0, io $$1) {
         return this.a($$0, $$1, eur.a());
      }

      public evf a(daf $$0, io $$1, eur $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public evf k(daf $$0, io $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, eur.a());
      }

      public evf b(daf $$0, io $$1, eur $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public evf l(daf $$0, io $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public evf c(daf $$0, io $$1, eur $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public evf m(daf $$0, io $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(daf $$0, io $$1, brw $$2) {
         return this.a($$0, $$1, $$2, it.b);
      }

      public final boolean a(daf $$0, io $$1, brw $$2, it $$3) {
         return dea.a(this.b($$0, $$1, eur.a($$2)), $$3);
      }

      public eum n(daf $$0, io $$1) {
         return this.v.<eum>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(eum.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(daz $$0, io $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(daz $$0, io $$1, dea $$2, io $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dba $$0, io $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dba $$0, io $$1, int $$2, int $$3) {
         io.a $$4 = new io.a();

         for (it $$5 : drc.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(dba $$0, io $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dba $$0, io $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(daz $$0, io $$1, drd $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(daz $$0, io $$1, drd $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(daz $$0, io $$1, dar $$2, BiConsumer<ctq, io> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(aqn $$0, io $$1, aym $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(aqn $$0, io $$1, aym $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(daz $$0, io $$1, brw $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(aqn $$0, io $$1, ctq $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<ctq> a(epk.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bpy a(ctq $$0, daz $$1, cly $$2, bpv $$3, eui $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bpw a(daz $$0, cly $$1, eui $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(daz $$0, io $$1, cly $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(daf $$0, io $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(daf $$0, io $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public drd a(it $$0, drd $$1, dba $$2, io $$3, io $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(enl $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cxb $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(emv $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(dbc $$0, io $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(daf $$0, io $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bqa b(daz $$0, io $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(awm<dea> $$0) {
         return this.b().q().a($$0);
      }

      public boolean a(awm<dea> $$0, Predicate<drc.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jb<dea> $$0) {
         return $$0.a(this.b().q());
      }

      public boolean a(ix<dea> $$0) {
         return this.a($$0.a());
      }

      public Stream<awm<dea>> s() {
         return this.b().q().c();
      }

      public boolean t() {
         return this.b() instanceof dgs;
      }

      @Nullable
      public <T extends doi> doj<T> a(daz $$0, dok<T> $$1) {
         return this.b() instanceof dgs ? ((dgs)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dea $$0) {
         return this.b() == $$0;
      }

      public boolean a(akm<dea> $$0) {
         return this.b().q().a($$0);
      }

      public emw u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(io $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dln w() {
         return this.b().g_(this.x());
      }

      public void a(daz $$0, drd $$1, eui $$2, cmq $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(daf $$0, io $$1, it $$2) {
         return this.a($$0, $$1, $$2, dmb.a);
      }

      public boolean a(daf $$0, io $$1, it $$2, dmb $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(daf $$0, io $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract drd x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dse A() {
         return this.x;
      }

      static final class a {
         private static final it[] e = it.values();
         private static final int f = dmb.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final evf[] i;
         protected final evf b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(drd $$0) {
            dea $$1 = $$0.b();
            this.a = $$0.i(dao.a, io.c);
            this.g = $$1.a_($$0, dao.a, io.c);
            this.h = $$1.g($$0, dao.a, io.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new evf[e.length];
               evf $$2 = $$1.f($$0, dao.a, io.c);

               for (it $$3 : e) {
                  this.i[$$3.ordinal()] = evc.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, dao.a, io.c, eur.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", le.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(it.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (it $$4 : e) {
                  for (dmb $$5 : dmb.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, dao.a, io.c, $$4);
                  }
               }

               this.d = dea.a($$0.k(dao.a, io.c));
            }
         }

         public boolean a(it $$0, dmb $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(it $$0, dmb $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      eum evaluate(drd var1, daf var2, io var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<drc.d> a = Codec.unit(() -> a());
      Function<drd, ena> b = $$0 -> ena.a;
      boolean c = true;
      dln d = dln.f;
      ToIntFunction<drd> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      akm<epm> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      enb t = enb.a;
      boolean u = true;
      dse v = dse.a;
      boolean w;
      drc.e<bsc<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, it.b) && $$0.h() < 14;
      drc.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      drc.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      drc.f A = this.z;
      drc.f B = ($$0, $$1, $$2) -> false;
      drc.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      col E = coo.g;
      Optional<drc.b> F = Optional.empty();

      private d() {
      }

      public static drc.d a() {
         return new drc.d();
      }

      public static drc.d a(drc $$0) {
         drc.d $$1 = b($$0);
         drc.d $$2 = $$0.aP;
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
      public static drc.d b(drc $$0) {
         drc.d $$1 = new drc.d();
         drc.d $$2 = $$0.aP;
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

      public drc.d a(csj $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public drc.d a(ena $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public drc.d a(Function<drd, ena> $$0) {
         this.b = $$0;
         return this;
      }

      public drc.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public drc.d c() {
         this.n = false;
         return this;
      }

      public drc.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public drc.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public drc.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public drc.d a(dln $$0) {
         this.d = $$0;
         return this;
      }

      public drc.d a(ToIntFunction<drd> $$0) {
         this.e = $$0;
         return this;
      }

      public drc.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public drc.d d() {
         return this.d(0.0F);
      }

      public drc.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public drc.d e() {
         this.i = true;
         return this;
      }

      public drc.d f() {
         this.D = true;
         return this;
      }

      public drc.d g() {
         this.m = epf.a;
         return this;
      }

      public drc.d a(dea $$0) {
         this.m = $$0.v();
         return this;
      }

      public drc.d h() {
         this.p = true;
         return this;
      }

      public drc.d i() {
         this.q = true;
         return this;
      }

      public drc.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public drc.d k() {
         this.r = true;
         return this;
      }

      public drc.d a(enb $$0) {
         this.t = $$0;
         return this;
      }

      public drc.d l() {
         this.o = true;
         return this;
      }

      public drc.d a(drc.e<bsc<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public drc.d a(drc.f $$0) {
         this.y = $$0;
         return this;
      }

      public drc.d b(drc.f $$0) {
         this.z = $$0;
         return this;
      }

      public drc.d c(drc.f $$0) {
         this.A = $$0;
         return this;
      }

      public drc.d d(drc.f $$0) {
         this.B = $$0;
         return this;
      }

      public drc.d e(drc.f $$0) {
         this.C = $$0;
         return this;
      }

      public drc.d m() {
         this.h = true;
         return this;
      }

      public drc.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public drc.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public drc.d a(drc.c $$0) {
         switch ($$0) {
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dea $$3 = $$0x.b();
                  long $$4 = ayf.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.as_();
                  double $$6 = ayf.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = ayf.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new eum($$6, 0.0, $$7);
               });
               break;
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dea $$3 = $$0x.b();
                  long $$4 = ayf.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.au_();
                  float $$6 = $$3.as_();
                  double $$7 = ayf.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = ayf.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new eum($$7, $$5, $$8);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public drc.d n() {
         this.u = false;
         return this;
      }

      public drc.d a(coj... $$0) {
         this.E = coo.e.a($$0);
         return this;
      }

      public drc.d a(dse $$0) {
         this.v = $$0;
         return this;
      }

      public drc.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(drd var1, daf var2, io var3, A var4);
   }

   public interface f {
      boolean test(drd var1, daf var2, io var3);
   }
}
