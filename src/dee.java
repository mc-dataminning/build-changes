import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dee extends ddo implements deq {
   public static final MapCodec<dee> c = b(dee::new);

   @Override
   public MapCodec<dee> a() {
      return c;
   }

   protected dee(dmy.d $$0) {
      super($$0, ih.b, eqh.b(), true);
   }

   @Override
   protected ddp c() {
      return (ddp)dac.mc;
   }

   @Override
   protected ein c_(dmz $$0) {
      return eio.c.a(false);
   }

   @Override
   protected boolean m(dmz $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable cis $$0, cwf $$1, ib $$2, dmz $$3, eim $$4) {
      return false;
   }

   @Override
   public boolean a(cxa $$0, ib $$1, dmz $$2, ein $$3) {
      return false;
   }
}
