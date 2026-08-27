import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czy extends ctl implements ctf, cxr {
   public static final MapCodec<czy> a = b(czy::new);
   protected static final float b = 6.0F;
   protected static final eia c = ctc.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<czy> a() {
      return a;
   }

   protected czy(dfc.d $$0) {
      super($$0);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return c;
   }

   @Override
   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      return $$0.d($$1, $$2, ha.b) && !$$0.a(cte.kJ);
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      eag $$1 = $$0.q().b_($$0.a());
      return $$1.a(aqa.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      dfd $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return true;
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public eag c_(dfd $$0) {
      return eah.c.a(false);
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      dfd $$4 = cte.bx.o();
      dfd $$5 = $$4.a(dbg.d, dfz.a);
      gw $$6 = $$2.c();
      if ($$0.a_($$6).a(cte.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cca $$0, cph $$1, gw $$2, dfd $$3, eaf $$4) {
      return false;
   }

   @Override
   public boolean a(cqc $$0, gw $$1, dfd $$2, eag $$3) {
      return false;
   }
}
