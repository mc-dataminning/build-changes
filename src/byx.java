import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface byx<F extends K1, Value> {
   cct<Value> a();

   ccu b();

   @Nullable
   byw<F, Value> a(bur<?> var1, Optional<Value> var2);

   public static record a<Value>(cct<Value> a) implements byx<Mu<Unit>, Value> {
      @Override
      public ccu b() {
         return ccu.b;
      }

      @Override
      public byw<Mu<Unit>, Value> a(bur<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new byw<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cct<Value> a) implements byx<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public ccu b() {
         return ccu.a;
      }

      @Override
      public byw<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bur<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new byw<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cct<Value> a) implements byx<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public ccu b() {
         return ccu.c;
      }

      @Override
      public byw<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bur<?> $$0, Optional<Value> $$1) {
         return new byw<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
