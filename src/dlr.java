import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlr extends dla implements dmd {
   public static final MapCodec<dlr> c = b(dlr::new);

   @Override
   public MapCodec<dlr> a() {
      return c;
   }

   protected dlr(dur.d $$0) {
      super($$0, jk.b, ezn.b(), true);
   }

   @Override
   protected dlb c() {
      return (dlb)dho.mc;
   }

   @Override
   protected eqt b_(dus $$0) {
      return equ.c.a(false);
   }

   @Override
   protected boolean o(dus $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable cnx $$0, ddo $$1, jf $$2, dus $$3, eqs $$4) {
      return false;
   }

   @Override
   public boolean a(dek $$0, jf $$1, dus $$2, eqt $$3) {
      return false;
   }
}
