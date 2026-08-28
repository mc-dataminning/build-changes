import com.mojang.serialization.MapCodec;

public class dep extends dgp {
   public static final MapCodec<dep> a = b(dep::new);
   public static final int b = 3;
   public static final dsx c = dsn.as;
   private static final ewf[] g = new ewf[]{
      deu.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dep> a() {
      return a;
   }

   public dep(drw.d $$0) {
      super($$0);
   }

   @Override
   protected dsx b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dbs d() {
      return cun.vl;
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dbt $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return g[this.g($$0)];
   }
}
