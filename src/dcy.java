import com.mojang.serialization.MapCodec;

public class dcy extends cuj {
   public static final MapCodec<dcy> a = b(dcy::new);
   protected static final eiy b = cua.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dcy> a() {
      return a;
   }

   protected dcy(dga.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof alq && $$3 instanceof ceq) {
         $$1.a(new ht($$2), true, $$3);
      }
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b;
   }

   @Override
   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      ebe $$3 = $$1.b_($$2);
      ebe $$4 = $$1.b_($$2.c());
      return ($$3.a() == ebf.c || $$0.b() instanceof cxw) && $$4.a() == ebf.a;
   }
}
