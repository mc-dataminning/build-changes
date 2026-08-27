import java.util.List;

public class cvo extends csy implements dat {
   protected static final float a = 3.0F;
   protected static final eib b = csq.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<dat.a> c;

   public cvo(bhw $$0, int $$1, dfd.d $$2) {
      super($$2);
      int $$3;
      if ($$0.a()) {
         $$3 = $$1;
      } else {
         $$3 = $$1 * 20;
      }

      this.c = List.of(new dat.a($$0, $$3));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      ehi $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<dat.a> a() {
      return this.c;
   }
}
