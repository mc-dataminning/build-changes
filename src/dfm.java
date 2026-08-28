import com.mojang.serialization.MapCodec;

public class dfm extends dgp {
   public static final MapCodec<dfm> a = b(dfm::new);
   private static final ewf[] b = new ewf[]{
      deu.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dfm> a() {
      return a;
   }

   public dfm(drw.d $$0) {
      super($$0);
   }

   @Override
   protected dbs d() {
      return cun.uf;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b[this.g($$0)];
   }
}
