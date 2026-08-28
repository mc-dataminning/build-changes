import com.mojang.serialization.MapCodec;

public class dvh extends dme {
   public static final MapCodec<dvh> a = b(dvh::new);
   private static final feq b = dlu.b(14.0, 0.0, 1.5);

   @Override
   public MapCodec<dvh> a() {
      return a;
   }

   protected dvh(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof aro && $$3 instanceof ctc) {
         $$1.a(new iu($$2), true, $$3);
      }
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b;
   }

   @Override
   protected boolean b(dzo $$0, dhv $$1, iu $$2) {
      evv $$3 = $$1.b_($$2);
      evv $$4 = $$1.b_($$2.d());
      return ($$3.a() == evw.c || $$0.b() instanceof dpv) && $$4.a() == evw.a;
   }
}
