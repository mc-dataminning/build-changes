import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface boe<F extends K1, Value> {
   bsa<Value> a();

   bsb b();

   @Nullable
   bod<F, Value> a(bjz<?> var1, Optional<Value> var2);

   public static record a<Value>(bsa<Value> a) implements boe<Mu<Unit>, Value> {
      @Override
      public bsb b() {
         return bsb.b;
      }

      @Override
      public bod<Mu<Unit>, Value> a(bjz<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bod<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bsa<Value> a) implements boe<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bsb b() {
         return bsb.a;
      }

      @Override
      public bod<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bjz<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bod<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bsa<Value> a) implements boe<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bsb b() {
         return bsb.c;
      }

      @Override
      public bod<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bjz<?> $$0, Optional<Value> $$1) {
         return new bod<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
