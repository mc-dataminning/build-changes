import java.util.List;
import javax.annotation.Nullable;

public class cub extends ctj {
   private static final int j = 32;
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;

   public cub(ctj.a $$0) {
      super($$0);
   }

   @Override
   public cto a(cto $$0, dax $$1, bso $$2) {
      if ($$2 instanceof aqn $$3) {
         am.A.a($$3, $$0);
         $$3.b(avr.c.b(this));
      }

      $$0.a(1, $$2);
      if (!$$1.B) {
         $$1.a(null, $$2.dp(), avh.so, $$2.de(), 1.0F, 1.0F);
         Integer $$4 = $$0.a(kb.P, Integer.valueOf(0));
         $$2.e(bre.E);
         $$2.b(new brc(bre.E, 120000, $$4, false, false, true));
      }

      return $$0;
   }

   @Override
   public int b(cto $$0) {
      return 32;
   }

   @Override
   public cvj c(cto $$0) {
      return cvj.c;
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      return ctq.a($$0, $$1, $$2);
   }

   @Override
   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
      super.a($$0, $$1, $$2, $$3);
      Integer $$4 = $$0.a(kb.P, Integer.valueOf(0));
      List<brc> $$5 = List.of(new brc(bre.E, 120000, $$4, false, false, true));
      cvp.a($$5, $$2::add, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
   }
}
