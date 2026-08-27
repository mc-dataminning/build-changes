import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dap extends cwy implements ddy {
   public static final MapCodec<dap> a = b(dap::new);
   private static final dkg c = dkf.C;
   protected static final emv b = cwy.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dap> a() {
      return a;
   }

   protected dap(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(c) ? efa.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      djp $$1 = super.a($$0);
      if ($$1 != null) {
         eez $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == efa.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      hx $$3 = $$2.c();
      djp $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ic.a);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && !this.a($$0, $$3, $$4)) {
         return cxa.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, efa.c, efa.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
