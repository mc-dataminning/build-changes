import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlh extends dme {
   public static final MapCodec<dlh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxa.a.fieldOf("wood_type").forGetter($$0x -> $$0x.H), t()).apply($$0, dlh::new)
   );
   public static final dwf b = dwe.u;
   public static final dwf c = dwe.w;
   public static final dwf d = dwe.q;
   protected static final fal e = dij.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fal f = dij.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final fal g = dij.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final fal h = dij.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final fal i = dij.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fal j = dij.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fal k = dij.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fal l = dij.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fal m = fai.a(dij.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dij.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final fal n = fai.a(dij.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dij.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final fal o = fai.a(dij.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dij.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final fal G = fai.a(dij.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dij.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dxa H;

   @Override
   public MapCodec<dlh> a() {
      return a;
   }

   public dlh(dxa $$0, dvn.d $$1) {
      super($$1.a($$0.d()));
      this.H = $$0;
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jm.a.a ? h : g;
      } else {
         return $$0.c(aF).o() == jm.a.a ? f : e;
      }
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      jm.a $$8 = $$4.o();
      if ($$0.c(aF).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected fal b_(dvo $$0, dek $$1, jh $$2) {
      if ($$0.c(b)) {
         return fai.a();
      } else {
         return $$0.c(aF).o() == jm.a.c ? k : l;
      }
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      if ($$0.c(b)) {
         return fai.a();
      } else {
         return $$0.c(aF).o() == jm.a.c ? i : j;
      }
   }

   @Override
   protected fal d_(dvo $$0) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jm.a.a ? G : o;
      } else {
         return $$0.c(aF).o() == jm.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
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
   public dvo a(czw $$0) {
      dff $$1 = $$0.q();
      jh $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jm $$4 = $$0.g();
      jm.a $$5 = $$4.o();
      boolean $$6 = $$5 == jm.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jm.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(aF, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dvo $$0) {
      return $$0.a(axd.M);
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jm $$5 = $$3.cQ();
         if ($$0.c(aF) == $$5.g()) {
            $$0 = $$0.b(aF, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.H.g() : this.H.f(), awp.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? eak.h : eak.d, $$2);
      return bsh.a;
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, dex $$3, BiConsumer<cwf, jh> $$4) {
      if ($$3.f() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.H.f() : this.H.g(), awp.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? eak.d : eak.h, $$2, eak.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.H.g() : this.H.f(), awp.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? eak.h : eak.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(aF, b, c, d);
   }

   public static boolean a(dvo $$0, jm $$1) {
      return $$0.c(aF).o() == $$1.h().o();
   }
}
