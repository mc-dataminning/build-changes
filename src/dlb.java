import com.mojang.serialization.MapCodec;

public class dlb extends dnw {
   public static final MapCodec<dlb> a = b(dlb::new);

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   public dlb(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jj.a.b));
   }

   @Override
   public void a(deg $$0, duo $$1, je $$2, bto $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.ak().l());
   }
}
