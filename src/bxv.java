import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bxv<F extends K1, Value> {
   cbr<Value> a();

   cbs b();

   @Nullable
   bxu<F, Value> a(btp<?> var1, Optional<Value> var2);

   public static record a<Value>(cbr<Value> a) implements bxv<Mu<Unit>, Value> {
      @Override
      public cbs b() {
         return cbs.b;
      }

      @Override
      public bxu<Mu<Unit>, Value> a(btp<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bxu<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cbr<Value> a) implements bxv<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cbs b() {
         return cbs.a;
      }

      @Override
      public bxu<com.mojang.datafixers.kinds.IdF.Mu, Value> a(btp<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bxu<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cbr<Value> a) implements bxv<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cbs b() {
         return cbs.c;
      }

      @Override
      public bxu<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(btp<?> $$0, Optional<Value> $$1) {
         return new bxu<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
