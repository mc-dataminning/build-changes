import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djn extends diw implements djz {
   public static final MapCodec<djn> c = b(djn::new);

   @Override
   public MapCodec<djn> a() {
      return c;
   }

   protected djn(dsk.d $$0) {
      super($$0, jf.b, ewx.b(), true);
   }

   @Override
   protected dix c() {
      return (dix)dfk.mc;
   }

   @Override
   protected eoj b_(dsl $$0) {
      return eok.c.a(false);
   }

   @Override
   protected boolean m(dsl $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable cml $$0, dbm $$1, ja $$2, dsl $$3, eoi $$4) {
      return false;
   }

   @Override
   public boolean a(dch $$0, ja $$1, dsl $$2, eoj $$3) {
      return false;
   }
}
