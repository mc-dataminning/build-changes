import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dio extends dex implements dly {
   public static final MapCodec<dio> a = b(dio::new);
   private static final dsr c = dsq.C;
   protected static final ewi b = dex.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   protected dio(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(c) ? enu.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = super.a($$0);
      if ($$1 != null) {
         ent $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == enu.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      iz $$3 = $$2.c();
      dsa $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, je.a);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return b;
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !this.a($$0, $$3, $$4)) {
         return dez.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, enu.c, enu.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
