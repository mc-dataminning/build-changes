import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dat extends daf implements dbg {
   public static final MapCodec<dat> c = b(dat::new);
   protected static final emm g = cwq.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dat> a() {
      return c;
   }

   protected dat(djg.d $$0) {
      super($$0, ic.b, g, true, 0.14);
   }

   @Override
   protected boolean g(djh $$0) {
      return $$0.a(cws.G);
   }

   @Override
   protected cwq b() {
      return cws.md;
   }

   @Override
   protected boolean h(djh $$0) {
      return !$$0.a(cws.kJ);
   }

   @Override
   public boolean a(@Nullable cfi $$0, csv $$1, hx $$2, djh $$3, eeq $$4) {
      return false;
   }

   @Override
   public boolean a(ctq $$0, hx $$1, djh $$2, eer $$3) {
      return false;
   }

   @Override
   protected int a(auv $$0) {
      return 1;
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      eer $$1 = $$0.q().b_($$0.a());
      return $$1.a(asm.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public eer c_(djh $$0) {
      return ees.c.a(false);
   }
}
