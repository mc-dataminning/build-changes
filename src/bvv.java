import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bvv<F extends K1, Value> {
   bzr<Value> a();

   bzs b();

   @Nullable
   bvu<F, Value> a(brp<?> var1, Optional<Value> var2);

   public static record a<Value>(bzr<Value> a) implements bvv<Mu<Unit>, Value> {
      @Override
      public bzs b() {
         return bzs.b;
      }

      @Override
      public bvu<Mu<Unit>, Value> a(brp<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bvu<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bzr<Value> a) implements bvv<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bzs b() {
         return bzs.a;
      }

      @Override
      public bvu<com.mojang.datafixers.kinds.IdF.Mu, Value> a(brp<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bvu<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bzr<Value> a) implements bvv<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bzs b() {
         return bzs.c;
      }

      @Override
      public bvu<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(brp<?> $$0, Optional<Value> $$1) {
         return new bvu<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
