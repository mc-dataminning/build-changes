import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eej extends eeu {
   public static final Codec<eej> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eej::new));

   private eej(List<egh> $$0) {
      super($$0);
   }

   @Override
   public eew b() {
      return eex.t;
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      Float $$2 = $$1.c(eft.j);
      if ($$2 != null) {
         ate $$3 = $$1.b();
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

   public static eeu.a<?> c() {
      return a(eej::new);
   }
}
