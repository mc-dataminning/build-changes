import com.mojang.serialization.MapCodec;

public class dle extends dnz {
   public static final MapCodec<dle> a = b(dle::new);

   @Override
   public MapCodec<dle> a() {
      return a;
   }

   public dle(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jk.a.b));
   }

   @Override
   public void a(dej $$0, dus $$1, jf $$2, btr $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.ak().l());
   }
}
