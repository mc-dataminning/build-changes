import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejw extends ekh {
   public static final Codec<ejw> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ejw::new));

   private ejw(List<elu> $$0) {
      super($$0);
   }

   @Override
   public ekj b() {
      return ekk.t;
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      Float $$2 = $$1.c(elg.j);
      if ($$2 != null) {
         awo $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.M();
         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            if ($$3.i() <= $$4) {
               $$6++;
            }
         }

         $$0.f($$6);
      }

      return $$0;
   }

   public static ekh.a<?> c() {
      return a(ejw::new);
   }
}
