import com.mojang.serialization.MapCodec;

public class dnf extends dgp {
   public static final MapCodec<dnf> a = b(dnf::new);
   public static final int b = 2;
   public static final dsx c = dsn.aq;
   private static final float g = 3.0F;
   private static final ewf[] h = new ewf[]{deu.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), deu.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dnf> a() {
      return a;
   }

   public dnf(drw.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c);
   }

   @Override
   public ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dsx b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dbs d() {
      return cun.vi;
   }

   @Override
   public drx b(int $$0) {
      return $$0 == 2 ? dew.bS.n() : super.b($$0);
   }

   @Override
   public void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dbt $$0) {
      return 1;
   }
}
