import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cbf<F extends K1, Value> {
   cfb<Value> a();

   cfc b();

   @Nullable
   cbe<F, Value> a(bwz<?> var1, Optional<Value> var2);

   public static record a<Value>(cfb<Value> a) implements cbf<Mu<Unit>, Value> {
      @Override
      public cfc b() {
         return cfc.b;
      }

      @Override
      public cbe<Mu<Unit>, Value> a(bwz<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cbe<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cfb<Value> a) implements cbf<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cfc b() {
         return cfc.a;
      }

      @Override
      public cbe<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bwz<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cbe<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cfb<Value> a) implements cbf<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cfc b() {
         return cfc.c;
      }

      @Override
      public cbe<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bwz<?> $$0, Optional<Value> $$1) {
         return new cbe<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
