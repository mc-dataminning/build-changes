import com.mojang.serialization.MapCodec;

public class dog extends drb {
   public static final MapCodec<dog> a = b(dog::new);

   @Override
   public MapCodec<dog> a() {
      return a;
   }

   public dog(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jm.a.b));
   }

   @Override
   public void a(dhi $$0, dxv $$1, jh $$2, bvk $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.aj().l());
   }
}
