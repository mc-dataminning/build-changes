import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtd extends djp {
   public static final MapCodec<dtd> a = b(dtd::new);
   public static final dyq<dxb> b = dye.bC;
   public static final dyl<jm> c = dob.aF;
   public static final dyf d = dye.bD;

   @Override
   public MapCodec<dtd> a() {
      return a;
   }

   public dtd(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jm.c).b(b, dxb.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      if (!$$0.f() && $$1.c(b) == dxb.b) {
         if ($$2 instanceof arx $$7) {
            if (!($$7.c_($$3) instanceof dww $$8)) {
               return bta.f;
            }

            dww.b.a($$7, $$3, $$1, $$8.f(), $$8.b(), $$8.c(), $$4, $$0);
         }

         return bta.b;
      } else {
         return bta.f;
      }
   }

   @Nullable
   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dww($$0, $$1);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return $$0 instanceof arx $$3
         ? a($$2, dus.S, ($$1x, $$2x, $$3x, $$4) -> dww.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dus.S, ($$0x, $$1x, $$2x, $$3x) -> dww.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public dxo a(dxo $$0, dqv $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dqo a_(dxo $$0) {
      return dqo.c;
   }
}
