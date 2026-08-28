import com.mojang.serialization.MapCodec;

public class dnh extends dqe {
   public static final MapCodec<dnh> a = b(dnh::new);

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   public dnh(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jn.a.b));
   }

   @Override
   public void a(dgj $$0, dwy $$1, ji $$2, bum $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.ak().l());
   }
}
