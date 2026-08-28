import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface byk<F extends K1, Value> {
   ccg<Value> a();

   cch b();

   @Nullable
   byj<F, Value> a(bue<?> var1, Optional<Value> var2);

   public static record a<Value>(ccg<Value> a) implements byk<Mu<Unit>, Value> {
      @Override
      public cch b() {
         return cch.b;
      }

      @Override
      public byj<Mu<Unit>, Value> a(bue<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new byj<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(ccg<Value> a) implements byk<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cch b() {
         return cch.a;
      }

      @Override
      public byj<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bue<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new byj<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(ccg<Value> a) implements byk<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cch b() {
         return cch.c;
      }

      @Override
      public byj<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bue<?> $$0, Optional<Value> $$1) {
         return new byj<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
