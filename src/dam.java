import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dam extends czy implements daz {
   public static final MapCodec<dam> c = b(dam::new);
   protected static final emf g = cwj.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dam> a() {
      return c;
   }

   protected dam(diz.d $$0) {
      super($$0, ic.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dja $$0) {
      return $$0.a(cwl.G);
   }

   @Override
   protected cwj b() {
      return cwl.md;
   }

   @Override
   protected boolean h(dja $$0) {
      return !$$0.a(cwl.kJ);
   }

   @Override
   public boolean a(@Nullable cfb $$0, cso $$1, hx $$2, dja $$3, eej $$4) {
      return false;
   }

   @Override
   public boolean a(ctj $$0, hx $$1, dja $$2, eek $$3) {
      return false;
   }

   @Override
   protected int a(aup $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      eek $$1 = $$0.q().b_($$0.a());
      return $$1.a(asg.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public eek c_(dja $$0) {
      return eel.c.a(false);
   }
}
