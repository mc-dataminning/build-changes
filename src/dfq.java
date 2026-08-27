import com.mojang.serialization.MapCodec;

public class dfq extends cwy {
   public static final MapCodec<dfq> a = b(dfq::new);
   protected static final eml b = cwp.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dfq> a() {
      return a;
   }

   protected dfq(djf.d $$0) {
      super($$0);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof and && $$3 instanceof chb) {
         $$1.a(new hx($$2), true, $$3);
      }
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return b;
   }

   @Override
   protected boolean b(djg $$0, csu $$1, hx $$2) {
      eeq $$3 = $$1.b_($$2);
      eeq $$4 = $$1.b_($$2.c());
      return ($$3.a() == eer.c || $$0.b() instanceof dam) && $$4.a() == eer.a;
   }
}
