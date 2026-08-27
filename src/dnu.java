import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnu extends dnb {
   public static final MapCodec<dnu> b = b(dnu::new);

   @Override
   public MapCodec<dnu> a() {
      return b;
   }

   protected dnu(drc.d $$0) {
      super(dlc.b.d, $$0);
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, @Nullable bsq $$3, ctq $$4) {
      dnt.a($$0, $$1);
   }
}
