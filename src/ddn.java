import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddn extends cwz implements cwt, dbg {
   public static final MapCodec<ddn> a = b(ddn::new);
   protected static final float b = 6.0F;
   protected static final emm c = cwq.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<ddn> a() {
      return a;
   }

   protected ddn(djg.d $$0) {
      super($$0);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return c;
   }

   @Override
   protected boolean b(djh $$0, csv $$1, hx $$2) {
      return $$0.d($$1, $$2, ic.b) && !$$0.a(cws.kJ);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      eer $$1 = $$0.q().b_($$0.a());
      return $$1.a(asm.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      djh $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return true;
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public eer c_(djh $$0) {
      return ees.c.a(false);
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      djh $$4 = cws.bx.o();
      djh $$5 = $$4.a(dev.d, dkd.a);
      hx $$6 = $$2.c();
      if ($$0.a_($$6).a(cws.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cfi $$0, csv $$1, hx $$2, djh $$3, eeq $$4) {
      return false;
   }

   @Override
   public boolean a(ctq $$0, hx $$1, djh $$2, eer $$3) {
      return false;
   }
}
