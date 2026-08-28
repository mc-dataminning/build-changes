import com.mojang.serialization.MapCodec;

public class dnw extends diz {
   public static final MapCodec<dnw> a = b(dnw::new);
   public static final int b = 3;
   public static final dwu c = dwl.as;
   private static final fas[] d = new fas[]{
      diq.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   protected dnw(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dvv $$0, der $$1, jh $$2) {
      return $$0.a(dis.dW);
   }

   @Override
   protected boolean f(dvv $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return new cwm(cwq.sA);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c);
   }
}
