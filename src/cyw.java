import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyw extends cyi implements czj {
   public static final MapCodec<cyw> c = b(cyw::new);
   protected static final ekb g = cut.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<cyw> a() {
      return c;
   }

   protected cyw(dgv.d $$0) {
      super($$0, hx.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dgw $$0) {
      return $$0.a(cuv.G);
   }

   @Override
   protected cut b() {
      return cuv.md;
   }

   @Override
   protected boolean h(dgw $$0) {
      return !$$0.a(cuv.kJ);
   }

   @Override
   public boolean a(@Nullable cdm $$0, cqy $$1, ht $$2, dgw $$3, ecf $$4) {
      return false;
   }

   @Override
   public boolean a(crt $$0, ht $$1, dgw $$2, ecg $$3) {
      return false;
   }

   @Override
   protected int a(ato $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      ecg $$1 = $$0.q().b_($$0.a());
      return $$1.a(arh.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public ecg c_(dgw $$0) {
      return ech.c.a(false);
   }
}
