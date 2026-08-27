import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efy extends egj {
   public static final Codec<efy> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, efy::new));

   private efy(List<ehw> $$0) {
      super($$0);
   }

   @Override
   public egl b() {
      return egm.t;
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      Float $$2 = $$1.c(ehi.j);
      if ($$2 != null) {
         ats $$3 = $$1.b();
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

   public static egj.a<?> c() {
      return a(efy::new);
   }
}
