import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehf extends ehq {
   public static final Codec<ehf> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ehf::new));

   private ehf(List<ejd> $$0) {
      super($$0);
   }

   @Override
   public ehs b() {
      return eht.t;
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      Float $$2 = $$1.c(eip.j);
      if ($$2 != null) {
         auf $$3 = $$1.b();
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

   public static ehq.a<?> c() {
      return a(ehf::new);
   }
}
