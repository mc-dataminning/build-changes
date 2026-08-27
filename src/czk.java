import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class czk extends daa implements dha {
   public static final dnq d = dnp.C;
   private static final eqk a = daa.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected czk(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends czk> a();

   protected void a(dmz $$0, cxa $$1, ib $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dmz $$0, cwf $$1, ib $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ih $$3 : ih.values()) {
            if ($$1.b_($$2.a($$3)).a(aus.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      ein $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(aus.a) && $$1.e() == 8));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return a;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return $$1 == ih.a && !this.a($$0, (cxc)$$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ib $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ih.b);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(d);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(d) ? eio.c.a(false) : super.c_($$0);
   }
}
