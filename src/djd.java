import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djd extends dim implements djp {
   public static final MapCodec<djd> c = b(djd::new);

   @Override
   public MapCodec<djd> a() {
      return c;
   }

   protected djd(dsa.d $$0) {
      super($$0, je.b, ewg.b(), true);
   }

   @Override
   protected din c() {
      return (din)dfa.mc;
   }

   @Override
   protected enu b_(dsb $$0) {
      return env.c.a(false);
   }

   @Override
   protected boolean m(dsb $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable cmw $$0, dbd $$1, iz $$2, dsb $$3, ent $$4) {
      return false;
   }

   @Override
   public boolean a(dby $$0, iz $$1, dsb $$2, enu $$3) {
      return false;
   }
}
