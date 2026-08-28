import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drb extends dqj implements dro {
   public static final MapCodec<drb> c = b(drb::new);

   @Override
   public MapCodec<drb> a() {
      return c;
   }

   protected drb(eas.d $$0) {
      super($$0, jb.b, fft.b(), true);
   }

   @Override
   protected dqk c() {
      return (dqk)dmt.mI;
   }

   @Override
   protected exa b_(eat $$0) {
      return exb.c.a(false);
   }

   @Override
   protected boolean o(eat $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable bxj $$0, diq $$1, iv $$2, eat $$3, ewz $$4) {
      return false;
   }

   @Override
   public boolean a(djn $$0, iv $$1, eat $$2, exa $$3) {
      return false;
   }
}
