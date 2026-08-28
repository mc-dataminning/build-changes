import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class esx extends eru {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esx> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, esx::new));

   private esx(List<ets> $$0) {
      super($$0);
   }

   @Override
   public erw<esx> b() {
      return erx.l;
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Optional<cyx<czk>> $$2 = $$1.d().r().a(cza.b, new brd($$0), $$1.d());
         if ($$2.isPresent()) {
            cup $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.e()) {
               return $$3.c($$0.I());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eru.a<?> c() {
      return a(esx::new);
   }
}
