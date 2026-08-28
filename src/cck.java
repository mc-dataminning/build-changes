import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cck<F extends K1, Value> {
   cgg<Value> a();

   cgh b();

   @Nullable
   ccj<F, Value> a(bye<?> var1, Optional<Value> var2);

   public static record a<Value>(cgg<Value> a) implements cck<Mu<Unit>, Value> {
      @Override
      public cgh b() {
         return cgh.b;
      }

      @Override
      public ccj<Mu<Unit>, Value> a(bye<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new ccj<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cgg<Value> a) implements cck<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cgh b() {
         return cgh.a;
      }

      @Override
      public ccj<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bye<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new ccj<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cgg<Value> a) implements cck<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cgh b() {
         return cgh.c;
      }

      @Override
      public ccj<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bye<?> $$0, Optional<Value> $$1) {
         return new ccj<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
