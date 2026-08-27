import com.mojang.serialization.MapCodec;

public class dhp extends cyx {
   public static final MapCodec<dhp> a = b(dhp::new);
   protected static final eol b = cyo.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dhp> a() {
      return a;
   }

   protected dhp(dle.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof aov && $$3 instanceof cjc) {
         $$1.a(new hz($$2), true, $$3);
      }
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b;
   }

   @Override
   protected boolean b(dlf $$0, cut $$1, hz $$2) {
      egp $$3 = $$1.b_($$2);
      egp $$4 = $$1.b_($$2.c());
      return ($$3.a() == egq.c || $$0.b() instanceof dcl) && $$4.a() == egq.a;
   }
}
