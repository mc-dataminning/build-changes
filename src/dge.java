import com.mojang.serialization.MapCodec;

public class dge extends djq {
   public static final MapCodec<dge> a = b(dge::new);

   @Override
   public MapCodec<dge> a() {
      return a;
   }

   public dge(dtb.d $$0) {
      super($$0);
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         ir $$4 = $$2.d();
         dtc $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), iw.b)) {
            ayp.a($$1, $$2, $$3, lb.F);
         }
      }
   }
}
