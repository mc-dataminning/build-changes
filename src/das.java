import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class das extends dae implements dbf {
   public static final MapCodec<das> c = b(das::new);
   protected static final eml g = cwp.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<das> a() {
      return c;
   }

   protected das(djf.d $$0) {
      super($$0, ic.b, g, true, 0.14);
   }

   @Override
   protected boolean g(djg $$0) {
      return $$0.a(cwr.G);
   }

   @Override
   protected cwp b() {
      return cwr.md;
   }

   @Override
   protected boolean h(djg $$0) {
      return !$$0.a(cwr.kJ);
   }

   @Override
   public boolean a(@Nullable cfh $$0, csu $$1, hx $$2, djg $$3, eep $$4) {
      return false;
   }

   @Override
   public boolean a(ctp $$0, hx $$1, djg $$2, eeq $$3) {
      return false;
   }

   @Override
   protected int a(auu $$0) {
      return 1;
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      eeq $$1 = $$0.q().b_($$0.a());
      return $$1.a(asl.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public eeq c_(djg $$0) {
      return eer.c.a(false);
   }
}
