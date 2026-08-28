import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmu extends dex {
   public static final MapCodec<dmu> a = b(dmu::new);
   private static final xo d = xo.c("container.stonecutter");
   public static final dsu b = dit.aE;
   protected static final ewi c = dex.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   public dmu(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         return bqs.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awj.ay);
         return bqs.c;
      }
   }

   @Nullable
   @Override
   protected bqw b(dsa $$0, dbw $$1, iz $$2) {
      return new brc(($$2x, $$3, $$4) -> new crt($$2x, $$3, cqd.a($$1, $$2)), d);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return c;
   }

   @Override
   protected boolean f_(dsa $$0) {
      return true;
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
