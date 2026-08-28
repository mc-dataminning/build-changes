import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface byz<F extends K1, Value> {
   ccv<Value> a();

   ccw b();

   @Nullable
   byy<F, Value> a(but<?> var1, Optional<Value> var2);

   public static record a<Value>(ccv<Value> a) implements byz<Mu<Unit>, Value> {
      @Override
      public ccw b() {
         return ccw.b;
      }

      @Override
      public byy<Mu<Unit>, Value> a(but<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new byy<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(ccv<Value> a) implements byz<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public ccw b() {
         return ccw.a;
      }

      @Override
      public byy<com.mojang.datafixers.kinds.IdF.Mu, Value> a(but<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new byy<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(ccv<Value> a) implements byz<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public ccw b() {
         return ccw.c;
      }

      @Override
      public byy<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(but<?> $$0, Optional<Value> $$1) {
         return new byy<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
