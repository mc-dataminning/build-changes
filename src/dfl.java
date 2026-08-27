import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfl extends cyx implements cyr, dde {
   public static final MapCodec<dfl> a = b(dfl::new);
   protected static final float b = 6.0F;
   protected static final eol c = cyo.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dfl> a() {
      return a;
   }

   protected dfl(dle.d $$0) {
      super($$0);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return c;
   }

   @Override
   protected boolean b(dlf $$0, cut $$1, hz $$2) {
      return $$0.d($$1, $$2, ie.b) && !$$0.a(cyq.kJ);
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      egp $$1 = $$0.q().b_($$0.a());
      return $$1.a(aue.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      dlf $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return true;
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   protected egp c_(dlf $$0) {
      return egq.c.a(false);
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      dlf $$4 = cyq.bx.o();
      dlf $$5 = $$4.a(dgt.d, dmb.a);
      hz $$6 = $$2.c();
      if ($$0.a_($$6).a(cyq.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable chh $$0, cut $$1, hz $$2, dlf $$3, ego $$4) {
      return false;
   }

   @Override
   public boolean a(cvo $$0, hz $$1, dlf $$2, egp $$3) {
      return false;
   }
}
