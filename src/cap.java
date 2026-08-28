import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cap<F extends K1, Value> {
   cel<Value> a();

   cem b();

   @Nullable
   cao<F, Value> a(bwj<?> var1, Optional<Value> var2);

   public static record a<Value>(cel<Value> a) implements cap<Mu<Unit>, Value> {
      @Override
      public cem b() {
         return cem.b;
      }

      @Override
      public cao<Mu<Unit>, Value> a(bwj<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cao<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cel<Value> a) implements cap<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cem b() {
         return cem.a;
      }

      @Override
      public cao<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bwj<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cao<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cel<Value> a) implements cap<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cem b() {
         return cem.c;
      }

      @Override
      public cao<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bwj<?> $$0, Optional<Value> $$1) {
         return new cao<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
