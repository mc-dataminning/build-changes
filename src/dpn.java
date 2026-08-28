import com.mojang.serialization.MapCodec;

public class dpn extends dkn {
   public static final MapCodec<dpn> a = b(dpn::new);
   public static final int b = 3;
   public static final dyn c = dye.av;
   private static final fcl[] d = new fcl[]{
      dkd.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dpn> a() {
      return a;
   }

   protected dpn(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      return $$0.a(dkf.ej);
   }

   @Override
   protected boolean f(dxo $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return new cxg(cxk.tg);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c);
   }
}
