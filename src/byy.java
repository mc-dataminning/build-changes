import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface byy<F extends K1, Value> {
   ccu<Value> a();

   ccv b();

   @Nullable
   byx<F, Value> a(bus<?> var1, Optional<Value> var2);

   public static record a<Value>(ccu<Value> a) implements byy<Mu<Unit>, Value> {
      @Override
      public ccv b() {
         return ccv.b;
      }

      @Override
      public byx<Mu<Unit>, Value> a(bus<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new byx<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(ccu<Value> a) implements byy<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public ccv b() {
         return ccv.a;
      }

      @Override
      public byx<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bus<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new byx<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(ccu<Value> a) implements byy<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public ccv b() {
         return ccv.c;
      }

      @Override
      public byx<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bus<?> $$0, Optional<Value> $$1) {
         return new byx<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
