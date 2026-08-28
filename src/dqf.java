import com.mojang.serialization.MapCodec;

public class dqf extends dkn {
   public static final MapCodec<dqf> c = b(dqf::new);

   @Override
   public MapCodec<dqf> a() {
      return c;
   }

   public dqf(dzn.d $$0) {
      super($$0, kb.e);
   }

   @Override
   protected double b(dzo $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dzo $$0) {
      return true;
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aE();
      }
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return 3;
   }
}
