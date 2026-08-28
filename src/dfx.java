import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfx extends dlj implements dly {
   public static final MapCodec<dfx> a = b(dfx::new);
   public static final dsr b = dsq.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final ewi e = dex.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final ewi f = dex.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final ewi g = dex.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dfx> a() {
      return a;
   }

   public dfx(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, je.a.b));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      switch ((je.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      ent $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enu.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(b) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
