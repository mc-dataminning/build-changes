import com.mojang.serialization.MapCodec;

public class dqr extends dlu {
   public static final MapCodec<dqr> a = b(dqr::new);
   private static final int b = 20;

   @Override
   public MapCodec<dqr> a() {
      return a;
   }

   public dqr(dzn.d $$0) {
      super($$0);
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, bwa $$3) {
      if (!$$3.ce() && $$3 instanceof bwz) {
         $$3.a($$0.al().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      dmb.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$4 == ja.b && $$6.a(dlw.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
