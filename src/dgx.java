import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dgx extends dhu {
   public static final MapCodec<dgx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dso.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dgx::new)
   );
   public static final drs b = drr.u;
   public static final drs c = drr.w;
   public static final drs d = drr.q;
   protected static final evd e = ddy.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final evd f = ddy.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final evd g = ddy.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final evd h = ddy.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final evd i = ddy.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final evd j = ddy.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final evd k = ddy.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final evd l = ddy.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final evd m = eva.a(ddy.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), ddy.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final evd n = eva.a(ddy.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), ddy.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final evd o = eva.a(ddy.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), ddy.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final evd F = eva.a(ddy.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), ddy.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dso G;

   @Override
   public MapCodec<dgx> a() {
      return a;
   }

   public dgx(dso $$0, dra.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == it.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == it.a.a ? f : e;
      }
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      it.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected evd b_(drb $$0, dad $$1, io $$2) {
      if ($$0.c(b)) {
         return eva.a();
      } else {
         return $$0.c(aE).o() == it.a.c ? k : l;
      }
   }

   @Override
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      if ($$0.c(b)) {
         return eva.a();
      } else {
         return $$0.c(aE).o() == it.a.c ? i : j;
      }
   }

   @Override
   protected evd f(drb $$0, dad $$1, io $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == it.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == it.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
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
   public drb a(cwz $$0) {
      dax $$1 = $$0.q();
      io $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      it $$4 = $$0.g();
      it.a $$5 = $$4.o();
      boolean $$6 = $$5 == it.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == it.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.n().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(drb $$0) {
      return $$0.a(avw.L);
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         it $$5 = $$3.cH();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), avi.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dvu.h : dvu.d, $$2);
      return bpu.a($$1.B);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, dap $$3, BiConsumer<cto, io> $$4) {
      if ($$3.j() == dap.a.d && !$$1.x_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), avi.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dvu.d : dvu.h, $$2, dvu.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), avi.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dvu.h : dvu.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(drb $$0, it $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
