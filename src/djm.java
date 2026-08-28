import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djm extends div implements djy {
   public static final MapCodec<djm> c = b(djm::new);

   @Override
   public MapCodec<djm> a() {
      return c;
   }

   protected djm(dsj.d $$0) {
      super($$0, jf.b, ewv.b(), true);
   }

   @Override
   protected diw c() {
      return (diw)dfj.mc;
   }

   @Override
   protected eoh b_(dsk $$0) {
      return eoi.c.a(false);
   }

   @Override
   protected boolean m(dsk $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable cmk $$0, dbl $$1, ja $$2, dsk $$3, eog $$4) {
      return false;
   }

   @Override
   public boolean a(dcg $$0, ja $$1, dsk $$2, eoh $$3) {
      return false;
   }
}
