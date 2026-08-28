import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cam<F extends K1, Value> {
   cei<Value> a();

   cej b();

   @Nullable
   cal<F, Value> a(bwg<?> var1, Optional<Value> var2);

   public static record a<Value>(cei<Value> a) implements cam<Mu<Unit>, Value> {
      @Override
      public cej b() {
         return cej.b;
      }

      @Override
      public cal<Mu<Unit>, Value> a(bwg<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cal<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cei<Value> a) implements cam<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cej b() {
         return cej.a;
      }

      @Override
      public cal<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bwg<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cal<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cei<Value> a) implements cam<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cej b() {
         return cej.c;
      }

      @Override
      public cal<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bwg<?> $$0, Optional<Value> $$1) {
         return new cal<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
