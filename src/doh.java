import com.mojang.serialization.MapCodec;

public class doh extends djm {
   public static final MapCodec<doh> a = b(doh::new);
   private static final int b = 20;

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   public doh(dww.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, bul $$3) {
      if (!$$3.ce() && $$3 instanceof bvh) {
         $$3.a($$0.ak().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      djt.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$4 == jn.b && $$6.a(djo.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
