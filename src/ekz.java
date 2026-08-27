import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekz extends elk {
   public static final Codec<ekz> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ekz::new));

   private ekz(List<emx> $$0) {
      super($$0);
   }

   @Override
   public elm b() {
      return eln.t;
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      Float $$2 = $$1.c(emj.j);
      if ($$2 != null) {
         awt $$3 = $$1.b();
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

   public static elk.a<?> c() {
      return a(ekz::new);
   }
}
