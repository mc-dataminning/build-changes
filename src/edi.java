import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edi extends edt {
   public static final Codec<edi> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, edi::new));

   private edi(List<efg> $$0) {
      super($$0);
   }

   @Override
   public edv b() {
      return edw.t;
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      Float $$2 = $$1.c(ees.j);
      if ($$2 != null) {
         aru $$3 = $$1.b();
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

   public static edt.a<?> c() {
      return a(edi::new);
   }
}
