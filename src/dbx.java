import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbx extends cvj implements cvd, czq {
   public static final MapCodec<dbx> a = b(dbx::new);
   protected static final float b = 6.0F;
   protected static final ekn c = cva.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dbx> a() {
      return a;
   }

   protected dbx(dhh.d $$0) {
      super($$0);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return c;
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return $$0.d($$1, $$2, hx.b) && !$$0.a(cvc.kJ);
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      ecs $$1 = $$0.q().b_($$0.a());
      return $$1.a(arl.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      dhi $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return true;
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public ecs c_(dhi $$0) {
      return ect.c.a(false);
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      dhi $$4 = cvc.bx.o();
      dhi $$5 = $$4.a(ddf.d, die.a);
      ht $$6 = $$2.c();
      if ($$0.a_($$6).a(cvc.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cdu $$0, crg $$1, ht $$2, dhi $$3, ecr $$4) {
      return false;
   }

   @Override
   public boolean a(csb $$0, ht $$1, dhi $$2, ecs $$3) {
      return false;
   }
}
