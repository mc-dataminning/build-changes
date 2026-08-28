import com.mojang.serialization.MapCodec;

public class dob extends dxa {
   public static final MapCodec<dob> a = b(dob::new);
   private static final fgw b = dno.b(14.0, 0.0, 12.0);

   @Override
   public MapCodec<? extends dob> a() {
      return a;
   }

   public dob(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b;
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      ebq $$3 = $$1.a_($$2);
      return $$3.a(dnq.eg) || $$3.a(dnq.cN) || $$3.a($$1, $$2, jc.b, dvz.b);
   }
}
