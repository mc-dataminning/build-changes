import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehx extends eii {
   public static final Codec<ehx> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ehx::new));

   private ehx(List<ejv> $$0) {
      super($$0);
   }

   @Override
   public eik b() {
      return eil.t;
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      Float $$2 = $$1.c(ejh.j);
      if ($$2 != null) {
         auv $$3 = $$1.b();
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

   public static eii.a<?> c() {
      return a(ehx::new);
   }
}
