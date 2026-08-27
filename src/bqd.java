import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bqd<F extends K1, Value> {
   btz<Value> a();

   bua b();

   @Nullable
   bqc<F, Value> a(bly<?> var1, Optional<Value> var2);

   public static record a<Value>(btz<Value> a) implements bqd<Mu<Unit>, Value> {
      @Override
      public bua b() {
         return bua.b;
      }

      @Override
      public bqc<Mu<Unit>, Value> a(bly<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bqc<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(btz<Value> a) implements bqd<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bua b() {
         return bua.a;
      }

      @Override
      public bqc<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bly<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bqc<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(btz<Value> a) implements bqd<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bua b() {
         return bua.c;
      }

      @Override
      public bqc<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bly<?> $$0, Optional<Value> $$1) {
         return new bqc<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
