import java.util.List;

public class cvv extends ctf implements dba {
   protected static final float a = 3.0F;
   protected static final eii b = csx.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<dba.a> c;

   public cvv(bid $$0, int $$1, dfk.d $$2) {
      super($$2);
      int $$3;
      if ($$0.a()) {
         $$3 = $$1;
      } else {
         $$3 = $$1 * 20;
      }

      this.c = List.of(new dba.a($$0, $$3));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      ehp $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<dba.a> a() {
      return this.c;
   }
}
