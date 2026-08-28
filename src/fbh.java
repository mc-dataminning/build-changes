import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbh extends fbw {
   public static final MapCodec<fbh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, fbh::new));

   private fbh(List<fds> $$0) {
      super($$0);
   }

   @Override
   public fby<fbh> b() {
      return fbz.z;
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      Float $$2 = $$1.c(fdd.j);
      if ($$2 != null) {
         azz $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.M();
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

   public static fbw.a<?> c() {
      return a(fbh::new);
   }
}
