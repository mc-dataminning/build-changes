import com.mojang.serialization.MapCodec;

public class dkb extends dfd {
   public static final MapCodec<dkb> a = b(dkb::new);
   public static final int b = 3;
   public static final dsx c = dsn.as;
   private static final ewf[] d = new ewf[]{
      deu.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   protected dkb(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return $$0.a(dew.dW);
   }

   @Override
   protected boolean d_(drx $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return new cuk(cun.sj);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c);
   }
}
