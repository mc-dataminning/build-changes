import com.mojang.serialization.MapCodec;

public class dof extends djk {
   public static final MapCodec<dof> a = b(dof::new);
   private static final int b = 20;

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   public dof(dwu.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, buj $$3) {
      if (!$$3.ce() && $$3 instanceof bvf) {
         $$3.a($$0.ak().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      djr.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$4 == jn.b && $$6.a(djm.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
