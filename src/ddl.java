import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddl extends dbk implements diy {
   public static final MapCodec<ddl> a = b(ddl::new);
   public static final dpq b = dpp.C;
   private static final int d = 3;
   protected static final est c = dby.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<ddl> a() {
      return a;
   }

   public ddl(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dmr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return a($$2, dmh.z, $$0.B ? dmr::a : dmr::b);
   }

   @Override
   protected did b_(doz $$0) {
      return did.b;
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(b) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return c;
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      eks $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, Boolean.valueOf($$1.a(avh.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
