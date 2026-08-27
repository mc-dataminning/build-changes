import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddv extends cxh implements cxb, dbo {
   public static final MapCodec<ddv> a = b(ddv::new);
   protected static final float b = 6.0F;
   protected static final emv c = cwy.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<ddv> a() {
      return a;
   }

   protected ddv(djo.d $$0) {
      super($$0);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return c;
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return $$0.d($$1, $$2, ic.b) && !$$0.a(cxa.kJ);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      eez $$1 = $$0.q().b_($$0.a());
      return $$1.a(asn.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      djp $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return true;
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public eez c_(djp $$0) {
      return efa.c.a(false);
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      djp $$4 = cxa.bx.o();
      djp $$5 = $$4.a(dfd.d, dkl.a);
      hx $$6 = $$2.c();
      if ($$0.a_($$6).a(cxa.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cfq $$0, ctd $$1, hx $$2, djp $$3, eey $$4) {
      return false;
   }

   @Override
   public boolean a(cty $$0, hx $$1, djp $$2, eez $$3) {
      return false;
   }
}
