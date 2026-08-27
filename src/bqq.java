import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bqq<F extends K1, Value> {
   bum<Value> a();

   bun b();

   @Nullable
   bqp<F, Value> a(bml<?> var1, Optional<Value> var2);

   public static record a<Value>(bum<Value> a) implements bqq<Mu<Unit>, Value> {
      @Override
      public bun b() {
         return bun.b;
      }

      @Override
      public bqp<Mu<Unit>, Value> a(bml<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bqp<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bum<Value> a) implements bqq<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bun b() {
         return bun.a;
      }

      @Override
      public bqp<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bml<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bqp<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bum<Value> a) implements bqq<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bun b() {
         return bun.c;
      }

      @Override
      public bqp<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bml<?> $$0, Optional<Value> $$1) {
         return new bqp<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
