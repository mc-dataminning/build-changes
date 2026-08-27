import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class die extends dhp implements dir {
   public static final MapCodec<die> c = b(die::new);
   protected static final evf g = dea.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<die> a() {
      return c;
   }

   protected die(drc.d $$0) {
      super($$0, it.b, g, true, 0.14);
   }

   @Override
   protected boolean g(drd $$0) {
      return $$0.a(dec.G);
   }

   @Override
   protected dea b() {
      return dec.md;
   }

   @Override
   protected boolean m(drd $$0) {
      return !$$0.a(dec.kJ);
   }

   @Override
   public boolean a(@Nullable cly $$0, daf $$1, io $$2, drd $$3, emv $$4) {
      return false;
   }

   @Override
   public boolean a(dba $$0, io $$1, drd $$2, emw $$3) {
      return false;
   }

   @Override
   protected int a(aym $$0) {
      return 1;
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());
      return $$1.a(awc.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected emw b_(drd $$0) {
      return emx.c.a(false);
   }
}
