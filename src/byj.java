import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface byj<F extends K1, Value> {
   ccf<Value> a();

   ccg b();

   @Nullable
   byi<F, Value> a(bud<?> var1, Optional<Value> var2);

   public static record a<Value>(ccf<Value> a) implements byj<Mu<Unit>, Value> {
      @Override
      public ccg b() {
         return ccg.b;
      }

      @Override
      public byi<Mu<Unit>, Value> a(bud<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new byi<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(ccf<Value> a) implements byj<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public ccg b() {
         return ccg.a;
      }

      @Override
      public byi<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bud<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new byi<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(ccf<Value> a) implements byj<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public ccg b() {
         return ccg.c;
      }

      @Override
      public byi<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bud<?> $$0, Optional<Value> $$1) {
         return new byi<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
