import com.mojang.serialization.MapCodec;

public class dlp extends dmr {
   public static final MapCodec<dlp> a = b(dlp::new);

   @Override
   public MapCodec<? extends dlp> a() {
      return a;
   }

   public dlp(eas.d $$0) {
      super($$0);
   }

   @Override
   protected void a(djm $$0, eat $$1, fey $$2, csh $$3) {
      if (!$$0.C) {
         iv $$4 = $$2.b();
         $$0.a(null, $$4, awn.E, awo.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
