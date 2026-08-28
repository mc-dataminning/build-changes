import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnr extends dmz implements dod {
   public static final MapCodec<dnr> c = b(dnr::new);

   @Override
   public MapCodec<dnr> a() {
      return c;
   }

   protected dnr(dwu.d $$0) {
      super($$0, jn.b, fbp.b(), true);
   }

   @Override
   protected dna c() {
      return (dna)djm.mE;
   }

   @Override
   protected esx b_(dwv $$0) {
      return esy.c.a(false);
   }

   @Override
   protected boolean o(dwv $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable cov $$0, dfl $$1, ji $$2, dwv $$3, esw $$4) {
      return false;
   }

   @Override
   public boolean a(dgh $$0, ji $$1, dwv $$2, esx $$3) {
      return false;
   }
}
