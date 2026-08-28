import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dep extends dff implements dmg {
   public static final dsy d = dsx.C;
   private static final ews a = dff.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dep(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dep> a();

   protected void a(dsh $$0, dce $$1, ja $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dsh $$0, dbj $$1, ja $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (jf $$3 : jf.values()) {
            if ($$1.b_($$2.a($$3)).a(awa.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      eob $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(awa.a) && $$1.e() == 8));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return a;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return $$1 == jf.a && !this.a($$0, (dcg)$$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      ja $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, jf.b);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(d);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(d) ? eoc.c.a(false) : super.b_($$0);
   }
}
