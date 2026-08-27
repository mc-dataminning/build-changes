import com.mojang.serialization.MapCodec;

public class czk extends cyo {
   public static final MapCodec<czk> a = b(czk::new);
   private static final ur b = ur.c("container.loom");

   @Override
   public MapCodec<czk> a() {
      return a;
   }

   protected czk(dgv.d $$0) {
      super($$0);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aqx.ax);
         return biq.b;
      }
   }

   @Override
   public bit b(dgw $$0, crs $$1, ht $$2) {
      return new biy(($$2x, $$3, $$4) -> new chj($$2x, $$3, cgp.a($$1, $$2)), b);
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(aE);
   }
}
