import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class erq extends eqq {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<erq> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, erq::new));

   private erq(List<esl> $$0) {
      super($$0);
   }

   @Override
   public eqs b() {
      return eqt.k;
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Optional<cxw<cyj>> $$2 = $$1.d().r().a(cxz.b, new bqd($$0), $$1.d());
         if ($$2.isPresent()) {
            cto $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.e()) {
               return $$3.c($$0.I());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eqq.a<?> c() {
      return a(erq::new);
   }
}
