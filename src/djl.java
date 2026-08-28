import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class djl extends dex implements dly {
   public static final MapCodec<djl> a = b(djl::new);
   public static final int b = 15;
   public static final dta c = dsq.aP;
   public static final dsr d = dsq.C;
   public static final ToIntFunction<dsa> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<djl> a() {
      return a;
   }

   public djl(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if (!$$1.B && $$3.gz()) {
         $$1.a($$2, $$0.a(c), 2);
         return bqs.a;
      } else {
         return bqs.c;
      }
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return $$3.a(cuq.hC) ? ewf.b() : ewf.a();
   }

   @Override
   protected boolean a_(dsa $$0, dbc $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.a;
   }

   @Override
   protected float d(dsa $$0, dbc $$1, iz $$2) {
      return 1.0F;
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(d) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cun a(cun $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(km.aa, cwy.a.a(c, $$1));
      }

      return $$0;
   }
}
