import com.mojang.serialization.MapCodec;

public class dne extends dqb {
   public static final MapCodec<dne> a = b(dne::new);

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   public dne(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jn.a.b));
   }

   @Override
   public void a(dgg $$0, dwv $$1, ji $$2, buj $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.ak().l());
   }
}
