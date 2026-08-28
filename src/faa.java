import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class faa extends eyy {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<faa> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, faa::new));

   private faa(List<fau> $$0) {
      super($$0);
   }

   @Override
   public eza<faa> b() {
      return ezb.l;
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         dde $$2 = new dde($$0);
         Optional<dcq<ddf>> $$3 = $$1.d().t().a(dcw.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            cxy $$4 = $$3.get().b().a($$2, $$1.d().F_());
            if (!$$4.f()) {
               return $$4.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eyy.a<?> c() {
      return a(faa::new);
   }
}
