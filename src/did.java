import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class did extends dhm implements dip {
   public static final MapCodec<did> c = b(did::new);

   @Override
   public MapCodec<did> a() {
      return c;
   }

   protected did(dra.d $$0) {
      super($$0, it.b, eva.b(), true);
   }

   @Override
   protected dhn c() {
      return (dhn)dea.mc;
   }

   @Override
   protected emu b_(drb $$0) {
      return emv.c.a(false);
   }

   @Override
   protected boolean m(drb $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable clw $$0, dad $$1, io $$2, drb $$3, emt $$4) {
      return false;
   }

   @Override
   public boolean a(day $$0, io $$1, drb $$2, emu $$3) {
      return false;
   }
}
