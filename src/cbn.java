import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cbn<F extends K1, Value> {
   cfj<Value> a();

   cfk b();

   @Nullable
   cbm<F, Value> a(bxh<?> var1, Optional<Value> var2);

   public static record a<Value>(cfj<Value> a) implements cbn<Mu<Unit>, Value> {
      @Override
      public cfk b() {
         return cfk.b;
      }

      @Override
      public cbm<Mu<Unit>, Value> a(bxh<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cbm<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cfj<Value> a) implements cbn<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cfk b() {
         return cfk.a;
      }

      @Override
      public cbm<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bxh<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cbm<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cfj<Value> a) implements cbn<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cfk b() {
         return cfk.c;
      }

      @Override
      public cbm<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bxh<?> $$0, Optional<Value> $$1) {
         return new cbm<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
