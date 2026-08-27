import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dgz extends dhw {
   public static final MapCodec<dgz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsq.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dgz::new)
   );
   public static final dru b = drt.u;
   public static final dru c = drt.w;
   public static final dru d = drt.q;
   protected static final evf e = dea.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final evf f = dea.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final evf g = dea.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final evf h = dea.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final evf i = dea.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final evf j = dea.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final evf k = dea.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final evf l = dea.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final evf m = evc.a(dea.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dea.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final evf n = evc.a(dea.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dea.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final evf o = evc.a(dea.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dea.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final evf F = evc.a(dea.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dea.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dsq G;

   @Override
   public MapCodec<dgz> a() {
      return a;
   }

   public dgz(dsq $$0, drc.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == it.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == it.a.a ? f : e;
      }
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      it.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected evf b_(drd $$0, daf $$1, io $$2) {
      if ($$0.c(b)) {
         return evc.a();
      } else {
         return $$0.c(aE).o() == it.a.c ? k : l;
      }
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      if ($$0.c(b)) {
         return evc.a();
      } else {
         return $$0.c(aE).o() == it.a.c ? i : j;
      }
   }

   @Override
   protected evf f(drd $$0, daf $$1, io $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == it.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == it.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
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
   public drd a(cxb $$0) {
      daz $$1 = $$0.q();
      io $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      it $$4 = $$0.g();
      it.a $$5 = $$4.o();
      boolean $$6 = $$5 == it.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == it.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.n().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(drd $$0) {
      return $$0.a(avx.L);
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
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
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), avj.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dvw.h : dvw.d, $$2);
      return bpw.a($$1.B);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dar $$3, BiConsumer<ctq, io> $$4) {
      if ($$3.j() == dar.a.d && !$$1.x_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), avj.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dvw.d : dvw.h, $$2, dvw.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), avj.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dvw.h : dvw.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(drd $$0, it $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
