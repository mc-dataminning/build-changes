import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edt extends eee {
   public static final Codec<edt> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, edt::new));

   private edt(List<efr> $$0) {
      super($$0);
   }

   @Override
   public eeg b() {
      return eeh.t;
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      Float $$2 = $$1.c(efd.j);
      if ($$2 != null) {
         ase $$3 = $$1.b();
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

   public static eee.a<?> c() {
      return a(edt::new);
   }
}
