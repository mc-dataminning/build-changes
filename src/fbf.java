import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbf extends fbu {
   public static final MapCodec<fbf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, fbf::new));

   private fbf(List<fdq> $$0) {
      super($$0);
   }

   @Override
   public fbw<fbf> b() {
      return fbx.z;
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      Float $$2 = $$1.c(fdb.j);
      if ($$2 != null) {
         azx $$3 = $$1.b();
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

   public static fbu.a<?> c() {
      return a(fbf::new);
   }
}
