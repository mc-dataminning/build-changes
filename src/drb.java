import com.mojang.serialization.MapCodec;

public class drb extends dih {
   public static final MapCodec<drb> a = b(drb::new);
   protected static final fab b = dhy.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<drb> a() {
      return a;
   }

   protected drb(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof arm && $$3 instanceof cqh) {
         $$1.a(new jg($$2), true, $$3);
      }
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      ere $$3 = $$1.b_($$2);
      ere $$4 = $$1.b_($$2.d());
      return ($$3.a() == erf.c || $$0.b() instanceof dlv) && $$4.a() == erf.a;
   }
}
