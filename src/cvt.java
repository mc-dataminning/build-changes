import java.util.List;

public class cvt extends ctd implements day {
   protected static final float a = 3.0F;
   protected static final eig b = csv.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<day.a> c;

   public cvt(bib $$0, int $$1, dfi.d $$2) {
      super($$2);
      int $$3;
      if ($$0.a()) {
         $$3 = $$1;
      } else {
         $$3 = $$1 * 20;
      }

      this.c = List.of(new day.a($$0, $$3));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      ehn $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<day.a> a() {
      return this.c;
   }
}
