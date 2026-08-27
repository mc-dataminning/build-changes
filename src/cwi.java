import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cwi extends cwy implements ddy {
   public static final dkg d = dkf.C;
   private static final emv a = cwy.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected cwi(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends cwi> a();

   protected void a(djp $$0, cty $$1, hx $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.F_().a(40));
      }
   }

   protected static boolean e(djp $$0, ctd $$1, hx $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ic $$3 : ic.values()) {
            if ($$1.b_($$2.a($$3)).a(asn.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      eez $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(asn.a) && $$1.e() == 8));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return a;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return $$1 == ic.a && !this.a($$0, (cua)$$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      hx $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ic.b);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(d);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(d) ? efa.c.a(false) : super.c_($$0);
   }
}
