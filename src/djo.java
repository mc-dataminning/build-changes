import com.mojang.serialization.MapCodec;

public class djo extends dfy {
   public static final MapCodec<djo> d = b(djo::new);

   @Override
   protected MapCodec<? extends djo> a() {
      return d;
   }

   protected djo(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dtc $$0, dtc $$1, ji $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
