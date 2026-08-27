import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diw extends czo {
   public static final MapCodec<diw> a = b(diw::new);
   public static final doe<dmo> b = dnr.bz;
   public static final dnv c = ddx.aE;

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   public diw(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ih.c).a(b, dmo.a));
   }

   @Override
   public bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      if ($$0.b() || $$1.c(b) != dmo.b) {
         return bnf.d;
      } else if ($$2 instanceof apf $$7) {
         if ($$7.c_($$3) instanceof dmj $$9) {
            dmj.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bnf.a;
         } else {
            return bnf.d;
         }
      } else {
         return bnf.b;
      }
   }

   @Nullable
   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dmj($$0, $$1);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return $$0 instanceof apf $$3
         ? a($$2, dkk.R, ($$1x, $$2x, $$3x, $$4) -> dmj.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dkk.R, ($$0x, $$1x, $$2x, $$3x) -> dmj.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(c, $$0.g().g());
   }

   @Override
   public dnb a(dnb $$0, dgo $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dgh b_(dnb $$0) {
      return dgh.c;
   }
}
