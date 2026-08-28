import com.mojang.serialization.MapCodec;

public class dng extends dqd {
   public static final MapCodec<dng> a = b(dng::new);

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   public dng(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jn.a.b));
   }

   @Override
   public void a(dgi $$0, dwx $$1, ji $$2, buk $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.ak().l());
   }
}
