import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcy extends dij implements diy {
   public static final MapCodec<dcy> a = b(dcy::new);
   public static final dpq b = dpp.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final est e = dby.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final est f = dby.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final est g = dby.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dcy> a() {
      return a;
   }

   public dcy(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, ih.a.b));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      switch ((ih.a)$$0.c(i)) {
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
   public doz a(cuo $$0) {
      eks $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ekt.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(b) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
