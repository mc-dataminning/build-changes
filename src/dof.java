import com.mojang.serialization.MapCodec;

public class dof extends dra {
   public static final MapCodec<dof> a = b(dof::new);

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   public dof(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jm.a.b));
   }

   @Override
   public void a(dhh $$0, dxu $$1, jh $$2, bvj $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.aj().l());
   }
}
