import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ejb extends eii {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ejb> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ejb::new));

   private ejb(List<ejv> $$0) {
      super($$0);
   }

   @Override
   public eik b() {
      return eil.h;
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<cqe<cqr>> $$2 = $$1.d().r().a(cqh.b, new bkj($$0), $$1.d());
         if ($$2.isPresent()) {
            cmy $$3 = $$2.get().b().a($$1.d().I_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eii.a<?> c() {
      return a(ejb::new);
   }
}
