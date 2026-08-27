import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dce extends dda {
   public static final MapCodec<dce> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dnr.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dce::new)
   );
   public static final dmv b = dmu.u;
   public static final dmv c = dmu.w;
   public static final dmv d = dmu.q;
   protected static final epo e = czf.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final epo f = czf.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final epo g = czf.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final epo h = czf.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final epo i = czf.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final epo j = czf.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final epo k = czf.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final epo l = czf.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final epo m = epl.a(czf.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), czf.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final epo n = epl.a(czf.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), czf.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final epo o = epl.a(czf.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), czf.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final epo F = epl.a(czf.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), czf.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dnr G;

   @Override
   public MapCodec<dce> a() {
      return a;
   }

   public dce(dnr $$0, dmd.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ih.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == ih.a.a ? f : e;
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      ih.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected epo b_(dme $$0, cvk $$1, ib $$2) {
      if ($$0.c(b)) {
         return epl.a();
      } else {
         return $$0.c(aE).o() == ih.a.c ? k : l;
      }
   }

   @Override
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      if ($$0.c(b)) {
         return epl.a();
      } else {
         return $$0.c(aE).o() == ih.a.c ? i : j;
      }
   }

   @Override
   protected epo f(dme $$0, cvk $$1, ib $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ih.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == ih.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      switch ($$3) {
         case a:
            return $$0.c(b);
         case b:
            return false;
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   public dme a(crx $$0) {
      cwe $$1 = $$0.q();
      ib $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      ih $$4 = $$0.g();
      ih.a $$5 = $$4.o();
      boolean $$6 = $$5 == ih.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == ih.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dme $$0) {
      return $$0.a(aue.L);
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ih $$5 = $$3.cB();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), atq.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dqr.h : dqr.d, $$2);
      return bml.a($$1.B);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, cvw $$3, BiConsumer<cpq, ib> $$4) {
      if ($$3.j() == cvw.a.d && !$$1.y_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), atq.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dqr.d : dqr.h, $$2, dqr.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), atq.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dqr.h : dqr.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dme $$0, ih $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
