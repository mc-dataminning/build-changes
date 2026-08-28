import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dep extends dej implements deo {
   public static final MapCodec<dep> a = b(dep::new);

   @Override
   public MapCodec<dep> a() {
      return a;
   }

   public dep(drz.d $$0) {
      super($$0);
   }

   @Override
   public ctg b() {
      return ctg.a;
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dpa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return a($$2, dph.o, dpa::a);
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         return bqs.a;
      } else {
         if ($$1.c_($$2) instanceof dpa $$5) {
            $$3.a($$5);
            $$3.a(awj.ab);
         }

         return bqs.c;
      }
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }
}
