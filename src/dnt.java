import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnt extends dnb implements dof {
   public static final MapCodec<dnt> c = b(dnt::new);

   @Override
   public MapCodec<dnt> a() {
      return c;
   }

   protected dnt(dww.d $$0) {
      super($$0, jn.b, fbr.b(), true);
   }

   @Override
   protected dnc c() {
      return (dnc)djo.mE;
   }

   @Override
   protected esz b_(dwx $$0) {
      return eta.c.a(false);
   }

   @Override
   protected boolean o(dwx $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable cox $$0, dfn $$1, ji $$2, dwx $$3, esy $$4) {
      return false;
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwx $$2, esz $$3) {
      return false;
   }
}
