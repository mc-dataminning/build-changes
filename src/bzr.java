import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bzr<F extends K1, Value> {
   cdn<Value> a();

   cdo b();

   @Nullable
   bzq<F, Value> a(bvl<?> var1, Optional<Value> var2);

   public static record a<Value>(cdn<Value> a) implements bzr<Mu<Unit>, Value> {
      @Override
      public cdo b() {
         return cdo.b;
      }

      @Override
      public bzq<Mu<Unit>, Value> a(bvl<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bzq<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cdn<Value> a) implements bzr<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cdo b() {
         return cdo.a;
      }

      @Override
      public bzq<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bvl<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bzq<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cdn<Value> a) implements bzr<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cdo b() {
         return cdo.c;
      }

      @Override
      public bzq<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bvl<?> $$0, Optional<Value> $$1) {
         return new bzq<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
