import com.mojang.serialization.MapCodec;

public class djh extends dej {
   public static final MapCodec<djh> a = b(djh::new);
   public static final int b = 3;
   public static final dsd c = drt.as;
   private static final evf[] d = new evf[]{
      dea.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   protected djh(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      return $$0.a(dec.dW);
   }

   @Override
   protected boolean d_(drd $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return new ctq(ctt.sj);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c);
   }
}
