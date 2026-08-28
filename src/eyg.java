import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eyg extends exe {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eyg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eyg::new));

   private eyg(List<eza> $$0) {
      super($$0);
   }

   @Override
   public exg<eyg> b() {
      return exh.l;
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         dbx $$2 = new dbx($$0);
         Optional<dbj<dby>> $$3 = $$1.d().t().a(dbp.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            cwp $$4 = $$3.get().b().a($$2, $$1.d().K_());
            if (!$$4.f()) {
               return $$4.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static exe.a<?> c() {
      return a(eyg::new);
   }
}
