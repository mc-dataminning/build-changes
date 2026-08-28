import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cdc<F extends K1, Value> {
   cgy<Value> a();

   cgz b();

   @Nullable
   cdb<F, Value> a(byw<?> var1, Optional<Value> var2);

   public static record a<Value>(cgy<Value> a) implements cdc<Mu<Unit>, Value> {
      @Override
      public cgz b() {
         return cgz.b;
      }

      @Override
      public cdb<Mu<Unit>, Value> a(byw<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cdb<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cgy<Value> a) implements cdc<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cgz b() {
         return cgz.a;
      }

      @Override
      public cdb<com.mojang.datafixers.kinds.IdF.Mu, Value> a(byw<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cdb<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cgy<Value> a) implements cdc<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cgz b() {
         return cgz.c;
      }

      @Override
      public cdb<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(byw<?> $$0, Optional<Value> $$1) {
         return new cdb<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
