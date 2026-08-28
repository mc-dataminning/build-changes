import com.mojang.serialization.MapCodec;

public class dqs extends djh {
   public static final MapCodec<dqs> n = b(dqs::new);

   @Override
   public MapCodec<dqs> a() {
      return n;
   }

   public dqs(dvi.d $$0) {
      super(() -> dso.c, $$0);
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new duh($$0, $$1);
   }

   @Override
   protected aws<ali> c() {
      return awv.i.b(awv.ai);
   }

   @Override
   protected boolean f_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return azk.a(dst.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
