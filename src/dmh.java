import com.mojang.serialization.MapCodec;

public class dmh extends dpc {
   public static final MapCodec<dmh> a = b(dmh::new);

   @Override
   public MapCodec<dmh> a() {
      return a;
   }

   public dmh(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jm.a.b));
   }

   @Override
   public void a(dfm $$0, dvv $$1, jh $$2, bul $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.ai().l());
   }
}
