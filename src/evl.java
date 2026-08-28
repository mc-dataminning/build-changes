import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evl extends ewa {
   public static final MapCodec<evl> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, evl::new));

   private evl(List<exy> $$0) {
      super($$0);
   }

   @Override
   public ewc<evl> b() {
      return ewd.z;
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      Float $$2 = $$1.c(exj.j);
      if ($$2 != null) {
         azu $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.L();
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

   public static ewa.a<?> c() {
      return a(evl::new);
   }
}
