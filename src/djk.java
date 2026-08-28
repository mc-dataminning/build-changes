import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djk extends dit implements djw {
   public static final MapCodec<djk> c = b(djk::new);

   @Override
   public MapCodec<djk> a() {
      return c;
   }

   protected djk(dsg.d $$0) {
      super($$0, jf.b, ewp.b(), true);
   }

   @Override
   protected diu c() {
      return (diu)dfh.mc;
   }

   @Override
   protected eob b_(dsh $$0) {
      return eoc.c.a(false);
   }

   @Override
   protected boolean m(dsh $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable cmh $$0, dbj $$1, ja $$2, dsh $$3, eoa $$4) {
      return false;
   }

   @Override
   public boolean a(dce $$0, ja $$1, dsh $$2, eob $$3) {
      return false;
   }
}
