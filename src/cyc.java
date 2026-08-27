import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyc extends cxo implements cyp {
   public static final MapCodec<cyc> c = b(cyc::new);
   protected static final eiy g = cua.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<cyc> a() {
      return c;
   }

   protected cyc(dga.d $$0) {
      super($$0, hx.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dgb $$0) {
      return $$0.a(cuc.G);
   }

   @Override
   protected cua b() {
      return cuc.md;
   }

   @Override
   protected boolean h(dgb $$0) {
      return !$$0.a(cuc.kJ);
   }

   @Override
   public boolean a(@Nullable ccx $$0, cqf $$1, ht $$2, dgb $$3, ebd $$4) {
      return false;
   }

   @Override
   public boolean a(cra $$0, ht $$1, dgb $$2, ebe $$3) {
      return false;
   }

   @Override
   protected int a(ate $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      ebe $$1 = $$0.q().b_($$0.a());
      return $$1.a(aqx.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public ebe c_(dgb $$0) {
      return ebf.c.a(false);
   }
}
