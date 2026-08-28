import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cbj<F extends K1, Value> {
   cff<Value> a();

   cfg b();

   @Nullable
   cbi<F, Value> a(bxd<?> var1, Optional<Value> var2);

   public static record a<Value>(cff<Value> a) implements cbj<Mu<Unit>, Value> {
      @Override
      public cfg b() {
         return cfg.b;
      }

      @Override
      public cbi<Mu<Unit>, Value> a(bxd<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cbi<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cff<Value> a) implements cbj<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cfg b() {
         return cfg.a;
      }

      @Override
      public cbi<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bxd<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cbi<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cff<Value> a) implements cbj<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cfg b() {
         return cfg.c;
      }

      @Override
      public cbi<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bxd<?> $$0, Optional<Value> $$1) {
         return new cbi<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
