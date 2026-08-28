import com.mojang.serialization.MapCodec;

public class dlp extends doy {
   public static final MapCodec<dlp> a = b(dlp::new);

   @Override
   public MapCodec<dlp> a() {
      return a;
   }

   public dlp(dxu.d $$0) {
      super($$0);
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         jh $$4 = $$2.e();
         dxv $$5 = $$1.a_($$4);
         if (!a($$5.g($$1, $$4), jm.b)) {
            bai.a($$1, $$2, $$3, ls.H);
         }
      }
   }
}
