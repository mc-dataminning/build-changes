import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dig extends djd {
   public static final MapCodec<dig> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtx.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dig::new)
   );
   public static final dtb b = dta.u;
   public static final dtb c = dta.w;
   public static final dtb d = dta.q;
   protected static final ewy e = dfh.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ewy f = dfh.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final ewy g = dfh.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final ewy h = dfh.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final ewy i = dfh.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ewy j = dfh.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ewy k = dfh.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ewy l = dfh.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ewy m = ewv.a(dfh.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dfh.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final ewy n = ewv.a(dfh.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dfh.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final ewy o = ewv.a(dfh.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dfh.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final ewy F = ewv.a(dfh.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dfh.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dtx G;

   @Override
   public MapCodec<dig> a() {
      return a;
   }

   public dig(dtx $$0, dsj.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == jf.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == jf.a.a ? f : e;
      }
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      jf.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected ewy b_(dsk $$0, dbl $$1, ja $$2) {
      if ($$0.c(b)) {
         return ewv.a();
      } else {
         return $$0.c(aE).o() == jf.a.c ? k : l;
      }
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      if ($$0.c(b)) {
         return ewv.a();
      } else {
         return $$0.c(aE).o() == jf.a.c ? i : j;
      }
   }

   @Override
   protected ewy f(dsk $$0, dbl $$1, ja $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == jf.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == jf.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
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
   public dsk a(cxm $$0) {
      dcf $$1 = $$0.q();
      ja $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jf $$4 = $$0.g();
      jf.a $$5 = $$4.o();
      boolean $$6 = $$5 == jf.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == jf.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dsk $$0) {
      return $$0.a(avw.L);
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jf $$5 = $$3.cI();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), avi.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dxg.h : dxg.d, $$2);
      return bqg.a($$1.B);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dbx $$3, BiConsumer<cuc, ja> $$4) {
      if ($$3.n() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), avi.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dxg.d : dxg.h, $$2, dxg.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), avi.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dxg.h : dxg.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dsk $$0, jf $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
