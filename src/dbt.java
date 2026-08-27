import com.mojang.serialization.MapCodec;

public class dbt extends cwy {
   public static final MapCodec<dbt> a = b(dbt::new);
   protected static final eml b = cwp.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dbt> a() {
      return a;
   }

   public dbt(djf.d $$0) {
      super($$0);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return b;
   }

   @Override
   protected boolean b(djg $$0, csu $$1, hx $$2) {
      return $$0.a(asg.aK) || $$0.a(cwr.dX) || super.b($$0, $$1, $$2);
   }
}
