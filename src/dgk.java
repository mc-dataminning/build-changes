import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgk extends dej implements dly {
   public static final MapCodec<dgk> a = b(dgk::new);
   public static final dsr b = dsq.C;
   private static final int d = 3;
   protected static final ewi c = dex.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   public dgk(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dpr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return a($$2, dph.z, $$0.B ? dpr::a : dpr::b);
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.b;
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(b) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return c;
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      ent $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(awu.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
