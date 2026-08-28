import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmu extends dmd implements dng {
   public static final MapCodec<dmu> c = b(dmu::new);

   @Override
   public MapCodec<dmu> a() {
      return c;
   }

   protected dmu(dvu.d $$0) {
      super($$0, jm.b, fap.b(), true);
   }

   @Override
   protected dme c() {
      return (dme)dis.mc;
   }

   @Override
   protected erv b_(dvv $$0) {
      return erw.c.a(false);
   }

   @Override
   protected boolean o(dvv $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable cou $$0, der $$1, jh $$2, dvv $$3, eru $$4) {
      return false;
   }

   @Override
   public boolean a(dfn $$0, jh $$1, dvv $$2, erv $$3) {
      return false;
   }
}
