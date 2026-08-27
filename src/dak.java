import javax.annotation.Nullable;

public class dak extends csm {
   private static final tf c = tf.c("container.stonecutter");
   public static final dfu a = cwf.aC;
   protected static final ehx b = csm.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   public dak(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c));
   }

   @Override
   public dfa a(clg $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apg.ay);
         return bgq.b;
      }
   }

   @Nullable
   @Override
   public bgt b(dfa $$0, cpm $$1, gu $$2) {
      return new bgy(($$2x, $$3, $$4) -> new cga($$2x, $$3, cep.a($$1, $$2)), c);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return b;
   }

   @Override
   public boolean g_(dfa $$0) {
      return true;
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
