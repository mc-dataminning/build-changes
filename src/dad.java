import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dad extends czn implements dap {
   public static final MapCodec<dad> c = b(dad::new);

   @Override
   public MapCodec<dad> a() {
      return c;
   }

   protected dad(dio.d $$0) {
      super($$0, ia.b, elr.b(), true);
   }

   @Override
   protected czo c() {
      return (czo)cwb.mc;
   }

   @Override
   public edz c_(dip $$0) {
      return eea.c.a(false);
   }

   @Override
   protected boolean h(dip $$0) {
      return this.c().h($$0);
   }

   @Override
   public boolean a(@Nullable cer $$0, cse $$1, hv $$2, dip $$3, edy $$4) {
      return false;
   }

   @Override
   public boolean a(csz $$0, hv $$1, dip $$2, edz $$3) {
      return false;
   }
}
