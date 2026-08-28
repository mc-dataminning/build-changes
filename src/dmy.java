import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmy extends dfb {
   public static final MapCodec<dmy> a = b(dmy::new);
   private static final xp d = xp.c("container.stonecutter");
   public static final dsy b = dix.aE;
   protected static final ewm c = dfb.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dmy> a() {
      return a;
   }

   public dmy(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.ay);
         return bqw.c;
      }
   }

   @Nullable
   @Override
   protected bra b(dse $$0, dca $$1, iz $$2) {
      return new brg(($$2x, $$3, $$4) -> new crx($$2x, $$3, cqh.a($$1, $$2)), d);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return c;
   }

   @Override
   protected boolean f_(dse $$0) {
      return true;
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
