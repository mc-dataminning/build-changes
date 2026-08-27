import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egd extends ego {
   public static final Codec<egd> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, egd::new));

   private egd(List<eib> $$0) {
      super($$0);
   }

   @Override
   public egq b() {
      return egr.t;
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      Float $$2 = $$1.c(ehn.j);
      if ($$2 != null) {
         atw $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.L();
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

   public static ego.a<?> c() {
      return a(egd::new);
   }
}
