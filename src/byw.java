import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface byw<F extends K1, Value> {
   ccs<Value> a();

   cct b();

   @Nullable
   byv<F, Value> a(buq<?> var1, Optional<Value> var2);

   public static record a<Value>(ccs<Value> a) implements byw<Mu<Unit>, Value> {
      @Override
      public cct b() {
         return cct.b;
      }

      @Override
      public byv<Mu<Unit>, Value> a(buq<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new byv<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(ccs<Value> a) implements byw<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cct b() {
         return cct.a;
      }

      @Override
      public byv<com.mojang.datafixers.kinds.IdF.Mu, Value> a(buq<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new byv<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(ccs<Value> a) implements byw<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cct b() {
         return cct.c;
      }

      @Override
      public byv<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(buq<?> $$0, Optional<Value> $$1) {
         return new byv<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
