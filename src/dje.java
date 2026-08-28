import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dje extends din implements djq {
   public static final MapCodec<dje> c = b(dje::new);

   @Override
   public MapCodec<dje> a() {
      return c;
   }

   protected dje(dsb.d $$0) {
      super($$0, je.b, ewh.b(), true);
   }

   @Override
   protected dio c() {
      return (dio)dfb.mc;
   }

   @Override
   protected env b_(dsc $$0) {
      return enw.c.a(false);
   }

   @Override
   protected boolean m(dsc $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable cmx $$0, dbe $$1, iz $$2, dsc $$3, enu $$4) {
      return false;
   }

   @Override
   public boolean a(dbz $$0, iz $$1, dsc $$2, env $$3) {
      return false;
   }
}
