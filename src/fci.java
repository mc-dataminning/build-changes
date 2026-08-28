import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fci extends fbg {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fci> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, fci::new));

   private fci(List<fdc> $$0) {
      super($$0);
   }

   @Override
   public fbi<fci> b() {
      return fbj.l;
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         dex $$2 = new dex($$0);
         Optional<dej<dey>> $$3 = $$1.d().t().a(dep.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            czn $$4 = $$3.get().b().a($$2, $$1.d().F_());
            if (!$$4.f()) {
               return $$4.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static fbg.a<?> c() {
      return a(fci::new);
   }
}
