import com.mojang.serialization.MapCodec;

public class dsd extends dkn {
   public static final MapCodec<dsd> n = b(dsd::new);

   @Override
   public MapCodec<dsd> a() {
      return n;
   }

   public dsd(dwu.d $$0) {
      super(() -> dtz.c, $$0);
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dvt($$0, $$1);
   }

   @Override
   protected awg<aku> c() {
      return awj.i.b(awj.ai);
   }

   @Override
   protected boolean f_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return ayy.a(due.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return $$3 == jn.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
