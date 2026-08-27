import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dat extends dad implements dbf {
   public static final MapCodec<dat> c = b(dat::new);

   @Override
   public MapCodec<dat> a() {
      return c;
   }

   protected dat(djf.d $$0) {
      super($$0, ic.b, emi.b(), true);
   }

   @Override
   protected dae c() {
      return (dae)cwr.mc;
   }

   @Override
   public eeq c_(djg $$0) {
      return eer.c.a(false);
   }

   @Override
   protected boolean h(djg $$0) {
      return this.c().h($$0);
   }

   @Override
   public boolean a(@Nullable cfh $$0, csu $$1, hx $$2, djg $$3, eep $$4) {
      return false;
   }

   @Override
   public boolean a(ctp $$0, hx $$1, djg $$2, eeq $$3) {
      return false;
   }
}
