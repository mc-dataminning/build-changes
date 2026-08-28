import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class etl extends esj {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<etl> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, etl::new));

   private etl(List<euh> $$0) {
      super($$0);
   }

   @Override
   public esl<etl> b() {
      return esm.l;
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Optional<cyl<cza>> $$2 = $$1.d().r().a(cyp.b, new cyz($$0), $$1.d());
         if ($$2.isPresent()) {
            cud $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.e()) {
               return $$3.c($$0.H());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static esj.a<?> c() {
      return a(etl::new);
   }
}
