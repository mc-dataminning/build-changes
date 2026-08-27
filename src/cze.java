import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cze extends cyo implements czq {
   public static final MapCodec<cze> c = b(cze::new);

   @Override
   public MapCodec<cze> a() {
      return c;
   }

   protected cze(dhh.d $$0) {
      super($$0, hx.b, ekk.b(), true);
   }

   @Override
   protected cyp c() {
      return (cyp)cvc.mc;
   }

   @Override
   public ecs c_(dhi $$0) {
      return ect.c.a(false);
   }

   @Override
   protected boolean h(dhi $$0) {
      return this.c().h($$0);
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
