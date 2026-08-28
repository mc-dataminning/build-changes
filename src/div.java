import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class div extends djs {
   public static final MapCodec<div> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dun.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, div::new)
   );
   public static final dtr b = dtq.u;
   public static final dtr c = dtq.w;
   public static final dtr d = dtq.q;
   protected static final exp e = dfw.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final exp f = dfw.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final exp g = dfw.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final exp h = dfw.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final exp i = dfw.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final exp j = dfw.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final exp k = dfw.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final exp l = dfw.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final exp m = exm.a(dfw.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dfw.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final exp n = exm.a(dfw.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dfw.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final exp o = exm.a(dfw.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dfw.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final exp F = exm.a(dfw.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dfw.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dun G;

   @Override
   public MapCodec<div> a() {
      return a;
   }

   public div(dun $$0, dsz.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ji.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == ji.a.a ? f : e;
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      ji.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected exp b_(dta $$0, dca $$1, jd $$2) {
      if ($$0.c(b)) {
         return exm.a();
      } else {
         return $$0.c(aE).o() == ji.a.c ? k : l;
      }
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      if ($$0.c(b)) {
         return exm.a();
      } else {
         return $$0.c(aE).o() == ji.a.c ? i : j;
      }
   }

   @Override
   protected exp f(dta $$0, dca $$1, jd $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ji.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == ji.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
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
   public dta a(cyb $$0) {
      dcu $$1 = $$0.q();
      jd $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      ji $$4 = $$0.g();
      ji.a $$5 = $$4.o();
      boolean $$6 = $$5 == ji.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == ji.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dta $$0) {
      return $$0.a(awd.L);
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ji $$5 = $$3.cI();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), avp.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dxw.h : dxw.d, $$2);
      return bqq.a($$1.B);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dcm $$3, BiConsumer<cuo, jd> $$4) {
      if ($$3.n() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), avp.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dxw.d : dxw.h, $$2, dxw.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), avp.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dxw.h : dxw.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dta $$0, ji $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
