import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dbr extends dcn {
   public static final MapCodec<dbr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dmw.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dbr::new)
   );
   public static final dma b = dlz.u;
   public static final dma c = dlz.w;
   public static final dma d = dlz.q;
   protected static final eos e = cys.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eos f = cys.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final eos g = cys.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final eos h = cys.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final eos i = cys.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eos j = cys.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eos k = cys.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eos l = cys.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eos m = eop.a(cys.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), cys.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final eos n = eop.a(cys.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), cys.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final eos o = eop.a(cys.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), cys.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final eos F = eop.a(cys.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), cys.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dmw G;

   @Override
   public MapCodec<dbr> a() {
      return a;
   }

   public dbr(dmw $$0, dli.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ie.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == ie.a.a ? f : e;
      }
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      ie.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected eos b_(dlj $$0, cux $$1, hz $$2) {
      if ($$0.c(b)) {
         return eop.a();
      } else {
         return $$0.c(aE).o() == ie.a.c ? k : l;
      }
   }

   @Override
   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      if ($$0.c(b)) {
         return eop.a();
      } else {
         return $$0.c(aE).o() == ie.a.c ? i : j;
      }
   }

   @Override
   protected eos f(dlj $$0, cux $$1, hz $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ie.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == ie.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
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
   public dlj a(crk $$0) {
      cvr $$1 = $$0.q();
      hz $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      ie $$4 = $$0.g();
      ie.a $$5 = $$4.o();
      boolean $$6 = $$5 == ie.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == ie.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dlj $$0) {
      return $$0.a(aua.L);
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ie $$5 = $$3.cE();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), atm.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dpw.h : dpw.d, $$2);
      return blw.a($$1.B);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cvj $$3, BiConsumer<cpd, hz> $$4) {
      if ($$3.j() == cvj.a.d && !$$1.y_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), atm.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dpw.d : dpw.h, $$2, dpw.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), atm.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dpw.h : dpw.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dlj $$0, ie $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
