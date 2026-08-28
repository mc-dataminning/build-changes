import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dix extends dju {
   public static final MapCodec<dix> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dup.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dix::new)
   );
   public static final dtt b = dts.u;
   public static final dtt c = dts.w;
   public static final dtt d = dts.q;
   protected static final exv e = dfy.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final exv f = dfy.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final exv g = dfy.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final exv h = dfy.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final exv i = dfy.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final exv j = dfy.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final exv k = dfy.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final exv l = dfy.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final exv m = exs.a(dfy.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dfy.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final exv n = exs.a(dfy.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dfy.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final exv o = exs.a(dfy.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dfy.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final exv F = exs.a(dfy.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dfy.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dup G;

   @Override
   public MapCodec<dix> a() {
      return a;
   }

   public dix(dup $$0, dtb.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ji.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == ji.a.a ? f : e;
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      ji.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected exv b_(dtc $$0, dcc $$1, jd $$2) {
      if ($$0.c(b)) {
         return exs.a();
      } else {
         return $$0.c(aE).o() == ji.a.c ? k : l;
      }
   }

   @Override
   protected exv b(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      if ($$0.c(b)) {
         return exs.a();
      } else {
         return $$0.c(aE).o() == ji.a.c ? i : j;
      }
   }

   @Override
   protected exv f(dtc $$0, dcc $$1, jd $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ji.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == ji.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
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
   public dtc a(cyd $$0) {
      dcw $$1 = $$0.q();
      jd $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      ji $$4 = $$0.g();
      ji.a $$5 = $$4.o();
      boolean $$6 = $$5 == ji.a.c && (this.m($$1.a_($$2.h())) || this.m($$1.a_($$2.i())))
         || $$5 == ji.a.a && (this.m($$1.a_($$2.f())) || this.m($$1.a_($$2.g())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dtc $$0) {
      return $$0.a(awe.M);
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ji $$5 = $$3.cH();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), avq.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dxz.h : dxz.d, $$2);
      return bqr.a($$1.B);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dco $$3, BiConsumer<cuq, jd> $$4) {
      if ($$3.n() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), avq.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dxz.d : dxz.h, $$2, dxz.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), avq.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dxz.h : dxz.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dtc $$0, ji $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
