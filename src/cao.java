import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cao<F extends K1, Value> {
   cek<Value> a();

   cel b();

   @Nullable
   can<F, Value> a(bwi<?> var1, Optional<Value> var2);

   public static record a<Value>(cek<Value> a) implements cao<Mu<Unit>, Value> {
      @Override
      public cel b() {
         return cel.b;
      }

      @Override
      public can<Mu<Unit>, Value> a(bwi<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new can<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cek<Value> a) implements cao<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cel b() {
         return cel.a;
      }

      @Override
      public can<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bwi<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new can<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cek<Value> a) implements cao<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cel b() {
         return cel.c;
      }

      @Override
      public can<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bwi<?> $$0, Optional<Value> $$1) {
         return new can<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
