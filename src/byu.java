import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface byu<F extends K1, Value> {
   ccq<Value> a();

   ccr b();

   @Nullable
   byt<F, Value> a(buo<?> var1, Optional<Value> var2);

   public static record a<Value>(ccq<Value> a) implements byu<Mu<Unit>, Value> {
      @Override
      public ccr b() {
         return ccr.b;
      }

      @Override
      public byt<Mu<Unit>, Value> a(buo<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new byt<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(ccq<Value> a) implements byu<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public ccr b() {
         return ccr.a;
      }

      @Override
      public byt<com.mojang.datafixers.kinds.IdF.Mu, Value> a(buo<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new byt<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(ccq<Value> a) implements byu<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public ccr b() {
         return ccr.c;
      }

      @Override
      public byt<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(buo<?> $$0, Optional<Value> $$1) {
         return new byt<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
