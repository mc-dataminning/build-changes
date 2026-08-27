import com.mojang.serialization.MapCodec;

public class dar extends czb {
   public static final MapCodec<dar> a = b(dar::new);
   protected static final float b = 6.0F;
   protected static final eos c = cys.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dar> a() {
      return a;
   }

   protected dar(dli.d $$0) {
      super($$0);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return c;
   }

   @Override
   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      return $$0.a(aua.ce);
   }
}
