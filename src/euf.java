import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class euf extends euu {
   public static final MapCodec<euf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, euf::new));

   private euf(List<ews> $$0) {
      super($$0);
   }

   @Override
   public euw<euf> b() {
      return eux.z;
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      Float $$2 = $$1.c(ewd.j);
      if ($$2 != null) {
         azl $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.J();
         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            if ($$3.i() <= $$4) {
               $$6++;
            }
         }

         $$0.e($$6);
      }

      return $$0;
   }

   public static euu.a<?> c() {
      return a(euf::new);
   }
}
