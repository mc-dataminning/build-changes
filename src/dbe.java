import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbe extends dbk {
   public static final MapCodec<dbe> a = b(dbe::new);
   public static final dpt b = dpp.P;
   public static final dpq c = dpp.u;

   @Override
   public MapCodec<dbe> a() {
      return a;
   }

   public dbe(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else {
         dmf $$5 = $$1.c_($$2);
         if ($$5 instanceof dly) {
            $$3.a((dly)$$5);
            $$3.a(auw.ar);
            cik.a($$3, true);
         }

         return boa.b;
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      bnw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      dmf $$4 = $$1.c_($$2);
      if ($$4 instanceof dly) {
         ((dly)$$4).l();
      }
   }

   @Nullable
   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dly($$0, $$1);
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return cmp.a($$1.c_($$2));
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c);
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(b, $$0.d().g());
   }
}
