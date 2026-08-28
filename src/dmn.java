import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmn extends dnl {
   public static final MapCodec<dmn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyk.a.fieldOf("wood_type").forGetter($$0x -> $$0x.H), t()).apply($$0, dmn::new)
   );
   public static final dxp b = dxo.z;
   public static final dxp c = dxo.B;
   public static final dxp d = dxo.u;
   protected static final fbv e = djn.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fbv f = djn.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final fbv g = djn.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final fbv h = djn.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final fbv i = djn.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fbv j = djn.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fbv k = djn.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fbv l = djn.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fbv m = fbs.a(djn.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), djn.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final fbv n = fbs.a(djn.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), djn.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final fbv o = fbs.a(djn.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), djn.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final fbv G = fbs.a(djn.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), djn.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dyk H;

   @Override
   public MapCodec<dmn> a() {
      return a;
   }

   public dmn(dyk $$0, dwx.d $$1) {
      super($$1.a($$0.d()));
      this.H = $$0;
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jn.a.a ? h : g;
      } else {
         return $$0.c(aF).o() == jn.a.a ? f : e;
      }
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      jn.a $$8 = $$4.o();
      if ($$0.c(aF).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected fbv b_(dwy $$0, dfo $$1, ji $$2) {
      if ($$0.c(b)) {
         return fbs.a();
      } else {
         return $$0.c(aF).o() == jn.a.c ? k : l;
      }
   }

   @Override
   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      if ($$0.c(b)) {
         return fbs.a();
      } else {
         return $$0.c(aF).o() == jn.a.c ? i : j;
      }
   }

   @Override
   protected fbv d_(dwy $$0) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jn.a.a ? G : o;
      } else {
         return $$0.c(aF).o() == jn.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
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
   public dwy a(dah $$0) {
      dgj $$1 = $$0.q();
      ji $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jn $$4 = $$0.g();
      jn.a $$5 = $$4.o();
      boolean $$6 = $$5 == jn.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jn.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(aF, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dwy $$0) {
      return $$0.a(awp.N);
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jn $$5 = $$3.cO();
         if ($$0.c(aF) == $$5.g()) {
            $$0 = $$0.b(aF, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.H.g() : this.H.f(), awb.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? ebu.h : ebu.d, $$2);
      return bsl.a;
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, dgb $$3, BiConsumer<cwq, ji> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.H.f() : this.H.g(), awb.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? ebu.d : ebu.h, $$2, ebu.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.H.g() : this.H.f(), awb.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? ebu.h : ebu.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(aF, b, c, d);
   }

   public static boolean a(dwy $$0, jn $$1) {
      return $$0.c(aF).o() == $$1.h().o();
   }
}
