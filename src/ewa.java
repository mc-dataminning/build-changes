import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ewa extends euy {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ewa> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ewa::new));

   private ewa(List<eww> $$0) {
      super($$0);
   }

   @Override
   public eva<ewa> b() {
      return evb.l;
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Optional<dam<dbb>> $$2 = $$1.d().r().a(daq.b, new dba($$0), $$1.d());
         if ($$2.isPresent()) {
            cvs $$3 = $$2.get().b().a($$1.d().G_());
            if (!$$3.f()) {
               return $$3.c($$0.K());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static euy.a<?> c() {
      return a(ewa::new);
   }
}
