import com.mojang.serialization.MapCodec;

public class ddu extends cyx {
   public static final MapCodec<ddu> a = b(ddu::new);
   public static final int b = 3;
   public static final dmf c = dlv.as;
   private static final eol[] d = new eol[]{
      cyo.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   protected ddu(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dlf $$0, cut $$1, hz $$2) {
      return $$0.a(cyq.dW);
   }

   @Override
   protected boolean e_(dlf $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return new coz(cpc.si);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c);
   }
}
