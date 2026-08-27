import com.mojang.serialization.MapCodec;

public class dds extends cvc {
   public static final MapCodec<dds> a = b(dds::new);
   protected static final ekb b = cut.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dds> a() {
      return a;
   }

   protected dds(dgv.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof ama && $$3 instanceof cff) {
         $$1.a(new ht($$2), true, $$3);
      }
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return b;
   }

   @Override
   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      ecg $$3 = $$1.b_($$2);
      ecg $$4 = $$1.b_($$2.c());
      return ($$3.a() == ech.c || $$0.b() instanceof cyq) && $$4.a() == ech.a;
   }
}
