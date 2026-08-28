import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dia extends dix {
   public static final MapCodec<dia> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtr.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dia::new)
   );
   public static final dsv b = dsu.u;
   public static final dsv c = dsu.w;
   public static final dsv d = dsu.q;
   protected static final ewm e = dfb.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ewm f = dfb.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final ewm g = dfb.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final ewm h = dfb.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final ewm i = dfb.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ewm j = dfb.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ewm k = dfb.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ewm l = dfb.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ewm m = ewj.a(dfb.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dfb.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final ewm n = ewj.a(dfb.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dfb.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final ewm o = ewj.a(dfb.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dfb.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final ewm F = ewj.a(dfb.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dfb.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dtr G;

   @Override
   public MapCodec<dia> a() {
      return a;
   }

   public dia(dtr $$0, dsd.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == je.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == je.a.a ? f : e;
      }
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      je.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected ewm b_(dse $$0, dbg $$1, iz $$2) {
      if ($$0.c(b)) {
         return ewj.a();
      } else {
         return $$0.c(aE).o() == je.a.c ? k : l;
      }
   }

   @Override
   protected ewm b(dse $$0, dbg $$1, iz $$2, evy $$3) {
      if ($$0.c(b)) {
         return ewj.a();
      } else {
         return $$0.c(aE).o() == je.a.c ? i : j;
      }
   }

   @Override
   protected ewm f(dse $$0, dbg $$1, iz $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == je.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == je.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      switch ($$1) {
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
   public dse a(cyc $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      je $$4 = $$0.g();
      je.a $$5 = $$4.o();
      boolean $$6 = $$5 == je.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == je.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dse $$0) {
      return $$0.a(awp.L);
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         je $$5 = $$3.cH();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), awb.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dwx.h : dwx.d, $$2);
      return bqw.a($$1.B);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dbs $$3, BiConsumer<cur, iz> $$4) {
      if ($$3.j() == dbs.a.d && !$$1.x_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), awb.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dwx.d : dwx.h, $$2, dwx.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), awb.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dwx.h : dwx.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dse $$0, je $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
